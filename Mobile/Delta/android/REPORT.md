# Delta 2.745.1142: recovered code and native-loader investigation

This pass updates the Android recovery from `2.743.1136` to `2.745.1142`.
The Java/Kotlin source representation, decoded resources, manifest, metadata,
APK-to-APK diff, native registration map, offline traces, and selected Ghidra
pseudocode were regenerated from the supplied APK. These are analysis outputs,
not Delta's original source tree or a buildable Android project.

## Artifacts

- `decompiled/sources/`: 13,371 Java files produced by JADX 1.5.6. JADX
  returned exit code 3 with 113 reported errors; 153 files contain a
  `Method not decompiled` marker and are listed in
  `decompilation-limitations.json`.
- `resources/res/`: Apktool 3.0.3 decoded resources.
- `AndroidManifest.xml` and `apk-metadata.json`: decoded component and signing
  metadata. Cryptographic verification results come from `apksigner`.
- `apk-diff-2.743.1136-to-2.745.1142.{txt,json}`: exact archive-member and
  manifest comparison against the previous recovered build.
- `JNI_OnLoad.c` and `worker.c`: selected Ghidra 12.1.4 pseudocode from the
  current derived native image. Generated types, names, and control flow are
  approximate.
- `jni-registration-map.json`, `unpacked-provenance.json`, and
  `evidence/2.745.1142/native-analysis.json`: current native addresses, hashes,
  patch ranges, and trace conditions.
- `evidence/2.743.1136/`: version-scoped REA evidence retained from the prior
  build; it must not be interpreted as evidence for current addresses.
- `KEY-SYSTEM.md`: key request/decision map and public-source provenance.

## Target identity

Source URL: `https://delta.filenetwork.vip/file/Delta-2.745.1142.apk`

APK size: 167,457,402 bytes

APK SHA-256:
`4d22c8be0f81251d18dc53a49b42a4c27ec64eb1ee039106a33913987027c3f2`

Manifest identity: `com.roblox.client`, label `Roblox`, version `2.745.1142`,
version code `20136`, minimum SDK 26, target SDK 35. The archive contains four
DEX files and eight ARM64 native libraries; no x86 library variant is present.

`apksigner` verifies the APK with v2 and v3. It reports v1, v3.1, v4, and
SourceStamp as false. The single signer certificate has SHA-256
`8d57bfbe5c24e25e74e1faca78ced13d314efcdba2a948f66ecf69d8d051876a`
and subject `CN=Gloopiest Man,OU=Gloop,O=Gloop,L=Berlin,ST=Berlin,C=DE`.
This establishes archive integrity under that certificate; it does not prove
that the APK is an official Roblox release.

## Delta from 2.743.1136

The previous APK has 2,380 members and the current APK has 2,383. Of those,
2,152 members are byte-identical, 215 paths changed, 13 occur only in the old
archive, and 16 occur only in the new archive.

The manifest version changed from `2.743.1136` / `18934` to
`2.745.1142` / `20136`, and
`com.google.firebase.provider.FirebaseInitProvider` was added. Major changed
members include `classes.dex`, `classes2.dex`, `classes3.dex`, `libroblox.so`,
`libzstd-jni-1.5.7-6.so`, Roblox model files, shaders, sprite sheets, and
Halloween 2026 resources. `classes4.dex` remained byte-identical.

The Delta-specific `com.roblox.gloop.Loader` source is byte-identical to the
previous recovery (SHA-256
`1b52da443298bc6dc2e67df8de0d73461d8e5e78d44f7e7c212daf995f2a0795`).
Both integration call sites remain present:

- `com.roblox.client.startup.MainGameActivity.onCreate`
- `com.roblox.client.ActivityNativeMain.onCreate`

Each calls `Loader.get().startLib(this)`. The obfuscated Roblox classes around
the integration were renamed/rebuilt, so paths outside the stable Delta loader
must be treated as version-specific.

## Native recovery

`libzstd-jni-1.5.7-6.so` changed from SHA-256
`372b1d66047b259de4ffac7822a46491fe1b411a44b51011ba427718650b4bee`
to
`fc3fd01754502ee1f001e190e7af2b760378bd20493c370a70f395d67484b554`.
It contains real Zstd JNI exports plus protected Delta code.

