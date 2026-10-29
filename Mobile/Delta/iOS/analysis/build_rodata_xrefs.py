#!/usr/bin/env python3
"""Index ARM64 ADRP+ADD references to printable read-only data strings."""

from __future__ import annotations

import argparse
import bisect
import json
import re
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_REG


def integer(value: int | str) -> int:
    return int(value, 0) if isinstance(value, str) else value


def vm_to_file(record: dict, address: int) -> int | None:
    for segment in record["segments"]:
        start, size = integer(segment["vmaddr"]), integer(segment["filesize"])
        if start <= address < start + size:
            return integer(segment["fileoff"]) + address - start
    return None


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("inventory", type=Path)
    parser.add_argument("output", type=Path)
    args = parser.parse_args()
    binary = args.binary.read_bytes()
    record = json.loads(args.inventory.read_text())["records"][0]

    strings: dict[int, str] = {}
    spans: list[tuple[int, int, bytes]] = []
    printable = re.compile(rb"[\x20-\x7e]{4,}")
    for section in record["sections"]:
        if section["segment"] != "__TEXT" or section["section"] not in {"__cstring", "__const"}:
            continue
        offset, size = integer(section["offset"]), integer(section["size"])
        address = integer(section["address"])
        for match in printable.finditer(binary[offset:offset + size]):
            value = match.group().decode("ascii", errors="replace")
            start = address + match.start()
            raw = match.group()
            strings[start] = value[:2048]
            spans.append((start, start + len(raw), raw))
    spans.sort()
    span_starts = [item[0] for item in spans]

    def printable_at(address: int) -> str | None:
        index = bisect.bisect_right(span_starts, address) - 1
        if index < 0:
            return None
        start, end, raw = spans[index]
        if not (start <= address < end):
            return None
        return raw[address - start:address - start + 512].decode("ascii", errors="replace")

    starts = sorted(integer(v) for v in record["function_starts"])
    text = next(s for s in record["sections"] if s["section"] == "__text")
    text_end = integer(text["address"]) + integer(text["size"])
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True
    results = []
    for index, start in enumerate(starts):
        end = starts[index + 1] if index + 1 < len(starts) else text_end
        offset = vm_to_file(record, start)
        if offset is None:
            continue
        registers: dict[int, int] = {}
        refs: dict[int, str] = {}
        for insn in md.disasm(binary[offset:offset + end - start], start):
            ops = insn.operands
            produced = None
            if insn.mnemonic == "adrp" and len(ops) >= 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_IMM:
                produced = (ops[0].reg, ops[1].imm)
            elif insn.mnemonic == "add" and len(ops) >= 3 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_REG and ops[2].type == ARM64_OP_IMM:
                if ops[1].reg in registers:
                    value = registers[ops[1].reg] + ops[2].imm
                    produced = (ops[0].reg, value)
                    text_value = printable_at(value)
                    if text_value is not None:
                        refs[value] = text_value
            try:
                _, written = insn.regs_access()
            except Exception:
                written = []
            keep = produced[0] if produced else None
            for reg in written:
                if reg != keep:
                    registers.pop(reg, None)
            if produced:
                registers[produced[0]] = produced[1]
        if refs:
            results.append({
                "function": f"0x{start:x}",
                "end": f"0x{end:x}",
                "references": [{"address": f"0x{a:x}", "value": refs[a]} for a in sorted(refs)],
            })

    output = {"string_count": len(strings), "function_count": len(results), "functions": results}
    args.output.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")
    print(json.dumps({"string_count": len(strings), "function_count": len(results)}, indent=2))


if __name__ == "__main__":
    main()
