#!/usr/bin/env python3
"""Extract addressed ASCII and UTF-16LE strings from a mapped PE image."""

from __future__ import annotations

import argparse
import csv
import re
from pathlib import Path

import pefile


ASCII_RE = re.compile(rb"[\x20-\x7e]{5,}")
UTF16_RE = re.compile(rb"(?:[\x20-\x7e]\x00){5,}")


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("image", type=Path)
    parser.add_argument("output", type=Path)
    args = parser.parse_args()

    data = args.image.read_bytes()
    pe = pefile.PE(data=data, fast_load=False)
    base = pe.OPTIONAL_HEADER.ImageBase

    rows = []
    for section in pe.sections:
        name = section.Name.rstrip(b"\0").decode("latin1")
        rva = section.VirtualAddress
        chunk = data[rva : rva + section.Misc_VirtualSize]
        for encoding, pattern in (("ascii", ASCII_RE), ("utf16le", UTF16_RE)):
            for match in pattern.finditer(chunk):
                raw = match.group()
                text = raw.decode("ascii" if encoding == "ascii" else "utf-16le")
                item_rva = rva + match.start()
                rows.append((base + item_rva, item_rva, name, encoding, text))

    rows.sort(key=lambda row: (row[0], row[3]))
    args.output.parent.mkdir(parents=True, exist_ok=True)
    with args.output.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.writer(handle, delimiter="\t", lineterminator="\n")
        writer.writerow(("va", "rva", "section", "encoding", "string"))
        for va, rva, section, encoding, text in rows:
            writer.writerow((f"0x{va:x}", f"0x{rva:x}", section, encoding, text))

    print(f"wrote {len(rows)} strings to {args.output}")


if __name__ == "__main__":
    main()
