package p076df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import p515we.C12357a;

/* JADX INFO: renamed from: df.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C4604z {

    /* JADX INFO: renamed from: df.z$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18868a;

        static {
            int[] iArr = new int[EnumC4593o.values().length];
            f18868a = iArr;
            try {
                iArr[EnumC4593o.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18868a[EnumC4593o.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18868a[EnumC4593o.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18868a[EnumC4593o.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18868a[EnumC4593o.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static BigInteger m22738a(byte[] bArr) {
        return C12357a.m46223a(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m22739b(BigInteger bigInteger, int i10) {
        return C12357a.m46225c(bigInteger, i10);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m22740c() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m22741d(byte[] bArr, int i10, EnumC4593o enumC4593o) {
        MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a(m22742e(enumC4593o));
        int digestLength = messageDigestM22699a.getDigestLength();
        byte[] bArr2 = new byte[i10];
        int length = 0;
        for (int i11 = 0; i11 <= (i10 - 1) / digestLength; i11++) {
            messageDigestM22699a.reset();
            messageDigestM22699a.update(bArr);
            messageDigestM22699a.update(m22739b(BigInteger.valueOf(i11), 4));
            byte[] bArrDigest = messageDigestM22699a.digest();
            System.arraycopy(bArrDigest, 0, bArr2, length, Math.min(bArrDigest.length, i10 - length));
            length += bArrDigest.length;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: e */
    public static String m22742e(EnumC4593o enumC4593o) throws GeneralSecurityException {
        int i10 = a.f18868a[enumC4593o.ordinal()];
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
        throw new GeneralSecurityException("Unsupported hash " + enumC4593o);
    }

    /* JADX INFO: renamed from: f */
    public static String m22743f(EnumC4593o enumC4593o) throws GeneralSecurityException {
        C4578a0.m22641e(enumC4593o);
        return enumC4593o + "withECDSA";
    }

    /* JADX INFO: renamed from: g */
    public static String m22744g(EnumC4593o enumC4593o) throws GeneralSecurityException {
        C4578a0.m22641e(enumC4593o);
        return enumC4593o + "withRSA";
    }
}
