#!/usr/bin/env python3
"""jni-table-scan.py — locate JNINativeMethod[] candidates in an Android shared object.

A JNINativeMethod is {const char* name; const char* signature; void* fnPtr;}
(24 bytes on arm64). When a table is statically initialised, the ELF carries
R_AARCH64_RELATIVE relocations whose addends point at: a .rodata string
(the name), another .rodata string (a JNI descriptor), and a .text address
(the implementation). This script scans RELATIVE relocations for consecutive
triples with that shape and prints candidates with resolved strings.

Usage: jni-table-scan.py FILE.so [--verbose]
Output: human-readable candidate list; exit 0 always (a scan, not a proof).
"""
import sys
from collections import namedtuple

from elftools.elf.elffile import ELFFile

Rel = namedtuple("Rel", "offset addend")


def main():
    path = sys.argv[1]
    verbose = "--verbose" in sys.argv
    with open(path, "rb") as fh:
        elf = ELFFile(fh)
        # section table for classification
        secs = []
        for s in elf.iter_sections():
            if s["sh_addr"]:
                secs.append((s["sh_addr"], s["sh_addr"] + s["sh_size"], s.name))
        rodata = [(a, b) for a, b, n in secs if n in (".rodata", ".dynstr")]
        text = [(a, b) for a, b, n in secs if n in (".text", ".dyncall", ".plt")]

        def where(addr):
            for a, b, n in secs:
                if a <= addr < b:
                    return n
            return "?"

        def read_cstr(addr, maxlen=200):
            for seg in elf.iter_segments():
                if seg["p_vaddr"] <= addr < seg["p_vaddr"] + seg["p_filesz"]:
                    off = addr - seg["p_vaddr"]
                    data = seg.data()[off:off + maxlen]
                    nul = data.find(b"\0")
                    if nul < 0:
                        return None
                    try:
                        return data[:nul].decode("utf-8")
                    except UnicodeDecodeError:
                        return None
            return None

        rels = []
        for s in elf.iter_sections():
            if s.header["sh_type"] == "SHT_RELA":
                for r in s.iter_relocations():
                    if r["r_info_type"] == 1027:  # R_AARCH64_RELATIVE
                        rels.append(Rel(r["r_offset"], r["r_addend"]))
        rels.sort()
        print(f"{len(rels)} R_AARCH64_RELATIVE relocations")

        # index relocations by target offset for consecutive lookup
        by_off = {r.offset: r.addend for r in rels}

        candidates = 0
        for i in range(len(rels) - 2):
            a, b, c = rels[i], rels[i + 1], rels[i + 2]
            # consecutive slots in a struct array: offsets 8 apart, addends in rodata/rodata/text
            if a.addend == 0 or b.addend == 0 or c.addend == 0:
                continue
            wa, wb, wc = where(a.addend), where(b.addend), where(c.addend)
            if wa in (".rodata", ".dynstr") and wb in (".rodata", ".dynstr") \
                    and wc in (".text", ".dyncall"):
                # spacing must match a 24-byte stride array only if part of one;
                # single structs may be anywhere, so accept and report spacing
                name = read_cstr(a.addend)
                sig = read_cstr(b.addend)
                if not name or not sig:
                    continue
                # JNI descriptor sanity: starts with '(' and contains ')'
                if not (sig.startswith("(") and ")" in sig):
                    if verbose:
                        print(f"  near-miss @0x{a.offset:x}: {name!r} {sig!r}")
                    continue
                stride_note = ""
                if a.offset + 24 == rels[i + 3].offset if i + 3 < len(rels) else False:
                    stride_note = " (+24 stride continues)"
                print(f"  candidate @0x{a.offset:x}: name={name!r} sig={sig!r} "
                      f"fn=0x{c.addend:x} ({wc}){stride_note}")
                candidates += 1
        print(f"{candidates} candidate triple(s)")
        if candidates == 0:
            print("no statically-initialised JNINativeMethod table found; "
                  "registration data is built or decrypted at runtime")


if __name__ == "__main__":
    main()
