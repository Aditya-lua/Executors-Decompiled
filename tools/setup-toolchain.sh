#!/usr/bin/env bash
# Install the APK reverse-engineering toolchain used by this collection.
#
#   ./setup-toolchain.sh              # install into ~/.local/re
#   RE_ROOT=/data/re ./setup-toolchain.sh
#
# Design notes
#   * Every component comes from a host this sandbox can reach: PyPI, the npm
#     registry, and GitHub *source* archives via codeload. GitHub release
#     assets (objects.githubusercontent.com) are not reachable, so binary
#     releases are sourced from npm packages that vendor the same JARs.
#   * Nothing is written into git. Everything lands under $RE_ROOT.
#   * Idempotent: existing components are skipped, so it doubles as a repair.
set -uo pipefail

RE_ROOT="${RE_ROOT:-$HOME/.local/re}"
BIN="$RE_ROOT/bin"
LIB="$RE_ROOT/lib"
WORK="$RE_ROOT/.pkgs"
VENV="$RE_ROOT/venv"
mkdir -p "$BIN" "$LIB" "$WORK" "$RE_ROOT/work"

say() { printf '\033[1m==> %s\033[0m\n' "$*"; }
ok()  { printf '    ok: %s\n' "$*"; }
skip(){ printf '    skip: %s\n' "$*"; }
die() { printf '    error: %s\n' "$*" >&2; exit 1; }

need() { command -v "$1" >/dev/null 2>&1 || die "missing prerequisite: $1"; }
need curl; need python3; need npm; need node

node_major="$(node -p 'process.versions.node.split(".")[0]')"
say "node $(node -v), python $(python3 -V 2>&1 | awk '{print $2}'), root $RE_ROOT"
[ "$node_major" -ge 20 ] || die "Node.js 20+ required for the REA CLI"

# --------------------------------------------------------------- 1. Java ----
if [ -x "$LIB/jvm/bin/java" ]; then
  skip "JRE already present: $("$LIB/jvm/bin/java" -version 2>&1 | head -1)"
else
  say "Installing Temurin JRE from PyPI (jdk4py)"
  python3 -m pip install --quiet --break-system-packages --user jdk4py \
    || python3 -m pip install --quiet --user jdk4py \
    || die "jdk4py install failed"
  src="$(python3 -c 'import jdk4py, os; print(os.path.dirname(jdk4py.__file__))')/java-runtime"
  [ -x "$src/bin/java" ] || die "jdk4py runtime not found at $src"
  rm -rf "$LIB/jvm"; ln -sfn "$src" "$LIB/jvm"
  ok "$("$LIB/jvm/bin/java" -version 2>&1 | head -1)"
  export JAVA_HOME="$LIB/jvm"
  export PATH="$JAVA_HOME/bin:$BIN:$PATH"
fi
# jdk4py ships a JRE (no javac). REA's own JADX bridge wants a full JDK; the
# decompilers used here only need the JVM, so this is sufficient for analysis.

# --------------------------------------------------- 2. JARs from npm -------
npm_fetch() { # pkg version dest-file, unpacked path inside the tarball
  local pkg="$1" dest="$2" member="$3" tgz
  tgz="$(npm pack "$pkg" --pack-destination "$WORK" --silent 2>/dev/null | tail -1)"
  [ -n "$tgz" ] && [ -f "$WORK/$tgz" ] || die "npm pack $pkg failed"
  tar xzf "$WORK/$tgz" -C "$WORK"
  [ -f "$WORK/package/$member" ] || die "$pkg does not contain $member"
  cp "$WORK/package/$member" "$dest"
  rm -rf "$WORK/package"
}

if [ -f "$LIB/apktool.jar" ]; then
  skip "apktool present"
else
  say "Installing Apktool + Apksigner (@postar/apktool-node, vendored JARs)"
  npm_fetch @postar/apktool-node "$LIB/apktool.jar" lib/apktool.jar
  npm_fetch @postar/apktool-node "$LIB/apksigner.jar" lib/apksigner.jar
  ok "apktool $("$LIB/jvm/bin/java" -jar "$LIB/apktool.jar" --version 2>/dev/null)"
fi

if [ -d "$LIB/jadx" ]; then
  skip "jadx CLI present"
else
  say "Installing JADX CLI 1.1.0 (@mishguru/jadx-node distribution)"
  tgz="$(npm pack @mishguru/jadx-node --pack-destination "$WORK" --silent 2>/dev/null | tail -1)"
  [ -f "$WORK/$tgz" ] || die "npm pack @mishguru/jadx-node failed"
  tar xzf "$WORK/$tgz" -C "$WORK"
  rm -rf "$LIB/jadx"; cp -r "$WORK/package/resources/jadx-1.1.0" "$LIB/jadx"
  rm -rf "$WORK/package"
  ok "jadx $("$LIB/jadx/bin/jadx" --version 2>/dev/null)"
fi

if [ -f "$LIB/jadx-mcp.jar" ]; then
  skip "jadx-mcp (current JADX engine) present"
