package df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements ze.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14727e = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Mac> f14728a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f14729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14730d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macA = m.f14708c.a(s.this.b);
                macA.init(s.this.f14729c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public s(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f14728a = aVar;
        if (!f14727e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.f14729c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f14730d = 20;
                break;
            case "HMACSHA224":
                this.f14730d = 28;
                break;
            case "HMACSHA256":
                this.f14730d = 32;
                break;
            case "HMACSHA384":
                this.f14730d = 48;
                break;
            case "HMACSHA512":
                this.f14730d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // ze.a
    public byte[] a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f14730d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f14728a.get().update(bArr);
        return Arrays.copyOf(this.f14728a.get().doFinal(), i10);
    }
}
