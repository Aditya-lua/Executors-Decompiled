#!/usr/bin/env python3
"""Emulate call-free ARM64 Mach-O initializers and dump mutable state.

Only constructors whose complete LC_FUNCTION_STARTS body contains no calls,
indirect branches, traps, or out-of-body direct branches are considered.  This
keeps the pass deterministic and avoids invoking any imported/runtime code.
"""

from __future__ import annotations

import argparse
import hashlib
import json
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_OP_IMM
from unicorn import Uc, UcError, UC_ARCH_ARM64, UC_HOOK_CODE, UC_MODE_ARM
from unicorn.arm64_const import UC_ARM64_REG_LR, UC_ARM64_REG_SP


PAGE = 0x1000
STACK = 0x2000000
STACK_SIZE = 0x100000
SENTINEL = 0x2200000


def down(value: int) -> int:
    return value & ~(PAGE - 1)


def up(value: int) -> int:
    return (value + PAGE - 1) & ~(PAGE - 1)


def integer(value: int | str) -> int:
    return int(value, 0) if isinstance(value, str) else value


def vm_to_file(record: dict, address: int) -> int | None:
    for segment in record["segments"]:
        vmaddr = integer(segment["vmaddr"])
        filesize = integer(segment["filesize"])
        if vmaddr <= address < vmaddr + filesize:
            return integer(segment["fileoff"]) + address - vmaddr
    return None


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("inventory", type=Path)
    parser.add_argument("output_prefix", type=Path)
    parser.add_argument("--max-size", type=lambda v: int(v, 0), default=0x1000)
    args = parser.parse_args()

    binary = args.binary.read_bytes()
    records = json.loads(args.inventory.read_text())["records"]
    record = next(item for item in records if Path(item["path"]).name == args.binary.name)
    starts = sorted(integer(v) for v in record["function_starts"])
    text_section = next(s for s in record["sections"] if s["section"] == "__text")
    text_end = integer(text_section["address"]) + integer(text_section["size"])
    ends = {start: starts[i + 1] if i + 1 < len(starts) else text_end
            for i, start in enumerate(starts)}

    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True
    forbidden = {"bl", "blr", "br", "braa", "brab", "svc", "hvc", "smc", "hlt", "udf"}
    accepted: list[int] = []
    internal_wrappers: list[int] = []
    rejected: dict[str, int] = {}
    rejected_addresses: list[dict[str, str]] = []

    def reject(start: int, reason: str) -> None:
        rejected[reason] = rejected.get(reason, 0) + 1
        rejected_addresses.append({"initializer": f"0x{start:x}", "reason": reason})

    for start in map(integer, record["initializers"]):
        end = ends.get(start)
        if end is None:
            reject(start, "not_function_start")
            continue
        if end - start > args.max_size:
            reject(start, "too_large")
            continue
        offset = vm_to_file(record, start)
        if offset is None:
            reject(start, "not_file_backed")
            continue
        instructions = list(md.disasm(binary[offset:offset + end - start], start))
        if not instructions or instructions[-1].mnemonic != "ret":
            reject(start, "no_terminal_ret")
            continue
        reason = None
        forbidden_seen = []
        for insn in instructions:
            if insn.mnemonic in forbidden:
                forbidden_seen.append(insn.mnemonic)
                reason = "call_or_indirect_branch"
                continue
            if insn.mnemonic == "b" and insn.operands and insn.operands[0].type == ARM64_OP_IMM:
                target = insn.operands[0].imm
                if not (start <= target < end):
                    reason = "external_tail_branch"
                    break
        # A common protection wrapper performs exactly one internal BLR after
        # deriving its target as encoded_value_b - encoded_value_a.  It has no
        # direct call/import and returns normally.  These wrappers are safe to
        # try under Unicorn; state is rolled back if execution leaves the image.
        if reason == "call_or_indirect_branch" and forbidden_seen == ["blr"] and end - start <= 0x400:
            internal_wrappers.append(start)
            continue
        if reason:
            reject(start, reason)
            continue
        accepted.append(start)

    uc = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
    mapped: list[tuple[int, int]] = []
    mutable: list[dict] = []
    for segment in record["segments"]:
        vmaddr = integer(segment["vmaddr"])
        vmsize = integer(segment["vmsize"])
        fileoff = integer(segment["fileoff"])
        filesize = integer(segment["filesize"])
        if not vmsize:
            continue
        start, end = down(vmaddr), up(vmaddr + vmsize)
        if not any(start < old_end and end > old_start for old_start, old_end in mapped):
            uc.mem_map(start, end - start)
            mapped.append((start, end))
        if filesize:
            uc.mem_write(vmaddr, binary[fileoff:fileoff + filesize])
        if integer(segment["initprot"]) & 2:
            mutable.append(segment)

    uc.mem_map(STACK, STACK_SIZE)
    uc.mem_map(SENTINEL, PAGE)
    uc.mem_write(SENTINEL, b"\xc0\x03\x5f\xd6")
    uc.reg_write(UC_ARM64_REG_SP, STACK + STACK_SIZE - PAGE)
    returned = False

    def sentinel(emu: Uc, address: int, size: int, _: object) -> None:
        nonlocal returned
        if address == SENTINEL:
            returned = True
            emu.emu_stop()

    uc.hook_add(UC_HOOK_CODE, sentinel)
    completed: list[int] = []
    completed_internal_wrappers: list[int] = []
    errors: list[dict] = []
    for start in accepted:
        returned = False
        uc.reg_write(UC_ARM64_REG_LR, SENTINEL)
        try:
            uc.emu_start(start, 0, count=1_000_000)
        except UcError as exc:
            errors.append({"initializer": f"0x{start:x}", "error": str(exc)})
            continue
        if returned:
            completed.append(start)
        else:
            errors.append({"initializer": f"0x{start:x}", "error": "did not return"})

    # Internal wrappers are independent address-bound decoders.  Run them only
    # after the call-free constructors.  Snapshot every mutable segment so a
    # failed or unexpectedly external wrapper cannot contaminate the result.
    for start in internal_wrappers:
        snapshots = []
        for segment in mutable:
            vmaddr = integer(segment["vmaddr"])
            vmsize = integer(segment["vmsize"])
            snapshots.append((vmaddr, bytes(uc.mem_read(vmaddr, vmsize))))
        returned = False
        uc.reg_write(UC_ARM64_REG_LR, SENTINEL)
        try:
            uc.emu_start(start, 0, count=1_000_000)
        except UcError as exc:
            for vmaddr, data in snapshots:
                uc.mem_write(vmaddr, data)
            errors.append({"initializer": f"0x{start:x}", "error": str(exc), "rolled_back": True})
            continue
        if returned:
            completed_internal_wrappers.append(start)
        else:
            for vmaddr, data in snapshots:
                uc.mem_write(vmaddr, data)
            errors.append({"initializer": f"0x{start:x}", "error": "did not return", "rolled_back": True})

    dumps = []
    for segment in mutable:
        vmaddr = integer(segment["vmaddr"])
        vmsize = integer(segment["vmsize"])
        name = segment["name"].strip("_").lower() or "segment"
        path = args.output_prefix.with_name(args.output_prefix.name + f"-{name}-{vmaddr:x}.bin")
        data = bytes(uc.mem_read(vmaddr, vmsize))
        path.write_bytes(data)
        dumps.append({
            "segment": segment["name"],
            "vmaddr": f"0x{vmaddr:x}",
            "size": len(data),
            "sha256": hashlib.sha256(data).hexdigest(),
            "path": str(path),
        })

    report = {
        "binary": str(args.binary),
        "total_initializers": len(record["initializers"]),
        "accepted_call_free": len(accepted),
        "completed": len(completed),
        "completed_addresses": [f"0x{v:x}" for v in completed],
        "accepted_internal_wrappers": len(internal_wrappers),
        "completed_internal_wrappers": len(completed_internal_wrappers),
        "completed_internal_wrapper_addresses": [f"0x{v:x}" for v in completed_internal_wrappers],
        "rejected": rejected,
        "rejected_addresses": rejected_addresses,
        "errors": errors,
        "dumps": dumps,
    }
    report_path = args.output_prefix.with_suffix(".json")
    report_path.write_text(json.dumps(report, indent=2) + "\n")
    print(json.dumps({k: report[k] for k in (
        "total_initializers", "accepted_call_free", "completed", "accepted_internal_wrappers",
        "completed_internal_wrappers", "rejected", "errors", "dumps"
    )}, indent=2))


if __name__ == "__main__":
    main()
