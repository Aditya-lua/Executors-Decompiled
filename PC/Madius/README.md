# Madius Updater reverse-engineering report

## Scope

Target: `Madius.Updater.exe`

- SHA-256: `b4712d9719a40412cd5bcaebf776b8b62a3bd41d75aca1853a8598a5853f48dc`
- Original size: 24,069,632 bytes
- Format: native Windows PE32+ GUI executable, AMD64, no CLR metadata
- Protector state: the disk image stores zero raw data for the original application sections and keeps the packed/protector payload in later high-entropy sections.

The exact developer source cannot be recovered from a native optimized executable. Comments, original local names, macros, project layout, and some C++ type information are absent. This repository therefore contains the closest recoverable source representation: addressed strings, analysis scripts, reports, and Ghidra C-like pseudocode. Executable binaries are deliberately excluded.

## Acquisition and unpacking

The public Triage analysis for the exact target hash exposed complete mapped-process snapshots. Three were recovered and compared:

| Snapshot | Loaded base | SHA-256 |
|---|---:|---|
| Windows 11, first | `0x7ff70c780000` | `518b12cfd010784a2d141fb9b6de139fdab034b9dc9c413253deadc0a17e7b85` |
| Windows 11, second | `0x7ff70c780000` | `b914a0762599a7eae33b87e5795447adf54f1202a6a175f1b018d0827bc89f2c` |
| Windows 10 | `0x7ff734a70000` | `a1a53c16ce2511a8aa01714a7b2e8c2af45e78ad66f6a65656ef08ab4c4c23f3` |

Each snapshot is exactly `0x2a23000` bytes (44,183,552), matching `SizeOfImage`. The two Windows 11 snapshots have identical code and read-only data; only 196 bytes in `.data` changed. The Windows 10 copy differs mainly in loader relocations and runtime state.

The faithful disk-layout reconstruction is:

- File: `Madius.Updater.unpacked.exe`
- Size: 44,160,512 bytes
- SHA-256: `2b9271a5a54f88712386c452ae87598eaa875a2665d0a7dd1f6b08137e4468e4`
- Loaded image base retained: `0x7ff70c780000`
- Packed entry-point RVA retained: `0x295ecd3`

A second, explicitly non-runnable analysis copy sets the entry point to the
recovered installer routine at RVA `0x27c540`, marks the protector VM sections
non-executable, and disables protector-owned TLS, exception, and load-config
analysis seeds. Its SHA-256 is
`f84b0631283a2a62c9c5c578544549d82fa31d6ce822ea6d3ee2b7c3841c7f91`.
This copy exists only to make recursive static analysis tractable; the faithful
reconstruction above remains the evidence image.

### Restored mapped sections

| Section | RVA | Virtual size | Nonzero bytes | Entropy |
|---|---:|---:|---:|---:|
| `.text` | `0x1000` | `0x391e86` | 3,226,046 | 6.483 |
| `.rdata` | `0x393000` | `0xd3308` | 650,423 | 6.359 |
| `.data` | `0x467000` | `0x35618` | 164,902 | 6.089 |
| `.pdata` | `0x49d000` | `0x1c7c4` | 116,198 | 7.997 |
| `.tls` | `0x4ba000` | `0x148` | 1 | 0.030 |
| `.n5u` | `0x4bb000` | `0xe71903` | 13,969,084 | 7.494 |
| `.]%8` | `0x132d000` | `0x360` | 220 | 1.870 |
| `.(hX` | `0x132e000` | `0x16e6ee4` | 23,169,298 | 7.811 |

The emulator-only dump kept the first six sections entirely zero. The Triage memory image is the first artifact in this analysis that restores real application bytes.

## Recovered application evidence

The restored `.text` contains normal compiled x64 application code. Direct RIP-relative references identify a large installer/UI function beginning near `0x7ff70c9fc540`. Its referenced application strings include:

- `Madius Installer`
- `Run Madius`
- `2026 @ Madius`
- `Enter your key to download and install.`
- `Getting you a key`
- `Authenticating`
- `Use 'run_madius.bat' to launch the overlay. Do not rename the other executable.`
- `You have already one Madius Updater open!`
- `MadiusUpdaterLock`
- `Madius/Logs/{}-{}.log`
- `https://madius.dev`

Build and library evidence includes:

- Developer path: `E:/Projects/Dittoternal/RbxCli.Common/Process.cpp`
- Internal type: `RbxCli::Process::GetBaseAddress`
- Internal type: `AssetProgress@Updater@RbxCli`
- Dear ImGui 1.92.1
- CPR/libcurl networking
- `cpptrace`, `spdlog`, Zlib, JSON and formatting support
- D3D11/DWM overlay rendering dependencies
- Runtime UI/application identifiers `MADIUS-0589` and `MADIUS-0146`

