import collections
import json
import struct
import sys

import pefile


def pdata_bounds(pe):
    image_base = pe.OPTIONAL_HEADER.ImageBase
    section = next(s for s in pe.sections if s.Name.startswith(b".pdata"))
    data = section.get_data()
    out = []
    for off in range(0, len(data) - 11, 12):
        start, end, _ = struct.unpack_from("<III", data, off)
        if start and end > start:
            out.append((image_base + start, image_base + end))
    out.sort()
    return out


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


def main():
    path = sys.argv[1]
    out = sys.argv[2]

    pe = pefile.PE(path)
    image_base = pe.OPTIONAL_HEADER.ImageBase
    bounds = pdata_bounds(pe)
    starts = {s for s, _ in bounds}

    imports = {}
    for entry in pe.DIRECTORY_ENTRY_IMPORT:
        for imp in entry.imports:
            if imp.name:
                imports[imp.address] = imp.name.decode()

    edges = collections.defaultdict(set)
    iat = collections.defaultdict(set)

    for section in pe.sections:
        if not (section.Characteristics & 0x20000000):
            continue
        data = section.get_data()
        base = image_base + section.VirtualAddress
        for i in range(len(data) - 6):
            op = data[i]
            if op in (0xE8, 0xE9):
                rel = struct.unpack_from("<i", data, i + 1)[0]
                dest = base + i + 5 + rel
                caller = owner_of(bounds, base + i)
                if caller and dest in starts and dest != caller:
                    edges[caller].add(dest)
            elif op == 0xFF and data[i + 1] in (0x15, 0x25):
                disp = struct.unpack_from("<i", data, i + 2)[0]
                dest = base + i + 6 + disp
                caller = owner_of(bounds, base + i)
                if caller and dest in imports:
                    iat[caller].add(imports[dest])

    payload = {
        "binary": path,
        "functions": len(bounds),
        "edges": sum(len(v) for v in edges.values()),
        "edges_by_caller": {hex(k): [hex(x) for x in v] for k, v in edges.items()},
        "iat_by_caller": {hex(k): sorted(v) for k, v in iat.items()},
    }

    with open(out, "w") as fh:
        json.dump(payload, fh, indent=2)

    print("functions", len(bounds))
    print("edges", payload["edges"])
    print("callers with imports", len(iat))


if __name__ == "__main__":
    main()
