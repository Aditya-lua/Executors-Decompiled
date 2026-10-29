#!/usr/bin/env python3
"""Disassemble one Mach-O function and annotate imports and string references."""

from __future__ import annotations

import argparse
import bisect
import json
import re
from pathlib import Path

from capstone import CS_ARCH_ARM64, CS_MODE_ARM, Cs


def parse_int(value: str) -> int:
    return int(value, 0)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("inventory", type=Path)
    parser.add_argument("address", type=parse_int)
    parser.add_argument("--bytes", type=parse_int, default=0)
    args = parser.parse_args()

    data = args.binary.read_bytes()
    records = json.loads(args.inventory.read_text())["records"]
    record = next(item for item in records if Path(item["path"]).name == args.binary.name)
    starts = sorted(int(value, 16) for value in record["function_starts"])
    index = bisect.bisect_right(starts, args.address) - 1
    if index < 0:
        raise SystemExit("address is before the first recorded function")
    start = starts[index]
    end = start + args.bytes if args.bytes else (starts[index + 1] if index + 1 < len(starts) else len(data))
    end = min(end, len(data))

    stubs = {int(item["address"], 16): item["symbol"] for item in record.get("stubs", [])}
    strings: dict[int, str] = {}
    for section in record["sections"]:
        if section["section"] not in {"__cstring", "__objc_methname", "__objc_classname", "__objc_methtype"}:
            continue
        offset = int(section["offset"])
        address = int(section["address"], 16)
        size = int(section["size"])
        blob = data[offset:offset + size]
        cursor = 0
        for part in blob.split(b"\0"):
            if part:
                strings[address + cursor] = part.decode("utf-8", "replace")
            cursor += len(part) + 1

    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    register_values: dict[str, int] = {}
    print(f"function 0x{start:x}..0x{end:x} ({end - start} bytes)")
    for instruction in md.disasm(data[start:end], start):
        annotation = ""
        page = re.fullmatch(r"(x\d+), #0x([0-9a-f]+)", instruction.op_str)
        if instruction.mnemonic == "adrp" and page:
            register_values[page.group(1)] = int(page.group(2), 16)
        add = re.fullmatch(r"(x\d+), (x\d+), #0x([0-9a-f]+)", instruction.op_str)
        if instruction.mnemonic == "add" and add and add.group(2) in register_values:
            value = register_values[add.group(2)] + int(add.group(3), 16)
            register_values[add.group(1)] = value
            if value in strings:
                annotation = f" ; {strings[value]!r}"
        if instruction.mnemonic in {"b", "bl"} and instruction.op_str.startswith("#0x"):
            target = int(instruction.op_str[1:], 16)
            if target in stubs:
                annotation = f" ; {stubs[target]}"
        print(f"{instruction.address:08x}  {instruction.mnemonic:8} {instruction.op_str}{annotation}")


if __name__ == "__main__":
    main()
