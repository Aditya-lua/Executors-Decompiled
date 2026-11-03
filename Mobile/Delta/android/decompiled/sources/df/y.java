package df;

import bf.r0;
import bf.t0;
import cf.g0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements pe.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14759a = ue.b.EnumC0590b.b;
    public static final we.h<o, r0.c> b = we.h.a().a(o.SHA256, r0.c.b).a(o.SHA384, r0.c.f4156c).a(o.SHA512, r0.c.f4157d).b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f14760c = new byte[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f14761d = {0};

    public static final class b implements pe.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RSAPublicKey f14762a;
        public final o b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f14763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f14765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f14766f;

        private void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            BigInteger publicExponent = this.f14762a.getPublicExponent();
            BigInteger modulus = this.f14762a.getModulus();
            int iBitLength = (modulus.bitLength() + 7) / 8;
            int iBitLength2 = (modulus.bitLength() + 6) / 8;
            if (iBitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger bigIntegerA = z.a(bArr);
            if (bigIntegerA.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            b(bArr2, z.b(bigIntegerA.modPow(publicExponent, modulus), iBitLength2), modulus.bitLength() - 1);
        }

        @Override // pe.a0
        public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3 = this.f14765e;
            if (bArr3.length == 0) {
                c(bArr, bArr2);
            } else {
                if (!s0.e(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                c(Arrays.copyOfRange(bArr, this.f14765e.length, bArr.length), bArr2);
            }
        }

        public final void b(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
            a0.e(this.b);
            MessageDigest messageDigestA = m.f14710e.a(z.e(this.b));
            messageDigestA.update(bArr);
            byte[] bArr3 = this.f14766f;
            if (bArr3.length != 0) {
                messageDigestA.update(bArr3);
            }
            byte[] bArrDigest = messageDigestA.digest();
            int digestLength = messageDigestA.getDigestLength();
            int length = bArr2.length;
            if (length < this.f14764d + digestLength + 2) {
                throw new GeneralSecurityException("inconsistent");
            }
            byte b = 1;
            if (bArr2[bArr2.length - 1] != -68) {
                throw new GeneralSecurityException("inconsistent");
            }
            int i11 = length - digestLength;
            int i12 = i11 - 1;
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, i12);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, bArrCopyOf.length, bArrCopyOf.length + digestLength);
            int i13 = 0;
            while (true) {
                int i14 = i13;
                byte b10 = b;
                int i15 = i12;
                long j10 = (((long) length) * 8) - ((long) i10);
                if (i13 < j10) {
                    if (((bArrCopyOf[i14 / 8] >> (7 - (i14 % 8))) & 1) != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i13 = i14 + 1;
                    b = b10;
                    i12 = i15;
                } else {
                    byte[] bArrD = z.d(bArrCopyOfRange, i15, this.f14763c);
                    int length2 = bArrD.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr4[i16] = (byte) (bArrD[i16] ^ bArrCopyOf[i16]);
                    }
                    for (int i17 = 0; i17 <= j10; i17++) {
                        int i18 = i17 / 8;
                        bArr4[i18] = (byte) ((~(b10 << (7 - (i17 % 8)))) & bArr4[i18]);
                    }
                    int i19 = 0;
                    while (true) {
                        int i20 = this.f14764d;
                        if (i19 >= (i11 - i20) - 2) {
                            if (bArr4[(i11 - i20) - 2] != b10) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i20, length2);
                            int i21 = digestLength + 8;
                            byte[] bArr5 = new byte[this.f14764d + i21];
                            System.arraycopy(bArrDigest, 0, bArr5, 8, bArrDigest.length);
                            System.arraycopy(bArrCopyOfRange2, 0, bArr5, i21, bArrCopyOfRange2.length);
                            if (!e.b(messageDigestA.digest(bArr5), bArrCopyOfRange)) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            return;
                        }
                        if (bArr4[i19] != 0) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        i19++;
                    }
                }
            }
        }

        public b(RSAPublicKey rSAPublicKey, o oVar, o oVar2, int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (ue.b.c()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            a0.e(oVar);
            if (!oVar.equals(oVar2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            a0.c(rSAPublicKey.getModulus().bitLength());
            a0.d(rSAPublicKey.getPublicExponent());
            this.f14762a = rSAPublicKey;
            this.b = oVar;
            this.f14763c = oVar2;
            this.f14764d = i10;
            this.f14765e = bArr;
            this.f14766f = bArr2;
        }
    }

    public static pe.a0 b(t0 t0Var) {
        try {
            return g0.c(t0Var);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) m.f14713h.a("RSA").generatePublic(new RSAPublicKeySpec(t0Var.d(), t0Var.e().e()));
            r0 r0VarE = t0Var.e();
            return new b(rSAPublicKey, (o) b.c(r0VarE.g()), (o) b.c(r0VarE.c()), r0VarE.f(), t0Var.b().d(), t0Var.e().h().equals(r0.d.f4160d) ? f14761d : f14760c);
        }
    }
}
