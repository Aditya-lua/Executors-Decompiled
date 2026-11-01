# Toolchain

Everything needed to take an APK apart on a bare Debian/Ubuntu box, installed
from hosts that are reachable here (PyPI, the npm registry, and GitHub *source*
archives via `codeload`). Where GitHub *release* assets are reachable, the
installer additionally pulls the modern engines the collection standardised on
(JADX 1.5.6, Apktool 3.0.3, baksmali/smali 3.0.10); where they are not, the
npm packages that vendor the older JARs are used instead and the versioned
wrappers (`jadx-1.1.0`, `apktool-2.9.3`, `baksmali-2.3.4`) keep both reachable.

Nothing is written into git. The installation lives in `$RE_ROOT`
(default `~/.local/re`), outside the repository. On images without the
`python3-venv` package the installer bootstraps the analysis virtualenv with
`get-pip.py` (downloaded to a file, never piped to a shell).

## Install and activate

```bash
./tools/setup-toolchain.sh          # ~30s warm, ~2min cold
source tools/env.sh                 # JAVA_HOME, RE_JADX_MCP_JAR, PATH
```

`setup-toolchain.sh` is idempotent: re-run it to repair or to pick up a missing
component. `RE_ROOT=/data/re ./tools/setup-toolchain.sh` installs elsewhere.

## Inventory

| Component | Version | Source | Command |
| --- | --- | --- | --- |
| Temurin JRE | 25.0.2 | PyPI `jdk4py` (vendored runtime) | `java` |
| Apktool (default) | 3.0.3 | GitHub release (fallback: npm 2.9.3) | `apktool` / `apktool-2.9.3` |
| Apksigner | 34.x | npm `@postar/apktool-node` (vendored JAR) | `apksigner` |
| JADX CLI (default) | 1.5.6 | GitHub release (fallback: npm 1.1.0) | `jadx` / `jadx-1.1.0` |
| JADX (current core) | via jadx-mcp | npm `jadx-mcp` (fat JAR) | `jadx-mcp`, `tools/jadx-query.py` |
| baksmali (default) | 3.0.10 | GitHub release (fallback: 2.3.4 in JADX dist) | `baksmali` / `baksmali-2.3.4` |
| smali | 3.0.10 | GitHub release | `smali` |
| Androguard | 4.1.4 | PyPI | `python` API, `tools/apk-meta.py` |
| APKiD | 3.2.0 | PyPI | `apkid` |
| Quark-Engine | 26.10.1 | PyPI (+ 280-rule set from `quark-rules`) | `quark` |
| Frida / frida-tools | 17.25.0 / 14.11.0 | PyPI | `frida`, `frida-ps` |
| LIEF, Capstone, Unicorn, Keystone, pyelftools | current | PyPI | native/ELF work |
| REA CLI + MCP server | 6.7.0 | npm `rea-agents` (best-effort, optional) | `rea` |

## The four things you actually run

```bash
# 1. one-shot triage: identity, signature, apktool, jadx, APKiD, quark, string index
./tools/apk-triage.sh target.apk              # -> ./work/<name>/TRIAGE.md
./tools/apk-triage.sh target.apk --fast       # skip Java export
./tools/apk-triage.sh target.apk --modern     # also export with the current JADX core

# 2. structural metadata only, JSON + summary
python tools/apk-meta.py target.apk --json target.meta.json

# 3. query the *current* JADX engine (not the 1.1.0 CLI) without a GUI
./tools/jadx-query.py target.apk list --package com.example
./tools/jadx-query.py target.apk search "loadLibrary" --in code
./tools/jadx-query.py target.apk class com.example.Main
./tools/jadx-query.py target.apk methods com.example.Main
./tools/jadx-query.py target.apk xrefs --method 'com.example.Main#start'
./tools/jadx-query.py target.apk export --out work/jadx-modern

# 4. compare two builds member by member (V5 vs NEO style delta)
./tools/apk-diff.py v5.apk neo.apk            # names every differing member
./tools/apk-diff.py v5.apk neo.apk --json d.json

# 5. native-payload helpers (static, arm64 .so; need the venv python, so
#    source tools/env.sh first):
python3 tools/jni-table-scan.py payload.so       # hunt static JNINativeMethod[] tables
python3 tools/jni-onload-disasm.py payload.so    # carve + characterise JNI_OnLoad
python3 tools/so-coverage-map.py payload.so 4096 # code-vs-opaque block map of .text

# 6. REA: provider status and the CLI surface
rea doctor --json
rea providers --json
```

`apk-diff.py` compares ZIP members by content, then for a changed `.so` of equal
length it locates the exact differing offsets and maps each one to its ELF
section — the check that established the V5/NEO pair differ only in two
`.gnu.plt` bytes.

The native-payload helpers exist for disguised/protected executor libraries:

- `jni-table-scan.py` scans all `R_AARCH64_RELATIVE` relocations for
  `{name, JNI descriptor, function}` pointer triples — a statically
  initialised `JNINativeMethod[]`. Zero hits means registration data is built
  or decrypted at runtime.
- `jni-onload-disasm.py` carves the `JNI_OnLoad` symbol (address/size from
  `.dynsym`) and disassembles it with Capstone, reporting vtable-slot
  matches, XOR density, call targets and adrp+add string references. A
  zero-instruction result at the entry means the region is packed, not code.
- `so-coverage-map.py` classifies `.text` in fixed blocks by Shannon entropy
  and Capstone decodability, and decode-checks every exported FUNC's entry
  bytes — the check that identified the Arceus X payload's `.text` as 100 %
  packed while `.dyncall`/`.plt` stayed plaintext.

Manual work uses the wrappers directly: `apktool d -f -o out app.apk`,
`jadx -d out --no-res app.apk`, `apkid app.apk`, `quark -a app.apk -o q.json`.

## Known limits of this installation

- **The default JADX CLI is 1.5.6 when GitHub releases are reachable**, matching
  the collection's Arceus X baseline. On sandboxes where they are not, the
  default falls back to the 1.1.0 (2019) CLI — for anything modern there, prefer
  `tools/jadx-query.py`, which drives the current JADX core inside
  `jadx-mcp.jar`; use the 1.1.0 CLI only for bulk export convenience. Whichever
  engine a run used is recorded in that build's `TOOLS.md`.
- **JRE, not a full JDK.** `jdk4py` ships a runtime without `javac`, which is
  enough for Apktool, JADX, Apksigner and baksmali, but not for compiling Java
  tooling against the JADX API.
- **REA may be absent.** Its install is best-effort and non-fatal; its `jadx`
  provider requires the caller-supplied `jadx-headless-mcp 0.7.1` JAR (pinned
  SHA-256 `6e5eacf5…73ff75`) from a GitHub release, plus a full JDK. `rea
  doctor` reports this refusal rather than pretending the provider is available.
- **No Ghidra, IDA, JEB, adb or emulator.** Native work here is static only
  (LIEF/pyelftools/Capstone/Unicorn). Ghidra is bring-your-own, as REA itself
  requires; there is no device or emulator, so Frida needs a target you supply.
- **APKiD and Quark are heuristics.** An empty APKiD fingerprint does not mean
  "no packer"; Quark matches behaviour *patterns*, and low-confidence matches
  are noise.

## Conventions

Analysis output goes to `./work/<target>/` and is git-ignored. `$RE_ROOT/work`
is used instead when the artifacts would be large. Nothing in this directory
executes a target APK.
