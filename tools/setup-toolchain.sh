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

# ------------------------------------------------------------- 0. venv ------
# The analysis stack (and jdk4py) live in $VENV. Debian images without the
# python3-venv package cannot ensurepip, so fall back to --without-pip and
# bootstrap pip from get-pip.py (downloaded to a file, never piped to a shell).
if [ -x "$VENV/bin/pip" ]; then
  skip "virtualenv present: $VENV ($("$VENV/bin/python" -V 2>&1 | awk '{print $2}'))"
else
  say "Creating virtualenv for the analysis stack"
  if python3 -m venv "$VENV" 2>/dev/null; then
    :
  else
    rm -rf "$VENV"
    python3 -m venv --without-pip "$VENV" || die "venv creation failed"
    curl -fsSL -o "$WORK/get-pip.py" https://bootstrap.pypa.io/get-pip.py \
      || die "get-pip.py download failed"
    "$VENV/bin/python" "$WORK/get-pip.py" --quiet >/dev/null \
      || die "pip bootstrap failed"
  fi
  "$VENV/bin/pip" install --quiet --upgrade pip >/dev/null 2>&1
  ok "$("$VENV/bin/python" -V 2>&1)"
fi

# --------------------------------------------------------------- 1. Java ----
if [ -x "$LIB/jvm/bin/java" ]; then
  skip "JRE already present: $("$LIB/jvm/bin/java" -version 2>&1 | head -1)"
else
  say "Installing Temurin JRE from PyPI (jdk4py)"
  # Prefer the toolchain venv: `pip --user` is impossible when the default
  # python3 is itself a virtualenv, and $VENV keeps the runtime inside $RE_ROOT.
  if "$VENV/bin/pip" install --quiet jdk4py 2>/dev/null; then
    src="$("$VENV/bin/python" -c 'import jdk4py, os; print(os.path.dirname(jdk4py.__file__))')/java-runtime"
  else
    python3 -m pip install --quiet --break-system-packages --user jdk4py \
      || python3 -m pip install --quiet --user jdk4py \
      || die "jdk4py install failed"
    src="$(python3 -c 'import jdk4py, os; print(os.path.dirname(jdk4py.__file__))')/java-runtime"
  fi
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

# ------------------------------------ 2b. Modern engines (GitHub releases) --
# The collection's Arceus X baseline was built with JADX 1.5.6 and Apktool
# 3.0.3; install the same engines so decompiler failures reflect the target,
# not an old engine. GitHub release assets are not reachable from every
# sandbox; on failure the npm-vendored engines from step 2 stay the defaults
# and this step degrades to a warning. baksmali upstream no longer publishes
# a 3.0.9 asset; 3.0.10 is the current release and is pinned here.
if [ ! -x "$LIB/jadx-1.5.6/bin/jadx" ]; then
  say "Installing JADX CLI 1.5.6 (GitHub release)"
  if curl -fsSL --max-time 600 -o "$WORK/jadx-1.5.6.zip" \
       "https://github.com/skylot/jadx/releases/download/v1.5.6/jadx-1.5.6.zip"; then
    rm -rf "$LIB/jadx-1.5.6" "$WORK/jadx156x"
    unzip -q "$WORK/jadx-1.5.6.zip" -d "$WORK/jadx156x"  # the archive extracts flat
    mv "$WORK/jadx156x" "$LIB/jadx-1.5.6"
    chmod +x "$LIB/jadx-1.5.6/bin/jadx" "$LIB/jadx-1.5.6/bin/jadx-gui" 2>/dev/null
    ok "jadx $("$LIB/jadx-1.5.6/bin/jadx" --version 2>/dev/null | tr -d '[:space:]')"
  else
    printf '    warn: jadx 1.5.6 unreachable; the 1.1.0 CLI stays the default\n'
  fi
fi
if [ ! -f "$LIB/apktool-3.0.3.jar" ]; then
  say "Installing Apktool 3.0.3 (GitHub release)"
  if curl -fsSL --max-time 600 -o "$LIB/apktool-3.0.3.jar" \
       "https://github.com/iBotPeaches/Apktool/releases/download/v3.0.3/apktool_3.0.3.jar"; then
    ok "apktool $("$LIB/jvm/bin/java" -jar "$LIB/apktool-3.0.3.jar" --version 2>/dev/null | tr -d '[:space:]')"
  else
    rm -f "$LIB/apktool-3.0.3.jar"
    printf '    warn: apktool 3.0.3 unreachable; 2.9.3 stays the default\n'
  fi
