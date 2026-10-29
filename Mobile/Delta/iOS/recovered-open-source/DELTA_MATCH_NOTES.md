# Open-source Luau decompiler baseline

`medal2-baseline/` is a clean source snapshot of the public MIT-licensed
`xeonise/medal2` repository, retrieved from its `main` branch on 2026-10-29.
The upstream archive SHA-256 is:

`4f1795a451d7d353a0cdee38eafd9dbbb5a25a559fd142e89769001f77bbd4be`

Upstream: <https://github.com/xeonise/medal2>

The snapshot is included because the IPA embeds the same Rust module paths and
the same Medal architecture:

- `luau-lifter/src/lifter.rs`
- `luau-lifter/src/deserializer/bytecode.rs`
- `luau-lifter/src/deserializer/constant.rs`
- `luau-lifter/src/deserializer/chunk.rs`
- `luau-lifter/src/deserializer/function.rs`
- `luau-lifter/src/instruction.rs`

The binary entry at `0xb6cca8` also has the same core interface as Medal's
`decompile_bytecode(bytecode: &[u8], encode_key: u8)`: it receives pointer,
length, and encoding key, then multiplies each encoded opcode byte by that key
with wrapping `u8` arithmetic.

This is a source scaffold, not a claim of byte-for-byte identity. Important
observed differences are:

| Area | Public baseline | Delta binary |
|---|---|---|
| Luau bytecode versions | 4 through 6 | 4 through 9 |
| Public return type | Rust `String` | NUL-terminated heap string via native wrapper |
| Failure text | baseline panic/error paths | `-- deserialization failed`, `-- decompilation panicked`, and `-- failed to decompile` wrappers |
| Build | public Rust workspace | optimized, stripped iOS ARM64 integration |

The original baseline license is retained at
`medal2-baseline/LICENSE.txt`. The sample `playermodule.bin` and `script.lua`
were intentionally omitted because they are not needed to reconstruct the
embedded decompiler.
