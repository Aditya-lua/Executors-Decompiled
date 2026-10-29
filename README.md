# Executors Decompiled

A collection of decompiled roblox executors.

This repository consolidates source-like reconstructions, decompiler output,
analysis reports, evidence indexes, and recovered resources. These are
best-effort reverse-engineering artifacts, not the vendors' original source
repositories.

## Collection

| Platform | Executor | Contents |
| --- | --- | --- |
| Mobile | [`Delta`](Mobile/Delta/) | Android and iOS decompilation/reconstruction workspaces |
| PC | [`Codex`](PC/Codex/) | Recovered Windows managed projects, web runtime, and native pseudocode |
| PC | [`Madius`](PC/Madius/) | Windows updater analysis and recovered native pseudocode |

## Layout

```text
Executors-Decompiled/
├── Mobile/
│   └── Delta/
│       ├── android/
│       └── iOS/
└── PC/
    ├── Codex/
    └── Madius/
```

Each executor folder keeps its own README, reports, limitations, and supporting
analysis material.

## Excluded repositories

The following projects are intentionally not part of this collection and remain
separate:

- `Potassium-Keyless`
- `Bunni-Decompiled`
- `WUYX-decompiled`

