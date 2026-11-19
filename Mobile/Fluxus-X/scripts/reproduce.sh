#!/usr/bin/env bash
# Reproduce derived artifacts from the exact APK; never launches the APK.
set -euo pipefail
if [ "$#" -ne 3 ]; then
    printf 'Usage: %s INPUT_APK WORK_DIRECTORY OUTPUT_DIRECTORY\n' "$0" >&2
    exit 2
fi
: "${FLUXUS_JADX:?Set FLUXUS_JADX to JADX 1.5.7}"
: "${FLUXUS_APKTOOL_JAR:?Set FLUXUS_APKTOOL_JAR to Apktool 3.0.3 JAR}"
: "${FLUXUS_GHIDRA_HEADLESS:?Set FLUXUS_GHIDRA_HEADLESS to Ghidra 12.2 analyzeHeadless}"
: "${FLUXUS_LUAU_COMPILE:?Set FLUXUS_LUAU_COMPILE to Luau 0.747 luau-compile}"
fluxus_scripts="$(cd -- "$(dirname -- "$0")" && pwd)"
fluxus_apk="$(realpath -- "$1")"
mkdir -p "$2" "$3"
fluxus_work="$(realpath -- "$2")"
fluxus_out="$(realpath -- "$3")"
python3 - "$fluxus_apk" "$fluxus_work" <<'PY'
import hashlib, pathlib, sys, zipfile
apk, work = pathlib.Path(sys.argv[1]), pathlib.Path(sys.argv[2])
expected = '0491e1c5d9bce3c47fdd27f32593dd2a3ad3d3adab5902fe315e7d4d64e6d2aa'
if hashlib.sha256(apk.read_bytes()).hexdigest() != expected:
    raise SystemExit('Input SHA-256 differs from the analyzed build')
with zipfile.ZipFile(apk) as archive:
    for name in ('liblazydtc.so', 'libtrampoline.so'):
        target = work / 'input' / name
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_bytes(archive.read('lib/arm64-v8a/' + name))
PY
if "$FLUXUS_JADX" -j 2 --no-res --show-bad-code -d "$fluxus_work/jadx" "$fluxus_apk" > "$fluxus_work/jadx.log" 2>&1; then
    fluxus_jadx_exit=0
else
    fluxus_jadx_exit=$?
    # JADX preserves useful output while returning 3 for method errors.
    [ "$fluxus_jadx_exit" -eq 3 ] || exit "$fluxus_jadx_exit"
fi
java -Xmx2g -jar "$FLUXUS_APKTOOL_JAR" d --no-assets -o "$fluxus_work/apktool" "$fluxus_apk" > "$fluxus_work/apktool.log" 2>&1
mkdir -p "$fluxus_work/ghidra-project"
"$FLUXUS_GHIDRA_HEADLESS" "$fluxus_work/ghidra-project" FluxusX \
    -import "$fluxus_work/input/liblazydtc.so" -max-cpu 2 -analysisTimeoutPerFile 600 \
    -scriptPath "$fluxus_scripts" -postScript RecoverThreadEntries.java \
    -postScript DumpRecovery.java "$fluxus_work/native/liblazydtc" > "$fluxus_work/ghidra-core.log" 2>&1
"$FLUXUS_GHIDRA_HEADLESS" "$fluxus_work/ghidra-project" FluxusSupport \
    -import "$fluxus_work/input/libtrampoline.so" -max-cpu 2 -analysisTimeoutPerFile 120 \
    -scriptPath "$fluxus_scripts" -postScript DumpRecovery.java "$fluxus_work/native/libtrampoline" > "$fluxus_work/ghidra-support.log" 2>&1
python3 "$fluxus_scripts/emulate_initializers.py" "$fluxus_work/input/liblazydtc.so" "$fluxus_work/decoded" > "$fluxus_work/initializers.log"
python3 "$fluxus_scripts/extract_lua_constants.py" "$fluxus_work/decoded" --luau-compile "$FLUXUS_LUAU_COMPILE"
python3 "$fluxus_scripts/collect_artifacts.py" --apk "$fluxus_apk" \
    --jadx "$fluxus_work/jadx" --apktool "$fluxus_work/apktool" \
    --native "$fluxus_work/native/liblazydtc" --native "$fluxus_work/native/libtrampoline" \
    --decoded "$fluxus_work/decoded" --out "$fluxus_out"
python3 "$fluxus_scripts/audit_recovery.py" --apk "$fluxus_apk" --root "$fluxus_out" \
    --luau-compile "$FLUXUS_LUAU_COMPILE" --jadx-log "$fluxus_work/jadx.log"
