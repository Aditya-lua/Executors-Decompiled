package cf;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4929a;

        static {
            int[] iArr = new int[o.values().length];
            f4929a = iArr;
            try {
                iArr[o.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4929a[o.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4929a[o.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4929a[o.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4929a[o.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static BigInteger a(byte[] bArr) {
        return ve.a.a(bArr);
    }

    public static byte[] b(BigInteger bigInteger, int i10) {
        return ve.a.c(bigInteger, i10);
    }

    public static boolean c() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static byte[] d(byte[] bArr, int i10, o oVar) {
        MessageDigest messageDigestA = m.f4872e.a(e(oVar));
        int digestLength = messageDigestA.getDigestLength();
        byte[] bArr2 = new byte[i10];
        int length = 0;
        for (int i11 = 0; i11 <= (i10 - 1) / digestLength; i11++) {
            messageDigestA.reset();
            messageDigestA.update(bArr);
            messageDigestA.update(b(BigInteger.valueOf(i11), 4));
            byte[] bArrDigest = messageDigestA.digest();
            System.arraycopy(bArrDigest, 0, bArr2, length, Math.min(bArrDigest.length, i10 - length));
            length += bArrDigest.length;
        }
        return bArr2;
    }

    public static String e(o oVar) throws GeneralSecurityException {
        int i10 = a.f4929a[oVar.ordinal()];
        if (i10 == 1) {
            return "SHA-1";
        }
        if (i10 == 2) {
            return "SHA-224";
        }
        if (i10 == 3) {
            return "SHA-256";
        }
        if (i10 == 4) {
            return "SHA-384";
        }
        if (i10 == 5) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash " + oVar);
    }

    public static String f(o oVar) throws GeneralSecurityException {
        a0.e(oVar);
        return oVar + "withECDSA";
    }

    public static String g(o oVar) throws GeneralSecurityException {
        a0.e(oVar);
        return oVar + "withRSA";
    }
}
