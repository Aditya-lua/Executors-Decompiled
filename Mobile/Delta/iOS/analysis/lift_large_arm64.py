#!/usr/bin/env python3
"""Instruction-faithful C-like fallback for functions the structurer cannot lift."""

from __future__ import annotations
import argparse, json
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_ARM
from capstone.arm64 import ARM64_OP_IMM


def branch_target(insn):
    if insn.mnemonic == ".byte": return None
    try: ops = insn.operands
    except Exception: return None
    return int(ops[-1].imm) if ops and ops[-1].type == ARM64_OP_IMM else None


def normalized(insn, labels):
    m, target = insn.mnemonic, branch_target(insn)
    dest = (f"loc_{target:08x}" if target in labels else f"sub_{target:08x}") if target is not None else None
    if m == "ret": return "return;"
    if m == "bl" and dest: return f"CALL_DIRECT({dest});"
    if m == "blr": return f"CALL_INDIRECT({insn.op_str});"
    if m == "b" and dest: return f"goto {dest};"
    if m.startswith("b.") and dest: return f"if (COND_{m[2:].upper()}) goto {dest};"
    if m in {"cbz", "cbnz"} and dest:
        reg = insn.op_str.split(",", 1)[0]; op = "==" if m == "cbz" else "!="
        return f"if ({reg} {op} 0) goto {dest};"
    if m in {"tbz", "tbnz"} and dest:
        parts = [x.strip() for x in insn.op_str.split(",")]; op = "==" if m == "tbz" else "!="
        if len(parts) >= 2: return f"if ((({parts[0]} >> {parts[1]}) & 1) {op} 0) goto {dest};"
    return "ARM64(" + json.dumps(m + (" " + insn.op_str if insn.op_str else "")) + ");"


def main() -> int:
    p = argparse.ArgumentParser(); p.add_argument("--binary", required=True)
    p.add_argument("--inventory", required=True); p.add_argument("--output", required=True)
    p.add_argument("--manifest", required=True); p.add_argument("--min-size", type=lambda x:int(x,0), default=0x4001)
    p.add_argument("--selection-manifest")
    a = p.parse_args(); rec = json.loads(Path(a.inventory).read_text())["records"][0]
    starts = [int(x,16) for x in rec["function_starts"]]
    text = next(s for s in rec["sections"] if s["section"] == "__text")
    end_text = int(text["address"],16) + int(text["size"]); image = Path(a.binary).read_bytes()
    out = Path(a.output); out.mkdir(parents=True, exist_ok=True)
    md = Cs(CS_ARCH_ARM64, CS_MODE_ARM); md.detail = True; md.skipdata = True
    selected = None
    if a.selection_manifest:
        sel = json.loads(Path(a.selection_manifest).read_text())
        selected = {int(x["start"],16) for x in sel["functions"] if x["status"] != "ok"}
    records=[]
    for start,end in zip(starts,starts[1:]+[end_text]):
        size=end-start
        if (selected is not None and start not in selected) or (selected is None and size<a.min_size): continue
        insns=list(md.disasm(image[start:end],start)); labels={t for i in insns if (t:=branch_target(i)) is not None and start<=t<end}
        dst=out/f"sub_{start:08x}.c"
        with dst.open("w") as f:
            f.write("/* Instruction-faithful low-level lift; not original vendor source.\n"
                    f" * Mach-O extent: 0x{start:x}..0x{end:x} ({size} bytes). */\n"
                    "#include \"../lift_runtime.hpp\"\n\n" f"void sub_{start:08x}(Arm64Context& cpu) {{\n")
            for i in insns:
                if i.address in labels: f.write(f"loc_{i.address:08x}:\n")
                f.write(f"    /* 0x{i.address:08x}: {i.mnemonic:<8} {i.op_str} */ {normalized(i,labels)}\n")
            f.write("}\n")
        records.append({"start":f"0x{start:x}","end":f"0x{end:x}","size":size,
                        "instructions":len(insns),"decoded_bytes":sum(i.size for i in insns),
                        "path":str(dst.relative_to(out.parent))})
        print(f"lifted 0x{start:x}: {len(insns)} instructions",flush=True)
    Path(a.manifest).write_text(json.dumps({"format":"Delta ARM64 instruction-faithful lift manifest v1",
        "minimum_extent_size":a.min_size,"function_count":len(records),"functions":records},indent=2)+"\n")
    return 0


if __name__ == "__main__": raise SystemExit(main())
