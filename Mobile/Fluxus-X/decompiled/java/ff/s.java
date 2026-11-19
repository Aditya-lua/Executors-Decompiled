package ff;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements bf.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.b.EnumC0736b f16064e = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Mac> f16065a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f16066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16067d;

    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macA = m.f16045c.a(s.this.b);
                macA.init(s.this.f16066c);
                return macA;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public s(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f16065a = aVar;
        if (!f16064e.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = str;
        this.f16066c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f16067d = 20;
                break;
            case "HMACSHA224":
                this.f16067d = 28;
                break;
            case "HMACSHA256":
                this.f16067d = 32;
                break;
            case "HMACSHA384":
                this.f16067d = 48;
                break;
            case "HMACSHA512":
                this.f16067d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // bf.a
    public byte[] a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f16067d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f16065a.get().update(bArr);
        return Arrays.copyOf(this.f16065a.get().doFinal(), i10);
    }
}
