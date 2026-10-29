#!/usr/bin/env python3
"""Rebuild a disk-layout PE from a contiguous in-memory module image.

The input must begin at the module base and cover SizeOfImage bytes. Section
data is copied from RVA offsets, section raw pointers/sizes are regenerated,
and the loaded ImageBase is preserved so loader-applied relocations remain
valid for static analysis.
"""

from __future__ import annotations

import argparse
import hashlib
import json
import struct
from pathlib import Path

import pefile


def align(value: int, alignment: int) -> int:
    return (value + alignment - 1) & ~(alignment - 1)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("dump", type=Path)
    parser.add_argument("output", type=Path)
    parser.add_argument("--report", type=Path)
    parser.add_argument(
        "--exception-section",
        help="replace the exception directory with this section (for example .pdata)",
    )
    args = parser.parse_args()

    image = args.dump.read_bytes()
    pe = pefile.PE(data=image, fast_load=False)
    size_of_image = pe.OPTIONAL_HEADER.SizeOfImage
    size_of_headers = pe.OPTIONAL_HEADER.SizeOfHeaders
    file_alignment = pe.OPTIONAL_HEADER.FileAlignment

    if len(image) < size_of_image:
        raise SystemExit(
            f"dump is too small: {len(image):#x} < SizeOfImage {size_of_image:#x}"
        )
    if not file_alignment or file_alignment & (file_alignment - 1):
        raise SystemExit(f"invalid FileAlignment: {file_alignment:#x}")

    header_size = align(size_of_headers, file_alignment)
    output = bytearray(image[:header_size])
    if len(output) < header_size:
        output.extend(b"\0" * (header_size - len(output)))

    cursor = header_size
    sections = []
    for section in pe.sections:
        name = section.Name.rstrip(b"\0").decode("latin1")
        virtual_size = section.Misc_VirtualSize
        rva = section.VirtualAddress
        raw_size = align(virtual_size, file_alignment) if virtual_size else 0
        raw_pointer = cursor if raw_size else 0

        if rva + virtual_size > len(image):
            raise SystemExit(
                f"section {name} exceeds dump: RVA {rva:#x} size {virtual_size:#x}"
            )

        struct.pack_into(
            "<I", output, section.get_field_absolute_offset("SizeOfRawData"), raw_size
        )
        struct.pack_into(
            "<I",
            output,
            section.get_field_absolute_offset("PointerToRawData"),
            raw_pointer,
        )

        if raw_size:
            chunk = image[rva : rva + virtual_size]
            output.extend(chunk)
            output.extend(b"\0" * (raw_size - len(chunk)))
            cursor += raw_size

        sections.append(
            {
                "name": name,
                "rva": hex(rva),
                "virtual_size": hex(virtual_size),
                "raw_pointer": hex(raw_pointer),
                "raw_size": hex(raw_size),
                "nonzero_bytes": sum(byte != 0 for byte in image[rva : rva + virtual_size]),
            }
        )

    # A mapped image does not contain the original Authenticode certificate.
    security = pe.OPTIONAL_HEADER.DATA_DIRECTORY[
        pefile.DIRECTORY_ENTRY["IMAGE_DIRECTORY_ENTRY_SECURITY"]
    ]
    struct.pack_into("<II", output, security.get_file_offset(), 0, 0)
    struct.pack_into("<I", output, pe.OPTIONAL_HEADER.get_field_absolute_offset("CheckSum"), 0)

    exception_override = None
    if args.exception_section:
        match = next(
            (
                section
                for section in pe.sections
                if section.Name.rstrip(b"\0").decode("latin1") == args.exception_section
            ),
            None,
        )
        if match is None:
            raise SystemExit(f"section not found: {args.exception_section}")
        exception = pe.OPTIONAL_HEADER.DATA_DIRECTORY[
            pefile.DIRECTORY_ENTRY["IMAGE_DIRECTORY_ENTRY_EXCEPTION"]
        ]
        struct.pack_into(
            "<II",
            output,
            exception.get_file_offset(),
            match.VirtualAddress,
            match.Misc_VirtualSize,
        )
        exception_override = {
            "section": args.exception_section,
            "rva": hex(match.VirtualAddress),
            "size": hex(match.Misc_VirtualSize),
        }

    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_bytes(output)

    report = {
        "input": str(args.dump),
        "output": str(args.output),
        "input_sha256": hashlib.sha256(image).hexdigest(),
        "output_sha256": hashlib.sha256(output).hexdigest(),
        "loaded_image_base": hex(pe.OPTIONAL_HEADER.ImageBase),
        "entry_point_rva": hex(pe.OPTIONAL_HEADER.AddressOfEntryPoint),
        "size_of_image": hex(size_of_image),
        "rebuilt_file_size": len(output),
        "exception_directory_override": exception_override,
        "sections": sections,
    }
    report_path = args.report or args.output.with_suffix(args.output.suffix + ".json")
    report_path.write_text(json.dumps(report, indent=2) + "\n")
    print(json.dumps(report, indent=2))


if __name__ == "__main__":
    main()
