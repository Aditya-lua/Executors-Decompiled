# Native boundary map — V5 1.6.5 / NEO 2.3.9 (2026-11-01)

Phase 5 cross-layer map for the disguised payload
`lib/arm64-v8a/libzstd-jni-1.5.7-6.so`
(SHA-256 V5 `18fbcb07…44f8e52`, NEO `717b8502…49894f0`, build ID
`04c95d94cc7a50799b3e95637cc468fb07cfcdab`).

## Four states per native

The task distinguishes: **declared in Java**, **exported by name**,
**registered at load**, **observed at runtime**. For this build:

- *Declared in Java* — OBSERVED, citations below.
- *Exported by name* — **none**: the payload's export surface is 148
  `Java_com_github_luben_zstd_*` + `JNI_OnLoad` and nothing else
  (`libzstd-jni-1.5.7-6.so.symbols.txt`, count 149). No `Java_com_axjava_*`
  symbol exists.
- *Registered at load* — DERIVED for the group: `JNI_OnLoad` is the only
  loader entry, and the Java side calls the natives successfully in the
  shipped app, so attachment must happen there; **per-native confirmation and
  implementation addresses are unresolved** (see "How the mapping was
  established").
- *Observed at runtime* — **UNKNOWN**: no device or emulator was used; nothing
  in this analysis observed any native actually executing.

## The table

| # | Java declaration (new-build locator) | JNI name + signature | Native implementation | Observed role | Callers (Java side) |
| --- | --- | --- | --- | --- | --- |
| 1 | `com.axjava.Main.lIIlIIlIIlII(Activity)` — `Main.java:24` | `lIIlIIlIIlII` / `(Landroid/app/Activity;)V` (descriptor read from the Java declaration; the string does not appear in the binary) | registered dynamically, unresolved | native initializer: receives the launching `Activity`, bootstraps the executor inside the Roblox process | `Main.Start` (`Main.java:17`), itself called from `ActivitySplash.onCreate:210` and `MainGameActivity.onCreate:653` |
| 2 | `com.axjava.JNIFunctions.SendButton()` — `JNIFunctions.java:62` | `SendButton` / `()Z` | registered dynamically, unresolved | executor UI button state poll (boolean result) | `JNIFunctions` helper paths |
| 3 | `com.axjava.JNIFunctions.SendParamsToArceus(boolean,int,int,boolean,int)` — `JNIFunctions.java:64` | `SendParamsToArceus` / `(ZIIZI)V` | registered dynamically, unresolved | forwards UI/param state to the native side | `JNIFunctions` helper paths |
| 4 | `com.axjava.JNIFunctions.SendParamsToArceusTouch(int,float,float,int)` — `JNIFunctions.java:66` | `SendParamsToArceusTouch` / `(IFFI)V` | registered dynamically, unresolved | forwards touch input to the native side | `JNIFunctions` helper paths |
| 5 | `com.axjava.JNIFunctions.handleTextInput(String)` — `JNIFunctions.java:68` | `handleTextInput` / `(Ljava/lang/String;)V` | registered dynamically, unresolved | forwards soft-keyboard text to the native side | `JNIFunctions`/`CustomGLSurfaceView` input connection |
| 6 | `com.axjava.AXWebViewController.nativeOnButtonClicked()` — `AXWebViewController.java:63` | `nativeOnButtonClicked` / `()V` | registered dynamically, unresolved | key-system WebView: button-press callback into native | `AXWebViewController$1` JS interface / anonymous bridge classes |
| 7 | `com.axjava.AXWebViewController.nativeOnJsMessage(String)` — `AXWebViewController.java:65` | `nativeOnJsMessage` / `(Ljava/lang/String;)V` | registered dynamically, unresolved | key-system WebView: JS → native message pipe | `AXWebViewController$2`/`$3` bridge |
| 8 | `com.axjava.AXWebViewController.nativeOnPageFinished(String)` — `AXWebViewController.java:67` | `nativeOnPageFinished` / `(Ljava/lang/String;)V` | registered dynamically, unresolved | key-system WebView: page-finished event | WebViewClient shim in `AXWebViewController` |
| 9 | `com.axjava.AXWebViewController.nativeOnPageStarted(String)` — `AXWebViewController.java:69` | `nativeOnPageStarted` / `(Ljava/lang/String;)V` | registered dynamically, unresolved | key-system WebView: page-started event | WebViewClient shim in `AXWebViewController` |
| 10 | `com.axjava.AXWebViewController.nativeOnRedirect(String)` — `AXWebViewController.java:71` | `nativeOnRedirect` / `(Ljava/lang/String;)V` | registered dynamically, unresolved | key-system WebView: redirect event (checkpoint/linkvertise style flows) | WebViewClient shim in `AXWebViewController` |

The reverse direction (native → Java callbacks) cannot be enumerated
statically for this build: those call sites live in the packed `.text`
(see REPORT.md §6.4). The Java-side surface that native code can reach is the
public/annotated surface of `com.axjava` (input, clipboard, files, auto-exec,
network, update installation, key-system WebView), unchanged from the
baseline per the smali identity in REPORT.md §5.6.

## How each mapping was established

| Mapping | Method | Result |
| --- | --- | --- |
| Java declarations (names, signatures, classes) | `grep -rn "native "` over the new JADX export; signatures derived from the Java parameter/return types | 10 natives, exact file:line locators above |
| Exported-by-name check | `readelf --dyn-syms -W` on the extracted payload; count `FUNC` with `Ndx != UND`, classify by prefix | 149 exports, none matching the 10 names |
| Static `JNINativeMethod[]` search | `tools/jni-table-scan.py`: all 16,317 `R_AARCH64_RELATIVE` relocations scanned for `{name-ptr, descriptor-ptr, fn-ptr}` triples with well-formed JNI descriptors | 0 candidates |
| Name strings in binary | `grep` for each of the 10 names in the `-n 4` and `-n 5` string dumps (103,809 / 42,579 lines) | 0 hits |
| `JNI_OnLoad` reachability | Capstone disassembly at the symbol address (0x5e4758) and windowed decode across the whole `.text` | 0 decodable instructions at entry; region entropy 7.975 bits/byte → packed |
| Registration point | `JNI_OnLoad` is the sole loader export (`.dynsym`); ELF `.init_array` order puts the two plaintext packer constructors first | DERIVED: registration happens after unpacking, inside `JNI_OnLoad` |
| Runtime confirmation | — | not performed; static-only pass |

## What would close the remaining column

1. **Dynamic capture** (needs a device/emulator, out of scope here): break on
   `art::JNI::RegisterNativeMethods` or hook `RegisterNatives` during
   `System.loadLibrary("zstd-jni-1.5.7-6")` and dump the table.
2. **Emulated unpacking** (feasible next static step): reverse the
   `.dyncall` engine (7,186 plaintext instructions, 28,744 B), reimplement or
   emulate it with Unicorn over the mapped image, then disassemble the
   restored `JNI_OnLoad` at 0x5e4758 and follow the `RegisterNatives` call.
   The 2,496-byte orchestrator at `.init_array[1]` (0x91cecc) is the entry
   point for that work.
