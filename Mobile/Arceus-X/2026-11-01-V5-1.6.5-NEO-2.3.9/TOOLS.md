# Tools used — V5 1.6.5 / NEO 2.3.9 analysis (2026-11-01)

Installed by `tools/setup-toolchain.sh` at the pinned versions below (see
[`tools/README.md`](../../../tools/README.md) for sources and fallbacks).
Engine versions were chosen to match the baseline analysis so that decompiler
differences are not mistaken for target drift.

| Tool | Version | SHA-256 / note | Used for |
| --- | --- | --- | --- |
| Temurin JRE (jdk4py) | 25.0.2 | — | JVM for all Java tooling |
| Apktool | 3.0.3 | jar `dbf930b076c6b9be08d57c449cacefc3bdd6b71ebd59b3066fc0e1f5b14f9423` | manifest/resources/smali decode (same version as baseline) |
| JADX CLI | 1.5.6 | dist zip `545ea2be9c242511bc145755cf4bda2485ade42966e096f8b4d3da2a230e8974` | Java export (same version as baseline; no `--deobf`, unlike the baseline run — see REPORT.md §9) |
| baksmali | 3.0.10 (fat) | jar `37ae4a41a8886e15c20b8362fa4250f96bbdb55e1a608199ad8b5dff068b588f` | referenced via apktool; upstream no longer ships the task-spec 3.0.9 asset |
| smali | 3.0.10 (fat) | jar `32fa0e88a6c397b3922201adf5f3e534fbaed5a663c71d0c558c3ddce0af844a` | available for reassembly checks (not needed) |
| apksigner | 34.x (`@postar/apktool-node` vendored) | — | signature verification |
| androguard | 4.1.4 (PyPI) | — | behind `tools/apk-meta.py` / `tools/apk-diff.py` |
| APKiD | 3.2.0 (PyPI) | — | packer/anti-analysis fingerprints (heuristic) |
| Quark-Engine | 26.10.1 (PyPI) + 280 rules | rules from `quark-rules` master (codeload) | behavioural scoring (heuristic) |
| pyelftools | current (PyPI) | — | ELF parsing for the custom scripts |
| Capstone | current (PyPI) | — | arm64 disassembly of plaintext regions |
| GNU binutils readelf/strings | Debian image version | — | section/symbol/string exports |
| Python | 3.13.5 (analysis venv) | — | scripting |

Custom tooling written for this pass (committed under `tools/`):
`jni-table-scan.py`, `jni-onload-disasm.py`, `so-coverage-map.py` — see
`tools/README.md`.

Not used, deliberately: Ghidra (the code of interest is packed; a headless
run would reproduce the baseline's `halt_baddata` result — REPORT.md §9),
Frida/Unicorn (no target/device in a static-only pass; Unicorn is the
recommended next step for emulating the unpacker).

Environment facts that affected the run: GitHub release assets were reachable
from this sandbox, so the modern engines above are the defaults; the analysis
virtualenv was bootstrapped with `get-pip.py` because the image ships no
`python3-venv`; REA CLI was not installed (non-fatal, unused).
