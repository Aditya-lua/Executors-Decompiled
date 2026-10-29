# Codex 1.0.0 static recovery report

## Scope and result

The supplied 65.8 MiB bootstrapper is a .NET 10 self-contained single-file Windows application. Its bundle is format 6.0, ID `oS9dgImg4il1`, with 231 entries. The recovery produced buildable source for both managed applications, readable source-form copies of shipped editor/runtime text assets, and broad C-like pseudocode for the embedded native client.

No supplied Windows executable or DLL was executed during analysis.

| Component | Recovery | Verification |
|---|---:|---|
| Bootstrapper | 88 C# + 5 XAML files | Release build: 0 errors, 4 warnings |
| Main UI | 201 C# + 19 XAML files | Release build: 0 errors, 110 warnings |
| Editor/language runtime | 93 text/source assets | Main client also formatted to 183,524 lines |
| Native client | 25,896 discovered functions | 25,889 primary successes; 2 more recovered on retry; 5 remain documented failures |

## Version fidelity

The four main UI artifacts were downloaded from the explicitly pinned directory `stable/1.0.0-stable.20261026/`; their SHA-256 values match the initial recovery exactly. During reconstruction on 2026-10-27, the live channel manifest advanced to `1.0.1-stable.20261027`. The included live manifest is therefore evidence of the file layout and package/static dependencies, not a claim that it is the historical 1.0.0 manifest.

The loader entry remained unchanged in the live manifest: Roblox version `0.744.0.7441080`, MD5 `2957e13f36c3cc59e7212268202bdd99`, expected size 9,803,776 bytes. The downloaded loader matches both MD5 and size.

## Managed repairs

The changes made after decompilation are intentionally narrow:

1. Added `RootNamespace`, `EnableWindowsTargeting`, nullable-analysis, and output-type metadata to reconstructed projects.
2. Replaced decompiler-emitted absolute assembly references with equivalent NuGet `PackageReference` items while retaining the old references behind an opt-in property.
3. Simplified one malformed decompiler exception filter in the bootstrapper to the equivalent `StatusCode is 403 or 404` expression.
4. Removed already-expanded `LibraryImport`/`GeneratedRegex` attributes whose generators would otherwise emit duplicate implementations.
5. Removed decompiled WPF `_CreateDelegate` helpers that PresentationBuildTasks correctly regenerates.
6. Qualified one shadowed `System.IO.Directory` call.

These are reconstruction/build fixes, not behavioral feature changes.

## Native extraction and analysis

Two PE images were found inside the loader's large data region. The first is the 9,369,088-byte Codex client DLL; the second is a 65,536-byte Microsoft `dsclient.dll`. The Codex client is not packed and retains Microsoft RTTI, enabling Ghidra to identify some class and namespace structure. No PDB metadata is present.

The pseudocode exporter walked every function Ghidra discovered, including thunks, used an 8-second per-function primary timeout, and preserved failures as comments and CSV status values. A separate 45-second retry pass targeted the seven failures, recovered two more, and retained explicit failure comments for the remaining five. The resulting `.c` files are navigation/analysis aids; they are not lossless C++ and are not expected to compile.

## Authentication behavior

The stable build contains authentication classes and UI, but the build policy disables them. The two readonly policy flags have no initializer and no static constructor assignment, leaving them `false`. `AuthModePolicy.Resolve` immediately returns `AuthMode.Disabled` when `BackendEnabled` is false. This is a property of the shipped build—not a patched bypass added during recovery.

## Reproducibility

`tools/extract_dotnet_bundle.py` extracts the bootstrapper bundle without launching it. `tools/ExportAllDecompiled.java` is the Ghidra post-script used for the native inventory/pseudocode export. Exact hashes for the principal binaries are in `evidence/HASHES.md`.
