# Delta Executor iOS 2.743.1136 — reverse-engineering workspace

This workspace contains a static reconstruction of the Delta iOS IPA obtained
from Delta's public download page on 2026-10-29.  It is an analysis artifact,
not the vendor's original source repository.

The exact original C++, Objective-C, Rust, and Luau source cannot be recovered
from a stripped optimized Mach-O: original identifiers, comments, build files,
types, and some inlined control flow are permanently absent.  Files under
`reconstructed-src/` therefore use evidence-based names and pseudocode.  Raw
assets and machine-derived indexes are kept separate from that reconstruction.

## Verified target

- IPA: `Delta-2.743.1136.ipa`
- Bundle: `com.gloop.deltamobile`
- Version/build: `2.743.1136`
- Minimum iOS: `14.0`
- IPA SHA-256: `a2b84a104a4e306cff1725a91c8e13b72f1f4aa7ea9dd7cd4b5a4da159998afa`
- `libgloop.dylib` SHA-256: `9da7bbf557957e29d26a178e45b3d5c482cea8c21e92242b29bb9423d2e88133`
- Mach-O encryption: disabled (`cryptid = 0`)

## Layout

- `docs/DELTA_IOS_REVERSING_REPORT.md` — findings and confidence labels.
- `analysis/` — reproducible parsers, cross-reference indexes, initializer
  emulator, and selected annotated assembly.
- `reconstructed-src/` — readable source-like reconstructions of confirmed
  behavior.
- `recovered-open-source/` — the MIT-licensed Medal source baseline matching
  the embedded Rust Luau decompiler's architecture, kept separate from the
  binary-derived reconstruction and annotated with observed Delta differences.
- `lifted-src/functions/` — per-function structured C-like pseudocode generated
  from ARM64 basic blocks (populated by the bulk pass).
- `lifted-src/low-level/` — instruction-faithful C-like fallbacks for functions
  too large or too protected for safe structuring.
- `assets/` — the recovered `gloop/dlt.zip` UI/font assets.

## Lift coverage

The complete corpus covers all 19,822 function starts.  Structured C-like
pseudocode was recovered for 19,636 functions.  The remaining 186 functions
(115 structurer failures plus 71 oversized extents) have instruction-faithful
fallback lifts covering 7,371,552 bytes and 1,842,888 decoded ARM64/data
records.  Every byte in those fallback extents is represented; embedded
protector tables are emitted as `.byte` records instead of being silently
skipped.

All emulation performed by this workspace is deterministic local ARM64
emulation.  It does not launch the app, contact Delta/Roblox services, or invoke
the recovered networking/authentication code.
