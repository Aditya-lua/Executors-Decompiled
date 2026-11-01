# Evidence index — V5 1.6.5 / NEO 2.3.9 (2026-11-01)

One row per claim class: finding → locator → reproducing command. Commands
assume the repository root as working directory, the toolchain activated
(`source tools/env.sh` with `RE_ROOT` pointing at the installation), and the
two delivered APKs present under `work/incoming/` (the binaries are
user-supplied and not committed; their SHA-256 values are in
[REPORT.md](REPORT.md) §1). Generated bulk artifacts live under `work/new/`
(git-ignored). `V5`/`NEO` below stand for the two input paths:

```
V5=work/incoming/Roblox.-.Arceus.X.v5.1.6.5.apk
NEO=work/incoming/Roblox.Arceus.X.NEO.2.3.9_clone.apk
```

| # | Finding (status) | Locator | Reproducing command |
| --- | --- | --- | --- |
| E1 | Delivery = two single monolithic APKs, 2,378 members each, `lib/arm64-v8a` only, no splits (OBSERVED) | `work/new/*/meta.json` | `unzip -l $V5 \| tail -1`; `unzip -l $V5 \| awk '{print $4}' \| grep '^lib/'` |
| E2 | Input hashes (OBSERVED) | REPORT.md §1 | `sha256sum work/incoming/*.apk` |
| E3 | Identity: packages, versions, SDKs, DEX/class counts, components, ABIs (OBSERVED) | `work/new/v5/meta.json`, `work/new/neo/meta.json` | `python3 tools/apk-meta.py $V5 --json work/new/v5/meta.json` (repeat for NEO) |
| E4 | Signature schemes v2+v3 verify, v1/v3.1/v4/SourceStamp do not; single signer; AOSP debug cert SHA-256 `A4:0D:A8:…` (OBSERVED) | `work/new/v5/signatures.txt` (run output) | `apksigner verify --verbose --print-certs $V5` |
| E5 | Pair delta: 2,372 identical members; changed = manifest, `MANIFEST.MF`, `resources.arsc`, payload `.so`; signature aliases `APKEASYT` vs `ANDROID`; all four DEX identical (OBSERVED) | `work/new/newpair-diff.json` | `python3 tools/apk-diff.py $V5 $NEO --json work/new/newpair-diff.json` |
| E6 | Payload pair differs in exactly 2 bytes, both `.gnu.plt`, offsets `0x946f80`/`0x946f84`, values `0x00↔0x01` (OBSERVED) | `work/new/newpair-diff.json` `changed_members[2].byte_diff` | as E5 (the tool prints the offsets and section mapping) |
| E7 | NEO clone surgery: package `com.roblox.clienu`; mangled permission `com.roblox.clienu_com.samsung.android.mapsagent.permission.READ_APP_INFO`; renamed dynamic-receiver permission (OBSERVED) | `work/new/newpair-diff.json` `manifest_diff.permissions.set` | as E5; or decode both manifests with apktool and diff |
| E8 | APKiD heuristics: "DexGuard" packer tag, dexlib 2.x compiler, Play Integrity protector tag, anti-debug/anti-VM markers (OBSERVED as heuristic output) | `work/new/v5/apkid.txt` (session run) | `apkid $V5` |
| E9 | Quark: 280 behaviours, 105 ≥80 % (OBSERVED as heuristic output) | `work/new/v5/quark.json` | `quark -a $V5 -r $RE_ROOT/home/.quark-engine/quark-rules/rules -o work/new/v5/quark.json` |
| E10 | Manifest: `allowBackup=true`, `networkSecurityConfig=@xml/...`, no `debuggable`; `REQUEST_INSTALL_PACKAGES`, `MANAGE_EXTERNAL_STORAGE`; queries = AppsFlyer/CustomTabs (OBSERVED) | `work/new/v5/apktool/AndroidManifest.xml` | `grep -oE 'android:(debuggable\|allowBackup\|...)' work/new/v5/apktool/AndroidManifest.xml` |
| E11 | ZIP hygiene: no duplicate members; `unknown/` = Firebase/Play/Kotlin metadata (OBSERVED) | `work/new/v5/apktool/unknown/` | `unzip -l $V5 \| awk '{print $4}' \| sort \| uniq -d` |
| E12 | DEX bytecode 100 % identical to baseline: 27,161/27,166 smali byte-identical; 5 files differ in float comments only; all 82 diff lines have identical code bytes (OBSERVED) | baseline `Mobile/Arceus-X/Shared/apktool/smali*/`; new `work/new/v5/apktool/smali*/` | `for d in smali smali_classes2 smali_classes3 smali_classes4; do diff -rq Mobile/Arceus-X/Shared/apktool/$d work/new/v5/apktool/$d; done` — then diff each reported file: every differing line pair shares the same instruction bytes before the `#` comment (82 differing lines total, 0 code mismatches) |
| E13 | JADX 1.5.6: 13,639 Java files, 113 errors — same counts as baseline (OBSERVED) | `work/new/v5/jadx/`, `work/new/v5/jadx.log` | `jadx -d work/new/v5/jadx --no-res -j 2 $V5; find work/new/v5/jadx/sources -name '*.java' \| wc -l; grep -o 'count: [0-9]*' work/new/v5/jadx.log` |
| E14 | `com.axjava` classes survive; Java-level diffs are `--deobf` naming artifacts only (OBSERVED) | new `work/new/v5/jadx/sources/com/axjava/` vs baseline `Mobile/Arceus-X/Shared/jadx/sources/com/axjava/` | `diff -rq Mobile/Arceus-X/Shared/jadx/sources/com/axjava work/new/v5/jadx/sources/com/axjava` |
| E15 | Injection chain: `ActivitySplash.java:210`, `MainGameActivity.java:653` → `Main.Start`; `Main.java:16` `System.loadLibrary("zstd-jni-1.5.7-6")`; `Main.java:24` native `lIIlIIlIIlII(Activity)` (OBSERVED) | `work/new/v5/jadx/sources/com/axjava/Main.java`; `.../com/roblox/client/startup/{ActivitySplash,MainGameActivity}.java` | `grep -rn "Main.Start(" work/new/v5/jadx/sources/com/roblox/client/startup/`; `sed -n '15,24p' .../Main.java` |
| E16 | Ten native declarations, exact classes/lines (OBSERVED) | `Main.java:24`, `JNIFunctions.java:62-68`, `AXWebViewController.java:63-71` | `grep -rn " native " work/new/v5/jadx/sources/com/axjava/` |
| E17 | Helper surface: WebView key-system bridge (`AXWebViewController.java:80,110-111`), APK updater (`JNIFunctions.java:762`), autoexec (`:524`), storage paths (`:143,:149`) (OBSERVED) | same files | `grep -n "addJavascriptInterface\|vnd.android.package-archive\|autoexec" ...` |
| E18 | `libroblox.so` byte-identical to baseline (`0c68e854…29b93a`); all 8 native libs hashed; only payload differs across the pair (OBSERVED) | `work/new/*/lib/arm64-v8a/` | `sha256sum work/new/v5/lib/arm64-v8a/*.so` |
| E19 | Payload sections/drift: `.text` −63,472 B, `.rodata` +64 B, `.dyncall` 0x7048 AX, `.stack` 0x1c AX, `.gnu.plt` 5 B (OBSERVED) | `work/new/libzstd-jni-1.5.7-6.so.sections.txt` vs baseline `Mobile/Arceus-X/Shared/native/elf-sections.txt` | `readelf -SW work/new/v5/lib/arm64-v8a/libzstd-jni-1.5.7-6.so` |
| E20 | Export surface: 149 FUNC = 148 zstd + `JNI_OnLoad` @0x5e4758 (12,656 B); 0 `Java_com_axjava`; export name set identical to baseline (OBSERVED) | `work/new/libzstd-jni-1.5.7-6.so.symbols.txt` | `readelf --dyn-syms -W work/new/v5/lib/arm64-v8a/libzstd-jni-1.5.7-6.so > s.txt; awk '$4=="FUNC" && $7!="UND"' s.txt \| wc -l` |
| E21 | Toolchain identity: rustc `1.97.0-nightly (7c3c88f42 2026-05-14)`, LLD 14.0.6, NDK r25b; build host `C:\Users\ciaon\`; crates luau-lifter/cfg/ast/restructure/medal-ffi + nom 7.1.3 + petgraph `b40d963`; census identical to baseline (OBSERVED) | `.comment`/`.note.android.ident`; `work/new/libzstd-jni-1.5.7-6.so.strings.txt` | `readelf -p .comment <payload>`; `grep -oE '[a-z0-9_-]+\\src\\[a-z_\\.]+' <strings> \| cut -d'\' -f1 \| sort \| uniq -c` |
| E22 | String surface unchanged vs baseline where classifiable: URL sets, source-path sets, vocabulary counts identical (OBSERVED) | `/tmp/old.u`, `/tmp/new.u` (session); regenerate from baseline `Shared/native/strings.txt` and new dump | `strings -a -n 4 <payload>` then `diff <(grep -aoE 'https?://[A-Za-z0-9./_-]+' old \| sort -u) <(same new)` |
| E23 | `.text` 100 % opaque: 1,860/1,860 blocks high-entropy, 0 code blocks; export sites non-code in-file (OBSERVED) | `work/new/…` (session output of `tools/so-coverage-map.py`) | `python3 tools/so-coverage-map.py work/new/v5/lib/arm64-v8a/libzstd-jni-1.5.7-6.so 4096` |
| E24 | `.dyncall` 100 % decodable: 7,186 insns, 10 `svc #0` direct-syscall stubs (`mov x8,x0; …; svc #0; ret`), 325 loop back-edges, 200 `eor` (OBSERVED) | session disassembly | `python3 tools/jni-onload-disasm.py <payload>` (JNI_OnLoad part) + Capstone walk of `.dyncall` |
| E25 | `.stack` = three `adrp/add/ret` pointer thunks → 0x953148/0x953150, not a stack (OBSERVED) | session disassembly | Capstone walk of `.stack` (28 B) |
| E26 | `.init_array`: 198 relocated entries; [0] 0x91d890 and [1] 0x91cecc (2,496 B) plaintext in `.dyncall`; 196 point into packed `.text` (OBSERVED) | session relocation resolution | resolve `R_AARCH64_RELATIVE` addends landing in `.init_array` (pyelftools; see `tools/jni-onload-disasm.py` for the loading pattern) |
| E27 | No statically initialised `JNINativeMethod[]`: 0 triples among 16,317 RELATIVE relocations (OBSERVED) | `tools/jni-table-scan.py` output | `python3 tools/jni-table-scan.py <payload>` |
| E28 | The ten native names absent from the string table (OBSERVED) | `work/new/libzstd-jni-1.5.7-6.so.strings.txt` | `for n in lIIlIIlIIlII SendButton …; do grep -c $n <strings>; done` (all 0) |
| E29 | No zstd/lz4/xz frame magic anywhere in the payload (OBSERVED) | session scan | byte-scan for `28 B5 2F FD`, `04 22 4D 18`, `FD 37 7A 58 5A` |
| E30 | Cipher constants present: ChaCha sigma ×1, AES sbox ×1 / inv ×2, SHA-256 K ×7, MD5 init ×1, CRC32 ×1 — attribution UNKNOWN (OBSERVED presence) | session scan | byte-scan for the constants |
| E31 | Baseline continuity of the packer: old listing's `svc #0` stubs at Ghidra addresses 0xa267c0… unshift by −0x100000 into the old `.dyncall` (0x9267ac+0x14) (OBSERVED → DERIVED continuity) | `Mobile/Arceus-X/Shared/native/ghidra-assembly.txt` lines `00a267b8-00a267c8` | `grep -A4 '^00a267c0' Mobile/Arceus-X/Shared/native/ghidra-assembly.txt` |
| E32 | New payload build ID `04c95d94…cdab` (baseline `10f20099…52df`) (OBSERVED) | `readelf -n` | `readelf -n <payload> \| grep -A1 'Build ID'` |

Baseline rows used for comparison come from
`Mobile/Arceus-X/{README.md,analysis/REPORT.md,analysis/native-identifiers.md,Shared/native/*}`
(commit `9b0a192`), as cited per row.
