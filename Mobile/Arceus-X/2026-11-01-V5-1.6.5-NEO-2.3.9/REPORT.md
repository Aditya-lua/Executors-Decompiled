# Reverse-engineering report — Arceus X V5 1.6.5 / NEO 2.3.9 (2026-11-01)

All statements carry one of three statuses: **OBSERVED** (backed by a byte,
string or symbol with a locator in [`evidence-index.md`](evidence-index.md)),
**DERIVED** (reasoning over observations), or **UNKNOWN**. Decompiler output is
a reconstruction, never vendor source. Static analysis only: nothing was
executed, installed or emulated.

## 1. Inputs and provenance

| Field | V5 | NEO |
| --- | --- | --- |
| Delivered name | `Roblox.-.Arceus.X.v5.1.6.5.apk` | `Roblox.Arceus.X.NEO.2.3.9_clone.apk` |
| Size (B) | 149,232,315 | 149,203,641 |
| SHA-256 | `a6580e52226fddd3dd9c7d81d276ce2737c005790dab253c44ef47bd83677a94` | `3c55975d9931641b74eb263efdc66921f71ccbbe383b0c65081cfa1e7b894247` |
| Delivery | user-supplied Google Drive folder `1ht9t3io2wSz_Zo__eQRbDOSgQGB1ru2y`, fetched 2026-11-01 through the "download warning" confirm flow | same |

Delivery shape: **two single, monolithic APKs**. OBSERVED: no
`split_config*.apk`, no asset packs, no `.xapk`/`.apks`/`.apkm` container
(member listing per evidence index E1). Both APKs contain `lib/arm64-v8a/`
only (single ABI).

Provenance caveat (DERIVED): the NEO file name carries `_clone` and its
manifest shows an automated package rename with a malformed permission mashup
(§4). It is a renamed copy of the same program as V5, not necessarily SPDM
Team's official NEO 2.3.9 distribution artifact.

## 2. Identity and signing

- Package: `com.roblox.client` (V5) / `com.roblox.clienu` (NEO). OBSERVED.
- versionName 2.744.1081, versionCode 19426 (both). OBSERVED.
- SDK: min 26, target 35 (both). OBSERVED.
- DEX: 4 files, 27,166 classes, 143,447 methods (both). OBSERVED.
- Components: 25 activities, 19 services, 20 receivers, 7 providers; 31
  permissions (both). OBSERVED.
- Signature: both verify v2 + v3, single signer, certificate SHA-256
  `A4:0D:A8:0A:59:D1:70:CA:A9:50:CF:15:C1:8C:45:4D:47:A3:9B:26:98:9D:8B:64:0E:CD:74:5B:A7:1B:F5:DC`,
  subject `CN=Android, OU=Android, O=Android, L=Mountain View, ST=California, C=US`,
  email `android@android.com` — the public AOSP debug certificate, identical to
  the baseline. v1, v3.1, v4 and SourceStamp do not verify. OBSERVED.
- JAR-signature member names: V5 `META-INF/APKEASYT.RSA`/`.SF`, NEO
  `META-INF/ANDROID.RSA`/`.SF` (baseline used `ANDROIDD` for both variants).
  The alias names evidence a re-signing step; the certificate itself is the
  shared debug key, so it does not identify the signer. OBSERVED + DERIVED.

## 3. Packaging, obfuscation fingerprints, manifest

