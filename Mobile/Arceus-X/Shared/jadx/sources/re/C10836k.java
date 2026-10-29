package re;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p076df.C4578a0;
import p076df.C4591m;
import p515we.C12394s0;

/* JADX INFO: renamed from: re.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10836k {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Cipher> f38557a = new a();

    /* JADX INFO: renamed from: re.k$a */
    public class a extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C4591m.f18797b.m22699a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AlgorithmParameterSpec m41247a(byte[] bArr) {
        return m41248b(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: b */
    public static AlgorithmParameterSpec m41248b(byte[] bArr, int i10, int i11) {
        Integer numM46450c = C12394s0.m46450c();
        return (numM46450c == null || numM46450c.intValue() > 19) ? new GCMParameterSpec(128, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static SecretKey m41249c(byte[] bArr) throws InvalidAlgorithmParameterException {
        C4578a0.m22637a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    /* JADX INFO: renamed from: d */
    public static Cipher m41250d() {
        return f38557a.get();
    }
}
