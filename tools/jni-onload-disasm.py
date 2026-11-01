#!/usr/bin/env python3
"""jni-onload-disasm.py — carve and characterise JNI_OnLoad of an arm64 .so.

Disassembles the JNI_OnLoad function (address/size from .dynsym) with Capstone
and reports: JNI vtable slot calls (bl x.. with ldr offsets matching JNIEnv
indices), string references (adrp/add pairs), XOR/decryption-loop density, and
call targets inside the function. Purpose: establish how RegisterNatives data
is produced when no static JNINativeMethod table exists.

Usage: jni-onload-disasm.py FILE.so
"""
import sys
from collections import Counter

from elftools.elf.elffile import ELFFile
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN


def main():
    path = sys.argv[1]
    with open(path, "rb") as fh:
        elf = ELFFile(fh)
        dyn = elf.get_section_by_name(".dynsym")
        target = next(s for s in dyn.iter_symbols() if s.name == "JNI_OnLoad")
        addr = target["st_value"]
        size = target["st_size"]
        print(f"JNI_OnLoad @ 0x{addr:x} size {size} (0x{size:x})")

        seg = next(s for s in elf.iter_segments()
                   if s["p_vaddr"] <= addr < s["p_vaddr"] + s["p_filesz"])
        off = addr - seg["p_vaddr"]
        code = seg.data()[off:off + size]

        secs = []
        for s in elf.iter_sections():
            if s["sh_addr"]:
                secs.append((s["sh_addr"], s["sh_addr"] + s["sh_size"], s.name))

        def where(a):
            for x, y, n in secs:
                if x <= a < y:
                    return n
            return "?"

        def read_cstr(a, maxlen=120):
            for s in elf.iter_segments():
                if s["p_vaddr"] <= a < s["p_vaddr"] + s["p_filesz"]:
                    o = a - s["p_vaddr"]
                    d = s.data()[o:o + maxlen]
                    z = d.find(b"\0")
                    if z < 0:
                        return None
                    try:
                        return d[:z].decode("utf-8")
                    except UnicodeDecodeError:
                        return None
            return None

        md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
        md.detail = True

        insns = list(md.disasm(code, addr))
        print(f"disassembled {len(insns)} instructions "
              f"({len(insns)*4} bytes of {size})")

        # JNIEnv offsets (arm64, 8 bytes/slot):
        # GetEnv is slot 6 (JavaVM), reserved0-2 = 0..2, DestroyJavaVM=3,
        # AttachCurrentThread=4, DetachCurrentThread=5, GetEnv=6,
        # AttachCurrentThreadAsDaemon=7.
        # JNIEnv function table: FindClass=5, RegisterNatives=215 (0x6b8)
        interesting = {5: "FindClass", 215: "RegisterNatives", 19: "NewStringUTF",
                       113: "ExceptionCheck", 132: "ThrowNew"}
        bls = []
        vtable_hits = Counter()
        strings = []
        eor_count = 0
        adrp_regs = {}
        unresolved_owners = 0
        for ins in insns:
            m = ins.mnemonic
            if m == "bl":
                try:
                    bls.append(int(ins.op_str.replace("#", ""), 16))
                except ValueError:
                    pass
            elif m == "ldr":
                # ldr xN, [xM, #imm] — possible vtable slot
                if "[x0, #0x6b8]" in ins.op_str or "RegisterNatives" in ins.op_str:
                    vtable_hits["RegisterNatives@0x6b8"] += 1
                for slot, nm in interesting.items():
                    if f", #{hex(slot*8)}]" in ins.op_str or f", #{slot*8}]" in ins.op_str:
                        vtable_hits[f"{nm}(slot {slot})"] += 1
            elif m == "adrp":
                parts = ins.op_str.split(", ")
                if len(parts) == 2:
                    adrp_regs[parts[0]] = int(parts[1], 16)
            elif m in ("add", "ldr") and adrp_regs:
                pass
            elif m in ("eor",):
                eor_count += 1
        # collect adrp+add string refs by re-walking
        cur = {}
        for ins in insns:
            if ins.mnemonic == "adrp":
                r, v = [x.strip() for x in ins.op_str.split(",")]
                cur[r] = int(v, 16)
            elif ins.mnemonic == "add":
                parts = [x.strip() for x in ins.op_str.split(",")]
                if len(parts) == 3 and parts[0] in cur and parts[1] == parts[0]:
                    try:
                        imm = int(parts[2].replace("#", ""), 16)
                    except ValueError:
                        continue
                    a = cur[parts[0]] + imm
                    s = read_cstr(a)
                    if s and len(s) >= 3 and where(a) in (".rodata", ".dynstr"):
                        strings.append((ins.address, a, s))

        print("\nvtable-slot matches (heuristic):")
        for k, v in sorted(vtable_hits.items()):
            print(f"  {k}: {v}")
        print(f"\nXOR (eor) instruction count: {eor_count}")
        print(f"\ninternal bl targets (top 15 by calls):")
        internal = Counter(b for b in bls if addr <= b < addr + size)
        for t, c in internal.most_common(15):
            print(f"  0x{t:x}: {c} call(s)  [{where(t)}]")
        extern = [b for b in bls if not (addr <= b < addr + size)]
        print(f"\nexternal bl targets: {len(extern)} unique")
        for t in sorted(set(extern))[:15]:
            print(f"  0x{t:x}  [{where(t)}]")
        print(f"\nstring references via adrp+add ({len(strings)}):")
        for ia, a, s in strings[:40]:
            print(f"  0x{ia:x} -> 0x{a:x} [{where(a)}]: {s!r}")


if __name__ == "__main__":
    main()
