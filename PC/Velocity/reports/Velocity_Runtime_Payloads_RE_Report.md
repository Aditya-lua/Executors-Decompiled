# Velocity runtime payloads: static reverse-engineering report

Analysis date: 2026-11-01 UTC

## Scope and handling

This report covers the two native payloads referenced by the recovered Velocity client:

- `Decompiler.exe`
- `erto3e4rortoergn.exe` (the injector payload)

Neither executable was launched. All findings came from file metadata, imports, strings, disassembly/decompilation, repository history, and source correlation.

The currently configured `realvelocity.xyz` update endpoint was unavailable during collection. The analyzed files were therefore retrieved from the GitLab repository associated with Velocity's observed runtime downloads. The local files exactly match the Git blobs in repository commit `6a42c9fd08dc611a978604bffe18215f95c2f695`.

## Sample identity

| File | Size | SHA-256 | MD5 | Git blob |
|---|---:|---|---|---|
| `Decompiler.exe` | 9,900,032 bytes | `fb5c5e11296f8cd6b552aa03daf760d99a380077ff92ba657d4d956af5f3d0f8` | `a109790efbe0542dddf63ef0415dd508` | `11099c8b5a4efeb0b2f1f92c979b65671299417d` |
| `erto3e4rortoergn.exe` | 32,926,720 bytes | `d4d1c829cef7435ec0606ab25b69f343902d699f834b3950c60c50cd60339fc4` | `6c5cc4bc147c2d46a26ba9a752846196` | `bd1c1e4ec62d828f3b414bcc6f286f41f9040c82` |

Repository provenance:

- GitLab project: `absolutetanker/donottouchplease`
- Current analyzed repository commit: `6a42c9fd08dc611a978604bffe18215f95c2f695`, authored 2026-04-06
- Latest commit touching `Decompiler.exe`: `c56b7817e8eedfba7702289a42f481c7bfa4f057`, authored 2026-01-23
- Latest commit touching the injector: `6a42c9fd08dc611a978604bffe18215f95c2f695`, authored 2026-04-06

## Bottom line

`Decompiler.exe` is not an injector and contains no anti-cheat evasion. It is a loopback-only Rust HTTP service that accepts a request body containing base64-encoded Luau bytecode, decodes it, passes the bytes to a bundled Medal/`luau-lifter` decompiler, and returns reconstructed Luau source.

The injector is a native x64 program protected with VMProtect and a large `.tempest_2` virtualized/packed region. Its original injection and possible anti-cheat-evasion logic is encrypted or virtualized at rest. Static decompilers can recover only its outer loader/dispatcher and decoy instructions, not trustworthy original C++ source.

Accordingly, this sample set establishes where any Velocity anti-cheat evasion would have to live (inside the protected injector), but it does **not** establish which evasion technique is used. Protection/obfuscation is evidence of concealment, not proof of a specific bypass.

## `Decompiler.exe`

### Binary profile

- PE32+ x86-64 Windows console executable
- Unsigned
- PE timestamp: 2025-02-21 10:48:28 UTC
- PDB path/name: `decomp_server.pdb`
- Five conventional PE sections; no packer detected
- Rust application linked through the Microsoft linker/runtime
- Embedded Rust toolchain paths and crate diagnostics identify:
  - `decomp-server\src\main.rs`
  - `luau-lifter\src\...`
  - Tokio 1.43.0
  - Hyper 0.14.32
  - `base64`, `regex-automata`, `serde`, `env_logger`, and related crates

### Recovered behavior

The public `xeonise/medal2` source tree is included in the recovery package at commit `7e80ce9f21b8268b995b09d48d58be3f1e89ae8c`. Its server source matches the binary's distinctive strings and control flow:

1. Initialize `env_logger`.
2. Bind Hyper to `127.0.0.1:9002`.
3. Accept an HTTP request on any method/path.
4. Read the entire body.
5. Convert the body to UTF-8 text.
6. Base64-decode it.
7. Call `luau_lifter::decompile_bytecode(&bytecode, 203)`.
8. Return the resulting Luau source or a base64-decoding error as the response body.

The key recovered source is:

