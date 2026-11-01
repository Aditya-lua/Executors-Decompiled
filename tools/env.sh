# Toolchain environment for APK reverse engineering.
#   source tools/env.sh
#
# Installed by tools/setup-toolchain.sh. RE_ROOT holds everything outside git.
export RE_ROOT="${RE_ROOT:-$HOME/.local/re}"
export JAVA_HOME="${JAVA_HOME:-$RE_ROOT/lib/jvm}"
export RE_JADX_MCP_JAR="${RE_JADX_MCP_JAR:-$RE_ROOT/lib/jadx-mcp.jar}"
export PATH="$RE_ROOT/bin:$RE_ROOT/venv/bin:$JAVA_HOME/bin:$PATH"
