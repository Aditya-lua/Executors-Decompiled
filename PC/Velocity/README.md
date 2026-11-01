# Velocity

Static source recovery and runtime-payload analysis for the Windows Velocity
executor.

## Samples

| Component | SHA-256 | Result |
| --- | --- | --- |
| `Velocity.exe` | `48f1689eb31a2ab45ff2fd45d04ef231be843e4500664ac9a6cee8efbadebc5a` | .NET 10 single-file bundle recovered into C# and XAML projects |
| `Decompiler.exe` | `fb5c5e11296f8cd6b552aa03daf760d99a380077ff92ba657d4d956af5f3d0f8` | Rust loopback Luau decompilation service; matching Medal source recovered |
| `erto3e4rortoergn.exe` | `d4d1c829cef7435ec0606ab25b69f343902d699f834b3950c60c50cd60339fc4` | VMProtect/Tempest-packed injector; static entry and dispatcher boundary documented |

No supplied executable was launched during recovery. Runnable PE files and the
original samples are not included in this repository.

## Findings

- The desktop client is an unsigned x64 WPF application distributed as a .NET
  single-file bundle.
- `VelocityApi` retrieves two runtime executables, launches the injector with a
  Roblox PID, and sends base64-encoded Luau through a per-process named pipe.
- Runtime downloads are accepted without a pinned digest or signer check.
- `Decompiler.exe` binds to `127.0.0.1:9002`, decodes base64 Luau bytecode, and
  calls the bundled `luau-lifter`/Medal pipeline.
- The injector is virtualized and packed. Its original injection or anti-cheat
  logic cannot be attributed from the at-rest image; the included output is the
  protector boundary, not claimed original source.

## Layout

| Path | Contents |
| --- | --- |
| `decompiled/Velocity/` | Recovered C#, readable WPF XAML, editor resources, and project files |
| `decompiled/VelocityApi/` | Updater, URL decryption, injector launcher, and named-pipe transport source |
| `reconstruction/` | Raw decompiler XAML retained before mechanical cleanup |
| `runtime/Decompiler/` | Correlated Rust source, metadata, imports, strings, and targeted native pseudocode |
| `runtime/Injector/` | VMProtect identification, imports, metadata, and protected entry/dispatcher output |
| `reports/` | Main executable and runtime-payload reports |
| `evidence/` | Sample hashes and repository provenance |
| `tools/` | Mechanical XAML cleanup and targeted Ghidra export scripts |

The recovered WPF project originally built with .NET SDK 10.0.111. Third-party
PE dependencies and embedded executable tools are deliberately omitted here, so
restore or supply the corresponding dependencies before attempting a rebuild.

## Start here

- [`reports/VELOCITY_RE_REPORT.md`](reports/VELOCITY_RE_REPORT.md)
- [`reports/Velocity_Runtime_Payloads_RE_Report.md`](reports/Velocity_Runtime_Payloads_RE_Report.md)

## Limits

Managed decompilation does not restore comments, original formatting, solution
metadata, or every original local name. VMProtect virtualization prevents a
trustworthy static reconstruction of the injector's protected application code.

