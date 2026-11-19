#!/usr/bin/env python3
"""Check DEX class coverage, published text, native indexes, and Lua syntax."""
import argparse
import collections
import csv
import hashlib
import json
from pathlib import Path
import re
import struct
import subprocess
import xml.etree.ElementTree as ET
import zipfile
import zlib

from mutf8 import decode_modified_utf8
from collect_artifacts import PATTERNS, ASSIGNED_SECRET, MAX_FILE_BYTES

FORBIDDEN = {'.apk', '.apks', '.dex', '.so', '.dll', '.exe', '.jar', '.class',
             '.zip', '.gz', '.png', '.jpg', '.jpeg', '.webp', '.ttf', '.otf', '.bin'}


def dex_classes(data):
    string_size, string_off = struct.unpack_from('<II', data, 56)
    type_size, type_off = struct.unpack_from('<II', data, 64)
    class_size, class_off = struct.unpack_from('<II', data, 96)
    names = set()
    for n in range(class_size):
        type_index = struct.unpack_from('<I', data, class_off + n * 32)[0]
        if type_index >= type_size:
            raise ValueError('Invalid class type index')
        string_index = struct.unpack_from('<I', data, type_off + type_index * 4)[0]
        if string_index >= string_size:
            raise ValueError('Invalid class descriptor index')
        position = struct.unpack_from('<I', data, string_off + string_index * 4)[0]
        while data[position] & 128:
            position += 1
        position += 1
        end = data.index(0, position)
        names.add(decode_modified_utf8(data[position:end]))
    return names


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('--apk', type=Path, required=True)
    parser.add_argument('--root', type=Path, required=True)
    parser.add_argument('--luau-compile', type=Path, required=True)
    parser.add_argument('--jadx-log', type=Path)
    parser.add_argument('--git-repo', type=Path)
    args = parser.parse_args()
    root = args.root
    issues, classes = [], []
    with zipfile.ZipFile(args.apk) as archive:
        for member in sorted(archive.namelist()):
            if not re.fullmatch(r'classes\d*\.dex', member):
                continue
            data = archive.read(member)
            wanted = dex_classes(data)
            folder = 'smali' if member == 'classes.dex' else 'smali_' + member[:-4]
            actual = set()
            duplicate = 0
            for src in (root / 'decompiled/smali' / folder).rglob('*.smali'):
                with src.open() as f:
                    for line in f:
                        if line.startswith('.class '):
                            name = line.split()[-1]
                            duplicate += name in actual
                            actual.add(name)
                            break
            sha1_ok = hashlib.sha1(data[32:]).digest() == data[12:32]
            adler_ok = zlib.adler32(data[12:]) & 0xffffffff == struct.unpack_from('<I', data, 8)[0]
            record = {'dex': member, 'class_defs': len(wanted), 'smali_class_descriptors': len(actual), 'missing': sorted(wanted - actual), 'unexpected': sorted(actual - wanted), 'duplicate_descriptors': duplicate, 'dex_sha1_ok': sha1_ok, 'dex_adler32_ok': adler_ok}
            classes.append(record)
            if wanted != actual or duplicate or not sha1_ok or not adler_ok:
                issues.append({'kind': 'dex-coverage', 'path': member})

    byte_count, file_count, xml_count = 0, 0, 0
    file_hashes = {}
    largest = []
    # The verification file is regenerated after the scan; its previous bytes
    # do not contribute to these snapshot counts.
    for src in sorted(root.rglob('*')):
        if not src.is_file() or '__pycache__' in src.parts or src.name == 'verification.json':
            continue
        rel = src.relative_to(root).as_posix()
        data = src.read_bytes()
        file_hashes[rel] = hashlib.sha1(b'blob ' + str(len(data)).encode() + b'\0' + data).hexdigest()
        file_count += 1
        byte_count += len(data)
        largest.append((len(data), rel))
        if src.suffix.lower() in FORBIDDEN or data.startswith((b'\x7fELF', b'PK\x03\x04', b'dex\n', b'MZ')):
            issues.append({'kind': 'forbidden-binary', 'path': rel})
        if len(data) > MAX_FILE_BYTES:
            issues.append({'kind': 'over-size-limit', 'path': rel, 'bytes': len(data)})
        try:
            text = data.decode('utf-8')
            if '\0' in text:
                raise ValueError('NUL byte')
        except (UnicodeError, ValueError):
            issues.append({'kind': 'non-text', 'path': rel})
            continue
        for kind, pattern in PATTERNS.items():
            for match in pattern.finditer(text):
                issues.append({'kind': 'credential-pattern:' + kind, 'path': rel, 'line': text.count('\n', 0, match.start()) + 1, 'sha256': hashlib.sha256(match.group().encode()).hexdigest()})
        for match in ASSIGNED_SECRET.finditer(text):
            if not match[2].startswith('[REDACTED_'):
                issues.append({'kind': 'assigned-secret-candidate', 'path': rel, 'line': text.count('\n', 0, match.start()) + 1, 'sha256': hashlib.sha256(match[2].encode()).hexdigest()})
        if src.suffix == '.xml':
            try:
                ET.fromstring(text)
                xml_count += 1
            except ET.ParseError:
                issues.append({'kind': 'xml-parse', 'path': rel})

    natives = []
    for index in sorted((root / 'data').glob('*/functions.tsv')):
        with index.open() as f:
            rows = list(csv.DictReader(f, delimiter='\t'))
        counts = collections.Counter(r['status'] for r in rows)
        for row in rows:
            if int(row['address'], 16) - int(row['elf_vaddr'], 16) != 0x100000:
                issues.append({'kind': 'native-address-map', 'path': str(index), 'address': row['address']})
            for field in ('pseudocode', 'disassembly'):
                if row[field] and not (root / row[field]).is_file():
                    issues.append({'kind': 'missing-native-artifact', 'path': row[field]})
        natives.append({'library': index.parent.name, 'indexed_functions': len(rows), 'statuses': dict(counts)})

    lua_results = []
    for src in sorted((root / 'decompiled/decoded').glob('*.lua')):
        result = subprocess.run([str(args.luau_compile.resolve()), '--only-parse', str(src)], capture_output=True, text=True)
        lua_results.append({'path': src.relative_to(root).as_posix(), 'sha256': hashlib.sha256(src.read_bytes()).hexdigest(), 'bytes': src.stat().st_size, 'parse_exit': result.returncode})
        if result.returncode:
            issues.append({'kind': 'lua-parse', 'path': src.relative_to(root).as_posix(), 'diagnostic': result.stderr[:2000]})
    if len(lua_results) != 4:
        issues.append({'kind': 'lua-buffer-count', 'count': len(lua_results)})

    git_entries = None
    if args.git_repo:
        prefix = root.resolve().relative_to(args.git_repo.resolve()).as_posix()
        listing = subprocess.check_output(['git', '-C', str(args.git_repo), 'ls-files', '-s', '-z', '--', prefix])
        staged = {}
        for item in listing.split(b'\0'):
            if not item:
                continue
            metadata, path = item.split(b'\t', 1)
            relative = path.decode()[len(prefix) + 1:]
            if relative == 'reports/verification.json':
                continue
            staged[relative] = metadata.split()[1].decode()
        git_entries = len(staged)
        for relative in sorted(set(file_hashes) | set(staged)):
            if file_hashes.get(relative) != staged.get(relative):
                issues.append({'kind': 'git-index-content-or-membership', 'path': relative})

    jadx_errors = None
    if args.jadx_log:
        match = re.search(r'finished with errors, count: (\d+)', args.jadx_log.read_text())
        jadx_errors = int(match[1]) if match else 0
    report = {'result': 'pass' if not issues else 'fail', 'scope': 'Static structure and publication checks; no Android/executor runtime validation', 'apk_sha256': hashlib.sha256(args.apk.read_bytes()).hexdigest(), 'files_scanned': file_count, 'bytes_scanned': byte_count, 'xml_documents_parsed': xml_count, 'dex_coverage': classes, 'native_exports': natives, 'recovered_lua_syntax': lua_results, 'jadx_reported_errors': jadx_errors, 'verified_git_index_entries': git_entries, 'largest_files': [{'bytes': size, 'path': path} for size, path in sorted(largest, reverse=True)[:10]], 'issues': issues}
    target = root / 'reports/verification.json'
    target.parent.mkdir(parents=True, exist_ok=True)
    target.write_text(json.dumps(report, indent=2) + '\n')
    print(json.dumps({'result': report['result'], 'files': file_count, 'bytes': byte_count, 'issues': len(issues), 'dex_classes': sum(x['class_defs'] for x in classes), 'lua_files': len(lua_results)}))
    if issues:
        raise SystemExit(1)


if __name__ == '__main__':
    main()
