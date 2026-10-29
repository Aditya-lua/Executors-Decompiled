package p076df;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import p515we.C12357a;
import p515we.C12369g;

/* JADX INFO: renamed from: df.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C4589k {

    /* JADX INFO: renamed from: df.k$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18780a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f18781b;

        static {
            int[] iArr = new int[b.values().length];
            f18781b = iArr;
            try {
                iArr[b.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18781b[b.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18781b[b.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f18780a = iArr2;
            try {
                iArr2[d.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18780a[d.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18780a[d.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: df.k$b */
    public enum b {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    /* JADX INFO: renamed from: df.k$c */
    public enum c {
        IEEE_P1363,
        DER
    }

    /* JADX INFO: renamed from: df.k$d */
    public enum d {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    /* JADX INFO: renamed from: a */
    public static void m22682a(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        C12369g.m46302b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m22683b(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!m22695n(bArr)) {
            throw new GeneralSecurityException("Invalid DER encoding");
        }
        byte[] bArr2 = new byte[i10];
        int i11 = (bArr[1] & 255) >= 128 ? 3 : 2;
        int i12 = i11 + 1;
        int i13 = i11 + 2;
        int i14 = bArr[i12];
        int i15 = bArr[i13] == 0 ? 1 : 0;
        System.arraycopy(bArr, i13 + i15, bArr2, ((i10 / 2) - i14) + i15, i14 - i15);
        int i16 = i13 + i14 + 1;
        int i17 = i16 + 1;
        int i18 = bArr[i16];
        int i19 = bArr[i17] != 0 ? 0 : 1;
        System.arraycopy(bArr, i17 + i19, bArr2, (i10 - i18) + i19, i18 - i19);
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m22684c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i10;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] bArrM22696o = m22696o(Arrays.copyOf(bArr, bArr.length / 2));
        byte[] bArrM22696o2 = m22696o(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = bArrM22696o.length + 4 + bArrM22696o2.length;
        if (length >= 128) {
            bArr2 = new byte[length + 3];
            bArr2[0] = 48;
            bArr2[1] = -127;
            bArr2[2] = (byte) length;
            i10 = 3;
        } else {
            bArr2 = new byte[length + 2];
            bArr2[0] = 48;
            bArr2[1] = (byte) length;
            i10 = 2;
        }
        int i11 = i10 + 1;
        bArr2[i10] = 2;
        int i12 = i10 + 2;
        bArr2[i11] = (byte) bArrM22696o.length;
        System.arraycopy(bArrM22696o, 0, bArr2, i12, bArrM22696o.length);
        int length2 = i12 + bArrM22696o.length;
        bArr2[length2] = 2;
        bArr2[length2 + 1] = (byte) bArrM22696o2.length;
        System.arraycopy(bArrM22696o2, 0, bArr2, length2 + 2, bArrM22696o2.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static int m22685d(EllipticCurve ellipticCurve) {
        return m22691j(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    /* JADX INFO: renamed from: e */
    public static int m22686e(EllipticCurve ellipticCurve) {
        return (m22685d(ellipticCurve) + 7) / 8;
    }

    /* JADX INFO: renamed from: f */
    public static KeyPair m22687f(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGeneratorM22699a = C4591m.f18802g.m22699a("EC");
        keyPairGeneratorM22699a.initialize(eCParameterSpec);
        return keyPairGeneratorM22699a.generateKeyPair();
    }

    /* JADX INFO: renamed from: g */
    public static ECParameterSpec m22688g(b bVar) throws NoSuchAlgorithmException {
        int i10 = a.f18781b[bVar.ordinal()];
        if (i10 == 1) {
            return m22692k();
        }
        if (i10 == 2) {
            return m22693l();
        }
        if (i10 == 3) {
            return m22694m();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + bVar);
    }

    /* JADX INFO: renamed from: h */
    public static ECPrivateKey m22689h(b bVar, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) C4591m.f18803h.m22699a("EC").generatePrivate(new ECPrivateKeySpec(C12357a.m46223a(bArr), m22688g(bVar)));
    }

    /* JADX INFO: renamed from: i */
    public static ECPublicKey m22690i(b bVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecM22688g = m22688g(bVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        C12369g.m46302b(eCPoint, eCParameterSpecM22688g.getCurve());
        return (ECPublicKey) C4591m.f18803h.m22699a("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecM22688g));
    }

    /* JADX INFO: renamed from: j */
    public static BigInteger m22691j(EllipticCurve ellipticCurve) {
        return C12369g.m46304d(ellipticCurve);
    }

    /* JADX INFO: renamed from: k */
    public static ECParameterSpec m22692k() {
        return C12369g.f44250a;
    }

    /* JADX INFO: renamed from: l */
    public static ECParameterSpec m22693l() {
        return C12369g.f44251b;
    }

    /* JADX INFO: renamed from: m */
    public static ECParameterSpec m22694m() {
        return C12369g.f44252c;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m22695n(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i14 = bArr[1] & 255;
        if (i14 == 129) {
            i14 = bArr[2] & 255;
            if (i14 < 128) {
                return false;
            }
            i10 = 2;
        } else {
            if (i14 == 128 || i14 > 129) {
                return false;
            }
            i10 = 1;
        }
        if (i14 != (bArr.length - 1) - i10 || bArr[i10 + 1] != 2 || (i13 = (i12 = i10 + 3 + (i11 = bArr[i10 + 2] & 255)) + 1) >= bArr.length || i11 == 0) {
            return false;
        }
        int i15 = i10 + 3;
        byte b10 = bArr[i15];
        if ((b10 & 255) >= 128) {
            return false;
        }
        if ((i11 > 1 && b10 == 0 && (bArr[i10 + 4] & 255) < 128) || bArr[i15 + i11] != 2) {
            return false;
        }
        int i16 = bArr[i13] & 255;
        if (i12 + 2 + i16 != bArr.length || i16 == 0) {
            return false;
        }
        byte b11 = bArr[i10 + 5 + i11];
        if ((b11 & 255) >= 128) {
            return false;
        }
        return i16 <= 1 || b11 != 0 || (bArr[(i10 + 6) + i11] & 255) >= 128;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m22696o(byte[] bArr) {
        int length = 0;
        while (length < bArr.length && bArr[length] == 0) {
            length++;
        }
        if (length == bArr.length) {
            length = bArr.length - 1;
        }
        int i10 = (bArr[length] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - length) + i10];
        System.arraycopy(bArr, length, bArr2, i10, bArr.length - length);
        return bArr2;
    }
}
