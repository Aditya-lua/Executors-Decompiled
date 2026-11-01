# Executors Decompiled

A collection of decompiled roblox executors.

This repository consolidates source-like reconstructions, decompiler output,
analysis reports, evidence indexes, and recovered resources. These are
best-effort reverse-engineering artifacts, not the vendors' original source
repositories. No executor binaries are redistributed here, only derived text.

## Collection

| Platform | Executor | Start here | Contents |
| --- | --- | --- | --- |
| macOS | [`Hydrogen`](macOS/Hydrogen/) | [analysis.md](macOS/Hydrogen/analysis.md) | Mach-O launcher and arm64/x86_64 payload dylibs, Luau runtime and `medal` decompiler, 13.5k pseudocode functions |
| Mobile | [`Arceus X`](Mobile/Arceus-X/) | [README.md](Mobile/Arceus-X/README.md) | Android V5/NEO Java, smali, resources, and protected native-payload reconstruction |
| Mobile | [`Delta`](Mobile/Delta/) | [README.md](Mobile/Delta/README.md) | Android and iOS decompilation/reconstruction workspaces |
| PC | [`Codex`](PC/Codex/) | [RECOVERY_REPORT.md](PC/Codex/RECOVERY_REPORT.md) | Recovered Windows managed projects, web runtime, and native pseudocode |
| PC | [`Madius`](PC/Madius/) | [README.md](PC/Madius/README.md) | Windows updater analysis and recovered native pseudocode |
| PC | [`Solara`](PC/Solara/) | [README.md](PC/Solara/README.md) | Rust/Tauri host and 18 MB Luau DLL, HTTP bridge, memory-patching cluster |

## Folder conventions

Executor folders reuse the same names, so the same artifact lives in the same
place in every target:

| Folder | What it holds |
| --- | --- |
| `README.md` | scope, target hashes, findings, and that target's own layout |
| `pseudocode/` | decompiler C output, one file per function address |
| `disassembly/` | per-function assembly listings |
| `decompiled/` | managed-code output close to source (C#, Java, smali) |
| `data/` | strings, imports, call graph, and function indexes as TSV/JSON |
| `analysis/`, `reports/` | written findings and limitations |
| `evidence/` | provenance for recovered inputs |
| `scripts/`, `tools/` | the analysis tooling used to produce the above |

Not every target has every folder. Each executor's own README is authoritative
for what it actually contains.

## Layout

```text
Executors-Decompiled/
├── macOS/
│   └── Hydrogen/
├── Mobile/
│   ├── Arceus-X/
│   │   ├── NEO/
│   │   ├── V5/
│   │   └── Shared/
│   └── Delta/
│       ├── android/
│       └── iOS/
└── PC/
    ├── Codex/
    ├── Madius/
    └── Solara/
```

## Provenance

[`MIGRATION.md`](MIGRATION.md) records the source repository and commit each
executor folder was assembled from.

## Excluded repositories

The following projects are intentionally not part of this collection and remain
separate:

- `Potassium-Keyless`
- `Bunni-Decompiled`
- `WUYX-decompiled`

## Disclaimer

Published for security research and reverse-engineering education. Analysis is
derived from shipped binaries through disassembly and decompilation; it is not
original source. Assets and code belong to their respective owners.
