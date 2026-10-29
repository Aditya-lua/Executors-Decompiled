# Codex 1.0.0 Recovered Source

This archive is a best-effort static source recovery of the Codex build supplied as:

`https://cdn.robloxscripts.gg/stable/1.0.0-stable.20261026/dotnet-codex-bootstrapper.exe`

It was recovered without executing the Windows binaries. The managed projects were decompiled with ILSpy 11.1, repaired only where generated/decompiler artifacts prevented compilation, and verified with .NET SDK 10.0.403. The native client was extracted from the versioned loader and analyzed with Ghidra 11.0.

## What is here

- `bootstrapper/` — 88 recovered C# files, 5 XAML files, resources, and a reconstructed buildable project.
- `ui/` — 201 recovered C# files, 19 XAML files, resources, and a reconstructed buildable project.
- `web-runtime/` — 93 shipped text/source assets. The main minified browser bundle is preserved beside a formatted `index-3093d9a0.pretty.js` copy (183,524 lines).
- `native/` — Ghidra C-like pseudocode and a complete function inventory for the extracted native client.
- `evidence/` — hashes, bundle manifest, CDN manifest snapshot, and the exact binaries needed to reproduce the managed/native recovery.
- `tools/` — the non-executing .NET bundle extractor used for this recovery.

## Build verification

From the respective project directory on a machine with .NET SDK 10:

```sh
dotnet restore
dotnet build -c Release
```

Both reconstructed projects built successfully with zero errors. The bootstrapper produced 4 warnings; the UI produced 110 warnings. Most UI warnings are preserved compiler warnings around original fire-and-forget async calls and decompiled native-interop structs.

## Authentication finding

This exact stable UI build is keyless/auth-disabled as shipped. `AuthModePolicy.BackendEnabled` and `AuthModePolicy.DevModesAllowed` are static readonly booleans with no initializer or static constructor, so both retain the CLR default `false`. `AuthModePolicy.Resolve` consequently selects `AuthMode.Disabled`. The source still contains the real/mock/disabled authentication framework and login UI, but the backend path is disabled in this build.

## Important limitations

This is recovered source, not the developer's original repository:

- comments, original local-variable names, formatting, solution history, and preprocessor context are not recoverable from compiled binaries;
- project files were reconstructed and package references were substituted for ILSpy's absolute assembly hint paths;
- compiler-generated WPF delegates and source-generator attributes were removed where the current SDK correctly regenerates them;
- native C++ cannot be reconstructed exactly. Ghidra output is C-like pseudocode with inferred names/types, not compilable original C++;
- static editor assets are served from an unversioned CDN path. Their principal file sizes matched the initial 2026-10-26 recovery, but the included manifest snapshot was fetched on 2026-10-27 after the live channel advanced to 1.0.1. All four versioned UI binaries remain pinned to 1.0.0 and match the recorded hashes.

Use this material only where you are authorized to inspect or modify the software.
