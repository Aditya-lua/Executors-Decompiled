# Native recovery

The versioned loader for Roblox `0.745.0.7451137` contains two embedded PE
images:

- `embedded-client.dll`: offset `0x5b0c0`, extracted size 10,425,344 bytes,
  the Codex native client;
- `dsclient.dll`: offset `0xa4c4c0`, size 65,536 bytes, Microsoft Data Sharing
  Service Client DLL 10.0.22621.3527.

The client is an unpacked 64-bit PE DLL. RTTI and string evidence identifies
`executor::core`, `executor::task_scheduler`, and libraries for filesystem,
actors, drawing, HTTP, signal, table, cache, reflection, debug, instances,
cryptography, environment, input, closures, scripts, RakNet, and console
functionality. It also contains Luau, OpenSSL, curl, graphics, and font code.

## Ghidra outputs

| File | Purpose |
|---|---|
| `embedded-client.pseudocode.c` | Primary client decompilation pass |
| `functions.csv` | Inventory of all 33,199 client functions |
| `retry-pseudocode.c` | Longer-timeout retries for the 8 primary client failures |
| `loader.pseudocode.c` | Primary outer-loader decompilation pass |
| `loader-functions.csv` | Inventory of all 326 outer-loader functions |
| `loader-retry-pseudocode.c` | Longer-timeout retries for the 3 primary loader failures |

The primary client pass recovered 33,191 of 33,199 functions; two additional
functions were recovered on retry and six remained unrecovered. The primary
outer-loader pass recovered 323 of 326 functions; one additional function was
recovered on retry and two remained unrecovered. The inventories include
Ghidra-identified thunks, and each unrecovered function remains explicitly
documented.

The outer loader imports `OpenProcess`, remote-memory APIs, thread-control APIs,
and `NtCreateSection`/`NtMapViewOfSection`. This is direct evidence of injection
machinery, not proof of a named anti-cheat evasion method.

All `.c` files are Ghidra-generated, C-like navigation aids with inferred
names and types. They are not original C++ source and are not expected to
compile.
