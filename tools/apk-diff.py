#!/usr/bin/env python3
"""Member-level diff of two APKs, including native library byte offsets.

Reproduces the comparison method used for the Arceus X V5/NEO pair: compare
ZIP members by content, then locate the exact differing offsets inside any
changed native library and map them to ELF sections.

    ./apk-diff.py a.apk b.apk [--json diff.json] [--max-offsets 20]

Nothing is executed; both inputs are read only.
"""

from __future__ import annotations

import argparse
import hashlib
import io
import json
import sys
import zipfile
from pathlib import Path

from loguru import logger

logger.remove()

from androguard.core.apk import APK  # noqa: E402
from elftools.elf.elffile import ELFFile  # noqa: E402


def sha256(data: bytes) -> str:
    return hashlib.sha256(data).hexdigest()


def read_members(path: Path) -> dict[str, bytes]:
    with zipfile.ZipFile(path) as archive:
        return {info.filename: archive.read(info) for info in archive.infolist()}


def elffile_sections(raw: bytes) -> list[tuple[str, int, int]]:
    """Section name and [start, end) file-offset ranges, best effort."""
    try:
        elf = ELFFile(io.BytesIO(raw))
    except Exception:  # noqa: BLE001 - non-ELF payloads still get byte offsets
        return []
    ranges = []
    for section in elf.iter_sections():
        offset = section.header["sh_offset"]
        size = section.header["sh_size"]
        if section.header["sh_type"] != "SHT_NOBITS" and size:
            ranges.append((section.name, offset, offset + size))
    return ranges


def byte_diff(a: bytes, b: bytes, limit: int) -> dict:
    if len(a) != len(b):
        return {"size_delta": len(b) - len(a), "offsets": [], "offsets_comparable": False}
    offsets = [i for i in range(len(a)) if a[i] != b[i]]
    sections = elffile_sections(a) or elffile_sections(b)
    detail = []
    for offset in offsets[:limit]:
        section = next((name for name, start, end in sections if start <= offset < end), None)
        detail.append({
            "offset": f"0x{offset:x}",
            "a": f"0x{a[offset]:02x}",
            "b": f"0x{b[offset]:02x}",
            "section": section,
        })
    return {
        "size_delta": 0,
        "differing_bytes": len(offsets),
        "offsets_comparable": True,
        "sections_touched": sorted({d["section"] for d in detail if d["section"]}),
        "offsets": detail,
    }


def manifest_facts(path: Path) -> dict:
    try:
        apk = APK(str(path))
        return {
            "package": apk.get_package(),
            "version_name": apk.get_androidversion_name(),
            "version_code": apk.get_androidversion_code(),
            "min_sdk": apk.get_min_sdk_version(),
            "target_sdk": apk.get_target_sdk_version(),
            "permissions": sorted(apk.get_permissions()),
            "activities": sorted(apk.get_activities()),
            "services": sorted(apk.get_services()),
            "receivers": sorted(apk.get_receivers()),
            "providers": sorted(apk.get_providers()),
            "certificates": sorted(
                c.sha256_fingerprint for c in (apk.get_certificates() or [])
            ),
        }
    except Exception as error:  # noqa: BLE001
        return {"error": str(error)[:300]}


