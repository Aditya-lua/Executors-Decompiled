#!/usr/bin/env python3
"""Create a Ghidra-oriented PE that seeds analysis at recovered app code.

The faithful process-image reconstruction retains executable protector/VM
sections and protector-owned TLS/exception metadata.  Those confuse recursive
analysis.  This helper keeps every byte but marks only .text executable, sets a
known native application routine as the analysis entry point, and disables
protector-owned TLS/exception/load-config directory seeds.

The output is for static analysis only and is not intended to execute.
"""

from __future__ import annotations

import argparse
import hashlib
import json
from pathlib import Path

import pefile


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("input", type=Path)
    parser.add_argument("output", type=Path)
    parser.add_argument("--entry-rva", type=lambda value: int(value, 0), required=True)
    args = parser.parse_args()

    pe = pefile.PE(str(args.input))
    changes: dict[str, object] = {
        "input": str(args.input),
        "input_sha256": sha256(args.input),
        "analysis_entry_rva": hex(args.entry_rva),
        "sections_made_non_executable": [],
        "directories_disabled": [],
    }

    pe.OPTIONAL_HEADER.AddressOfEntryPoint = args.entry_rva

    for section in pe.sections:
        name = section.Name.rstrip(b"\0").decode("ascii", errors="replace")
        if name != ".text" and section.Characteristics & 0x20000000:
            section.Characteristics &= ~0x20000000  # IMAGE_SCN_MEM_EXECUTE
            section.Characteristics &= ~0x00000020  # IMAGE_SCN_CNT_CODE
            section.Characteristics |= 0x00000040   # IMAGE_SCN_CNT_INITIALIZED_DATA
            changes["sections_made_non_executable"].append(name)

    for index, name in ((3, "exception"), (9, "tls"), (10, "load_config")):
        directory = pe.OPTIONAL_HEADER.DATA_DIRECTORY[index]
        if directory.VirtualAddress or directory.Size:
            changes["directories_disabled"].append(
                {"name": name, "rva": hex(directory.VirtualAddress), "size": hex(directory.Size)}
            )
            directory.VirtualAddress = 0
            directory.Size = 0

    args.output.parent.mkdir(parents=True, exist_ok=True)
    pe.OPTIONAL_HEADER.CheckSum = 0
    pe.write(str(args.output))

    check = pefile.PE(str(args.output), fast_load=True)
    check.OPTIONAL_HEADER.CheckSum = check.generate_checksum()
    check.write(str(args.output))

    changes["output"] = str(args.output)
    changes["output_sha256"] = sha256(args.output)
    changes["warning"] = "Static-analysis-only image; do not execute."
    report = args.output.with_suffix(args.output.suffix + ".report.json")
    report.write_text(json.dumps(changes, indent=2) + "\n", encoding="utf-8")
    print(json.dumps(changes, indent=2))


if __name__ == "__main__":
    main()
