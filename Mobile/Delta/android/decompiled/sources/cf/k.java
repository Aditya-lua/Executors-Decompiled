package cf;

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

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4858a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f4858a = iArr2;
            try {
                iArr2[d.UNCOMPRESSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4858a[d.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4858a[d.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        NIST_P256,
        NIST_P384,
        NIST_P521
    }

    public enum c {
        IEEE_P1363,
        DER
    }

    public enum d {
        UNCOMPRESSED,
        COMPRESSED,
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED
    }

    public static void a(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        ve.g.b(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    public static byte[] b(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!n(bArr)) {
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

    public static byte[] c(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2;
        int i10;
        if (bArr.length % 2 != 0 || bArr.length == 0 || bArr.length > 132) {
            throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
        }
        byte[] bArrO = o(Arrays.copyOf(bArr, bArr.length / 2));
        byte[] bArrO2 = o(Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length));
        int length = bArrO.length + 4 + bArrO2.length;
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
        bArr2[i11] = (byte) bArrO.length;
        System.arraycopy(bArrO, 0, bArr2, i12, bArrO.length);
        int length2 = i12 + bArrO.length;
        bArr2[length2] = 2;
        bArr2[length2 + 1] = (byte) bArrO2.length;
        System.arraycopy(bArrO2, 0, bArr2, length2 + 2, bArrO2.length);
        return bArr2;
    }

    public static int d(EllipticCurve ellipticCurve) {
        return j(ellipticCurve).subtract(BigInteger.ONE).bitLength();
    }

    public static int e(EllipticCurve ellipticCurve) {
        return (d(ellipticCurve) + 7) / 8;
    }

    public static KeyPair f(ECParameterSpec eCParameterSpec) throws InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGeneratorA = m.f4874g.a("EC");
        keyPairGeneratorA.initialize(eCParameterSpec);
        return keyPairGeneratorA.generateKeyPair();
    }

    public static ECParameterSpec g(b bVar) throws NoSuchAlgorithmException {
        int i10 = a.b[bVar.ordinal()];
        if (i10 == 1) {
            return k();
        }
        if (i10 == 2) {
            return l();
        }
        if (i10 == 3) {
            return m();
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + bVar);
    }

    public static ECPrivateKey h(b bVar, byte[] bArr) throws NoSuchAlgorithmException {
        return (ECPrivateKey) m.f4875h.a("EC").generatePrivate(new ECPrivateKeySpec(ve.a.a(bArr), g(bVar)));
    }

    public static ECPublicKey i(b bVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecG = g(bVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        ve.g.b(eCPoint, eCParameterSpecG.getCurve());
        return (ECPublicKey) m.f4875h.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecG));
    }

    public static BigInteger j(EllipticCurve ellipticCurve) {
        return ve.g.d(ellipticCurve);
    }

    public static ECParameterSpec k() {
        return ve.g.f32942a;
    }

    public static ECParameterSpec l() {
        return ve.g.b;
    }

    public static ECParameterSpec m() {
        return ve.g.f32943c;
    }

    public static boolean n(byte[] bArr) {
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

    public static byte[] o(byte[] bArr) {
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
