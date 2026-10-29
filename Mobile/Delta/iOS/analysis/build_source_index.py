#!/usr/bin/env python3
"""Join lift coverage, xrefs, imports, strings, and semantic labels into CSV."""

from __future__ import annotations
import argparse, csv, json
from collections import Counter
from pathlib import Path


SEMANTIC_NAMES = {
    0x0137D0: "set_luau_flag_override_by_name",
    0x05852C: "initialize_luau_gc_feature_flags",
    0x058634: "build_threshold_lookup_table",
    0x0589A4: "initialize_threshold_lookup_table",
    0x0D1864: "inert_anti_analysis_sink",
    0x0D1868: "anti_analysis_troll_loop",
    0x2C8A9C: "linux_loader_decoy",
    0x3A1D60: "register_app_lifecycle_observer",
    0x3A8258: "find_loaded_dyld_image_containing",
    0x3AFCD0: "keychain_add_or_update",
    0x3BAFEC: "keychain_copy_matching",
    0x50C658: "bootstrap_native_dispatch_and_robloxlib",
    0x51D098: "zero_initialize_3128_byte_runtime_state",
    0x51D0E4: "allocate_runtime_state_singleton",
    0xB6CCA8: "decompile_luau_bytecode_with_encoding_key",
    0xB71828: "free_decompiled_c_string",
    0xB71DCC: "rust_string_into_c_string",
}


def main() -> int:
    p = argparse.ArgumentParser()
    p.add_argument("--xrefs", required=True); p.add_argument("--structured", required=True)
    p.add_argument("--low-level", required=True); p.add_argument("--resolved", required=True)
    p.add_argument("--output", required=True); p.add_argument("--summary", required=True)
    a = p.parse_args()
    xrefs = json.loads(Path(a.xrefs).read_text())["functions"]
    structured = json.loads(Path(a.structured).read_text())
    low = json.loads(Path(a.low_level).read_text())["functions"]
    resolved = json.loads(Path(a.resolved).read_text())["calls"]
    status = {int(x["start"], 16): x for x in structured["functions"]}
    low_paths = {int(x["start"], 16): x["path"] for x in low}
    indirect = Counter(int(x["function"], 16) for x in resolved)
    rows = []
    for item in xrefs:
        start = item["start"]; lift = status.get(start, {})
        strings = [x["value"] for x in item["strings"]]
        rows.append({
            "start": f"0x{start:08x}", "end": f"0x{item['end']:08x}", "size": item["size"],
            "semantic_name": SEMANTIC_NAMES.get(start, ""), "lift_status": lift.get("status", "missing"),
            "structured_path": lift.get("path", ""), "low_level_path": low_paths.get(start, ""),
            "basic_blocks": lift.get("blocks", ""), "cyclomatic_complexity": lift.get("cyclomatic_complexity", ""),
            "direct_call_count": len(item["calls"]), "resolved_indirect_call_count": indirect[start],
            "imports": " | ".join(item["imports"]), "strings": " | ".join(strings),
        })
    out = Path(a.output); out.parent.mkdir(parents=True, exist_ok=True)
    with out.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=list(rows[0])); writer.writeheader(); writer.writerows(rows)
    counts = Counter(x["lift_status"] for x in rows)
    summary = f"""# Function-source index

`analysis/function_source_index.csv` maps every one of the {len(rows):,} Mach-O
function starts to its extent, source-lift tier, imports, strings, call counts,
and any evidence-backed semantic name.

| Lift result | Functions |
|---|---:|
| Structured C-like | {counts['ok']:,} |
| Instruction-faithful fallback | {counts['size-fallback'] + counts['error']:,} |
| Missing | {counts['missing']:,} |

Generated names are never represented as original symbols.  The address is the
canonical identity, and the CSV makes each inference auditable against the
assembly and machine-derived indexes.
"""
    Path(a.summary).write_text(summary)
    return 0


if __name__ == "__main__": raise SystemExit(main())
