package cf;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements ye.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final te.b.EnumC0569b f4889e = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Mac> f4890a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f4891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4892d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macA = m.f4870c.a(s.this.b);
                macA.init(s.this.f4891c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public s(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f4890a = aVar;
        if (!f4889e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.f4891c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f4892d = 20;
                break;
            case "HMACSHA224":
                this.f4892d = 28;
                break;
            case "HMACSHA256":
                this.f4892d = 32;
                break;
            case "HMACSHA384":
                this.f4892d = 48;
                break;
            case "HMACSHA512":
                this.f4892d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // ye.a
    public byte[] a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f4892d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f4890a.get().update(bArr);
        return Arrays.copyOf(this.f4890a.get().doFinal(), i10);
    }
}
