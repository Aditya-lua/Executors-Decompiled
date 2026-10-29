# Delta 2.743.1136: recovered code and native-loader investigation

The Java/Kotlin decompilation and native unpacking are complete for this pass.
The APK establishes the loader path, and an exact public-source reference
recovered from its native heap led to Delta's runtime UI source. That source
resolves the client-side key flow: it uses PlatoBoost service ID 6 and performs
server-side whitelist/redeem checks keyed by a SHA-256 hash of the executor
HWID. There is no offline key-acceptance algorithm in the recovered UI source.

## Artifacts

- `Delta-2.743.1136-decompiled.zip`: decompiled Java, decoded resources, manifest,
  metadata, JNI registration map, and selected native pseudocode.
- `decompiled/sources/`: 13,355 output files. JADX reported 113 errors;
  152 Java files contain at least one `Method not decompiled` marker.
  `decompilation-limitations.json` lists the affected files. These are recovered
  representations, not the original source tree or a buildable project.
- `resources/`: Apktool-decoded manifest/resources; original DEX and native
  libraries are retained separately under `extracted/`.
- `unpacked-analysis.so`: derived analysis-only ELF containing the decrypted
  native code region. `unpacked-provenance.json` records hashes and exact patches.
- `JNI_OnLoad.c`, `worker.c`: Ghidra pseudocode. Much of this code still dispatches
  through obfuscated/virtualized logic; generated names are not original names.
- `emulate_initializer.py`: bounded offline ARM64 analysis harness.
- `*-emulation.json`: recorded imports, JNI calls and synthetic-environment
  assumptions. These are custom emulator traces, not REA Evidence or device logs.
- `package-evidence.json`, `loader-class-evidence.json`,
  `jni-onload-evidence.json`, `worker-evidence.json`: REA Evidence.
- `KEY-SYSTEM.md`: focused key request/decision map and source provenance.
- `public-leads/Gloop/`: public runtime-source repository at pinned commit
  `995434a098be7569426f8870dd742853dbaedddf`.

## Target identity

Source URL: `https://delta.filenetwork.vip/file/Delta-2.743.1136.apk`

APK SHA-256:
`fdb861bea54e5dd3f6de0542369d5a45498d6e65c6dfaf7d60bf1bde5314cce0`

Manifest identity: `com.roblox.client`, label `Roblox`, version `2.743.1136`,
version code `18934`, minimum SDK 26, target SDK 35. The archive contains four
DEX files and eight ARM64 native libraries. There is no x86 library variant.

Parsed v2/v3 certificate SHA-256:
`8d57bfbe5c24e25e74e1faca78ced13d314efcdba2a948f66ecf69d8d051876a`

Certificate subject: `CN=Gloopiest Man,OU=Gloop,O=Gloop,L=Berlin,ST=Berlin,C=DE`.
This is parsed certificate metadata; it does not authenticate the publisher or
establish equivalence to an official Roblox APK. No official baseline comparison
or full cryptographic signature verification was performed.

## Recovered integration path

Both `com.roblox.client.startup.MainGameActivity.onCreate` and
`com.roblox.client.ActivityNativeMain.onCreate` call
`com.roblox.gloop.Loader.get().startLib(this)`.

`Loader.startLib` stores the Activity, keeps its window awake, registers a
layout-change listener, requests storage access, and calls `nativeStart`.
The Loader also exposes Java helpers for opening a URL, reading/writing the
clipboard, displaying toasts, and notifying native code of size changes.
Android 11+ storage access uses the all-files-access Settings intent.

The Zstd loader in `com.github.luben.zstd.util.Native` selects
`libzstd-jni-1.5.7-6.so`. `com.roblox.client.startup.a.r()` invokes `Native.load()`.
That ELF has real Zstd JNI exports and additional obfuscated native machinery.
Its imports include Android graphics APIs and dynamic-library loading.

The ELF's first initializer at RVA `0x1071068` decrypts the region beginning at
`0x5a4b80`, length `0xac1c08`. The original section header labels that region
`.data`; the recovered bytes contain ARM64 code. Offline emulation reached the
initializer's return. Application constant initializers 4 through 700 also
returned in the synthetic model; CPU/C++ locale initializers 1–3 were skipped
for that constant-recovery pass.

The following registrations were observed while emulating `JNI_OnLoad`:

