package p076df;

import bf.C1417r0;
import bf.C1421t0;
import cf.C1642g0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import p465ue.C11844b;
import p515we.C12371h;
import p515we.C12394s0;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: df.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C4603y implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: a */
    public static final C11844b.b f18858a = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static final C12371h<EnumC4593o, C1417r0.c> f18859b = C12371h.m46319a().m46322a(EnumC4593o.SHA256, C1417r0.c.f5560b).m46322a(EnumC4593o.SHA384, C1417r0.c.f5561c).m46322a(EnumC4593o.SHA512, C1417r0.c.f5562d).m46323b();

    /* JADX INFO: renamed from: c */
    public static final byte[] f18860c = new byte[0];

    /* JADX INFO: renamed from: d */
    public static final byte[] f18861d = {0};

    /* JADX INFO: renamed from: df.y$b */
    public static final class b implements InterfaceC10212a0 {

        /* JADX INFO: renamed from: a */
        public final RSAPublicKey f18862a;

        /* JADX INFO: renamed from: b */
        public final EnumC4593o f18863b;

        /* JADX INFO: renamed from: c */
        public final EnumC4593o f18864c;

        /* JADX INFO: renamed from: d */
        public final int f18865d;

        /* JADX INFO: renamed from: e */
        public final byte[] f18866e;

        /* JADX INFO: renamed from: f */
        public final byte[] f18867f;

        /* JADX INFO: renamed from: c */
        private void m22736c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            BigInteger publicExponent = this.f18862a.getPublicExponent();
            BigInteger modulus = this.f18862a.getModulus();
            int iBitLength = (modulus.bitLength() + 7) / 8;
            int iBitLength2 = (modulus.bitLength() + 6) / 8;
            if (iBitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger bigIntegerM22738a = C4604z.m22738a(bArr);
            if (bigIntegerM22738a.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            m22737b(bArr2, C4604z.m22739b(bigIntegerM22738a.modPow(publicExponent, modulus), iBitLength2), modulus.bitLength() - 1);
        }

        @Override // pe.InterfaceC10212a0
        /* JADX INFO: renamed from: a */
        public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3 = this.f18866e;
            if (bArr3.length == 0) {
                m22736c(bArr, bArr2);
            } else {
                if (!C12394s0.m46452e(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                m22736c(Arrays.copyOfRange(bArr, this.f18866e.length, bArr.length), bArr2);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m22737b(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
            C4578a0.m22641e(this.f18863b);
            MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a(C4604z.m22742e(this.f18863b));
            messageDigestM22699a.update(bArr);
            byte[] bArr3 = this.f18867f;
            if (bArr3.length != 0) {
                messageDigestM22699a.update(bArr3);
            }
            byte[] bArrDigest = messageDigestM22699a.digest();
            int digestLength = messageDigestM22699a.getDigestLength();
            int length = bArr2.length;
            if (length < this.f18865d + digestLength + 2) {
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
                    byte[] bArrM22741d = C4604z.m22741d(bArrCopyOfRange, i15, this.f18864c);
                    int length2 = bArrM22741d.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr4[i16] = (byte) (bArrM22741d[i16] ^ bArrCopyOf[i16]);
                    }
                    for (int i17 = 0; i17 <= j10; i17++) {
                        int i18 = i17 / 8;
                        bArr4[i18] = (byte) ((~(b10 << (7 - (i17 % 8)))) & bArr4[i18]);
                    }
                    int i19 = 0;
                    while (true) {
                        int i20 = this.f18865d;
                        if (i19 >= (i11 - i20) - 2) {
                            if (bArr4[(i11 - i20) - 2] != b10) {
                                throw new GeneralSecurityException("inconsistent");
                            }
                            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr4, length2 - i20, length2);
                            int i21 = digestLength + 8;
                            byte[] bArr5 = new byte[this.f18865d + i21];
                            System.arraycopy(bArrDigest, 0, bArr5, 8, bArrDigest.length);
                            System.arraycopy(bArrCopyOfRange2, 0, bArr5, i21, bArrCopyOfRange2.length);
                            if (!C4583e.m22662b(messageDigestM22699a.digest(bArr5), bArrCopyOfRange)) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(RSAPublicKey rSAPublicKey, EnumC4593o enumC4593o, EnumC4593o enumC4593o2, int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (C11844b.m44242c()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            C4578a0.m22641e(enumC4593o);
            if (!enumC4593o.equals(enumC4593o2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            C4578a0.m22639c(rSAPublicKey.getModulus().bitLength());
            C4578a0.m22640d(rSAPublicKey.getPublicExponent());
            this.f18862a = rSAPublicKey;
            this.f18863b = enumC4593o;
            this.f18864c = enumC4593o2;
            this.f18865d = i10;
            this.f18866e = bArr;
            this.f18867f = bArr2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10212a0 m22735b(C1421t0 c1421t0) {
        try {
            return C1642g0.m8278c(c1421t0);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) C4591m.f18803h.m22699a("RSA").generatePublic(new RSAPublicKeySpec(c1421t0.m7378d(), c1421t0.m7379e().m7350e()));
            C1417r0 c1417r0M7379e = c1421t0.m7379e();
            return new b(rSAPublicKey, (EnumC4593o) f18859b.m46321c(c1417r0M7379e.m7352g()), (EnumC4593o) f18859b.m46321c(c1417r0M7379e.m7348c()), c1417r0M7379e.m7351f(), c1421t0.mo7253b().m23850d(), c1421t0.m7379e().m7353h().equals(C1417r0.d.f5566d) ? f18861d : f18860c);
        }
    }
}
