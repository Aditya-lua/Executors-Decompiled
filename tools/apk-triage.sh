#!/usr/bin/env bash
# First-pass triage for a target APK: identity, static structure, decompilation,
# packer/obfuscation fingerprint and behavioural scoring.
#
#   ./apk-triage.sh target.apk              # full run into ./work/<name>
#   ./apk-triage.sh target.apk -o /data/x   # explicit output root
#   ./apk-triage.sh target.apk --fast       # skip JADX source export
#
# Every step is optional at runtime: a missing tool is reported and skipped,
# a failing tool is recorded and the run continues. The APK is never executed.
set -uo pipefail

HERE="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
# shellcheck source=/dev/null
[ -f "$HERE/env.sh" ] && . "$HERE/env.sh"

TARGET=""; OUT=""; FAST=0; SMALI=1; MODERN=0
while [ $# -gt 0 ]; do
  case "$1" in
    -o|--out) OUT="$2"; shift 2 ;;
    --fast) FAST=1; shift ;;
    --no-smali) SMALI=0; shift ;;
    --modern) MODERN=1; shift ;;
    -h|--help) sed -n '2,12p' "$0"; exit 0 ;;
    *) TARGET="$1"; shift ;;
  esac
done

[ -n "$TARGET" ] || { echo "usage: $0 TARGET.apk [-o OUTDIR] [--fast] [--no-smali] [--modern]" >&2; exit 2; }
[ -f "$TARGET" ] || { echo "no such file: $TARGET" >&2; exit 2; }

NAME="$(basename "$TARGET")"; NAME="${NAME%.*}"
OUT="${OUT:-$PWD/work/$NAME}"
mkdir -p "$OUT"
LOG="$OUT/triage.log"
: > "$LOG"

note() { printf '%s\n' "$*" | tee -a "$LOG" >&2; }
step() {
  local label="$1"; shift
  note ""
  note "== $label =="
  local start=$SECONDS
  if "$@" >>"$LOG" 2>&1; then
    note "   ok ($((SECONDS - start))s)"
    return 0
  fi
  note "   FAILED ($((SECONDS - start))s) - see triage.log"
  return 1
}
have() { command -v "$1" >/dev/null 2>&1; }

note "target : $TARGET"
note "output : $OUT"
note "started: $(date -u +%FT%TZ)"

# ---------------------------------------------------------------- identity ---
step "identity and static structure (apk-meta)" \
  python3 "$HERE/apk-meta.py" "$TARGET" --json "$OUT/meta.json"
step "packer / obfuscator fingerprint (apkid)" \
  apkid "$TARGET" > "$OUT/apkid.txt"
step "APK signature verification (apksigner)" \
  apksigner verify --verbose --print-certs "$TARGET" > "$OUT/signatures.txt"

# ----------------------------------------------------------- decompilation ---
APKTOOL_ARGS=(-f -o "$OUT/apktool")
[ "$SMALI" -eq 1 ] || APKTOOL_ARGS+=(-s)   # -s: do not decode smali
step "resources, manifest and smali (apktool)" apktool d "${APKTOOL_ARGS[@]}" "$TARGET"

if [ "$FAST" -eq 0 ]; then
  step "Java sources (jadx CLI)" jadx -d "$OUT/jadx" --no-res -j "$(nproc)" "$TARGET"
fi

if [ "$MODERN" -eq 1 ] && [ -f "$HERE/jadx-query.py" ] && [ -n "${RE_JADX_MCP_JAR:-}" ]; then
  step "Java sources, current JADX engine (jadx-mcp)" \
    python3 "$HERE/jadx-query.py" "$TARGET" export --out "$OUT/jadx-modern"
fi

# ------------------------------------------------------------------ scoring ---
RULES="${QUARK_RULES:-$HOME/.quark-engine/quark-rules/rules}"
if [ -d "$RULES" ]; then
  step "behavioural scoring (quark)" quark -a "$TARGET" -r "$RULES" -o "$OUT/quark.json"
else
  note ""
  note "== behavioural scoring (quark) =="
  note "   skipped: no rule set at $RULES"
fi

