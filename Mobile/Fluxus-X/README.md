# Fluxus X — Android 1.0.0 recovery

Static recovery of the user-supplied `Fluxus X V1.0.0.apk`. The added executor
identifies itself as **Fluxus X**, version **1.0.0**; the Android manifest retains
`com.roblox.client`, Roblox version `2.747.1486`, version code `21686`.

This folder contains decompiler output and recovered embedded source, rather
than the vendor's original buildable project. Android/executor runtime behavior
was not tested.

## Start here

- [Recovery and behavior report](reports/RECOVERY.md)
- [Machine-readable verification](reports/verification.json)
- [Recovered Lua UI/bootstrap](decompiled/decoded/recovered_ui.lua)
- [Recovered Drawing implementation](decompiled/decoded/recovered_drawing.lua)
- [Recovered GC helpers](decompiled/decoded/recovered_gc_cache.lua)
- [Recovered bit compatibility helper](decompiled/decoded/recovered_bit_compat.lua)
- [Added Java entry point](decompiled/java/com/lazyexec/exe/MainActivity.java)
- [Storage permission/directory helper](decompiled/java/com/lazyexec/exe/PermSender.java)
- [Core native function index](data/liblazydtc/functions.tsv)
- [Credential finding, with values withheld](reports/CREDENTIALS.md)
- [Tools and reproduction](reports/REPRODUCE.md)

## Recovered content

| Artifact | Coverage |
| --- | --- |
| Java | 13,384 JADX source files; 114 tool-reported errors retained and indexed |
| Smali | All 26,664 DEX class definitions, across all four DEX files |
| Embedded Lua | Four complete UTF-8 buffers; all pass Luau 0.747 syntax parsing |
| Native core | 19,964 identified `liblazydtc.so` function entries exported by Ghidra |
| Native support | 19 `libtrampoline.so` function entries exported by Ghidra |
| Published native pairs | 19,982 pseudocode/disassembly pairs; one credential initializer withheld |
| Other native libraries | ELF sections, imports, exports, dependencies, sizes, and hashes for all nine libraries |
| Android content | Decoded manifest, textual resources/assets, and APK member inventory |

The 108 MB `libroblox.so` engine and the other support libraries are inventoried,
not fully decompiled. Ghidra output contains inferred types, synthetic names,
indirect-call warnings, and compiler/runtime code. Successful export does not
establish behavioral equivalence or complete discovery of all native functions.

## Input identity

| Field | Value |
| --- | --- |
| Bytes | `159619130` |
| SHA-256 | `0491e1c5d9bce3c47fdd27f32593dd2a3ad3d3adab5902fe315e7d4d64e6d2aa` |
| ABI | `arm64-v8a` |
| Android SDK | minimum 26; target 35 |
| Core native SHA-256 | `5241de4be0daeb2a193604d26b9e6a9b528757ffd74fb61b961e6ed8ae1c88cc` |

See [input.json](evidence/input.json), [APK members](evidence/apk-members.json),
and [derived-file manifests](evidence/derived-files-index.json) for provenance.
The original APK, DEX files, native binaries, tool binaries, caches, and runtime
checkpoints are excluded.

## Layout

| Directory | Contents |
| --- | --- |
| `decompiled/java/` | JADX source |
| `decompiled/smali/` | Apktool disassembly for each DEX |
| `decompiled/decoded/` | Native embedded Lua buffers, with descriptive recovery filenames |
| `decompiled/resources/`, `decompiled/assets/` | UTF-8 Android resources and assets |
| `pseudocode/`, `disassembly/` | Native functions, grouped by library |
| `data/` | Function/call/reference indexes, ELF metadata, constant evaluation, and diagnostics |
| `evidence/` | Input/member hashes, derived-file hashes, exclusions, and redactions |
| `scripts/` | Restartable recovery and verification tooling |
| `reports/` | Findings, limits, and verification |
