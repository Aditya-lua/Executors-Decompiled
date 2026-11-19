#!/usr/bin/env python3
"""Collect derived UTF-8 text, metadata, and audit indexes from a static APK recovery.

Never copies APKs, DEX, native binaries, binary assets, or tool executables.
Requires pyelftools and androguard for metadata; target code is never executed.
"""
import argparse
import collections
import hashlib
import io
import json
from pathlib import Path, PurePosixPath
import re
import struct
import zipfile

from elftools.elf.elffile import ELFFile
from androguard.core.apk import APK
from loguru import logger

MAX_FILE_BYTES = 8 * 1024 * 1024
TEXT_EXTENSIONS = {'.java', '.smali', '.xml', '.json', '.txt', '.csv', '.lua',
                   '.luau', '.js', '.html', '.css', '.md', '.properties',
                   '.proto', '.yml', '.yaml', '.c', '.h', '.asm', '.tsv'}
PATTERNS = {
    'github-token': re.compile(r'\b(?:gh[pousr]_[A-Za-z0-9]{20,}|github_pat_[A-Za-z0-9_]{30,})\b'),
    'google-api-key': re.compile(r'\bAIza[0-9A-Za-z_-]{30,}\b'),
    'openai-api-key': re.compile(r'\bsk-(?:proj-|svcacct-)?[A-Za-z0-9_-]{30,}\b'),
    'aws-access-key': re.compile(r'\b(?:AKIA|ASIA)[A-Z0-9]{16}\b'),
    'slack-token': re.compile(r'\bxox[baprs]-[A-Za-z0-9-]{20,}\b'),
    'discord-webhook': re.compile(r'https://(?:canary\.|ptb\.)?discord(?:app)?\.com/api/webhooks/\d+/[A-Za-z0-9_-]+'),
    'discord-token': re.compile(r'\b(?:mfa\.[A-Za-z0-9_-]{80,}|[MN][A-Za-z0-9_-]{23,27}\.[A-Za-z0-9_-]{6}\.[A-Za-z0-9_-]{27,110})\b'),
    'jwt': re.compile(r'\beyJ[A-Za-z0-9_-]{8,}\.[A-Za-z0-9_-]{8,}\.[A-Za-z0-9_-]{8,}\b'),
    'roblox-cookie': re.compile(r'_\|WARNING:-DO-NOT-SHARE-THIS\.[^\s"\x27<>]+'),
    'private-key': re.compile(r'-----BEGIN (?:RSA |EC |OPENSSH )?PRIVATE KEY-----[\s\S]*?-----END (?:RSA |EC |OPENSSH )?PRIVATE KEY-----'),
}
ASSIGNED_SECRET = re.compile(
    r'(?i)(\b(?:api[_-]?key|api[_-]?secret|client[_-]?secret|access[_-]?token|'
    r'auth[_-]?token|authorization|password|passwd|bearer[_-]?token)\b'
    r'\s*[=:]\s*["\x27])([A-Za-z0-9_./+=:-]{16,})(["\x27])')


def digest(data):
    return hashlib.sha256(data).hexdigest()


def dump_json(path, value):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(value, indent=2, ensure_ascii=False) + '\n', encoding='utf-8')


