# Arceus X new-build analysis — V5 1.6.5 / NEO 2.3.9 (2026-11-01)

Static reverse-engineering record for the **new** Arceus X Android pair that
replaces the V5 1.6.4 / NEO 2.3.8 baseline documented in this repository.
Analysed 2026-11-01 from two user-supplied APKs (Google Drive delivery; the
binaries are not and will not be committed).

The version in the folder name combines the two product labels with the
analysis date because the Android `versionName` (2.744.1081, the Roblox client
version) is identical to the baseline build and would not distinguish them.

## What this build is

| Item | V5 | NEO |
| --- | --- | --- |
| Delivered file | `Roblox.-.Arceus.X.v5.1.6.5.apk` | `Roblox.Arceus.X.NEO.2.3.9_clone.apk` |
| Size | 149,232,315 B | 149,203,641 B |
| SHA-256 | `a6580e52226fddd3dd9c7d81d276ce2737c005790dab253c44ef47bd83677a94` | `3c55975d9931641b74eb263efdc66921f71ccbbe383b0c65081cfa1e7b894247` |
| Package (`AndroidManifest.xml`) | `com.roblox.client` | `com.roblox.clienu` (automated rename) |
| versionName / versionCode | 2.744.1081 / 19426 | 2.744.1081 / 19426 |
| ZIP members | 2,378 | 2,378 |
| DEX | 4 files, 27,166 classes | 4 files, 27,166 classes (byte-identical to V5) |

Both are single **monolithic** APKs — no split sets, no asset packs. Both
verify under APK Signature Scheme v2 and v3 with the same Android debug
certificate as the baseline (SHA-256
`A4:0D:A8:0A:59:D1:70:CA:A9:50:CF:15:C1:8C:45:4D:47:A3:9B:26:98:9D:8B:64:0E:CD:74:5B:A7:1B:F5:DC`,
subject `CN=Android, android@android.com`); v1/v3.1/v4/SourceStamp do not
verify. Because that certificate is the public AOSP debug key, "same signer"
is identification of the *key*, not of the distributing party.

Across the pair, 2,372 of 2,378 members are byte-identical. The differences
are the manifest and `resources.arsc` (the `com.roblox.client →
com.roblox.clienu` rename), the JAR signature members (V5 is signed under the
alias `APKEASYT`, NEO under `ANDROID`), and the native payload, which differs
in exactly **two bytes** of `.gnu.plt` — the same distribution-label mechanism
the baseline pair showed. All four DEX files are byte-identical between the
pair, so one Java-layer analysis covers both.

## Headline findings versus the baseline

1. **The Java/DEX layer is byte-for-byte unchanged.** All 27,166 classes of
   the new build decompile (Apktool 3.0.3, same engine as the baseline run)
   to smali byte-identical with the baseline except 5 files whose only
   difference is baksmali's float-comment rendering; every instruction byte
   matches. The injection chain (`ActivitySplash`/`MainGameActivity`
   `onCreate` → `com.axjava.Main.Start` → `System.loadLibrary("zstd-jni-1.5.7-6")`
   → native `lIIlIIlIIlII(Activity)`), all ten `com.axjava` native
   declarations, the key-system WebView, the self-updater and the auto-exec
   plumbing are all exactly where the baseline found them.
2. **`libroblox.so` is byte-identical to the baseline** (SHA-256
   `0c68e85475423a37e9605ab024ab3576dd57e5b17689fbf88dbd02241929b93a`),
   consistent with the identical Roblox version 2.744.1081 (19426). The new
   build is an executor-side update riding the same engine.
3. **All drift is concentrated in the disguised payload**
   `lib/arm64-v8a/libzstd-jni-1.5.7-6.so`: 9,738,112 B (−65,552 B vs
   baseline), new GNU build ID `04c95d94cc7a50799b3e95637cc468fb07cfcdab`
   (baseline `10f2009925a408652690d89cdd7edd5bf70e52df`), rebuilt with the
   *same* rustc nightly (`1.97.0-nightly (7c3c88f42 2026-05-14)`), the same
   Windows build host and the same crate set (`luau-lifter`, `cfg`, `ast`,
   `restructure`, `medal-ffi`, `nom` 7.1.3, `petgraph` rev `b40d963`).
   The Luau-decompiler hypothesis of the baseline therefore still holds —
   same program family, one version bump.
4. **The payload's protection is a runtime-unpacking packer, not just
   anti-disassembly.** `.text` (7,615,104 B) is 100 % opaque on disk
   (uniformly ~7.98 bits/byte entropy; zero linearly decodable 4 KiB blocks;
   even the exported zstd JNI entry points are non-code in the file). The
   plaintext packer machinery lives in the anomalous sections the baseline
   flagged: `.dyncall` (28,744 B, 100 % decodable — direct-syscall trampolines
   plus the unpacking engine, 7,186 instructions, 325 loop back-edges) and
   `.stack` (28 B — three pointer-return thunks, not a stack). `.init_array`
   entries 0 and 1 are the packer's plaintext constructors in `.dyncall` and
   run before the 196 real constructors, which point into the still-packed
   `.text`. The baseline's Ghidra listing shows the same `svc #0` stub pattern
   in the old build's `.dyncall`, so the architecture is continuous, but this
   analysis is the first to identify its role.
5. **The JNI registration table remains unrecoverable statically**, now for a
   stronger reason: the ten `com.axjava` native names never appear in the
   string table, no statically initialised `JNINativeMethod[]` triple exists
   among 16,317 `R_AARCH64_RELATIVE` relocations, and `JNI_OnLoad`
   (0x5e4758, 12,656 B) itself is packed ciphertext in the file.

## Layout

- [`REPORT.md`](REPORT.md) — inputs, packaging and signing, recovered
  application path, row-by-row drift from the baseline, coverage, limitations.
- [`native-boundary.md`](native-boundary.md) — the Phase 5 cross-layer
  boundary map and how each mapping was established.
- [`evidence-index.md`](evidence-index.md) — every claim with a locator and
  the command that reproduces it.
- [`TOOLS.md`](TOOLS.md) — exact tool versions used.

Bulk generated artifacts (apktool/jadx trees, ELF text exports, diff JSON)
live in the git-ignored `work/new/` of the analysing checkout and can be
regenerated with the commands in the evidence index.

## Important limitation

Everything here is static analysis of reconstructed output. The APKs were
never executed, installed or emulated. The NEO file is a package-renamed
*clone* (see the mangled permission name in REPORT.md) supplied via Google
Drive; whether it is SPDM Team's official NEO 2.3.9 artifact or a third-party
re-pack is not establishable from the file alone.
