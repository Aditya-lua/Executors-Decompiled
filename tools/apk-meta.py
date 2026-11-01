#!/usr/bin/env python3
"""Structural metadata for an APK without decompiling it.

Reads the manifest and signature block statically, inventories DEX and native
code, and writes a machine-readable JSON record plus a short human summary.
Nothing in the APK is executed.

    ./apk-meta.py target.apk [--json target.meta.json]
"""

from __future__ import annotations

import argparse
import hashlib
import io
import json
import sys
import zipfile
from collections import Counter, defaultdict
from pathlib import Path

from loguru import logger

logger.remove()  # androguard logs every AXML tag at DEBUG otherwise

from androguard.core.apk import APK  # noqa: E402
from androguard.core.dex import DEX  # noqa: E402
from elftools.elf.elffile import ELFFile  # noqa: E402

NATIVE_DIR = "lib/"
INTERESTING_SUFFIXES = (
    ".so", ".dex", ".jar", ".apk", ".zip", ".bin", ".dat", ".pak", ".assets",
    ".luac", ".lua", ".luauc", ".enc", ".obb", ".db", ".json", ".kotlin_module",
)


def digest(data: bytes, algo: str = "sha256") -> str:
    return hashlib.new(algo, data).hexdigest()


def file_hashes(path: Path) -> dict[str, str]:
    sha256 = hashlib.sha256()
    md5 = hashlib.md5()
    with path.open("rb") as handle:
        for chunk in iter(lambda: handle.read(1024 * 1024), b""):
            sha256.update(chunk)
            md5.update(chunk)
    return {"sha256": sha256.hexdigest(), "md5": md5.hexdigest()}


def zip_inventory(path: Path) -> dict:
    with zipfile.ZipFile(path) as archive:
        infos = archive.infolist()
        names = [info.filename for info in infos]
        duplicates = sorted({name for name, count in Counter(names).items() if count > 1})
        top_level: Counter[str] = Counter()
        for name in names:
            top_level[name.split("/", 1)[0]] += 1
        suffix_bytes: dict[str, int] = defaultdict(int)
        for info in infos:
            suffix = Path(info.filename).suffix.lower()
            if suffix:
                suffix_bytes[suffix] += info.file_size
        signing = [name for name in names if name.upper().startswith("META-INF/")
                   and name.upper().endswith((".RSA", ".DSA", ".EC", ".SF"))]
        return {
            "member_count": len(infos),
            "uncompressed_bytes": sum(info.file_size for info in infos),
            "top_level": dict(top_level.most_common()),
            "duplicate_members": duplicates,
            "largest_suffix_bytes": dict(
                sorted(suffix_bytes.items(), key=lambda item: item[1], reverse=True)[:12]
            ),
            "v1_signing_files": sorted(signing),
            "largest_members": [
                {"name": info.filename, "bytes": info.file_size, "packed": info.compress_size}
                for info in sorted(infos, key=lambda i: i.file_size, reverse=True)[:15]
            ],
            "has_v2_or_v3_block": b"APK Sig Block 42" in path.read_bytes()[:8 * 1024 * 1024][-1024 * 1024:]
            if path.stat().st_size < 8 * 1024 * 1024 else signing_block_present(path),
        }


def signing_block_present(path: Path) -> bool:
    """Locate the APK Signing Block magic that precedes the ZIP central directory."""
    with path.open("rb") as handle:
        handle.seek(0, 2)
        end = handle.tell()
        # The block sits immediately before the end-of-central-directory record.
        handle.seek(max(0, end - 1024 * 1024))
        tail = handle.read()
    return b"APK Sig Block 42" in tail


def dex_inventory(path: Path) -> list[dict]:
    records = []
    with zipfile.ZipFile(path) as archive:
        for name in sorted(n for n in archive.namelist()
                           if n.startswith("classes") and n.endswith(".dex")):
            raw = archive.read(name)
            try:
                dex = DEX(raw)
                classes = list(dex.get_classes())
                methods = sum(len(list(cls.get_methods())) for cls in classes)
                strings = len(list(dex.get_strings()))
                records.append({
                    "name": name,
                    "bytes": len(raw),
                    "sha256": digest(raw),
                    "class_count": len(classes),
                    "method_count": methods,
                    "string_count": strings,
                })
            except Exception as error:  # noqa: BLE001 - unparsable DEX is reported, not fatal
                records.append({"name": name, "bytes": len(raw), "error": str(error)[:200]})
    return records


def native_inventory(path: Path) -> list[dict]:
    records = []
    with zipfile.ZipFile(path) as archive:
        for name in sorted(n for n in archive.namelist()
                           if n.startswith(NATIVE_DIR) and n.endswith(".so")):
            raw = archive.read(name)
            record = {"name": name, "bytes": len(raw), "sha256": digest(raw)}
            try:
                elf = ELFFile(io.BytesIO(raw))
                record.update({
                    "elf_class": elf.elfclass,
                    "machine": elf.get_machine_arch(),
                    "type": elf["e_type"],
                    "soname": next((s.name for s in elf.iter_sections()
                                    if s.name.startswith(".note.gnu.build-id")), None),
                    "sections": [s.name for s in elf.iter_sections()][:24],
                    "build_id": None,
                    "imported_symbol_count": sum(
                        1 for section in elf.iter_sections()
                        if section.header["sh_type"] == "SHT_DYNSYM"
                        for _ in section.iter_symbols()
                    ),
                })
                for section in elf.iter_sections():
                    if section.header["sh_type"] == "SHT_NOTE":
                        data = section.data()
                        if b"GNU\x00" in data:
                            record["build_id"] = data[-20:].hex()
                            break
            except Exception as error:  # noqa: BLE001 - non-ELF payloads stay listed
                record["elf_error"] = str(error)[:200]
            records.append(record)
    return records


