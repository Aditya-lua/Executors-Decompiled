import base64
import collections
import hashlib
import math
import re
import sys


MAGIC = {
    "zip": b"PK\x03\x04",
    "pe": b"PE\x00\x00",
    "gzip": b"\x1f\x8b\x08",
    "zstd": b"\x28\xb5\x2f\xfd",
    "xz": b"\xfd7zXZ",
    "7z": b"7z\xbc\xaf\x27\x1c",
}


def b64_load(path):
    raw = open(path, "rb").read()
    return base64.b64decode(b"".join(raw.split()))


def entropy(data):
    if not data:
        return 0.0
    counts = collections.Counter(data)
    n = len(data)
    return -sum((c / n) * math.log2(c / n) for c in counts.values())


def entropy_profile(data, window=8192):
    return [round(entropy(data[i:i + window]), 2) for i in range(0, len(data), window)]


def repeated_blocks(data, size=16):
    seen = collections.Counter(data[i:i + size] for i in range(0, len(data) - size + 1, size))
    return sum(1 for v in seen.values() if v > 1)


def magic_hits(data):
    hits = {name: data.count(sig) for name, sig in MAGIC.items() if data.count(sig)}
    if data[:2] == b"MZ":
        hits["mz"] = 1
    return hits


def common_prefix(a, b):
    limit = min(len(a), len(b))
    i = 0
    while i < limit and a[i] == b[i]:
        i += 1
    return i


def embedded_runs(exe_path, asset_bytes, probe=48):
    exe = open(exe_path, "rb").read()
    needle = base64.b64encode(asset_bytes[:probe])
    out = []
    start = 0
    while True:
        pos = exe.find(needle, start)
        if pos < 0:
            break
        end = pos
        while end < len(exe) and (chr(exe[end]).isalnum() or exe[end] in b"+/="):
            end += 1
        text = exe[pos:end]
        trimmed = text[: len(text) // 4 * 4]
        try:
            decoded = base64.b64decode(trimmed)
        except Exception:
            decoded = b""
        if decoded:
            out.append({"offset": pos, "chars": len(trimmed), "bytes": len(decoded), "data": decoded})
        start = pos + 1
    return out


def report_asset(asset_path):
    data = b64_load(asset_path)
    print(f"file            {asset_path}")
    print(f"encoded size    {len(open(asset_path, 'rb').read())}")
    print(f"decoded size    {len(data)}")
    print(f"sha256          {hashlib.sha256(data).hexdigest()}")
    print(f"mod 16          {len(data) % 16}")
    print(f"entropy         {entropy(data):.4f}")
    print(f"entropy/8k      {entropy_profile(data)[:12]}")
    print(f"repeated 16B    {repeated_blocks(data)}")
    print(f"unique bytes    {len(set(data))}")
    print(f"first 16        {data[:16].hex()}")
    print(f"last 16         {data[-16:].hex()}")
    print(f"magic           {magic_hits(data) or 'none'}")
    return data


def report_embedded(asset_bytes, exe_path):
    runs = embedded_runs(exe_path, asset_bytes)
    print()
    print(f"embedded base64 runs in {exe_path}: {len(runs)}")
    best = None
    for run in runs:
        shared = common_prefix(asset_bytes, run["data"])
        if shared and (best is None or shared > best[0]):
            best = (shared, run)
        if shared:
            print(f"  offset {run['offset']:>10}  chars {run['chars']:>7}  bytes {run['bytes']:>7}  shared {shared}")
    if not best:
        print("  no run shares a prefix with the asset")
        return
    shared, run = best
    print()
    print(f"header/body split")
    print(f"  shared prefix      {shared} bytes")
    print(f"  asset size         {len(asset_bytes)}")
    print(f"  exe copy size      {run['bytes']}")
    print(f"  shared % 16        {shared % 16}")
    print(f"  body (asset)       {len(asset_bytes) - shared}")
    print(f"  body % 16          {(len(asset_bytes) - shared) % 16}")
    print(f"  asset header       {asset_bytes[:16].hex()}")
    print(f"  exe   header       {run['data'][:16].hex()}")
    if shared < min(len(asset_bytes), run["bytes"]):
        print(f"  diverge at         {shared} (0x{shared:x})")
        print(f"  asset block        {asset_bytes[shared:shared + 16].hex()}")
        print(f"  exe   block        {run['data'][shared:shared + 16].hex()}")


def main():
    asset_path = sys.argv[1]
    exe_path = sys.argv[2] if len(sys.argv) > 2 else None
    data = report_asset(asset_path)
    if exe_path:
        report_embedded(data, exe_path)


if __name__ == "__main__":
    main()