- APKiD 3.2.0 (heuristic, low confidence by the tool's own nature): APK-level
  "packer: DexGuard"; per-DEX "compiler: dexlib 2.x", "protector: Play
  Integrity API", anti-debug (`Debug.isDebuggerConnected`) and anti-VM
  (`Build.*`, `ro.kernel.qemu`, …) markers; the three large `.so` files match
  "anti_hook: syscalls". No baseline apkid output exists in the repository, so
  old-vs-new fingerprint drift is UNKNOWN. OBSERVED (as heuristic output).
- Quark 26.10.1 with the 280-rule set on V5: 280 matched behaviours, 105 at
  ≥80 % confidence — noise-level scoring for a 27 k-class application; the
  highest-confidence hits are generic (reflection, background services,
  ContentResolver queries). OBSERVED (as heuristic output).
- ZIP hygiene: no duplicate or shadowed members; `unknown/` decodes to
  standard Firebase/Play-services/Kotlin metadata; a handful of extensionless
  members are AppsFlyer internal assets and a billing raw resource. OBSERVED.
- Manifest: `allowBackup="true"`, `networkSecurityConfig=@xml/network_security_config`,
  no `debuggable`/`usesCleartextTraffic`/`extractNativeLibs` attributes
  (defaults apply). `<queries>` covers AppsFlyer installer provider and
  CustomTabs. Notable permissions: `REQUEST_INSTALL_PACKAGES`,
  `MANAGE_EXTERNAL_STORAGE` (both tie to the executor's self-updater and
  storage-gate behaviour). OBSERVED.
- V5↔NEO member delta: 2,372 identical; changed `AndroidManifest.xml`,
  `META-INF/MANIFEST.MF`, `resources.arsc`, and
  `lib/arm64-v8a/libzstd-jni-1.5.7-6.so` (2 bytes, both in `.gnu.plt`:
  `0x946f80` and `0x946f84`, values swapped `0x00/0x01`); signature members
  renamed as above. All four `classes*.dex` are byte-identical. OBSERVED
  (`tools/apk-diff.py`).

## 4. The NEO clone surgery (why the package differs)

NEO's manifest renames the application id `com.roblox.client →
com.roblox.clienu` and rewrites permission names that begin with the old
package. The Samsung mapsagent permission became the malformed
`com.roblox.clienu_com.samsung.android.mapsagent.permission.READ_APP_INFO`
(V5 declares `com.samsung.android.mapsagent.permission.READ_APP_INFO`), and
the generated androidx permission became
`com.roblox.clienu.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`. OBSERVED.
DERIVED: an automated clone tool prefixed the new package onto the permission
string; the mangled name is a fingerprint of that tool. Because the DEX is
unchanged, all classes (including `com.roblox.client.*` components) keep
their fully-qualified names and the app id change is cosmetic for analysis.

## 5. Java/DEX layer and injection point

Verified by behaviour, then by bytecode diff against the baseline's committed
smali (same Apktool 3.0.3 engine, deterministic output):

1. Injection points: `com.roblox.client.startup.ActivitySplash.onCreate`
   (first statement, `ActivitySplash.java:210` in the new JADX tree) and
   `com.roblox.client.startup.MainGameActivity.onCreate`
   (`MainGameActivity.java:653`) both call `com.axjava.Main.Start(this)`.
2. `Main.Start` (`Main.java:15-22`) calls
   `System.loadLibrary("zstd-jni-1.5.7-6")` (`Main.java:16`), then the native
   initializer `lIIlIIlIIlII((Activity) context)` (`Main.java:24`), then
   installs `CrashHandler` and the storage-permission gate `Main.b`
   (`WRITE_EXTERNAL_STORAGE` request + all-files-access intent on API 30+).
3. The ten executor-side native declarations are unchanged: `Main.lIIlIIlIIlII`,
   `JNIFunctions.SendButton`, `JNIFunctions.SendParamsToArceus`,
   `JNIFunctions.SendParamsToArceusTouch`, `JNIFunctions.handleTextInput`,
   and `AXWebViewController.nativeOn{ButtonClicked,JsMessage,PageFinished,PageStarted,Redirect}`.
4. Helper surface unchanged: key-system WebView with
   `addJavascriptInterface` (`AXWebViewController.java:110-111`, "Auto
   Complete Key system" button at `:80`), APK self-updater
   (`application/vnd.android.package-archive`, `JNIFunctions.java:762`),
   `autoexec` directory plumbing (`JNIFunctions.java:524`), external-storage
   paths (`:143`, `:149`).
5. Old `com.axjava` names survive in full. Java-level diff against the
   baseline `Shared/jadx/sources/com/axjava/` shows naming-only differences
   caused by the baseline run using JADX `--deobf` (e.g. `m8975b` vs `b`,
   `RunnableC1857a` vs `a`, `C1862R` vs `R`); the smali diff proves the
   bytecode identical.
6. **Bytecode identity**: of 27,166 smali files, 27,161 are byte-identical to
   the baseline; the 5 differing files
   (`com/appsflyer/internal/AFj1dSDK.smali`, `w7/d.smali`, `fm/g$a.smali`,
   two Persona SDK classes) differ only in baksmali's float-literal *comments*
   — all 82 differing lines have identical instruction bytes before the `#`.
   OBSERVED (script in evidence index E12). The new build's DEX is the same
   program as the baseline's at bytecode level.

JADX 1.5.6 exported 13,639 Java files with 113 errors — the same file count
and error count as the baseline run. OBSERVED.

## 6. Native payload — `libzstd-jni-1.5.7-6.so`

SHA-256: V5 `18fbcb072e3b806cd84b2ae4e57c147bbfc4ac4a465e8bfce6feee28f44f8e52`,
NEO `717b85020a9b858f48160dd44db290ca8c48149fb383336cad961065d49894f0`;
9,738,112 B each; GNU build ID (both)
`04c95d94cc7a50799b3e95637cc468fb07cfcdab`.

### 6.1 Disguise and export surface

Same disguise as the baseline: the file claims to be the zstd JNI wrapper but
carries the executor. Exported `FUNC` symbols with `Ndx != UND`: **149** = 148
`Java_com_github_luben_zstd_*` + 1 `JNI_OnLoad` (0x5e4758, 12,656 B;
baseline 0x5f48f4, 13,184 B). `Java_com_axjava_*` exports: **0**. The export
name set is identical to the baseline's; `.dynsym`/`.dynstr` section sizes are
byte-for-byte unchanged (9,504 / 11,464 B). OBSERVED.

### 6.2 Section drift

| Section | Baseline (B) | New (B) | Delta |
| --- | ---: | ---: | ---: |
| `.text` (AX) | 7,678,576 | 7,615,104 | −63,472 |
| `.dyncall` (AX) | 28,876 | 28,744 | −132 |
| `.stack` (AX) | 28 | 28 | 0 |
| `.plt` (AX) | 3,936 | 3,936 | 0 |
| `.rodata` | 637,884 | 637,948 | **+64** |
| `.eh_frame` | 524,596 | 523,588 | −1,008 |
| `.gcc_except_table` | 229,540 | 229,144 | −396 |
| `.rela.dyn` | 392,424 | 392,136 | −288 |
| `.data.rel.ro` | 154,848 | 154,752 | −96 |
| `.bss` | 74,008 | 73,800 | −208 |
| `.gnu.plt` (WAo, 5 B) | 5 | 5 | 0 |

Every code-bearing section shrank; the only growth is 64 B of `.rodata`.
The V5/NEO label bytes live at file offsets `0x946f80`/`0x946f84` inside
`.gnu.plt` (baseline pair: `0x956f90`/`0x956f94`). OBSERVED.

### 6.3 What the payload is

Same answer as the baseline, same evidence classes: a Rust `cdylib` built by
rustc `1.97.0-nightly (7c3c88f42 2026-05-14)` (`.comment`; the `/rustc/7c3c88f42…/`
paths in the string dump match the baseline's nightly hash), linked with LLD
14.0.6 / NDK r25b, with prebuilt clang-7/9/11/14/17(+pgo+bolt+lto) objects
from statically linked dependencies. Build host `C:\Users\ciaon\…` as before.
Compiled-in crate set from panic paths: `luau-lifter` (deserializer → lifter),
`cfg` (SSA), `ast` (formatter), `restructure` (loops/conditionals/jumps),
`medal-ffi` — plus `nom-7.1.3` and `petgraph` git rev `b40d963`. The census is
identical to the baseline's, string-for-string. OBSERVED.

The string surface is likewise unchanged where it is classifiable: identical
unique-URL sets (6), identical Rust source-path sets, identical vocabulary
counts (`Luau` 58, `luau` 7, `medal` 1, `version` 31; no `Arceus`,
`getgenv`, `hookfunction` or `whitelist` strings in either build).
DERIVED: the Luau-decompiler hypothesis of the baseline (deserializer →
CFG/SSA → structurer → AST/formatter, `medal-ffi` as the FFI boundary) is
uncontradicted and remains the best-supported reading; it is still not
runtime-confirmed.

### 6.4 The protection: a runtime-unpacking architecture

This is the main new characterisation of this pass (OBSERVED for the new
build; the same `svc #0` stubs are visible in the baseline's committed Ghidra
listing at shifted addresses, so the architecture is DERIVED to be continuous):

- `.text` is uniformly packed: every 4 KiB block of the 7,615,104-byte section
  is high-entropy (~7.97–7.99 bits/byte) and yields no linearly decodable
  window; zero blocks classify as code. Even the file bytes at the exported
  zstd JNI entry points are not valid instructions — the export addresses only
  become executable after in-memory restoration.
- `.dyncall` (0x91687c, 28,744 B) is the plaintext engine: 7,186/7,186
  instructions decode cleanly; it contains direct-syscall trampolines
  (`mov x9,x1; mov x8,x0; mov x0,x9; mov x1,x2; mov x2,x3; svc #0; ret`),
  325 loop back-edges and 200 `eor` instructions. `svc #0` sites: 10.
- `.stack` (0x916860, 28 B) is three `adrp/add/ret` thunks returning pointers
  into the 0x953148/0x953150 data slots — not a stack.
- `.init_array` has 198 relocated entries. Entries [0] (0x91d890) and [1]
  (0x91cecc, 2,496 B) are plaintext in `.dyncall`; [1] has a full prologue,
  reads TLS, calls both `.stack` thunks and ends in an indirect `blr` into a
  runtime-resolved pointer — the unpacking orchestrator. The remaining 196
  entries point into the packed `.text` and can only execute after
  restoration. OBSERVED.
- `.plt`, `.got`, `.dynamic`, relocation tables and `.rodata` are standard and
  plaintext, so dynamic linking and string analysis work normally.
- No standard container compression magic is present (no zstd/lz4/xz frame
  headers anywhere in the file); the transform is implemented by the
  `.dyncall` engine. ChaCha sigma, AES S-box (+inverse), SHA-256 and MD5
  constants are present in the binary; whether they belong to the packer, to
  statically linked curl, or to Rust dependencies is UNKNOWN. OBSERVED where
  stated.

Consequences: static recovery of `JNI_OnLoad` and of the `RegisterNatives`
table requires either defeating the packer (reverse the `.dyncall` engine and
run/emulate it) or dynamic capture on a device. Both are out of scope for
this static pass and listed as open work.

### 6.5 Native binding recovery attempt

- The ten `com.axjava` native names appear **nowhere** in the 103,809-line
  `-n 4` string dump. OBSERVED.
- A scan of all 16,317 `R_AARCH64_RELATIVE` relocations for consecutive
  `{rodata-name, rodata-descriptor, text-fn}` triples found **zero**
  candidates → no statically initialised `JNINativeMethod[]`. OBSERVED
  (`tools/jni-table-scan.py`).
- `JNI_OnLoad` is packed ciphertext like the rest of `.text`. OBSERVED.

Conclusion (DERIVED): registration happens at load time from `JNI_OnLoad`
with names built or decrypted in memory, exactly as the baseline inferred —
but now with the packer identified as the reason. Implementation addresses
are **unresolved**.

## 7. Drift table versus the baseline, row by row

| Item | Old (V5 1.6.4 / NEO 2.3.8) | New (V5 1.6.5 / NEO 2.3.9) | Drift |
| --- | --- | --- | --- |
| Package | `com.roblox.client` (both) | `com.roblox.client` / `com.roblox.clienu` | NEO renamed (clone tool) |
| Roblox version | 2.744.1081 (19426) | 2.744.1081 (19426) | none |
| APK size | 149,297,851 B | 149,232,315 / 149,203,641 B | −65,536 / −94,210 B |
| Members | 2,378 | 2,378 | none |
| DEX bytecode | — (baseline) | 100 % identical to baseline | none |
| Signer cert | AOSP debug `A4:0D:A8:…` | same cert; v2+v3 verify (v1 not) | cert unchanged; scheme status newly recorded; baseline scheme status UNKNOWN |
| Signature alias | `ANDROIDD` (both) | `APKEASYT` (V5) / `ANDROID` (NEO) | changed — re-signing step |
| `libroblox.so` | `0c68e854…29b93a` | `0c68e854…29b93a` (byte-identical) | none |
| Payload file name | `libzstd-jni-1.5.7-6.so` | same | none (disguise retained) |
| Payload size | 9,803,664 B | 9,738,112 B | −65,552 B |
| Payload build ID | `10f20099…52df` | `04c95d94…cdab` | changed (rebuild) |
| Payload exports | 148 zstd + `JNI_OnLoad`; 0 `Java_com_axjava` | same, same addresses shifted, `JNI_OnLoad` 13,184 → 12,656 B | surface unchanged |
| Rust toolchain | `7c3c88f42…` nightly | `1.97.0-nightly (7c3c88f42 2026-05-14)` | same nightly |
| Build host | `C:\Users\ciaon\` | same | none |
| Crates | luau-lifter/cfg/ast/restructure/medal-ffi + nom 7.1.3 + petgraph `b40d963` | identical census | none |
| Anomalous sections | `.dyncall` 0x70cc, `.stack` 0x1c (both AX) | `.dyncall` 0x7048, `.stack` 0x1c (both AX) | retained; role now identified |
| Java natives | 10 under `com.axjava` | same 10, same signatures | none |
| Injection point | splash/game `onCreate` → `Main.Start` → `loadLibrary` | same | none |
| V5↔NEO delta | 2 bytes `.gnu.plt` @0x956f90/94 | 2 bytes `.gnu.plt` @0x946f80/84 | same mechanism, new offsets |
| JNI registration | unresolved (dynamic) | unresolved (dynamic; reason identified: packer) | still open |

## 8. Coverage

| Layer | Recovery |
| --- | --- |
| DEX | 27,166/27,166 classes; 100 % smali (Apktool 3.0.3); 13,639 Java files (JADX 1.5.6, 113 errors — identical count to baseline) |
| Resources | full apktool decode of V5; manifest/permission/component inventory; `unknown/` and ZIP-hygiene census; NEO delta via `apk-diff.py` |
| Native — symbols/sections/strings | 100 % (readelf/strings exports, both `-n 4` and `-n 5`) |
| Native — plaintext engine | `.dyncall` + `.stack` + `.plt` + `.init_array[0..1]` disassembled (Capstone), 100 % decodable |
| Native — packed `.text` | 0 % linearly decodable; bounded and characterised, not lifted |
| Runtime | none — no device, no emulator; every runtime claim is UNKNOWN |

## 9. Limitations

- Static-only pass. The APKs were never executed, installed or uploaded
  anywhere; all behavioural statements are code-level, not observed runs.
- The packed `.text` (99.2 % of the payload's code bytes) was not lifted.
  Defeating it needs the `.dyncall` engine reversed or a device; until then,
  `JNI_OnLoad`'s body, the `RegisterNatives` table and every function body
  inside `.text` are UNKNOWN beyond their symbol-table shells.
- No Ghidra pass on the new payload: the region of interest is packed, so a
  headless run would reproduce the baseline's `halt_baddata` experience
  without adding information. Recorded as a deliberate scope cut, not an
  oversight. (The baseline's Ghidra addresses are shifted `+0x100000`; that
  mapping was re-verified against the old listing's `svc #0` stubs.)
- APKiD and Quark outputs are heuristics; absence of a fingerprint is not
  evidence of absence of protection, and their "DexGuard"/"Play Integrity"
  tags are not corroborated here.
- The NEO artifact is a renamed clone of uncertain provenance; the official
  NEO 2.3.9 packaging may differ (signature alias, manifest polish).
- JADX variable naming differs from the baseline export because the baseline
  used `--deobf`; smali-level identity is the authoritative comparison.
- The 64-byte `.rodata` growth and the `.text` shrink are measured but not
  explained; attributing them to specific source changes requires the packed
  code.

## 10. Open questions

1. What exact cipher/transform does the `.dyncall` engine apply, and where is
   the key material? (Falsifiable: reverse `init_array[1]` and the engine
   loops, or dump post-unpack memory on a device.)
2. What are the ten `RegisterNatives` entries (names, signatures, addresses)?
   (Falsifiable: hook `RegisterNatives` at load, or emulate `JNI_OnLoad`
   after unpacking.)
3. Which bytes grew in `.rodata`, and do they correspond to new executor
   features in 1.6.5/2.3.9? (Falsifiable: byte-diff `.rodata` against the
   baseline payload — requires the baseline binary, which the repository does
   not carry.)
4. Is the on-disk `.text` transform deterministic across builds (would make
   the V5/NEO 2-byte label the *only* code difference)? (Falsifiable: defeat
   the packer once, diff unpacked images.)
