# Arceus X V5/NEO reverse-engineering report

## Inputs

| Variant | Product version | APK SHA-256 | Native payload SHA-256 |
| --- | --- | --- | --- |
| NEO | 2.3.8 | `6543a41284e148fdbdf90be83fcf97850adc363837e9a308740d4594c940e634` | `1418272a2e3d2ce6891a0ca440490ecc6a9d239ab9cf029481508f79758d71d6` |
| V5 | 1.6.4 | `95316fc159be8a427dbce537e31f5e2027c806912b63fe99125df0eb03fd67c8` | `b3e07a7dac97841eeea48838c4f54b92fb421012b0967689a9028fb6855cb18b` |

Both APKs are 149,297,851 bytes, contain 2,378 ZIP members, identify as
`com.roblox.client`, and carry Roblox version `2.744.1081` (`19426`). Their four
DEX files and `libroblox.so` are byte-identical. The shared Roblox engine
library has SHA-256
`0c68e85475423a37e9605ab024ab3576dd57e5b17689fbf88dbd02241929b93a`.

## Exact variant delta

Only the three JAR-signature members and the native executor file differ. The
two native files are each 9,803,664 bytes long and differ in exactly two bytes:

| File offset | NEO | V5 | ELF section |
| ---: | ---: | ---: | --- |
| `0x956f90` | `0x01` | `0x00` | `.gnu.plt` |
| `0x956f94` | `0x00` | `0x01` | `.gnu.plt` |

`.gnu.plt` is a five-byte writable Android/ELF metadata section. No byte in an
executable section changes. Both files retain the same GNU build ID
`10f2009925a408652690d89cdd7edd5bf70e52df`. This supports treating V5 and NEO
as the same recovered program with different distribution labels/metadata.

Both APKs are signed with the same Android debug certificate (SHA-256
`A4:0D:A8:0A:59:D1:70:CA:A9:50:CF:15:C1:8C:45:4D:47:A3:9B:26:98:9D:8B:64:0E:CD:74:5B:A7:1B:F5:DC`).

## Recovered application path

1. Roblox starts `ActivitySplash` and later `MainGameActivity`.
2. Both modified activities call `com.axjava.Main.Start`.
3. `Main.Start` loads `zstd-jni-1.5.7-6` and invokes the obfuscated native
   initializer `lIIlIIlIIlII(Activity)`.
4. The native library registers the executor's JNI bridge and supplies the
   Luau/executor implementation.
5. Java helpers under `com.axjava` expose input, clipboard, files, auto-exec,
   network requests, update installation, and a key-system WebView to native
   code.

The key public native boundary consists of:

- `Main.lIIlIIlIIlII(Activity)`
- `JNIFunctions.SendButton()`
- `JNIFunctions.SendParamsToArceus(...)`
- `JNIFunctions.SendParamsToArceusTouch(...)`
- `JNIFunctions.handleTextInput(String)`
- five `AXWebViewController.nativeOn*` callbacks

## Coverage

| Layer | Recovery |
| --- | --- |
| DEX | 13,639 Java files plus 27,166 exact smali files across all four DEX files |
| Resources | Decoded manifest, resources, assets, and unknown ZIP payloads |
| Java injection | All eight `com.axjava` Java files recovered with no `Method not decompiled` marker |
| General JADX | 72 unreconstructed methods across 58 files; exact smali retained for all of them |
| Native executor | 898/899 recognized functions emitted as C-like pseudocode; 32,183 recognized instructions exported |
| Native evidence | Complete strings, ELF symbols, sections, header, and relocations |

JADX completed with 113 reported decompilation errors overall. The log is
preserved as `jadx.log`; this number includes pass-level failures beyond the 72
methods that ended with explicit `Method not decompiled` stubs.

Two `com.axjava` type references have no corresponding class definition in any
of the four DEX files: `com.axjava.ClipboardService` and
`com.axjava.JNIFunctions.JNIUtils`. They occur in helper/dead-code paths and are
absent from both the Java view and exact smali inventory; they were not omitted
by this recovery.

## Toolchain

- JADX 1.5.6 with deobfuscation and bad-code display enabled
- Apktool 3.0.3
- Ghidra 12.2 headless analysis/decompiler
- OpenJDK/Temurin 25 for Ghidra
- GNU `readelf`, `strings`, and Python ZIP/hash comparison

## Limits

- This is reconstructed output, not original source or a buildable Android
  Studio project.
- The original APKs and native binaries are excluded from Git; hashes retain
  input provenance.
- `libroblox.so` is a 113,832,184-byte unmodified shared Roblox engine binary,
  not the variant delta, and is represented by its hash rather than committed.
- Native anti-disassembly significantly limits static C reconstruction. The
  included low-level artifacts preserve what Ghidra recognized and make the
  limitation auditable instead of silently inventing source.