# ------------------------------------------------------------------- index ---
mkdir -p "$OUT/index"
grep_strings() {
  local label="$1" pattern="$2" src="$3" dest="$OUT/index/$1.txt"
  [ -d "$src" ] || return 0
  {
    echo "# $label"
    grep -rInE "$pattern" "$src" --include='*.java' --include='*.smali' --include='*.xml' 2>/dev/null \
      | head -400
  } > "$dest"
  note "   $label: $(( $(wc -l < "$dest") - 1 )) hits -> index/$label.txt"
}
if [ -d "$OUT/jadx" ] || [ -d "$OUT/apktool/smali" ]; then
  SRC="$OUT/jadx"; [ -d "$SRC" ] || SRC="$OUT/apktool"
  note ""
  note "== string index =="
  grep_strings native-load 'System\.load|loadLibrary|dlopen' "$SRC"
  grep_strings reflection 'getDeclaredMethod|getMethod\(|Class\.forName|newInstance' "$SRC"
  grep_strings crypto 'Cipher\.getInstance|MessageDigest|SecretKeySpec|AES/|RC4|XOR' "$SRC"
  grep_strings dynamic-code 'DexClassLoader|PathClassLoader|InMemoryDexClassLoader|createPackageContext' "$SRC"
  grep_strings network 'https?://[a-zA-Z0-9._~:/?#@!$&*+,;=%-]+' "$SRC"
  grep_strings anti-analysis 'isDebuggerConnected|/proc/self/maps|frida|ptrace|ro\.debuggable|su\b' "$SRC"
fi

# ----------------------------------------------------------------- summary ---
{
  echo "# Triage: $NAME"
  echo
  echo "Generated $(date -u +%FT%TZ) by \`tools/apk-triage.sh\`."
  echo "Input: \`$TARGET\` ($(stat -c%s "$TARGET") bytes)."
  echo
  echo '```'
  python3 - "$OUT" <<'PY'
import json, pathlib, sys
out = pathlib.Path(sys.argv[1])
meta = json.loads((out / "meta.json").read_text()) if (out / "meta.json").exists() else {}
m = meta.get("manifest", {})
print(f"package      {m.get('package')}  {m.get('version_name')} ({m.get('version_code')})")
print(f"sha256       {meta.get('file', {}).get('sha256')}")
print(f"sdk          min {m.get('min_sdk')} / target {m.get('target_sdk')}")
print(f"dex          {len(meta.get('dex', []))} files, "
      f"{sum(d.get('class_count', 0) for d in meta.get('dex', []))} classes")
print(f"native       {len(meta.get('native', []))} libraries")
for cert in m.get("certificates", []):
    print(f"signer       {cert.get('sha256')}  {cert.get('subject')}")
apkid = out / "apkid.txt"
if apkid.exists():
    lines = [l.strip() for l in apkid.read_text().splitlines() if l.strip().startswith("|->")]
    print("apkid        " + ("; ".join(lines) if lines else "no fingerprint"))
quark = out / "quark.json"
if quark.exists():
    try:
        data = json.loads(quark.read_text())
        crimes = data.get("crimes", [])
        high = [c for c in crimes if c.get("confidence", "0%").rstrip("%").isdigit()
                and int(c["confidence"].rstrip("%")) >= 80]
        print(f"quark        {len(crimes)} matched behaviours, {len(high)} at >=80% confidence")
    except Exception:
        pass
print("counts       "
      f"activities={len(m.get('activities') or [])} services={len(m.get('services') or [])} "
      f"receivers={len(m.get('receivers') or [])} providers={len(m.get('providers') or [])}")
PY
  echo '```'
  echo
  echo "## Artifacts"
  echo
  for artifact in meta.json apkid.txt signatures.txt quark.json apktool jadx jadx-modern index triage.log; do
    [ -e "$OUT/$artifact" ] && echo "- \`$artifact\`"
  done
  echo
  echo "## Limitations"
  echo
  echo "Static decompilation does not establish runtime behaviour; the APK is"
  echo "never executed here. Decompiler output is a reconstruction, not vendor"
  echo "source. Signature status reports what the APK declares, not that the"
  echo "build is trustworthy. Absence of a packer fingerprint is not proof of"
  echo "an unprotected package."
} > "$OUT/TRIAGE.md"

note ""
note "summary: $OUT/TRIAGE.md"
note "elapsed: $((SECONDS))s"
