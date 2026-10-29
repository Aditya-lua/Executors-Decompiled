package p076df;

import bf.C1417r0;
import bf.C1419s0;
import cf.C1640f0;
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
import p465ue.C11844b;
import pe.C10229j;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: df.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C4602x implements InterfaceC10245z {

    /* JADX INFO: renamed from: a */
    public static final C11844b.b f18848a = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static final byte[] f18849b = new byte[0];

    /* JADX INFO: renamed from: c */
    public static final byte[] f18850c = {0};

    /* JADX INFO: renamed from: df.x$b */
    public static final class b implements InterfaceC10245z {

        /* JADX INFO: renamed from: a */
        public final RSAPrivateCrtKey f18851a;

        /* JADX INFO: renamed from: b */
        public final RSAPublicKey f18852b;

        /* JADX INFO: renamed from: c */
        public final EnumC4593o f18853c;

        /* JADX INFO: renamed from: d */
        public final EnumC4593o f18854d;

        /* JADX INFO: renamed from: e */
        public final int f18855e;

        /* JADX INFO: renamed from: f */
        public final byte[] f18856f;

        /* JADX INFO: renamed from: g */
        public final byte[] f18857g;

        /* JADX INFO: renamed from: c */
        private byte[] m22732c(byte[] bArr) {
            return m22734d(m22733b(bArr, this.f18852b.getModulus().bitLength() - 1));
        }

        @Override // pe.InterfaceC10245z
        /* JADX INFO: renamed from: a */
        public byte[] mo7287a(byte[] bArr) {
            byte[] bArrM22732c = m22732c(bArr);
            byte[] bArr2 = this.f18856f;
            return bArr2.length == 0 ? bArrM22732c : C4583e.m22661a(bArr2, bArrM22732c);
        }

        /* JADX INFO: renamed from: b */
        public final byte[] m22733b(byte[] bArr, int i10) throws GeneralSecurityException {
            C4578a0.m22641e(this.f18853c);
            MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a(C4604z.m22742e(this.f18853c));
            messageDigestM22699a.update(bArr);
            byte[] bArr2 = this.f18857g;
            if (bArr2.length != 0) {
                messageDigestM22699a.update(bArr2);
            }
            byte[] bArrDigest = messageDigestM22699a.digest();
            int digestLength = messageDigestM22699a.getDigestLength();
            int i11 = 1;
            int i12 = ((i10 - 1) / 8) + 1;
            int i13 = this.f18855e;
            if (i12 < digestLength + i13 + 2) {
                throw new GeneralSecurityException("encoding error");
            }
            byte[] bArrM22724a = C4599u.m22724a(i13);
            int i14 = digestLength + 8;
            byte[] bArr3 = new byte[this.f18855e + i14];
            System.arraycopy(bArrDigest, 0, bArr3, 8, digestLength);
            System.arraycopy(bArrM22724a, 0, bArr3, i14, bArrM22724a.length);
            byte[] bArrDigest2 = messageDigestM22699a.digest(bArr3);
            int i15 = (i12 - digestLength) - 1;
            byte[] bArr4 = new byte[i15];
            int i16 = this.f18855e;
            bArr4[((i12 - i16) - digestLength) - 2] = 1;
            System.arraycopy(bArrM22724a, 0, bArr4, ((i12 - i16) - digestLength) - 1, bArrM22724a.length);
            byte[] bArrM22741d = C4604z.m22741d(bArrDigest2, i15, this.f18854d);
            byte[] bArr5 = new byte[i15];
            for (int i17 = 0; i17 < i15; i17++) {
                bArr5[i17] = (byte) (bArr4[i17] ^ bArrM22741d[i17]);
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

        /* JADX INFO: renamed from: d */
        public final byte[] m22734d(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
            C4591m<InterfaceC4592n.a, Cipher> c4591m = C4591m.f18797b;
            Cipher cipherM22699a = c4591m.m22699a("RSA/ECB/NOPADDING");
            cipherM22699a.init(2, this.f18851a);
            byte[] bArrDoFinal = cipherM22699a.doFinal(bArr);
            Cipher cipherM22699a2 = c4591m.m22699a("RSA/ECB/NOPADDING");
            cipherM22699a2.init(1, this.f18852b);
            if (new BigInteger(1, bArr).equals(new BigInteger(1, cipherM22699a2.doFinal(bArrDoFinal)))) {
                return bArrDoFinal;
            }
            throw new IllegalStateException("Security bug: RSA signature computation error");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(RSAPrivateCrtKey rSAPrivateCrtKey, EnumC4593o enumC4593o, EnumC4593o enumC4593o2, int i10, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (C11844b.m44242c()) {
                throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            }
            C4578a0.m22641e(enumC4593o);
            if (!enumC4593o.equals(enumC4593o2)) {
                throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
            }
            C4578a0.m22639c(rSAPrivateCrtKey.getModulus().bitLength());
            C4578a0.m22640d(rSAPrivateCrtKey.getPublicExponent());
            this.f18851a = rSAPrivateCrtKey;
            this.f18852b = (RSAPublicKey) C4591m.f18803h.m22699a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
            this.f18853c = enumC4593o;
            this.f18854d = enumC4593o2;
            this.f18855e = i10;
            this.f18856f = bArr;
            this.f18857g = bArr2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10245z m22731b(C1419s0 c1419s0) {
        try {
            return C1640f0.m8251b(c1419s0);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) C4591m.f18803h.m22699a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(c1419s0.mo7242c().m7378d(), c1419s0.m7364f().m7350e(), c1419s0.m7369k().m23852b(C10229j.m39322a()), c1419s0.m7367i().m23852b(C10229j.m39322a()), c1419s0.m7368j().m23852b(C10229j.m39322a()), c1419s0.m7365g().m23852b(C10229j.m39322a()), c1419s0.m7366h().m23852b(C10229j.m39322a()), c1419s0.m7363e().m23852b(C10229j.m39322a())));
            C1417r0 c1417r0M7364f = c1419s0.m7364f();
            return new b(rSAPrivateCrtKey, (EnumC4593o) C4603y.f18859b.m46321c(c1417r0M7364f.m7352g()), (EnumC4593o) C4603y.f18859b.m46321c(c1417r0M7364f.m7348c()), c1417r0M7364f.m7351f(), c1419s0.m7251b().m23850d(), c1419s0.m7364f().m7353h().equals(C1417r0.d.f5566d) ? f18850c : f18849b);
        }
    }
}
