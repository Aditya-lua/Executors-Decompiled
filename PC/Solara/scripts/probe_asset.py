import base64
import hashlib
import hmac
import sys

from Crypto.Cipher import AES, ChaCha20, ChaCha20_Poly1305


def b64_load(path):
    raw = open(path, "rb").read()
    return base64.b64decode(b"".join(raw.split()))


def hkdf(key, salt, info, length=32):
    prk = hmac.new(salt if salt else b"\x00" * 32, key, hashlib.sha256).digest()
    out = b""
    block = b""
    counter = 1
    while len(out) < length:
        block = hmac.new(prk, block + info + bytes([counter]), hashlib.sha256).digest()
        out += block
        counter += 1
    return out[:length]


def printable_ratio(data, limit=4096):
    sample = data[:limit]
    if not sample:
        return 0.0
    good = sum(1 for b in sample if 32 <= b < 127 or b in (9, 10, 13))
    return good / len(sample)


def key_candidates(alga, header, name=b"DLCTBL_FRTS"):
    out = {
        "ALGA": alga,
        "sha256(ALGA)": hashlib.sha256(alga).digest(),
        "sha256(header)": hashlib.sha256(header).digest(),
        "sha256(header[:32])": hashlib.sha256(header[:32]).digest(),
        "header[:32]": header[:32],
        "sha256(name)": hashlib.sha256(name).digest(),
        "sha256(ALGA||name)": hashlib.sha256(alga + name).digest(),
    }
    for label, salt in (("header[:32]", header[:32]), ("header[32:64]", header[32:64]), ("ALGA", alga)):
        for info in (name, b"", hashlib.sha256(name).digest()):
            tag = f"hkdf(ALGA,salt={label},info={info[:6]!r})"
            out[tag] = hkdf(alga, salt, info)
        for rounds in (1, 10, 1000):
            tag = f"pbkdf2(ALGA,salt={label},{rounds})"
            out[tag] = hashlib.pbkdf2_hmac("sha256", alga, salt, rounds, 32)
    return out


def symmetric_attempts(key, body, header, alga):
    ivs = {
        "zero": b"\x00" * 16,
        "header[:16]": header[:16],
        "header[-16:]": header[-16:],
        "alga[:16]": alga[:16],
        "alga[16:]": alga[16:],
    }
    for iv_name, iv in ivs.items():
        for mode, fn in (
            ("cbc", lambda: AES.new(key, AES.MODE_CBC, iv=iv).decrypt(body)),
            ("cfb", lambda: AES.new(key, AES.MODE_CFB, iv=iv, segment_size=128).decrypt(body)),
            ("ofb", lambda: AES.new(key, AES.MODE_OFB, iv=iv).decrypt(body)),
            ("ctr-le", lambda: AES.new(key, AES.MODE_CTR, nonce=b"",
                                       initial_value=int.from_bytes(iv, "little")).decrypt(body)),
            ("ctr-be", lambda: AES.new(key, AES.MODE_CTR, nonce=b"",
                                       initial_value=int.from_bytes(iv, "big")).decrypt(body)),
        ):
            try:
                yield f"aes-{mode}/{iv_name}", fn()
            except Exception:
                continue
    for nonce_name, nonce in (
        ("zero12", b"\x00" * 12),
        ("header[:12]", header[:12]),
        ("header[12:24]", header[12:24]),
        ("alga[:12]", alga[:12]),
    ):
        try:
            yield f"chacha20/{nonce_name}", ChaCha20.new(key=key, nonce=nonce).decrypt(body)
        except Exception:
            continue


def aead_attempts(keys, payload, header, alga):
    body, tag = payload[:-16], payload[-16:]
    hits = []
    for key_name, key in keys.items():
        for nonce_name, nonce in (
            ("zero", b"\x00" * 12),
            ("header[:12]", header[:12]),
            ("header[12:24]", header[12:24]),
            ("alga[:12]", alga[:12]),
        ):
            for alg, factory in (
                ("aes-256-gcm", lambda: AES.new(key, AES.MODE_GCM, nonce=nonce)),
                ("chacha20-poly1305", lambda: ChaCha20_Poly1305.new(key=key, nonce=nonce)),
            ):
                try:
                    cipher = factory()
                    plain = cipher.decrypt_and_verify(body, tag)
                    hits.append((key_name, nonce_name, alg, plain[:32]))
                except Exception:
                    continue
    return hits


def main():
    asset_path = sys.argv[1]
    alga_path = sys.argv[2] if len(sys.argv) > 2 else None

    payload = b64_load(asset_path)
    alga = b64_load(alga_path) if alga_path else payload[:32]

    header = payload[:240]
    body = payload[240:]

    print(f"payload {len(payload)}  header {len(header)}  body {len(body)}  body%16 {len(body) % 16}")

    keys = key_candidates(alga, header)

    print()
    print("symmetric sweep")
    best = []
    for label, plain in symmetric_attempts(keys["ALGA"], body, header, alga):
        best.append((printable_ratio(plain), label, plain[:12].hex()))
    for extra in ("sha256(ALGA)", "sha256(header)", "header[:32]"):
        for label, plain in symmetric_attempts(keys[extra], body, header, alga):
            best.append((printable_ratio(plain), f"{extra}+{label}", plain[:12].hex()))
    best.sort(reverse=True)
    for ratio, label, head in best[:8]:
        print(f"  {ratio:.2f}  {label:28} {head}")
    print(f"  verdict: {'SIGNAL' if best[0][0] > 0.75 else 'noise (all around 0.40)'}")

    print()
    print("aead tag verification")
    hits = aead_attempts(keys, payload, header, alga)
    if hits:
        for key_name, nonce_name, alg, plain in hits:
            print(f"  HIT {alg} key={key_name} nonce={nonce_name} plain={plain.hex()}")
    else:
        print(f"  all {len(keys)} keys x 4 nonces rejected — no valid tag")


if __name__ == "__main__":
    main()
