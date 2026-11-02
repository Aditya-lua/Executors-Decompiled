# Codex 1.0.2 recovered source

This directory is a best-effort static source recovery of the Codex stable
build supplied as:

`https://cdn.robloxscripts.gg/stable/1.0.2-stable.20261028/dotnet-codex-bootstrapper.exe`

The Windows binaries were not executed. The managed projects were decompiled
with ILSpy 11.2, reconciled with the previously repaired source tree, and
verified with .NET SDK 10.0.403. Both the outer loader and its embedded native
client were analyzed with Ghidra 12.2.

## Contents

- `bootstrapper/` — 115 recovered C# files, 5 XAML files, resources, and a
  reconstructed buildable project.
- `ui/` — 205 recovered C# files, 19 XAML files, resources, and a reconstructed
  buildable project.
- `web-runtime/` — 93 shipped text/source assets. The main minified browser
  bundle is also preserved as a formatted 183,524-line copy.
- `native/` — function inventories and Ghidra C-like pseudocode for the outer
  loader and the extracted native client.
- `evidence/` — hashes, bundle metadata, the 2026-11-02 CDN snapshots, import
  evidence, and the exact principal binaries used for recovery.
- `tools/` — the non-executing .NET bundle extractor and Ghidra export scripts.

## Build verification

From the repository root on a machine with .NET SDK 10:

```sh
dotnet build PC/Codex/bootstrapper/dotnet-codex-bootstrapper.csproj -c Release
dotnet build PC/Codex/ui/dotnet-codex-ui.csproj -c Release
```

Clean Release builds completed with zero errors. The bootstrapper emitted 10
warnings and the UI emitted 116 warnings; WPF's temporary and final compilation
passes duplicate each underlying warning.

## Changes visible in 1.0.2

The recovered update adds a full Roblox launcher/protocol subsystem, launcher
handoff validation, settings for Roblox launch behavior, and selectable update
channels. The live app manifest still lists 133 application files; its layout
is unchanged from the previous snapshot, while the app and current loader have
advanced to `1.0.2-stable.20261028` and `0.745.0.7451137`.

## Authentication finding

This stable UI remains keyless/auth-disabled as shipped.
`AuthModePolicy.BackendEnabled` and `AuthModePolicy.DevModesAllowed` are static
readonly booleans with no initializer or static-constructor assignment, so both
retain the CLR default `false`. `AuthModePolicy.Resolve` consequently selects
`AuthMode.Disabled`. The real/mock/disabled authentication framework and login
UI remain present, but the backend path is disabled in this build.

## Loader and anti-cheat assessment

The outer loader statically imports cross-process memory, section-mapping, and
thread-control APIs, including `OpenProcess`, `VirtualAllocEx`,
`ReadProcessMemory`, `WriteProcessMemory`, `SuspendThread`, `ResumeThread`,
`NtCreateSection`, and `NtMapViewOfSection`. This establishes injection
machinery. It does not by itself prove a specific Hyperion/Byfron evasion
technique, and no literal Hyperion, Byfron, anti-cheat, or bypass marker was
found. Unlike the previously inspected Velocity loader, this loader is not
VMProtect-packed at rest, so substantially more static logic is recoverable;
the available evidence does not show that it uses Velocity's hidden mechanism.

## Limitations

This is recovered source, not the developer's original repository:

- comments, original local-variable names, formatting, solution history, and
  preprocessor context are not recoverable from compiled binaries;
- project files were reconstructed and equivalent package references replace
  ILSpy's machine-specific assembly paths;
- compiler-generated WPF delegates and source-generator attributes were removed
  where the current SDK regenerates them;
- native pseudocode contains inferred names and types and is not lossless or
  expected to compile as original C++;
- the CDN snapshots describe the live stable channel on 2026-11-02.

Use this material only where you are authorized to inspect or modify the
software.
