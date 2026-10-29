package p515we;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: renamed from: we.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12384n0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<SecureRandom> f44319a = new a();

    /* JADX INFO: renamed from: we.n0$a */
    public class a extends ThreadLocal<SecureRandom> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return C12384n0.m46411c();
        }
    }

    /* JADX INFO: renamed from: b */
    public static SecureRandom m46410b() {
        Provider providerM46233a = C12361c.m46233a();
        if (providerM46233a != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerM46233a);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerM46234b = C12361c.m46234b();
        if (providerM46234b != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerM46234b);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    /* JADX INFO: renamed from: c */
    public static SecureRandom m46411c() {
        SecureRandom secureRandomM46410b = m46410b();
        secureRandomM46410b.nextLong();
        return secureRandomM46410b;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m46412d(int i10) {
        byte[] bArr = new byte[i10];
        f44319a.get().nextBytes(bArr);
        return bArr;
    }
}
