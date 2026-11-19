#!/usr/bin/env python3
"""Bounded ARM64 initializer evaluation in Unicorn, without host target execution.

Only in-memory allocation/string operations and C++ guard/destructor-registration
surrogates are supported. Unknown imports and all supervisor calls stop the run.
Each constructor starts from a fresh relocated ELF image. This recovers candidate
constants, not a running application or proof of complete initialization.
"""
import argparse
import collections
import hashlib
import io
import json
from pathlib import Path
import re
import struct

from elftools.elf.elffile import ELFFile
from unicorn import Uc, UcError, UC_ARCH_ARM64, UC_MODE_ARM, UC_HOOK_CODE, UC_HOOK_INTR
from unicorn.arm64_const import (UC_ARM64_REG_X0, UC_ARM64_REG_X1, UC_ARM64_REG_X2,
    UC_ARM64_REG_SP, UC_ARM64_REG_LR, UC_ARM64_REG_PC, UC_ARM64_REG_CPACR_EL1)

PAGE = 0x1000
HEAP = 0x50000000
HEAP_SIZE = 16 * 1024 * 1024
STUB = 0x60000000
STACK = 0x70000000
STOP = 0x7fff0000
PRINTABLE_UTF8 = re.compile(
    rb'(?:(?:[\x09\x0a\x0d\x20-\x7e])|(?:[\xc2-\xdf][\x80-\xbf])|'
    rb'(?:[\xe0-\xef][\x80-\xbf]{2})|(?:[\xf0-\xf4][\x80-\xbf]{3})){3,}\x00')


def align(n):
    return (n + PAGE - 1) & -PAGE