| Java class / method | Native RVA |
| --- | --- |
| `com.roblox.gloop.Loader.nativeStart` | `0x601084` |
| `com.roblox.gloop.Loader.nativeResize` | `0x6186a8` |
| `com.roblox.engine.jni.NativeQuoteInterface.requestResponseContinue` | `0x5f8224` |
| `gk.z.a(Context, String)` | `0x729fa0` |

`NativeQuoteInterface.requestResponse` contains Android Keystore attestation
code. `gk.z` constructs Play Store/market links. Those are distinct observations;
neither establishes Delta's key-system algorithm. `Loader.nativeContext` and
`Loader.getDownloadUrl` exist as Java declarations, but were not in the observed
JNI registration set. Their absence from this trace does not prove they can
never be registered later.

Addresses above are ELF-relative virtual addresses at base zero. Ghidra's
generated pseudocode in this run adds an image base of `0x100000`.

## Module and key-system leads

Recovered constructor-created strings include:

- `https://gloop-cdn.pages.dev/versions/`
- `https://gloop-cdn.pages.dev/modules/`
- `GeebleMafia`, `aarch64`
- `libloader.so`, `libgloopmodule.so`, `libgloop.so`, `libroblox.so`
- `shared_cache`, `shared_cache.cache`, `shared_modules`,
  `gloopversioncache.txt`

The URL strings are present in `constructors-heap.bin` at offsets `0x40` and
`0x70`, with copies at later offsets. The first corresponding C++ string
objects occupy mapped addresses `0x11b9778` and `0x11b9790`.

The `nativeStart` trace reaches Android external-files/storage APIs,
`Settings.Secure.getString` with `android_id`, system-property reads, SDK
selection, and a window-service request. It also tests storage write access
using `.__gloop_perm_check.tmp`. It probes for `com.keybypass.bypass`,
`com.bypass`, and `com.bypasstools.app`, checks `/proc/self/status`, and
tests emulator artifacts associated with MuMu, LDPlayer, and VirtualBox. These
are loader/anti-tamper checks rather than the key decision itself.

The emulated `nativeStart` path now returns successfully and creates background
watchdog/wait routines. Those routines do not reach module acquisition in the
synthetic process state. No module URL suffix or live module response was
recovered, and the two CDN prefixes remain module-delivery leads rather than
key-verification endpoints.

The unpacked heap also contains an exact source URL for
`Goober2112/Gloop/scripts/env-additions.lua`. The referenced public repository
was cloned at commit `995434a098be7569426f8870dd742853dbaedddf`.
`scripts/ui/Delta.lua` (SHA-256
`5afd72bce87daea28beb0821a0584263f72492469649f04d5196ea752d8a5dc2`)
implements the Android key flow:

- primary `https://api.platorelay.com`, fallback
  `https://api.platoboost.net`;
- `POST /public/start` for a get-key URL;
- `GET /public/whitelist/6?identifier=<sha256-hwid>&key=<key>`;
- `POST /public/redeem/6` for submitted values beginning with `KEY_`;
- `GET /public/flag/6?name=keyless`;
- local persistence in the internal file `delta_key`, followed by server
  revalidation on each startup.

The client configures `useNonce = false` and `secret = "NONE"`, leaving its
nonce/response-hash branches inactive. The active decision trusts HTTPS and the
server JSON fields `success` and `data.valid`. This describes validation; no
live key was submitted and no bypass was attempted.

The public repository is a mutable runtime dependency. The APK proves the
source relationship through the exact embedded URL, but `Delta.lua` was not
itself recovered as an immutable APK asset. Generic OpenSSL `key`/`auth`
strings remain unrelated library text and were excluded from the conclusion.

## Scope and limitations

No APK was installed on a phone or emulator, and no live key-validation request
was sent. Native code ran only inside the offline Unicorn model. Host syscalls
and network connections were never forwarded. The model uses synthetic JNI
objects, SDK 35, an all-zero Android ID, virtual paths, missing-file responses,
and synthetic clock readings. Worker threads are deferred unless separately
selected. ELF headers from the supplied `libroblox.so` are mapped for library
lookup; execution of that library is blocked.

These choices allow inspection of selected paths but are not a faithful Android
runtime and do not establish real-device behavior, full coverage, or successful
authentication. Unimplemented operations stop emulation and are recorded.
The original APK and extracted libraries are retained unchanged.