The first initializer at ELF-relative address `0x105cac8` decrypts the large
section beginning at `0x5a4b80`, length `0xaad668`. Bounded ARM64 emulation
reached its return without forwarding host syscalls or network access. The
derived analysis ELF has SHA-256
`cf32c479f0580e245138d9e73b9c5eee024c6a4fd7a8dff74d0bef06d8b87244`.
The reconstruction procedure was cross-checked against the previous ELF and
reproduced its recorded derived hash exactly.

The current init array contains 703 entries. Application initializers 4 through
702 completed in the synthetic constant-recovery pass; CPU/C++ locale
initializers 1 through 3 were intentionally skipped. `JNI_OnLoad` at
`0x10521e8` returned JNI version `0x10006` and registered:

| Java class / method | Native address |
| --- | --- |
| `com.roblox.gloop.Loader.nativeStart` | `0x62851c` |
| `com.roblox.gloop.Loader.nativeResize` | `0x61bb3c` |
| `com.roblox.engine.jni.NativeQuoteInterface.requestResponseContinue` | `0x5f66c8` |
| `ek.a0.a(Context, String)` | `0x72aa20` |

`ek.a0` is the current obfuscated name for the fourth registration; it was
`gk.z` in the previous build. `Loader.nativeContext` and
`Loader.getDownloadUrl` remain Java declarations but were not in the observed
registration set. Their absence from this trace does not prove that later
registration is impossible.

The synthetic `nativeStart` trace at `0x62851c` returned zero and deferred
threads at `0xa9ecf4` and `0x76f384`. `JNI_OnLoad` deferred a worker at
`0x608450`; `worker.c` is the current pseudocode for that entry. Its separate
offline trace stopped at an unimplemented syscall zero, as recorded by the
model, so no behavior beyond that point is claimed. The startup trace again
observed external-files/storage setup, Android ID and SDK reads, display
properties, package version checks, `/proc/self/status`, and package probes for
`com.keybypass.bypass`, `com.bypass`, and `com.bypasstools.app`. Emulator and
instrumentation-related strings remain present. These are loader/anti-tamper
observations, not the key decision itself.

## Runtime and key-system leads

Current constructor/startup memory again contains:

- `https://gloop-cdn.pages.dev/versions/`
- `https://gloop-cdn.pages.dev/modules/`
- `libloader.so`, `libgloopmodule.so`, `libgloop.so`, `libroblox.so`
- `shared_cache`, `shared_cache.cache`, `shared_modules`
- the exact `Goober2112/Gloop/scripts/env-additions.lua` runtime source URL

The retained public source snapshot's `scripts/ui/Delta.lua` has SHA-256
`5afd72bce87daea28beb0821a0584263f72492469649f04d5196ea752d8a5dc2`.
It uses PlatoBoost service ID 6, the `api.platorelay.com` primary host and
`api.platoboost.net` fallback, server whitelist/redeem endpoints, a keyless
feature flag, and revalidation of the internal `delta_key` file. There is no
offline key-acceptance algorithm in that source. `KEY-SYSTEM.md` records the
request map and trust boundary; no live key was submitted and no bypass was
attempted.

The public repository is mutable and `Delta.lua` is not an immutable APK asset.
The current APK confirms the exact runtime source relationship, while the
retained source hash identifies the snapshot used for this analysis.

## Scope and limitations

The APK was not installed or launched. Native code ran only in a bounded
Unicorn model with synthetic JNI objects, SDK 35, an all-zero Android ID,
virtual files, deterministic time, and blocked host networking. Unimplemented
operations stop the model. Deferred threads run only when explicitly selected.

Decompiler outputs are lossy representations of optimized and obfuscated
bytecode/native code. JADX's recorded failures, Ghidra warnings, synthetic
environment choices, and selected-path coverage prevent claims of exact source
recovery or full real-device behavior. Original APK and native-library hashes
are retained so every derived claim can be tied back to the supplied artifact.
