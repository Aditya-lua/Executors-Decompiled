# Delta Executor iOS 2.743.1136 — static reversing report

## Status

The IPA is fully unpacked and its Mach-O containers are inventoried.  The
custom dylib is unencrypted, but stripped and protected by extensive
address-bound constant encoding, opaque arithmetic, control-flow flattening,
and split-pointer indirect calls.  The workspace now contains source-like
coverage for all 19,822 recorded function starts: 19,636 structured C-like
functions and 186 instruction-faithful fallbacks.  This is complete function
coverage, not a claim that optimizer-erased original names or types were
recovered.

## Package identity

| Field | Recovered value |
|---|---|
| App display name | Delta |
| Bundle identifier | `com.gloop.deltamobile` |
| App executable | `Roblox` |
| Version/build | `2.743.1136` |
| Minimum iOS | `14.0` |
| SDK/platform | `iphoneos26.2` / `26.2` |
| IPA size | 149,438,924 bytes |
| IPA SHA-256 | `a2b84a104a4e306cff1725a91c8e13b72f1f4aa7ea9dd7cd4b5a4da159998afa` |

The app is a modified Roblox package.  The main executable links
`@executable_path/libgloop.dylib`; the latter is the Delta-specific native
payload.  `RobloxLib.framework/RobloxLib` is the much larger stock game-engine
component and is kept outside the reconstructed custom-source tree.

## Custom dylib inventory

| Property | Value |
|---|---:|
| File | `libgloop.dylib` |
| Size | 16,089,408 bytes |
| UUID | `83645d79-f91c-3c24-a456-a30378ce86aa` |
| SHA-256 | `9da7bbf557957e29d26a178e45b3d5c482cea8c21e92242b29bb9423d2e88133` |
| Mach-O functions | 19,822 |
| Static initializers | 2,181 |
| Import stubs | 349 |
| Indirect/GOT imports | 401 |
| Encrypted | No (`cryptid = 0`) |

Only one unusual defined symbol survives stripping (`radr://5614542`).  Normal
source names are not available.

## Bundled components

String, import, call, and panic-path evidence confirms these major layers:

| Layer | Evidence |
|---|---|
| Luau parser/compiler/runtime | Luau feature flags, compiler diagnostics, bytecode opcodes |
| Delta iOS integration | Objective-C runtime class/method creation, app lifecycle notification, Keychain calls |
| HTTP/WebSocket | ixwebsocket `11.4.6`; cpp-httplib `0.20.1` |
| TLS/crypto | OpenSSL `3.5.8` |
| Compression/image | zstd, zlib, PNG/image decoder paths |
| Luau decompiler | Rust panic/source paths under `luau-lifter/src/...` and decompiler diagnostics |
| UI resources | 74 entries from `gloop/dlt.zip`, including executor, console, auto-exec, key, file, and settings artwork |

## Confirmed custom behavior

### iOS integration range

The range near `0x2c8a9c–0x3bdf14` contains the clearest custom integration
code.  It uses:

- dyld image enumeration and symbol lookup;
- memory mapping and protection changes;
- Objective-C class allocation/registration and method addition;
- `UIApplicationDidBecomeActiveNotification` observation;
- Security.framework Keychain read/add/update operations;
- Foundation object/message dispatch.

This is a behavioral boundary, not a claim that every byte in the interval was
authored by Delta.

### Decoy loader

Function `0x2c8a9c` is control-flow flattened around a jump table at
`0xe7cce0`.  Its visible branches mention `/hi`, `libstuff.so`, and `init` and
attempt Linux-looking loader operations that do not match the iOS package.
The entry is not in `__mod_init_func`.  It is classified as a high-confidence
anti-analysis decoy rather than the real Delta loader.

### Troll string loop

Function `0xd1868` iterates over five anti-reversing/troll messages.  Its
callback pointer at `0xf01270` resolves to `0xd1864`, which is exactly one
`ret`.  The loop is therefore a no-op: the strings are not logged, transmitted,
or otherwise used by that path.

### Split-pointer initializer calls

Protected constructors derive internal call targets as:

```text
target = encoded_value_b - encoded_value_a
```

Examples recovered exactly:

| Wrapper | Encoded A location | Encoded B location | Resolved target |
|---:|---:|---:|---:|
| `0x4c98a8` | `0xd1cd90` | `0xe7faa0` | `0x41a6e0` |
| `0x4ca394` | `0xd1cdb8` | `0xe7fac8` | `0x417c7c` |
| `0x4da67c` | `0xd1cdb0` | `0xe7fac0` | `0x41d71c` |
| `0x505058` | `0xd1cd98` | `0xe7faa8` | `0x40ccf0` |
| `0x506500` | `0xd1cdc8` | `0xe7fad8` | `0x43ac98` |

These targets are internal address-bound data decoders.  They use large opaque
arithmetic sequences to reduce recognizable constants and make ordinary
decompilers produce noisy output.

The whole-image constant-propagation pass now resolves **792** indirect call
sites to **387** unique native targets.  The machine-readable mapping in
`analysis/delta-libgloop-resolved-indirect-calls.json` records every callsite,
target, and source-qword pair.  This replaces a large part of the protector's
indirect graph with ordinary call edges.

## Offline initializer recovery

The safe emulator classified all 2,181 constructor entries and executed only
call-free functions or the statically recognized one-internal-call wrappers.

| Result | Count |
|---|---:|
| Call-free constructors completed | 2,107 |
| Internal split-pointer wrappers completed | 27 |
| Emulator errors | 0 |
| Constructors deliberately skipped | 47 |

The pass changed 55,950 bytes in `__DATA` before internal-wrapper recovery and
an additional 654 bytes after the 27 resolved wrappers.  The decoded state is
still mostly binary tables and address-bound material, not plain source text.
No networking or operating-system import was executed.

