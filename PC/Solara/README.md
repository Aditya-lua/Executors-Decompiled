# Solara V3 reverse engineering

## What is in here

The app is a Rust and Tauri host talking to one native DLL. The DLL is a full
Luau interpreter with an HTTP bridge and a memory patching cluster. It does not
create remote threads and it does not stage shellcode. It patches Luau code that
already runs inside Roblox.

## Main findings

| Question | Answer |
|---|---|
| Host application | Rust with Tauri 2 and WebView2 |
| Native engine | 18 MB DLL, Luau compiler, crow HTTP server |
| Bridge | local HTTP on 127.0.0.1, four endpoints |
| Remote thread | none, zero thread APIs present |
| Memory writes | read/write only, never executable |
| Asset files | encrypted, key not present in either binary |
| Execution trigger | not identified, needs the Roblox binary to resolve |

## Numbers

| Metric | Value |
|---|---|
| Functions decompiled to readable C | 70 |
| Functions in .pdata | 19,575 |
| Call graph edges | 54,500 |
| Functions with import call sites | 685 |
| Decompile failures | 0 |
| Exports of the DLL | 1, Start at 0xAECAC0 |

## Layout

```text
README.md             scope, findings, numbers
pseudocode/           70 files, readable C from Ghidra
disassembly/          62 files, per function assembly
decompiled/           21 files, C# from ILSpy
data/                 19 files, call graph, indexes, resolved strings
scripts/              analysis tools used to produce the above
```

Everything is plain text. GitHub renders the C files directly, no download step.

## Scripts

| File | Purpose |
|---|---|
| build_ranges.py | reads .pdata, maps functions that call the interesting imports |
| map_calls.py | builds the full call graph and IAT call site table |
| scan_asset.py | entropy and structure report for the encrypted assets |
| probe_asset.py | cipher attempts with AEAD tag verification |
| export_pseudocode.java | headless Ghidra exporter for pseudocode |

Verified against the live binaries. build_ranges.py returns 19,575 functions and
map_calls.py returns 54,500 edges, matching the numbers above.

## Disclaimer

Published for security research and reverse engineering education. No binaries
are distributed here. Assets and code belong to their respective owners. Files in
pseudocode, disassembly and decompiled are output from Ghidra and ILSpy, not
original source.
