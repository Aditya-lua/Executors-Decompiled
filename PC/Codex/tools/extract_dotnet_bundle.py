#!/usr/bin/env python3
"""Extract a .NET single-file bundle (format v1-v6) without executing it."""

import argparse
import json
import os
import struct
import zlib
from pathlib import Path, PurePosixPath

SIGNATURE = bytes.fromhex(
    "8b1202b96a612038727b930214d7a03213f5b9e6efae3318ee3b2dce24b36aae"
)


def read7(fp):
    value = shift = 0
    for _ in range(5):
        byte = fp.read(1)
        if not byte:
            raise EOFError("unexpected end while reading 7-bit integer")
        byte = byte[0]
        value |= (byte & 0x7F) << shift
        if not (byte & 0x80):
            return value
        shift += 7
    raise ValueError("invalid 7-bit integer")


def read_string(fp):
    return fp.read(read7(fp)).decode("utf-8")


def unpack(fp, fmt):
    size = struct.calcsize(fmt)
    data = fp.read(size)
    if len(data) != size:
        raise EOFError("truncated bundle header")
    return struct.unpack(fmt, data)


def safe_output(root, rel):
    posix = PurePosixPath(rel.replace("\\", "/"))
    if posix.is_absolute() or ".." in posix.parts:
        raise ValueError(f"unsafe bundle path: {rel!r}")
    return root.joinpath(*posix.parts)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("bundle", type=Path)
    ap.add_argument("output", type=Path)
    args = ap.parse_args()

    raw = args.bundle.read_bytes()
    sig_at = raw.find(SIGNATURE)
    if sig_at < 8:
        raise SystemExit(".NET bundle signature not found")
    header_at = struct.unpack_from("<q", raw, sig_at - 8)[0]

    entries = []
    with args.bundle.open("rb") as fp:
        fp.seek(header_at)
        major, minor, count = unpack(fp, "<III")
        bundle_id = read_string(fp)
        deps_offset, deps_size, runtime_offset, runtime_size = unpack(fp, "<qqqq")
        flags = unpack(fp, "<Q")[0] if major >= 2 else 0
        for _ in range(count):
            offset, size = unpack(fp, "<qq")
            compressed = unpack(fp, "<q")[0] if major >= 6 else 0
            file_type = unpack(fp, "<B")[0]
            path = read_string(fp)
            entries.append({
                "path": path,
                "offset": offset,
                "size": size,
                "compressed_size": compressed,
                "type": file_type,
            })

    args.output.mkdir(parents=True, exist_ok=True)
    with args.bundle.open("rb") as fp:
        for entry in entries:
            out = safe_output(args.output, entry["path"])
            out.parent.mkdir(parents=True, exist_ok=True)
            fp.seek(entry["offset"])
            stored = fp.read(entry["compressed_size"] or entry["size"])
            if entry["compressed_size"]:
                try:
                    data = zlib.decompress(stored, -zlib.MAX_WBITS)
                except zlib.error:
                    data = zlib.decompress(stored)
            else:
                data = stored
            if len(data) != entry["size"]:
                raise ValueError(f"size mismatch for {entry['path']}")
            out.write_bytes(data)

    manifest = {
        "source": str(args.bundle),
        "signature_offset": sig_at,
        "header_offset": header_at,
        "major": major,
        "minor": minor,
        "bundle_id": bundle_id,
        "deps_json": {"offset": deps_offset, "size": deps_size},
        "runtimeconfig_json": {"offset": runtime_offset, "size": runtime_size},
        "flags": flags,
        "file_count": count,
        "entries": entries,
    }
    (args.output / "bundle-manifest.json").write_text(
        json.dumps(manifest, indent=2), encoding="utf-8"
    )
    print(f"extracted {count} files from bundle v{major}.{minor} ({bundle_id})")


if __name__ == "__main__":
    main()
