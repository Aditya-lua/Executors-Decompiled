# Migration record

The collection was assembled from verified snapshots of these repositories:

| Destination | Source repository | Source commit | Original handling |
| --- | --- | --- | --- |
| `Mobile/Delta/` | `Aditya-lua/Delta-crack` | `9b31ce38557293ca705d8b8b7c661a0d805e794d` | Retained as requested |
| `PC/Codex/` | `Aditya-lua/Codex-Decompiled` | `7406819d9254b16e98ed9c09110f1ae170bf1a81` | Removed after verified migration on 2026-10-30 |
| `PC/Madius/` | `Aditya-lua/madius-recovered` | `8192f7abcd8cc264e2ba34174ce5e7c7c173001d` | Removed after verified migration on 2026-10-30 |
| `PC/Solara/` | `pengussy/SolaraV3-Decompiled` | `98893394a991b63928e6e59561315a42fffaf958` | Upstream, retained |
| `macOS/Hydrogen/` | `pengussy/Hydrogen-Decompiled` | `bc36bb89d314b3ebe794eb13b63fafda0e365496` | Upstream, retained |

The three explicitly excluded repositories were neither copied nor modified.

## Changes applied during migration

Upstream snapshots were copied as published, with these exceptions:

- `macOS/Hydrogen/` omits the upstream `donate/` directory, and the matching
  `## Donate` section was removed from its README. Those held the upstream
  author's own cryptocurrency addresses and QR images, which should not be
  solicited from this repository.
- `macOS/Hydrogen/` omits the upstream `LICENSE`, which was a copy of the
  Solara file and credited "solara-reverse contributors" for Hydrogen's
  analysis. Attribution is recorded in the table above instead.
- `PC/Solara/README.md` had a stray heading line removed, and its layout block
  now matches the directories actually present (no `docs/`).

No files under `pseudocode/`, `disassembly/`, `decompiled/`, or `data/` were
altered.
