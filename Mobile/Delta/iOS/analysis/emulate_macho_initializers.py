#!/usr/bin/env python3
"""Run selected ARM64 Mach-O initializers and dump their mutated data pages."""

from __future__ import annotations

import argparse
import json
import struct
from pathlib import Path

from unicorn import Uc, UC_ARCH_ARM64, UC_HOOK_CODE, UC_MODE_ARM
from unicorn.arm64_const import UC_ARM64_REG_LR, UC_ARM64_REG_SP


PAGE = 0x1000
STACK = 0x2000000
STACK_SIZE = 0x100000
SENTINEL = 0x2200000


def align_down(value: int) -> int:
    return value & ~(PAGE - 1)


def align_up(value: int) -> int:
    return (value + PAGE - 1) & ~(PAGE - 1)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("inventory", type=Path)
    parser.add_argument("addresses", nargs="+", type=lambda value: int(value, 0))
    parser.add_argument("--dump-address", type=lambda value: int(value, 0), required=True)
    parser.add_argument("--dump-size", type=lambda value: int(value, 0), required=True)
    parser.add_argument("--output", type=Path, required=True)
    args = parser.parse_args()

    binary = args.binary.read_bytes()
    records = json.loads(args.inventory.read_text())["records"]
    record = next(item for item in records if Path(item["path"]).name == args.binary.name)
    uc = Uc(UC_ARCH_ARM64, UC_MODE_ARM)

    mapped: list[tuple[int, int]] = []
    for segment in record["segments"]:
        vmaddr = int(segment["vmaddr"], 16)
        vmsize = int(segment["vmsize"])
        fileoff = int(segment["fileoff"])
        filesize = int(segment["filesize"])
        if not vmsize:
            continue
        start = align_down(vmaddr)
        end = align_up(vmaddr + vmsize)
        if any(start < existing_end and end > existing_start for existing_start, existing_end in mapped):
            continue
        uc.mem_map(start, end - start)
        mapped.append((start, end))
        if filesize:
            uc.mem_write(vmaddr, binary[fileoff:fileoff + filesize])

    uc.mem_map(STACK, STACK_SIZE)
    uc.mem_map(SENTINEL, PAGE)
    uc.mem_write(SENTINEL, b"\xc0\x03\x5f\xd6")
    uc.reg_write(UC_ARM64_REG_SP, STACK + STACK_SIZE - PAGE)

    stopped = False

    def stop_at_sentinel(local_uc: Uc, address: int, size: int, user_data: object) -> None:
        nonlocal stopped
        if address == SENTINEL:
            stopped = True
            local_uc.emu_stop()

    uc.hook_add(UC_HOOK_CODE, stop_at_sentinel)
    completed = []
    for address in args.addresses:
        stopped = False
        uc.reg_write(UC_ARM64_REG_LR, SENTINEL)
        uc.emu_start(address, 0, count=1_000_000)
        if not stopped:
            raise SystemExit(f"initializer 0x{address:x} did not return to the sentinel")
        completed.append(f"0x{address:x}")

    dump = bytes(uc.mem_read(args.dump_address, args.dump_size))
    args.output.write_bytes(dump)
    print(json.dumps({
        "initializers": completed,
        "dump_address": f"0x{args.dump_address:x}",
        "dump_size": len(dump),
        "output": str(args.output),
    }, indent=2))


if __name__ == "__main__":
    main()
