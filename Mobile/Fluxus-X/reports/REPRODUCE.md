# Tools and reproduction

The analyzed APK's SHA-256 is
`0491e1c5d9bce3c47fdd27f32593dd2a3ad3d3adab5902fe315e7d4d64e6d2aa`.
Reproduction refuses a different input build because native offsets and the four
Lua buffer locations are specific to this sample.

## Tool versions

| Tool | Version used | Source |
| --- | --- | --- |
| gdown | 6.5.2 | PyPI `gdown`; downloaded the user-supplied Drive file |
| JADX | 1.5.7 | [Official release](https://github.com/skylot/jadx/releases/tag/v1.5.7) |
| Apktool | 3.0.3 | [Official release](https://github.com/iBotPeaches/Apktool/releases/tag/v3.0.3) |
| Ghidra | 12.2 | [Official release](https://github.com/NationalSecurityAgency/ghidra/releases/tag/Ghidra_12.2_build) |
| Ghidra Java runtime | Temurin JDK 25.0.5.1+2 | Adoptium `temurin25-binaries` official release |
| Luau CLI | 0.747 | [Official release](https://github.com/luau-lang/luau/releases/tag/0.747) |
| Androguard | 4.1.4 | PyPI `androguard` |
| pyelftools | 0.33 | PyPI `pyelftools` |
| Capstone | 5.0.9 | PyPI `capstone`; manual ARM64 cross-checks |
| Unicorn | See [tool versions](../evidence/tool-versions.json) | PyPI `unicorn`; bounded in-memory initializer evaluation |

No target APK, native binary, or recovered Lua source was launched on the host.
Unicorn interpreted selected ARM64 constructors in an isolated emulated address
space. Unknown imports and supervisor calls stop evaluation. Its surrogates are
for constant recovery, not a substitute Android runtime.

## Run

Create a Python virtual environment and install the analysis dependencies:

```bash
python3 -m venv /path/to/recovery-venv
source /path/to/recovery-venv/bin/activate
python3 -m pip install androguard==4.1.4 pyelftools==0.33 unicorn mutf8
```

Install the tool versions above outside the repository, and set absolute paths:

```bash
export FLUXUS_JADX=/path/to/jadx-1.5.7/bin/jadx
export FLUXUS_APKTOOL_JAR=/path/to/apktool_3.0.3.jar
export FLUXUS_GHIDRA_HEADLESS=/path/to/ghidra_12.2_PUBLIC/support/analyzeHeadless
export FLUXUS_LUAU_COMPILE=/path/to/luau-0.747/luau-compile
export JAVA_HOME=/path/to/jdk-25
export PATH="$JAVA_HOME/bin:$PATH"

./scripts/reproduce.sh /path/to/Fluxus_X_V1.0.0.apk /path/to/fresh-work /path/to/derived-output
```

Use fresh work and output directories. Intermediate APK, DEX, native, Ghidra
project, and tool files stay outside the publication directory. The collector
accepts UTF-8 text only, splits large TSV indexes, redacts matching credential
values, and withholds the credential reconstruction initializer. The final
audit must pass before publishing.

`DumpRecovery.java` also accepts `--incremental` to refresh an existing native
export after marking newly observed function-pointer targets. It reuses
unchanged function output and refreshes callers of newly created functions.

The recovery commands regenerate derived artifacts and verification. The written
analysis reports explain observations and unresolved boundaries separately.
