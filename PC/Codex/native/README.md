# Native client recovery

The versioned loader for Roblox `0.744.0.7441080` contains two embedded PE images:

- `embedded-client.dll`: offset `0x55ac0`, extracted size 9,369,088 bytes, the actual Codex native client;
- `dsclient.dll`: offset `0x9450c0`, size 65,536 bytes, Microsoft Data Sharing Service Client DLL 10.0.22621.3527.

The Codex client is an unpacked 64-bit PE DLL. RTTI and string evidence identifies `executor::core`, `executor::task_scheduler`, and library areas for base, filesystem, actors, miscellaneous, file dialog, drawing, HTTP, signal, table, cache, reflection, debug, instances, cryptography, environment, input, closures, scripts, RakNet, and console functionality. It also includes statically linked Luau, OpenSSL, curl, graphics, and font code.

`embedded-client.pseudocode.c` is a complete best-effort Ghidra pass over discovered non-external functions. `functions.csv` inventories every discovered function and records whether each primary decompilation succeeded. The primary pass recovered 25,889 of 25,896 functions. `retry-pseudocode.c` records longer-timeout retries: 2 additional functions recovered and 5 remained unrecoverable. These files are analysis products, not original C++ source and not expected to compile.
