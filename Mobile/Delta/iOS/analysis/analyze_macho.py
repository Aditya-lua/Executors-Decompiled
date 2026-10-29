#!/usr/bin/env python3
"""Inventory thin 64-bit Mach-O files without macOS-only tooling."""

from __future__ import annotations

import argparse
import hashlib
import json
import struct
from pathlib import Path


MH_MAGIC_64 = 0xFEEDFACF
LC_SEGMENT_64 = 0x19
LC_SYMTAB = 0x02
LC_DYSYMTAB = 0x0B
LC_LOAD_DYLIB = 0x0C
LC_ID_DYLIB = 0x0D
LC_LOAD_WEAK_DYLIB = 0x80000018
LC_REEXPORT_DYLIB = 0x8000001F
LC_LAZY_LOAD_DYLIB = 0x20
LC_LOAD_UPWARD_DYLIB = 0x80000023
LC_UUID = 0x1B
LC_CODE_SIGNATURE = 0x1D
LC_ENCRYPTION_INFO = 0x21
LC_ENCRYPTION_INFO_64 = 0x2C
LC_FUNCTION_STARTS = 0x26
LC_MAIN = 0x80000028
LC_BUILD_VERSION = 0x32

DYLIB_COMMANDS = {
    LC_LOAD_DYLIB,
    LC_ID_DYLIB,
    LC_LOAD_WEAK_DYLIB,
    LC_REEXPORT_DYLIB,
    LC_LAZY_LOAD_DYLIB,
    LC_LOAD_UPWARD_DYLIB,
}


def cstring(data: bytes, offset: int, limit: int | None = None) -> str:
    if offset < 0 or offset >= len(data):
        return ""
    end_limit = len(data) if limit is None else min(len(data), limit)
    end = data.find(b"\0", offset, end_limit)
    if end < 0:
        end = end_limit
    return data[offset:end].decode("utf-8", "replace")


def version_string(value: int) -> str:
    return f"{value >> 16}.{(value >> 8) & 0xff}.{value & 0xff}"


def read_uleb(data: bytes, offset: int) -> tuple[int, int]:
    value = 0
    shift = 0
    while offset < len(data):
        byte = data[offset]
        offset += 1
        value |= (byte & 0x7F) << shift
        if byte < 0x80:
            return value, offset
        shift += 7
        if shift > 63:
            break
    raise ValueError("invalid ULEB128")