The string-xref cluster and static libraries indicate that the updater and at least part of the overlay/bootstrap logic are statically linked into this native image.

### Recovered installer state machine

Focused decompilation of the function at `0x7ff70c9fc540` produced 1,598 lines
of C-like pseudocode. A global state value at `0x7ff70cbed108` drives six UI
states:

| State | Visible behavior |
|---:|---|
| 0 | Key entry: “Enter your key to download and install”, `Continue`, `Get Key`; rejects keys longer than 36 characters. |
| 1 | “Getting you a key”, with `Cancel`. |
| 2 | “Authenticating” / “please wait...”. |
| 3 | “Installing” / “working...”, including an asset list/progress area. |
| 4 | “Installation complete”; instructs the user to use `run_madius.bat` and offers `Run Madius`. |
| 5 | “Something went wrong”, with `Retry`. |

The `Run Madius` branch constructs the UTF-16 filename `run_madius.bat` and
dispatches it through an indirect helper. The footer opens
`https://madius.dev` when activated. Some indirect calls still resolve into the
protector region, so call names and precise API-level semantics remain
partially obscured.

### Decompiled corpus

Two timed Ghidra discovery passes were merged by function entry address, with
the cleaner pass preferred and the focused installer decompile taking highest
priority. The resulting corpus contains:

- 3,204 unique `.text` function files
- 152,658 lines in the combined `all_functions.c`
- Combined-source SHA-256:
  `aab98ca037489234e8a27a36cc3f2fc7fe40734a5fc2a61d78a3aedfc8b7d894`
- An address/source/SHA-256 index in `manifest.tsv`

This is a best-effort pseudocode corpus rather than the original developer
project. Some small functions may be missed where the protector destroyed call
boundaries, while optimized static-library code accounts for a substantial
part of the recovered function count.

## Embedded Intel NAL driver

A structurally valid, signed native driver was extracted from mapped RVA/offset `0x3c7350`:

- Output: `embedded_003c7350_4429f32db1cc.sys`
- SHA-256: `4429f32db1cc70567919d7d47b844a91cf1329a6cd116f582305f3b7b60cd60b`
- Product: Intel(R) Network Adapter Diagnostic Driver
- Original filename: `iQVW64.SYS`
- Version: `1.03.0.7 built by: WinDDK`
- Build timestamp: `0x5284eac3`
- Certificate table: file offset `0x6800`, size `0x1f08`

The image contains `\\.\Nal`, `\Device\Nal`, kernel/user memory-copy IOCTL handlers, physical-memory mapping routines, and the original path `...\iqvw64e.pdb`.

Intel identifies pre-1.3.1.0 versions of this diagnostics driver as affected by CVE-2015-2291. The exact extracted SHA-256 is also catalogued publicly as a vulnerable driver. This is consistent with a bring-your-own-vulnerable-driver mechanism used to obtain privileged memory access. No driver or target executable was run natively during this analysis.

References:

- https://www.intel.com/content/www/us/en/security-center/advisory/intel-sa-00051.html
- https://nvd.nist.gov/vuln/detail/CVE-2015-2291
- https://www.loldrivers.io/drivers/1d2cdef1-de44-4849-80e5-e2fa288df681/

## Behavioral-report qualification

The Windows 10 Triage task was marked `user interaction: yes`. Its Chrome/MediaFire activity is the analyst downloading the submitted sample and must not be attributed to Madius. The useful artifacts from that task are the process-memory snapshots and API telemetry. The Windows 11 task isolates the updater process more cleanly.

## Static capability results

Capa recognizes the reconstructed image as AMD64 Windows PE and finds:

- embedded PE content
- a TLS section
- PDB/build-path strings
- Zlib linkage
- Base64-related material
- loop structures

The protector-rewritten import directory exposes only one representative symbol per DLL, so import-based capability matching is intentionally incomplete.

## Deliverables

- `src/functions/` — 3,204 individually addressed pseudocode functions.
- `src/all_functions.c` — combined 152,658-line pseudocode listing.
- `src/manifest.tsv` — function address, source-pass, and SHA-256 index.
- `data/restored-strings.tsv` — addressed ASCII/UTF-16 string corpus.
- `analysis/` — PE rebuilding, string/payload extraction, source merging, emulation, and tracing scripts.
- `analysis/ghidra/` — Ghidra analyzer-control and decompiler-export scripts.
- `reports/` — capa, reconstruction, merge, and embedded-driver metadata.

The memory dumps, reconstructed executable images, and extracted driver are not
stored in this repository. Their hashes remain in this report so evidence can
be verified without distributing executable artifacts alongside the source.

## Remaining limitation

The protector entry point, custom import indirection, and high-entropy VM sections remain present around the restored application. The useful native application code is nevertheless available in `.text`, referenced application data is restored, and the embedded driver is exact. Decompiled C is an approximation and is not buildable without manual type recovery and reconstruction of the original project.