fi
for tool in baksmali smali; do
  if [ ! -f "$LIB/$tool-3.0.10.jar" ]; then
    say "Installing $tool 3.0.10 fat JAR (GitHub release)"
    if curl -fsSL --max-time 600 -o "$LIB/$tool-3.0.10.jar" \
         "https://github.com/baksmali/smali/releases/download/3.0.10/$tool-3.0.10-fat.jar"; then
      ok "$tool $("$LIB/jvm/bin/java" -jar "$LIB/$tool-3.0.10.jar" --version 2>/dev/null | head -1 | tr -d '[:space:]')"
    else
      rm -f "$LIB/$tool-3.0.10.jar"
      printf '    warn: %s 3.0.10 unreachable\n' "$tool"
    fi
  fi
done

# ------------------------------------------------------ 3. Python tools -----
# ($VENV was created in step 0.)
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
# Optional: the REA CLI is a convenience wrapper, not a prerequisite (its jadx
# provider is disabled in this environment anyway). Failure is non-fatal.
if command -v rea >/dev/null 2>&1; then
  skip "REA CLI present: $(rea --version 2>/dev/null | tail -1)"
else
  say "Installing the REA CLI/MCP server (rea-agents)"
  if npm install -g rea-agents >/dev/null 2>&1; then
    ok "rea $(rea --version 2>/dev/null | tail -1)"
  else
    printf '    warn: rea-agents install failed; continuing without it\n'
  fi
fi

# ----------------------------------------------------------- 5. wrappers ----
# Default wrappers prefer the modern engines from step 2b and fall back to
# the npm-vendored ones from step 2. Versioned aliases keep the fallbacks
# reachable for reproduction of older runs.
say "Writing launcher wrappers into $BIN"
cat > "$BIN/java" <<'EOF'
#!/bin/sh
exec "${RE_ROOT:-$HOME/.local/re}/lib/jvm/bin/java" "$@"
EOF
cat > "$BIN/apktool" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
if [ -f "$R/lib/apktool-3.0.3.jar" ]; then
  exec "$R/lib/jvm/bin/java" ${APKTOOL_JAVA_OPTS:--Xmx2g} -jar "$R/lib/apktool-3.0.3.jar" "$@"
fi
exec "$R/lib/jvm/bin/java" ${APKTOOL_JAVA_OPTS:--Xmx2g} -jar "$R/lib/apktool.jar" "$@"
EOF
cat > "$BIN/apktool-2.9.3" <<'EOF'
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
if [ -x "$R/lib/jadx-1.5.6/bin/jadx" ]; then
  exec "$R/lib/jadx-1.5.6/bin/jadx" "$@"
fi
exec "$R/lib/jadx/bin/jadx" "$@"
EOF
cat > "$BIN/jadx-1.1.0" <<'EOF'
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
if [ -f "$R/lib/baksmali-3.0.10.jar" ]; then
  exec "$R/lib/jvm/bin/java" -jar "$R/lib/baksmali-3.0.10.jar" "$@"
fi
exec "$R/lib/jvm/bin/java" -cp \
  "$R/lib/jadx/lib/baksmali-2.3.4.jar:$R/lib/jadx/lib/dexlib2-2.3.4.jar:$R/lib/jadx/lib/guava-28.1-jre.jar:$R/lib/jadx/lib/commons-cli-1.4.jar" \
  org.jf.baksmali.Main "$@"
EOF
cat > "$BIN/baksmali-2.3.4" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
exec "$R/lib/jvm/bin/java" -cp \
  "$R/lib/jadx/lib/baksmali-2.3.4.jar:$R/lib/jadx/lib/dexlib2-2.3.4.jar:$R/lib/jadx/lib/guava-28.1-jre.jar:$R/lib/jadx/lib/commons-cli-1.4.jar" \
  org.jf.baksmali.Main "$@"
EOF
cat > "$BIN/smali" <<'EOF'
#!/bin/sh
R="${RE_ROOT:-$HOME/.local/re}"
exec "$R/lib/jvm/bin/java" -jar "$R/lib/smali-3.0.10.jar" "$@"
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
"$BIN/apktool" --version >/dev/null 2>&1 \
  && ok "apktool $("$BIN/apktool" --version 2>/dev/null | tr -d '[:space:]')" || die "apktool failed"
"$BIN/jadx" --version >/dev/null 2>&1 \
  && ok "jadx $("$BIN/jadx" --version 2>/dev/null | tr -d '[:space:]')" || die "jadx failed"
"$BIN/baksmali" --version >/dev/null 2>&1 \
  && ok "baksmali $("$BIN/baksmali" --version 2>/dev/null | head -1 | tr -d '[:space:]')" \
  || printf '    warn: baksmali wrapper failed\n'
"$VENV/bin/python" -c 'import androguard, apkid, lief, capstone, unicorn' && ok "python stack"
command -v rea >/dev/null 2>&1 && ok "rea" || printf '    warn: rea not on PATH\n'

say "Done. Activate with: source $REPO_TOOLS/env.sh"
