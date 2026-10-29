#!/usr/bin/env python3
"""Resolve statically derivable ARM64 indirect calls in a Mach-O.

The protector commonly loads two encoded qwords, subtracts them, and executes
BLR on the result.  This pass performs small per-function constant propagation
for ADRP/ADD/LDR/SUB/EOR and records indirect targets that land in __text.
"""

from __future__ import annotations

import argparse
import json
import struct
from pathlib import Path

from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_OP_IMM, ARM64_OP_MEM, ARM64_OP_REG


def integer(value: int | str) -> int:
    return int(value, 0) if isinstance(value, str) else value


def vm_to_file(record: dict, address: int) -> int | None:
    for segment in record["segments"]:
        start = integer(segment["vmaddr"])
        size = integer(segment["filesize"])
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
    starts = sorted(integer(v) for v in record["function_starts"])
    text = next(s for s in record["sections"] if s["section"] == "__text")
    text_start = integer(text["address"])
    text_end = text_start + integer(text["size"])
    start_set = set(starts)
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM)
    md.detail = True
    results = []

    for index, start in enumerate(starts):
        end = starts[index + 1] if index + 1 < len(starts) else text_end
        file_start = vm_to_file(record, start)
        if file_start is None:
            continue
        values: dict[int, tuple[int, list[int], str]] = {}
        for insn in md.disasm(binary[file_start:file_start + end - start], start):
            ops = insn.operands
            produced = None
            if insn.mnemonic == "adrp" and len(ops) >= 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_IMM:
                produced = (ops[0].reg, (ops[1].imm, [], "adrp"))
            elif insn.mnemonic == "mov" and len(ops) >= 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_IMM:
                produced = (ops[0].reg, (ops[1].imm & 0xffffffffffffffff, [], "mov"))
            elif insn.mnemonic in {"add", "sub", "eor", "orr"} and len(ops) >= 3 and ops[0].type == ARM64_OP_REG:
                left = values.get(ops[1].reg) if ops[1].type == ARM64_OP_REG else ((ops[1].imm, [], "imm") if ops[1].type == ARM64_OP_IMM else None)
                right = values.get(ops[2].reg) if ops[2].type == ARM64_OP_REG else ((ops[2].imm, [], "imm") if ops[2].type == ARM64_OP_IMM else None)
                if left and right:
                    if insn.mnemonic == "add": value = left[0] + right[0]
                    elif insn.mnemonic == "sub": value = left[0] - right[0]
                    elif insn.mnemonic == "eor": value = left[0] ^ right[0]
                    else: value = left[0] | right[0]
                    produced = (ops[0].reg, (value & 0xffffffffffffffff, left[1] + right[1], insn.mnemonic))
            elif insn.mnemonic.startswith("ldr") and len(ops) >= 2 and ops[0].type == ARM64_OP_REG and ops[1].type == ARM64_OP_MEM:
                base = values.get(ops[1].mem.base)
                if base:
                    address = (base[0] + ops[1].mem.disp) & 0xffffffffffffffff
                    offset = vm_to_file(record, address)
                    if offset is not None and offset + 8 <= len(binary):
                        value = struct.unpack_from("<Q", binary, offset)[0]
                        produced = (ops[0].reg, (value, [address], "ldr"))

            if insn.mnemonic == "blr" and ops and ops[0].type == ARM64_OP_REG:
                target = values.get(ops[0].reg)
                if target and text_start <= target[0] < text_end:
                    results.append({
                        "function": f"0x{start:x}",
                        "callsite": f"0x{insn.address:x}",
                        "target": f"0x{target[0]:x}",
                        "target_is_function_start": target[0] in start_set,
                        "source_qwords": [f"0x{v:x}" for v in target[1]],
                        "last_operation": target[2],
                    })

            try:
                _, written = insn.regs_access()
            except Exception:
                written = []
            keep = produced[0] if produced else None
            for reg in written:
                if reg != keep:
                    values.pop(reg, None)
            if produced:
                values[produced[0]] = produced[1]

    output = {
        "binary": str(args.binary),
        "resolved_call_count": len(results),
        "unique_target_count": len({v["target"] for v in results}),
        "calls": results,
    }
    args.output.write_text(json.dumps(output, indent=2) + "\n")
    print(json.dumps({k: output[k] for k in ("resolved_call_count", "unique_target_count")}, indent=2))


if __name__ == "__main__":
    main()
