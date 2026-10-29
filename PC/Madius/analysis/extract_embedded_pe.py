#!/usr/bin/env python3
"""Find and extract structurally valid embedded PE files from a binary blob."""

from __future__ import annotations

import argparse
import hashlib
import json
import struct
from pathlib import Path

import pefile


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("blob", type=Path)
    parser.add_argument("output_dir", type=Path)
    args = parser.parse_args()

    data = args.blob.read_bytes()
    args.output_dir.mkdir(parents=True, exist_ok=True)
    results = []
    offset = 0

    while True:
        offset = data.find(b"MZ", offset)
        if offset < 0:
            break
        try:
            if offset + 0x40 > len(data):
                break
            pe_offset = struct.unpack_from("<I", data, offset + 0x3C)[0]
            if pe_offset < 0x40 or pe_offset > 0x2000:
                raise ValueError("implausible e_lfanew")
            if data[offset + pe_offset : offset + pe_offset + 4] != b"PE\0\0":
                raise ValueError("missing PE signature")

            pe = pefile.PE(data=data[offset:], fast_load=False)
            end = pe.OPTIONAL_HEADER.SizeOfHeaders
            for section in pe.sections:
                end = max(end, section.PointerToRawData + section.SizeOfRawData)
            security = pe.OPTIONAL_HEADER.DATA_DIRECTORY[
                pefile.DIRECTORY_ENTRY["IMAGE_DIRECTORY_ENTRY_SECURITY"]
            ]
            if security.VirtualAddress and security.Size:
                end = max(end, security.VirtualAddress + security.Size)
            if end < 0x400 or offset + end > len(data):
                raise ValueError("invalid file extent")

            payload = data[offset : offset + end]
            digest = hashlib.sha256(payload).hexdigest()
            extension = ".sys" if pe.OPTIONAL_HEADER.Subsystem == 1 else ".exe"
            name = f"embedded_{offset:08x}_{digest[:12]}{extension}"
            path = args.output_dir / name
            path.write_bytes(payload)
            results.append(
                {
                    "offset": hex(offset),
                    "size": end,
                    "sha256": digest,
                    "path": str(path),
                    "machine": hex(pe.FILE_HEADER.Machine),
                    "subsystem": pe.OPTIONAL_HEADER.Subsystem,
                    "image_base": hex(pe.OPTIONAL_HEADER.ImageBase),
                    "entry_point_rva": hex(pe.OPTIONAL_HEADER.AddressOfEntryPoint),
                    "sections": [
                        section.Name.rstrip(b"\0").decode("latin1")
                        for section in pe.sections
                    ],
                }
            )
        except Exception:
            pass
        offset += 2

    report_path = args.output_dir / "embedded-pe-report.json"
    report_path.write_text(json.dumps(results, indent=2) + "\n")
    print(json.dumps(results, indent=2))


if __name__ == "__main__":
    main()
