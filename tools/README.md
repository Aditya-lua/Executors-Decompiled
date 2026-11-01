# Toolchain

Everything needed to take an APK apart on a bare Debian/Ubuntu box, installed
from hosts that are reachable here (PyPI, the npm registry, and GitHub *source*
archives via `codeload`). GitHub release assets are **not** reachable from this
sandbox, so binary releases are sourced from npm packages that vendor the same
JARs.

Nothing is written into git. The installation lives in `$RE_ROOT`
(default `~/.local/re`), outside the repository.

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
| Apktool | 2.9.3 | npm `@postar/apktool-node` (vendored JAR) | `apktool` |
| Apksigner | 34.x | same package | `apksigner` |
| JADX CLI | 1.1.0 | npm `@mishguru/jadx-node` (vendored dist) | `jadx` |
| JADX (current core) | via jadx-mcp | npm `jadx-mcp` (fat JAR) | `jadx-mcp`, `tools/jadx-query.py` |
| baksmali | 2.3.4 | ships inside the JADX dist | `baksmali` |
| Androguard | 4.1.4 | PyPI | `python` API, `tools/apk-meta.py` |
| APKiD | 3.2.0 | PyPI | `apkid` |
| Quark-Engine | 26.10.1 | PyPI (+ 280-rule set from `quark-rules`) | `quark` |
| Frida / frida-tools | 17.25.0 / 14.11.0 | PyPI | `frida`, `frida-ps` |
| LIEF, Capstone, Unicorn, Keystone, pyelftools | current | PyPI | native/ELF work |
| REA CLI + MCP server | 6.7.0 | npm `rea-agents` | `rea` |

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

# 5. REA: provider status and the CLI surface
rea doctor --json
rea providers --json
```

`apk-diff.py` compares ZIP members by content, then for a changed `.so` of equal
length it locates the exact differing offsets and maps each one to its ELF
section — the check that established the V5/NEO pair differ only in two
`.gnu.plt` bytes.

Manual work uses the wrappers directly: `apktool d -f -o out app.apk`,
`jadx -d out --no-res app.apk`, `apkid app.apk`, `quark -a app.apk -o q.json`.

## Known limits of this installation

- **JADX CLI is 1.1.0 (2019).** The collection's earlier Arceus X work used
  1.5.6, and Apktool 3.0.3 rather than 2.9.3. For anything modern, prefer
  `tools/jadx-query.py`, which drives the current JADX core inside
  `jadx-mcp.jar`; use the 1.1.0 CLI only for bulk export convenience.
- **JRE, not a full JDK.** `jdk4py` ships a runtime without `javac`, which is
  enough for Apktool, JADX, Apksigner and baksmali, but not for compiling Java
  tooling against the JADX API.
- **REA's `jadx` provider is disabled.** It requires the caller-supplied
  `jadx-headless-mcp 0.7.1` JAR (pinned SHA-256
  `6e5eacf5…73ff75`) from a GitHub release, which is unreachable here, plus a
  full JDK. REA's other providers work; `rea doctor` reports this refusal
  rather than pretending the provider is available.
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
