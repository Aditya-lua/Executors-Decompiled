# Codex 1.0.2 static recovery report

## Scope and result

The recovered 66.1 MiB bootstrapper is a .NET 10 self-contained single-file
Windows application. Its bundle is format 6.0, ID `ERuoln34UWvJ`, with 231
entries. The recovery produced buildable source for both managed applications,
source-form copies of the shipped editor/runtime assets, and broad C-like
pseudocode for both native PE layers.

No supplied Windows executable or DLL was executed during analysis.

| Component | Recovery | Verification |
|---|---:|---|
| Bootstrapper | 115 C# + 5 XAML files | Release build: 0 errors, 10 warnings |
| Main UI | 205 C# + 19 XAML files | Release build: 0 errors, 116 warnings |
| Editor/language runtime | 93 text/source assets | Main client formatted to 183,524 lines |
| Outer native loader | 326 discovered functions | 323 primary successes; 1 more recovered on retry; 2 documented failures |
| Embedded native client | 33,199 discovered functions | 33,191 primary successes; 2 more recovered on retry; 6 documented failures |

## Version fidelity

The principal managed artifacts are pinned to
`stable/1.0.2-stable.20261028`. On 2026-11-02 the live stable manifest named
loader `0.745.0.7451137`, MD5 `e39804f1e2784adfbeff266b48416f8a`, expected
size 10,881,536 bytes. The downloaded loader matches both MD5 and size.

The manifest retains the preceding `0.744.0.7441080` loader entry for an older
Roblox client and adds the 0.745 entry. Its application-file list contains the
same 133 paths as the prior snapshot.

## Managed recovery and repairs

The new ILSpy output was reconciled with the previously buildable recovery so
that current logic and resources were retained without discarding the earlier
WPF and interop repairs. The post-decompilation changes are reconstruction
fixes, not feature modifications:

1. Retained reconstructed project metadata and portable package references.
2. Removed decompiler-expanded generator attributes that would emit duplicate
   regex implementations.
3. Retained the earlier WPF delegate and native-interop compilation repairs.
4. Reconstructed the settings XAML rows corresponding to the compiled launcher
   and update-channel handlers.
5. Removed one obsolete generated regex class left only by the prior build.

Clean builds with .NET SDK 10.0.403 completed with zero errors. WPF compiles
temporary and final projects, which is why each underlying warning appears
twice in the totals.

## Native extraction

The 0.745 loader contains two PE images:

- `embedded-client.dll` at file offset `0x5b0c0`, size `0x9f1400`
  (10,425,344 bytes);
- `dsclient.dll` at file offset `0xa4c4c0`, size 65,536 bytes.

The embedded client is an unpacked 64-bit PE DLL with Microsoft RTTI and no PDB
metadata. Static evidence identifies Codex executor namespaces and libraries,
Luau, OpenSSL, curl, graphics, and font code. Ghidra 12.2 exported every
discovered function to a CSV inventory and attempted C-like decompilation with
an eight-second primary timeout. A separate 45-second retry pass targeted only
the primary failures.

The outer loader was analyzed separately rather than treating its large
embedded client region as the whole program. Its imports expose remote-process
memory access, thread control, and native section mapping. Those primitives are
consistent with injection, but static imports and strings do not establish a
specific anti-cheat bypass. No literal Hyperion, Byfron, anti-cheat, or bypass
marker was found.

## Authentication behavior

The stable build contains authentication classes and UI, but the compiled
policy disables them. Its two readonly policy flags have no initializer or
static-constructor assignment, leaving them `false`; `AuthModePolicy.Resolve`
therefore selects `AuthMode.Disabled`. This is a property of the shipped build,
not a patch introduced during recovery.

## Reproducibility

`tools/extract_dotnet_bundle.py` extracts the bootstrapper bundle without
launching it. `tools/ExportAllDecompiled.java` creates the native function
inventories and primary pseudocode, and `tools/RetryFailedDecompiled.java`
retries explicitly supplied addresses. Exact hashes and byte counts are in
`evidence/HASHES.md`.