A second inert pass traced all meaningful rejected constructors. It identified
the Luau feature-flag constructor at `0x5852c`, the 1,192-byte threshold-table
initializer at `0x589a4`, four one-time address-bound constant decoders, a
3,128-byte singleton allocator, six ordinary C++ guard/atexit wrappers, and the
already documented native bootstrap. The full classification and post-state
locations are in `docs/PROTECTED_INITIALIZER_CATALOG.md`.

### Protected bootstrap `0x50c658`

The largest protected constructor was traced separately with every import
redirected to an inert local shim.  It completed after 2,624,710 emulated ARM64
instructions with no invalid memory access.  Its normalized behavior is:

1. call internal builder `0x2b21ec`;
2. allocate a 224-byte (`0xe0`) read/write state block with `mmap`;
3. fill that block with a 28-entry system dispatch table;
4. decode the literal `RobloxLib` on the stack;
5. call `0x3a8258`, which enumerates dyld images and performs a substring
   search;
6. request the selected image's VM slide and return.

Recovered dispatch-table layout:

| Offset | Function | Offset | Function |
|---:|---|---:|---|
| `0x00` | `signal` | `0x70` | `fread` |
| `0x08` | `realloc` | `0x78` | `malloc` |
| `0x10` | `ftell` | `0x80` | `dyld_image_count` |
| `0x18` | null/reserved | `0x88` | `chmod` |
| `0x20` | `pread` | `0x90` | `stat` |
| `0x28` | `dlopen` | `0x98` | `dlsym` |
| `0x30` | `dladdr` | `0xa0` | `fgets` |
| `0x38` | null/reserved | `0xa8` | `fseek` |
| `0x40` | `mprotect` | `0xb0` | `fwrite` |
| `0x48` | `memcpy` | `0xb8` | `fopen` |
| `0x50` | `memset` | `0xc0` | `dyld_get_image_name` |
| `0x58` | `fclose` | `0xc8` | `free` |
| `0x60` | `sysconf` | `0xd0` | `dyld_get_image_vmaddr_slide` |
| `0x68` | `remove` | `0xd8` | `mmap` |

The state pointer is stored at global address `0xf0d3e0`.  This stage is a
native bootstrap/import indirection layer, not an authentication or network
routine.

## Rust Luau decompiler

Rust source-path evidence identifies an embedded `luau-lifter` implementation:

- `luau-lifter/src/lifter.rs`
- `luau-lifter/src/deserializer/bytecode.rs`
- `luau-lifter/src/deserializer/constant.rs`
- `luau-lifter/src/deserializer/chunk.rs`
- `luau-lifter/src/deserializer/function.rs`
- `luau-lifter/src/instruction.rs`

The large function at `0xb6cca8–0xb71828` is the high-confidence bytecode
deserialize/lift/decompile entry. Its three arguments are byte buffer, length,
and an **opcode encoding key (`u8`)**. At `0xb6de74–0xb6de7c` the implementation
multiplies the encoded opcode by that key with wrapping byte arithmetic. Ordinary
Luau bytecode uses key 1; Roblox client bytecode conventionally uses 203. It
validates the first Luau bytecode version byte against the range 4–9, builds
structured parsing errors, runs the lifting/decompilation pipeline, and returns
a heap-owned NUL-terminated string. Native `0xb71828` is the paired destructor.
Its failure paths construct the messages `-- deserialization failed` and
`-- decompilation panicked`.

The module paths and ABI match the public MIT-licensed Medal `luau-lifter`
architecture. A clean public source baseline is included under
`recovered-open-source/medal2-baseline/`, with exact observed differences and
provenance documented separately. The IPA contains a newer/private fork: the
public baseline accepts bytecode versions 4–6, whereas this binary accepts 4–9.

## Recovered resources

`gloop/dlt.zip` yielded executor UI artwork and two font-family manifests.
Notable recovered resources include `Execute.png`, `Console.png`,
`AutoExecNotify.png`, `Key.png`, file/clipboard controls, `NewUI.png`,
`OldUI.png`, and `logo.png`.  The original PNGs and JSON font manifests are
preserved under `assets/`.

## Complete source-like corpus

All 19,822 `libgloop.dylib` function starts now have a source-like artifact.
The structured tier contains 19,636 C-like functions.  The other 186 functions
have instruction-faithful C-like listings; their 7,371,552 source bytes equal
their manifest's decoded-byte total exactly.  The function-source CSV joins
each address to lift status, imports, strings, direct calls, resolved indirect
calls, and evidence-backed semantic labels.

A separate transient-string pass inspected 1,004 custom-range functions and
recorded 149 call-argument candidates.  It confirms iOS lifecycle, Objective-C
type, decoy-loader, closure, and URL strings, but does not recover plaintext
Luau executor API registration names.  Those protected names are not replaced
with guesses.

## What “full source” can and cannot mean

The IPA contains machine code, not the original project.  A complete byte-level
inventory is achievable, and protected functions can be lifted into equivalent
pseudocode.  Exact original source is impossible to reproduce because names,
comments, formatting, build configuration, many types, and optimizer-erased
structure are not present in the binary.  This workspace therefore separates:

1. exact recovered bytes/assets and hashes;
2. machine-derived indexes and assembly;
3. evidence-based reconstructed pseudocode.

No reconstructed file should be represented as the developer's verbatim
original source.

## Remaining semantic-recovery milestones

1. Assign semantic names to additional protected functions using the completed
   corpus and call-argument evidence.
2. Recover protected Objective-C selector strings that do not survive as
   plaintext.
3. Map the protected executor API registration table to Luau-facing names
   without invoking authentication or remote services.
