# Source lift status

This tree is the closest source-like reconstruction that can be derived from
the stripped, optimized `libgloop.dylib` without pretending recovered
pseudocode is the vendor's original repository.

## Coverage model

| Tier | Purpose | Current coverage |
|---|---|---:|
| Hand-normalized | High-confidence named behavior and data structures | bootstrap, dyld lookup, split-pointer calls, anti-analysis, decoy loader, Luau decompiler ABI, Luau flags, runtime lookup table |
| Structured C-like | Types, expressions, loops and conditionals recovered by an ARM64 decompiler | 19,636 functions |
| Instruction-faithful C-like | Lossless fallback for flattened, timed-out, or oversized extents | 186 functions / 7,371,552 bytes / 1,842,888 records |
| Machine indexes | Imports, direct calls, resolved indirect calls, strings and constructor state | all 19,822 function starts |

Together the two lift tiers cover all 19,822 recorded function starts.  The
fallback manifest confirms that its `decoded_bytes` sum equals its source
extent size.  This matters because several protected functions interleave code
and embedded tables; a normal disassembler stops at the first invalid ARM64
word and silently loses the remainder.

## Open-source source match

The embedded Rust decompiler is an updated Medal-lineage `luau-lifter`. The
MIT-licensed public Medal workspace is preserved under
`recovered-open-source/medal2-baseline/` as a source scaffold. It is not counted
as binary-derived coverage and is not represented as Delta's exact source. The
public baseline supports bytecode versions 4–6; the IPA's updated implementation
supports 4–9 and adds a native C-string boundary.

## Naming and fidelity

Addresses are the stable identity.  Synthetic functions use names such as
`sub_003a8258`; evidence-backed semantic names live in `reconstructed-src/`.
Variables and types in generated C are inferred and may be wrong.  Direct
instruction comments and the manifests remain the authority when a structured
expression is ambiguous.

## Safety boundary

All work is static or deterministic local emulation.  The app is not launched,
and authentication, remote services, and recovered network routines are not
invoked.