def set_diff(a: list[str], b: list[str]) -> dict:
    return {"only_a": sorted(set(a) - set(b)), "only_b": sorted(set(b) - set(a))}


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__,
                                     formatter_class=argparse.RawDescriptionHelpFormatter)
    parser.add_argument("a", type=Path)
    parser.add_argument("b", type=Path)
    parser.add_argument("--json", type=Path, default=None)
    parser.add_argument("--max-offsets", type=int, default=20)
    parser.add_argument("--max-members", type=int, default=200,
                        help="cap on changed members listed in detail")
    args = parser.parse_args()

    a_members = read_members(args.a)
    b_members = read_members(args.b)

    only_a = sorted(set(a_members) - set(b_members))
    only_b = sorted(set(b_members) - set(a_members))
    common = sorted(set(a_members) & set(b_members))
    changed = [name for name in common if a_members[name] != b_members[name]]

    record: dict = {
        "a": {"path": str(args.a.resolve()), "bytes": args.a.stat().st_size,
              "sha256": sha256(args.a.read_bytes()), "members": len(a_members)},
        "b": {"path": str(args.b.resolve()), "bytes": args.b.stat().st_size,
              "sha256": sha256(args.b.read_bytes()), "members": len(b_members)},
        "only_in_a": only_a,
        "only_in_b": only_b,
        "identical_members": len(common) - len(changed),
        "changed_members": [],
    }

    for name in changed[: args.max_members]:
        entry: dict = {
            "name": name,
            "sha256_a": sha256(a_members[name]),
            "sha256_b": sha256(b_members[name]),
            "size_a": len(a_members[name]),
            "size_b": len(b_members[name]),
        }
        if name.startswith("lib/") and name.endswith(".so") \
                and len(a_members[name]) == len(b_members[name]):
            entry["byte_diff"] = byte_diff(a_members[name], b_members[name], args.max_offsets)
        record["changed_members"].append(entry)
    if len(changed) > args.max_members:
        record["changed_members_truncated"] = len(changed) - args.max_members

    fa, fb = manifest_facts(args.a), manifest_facts(args.b)
    record["manifest_diff"] = {
        key: {"a": fa.get(key), "b": fb.get(key)}
        for key in fa
        if fa.get(key) != fb.get(key)
    }
    if "activities" in record["manifest_diff"]:
        record["manifest_diff"]["activities"]["set"] = set_diff(fa["activities"], fb["activities"])
    if "permissions" in record["manifest_diff"]:
        record["manifest_diff"]["permissions"]["set"] = set_diff(fa["permissions"], fb["permissions"])

    out = args.json or (args.a.with_suffix("") .with_name(args.a.stem + "-vs-" + args.b.stem + ".diff.json"))
    out.write_text(json.dumps(record, indent=2))

    print(f"A  {args.a.name}  {record['a']['bytes']:,} B  {record['a']['sha256'][:16]}…  {len(a_members)} members")
    print(f"B  {args.b.name}  {record['b']['bytes']:,} B  {record['b']['sha256'][:16]}…  {len(b_members)} members")
    print(f"identical members  {record['identical_members']}")
    print(f"changed members    {len(changed)}")
    for entry in record["changed_members"]:
        line = f"  ~ {entry['name']}  {entry['size_a']:,} B"
        if "byte_diff" in entry:
            diff = entry["byte_diff"]
            if diff.get("offsets_comparable"):
                line += f"  {diff['differing_bytes']} byte(s) differ"
                if diff["sections_touched"]:
                    line += f" in {', '.join(diff['sections_touched'])}"
                for offset in diff["offsets"][:6]:
                    line += f"\n      {offset['offset']}  {offset['a']} -> {offset['b']}  {offset['section'] or '?'}"
            else:
                line += f"  size delta {diff['size_delta']:+d}"
        print(line)
    if record.get("changed_members_truncated"):
        print(f"  … {record['changed_members_truncated']} more changed members")
    print(f"only in A          {len(only_a)}")
    for name in only_a[:10]:
        print(f"  - {name}")
    print(f"only in B          {len(only_b)}")
    for name in only_b[:10]:
        print(f"  + {name}")
    if record["manifest_diff"]:
        print("manifest differences")
        for key in record["manifest_diff"]:
            print(f"  {key}: {fa.get(key)!r} -> {fb.get(key)!r}"
                  if not isinstance(record["manifest_diff"][key], dict)
                  else f"  {key}: {len(record['manifest_diff'][key]['set']['only_a'])} only in A, "
                       f"{len(record['manifest_diff'][key]['set']['only_b'])} only in B")
    print(f"JSON               {out}")


if __name__ == "__main__":
    sys.exit(main())