def main():
    p = argparse.ArgumentParser(description=__doc__)
    p.add_argument('binary', type=Path)
    p.add_argument('output', type=Path)
    a = p.parse_args()
    image = a.binary.read_bytes()
    elf = ELFFile(io.BytesIO(image))
    if elf['e_machine'] != 'EM_AARCH64':
        raise SystemExit('ARM64 only')
    segments = [s for s in elf.iter_segments() if s['p_type'] == 'PT_LOAD']
    memory_size = align(max(s['p_vaddr'] + s['p_memsz'] for s in segments))
    symbols = list(elf.get_section_by_name('.dynsym').iter_symbols())
    imported = {i: STUB + 16 * i for i, s in enumerate(symbols) if s.name and s['st_shndx'] == 'SHN_UNDEF'}
    stub_names = {addr: symbols[i].name for i, addr in imported.items()}
    local_guards = {s['st_value']: s.name for s in symbols
                    if s['st_shndx'] != 'SHN_UNDEF' and s.name in
                    ('__cxa_guard_acquire', '__cxa_guard_release')}
    stub_names.update(local_guards)
    relocs = []
    for section in elf.iter_sections():
        if section['sh_type'] == 'SHT_RELA':
            for r in section.iter_relocations():
                relocs.append((r['r_offset'], r['r_info_type'], r['r_info_sym'], r['r_addend']))
    relative = {offset: addend for offset, kind, sym, addend in relocs if kind == 1027}
    init = elf.get_section_by_name('.init_array')
    constructors = [relative.get(addr, 0) for addr in range(init['sh_addr'], init['sh_addr'] + init['sh_size'], 8)]
    # Application/Luau region before the first exported LZ4 function. This is a
    # build-specific scope boundary, not an assumption about other APK builds.
    constructors = [x for x in constructors if 0x6fbc20 <= x < 0x7cdafc]
    writable = [(s['p_vaddr'], s['p_memsz']) for s in segments if s['p_flags'] & 2]
    records, strings, seen = [], [], set()
    all_import_calls = collections.Counter()
    for entry in constructors:
        uc = Uc(UC_ARCH_ARM64, UC_MODE_ARM)
        uc.mem_map(0, memory_size)
        for s in segments:
            uc.mem_write(s['p_vaddr'], s.data())
        uc.mem_map(HEAP, HEAP_SIZE)
        uc.mem_map(STUB, align(16 * len(symbols)))
        uc.mem_map(STACK, 2 * 1024 * 1024)
        uc.mem_map(STOP, PAGE)
        relocation_errors = []
        for offset, kind, sym, addend in relocs:
            if kind == 1027:
                target = addend
            elif kind in (257, 1025, 1026):
                target = imported.get(sym, symbols[sym]['st_value']) + addend
            else:
                relocation_errors.append(kind)
                continue
            uc.mem_write(offset, struct.pack('<Q', target))
        if relocation_errors:
            raise SystemExit('Unsupported ELF relocations: ' + str(sorted(set(relocation_errors))))
        baseline = {start: bytes(uc.mem_read(start, size)) for start, size in writable}
        heap_cursor, allocations, calls, failure = HEAP, [], collections.Counter(), []

        def read_string(address, maximum=1024 * 1024):
            data = bytearray()
            while len(data) < maximum:
                chunk = bytes(uc.mem_read(address + len(data), min(256, maximum - len(data))))
                end = chunk.find(b'\0')
                if end >= 0:
                    return bytes(data) + chunk[:end]
                data.extend(chunk)
            raise ValueError('Unterminated or oversized C string')

        def allocate(size):
            nonlocal heap_cursor
            if size > 4 * 1024 * 1024 or size < 0:
                raise ValueError('Allocation bound')
            address = heap_cursor
            heap_cursor += (max(size, 1) + 15) & -16
            if heap_cursor >= HEAP + HEAP_SIZE:
                raise ValueError('Heap bound')
            allocations.append((address, max(size, 1)))
            return address

        def imported_call(machine, address, size, user):
            if address not in stub_names:
                return
            name = stub_names[address]
            calls[name] += 1
            x0, x1, x2 = [machine.reg_read(r) for r in (UC_ARM64_REG_X0, UC_ARM64_REG_X1, UC_ARM64_REG_X2)]
            result = 0
            try:
                if name == '__cxa_guard_acquire':
                    result = 0 if machine.mem_read(x0, 1)[0] & 1 else 1
                elif name == '__cxa_guard_release':
                    machine.mem_write(x0, b'\1')
                elif name in ('__cxa_atexit', '__cxa_thread_atexit_impl'):
                    # Registration has no destructor side effect during this run.
                    result = 0
                elif name in ('malloc', '_Znwm', '_Znam'):
                    result = allocate(x0)
                elif name in ('free', '_ZdlPv', '_ZdaPv', '_ZdlPvm', '_ZdaPvm'):
                    # No address is reused within a constructor evaluation.
                    result = 0
                elif name == 'calloc':
                    result = allocate(x0 * x1)
                elif name in ('memcpy', 'memmove', '__memcpy_chk', '__memmove_chk'):
                    if x2 > 4 * 1024 * 1024:
                        raise ValueError('Copy bound')
                    machine.mem_write(x0, bytes(machine.mem_read(x1, x2)))
                    result = x0
                elif name in ('memset', '__memset_chk'):
                    if x2 > 4 * 1024 * 1024:
                        raise ValueError('Fill bound')
                    machine.mem_write(x0, bytes([x1 & 255]) * x2)
                    result = x0
                elif name == 'strlen':
                    result = len(read_string(x0))
                elif name == 'strnlen':
                    if x1 > 1024 * 1024:
                        raise ValueError('String bound')
                    result = len(bytes(machine.mem_read(x0, x1)).split(b'\0', 1)[0]) if x1 else 0
                elif name in ('strcmp', 'strncmp', 'memcmp'):
                    if name == 'strcmp':
                        left, right = read_string(x0), read_string(x1)
                    elif name == 'strncmp':
                        left, right = read_string(x0)[:x2], read_string(x1)[:x2]
                    else:
                        if x2 > 4 * 1024 * 1024:
                            raise ValueError('Compare bound')
                        left, right = bytes(machine.mem_read(x0, x2)), bytes(machine.mem_read(x1, x2))
                    result = (left > right) - (left < right)
                else:
                    raise ValueError('Unsupported import: ' + name)
                machine.reg_write(UC_ARM64_REG_X0, result & ((1 << 64) - 1))
                machine.reg_write(UC_ARM64_REG_PC, machine.reg_read(UC_ARM64_REG_LR))
            except (ValueError, UcError) as ex:
                failure.append(str(ex))
                machine.emu_stop()

        def interrupt(machine, number, user):
            failure.append('Supervisor/exception interrupt refused: ' + str(number))
            machine.emu_stop()

        uc.hook_add(UC_HOOK_CODE, imported_call, begin=STUB, end=STUB + align(16 * len(symbols)) - 1)
        for guard in local_guards:
            uc.hook_add(UC_HOOK_CODE, imported_call, begin=guard, end=guard)
        uc.hook_add(UC_HOOK_INTR, interrupt)
        uc.reg_write(UC_ARM64_REG_CPACR_EL1, 3 << 20)
        uc.reg_write(UC_ARM64_REG_SP, STACK + 2 * 1024 * 1024 - 0x100)
        uc.reg_write(UC_ARM64_REG_LR, STOP)
        try:
            uc.emu_start(entry, STOP, timeout=5_000_000, count=2_000_000)
        except UcError as ex:
            failure.append(str(ex))
        if not failure and uc.reg_read(UC_ARM64_REG_PC) != STOP:
            failure.append('Instruction/time bound reached')
        status = 'returned' if not failure else 'stopped'
        found = 0
        if status == 'returned':
            for start, size in writable + allocations:
                data = bytes(uc.mem_read(start, size))
                for match in PRINTABLE_UTF8.finditer(data):
                    value = match.group()[:-1]
                    if start in baseline and baseline[start][match.start():match.end()] == match.group():
                        continue
                    h = hashlib.sha256(value).hexdigest()
                    key = (start + match.start(), h)
                    if key in seen:
                        continue
                    try:
                        decoded = value.decode('utf-8')
                    except UnicodeDecodeError:
                        continue
                    seen.add(key)
                    strings.append({'initializer_elf_vaddr': hex(entry), 'memory_address': hex(start + match.start()), 'bytes': len(value), 'sha256': h, 'value': decoded})
                    found += 1
        all_import_calls.update(calls)
        records.append({'initializer_elf_vaddr': hex(entry), 'status': status, 'diagnostic': failure, 'import_calls': dict(calls), 'candidate_strings_added': found})
        print(hex(entry), status, found, '; '.join(failure), flush=True)
    a.output.mkdir(parents=True, exist_ok=True)
    metadata = {'binary_sha256': hashlib.sha256(image).hexdigest(), 'scope': 'Independent application-region .init_array constructors; in-memory surrogates only', 'constructors': len(records), 'returned': sum(r['status'] == 'returned' for r in records), 'stopped': sum(r['status'] == 'stopped' for r in records), 'candidate_strings': len(strings), 'import_calls': dict(all_import_calls), 'runs': records}
    (a.output / 'initializer-evaluation.json').write_text(json.dumps(metadata, indent=2) + '\n')
    (a.output / 'initializer-string-candidates.json').write_text(json.dumps(strings, indent=2) + '\n')


if __name__ == '__main__':
    main()
