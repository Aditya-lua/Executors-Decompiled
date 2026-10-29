#!/usr/bin/env python3
"""Merge overlapping Ghidra function exports into one addressed corpus.

Inputs are ordered from lowest to highest priority. A later export replaces an
earlier function with the same entry address. This is useful when a focused or
clean pass improves selected functions from a broader, timed analysis pass.
"""

from __future__ import annotations

import argparse
import hashlib
import json
import re
import shutil
from pathlib import Path


ADDRESS = re.compile(r"^([0-9a-fA-F]+)_")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("output", type=Path)
    parser.add_argument("inputs", type=Path, nargs="+")
    args = parser.parse_args()

    selected: dict[str, tuple[Path, Path]] = {}
    counts: dict[str, int] = {}
    for source in args.inputs:
        functions = source / "functions" if (source / "functions").is_dir() else source
        files = sorted(functions.glob("*.c"))
        counts[str(source)] = len(files)
        for path in files:
            match = ADDRESS.match(path.name)
            if match:
                selected[match.group(1).lower()] = (source, path)

    functions_out = args.output / "functions"
    functions_out.mkdir(parents=True, exist_ok=True)
    manifest_lines = ["address\tfile\tsource\tsha256\n"]
    combined_path = args.output / "all_functions.c"

    with combined_path.open("w", encoding="utf-8", newline="\n") as combined:
        combined.write("/* Merged Ghidra C-like pseudocode. See manifest.tsv. */\n\n")
        for address in sorted(selected, key=lambda value: int(value, 16)):
            source, path = selected[address]
            destination = functions_out / path.name
            shutil.copy2(path, destination)
            data = destination.read_bytes()
            digest = hashlib.sha256(data).hexdigest()
            manifest_lines.append(f"{address}\tfunctions/{path.name}\t{source}\t{digest}\n")
            combined.write(data.decode("utf-8", errors="replace"))
            combined.write("\n\n")

    (args.output / "manifest.tsv").write_text("".join(manifest_lines), encoding="utf-8")
    report = {
        "unique_functions": len(selected),
        "input_function_counts": counts,
        "priority": "later inputs replace earlier inputs at the same address",
        "combined_sha256": hashlib.sha256(combined_path.read_bytes()).hexdigest(),
    }
    (args.output / "merge-report.json").write_text(
        json.dumps(report, indent=2) + "\n", encoding="utf-8"
    )
    print(json.dumps(report, indent=2))


if __name__ == "__main__":
    main()