def analyze(path: Path) -> dict[str, object]:
    data = path.read_bytes()
    result: dict[str, object] = {
        "path": str(path),
        "size": len(data),
        "sha256": hashlib.sha256(data).hexdigest(),
        "macho": False,
    }
    if len(data) < 32 or struct.unpack_from("<I", data)[0] != MH_MAGIC_64:
        return result

    magic, cpu_type, cpu_subtype, file_type, ncmds, sizeofcmds, flags, reserved = (
        struct.unpack_from("<IiiIIIII", data, 0)
    )
    result.update({
        "macho": True,
        "cpu_type": cpu_type,
        "cpu_subtype": cpu_subtype,
        "file_type": file_type,
        "load_commands": ncmds,
        "load_commands_size": sizeofcmds,
        "flags": f"0x{flags:08x}",
    })

    segments: list[dict[str, object]] = []
    sections: list[dict[str, object]] = []
    dylibs: list[dict[str, object]] = []
    encryptions: list[dict[str, object]] = []
    symtab: tuple[int, int, int, int] | None = None
    dysymtab: tuple[int, int] | None = None
    function_starts: tuple[int, int] | None = None
    code_signature: dict[str, object] | None = None
    uuid = None
    entryoff = None
    build_versions: list[dict[str, object]] = []
    command_offset = 32

    for _ in range(ncmds):
        if command_offset + 8 > len(data):
            break
        cmd, cmdsize = struct.unpack_from("<II", data, command_offset)
        if cmdsize < 8 or command_offset + cmdsize > len(data):
            break
        if cmd == LC_SEGMENT_64 and cmdsize >= 72:
            values = struct.unpack_from("<II16sQQQQiiII", data, command_offset)
            _, _, raw_name, vmaddr, vmsize, fileoff, filesize, maxprot, initprot, nsects, segflags = values
            segname = raw_name.split(b"\0", 1)[0].decode("ascii", "replace")
            segment = {
                "name": segname,
                "vmaddr": f"0x{vmaddr:x}",
                "vmsize": vmsize,
                "fileoff": fileoff,
                "filesize": filesize,
                "maxprot": maxprot,
                "initprot": initprot,
                "flags": f"0x{segflags:x}",
            }
            segments.append(segment)
            section_offset = command_offset + 72
            for _section_index in range(nsects):
                if section_offset + 80 > command_offset + cmdsize:
                    break
                sectname, raw_segname, addr, size, offset, align, reloff, nreloc, secflags, r1, r2, r3 = struct.unpack_from(
                    "<16s16sQQIIIIIIII", data, section_offset
                )
                sections.append({
                    "segment": raw_segname.split(b"\0", 1)[0].decode("ascii", "replace"),
                    "section": sectname.split(b"\0", 1)[0].decode("ascii", "replace"),
                    "address": f"0x{addr:x}",
                    "size": size,
                    "offset": offset,
                    "align": align,
                    "relocations": nreloc,
                    "flags": f"0x{secflags:x}",
                    "reserved1": r1,
                    "reserved2": r2,
                    "reserved3": r3,
                })
                section_offset += 80
        elif cmd == LC_SYMTAB and cmdsize >= 24:
            _, _, symoff, nsyms, stroff, strsize = struct.unpack_from("<IIIIII", data, command_offset)
            symtab = (symoff, nsyms, stroff, strsize)
        elif cmd == LC_DYSYMTAB and cmdsize >= 80:
            fields = struct.unpack_from("<" + "I" * 20, data, command_offset)
            indirectsymoff = fields[14]
            nindirectsyms = fields[15]
            dysymtab = (indirectsymoff, nindirectsyms)
        elif cmd in DYLIB_COMMANDS and cmdsize >= 24:
            _, _, name_offset, timestamp, current_version, compatibility_version = struct.unpack_from(
                "<IIIIII", data, command_offset
            )
            dylibs.append({
                "command": f"0x{cmd:x}",
                "name": cstring(data, command_offset + name_offset, command_offset + cmdsize),
                "timestamp": timestamp,
                "current_version": version_string(current_version),
                "compatibility_version": version_string(compatibility_version),
            })
        elif cmd == LC_UUID and cmdsize >= 24:
            raw_uuid = data[command_offset + 8:command_offset + 24]
            h = raw_uuid.hex()
            uuid = f"{h[:8]}-{h[8:12]}-{h[12:16]}-{h[16:20]}-{h[20:]}"
        elif cmd in {LC_ENCRYPTION_INFO, LC_ENCRYPTION_INFO_64} and cmdsize >= 20:
            _, _, cryptoff, cryptsize, cryptid = struct.unpack_from("<IIIII", data, command_offset)
            encryptions.append({"offset": cryptoff, "size": cryptsize, "cryptid": cryptid})
        elif cmd == LC_CODE_SIGNATURE and cmdsize >= 16:
            _, _, dataoff, datasize = struct.unpack_from("<IIII", data, command_offset)
            code_signature = {"offset": dataoff, "size": datasize}
        elif cmd == LC_FUNCTION_STARTS and cmdsize >= 16:
            _, _, dataoff, datasize = struct.unpack_from("<IIII", data, command_offset)
            function_starts = (dataoff, datasize)
        elif cmd == LC_MAIN and cmdsize >= 24:
            _, _, entryoff, stacksize = struct.unpack_from("<IIQQ", data, command_offset)
            result["stacksize"] = stacksize
        elif cmd == LC_BUILD_VERSION and cmdsize >= 24:
            _, _, platform, minimum, sdk, ntools = struct.unpack_from("<IIIIII", data, command_offset)
            build_versions.append({
                "platform": platform,
                "minimum": version_string(minimum),
                "sdk": version_string(sdk),
                "tools": ntools,
            })
        command_offset += cmdsize

    result["segments"] = segments
    result["sections"] = sections
    result["dylibs"] = dylibs
    result["encryption"] = encryptions
    result["encrypted"] = any(item["cryptid"] != 0 for item in encryptions)
    result["uuid"] = uuid
    result["entryoff"] = entryoff
    result["build_versions"] = build_versions
    result["code_signature"] = code_signature

    symbols: list[dict[str, object]] = []
    symbol_names: list[str] = []
    if symtab:
        symoff, nsyms, stroff, strsize = symtab
        string_end = min(len(data), stroff + strsize)
        for index in range(nsyms):
            offset = symoff + index * 16
            if offset + 16 > len(data):
                break
            strx, n_type, n_sect, n_desc, n_value = struct.unpack_from("<IBBHQ", data, offset)
            name = cstring(data, stroff + strx, string_end) if strx else ""
            symbol_names.append(name)
            if not name:
                continue
            symbols.append({
                "index": index,
                "name": name,
                "type": f"0x{n_type:02x}",
                "section": n_sect,
                "description": f"0x{n_desc:04x}",
                "value": f"0x{n_value:x}",
                "undefined": (n_type & 0x0E) == 0,
                "external": bool(n_type & 0x01),
            })
    result["symbols"] = symbols

    stubs: list[dict[str, object]] = []
    indirect_pointers: list[dict[str, object]] = []
    if dysymtab and symbol_names:
        indirectsymoff, nindirectsyms = dysymtab
        indirect = []
        for index in range(nindirectsyms):
            offset = indirectsymoff + index * 4
            if offset + 4 > len(data):
                break
            indirect.append(struct.unpack_from("<I", data, offset)[0])
        for section in sections:
            section_type = int(section["flags"], 16) & 0xFF
            if section_type not in {0x06, 0x07, 0x08}:
                continue
            item_size = int(section["reserved2"]) if section_type == 0x08 else 8
            if item_size <= 0:
                continue
            count = int(section["size"]) // item_size
            indirect_base = int(section["reserved1"])
            section_address = int(section["address"], 16)
            for index in range(count):
                indirect_index = indirect_base + index
                if indirect_index >= len(indirect):
                    break
                symbol_index = indirect[indirect_index] & 0x3FFFFFFF
                name = symbol_names[symbol_index] if symbol_index < len(symbol_names) else ""
                entry = {
                    "address": f"0x{section_address + index * item_size:x}",
                    "symbol": name,
                    "symbol_index": symbol_index,
                    "section": section["section"],
                }
                if section_type == 0x08:
                    stubs.append(entry)
                else:
                    indirect_pointers.append(entry)
    result["stubs"] = stubs
    result["indirect_pointers"] = indirect_pointers

    initializers: list[str] = []
    for section in sections:
        if section["section"] != "__mod_init_func":
            continue
        offset = int(section["offset"])
        count = int(section["size"]) // 8
        for index in range(count):
            pointer_offset = offset + index * 8
            if pointer_offset + 8 > len(data):
                break
            initializers.append(f"0x{struct.unpack_from('<Q', data, pointer_offset)[0]:x}")
    result["initializers"] = initializers

    starts: list[str] = []
    text_vmaddr = next((int(s["vmaddr"], 16) for s in segments if s["name"] == "__TEXT"), 0)
    if function_starts:
        dataoff, datasize = function_starts
        blob = data[dataoff:min(len(data), dataoff + datasize)]
        cursor = 0
        address = text_vmaddr
        while cursor < len(blob):
            try:
                delta, cursor = read_uleb(blob, cursor)
            except ValueError:
                break
            if delta == 0:
                break
            address += delta
            starts.append(f"0x{address:x}")
    result["function_starts"] = starts
    result["function_count"] = len(starts)

    string_sections: dict[str, list[str]] = {}
    for section in sections:
        if section["section"] not in {"__cstring", "__objc_methname", "__objc_classname", "__objc_methtype"}:
            continue
        offset = int(section["offset"])
        size = int(section["size"])
        blob = data[offset:min(len(data), offset + size)]
        values = [part.decode("utf-8", "replace") for part in blob.split(b"\0") if part]
        string_sections[f"{section['segment']},{section['section']}"] = values
    result["string_sections"] = string_sections
    return result


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("target", type=Path)
    parser.add_argument("--output", type=Path)
    args = parser.parse_args()
    paths = [args.target]
    if args.target.is_dir():
        paths = sorted(path for path in args.target.rglob("*") if path.is_file())
    records = [record for path in paths if (record := analyze(path))["macho"]]
    output = {"format": "Mach-O inventory v1", "records": records}
    rendered = json.dumps(output, indent=2) + "\n"
    if args.output:
        args.output.write_text(rendered)
    else:
        print(rendered, end="")


if __name__ == "__main__":
    main()
