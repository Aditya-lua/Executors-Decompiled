#!/usr/bin/env python3
"""so-coverage-map.py — classify an arm64 shared object's .text by block.

For each fixed-size block of .text, compute Shannon entropy and the fraction of
4-byte words that Capstone decodes as instructions starting at word-aligned
offsets. Reports a coverage map: plaintext-code blocks (low entropy, high
decode), opaque blocks (high entropy), and mixed. Also decodes a sample at each
exported FUNC address when --symbols is given.

Usage: so-coverage-map.py FILE.so [block_bytes]
"""
import math
import sys

from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN


def entropy(b):
    if not b:
        return 0.0
    counts = [0] * 256
    for x in b:
        counts[x] += 1
    n = len(b)
    return -sum((c / n) * math.log2(c / n) for c in counts if c)


def main():
    path = sys.argv[1]
    block = int(sys.argv[2]) if len(sys.argv) > 2 else 4096
    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
    with open(path, "rb") as fh:
        elf = ELFFile(fh)
        text = elf.get_section_by_name(".text")
        base, size = text["sh_addr"], text["sh_size"]
        tdata = text.data()
        print(f".text @0x{base:x} size 0x{size:x} ({size:,} B), block {block} B")

        dyn = elf.get_section_by_name(".dynsym")
        funcs = [(s.name, s["st_value"], s["st_size"])
                 for s in dyn.iter_symbols()
                 if s["st_info"]["type"] == "STT_FUNC" and s["st_shndx"] != "SHN_UNDEF"]
        print(f"exported FUNCs: {len(funcs)}")

        def decode_ratio(blob, vaddr):
            words = len(blob) // 4
            if words == 0:
                return 0.0
            good = 0
            for i in range(0, len(blob) - 4, 4):
                try:
                    next(md.disasm(blob[i:i + 4], vaddr + i))
                    good += 1
                except StopIteration:
                    pass
            return good / words

        # block map
        opaque = code = mixed = 0
        rows = []
        for off in range(0, size, block):
            blob = tdata[off:off + block]
            e = entropy(blob)
            r = decode_ratio(blob, base + off)
            kind = ("CODE" if e < 6.9 and r > 0.8 else
                    "OPAQUE" if e >= 7.4 else "MIXED")
            rows.append((base + off, e, r, kind))
            if kind == "CODE":
                code += 1
            elif kind == "OPAQUE":
                opaque += 1
            else:
                mixed += 1
        total = len(rows)
        print(f"blocks: {total}  CODE {code} ({100*code/total:.1f}%)  "
              f"OPAQUE {opaque} ({100*opaque/total:.1f}%)  MIXED {mixed}")
        # summarize contiguous CODE regions
        regions = []
        cur = None
        for a, e, r, k in rows:
            if k == "CODE" and cur and a == cur[1] + block:
                cur = (cur[0], a, cur[2] + 1)
            elif k == "CODE":
                if cur:
                    regions.append(cur)
                cur = (a, a, 1)
        if cur:
            regions.append(cur)
        print(f"contiguous CODE regions: {len(regions)}")
        for a, b, n in sorted(regions, key=lambda x: -x[2])[:12]:
            print(f"  0x{a:x}-0x{b + block:x}  {n} blocks ({n*block:,} B)")

        print("\nexport-site decode check (first 5 + JNI_OnLoad):")
        named = [(n, v, s) for n, v, s in funcs][:5]
        if any(n == "JNI_OnLoad" for n, v, s in funcs):
            named.append(("JNI_OnLoad", *next(
                (v, s) for n, v, s in funcs if n == "JNI_OnLoad")))
        for name, v, s in named:
            seg = next(g for g in elf.iter_segments()
                       if g["p_vaddr"] <= v < g["p_vaddr"] + g["p_filesz"])
            o = v - seg["p_vaddr"]
            blob = seg.data()[o:o + min(s or 256, 512)]
            r = decode_ratio(blob, v)
            e = entropy(blob)
            first = next(md.disasm(blob[:4], v), None)
            print(f"  {name[:44]:<46} @0x{v:<10x} decode {r:5.1%}  ent {e:.2f}  "
                  f"first: {first.mnemonic + ' ' + first.op_str if first else 'INVALID'}")


if __name__ == "__main__":
    main()
