package cf;

import af.r0;
import af.s0;
import bf.f0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements oe.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final te.b.EnumC0569b f4913a = te.b.EnumC0569b.b;
    public static final byte[] b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f4914c = {0};

    public static final class b implements oe.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RSAPrivateCrtKey f4915a;
        public final RSAPublicKey b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f4916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o f4917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f4919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f4920g;

        private byte[] c(byte[] bArr) {
            return d(b(bArr, this.b.getModulus().bitLength() - 1));
        }

        @Override // oe.z
        public byte[] a(byte[] bArr) {
            byte[] bArrC = c(bArr);
            byte[] bArr2 = this.f4919f;
            return bArr2.length == 0 ? bArrC : e.a(bArr2, bArrC);
        }

        public final byte[] b(byte[] bArr, int i10) throws GeneralSecurityException {
            a0.e(this.f4916c);
            MessageDigest messageDigestA = m.f4872e.a(z.e(this.f4916c));
            messageDigestA.update(bArr);
            byte[] bArr2 = this.f4920g;
            if (bArr2.length != 0) {
                messageDigestA.update(bArr2);
            }
            byte[] bArrDigest = messageDigestA.digest();
            int digestLength = messageDigestA.getDigestLength();
            int i11 = 1;
            int i12 = ((i10 - 1) / 8) + 1;
            int i13 = this.f4918e;
            if (i12 < digestLength + i13 + 2) {
                throw new GeneralSecurityException("encoding error");
            }
            byte[] bArrA = u.a(i13);
            int i14 = digestLength + 8;
            byte[] bArr3 = new byte[this.f4918e + i14];
            System.arraycopy(bArrDigest, 0, bArr3, 8, digestLength);
            System.arraycopy(bArrA, 0, bArr3, i14, bArrA.length);
            byte[] bArrDigest2 = messageDigestA.digest(bArr3);
            int i15 = (i12 - digestLength) - 1;
            byte[] bArr4 = new byte[i15];
            int i16 = this.f4918e;
            bArr4[((i12 - i16) - digestLength) - 2] = 1;
            System.arraycopy(bArrA, 0, bArr4, ((i12 - i16) - digestLength) - 1, bArrA.length);
            byte[] bArrD = z.d(bArrDigest2, i15, this.f4917d);
            byte[] bArr5 = new byte[i15];
            for (int i17 = 0; i17 < i15; i17++) {
                bArr5[i17] = (byte) (bArr4[i17] ^ bArrD[i17]);
            }
            int i18 = 0;
            while (true) {
                int i19 = i11;
                if (i18 >= (((long) i12) * 8) - ((long) i10)) {
                    int i20 = digestLength + i15;
                    byte[] bArr6 = new byte[i20 + 1];
                    System.arraycopy(bArr5, 0, bArr6, 0, i15);
                    System.arraycopy(bArrDigest2, 0, bArr6, i15, bArrDigest2.length);
                    bArr6[i20] = -68;
                    return bArr6;
                }
                int i21 = i18 / 8;
                bArr5[i21] = (byte) ((~(i19 << (7 - (i18 % 8)))) & bArr5[i21]);
                i18++;
                i11 = i19;
            }
        }

        public final byte[] d(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
            m<n.a, Cipher> mVar = m.b;
            Cipher cipherA = mVar.a("RSA/ECB/NOPADDING");
            cipherA.init(2, this.f4915a);
            byte[] bArrDoFinal = cipherA.doFinal(bArr);
            Cipher cipherA2 = mVar.a("RSA/ECB/NOPADDING");
            cipherA2.init(1, this.b);
            if (new BigInteger(1, bArr).equals(new BigInteger(1, cipherA2.doFinal(bArrDoFinal)))) {
                return bArrDoFinal;
            }
            throw new IllegalStateException("Security bug: RSA signature computation error");
        }

        public b(RSAPrivateCrtKey rSAPrivateCrtKey, o oVar, o oVar2, int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (te.b.c()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            a0.e(oVar);
            if (!oVar.equals(oVar2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            a0.c(rSAPrivateCrtKey.getModulus().bitLength());
            a0.d(rSAPrivateCrtKey.getPublicExponent());
            this.f4915a = rSAPrivateCrtKey;
            this.b = (RSAPublicKey) m.f4875h.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.f4916c = oVar;
            this.f4917d = oVar2;
            this.f4918e = i10;
            this.f4919f = bArr;
            this.f4920g = bArr2;
        }
    }

    public static oe.z b(s0 s0Var) {
        try {
            return f0.b(s0Var);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) m.f4875h.a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(s0Var.c().d(), s0Var.f().e(), s0Var.k().b(oe.j.a()), s0Var.i().b(oe.j.a()), s0Var.j().b(oe.j.a()), s0Var.g().b(oe.j.a()), s0Var.h().b(oe.j.a()), s0Var.e().b(oe.j.a())));
            r0 r0VarF = s0Var.f();
            return new b(rSAPrivateCrtKey, (o) y.b.c(r0VarF.g()), (o) y.b.c(r0VarF.c()), r0VarF.f(), s0Var.b().d(), s0Var.f().h().equals(r0.d.f488d) ? f4914c : b);
        }
    }
}
