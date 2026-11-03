package df;

import bf.j0;
import bf.l0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements pe.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14744a = ue.b.EnumC0590b.b;
    public static final byte[] b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f14745c = {0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.h<o, j0.c> f14746d = we.h.a().a(o.SHA256, j0.c.b).a(o.SHA384, j0.c.f4106c).a(o.SHA512, j0.c.f4107d).b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14747a;

        static {
            int[] iArr = new int[o.values().length];
            f14747a = iArr;
            try {
                iArr[o.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14747a[o.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14747a[o.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b implements pe.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RSAPublicKey f14748a;
        public final o b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f14749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f14750d;

        public /* synthetic */ b(RSAPublicKey rSAPublicKey, o oVar, byte[] bArr, byte[] bArr2, a aVar) {
            this(rSAPublicKey, oVar, bArr, bArr2);
        }

        private void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            BigInteger publicExponent = this.f14748a.getPublicExponent();
            BigInteger modulus = this.f14748a.getModulus();
            int iBitLength = (modulus.bitLength() + 7) / 8;
            if (iBitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger bigIntegerA = z.a(bArr);
            if (bigIntegerA.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            if (!e.b(z.b(bigIntegerA.modPow(publicExponent, modulus), iBitLength), b(bArr2, iBitLength, this.b))) {
                throw new GeneralSecurityException("invalid signature");
            }
        }

        @Override // pe.a0
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3 = this.f14749c;
            if (bArr3.length == 0) {
                c(bArr, bArr2);
            } else {
                if (!s0.e(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                c(Arrays.copyOfRange(bArr, this.f14749c.length, bArr.length), bArr2);
            }
        }

        public final byte[] b(byte[] bArr, int i10, o oVar) throws GeneralSecurityException {
            a0.e(oVar);
            MessageDigest messageDigestA = m.f14710e.a(z.e(this.b));
            messageDigestA.update(bArr);
            byte[] bArr2 = this.f14750d;
            if (bArr2.length != 0) {
                messageDigestA.update(bArr2);
            }
            byte[] bArrDigest = messageDigestA.digest();
            byte[] bArrD = d(oVar);
            int length = bArrD.length + bArrDigest.length;
            if (i10 < length + 11) {
                throw new GeneralSecurityException("intended encoded message length too short");
            }
            byte[] bArr3 = new byte[i10];
            bArr3[0] = 0;
            bArr3[1] = 1;
            int i11 = 2;
            int i12 = 0;
            while (i12 < (i10 - length) - 3) {
                bArr3[i11] = -1;
                i12++;
                i11++;
            }
            int i13 = i11 + 1;
            bArr3[i11] = 0;
            System.arraycopy(bArrD, 0, bArr3, i13, bArrD.length);
            System.arraycopy(bArrDigest, 0, bArr3, i13 + bArrD.length, bArrDigest.length);
            return bArr3;
        }

        public final byte[] d(o oVar) throws GeneralSecurityException {
            int i10 = a.f14747a[oVar.ordinal()];
            if (i10 == 1) {
                return p.a("3031300d060960864801650304020105000420");
            }
            if (i10 == 2) {
                return p.a("3041300d060960864801650304020205000430");
            }
            if (i10 == 3) {
                return p.a("3051300d060960864801650304020305000440");
            }
            throw new GeneralSecurityException("Unsupported hash " + oVar);
        }

        public b(RSAPublicKey rSAPublicKey, o oVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (ue.b.c()) {
                throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
            }
            a0.e(oVar);
            a0.c(rSAPublicKey.getModulus().bitLength());
            a0.d(rSAPublicKey.getPublicExponent());
            this.f14748a = rSAPublicKey;
            this.b = oVar;
            this.f14749c = bArr;
            this.f14750d = bArr2;
        }
    }

    public static pe.a0 b(l0 l0Var) {
        try {
            return cf.x.c(l0Var);
        } catch (NoSuchProviderException unused) {
            return new b((RSAPublicKey) m.f14713h.a("RSA").generatePublic(new RSAPublicKeySpec(l0Var.d(), l0Var.e().e())), (o) f14746d.c(l0Var.e().c()), l0Var.b().d(), l0Var.e().f().equals(j0.d.f4110d) ? f14745c : b, null);
        }
    }
}
