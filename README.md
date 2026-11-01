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
| Mobile | [`Arceus X`](Mobile/Arceus-X/) | [README.md](Mobile/Arceus-X/README.md) | Android V5/NEO Java, smali, resources, and protected native-payload reconstruction; 2026-11 pass on V5 1.6.5 / NEO 2.3.9 with the packer architecture identified |
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
│   │   ├── 2026-11-01-V5-1.6.5-NEO-2.3.9/
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

## Donate

Donations are optional. If this research is useful to you, you can leave a tip.
The live page is [adicodz.xyz/donations](https://adicodz.xyz/donations).

**Send only the listed asset on the listed network. Transfers made on the wrong
network may be lost.** Verify the asset, network and address before sending.
Donations do not grant ownership of the original software.

| Asset | Network | Address |
| --- | --- | --- |
| BTC | Bitcoin network | `bc1qqjjerhv95kszck6cwes4nauqes82kucku0yxur` |
| LTC | Litecoin network | `ltc1q3dhajaunqkmcvtc0xvhxdjfnjsn8q9w3xtx5ld` |
| ETH | Ethereum network | `0xfC3E2aE9F2470813B1fEfde9Eeb5E91928aed311` |
| USDT | Ethereum (ERC20) only | `0xfC3E2aE9F2470813B1fEfde9Eeb5E91928aed311` |
| BNB | BNB Smart Chain (BSC) | `0xfC3E2aE9F2470813B1fEfde9Eeb5E91928aed311` |
| SOL | Solana network | `ARhAn44p6Kmrgece4dukx14quPYZ6g8iLLB6RbJtkkNB` |
| USDT | Solana (SPL) only | `ARhAn44p6Kmrgece4dukx14quPYZ6g8iLLB6RbJtkkNB` |
| TRX | Tron network | `TCoeQbbhKe9g6HwD1Lm9Re3TQ4s1dXLqRY` |

ETH, USDT (ERC20) and BNB (BSC) share one EVM address, and SOL and USDT (SPL)
share one Solana address. The network still decides what arrives, so pick the
row that matches what you are sending.

| BTC | LTC | ETH / USDT / BNB | SOL / USDT | TRX |
| :-: | :-: | :-: | :-: | :-: |
| <img src="donate/btc.png" alt="BTC address QR" width="150"> | <img src="donate/ltc.png" alt="LTC address QR" width="150"> | <img src="donate/eth.png" alt="EVM address QR" width="150"> | <img src="donate/sol.png" alt="Solana address QR" width="150"> | <img src="donate/trx.png" alt="TRX address QR" width="150"> |

Each QR encodes the bare address from the row above it, nothing else.

## Disclaimer

Published for security research and reverse-engineering education. Analysis is
derived from shipped binaries through disassembly and decompilation; it is not
original source. Assets and code belong to their respective owners.
