#!/usr/bin/env python3
"""Build a lightweight ARM64 Mach-O function/call/string cross-reference index.

This is intentionally a static, deterministic analyzer.  It does not load or
execute the target binary.  It recognizes the common ADRP + ADD/LDR addressing
sequences emitted by Clang and records direct calls, imported stubs, and C
string references for each LC_FUNCTION_STARTS function.
"""

from __future__ import annotations

import argparse
import json
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_INS_ADD, ARM64_INS_ADRP, ARM64_INS_BL
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_MEM, ARM64_OP_REG


def load_record(path: Path) -> dict:
    data = json.loads(path.read_text())
    records = data.get("records", [])
    if len(records) != 1:
        raise ValueError(f"expected one inventory record, got {len(records)}")
    return records[0]


def as_int(value: int | str) -> int:
    return int(value, 0) if isinstance(value, str) else value


def vm_to_file(record: dict, address: int) -> int | None:
    for segment in record["segments"]:
        start = as_int(segment["vmaddr"])
        size = as_int(segment["filesize"])
        if start <= address < start + size:
            return as_int(segment["fileoff"]) + address - start
    return None


def cstring_at(binary: bytes, record: dict, address: int) -> str | None:
    for section in record["sections"]:
        flags = as_int(section.get("flags", 0))
        if section.get("section") != "__cstring" and flags & 0xFF != 0x02:
            continue
        start = as_int(section["address"])
        size = as_int(section["size"])
        if not (start <= address < start + size):
            continue
        offset = as_int(section["offset"]) + address - start
        end = binary.find(b"\0", offset, as_int(section["offset"]) + size)
        if end < 0:
            return None
        raw = binary[offset:end]
        if not raw:
            return None
        return raw.decode("utf-8", errors="replace")
    return None


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("binary", type=Path)
    parser.add_argument("inventory", type=Path)
    parser.add_argument("output", type=Path)
    args = parser.parse_args()

    binary = args.binary.read_bytes()
    record = load_record(args.inventory)
    starts = sorted(as_int(x) for x in record["function_starts"])
    text = next(s for s in record["sections"] if s["section"] == "__text")
    text_end = as_int(text["address"]) + as_int(text["size"])
    stub_names = {as_int(s["address"]): s["symbol"] for s in record["stubs"]}
    start_set = set(starts)

    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True
    functions = []

    for index, start in enumerate(starts):
        end = starts[index + 1] if index + 1 < len(starts) else text_end
        file_start = vm_to_file(record, start)
        file_end = vm_to_file(record, end - 1)
        if file_start is None or file_end is None or end <= start:
            continue
        file_end += 1
        registers: dict[int, int] = {}
        strings: dict[int, str] = {}
        calls: set[int] = set()
        imports: set[str] = set()

        for insn in md.disasm(binary[file_start:file_end], start):
            ops = insn.operands
            if insn.id == ARM64_INS_ADRP and len(ops) >= 2:
                if ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_IMM:
                    registers[ops[0].reg] = ops[1].imm
                continue

            if insn.id == ARM64_INS_ADD and len(ops) >= 3:
                if all((ops[0].type == ARM64_OP_REG,
                        ops[1].type == ARM64_OP_REG,
                        ops[2].type == ARM64_OP_IMM)):
                    base = registers.get(ops[1].reg)
                    if base is not None:
                        address = base + ops[2].imm
                        registers[ops[0].reg] = address
                        value = cstring_at(binary, record, address)
                        if value is not None:
                            strings[address] = value

            # Capture ADRP + load/store effective addresses as data refs.  The
            # destination register is deliberately not propagated because the
            # loaded value is not the address itself.
            for op in ops:
                if op.type != ARM64_OP_MEM:
                    continue
                base = registers.get(op.mem.base)
                if base is None:
                    continue
                address = base + op.mem.disp
                value = cstring_at(binary, record, address)
                if value is not None:
                    strings[address] = value

            if insn.id == ARM64_INS_BL and ops and ops[0].type == ARM64_OP_IMM:
                target = ops[0].imm
                if target in stub_names:
                    imports.add(stub_names[target])
                else:
                    calls.add(target)

            # Registers written by unrelated instructions no longer retain a
            # valid static address.  Capstone exposes the write set reliably.
            try:
                _, written = insn.regs_access()
            except Exception:
                written = []
            preserved = set()
            if insn.id == ARM64_INS_ADRP and ops and ops[0].type == ARM64_OP_REG:
                preserved.add(ops[0].reg)
            elif insn.id == ARM64_INS_ADD and ops and ops[0].type == ARM64_OP_REG:
                preserved.add(ops[0].reg)
            for reg in written:
                if reg not in preserved:
                    registers.pop(reg, None)

        functions.append({
            "start": start,
            "end": end,
            "size": end - start,
            "strings": [{"address": a, "value": strings[a]} for a in sorted(strings)],
            "imports": sorted(imports),
            "calls": sorted(t for t in calls if t in start_set),
            "raw_direct_calls": len(calls),
        })

    output = {
        "binary": str(args.binary),
        "sha256": record["sha256"],
        "architecture": "arm64",
        "function_count": len(functions),
        "functions": functions,
    }
    args.output.write_text(json.dumps(output, indent=2, ensure_ascii=False) + "\n")


if __name__ == "__main__":
    main()
