package p076df;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import p465ue.C11844b;
import p602ze.InterfaceC13793a;

/* JADX INFO: renamed from: df.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C4597s implements InterfaceC13793a {

    /* JADX INFO: renamed from: e */
    public static final C11844b.b f18819e = C11844b.b.f41602b;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal<Mac> f18820a;

    /* JADX INFO: renamed from: b */
    public final String f18821b;

    /* JADX INFO: renamed from: c */
    public final Key f18822c;

    /* JADX INFO: renamed from: d */
    public final int f18823d;

    /* JADX INFO: renamed from: df.s$a */
    public class a extends ThreadLocal<Mac> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac macM22699a = C4591m.f18798c.m22699a(C4597s.this.f18821b);
                macM22699a.init(C4597s.this.f18822c);
                return macM22699a;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C4597s(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.f18820a = aVar;
        if (!f18819e.mo44243a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f18821b = str;
        this.f18822c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f18823d = 20;
                break;
            case "HMACSHA224":
                this.f18823d = 28;
                break;
            case "HMACSHA256":
                this.f18823d = 32;
                break;
            case "HMACSHA384":
                this.f18823d = 48;
                break;
            case "HMACSHA512":
                this.f18823d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // p602ze.InterfaceC13793a
    /* JADX INFO: renamed from: a */
    public byte[] mo22714a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f18823d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f18820a.get().update(bArr);
        return Arrays.copyOf(this.f18820a.get().doFinal(), i10);
    }
}
