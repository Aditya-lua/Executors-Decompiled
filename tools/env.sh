# Toolchain environment for APK reverse engineering.
#   source tools/env.sh
#
# Installed by tools/setup-toolchain.sh. RE_ROOT holds everything outside git.
export RE_ROOT="${RE_ROOT:-$HOME/.local/re}"
export JAVA_HOME="${JAVA_HOME:-$RE_ROOT/lib/jvm}"
export RE_JADX_MCP_JAR="${RE_JADX_MCP_JAR:-$RE_ROOT/lib/jadx-mcp.jar}"
export PATH="$RE_ROOT/bin:$RE_ROOT/venv/bin:$JAVA_HOME/bin:$PATH"

# The toolchain lives outside git and does not survive a fresh workspace.
# Say so once, instead of failing later with a confusing "command not found".
if [ ! -x "$RE_ROOT/bin/jadx" ] || [ ! -x "$RE_ROOT/venv/bin/python" ]; then
  printf 'tools/env: no toolchain at %s - run tools/setup-toolchain.sh (~45s)\n' "$RE_ROOT" >&2
fi
