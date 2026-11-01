import json
import struct
import sys

import pefile


def load(path):
    return pefile.PE(path)


def pdata_bounds(pe):
    image_base = pe.OPTIONAL_HEADER.ImageBase
    section = next(s for s in pe.sections if s.Name.startswith(b".pdata"))
    data = section.get_data()
    bounds = []
    for off in range(0, len(data) - 11, 12):
        start, end, _ = struct.unpack_from("<III", data, off)
        if start and end > start:
            bounds.append((image_base + start, image_base + end))
    bounds.sort()
    return bounds


def is_code(section):
    return bool(section.Characteristics & 0x20000000)


def imports_by_name(pe):
    table = {}
    for entry in pe.DIRECTORY_ENTRY_IMPORT:
        for imp in entry.imports:
            if imp.name:
                table[imp.name.decode()] = imp.address
    return table


def find_iatt_calls(pe, wanted, bounds):
    image_base = pe.OPTIONAL_HEADER.ImageBase
    name_by_va = {va: name for name, va in imports_by_name(pe).items() if name in wanted}
    result = {}
    for section in pe.sections:
        if not is_code(section):
            continue
        data = section.get_data()
        base = image_base + section.VirtualAddress
        for i in range(len(data) - 6):
            if data[i] == 0xFF and data[i + 1] == 0x15:
                disp = struct.unpack_from("<i", data, i + 2)[0]
                target = base + i + 6 + disp
                if target in name_by_va:
                    owner = owner_of(bounds, base + i)
                    if owner:
                        result.setdefault(name_by_va[target], set()).add(owner)
                    else:
                        result.setdefault(name_by_va[target], set()).add(base + i)
    return result


def owner_of(bounds, va):
    lo, hi = 0, len(bounds) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        start, end = bounds[mid]
        if start <= va < end:
            return start
        if va < start:
            hi = mid - 1
        else:
            lo = mid + 1
    return None


def find_callers(pe, targets, bounds):
    image_base = pe.OPTIONAL_HEADER.ImageBase
    callers = {}
    for section in pe.sections:
        if not is_code(section):
            continue
        data = section.get_data()
        base = image_base + section.VirtualAddress
        for i in range(len(data) - 5):
            if data[i] == 0xE8:
                rel = struct.unpack_from("<i", data, i + 1)[0]
                dest = base + i + 5 + rel
                if dest in targets:
                    owner = owner_of(bounds, base + i)
                    callers.setdefault(dest, set()).add(owner if owner else base + i)
    return callers


def main():
    path = sys.argv[1]
    out = sys.argv[2]

    pe = load(path)
    bounds = pdata_bounds(pe)

    interesting = [
        "OpenProcess", "VirtualAllocEx", "VirtualProtectEx", "VirtualFreeEx",
        "WriteProcessMemory", "ReadProcessMemory", "VirtualProtect", "VirtualQueryEx",
        "CreateToolhelp32Snapshot", "Process32FirstW", "Process32NextW",
        "QueueUserAPC", "CreateThread", "TerminateThread",
        "CryptAcquireContextW", "CryptCreateHash", "CryptHashData", "CryptDecrypt",
        "CryptGenRandom", "CryptStringToBinaryW", "BCryptGenRandom",
        "CreateFileW", "WriteFile", "ReadFile", "MoveFileExW",
    ]

    sites = find_iatt_calls(pe, interesting, bounds)
    targets = {va for group in sites.values() for va in group if va >= 0x1000}
    callers = find_callers(pe, targets, bounds)

    payload = {
        "binary": path,
        "image_base": hex(pe.OPTIONAL_HEADER.ImageBase),
        "pdata_functions": len(bounds),
        "iatt_sites": {name: [hex(x) for x in sorted(v)] for name, v in sites.items()},
        "callers": {hex(k): [hex(x) for x in sorted(v)] for k, v in callers.items()},
    }

    with open(out, "w") as fh:
        json.dump(payload, fh, indent=2)

    print("functions", len(bounds))
    print("imports hit", len(sites))
    for name, v in sorted(payload["iatt_sites"].items()):
        print(f"  {name:24} {len(v)}")


if __name__ == "__main__":
    main()