def manifest_record(apk: APK) -> dict:
    certificates = []
    for cert in apk.get_certificates() or []:
        certificates.append({
            "sha256": cert.sha256_fingerprint,
            "sha1": cert.sha1_fingerprint,
            "subject": cert.subject.human_friendly if hasattr(cert.subject, "human_friendly") else str(cert.subject),
            "issuer": cert.issuer.human_friendly if hasattr(cert.issuer, "human_friendly") else str(cert.issuer),
            "not_valid_before": str(cert.not_valid_before),
            "not_valid_after": str(cert.not_valid_after),
            "self_signed": cert.self_signed if isinstance(getattr(cert, "self_signed", None), bool) else None,
        })

    def attr(tag: str, name: str):
        try:
            return apk.get_attribute_value(tag, name)
        except Exception:  # noqa: BLE001 - attribute support varies by androguard build
            return None

    return {
        "package": apk.get_package(),
        "version_name": apk.get_androidversion_name(),
        "version_code": apk.get_androidversion_code(),
        "min_sdk": apk.get_min_sdk_version(),
        "target_sdk": apk.get_target_sdk_version(),
        "effective_target_sdk": apk.get_effective_target_sdk_version()
        if hasattr(apk, "get_effective_target_sdk_version") else None,
        "application_label": apk.get_app_name(),
        "permissions": sorted(apk.get_permissions()),
        "declared_permissions": sorted(apk.get_declared_permissions()),
        "features": apk.get_features(),
        "activities": apk.get_activities(),
        "services": apk.get_services(),
        "receivers": apk.get_receivers(),
        "providers": apk.get_providers(),
        "main_activity": apk.get_main_activity(),
        "application_flags": {
            "debuggable": attr("application", "debuggable"),
            "allow_backup": attr("application", "allowBackup"),
            "uses_cleartext_traffic": attr("application", "usesCleartextTraffic"),
            "network_security_config": attr("application", "networkSecurityConfig"),
            "extract_native_libs": attr("application", "extractNativeLibs"),
        },
        "certificates": certificates,
    }


def main() -> None:
    parser = argparse.ArgumentParser(description=__doc__,
                                     formatter_class=argparse.RawDescriptionHelpFormatter)
    parser.add_argument("apk", type=Path)
    parser.add_argument("--json", type=Path, default=None, help="write JSON record here")
    args = parser.parse_args()

    target: Path = args.apk
    record: dict = {"file": {"path": str(target.resolve()),
                             "bytes": target.stat().st_size,
                             **file_hashes(target)}}
    record["zip"] = zip_inventory(target)
    record["dex"] = dex_inventory(target)
    record["native"] = native_inventory(target)

    try:
        apk = APK(str(target))
        record["manifest"] = manifest_record(apk)
    except Exception as error:  # noqa: BLE001 - a malformed manifest must not hide the rest
        record["manifest"] = {"error": str(error)[:300]}

    with zipfile.ZipFile(target) as archive:
        record["interesting_members"] = sorted(
            ({"name": n, "bytes": archive.getinfo(n).file_size}
             for n in archive.namelist() if n.lower().endswith(INTERESTING_SUFFIXES)),
            key=lambda item: item["bytes"], reverse=True,
        )[:40]

    out = args.json or target.with_suffix(".meta.json")
    out.write_text(json.dumps(record, indent=2))

    manifest = record["manifest"]
    print(f"APK        {target.name}  ({record['file']['bytes']:,} bytes)")
    print(f"SHA-256    {record['file']['sha256']}")
    print(f"package    {manifest.get('package')}  version {manifest.get('version_name')} "
          f"({manifest.get('version_code')})")
    print(f"SDK        min {manifest.get('min_sdk')}  target {manifest.get('target_sdk')}")
    print(f"permissions {len(manifest.get('permissions') or [])}")
    print(f"components activities={len(manifest.get('activities') or [])} "
          f"services={len(manifest.get('services') or [])} "
          f"receivers={len(manifest.get('receivers') or [])} "
          f"providers={len(manifest.get('providers') or [])}")
    for cert in manifest.get("certificates") or []:
        print(f"signer     {cert['sha256']}  subject={cert['subject']}")
    total_classes = sum(d.get("class_count", 0) for d in record["dex"])
    total_methods = sum(d.get("method_count", 0) for d in record["dex"])
    print(f"DEX        {len(record['dex'])} files  {total_classes} classes  "
          f"{total_methods} methods")
    print(f"native     {len(record['native'])} libraries")
    for lib in record["native"]:
        print(f"  - {lib['name']}  {lib['bytes']:,} bytes  {lib.get('machine', '?')}  "
              f"build-id {lib.get('build_id')}")
    print(f"JSON       {out}")


if __name__ == "__main__":
    sys.exit(main())
