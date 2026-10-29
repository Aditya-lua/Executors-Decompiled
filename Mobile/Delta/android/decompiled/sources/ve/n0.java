package ve;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<SecureRandom> f32993a = new a();

    public class a extends ThreadLocal<SecureRandom> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return n0.c();
        }
    }

    public static SecureRandom b() {
        Provider providerA = c.a();
        if (providerA != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerA);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerB = c.b();
        if (providerB != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerB);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static SecureRandom c() {
        SecureRandom secureRandomB = b();
        secureRandomB.nextLong();
        return secureRandomB;
    }

    public static byte[] d(int i10) {
        byte[] bArr = new byte[i10];
        f32993a.get().nextBytes(bArr);
        return bArr;
    }
}