```rust
async fn decompiler(base64_b: String) -> Result<String, String> {
    match decode(base64_b.as_bytes()) {
        Ok(bytecode) => {
            let decompiled = decompile_bytecode(&bytecode, 203);
            Ok(format!("{}", decompiled))
        }
        Err(e) => Err(format!("Failed to decode base64 bytecode: {}", e)),
    }
}

#[tokio::main]
async fn main() {
    env_logger::init();
    let addr = SocketAddr::from(([127, 0, 0, 1], 9002));
    let server = Server::bind(&addr).serve(make_svc);
    println!("Listening on http://{}", addr);
    if let Err(e) = server.await {
        eprintln!("Server error: {}", e);
    }
}
```

### Security notes

- It binds only to loopback, so it is not remotely exposed by default.
- It has no authentication, route validation, or request-size limit.
- It uses `unwrap()` for body collection and UTF-8 conversion, so malformed local requests can terminate a worker/task and may cause a local denial of service.
- Its imports and source contain no process injection, Roblox process discovery, driver access, anti-debugging beyond ordinary Rust/MSVC runtime behavior, or anti-cheat bypass logic.

## `erto3e4rortoergn.exe`

### Binary profile

- PE32+ x86-64 Windows console executable
- Unsigned
- PE timestamp: 2026-04-05 18:57:53 UTC
- 36 sections
- Detect It Easy identification: `Protector: VMProtect[packed]`
- Randomized tiny section names followed by:
  - `.tempest`
  - `.tempest_1`
  - `.tempest_2` (approximately 31.4 MiB, executable)
- Original-looking `.text`, `.rdata`, `.data`, and `.pdata` sections have no raw file data; execution is redirected into the protector region.

### What static decompilation recovered

The PE entry point at `0x142baf083` immediately calls a function at `0x1418beaad`. The surrounding bytes decompile into implausible operations and a `loop` instruction, including writes to nonsensical addresses. This is characteristic of a protected/decoy entry stub, not compiler-generated application logic.

The exposed import table is deliberately minimal and includes:

- `LoadLibraryA`, `GetModuleHandleA`, `GetProcAddress`
- `FindWindowA`
- `GetTokenInformation`
- allocation and C/C++ runtime functions

Dynamic resolution through `GetProcAddress` means the import table is not a complete behavioral inventory. At the same time, these few visible imports do not prove any particular injection or anti-cheat-evasion technique.

### Why original source cannot be claimed

VMProtect transforms selected functions into a private virtual instruction set and encrypts/compresses code that is reconstructed at runtime. A conventional decompiler sees the VM interpreter and intentionally malformed control flow. Recovering the protected application logic would require observing a safely isolated runtime-unpacked image and then devirtualizing the transformed functions. That was intentionally not done here because it would require executing an untrusted injector.

The included `packed_entrypoint_pseudocode.txt` and `packed_dispatcher_pseudocode.txt` are therefore evidence of the static boundary, not a representation of the injector's original source.

## Anti-cheat evasion assessment

| Component | Confirmed anti-cheat evasion? | Evidence |
|---|---|---|
| Recovered Velocity client | No confirmed implementation | Orchestrates download/start and communicates with runtime pieces. |
| `Decompiler.exe` | No | Local Luau decompilation server; exact source and imports do not manipulate Roblox or another process. |
| Protected injector | Not confirmable statically | VMProtect/Tempest hides original logic; protection and dynamic API resolution are present, but no specific bypass can be attributed. |

The defensible conclusion is: **the decompiler does not contain Velocity's evasion; if the analyzed build has anti-cheat evasion, it is concealed inside the protected injector. The specific mechanism is not recoverable from this at-rest sample alone.**

## Deliverable contents

The static-recovery archive intentionally omits the two runnable executables. It contains:

- this report;
- sample hashes and repository provenance;
- the matching `xeonise/medal2` Rust source tree (without Git metadata);
- imports and protection-identification output;
- selected application-relevant strings;
- Ghidra/radare2 pseudocode where useful;
- the protected injector's entry/dispatcher output, clearly labeled as packer stubs.

## Confidence and limitations

- High confidence in sample identity: local files match the Git repository blobs exactly.
- High confidence in `Decompiler.exe` behavior: source correlation, embedded build paths, strings, imports, and dependency versions agree.
- High confidence that the injector is VMProtect-packed/virtualized.
- Low confidence in any claim about the injector's original algorithms without runtime unpacking; no such claim is made.
- These repository samples are the newest files retrievable from the referenced repository, but the unavailable update endpoint prevented cryptographic confirmation that they were the exact payloads being served at the instant of analysis.
