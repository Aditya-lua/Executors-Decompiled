# Hydrogen Reverse Engineering

Reverse-engineering notes and decompiled pseudocode for the macOS Hydrogen
package distributed through `https://www.hydrogen.lat/install`.

## What is in the box

| File | Bytes | What it is |
|---|---|---|
| `Hydrogen` | 31,871,264 | launcher executable, x86_64 + arm64 |
| `Hydrogen-arm.dylib` | 11,853,136 | arm64 payload, Luau runtime plus the `medal` decompiler |
| `Hydrogen-intel.dylib` | 13,584,320 | x86_64 build of the same payload |
| `insert_dylib` | 85,200 | stock dylib injection helper, `LC_LOAD_DYLIB` patcher |

## Coverage

| Metric | Value |
|---|---|
| Functions in `__text` | 24,795 |
| Disassembled | 24,795 (1,926,348 instructions, 100 percent) |
| Lifted to C by Ghidra | 13,501 |
| Strings recovered | 8,138 |
| Import call edges | 14,235 |
| Call graph edges | 44,629 across 14,695 functions |
| Bound lazy symbols mapped | 3,256 bindings, 698 stubs |

C pseudocode is available for 13,501 of 24,795 functions (54.5 percent).
This is decompiler output, not the original source code or a buildable project.
The remaining functions have not been fully decompiled. Absence of strings or
imports alone does not establish that a function is unimportant.

## The three interesting findings

1. **The decompiler is open source shaped.** Every module path in the Rust build
   points at `/Users/x0rch/hydrogen-m/`, and the decompiler half lives under
   `src/medal/` with crates for `luau-lifter`, `ast`, `cfg` and `restructure`.
   The CLI is `decompile_bytecode`, the opcode key transform is
   `op = op * key % 256` with `203` named as the Roblox client key.
2. **The Lua API is a normal executor surface.** `getgenv`, `loadstring`,
   `getscriptbytecode_internal`, `firetouchinterest`, `hookfunction`,
   `queue_on_teleport`, `getfflag` and about 120 more, declared in
   `src/lua/libs/`. One function, `0x1893c` at 34,004 bytes, owns 168 of those
   string references on its own.
3. **Hardware identity is a salted sha384.** `sha384`, `LOP_SKID`,
   `_QWWSZSADJASUDOPI`, `get_hwid`, `gethwid` and `key.txt` sit next to each
   other, with three fixed 25 character salts.

## Reading order

| Path | Content |
|---|---|
| `analysis.md` | full write up, installer, binaries, decompiler, API, bridge, HWID |
| `coverage.md` | exactly what is decompiled and what is only mapped |
| `data/functions.tsv` | all 24,795 functions with sizes, instruction counts, string and import counts |
| `data/strings.tsv` | 8,138 string references keyed by function |
| `data/imports.tsv` | imported symbol set per function |
| `data/callgraph.json` | callee and import edges per function |
| `data/pseudocode_index.tsv` | which functions have C, and how big the file is |
| `data/binaries.tsv` | hashes of the four shipped binaries |
| `pseudocode/` | 13,501 Ghidra C files, named by function address |
| `disassembly/keyword_blocks.asm.txt` | ARM64 listing for the 755 functions that touch keywords |

## Legal

Analysis for interoperability, research and detection. The binaries are not
redistributed here, only derived text.
