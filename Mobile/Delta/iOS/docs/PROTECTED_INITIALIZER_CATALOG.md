# Protected initializer catalog

The second-stage inert emulator traced every constructor that the call-free
pass deliberately rejected. No host import, network request, authentication
path, Objective-C runtime, or filesystem operation was invoked.

## Classification

| Initializer | Internal entry | Recovered behavior |
|---:|---:|---|
| `0x5852c` | `0x137d0` | Links four Luau GC feature flags and applies the `LuauGcTraceUdata` override |
| `0x589a4` | `0x58634` | Builds an exact 1,192-byte threshold/bucket lookup table at `0xf0d674` |
| `0x4dc4a8` | `0x403cbc` | One-time address-bound 24-byte constant-block decode |
| `0x507c74` | `0x3fbbf4` | One-time address-bound 24-byte constant-block decode |
| `0x50fb48` | `0x50ee04` | One-time address-bound 24-byte constant-block decode |
| `0x50fba4` | `0x50f5f8` | One-time address-bound 24-byte constant-block decode |
| `0x51d0e4` | `0x51d098` | Allocates and zero-initializes a 3,128-byte runtime singleton |
| `0x50c658` | `0x2b21ec`, `0x3a8258` | Builds the 28-slot native dispatch table and locates `RobloxLib` |
| `0xe7ba0` | — | C++ guard/atexit wrapper |
| `0x16ae48` | — | C++ guard/atexit wrapper |
| `0x19a418` | — | C++ guard/atexit wrapper |
| `0x237ee4` | — | C++ guard/atexit wrapper |
| `0x3c77ec` | — | C++ guard/atexit wrapper |
| `0x93c888` | — | C++ guard/atexit wrapper |

The four 24-byte constant blocks are reported as decoded material rather than
assigned speculative cryptographic or API names. The traces contain no
plaintext executor API registration strings.

## Luau flag evidence

The `0x5852c` trace records 24 `_strcmp` calls. The helper at `0x137d0`
searches the linked boolean/integer flag registries by name. The constructor's
four newly linked nodes are:

- `LuauUdataMetatablePinned`
- `LuauGcTableStepFix`
- `LuauGcTraceUdata`
- `LuauGcMarkUdataAccess`

This establishes that the constructor is stock Luau runtime setup, not Delta's
Luau-facing executor registration table.

## Reproducibility

Trace reports and post-state dumps are under
`analysis/protected-init-traces/`. The safe pass now also records the exact 47
rejected addresses and rejection reasons in
`analysis/delta-libgloop-safe-init-v2.json`.
