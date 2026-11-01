# Arceus X Android

Best-effort source recovery for the current Arceus X V5 and Arceus X NEO
Android packages obtained from SPDM Team's official Android download page on
2026-10-29.

A follow-up static pass (2026-11-01) covers the **next** build pair,
V5 1.6.5 / NEO 2.3.9, in
[`2026-11-01-V5-1.6.5-NEO-2.3.9/`](2026-11-01-V5-1.6.5-NEO-2.3.9/):
the DEX layer and `libroblox.so` are byte-identical to this baseline, and the
drift is concentrated in a rebuilt native payload whose `.text` is packed by
a runtime unpacker living in the `.dyncall`/`.stack` sections.

## Result

The two APKs contain the same application code and data. Across 2,378 ZIP
members, only four members differ:

- `META-INF/ANDROIDD.RSA`
- `META-INF/ANDROIDD.SF`
- `META-INF/MANIFEST.MF`
- `lib/arm64-v8a/libzstd-jni-1.5.7-6.so`

The two native-library files have equal length and differ at only two byte
offsets inside the five-byte `.gnu.plt` metadata section. Their executable
content, symbols, build ID, and reconstructed code are otherwise identical.
The shared recovered material is therefore stored once under [`Shared`](Shared/)
instead of duplicating about 430 MB under both product names.

## Layout

- [`NEO`](NEO/) — NEO package identity, hash, and variant record.
- [`V5`](V5/) — V5 package identity, hash, and variant record.
- [`Shared/jadx/sources`](Shared/jadx/sources/) — 13,639 Java source files
  recovered with JADX 1.5.6.
- [`Shared/apktool`](Shared/apktool/) — manifest, resources, assets, and 27,166
  smali files recovered with Apktool 3.0.3.
- [`Shared/native`](Shared/native/) — Ghidra pseudocode, recognized AArch64
  assembly, ELF metadata, relocations, symbols, and strings for the disguised
  native executor library.
- [`analysis`](analysis/) — comparison, recovery coverage, and limitations.

The original APKs and `.so` binaries are intentionally omitted. Their hashes
are recorded in the variant folders and analysis report.

## Important limitation

Decompiler output is not the vendor's original source. Names, types, control
flow, comments, and project/build files may be missing or inaccurate. The
native payload uses anti-disassembly/protection techniques, so the supplied C
file is a partial pseudocode lift backed by an instruction listing, symbols,
relocations, strings, and the full Java/smali boundary.

