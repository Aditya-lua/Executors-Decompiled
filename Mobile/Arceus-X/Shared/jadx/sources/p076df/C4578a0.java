package p076df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;
import p465ue.C11844b;

/* JADX INFO: renamed from: df.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4578a0 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f18721a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* JADX INFO: renamed from: b */
    public static final Pattern f18722b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* JADX INFO: renamed from: df.a0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18723a;

        static {
            int[] iArr = new int[EnumC4593o.values().length];
            f18723a = iArr;
            try {
                iArr[EnumC4593o.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18723a[EnumC4593o.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18723a[EnumC4593o.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m22637a(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m22638b(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", str));
    }

    /* JADX INFO: renamed from: c */
    public static void m22639c(int i10) throws GeneralSecurityException {
        if (i10 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i10)));
        }
        if (C11844b.m44242c() && i10 != 2048 && i10 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i10)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22640d(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m22641e(EnumC4593o enumC4593o) throws GeneralSecurityException {
        int i10 = a.f18723a[enumC4593o.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + enumC4593o.name());
    }
}
