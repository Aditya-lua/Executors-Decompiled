#!/usr/bin/env python3
"""Write the four recovered UTF-8 Lua buffers and check syntax without running them."""
import argparse
import hashlib
import json
from pathlib import Path
import subprocess

NAMES = {
    '0xbcb230': 'recovered_ui.lua',
    '0xc13438': 'recovered_gc_cache.lua',
    '0xc13b78': 'recovered_drawing.lua',
    '0xc1a740': 'recovered_bit_compat.lua',
}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument('decoded_directory', type=Path)
    parser.add_argument('--luau-compile', type=Path, required=True)
    args = parser.parse_args()
    root = args.decoded_directory
    strings = json.loads((root / 'initializer-string-candidates.json').read_text())
    selected = {s['memory_address']: s for s in strings if s['memory_address'] in NAMES}
    if set(selected) != set(NAMES):
        raise SystemExit('One or more expected recovered buffers are missing')
    records = []
    for address, name in NAMES.items():
        s = selected[address]
        data = s['value'].encode('utf-8')
        if hashlib.sha256(data).hexdigest() != s['sha256']:
            raise SystemExit('Recovered string hash mismatch')
        path = root / name
        path.write_bytes(data)
        result = subprocess.run([str(args.luau_compile.resolve()), '--only-parse', str(path)], capture_output=True, text=True)
        record = {k: s[k] for k in ('bytes', 'sha256', 'initializer_elf_vaddr', 'memory_address')}
        record.update(file=name, luau_parse_exit=result.returncode, diagnostic=result.stderr[:2000])
        records.append(record)
        print(name, len(data), 'parse_exit=' + str(result.returncode))
    (root / 'constant-files.json').write_text(json.dumps(records, indent=2) + '\n')
    if any(r['luau_parse_exit'] for r in records):
        raise SystemExit('At least one recovered buffer did not parse; see constant-files.json')


if __name__ == '__main__':
    main()