else
  say "Installing jadx-mcp fat JAR (current JADX core behind MCP tools)"
  npm_fetch jadx-mcp "$LIB/jadx-mcp.jar" jadx-mcp.jar
  ok "$(du -h "$LIB/jadx-mcp.jar" | cut -f1) fat JAR"
fi

# ------------------------------------------------------ 3. Python tools -----
if [ -x "$VENV/bin/python" ]; then
  skip "virtualenv present: $VENV"
else
  say "Creating virtualenv with the Python analysis stack"
  python3 -m venv "$VENV" || die "venv creation failed"
fi
say "Installing Python analysis packages (androguard, apkid, quark, frida, lief, ...)"
"$VENV/bin/pip" install --quiet --upgrade pip >/dev/null 2>&1
"$VENV/bin/pip" install --quiet \
  androguard pyaxmlparser apkid quark-engine \
  frida frida-tools \
  lief capstone unicorn keystone-engine pyelftools \
  || die "pip install of the analysis stack failed"
ok "androguard $("$VENV/bin/python" -c 'import androguard; print(androguard.__version__)' 2>/dev/null)"

if [ -d "$HOME/.quark-engine/quark-rules-master/rules" ]; then
  skip "quark rule set present"
else
  say "Fetching quark rule set (GitHub source archive via codeload)"
  curl -sfL -o "$WORK/quark-rules.tar.gz" \
    "https://codeload.github.com/quark-engine/quark-rules/tar.gz/refs/heads/master" \
    || die "quark-rules download failed"
  mkdir -p "$HOME/.quark-engine"
  tar xzf "$WORK/quark-rules.tar.gz" -C "$HOME/.quark-engine"
  rm -rf "$HOME/.quark-engine/quark-rules"
  mkdir -p "$HOME/.quark-engine/quark-rules"
  ln -sfn "$HOME/.quark-engine/quark-rules-master/rules" "$HOME/.quark-engine/quark-rules/rules"
  ok "$(ls "$HOME/.quark-engine/quark-rules/rules" | wc -l) rules"
fi

# ------------------------------------------------------- 4. REA agents ------ #
if command -v rea >/dev/null 2>&1; then
  skip "REA CLI present: $(rea --version 2>/dev/null | tail -1)"
else
  say "Installing the REA CLI/MCP server (rea-agents)"
  npm install -g rea-agents >/dev/null 2>&1 || die "npm install -g rea-agents failed"
  ok "rea $(rea --version 2>/dev/null | tail -1)"
fi

# ----------------------------------------------------------- 5. wrappers ----
say "Writing launcher wrappers into $BIN"
cat > "$BIN/java" <<'EOF'
#!/bin/sh
exec "${RE_ROOT:-$HOME/.local/re}/lib/jvm/bin/java" "$@"
EOF
cat > "$BIN/apktool" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
exec "$R/lib/jvm/bin/java" ${APKTOOL_JAVA_OPTS:--Xmx2g} -jar "$R/lib/apktool.jar" "$@"
EOF
cat > "$BIN/apksigner" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
exec "$R/lib/jvm/bin/java" -jar "$R/lib/apksigner.jar" "$@"
EOF
cat > "$BIN/jadx" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
JAVA_HOME="$R/lib/jvm"; export JAVA_HOME
exec "$R/lib/jadx/bin/jadx" "$@"
EOF
cat > "$BIN/jadx-mcp" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
exec "$R/lib/jvm/bin/java" ${JADX_MCP_JAVA_OPTS:--Xmx3g} -jar "$R/lib/jadx-mcp.jar" "$@"
EOF
cat > "$BIN/baksmali" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
exec "$R/lib/jvm/bin/java" -cp \
  "$R/lib/jadx/lib/baksmali-2.3.4.jar:$R/lib/jadx/lib/dexlib2-2.3.4.jar:$R/lib/jadx/lib/guava-28.1-jre.jar:$R/lib/jadx/lib/commons-cli-1.4.jar" \
  org.jf.baksmali.Main "$@"
EOF
chmod +x "$BIN"/*
ok "$(ls "$BIN" | tr '\n' ' ')"

# --------------------------------------------------------------- 6. env -----
REPO_TOOLS="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
if ! grep -q "tools/env.sh" "$HOME/.bashrc" 2>/dev/null; then
  printf '[ -f "%s/env.sh" ] && . "%s/env.sh"\n' "$REPO_TOOLS" "$REPO_TOOLS" >> "$HOME/.bashrc"
  ok "added env hook to ~/.bashrc"
else
  skip "~/.bashrc already sources tools/env.sh"
fi

# ----------------------------------------------------------- 7. verify ------
say "Verifying"
"$BIN/java" -version >/dev/null 2>&1 && ok "java" || die "java failed"
"$BIN/apktool" --version >/dev/null 2>&1 && ok "apktool" || die "apktool failed"
"$BIN/jadx" --version >/dev/null 2>&1 && ok "jadx" || die "jadx failed"
"$VENV/bin/python" -c 'import androguard, apkid, lief, capstone, unicorn' && ok "python stack"
command -v rea >/dev/null 2>&1 && ok "rea" || printf '    warn: rea not on PATH\n'

say "Done. Activate with: source $REPO_TOOLS/env.sh"
