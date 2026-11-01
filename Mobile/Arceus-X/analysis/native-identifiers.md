# Native payload identifiers: initial recovery

This note records findings taken from the existing recovery artifacts
(`Shared/native/strings.txt`, `Shared/native/elf-symbols.txt`,
`Shared/native/elf-sections.txt`) without a new disassembly pass. Every
statement is a string or symbol observation with a line reference; the one
interpretation is labelled as such.

Inputs are the two `lib/arm64-v8a/libzstd-jni-1.5.7-6.so` payloads described in
[`REPORT.md`](REPORT.md), 9,803,664 bytes each, differing in two `.gnu.plt`
bytes.

## 1. The export surface is zstd JNI plus one loader entry

| Observation | Value |
| --- | --- |
| Exported `FUNC` symbols (`Ndx != UND`) | 149 |
| of which `Java_com_github_luben_zstd_*` | 148 |
| of which anything else | 1 — `JNI_OnLoad` (`elf-symbols.txt:298`) |
| `Java_com_axjava_*` exports | 0 |
| Java `native` declarations under `com.axjava` | 10 |

The ten Java natives are `Main.lIIlIIlIIlII`, `JNIFunctions.SendButton`,
`JNIFunctions.SendParamsToArceus`, `JNIFunctions.SendParamsToArceusTouch`,
`JNIFunctions.handleTextInput`, and the five
`AXWebViewController.nativeOn*` callbacks. None has a matching export, and no
`lIIlIIlIIlII` occurrence exists anywhere in the 104,341-line string dump.

Consequence: the binding cannot be recovered by static symbol resolution. The
implementations must be attached at load time from `JNI_OnLoad` (a 13,184-byte
`FUNC` in `.dynsym`), most likely through `RegisterNatives` with names built or
decrypted at runtime. That table is the next concrete target, and it requires
either dynamic instrumentation of the registration call or a working lift of
`JNI_OnLoad`, which current Ghidra output does not provide (the exported
pseudocode for that address is `halt_baddata` — anti-disassembly, not a small
function).

## 2. The payload is a Rust-built Luau bytecode decompiler, not a Lua VM

Compiled-in source paths and runtime markers:

- Rust toolchain and panic machinery: `/rustc/7c3c88f42ad444f4688b865591d84660be4ece2f/library/std/...`
  (`strings.txt:784-785`, `932`, `1206`), `) panicked at ` (`strings.txt:784`).
- Windows build host: `C:\Users\ciaon\.cargo\registry\src\index.crates.io-1949cf8c6b5b557f\nom-7.1.3\...`
  (`strings.txt:1324`, `1434`) and `C:\Users\ciaon\.cargo\git\checkouts\petgraph-...`
  (`strings.txt:936`, `1085`).
- 24 distinct internal source paths, from five project crates:

| Crate | Recovered modules | Example line |
| --- | --- | --- |
| `luau-lifter` | `deserializer/{bytecode,chunk,constant,function}`, `lifter` | `strings.txt:932`, `1693` |
| `cfg` | `function`, `ssa/{construct,destruct,liveness,inline,structuring,upvalues,param_dependency_graph}` | `strings.txt:2603`, `2845` |
| `ast` | `for`, `formatter`, `global`, `local_declarations`, `name_locals` | `strings.txt:1832`, `2368` |
| `restructure` | `lib`, `loop`, `conditional`, `jump` | `strings.txt:935`, `1694`, `2085`, `2737` |
| `medal-ffi` | `lib` | `strings.txt:1204` |

Third-party dependencies visible in the same paths: `petgraph` (dominators,
stable graph), `nom`, `fixedbitset`, `array_tool`, `addr2line`.

There is no `lua_*` or `luaL_*` symbol in the export table or the symbol dump,
so the Luau interpreter is not present as a library. The recovered crates are a
bytecode deserializer feeding an SSA/CFG pipeline with a structurer
(`cfg::ssa::structuring`, `restructure::loop`, `restructure::conditional`) and an
AST with a formatter.

**Interpretation, not observation:** this is a static Luau *decompiler* — bytecode
in, reconstructed source out — rather than an execution engine. That matches the
executor feature set (readable script output) but has not been confirmed at
runtime. `medal-ffi` is the likely JNI/FFI boundary; that is also inference from
its name and position, not a call-graph result.

Two further strings hint at the same layer and are unexplained:
`RegisterLuaUrl` (`strings.txt:986`) and
`luau-lifter\src\deserializer\bytecode.rs`.

## 3. Three non-standard sections

| Section | Flags | Size | Note |
| --- | --- | --- | --- |
| `.text` | AX | 0x752a70 | ordinary code |
| `.stack` | AX | 0x1c | executable, 28 bytes — not a stack |
| `.dyncall` | AX | 0x70cc | executable, name implies indirect dispatch |

A 28,876-byte executable section named `.dyncall` and a 28-byte executable
`.stack` are both abnormal for a Rust `cdylib` built by a stock Android
toolchain. Their purpose is unverified here; they are recorded because they
explain why linear disassembly of the payload produces bad-instruction stops.

Also present: statically linked `zstd` (156 string hits) and `curl`
(37 hits, including `https://curl.se/docs/hsts.html`), so network transport and
decompression are compiled into the same library.

## Reproduce

From the repository root, with the toolchain from [`tools/`](../../../tools/)：

```bash
cd Mobile/Arceus-X/Shared
awk '$4=="FUNC" && $7!="UND"' native/elf-symbols.txt | wc -l
awk '$4=="FUNC" && $7!="UND" {print $8}' native/elf-symbols.txt \
  | grep -vc '^Java_com_github_luben_zstd'
grep -c 'Java_com_axjava' native/elf-symbols.txt; grep -c lIIlIIlIIlII native/strings.txt
grep -oE '[a-z0-9_-]+\\src\\[a-z_\\.]+' native/strings.txt | cut -d'\' -f1 | sort -u
grep -E 'dyncall|\.stack' native/elf-sections.txt
```

## Limitations

The binary was not executed. `JNI_OnLoad` was not lifted; its size comes from
`.dynsym`, not from a verified function extent. String evidence shows which
source files were compiled in — it does not prove which code paths run, and
unused or dead-coded crates would look identical. Crate names are recovered from
`file!()` style panic and debug paths, so an optimized build that keeps no debug
strings would hide them completely. Registering the JNI natives remains
unrecovered.