def main():
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument('--apk', type=Path, required=True)
    p.add_argument('--jadx', type=Path, required=True)
    p.add_argument('--apktool', type=Path, required=True)
    p.add_argument('--native', type=Path, action='append', default=[])
    p.add_argument('--decoded', type=Path)
    p.add_argument('--out', type=Path, required=True)
    a = p.parse_args()
    out = a.out.resolve()
    redactions, excluded, included = [], [], []
    sensitive_initializers = set()
    if a.decoded:
        candidates = a.decoded / 'initializer-string-candidates.json'
        if candidates.exists():
            for record in json.loads(candidates.read_text()):
                if any(regex.search(record['value']) for regex in PATTERNS.values()):
                    sensitive_initializers.add(int(record['initializer_elf_vaddr'], 16))

    def publish(relative, data, origin):
        rel = PurePosixPath(relative)
        if rel.is_absolute() or '..' in rel.parts:
            raise ValueError('Unsafe output path')
        if len(data) > MAX_FILE_BYTES:
            if rel.suffix.lower() == '.tsv':
                rows = data.splitlines(keepends=True)
                header = rows[0]
                chunk, size, number = [header], len(header), 1
                for row in rows[1:]:
                    if size + len(row) > MAX_FILE_BYTES // 2 and len(chunk) > 1:
                        publish(str(rel.with_name(rel.stem + f'-{number:04d}.tsv')), b''.join(chunk), origin)
                        chunk, size, number = [header], len(header), number + 1
                    chunk.append(row)
                    size += len(row)
                if len(chunk) > 1:
                    publish(str(rel.with_name(rel.stem + f'-{number:04d}.tsv')), b''.join(chunk), origin)
                return
            excluded.append({'origin': origin, 'reason': 'over-8-MiB-text-limit', 'bytes': len(data), 'sha256': digest(data)})
            return
        if rel.suffix.lower() not in TEXT_EXTENSIONS:
            excluded.append({'origin': origin, 'reason': 'extension-not-allowed', 'bytes': len(data)})
            return
        try:
            text = data.decode('utf-8-sig')
            if '\x00' in text:
                raise ValueError('NUL byte')
        except (UnicodeError, ValueError):
            excluded.append({'origin': origin, 'reason': 'non-text', 'bytes': len(data), 'sha256': digest(data)})
            return

        def redact(kind, value, position):
            h = digest(value.encode('utf-8'))
            redactions.append({'path': str(rel), 'kind': kind, 'line': text.count('\n', 0, position) + 1, 'value_sha256': h})
            return '[REDACTED_' + kind.upper().replace('-', '_') + '_' + h[:12] + ']'

        for kind, regex in PATTERNS.items():
            text = regex.sub(lambda m: redact(kind, m.group(), m.start()), text)
        text = ASSIGNED_SECRET.sub(lambda m: m[1] + redact('assigned-secret-candidate', m[2], m.start(2)) + m[3], text)
        target = out.joinpath(*rel.parts)
        target.parent.mkdir(parents=True, exist_ok=True)
        target.write_text(text, encoding='utf-8')
        included.append({'path': str(rel), 'origin': origin, 'input_sha256': digest(data), 'published_sha256': digest(target.read_bytes()), 'bytes': target.stat().st_size})

    apk_bytes = a.apk.read_bytes()
    with zipfile.ZipFile(io.BytesIO(apk_bytes)) as z:
        members, dexes, libraries = [], [], []
        for info in z.infolist():
            if info.is_dir():
                continue
            data = z.read(info)
            members.append({'path': info.filename, 'bytes': len(data), 'compressed_bytes': info.compress_size, 'crc32': f'{info.CRC:08x}', 'sha256': digest(data)})
            if re.fullmatch(r'classes\d*\.dex', info.filename):
                header = struct.unpack_from('<20I', data, 32)
                dexes.append({'path': info.filename, 'bytes': len(data), 'sha256': digest(data), 'magic': data[:8].decode('ascii'), 'string_ids': header[6], 'type_ids': header[8], 'method_ids': header[14], 'class_defs': header[16]})
            if info.filename.startswith('assets/'):
                publish('decompiled/assets/' + info.filename[7:], data, 'apk:' + info.filename)
            elif info.filename.endswith(('.properties', '.proto')) and not info.filename.startswith(('META-INF/', 'lib/')):
                publish('decompiled/metadata/' + info.filename, data, 'apk:' + info.filename)
            if info.filename.startswith('lib/') and info.filename.endswith('.so'):
                e = ELFFile(io.BytesIO(data))
                sections = [{'name': s.name, 'address': hex(s['sh_addr']), 'file_offset': hex(s['sh_offset']), 'bytes': s['sh_size'], 'type': s['sh_type'], 'flags': s['sh_flags']} for s in e.iter_sections()]
                imports, exports = [], []
                sym = e.get_section_by_name('.dynsym')
                if sym:
                    for s in sym.iter_symbols():
                        if not s.name:
                            continue
                        record = {'name': s.name, 'address': hex(s['st_value']), 'bytes': s['st_size'], 'type': s['st_info']['type'], 'binding': s['st_info']['bind']}
                        (imports if s['st_shndx'] == 'SHN_UNDEF' else exports).append(record)
                needed = []
                dynamic = e.get_section_by_name('.dynamic')
                if dynamic:
                    needed = [t.needed for t in dynamic.iter_tags() if t.entry.d_tag == 'DT_NEEDED']
                record = {'path': info.filename, 'bytes': len(data), 'sha256': digest(data), 'machine': e['e_machine'], 'class': e.elfclass, 'little_endian': e.little_endian, 'needed': needed, 'imports': len(imports), 'exports': len(exports), 'defined_functions': sum(s['type'] == 'STT_FUNC' for s in exports)}
                libraries.append(record)
                name = PurePosixPath(info.filename).name
                dump_json(out / 'data/elf' / (name + '.json'), {**record, 'sections': sections, 'imported_symbols': imports, 'exported_symbols': exports})
        dump_json(out / 'evidence/apk-members.json', members)
        dump_json(out / 'data/dex-inventory.json', dexes)
        dump_json(out / 'data/native-libraries.json', libraries)

    for src in sorted((a.jadx / 'sources').rglob('*.java')):
        publish('decompiled/java/' + src.relative_to(a.jadx / 'sources').as_posix(), src.read_bytes(), 'jadx:' + src.relative_to(a.jadx).as_posix())
    for src in sorted(a.apktool.rglob('*')):
        if not src.is_file():
            continue
        rel = src.relative_to(a.apktool)
        if rel.parts[0].startswith('smali'):
            publish('decompiled/smali/' + rel.as_posix(), src.read_bytes(), 'apktool:' + rel.as_posix())
        elif rel.parts[0] == 'res' or rel.as_posix() == 'AndroidManifest.xml':
            publish('decompiled/resources/' + rel.as_posix(), src.read_bytes(), 'apktool:' + rel.as_posix())

    for native_root in a.native:
        if not native_root.is_dir():
            raise ValueError('Native export directory is missing: ' + str(native_root))
        native_summary = json.loads((native_root / 'data/recovery-summary.json').read_text())
        image_base = int(native_summary['ghidra_image_base'], 16)
        for src in sorted(native_root.rglob('*')):
            if not src.is_file():
                continue
            rel = src.relative_to(native_root)
            if rel.parts[0] in ('pseudocode', 'disassembly', 'data'):
                relative = rel.parts[0] + '/' + native_root.name + '/' + PurePosixPath(*rel.parts[1:]).as_posix()
                origin = 'ghidra:' + native_root.name + '/' + rel.as_posix()
                data = src.read_bytes()
                if native_root.name == 'liblazydtc' and rel.parts[0] in ('pseudocode', 'disassembly'):
                    if int(src.stem, 16) - image_base in sensitive_initializers:
                        (out / relative).unlink(missing_ok=True)
                        excluded.append({'origin': origin, 'reason': 'credential-bearing-initializer', 'bytes': len(data), 'sha256': digest(data)})
                        continue
                if rel.as_posix() == 'data/functions.tsv':
                    import csv
                    stream = io.StringIO(data.decode())
                    reader = csv.DictReader(stream, delimiter='\t')
                    rows = list(reader)
                    for row in rows:
                        if native_root.name == 'liblazydtc' and int(row['elf_vaddr'], 16) in sensitive_initializers:
                            row.update(status='withheld-credential', pseudocode='', disassembly='', diagnostic='Initializer reconstructs an embedded credential; intentionally withheld.')
                        else:
                            if row['pseudocode']:
                                row['pseudocode'] = 'pseudocode/' + native_root.name + '/' + PurePosixPath(row['pseudocode']).name
                            if row['disassembly']:
                                row['disassembly'] = 'disassembly/' + native_root.name + '/' + PurePosixPath(row['disassembly']).name
                    stream = io.StringIO()
                    writer = csv.DictWriter(stream, fieldnames=reader.fieldnames, delimiter='\t', lineterminator='\n')
                    writer.writeheader()
                    writer.writerows(rows)
                    data = stream.getvalue().encode()
                publish(relative, data, origin)

    if a.decoded:
        for src in sorted(a.decoded.rglob('*')):
            if src.is_file():
                rel = src.relative_to(a.decoded)
                prefix = 'data/constants/' if src.suffix == '.json' else 'decompiled/decoded/'
                publish(prefix + rel.as_posix(), src.read_bytes(), 'initializer-evaluation:' + rel.as_posix())

    logger.remove()
    apk = APK(str(a.apk))
    certs = apk.get_certificates()
    identity = {'input_filename': a.apk.name, 'bytes': len(apk_bytes), 'sha256': digest(apk_bytes), 'package': apk.get_package(), 'version_name': apk.get_androidversion_name(), 'version_code': apk.get_androidversion_code(), 'minimum_sdk': apk.get_min_sdk_version(), 'target_sdk': apk.get_target_sdk_version(), 'main_activity': apk.get_main_activity(), 'permissions': sorted(apk.get_permissions()), 'certificate_sha256': sorted({digest(c.dump()) for c in certs})}
    dump_json(out / 'evidence/input.json', identity)
    counts = collections.Counter(x['path'].split('/')[0] for x in included)
    java_errors = []
    for src in sorted((out / 'decompiled/java').rglob('*.java')):
        for n, line in enumerate(src.read_text().splitlines(), 1):
            if 'JADX ERROR:' in line or 'Method not decompiled:' in line:
                java_errors.append({'path': src.relative_to(out).as_posix(), 'line': n, 'diagnostic': line.strip()[:600]})
    dump_json(out / 'data/jadx-errors.json', java_errors)
    dump_json(out / 'evidence/publication-redactions.json', redactions)
    dump_json(out / 'evidence/excluded-files.json', excluded)
    manifest_index = []
    for number, start in enumerate(range(0, len(included), 5000), 1):
        name = f'derived-files-{number:04d}.json'
        chunk = included[start:start + 5000]
        dump_json(out / 'evidence' / name, chunk)
        manifest_index.append({'path': name, 'records': len(chunk)})
    dump_json(out / 'evidence/derived-files-index.json', manifest_index)
    dump_json(out / 'data/collection-summary.json', {'included_files': len(included), 'included_bytes': sum(x['bytes'] for x in included), 'java_files': sum(x['path'].endswith('.java') for x in included), 'smali_files': sum(x['path'].endswith('.smali') for x in included), 'dex_class_defs': sum(x['class_defs'] for x in dexes), 'java_diagnostics': len(java_errors), 'redactions': len(redactions), 'counts_by_root': counts, 'maximum_file_bytes': MAX_FILE_BYTES})
    print(json.dumps({'included': len(included), 'bytes': sum(x['bytes'] for x in included), 'redactions': len(redactions), 'excluded': len(excluded)}))


if __name__ == '__main__':
    main()
