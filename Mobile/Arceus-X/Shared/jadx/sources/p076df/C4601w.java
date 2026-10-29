package p076df;

import bf.C1401j0;
import bf.C1405l0;
import cf.C1659x;
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

/* JADX INFO: renamed from: df.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C4601w implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: a */
    public static final C11844b.b f18839a = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static final byte[] f18840b = new byte[0];

    /* JADX INFO: renamed from: c */
    public static final byte[] f18841c = {0};

    /* JADX INFO: renamed from: d */
    public static final C12371h<EnumC4593o, C1401j0.c> f18842d = C12371h.m46319a().m46322a(EnumC4593o.SHA256, C1401j0.c.f5499b).m46322a(EnumC4593o.SHA384, C1401j0.c.f5500c).m46322a(EnumC4593o.SHA512, C1401j0.c.f5501d).m46323b();

    /* JADX INFO: renamed from: df.w$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18843a;

        static {
            int[] iArr = new int[EnumC4593o.values().length];
            f18843a = iArr;
            try {
                iArr[EnumC4593o.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18843a[EnumC4593o.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18843a[EnumC4593o.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: df.w$b */
    public static final class b implements InterfaceC10212a0 {

        /* JADX INFO: renamed from: a */
        public final RSAPublicKey f18844a;

        /* JADX INFO: renamed from: b */
        public final EnumC4593o f18845b;

        /* JADX INFO: renamed from: c */
        public final byte[] f18846c;

        /* JADX INFO: renamed from: d */
        public final byte[] f18847d;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.security.interfaces.RSAPublicKey), (r2v0 df.o), (r3v0 byte[]), (r4v0 byte[]) A[MD:(java.security.interfaces.RSAPublicKey, df.o, byte[], byte[]):void throws java.security.GeneralSecurityException (m)] (LINE:1) call: df.w.b.<init>(java.security.interfaces.RSAPublicKey, df.o, byte[], byte[]):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(RSAPublicKey rSAPublicKey, EnumC4593o enumC4593o, byte[] bArr, byte[] bArr2, a aVar) {
            this(rSAPublicKey, enumC4593o, bArr, bArr2);
        }

        /* JADX INFO: renamed from: c */
        private void m22728c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            BigInteger publicExponent = this.f18844a.getPublicExponent();
            BigInteger modulus = this.f18844a.getModulus();
            int iBitLength = (modulus.bitLength() + 7) / 8;
            if (iBitLength != bArr.length) {
                throw new GeneralSecurityException("invalid signature's length");
            }
            BigInteger bigIntegerM22738a = C4604z.m22738a(bArr);
            if (bigIntegerM22738a.compareTo(modulus) >= 0) {
                throw new GeneralSecurityException("signature out of range");
            }
            if (!C4583e.m22662b(C4604z.m22739b(bigIntegerM22738a.modPow(publicExponent, modulus), iBitLength), m22729b(bArr2, iBitLength, this.f18845b))) {
                throw new GeneralSecurityException("invalid signature");
            }
        }

        @Override // pe.InterfaceC10212a0
        /* JADX INFO: renamed from: a */
        public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            byte[] bArr3 = this.f18846c;
            if (bArr3.length == 0) {
                m22728c(bArr, bArr2);
            } else {
                if (!C12394s0.m46452e(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                m22728c(Arrays.copyOfRange(bArr, this.f18846c.length, bArr.length), bArr2);
            }
        }

        /* JADX INFO: renamed from: b */
        public final byte[] m22729b(byte[] bArr, int i10, EnumC4593o enumC4593o) throws GeneralSecurityException {
            C4578a0.m22641e(enumC4593o);
            MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a(C4604z.m22742e(this.f18845b));
            messageDigestM22699a.update(bArr);
            byte[] bArr2 = this.f18847d;
            if (bArr2.length != 0) {
                messageDigestM22699a.update(bArr2);
            }
            byte[] bArrDigest = messageDigestM22699a.digest();
            byte[] bArrM22730d = m22730d(enumC4593o);
            int length = bArrM22730d.length + bArrDigest.length;
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
            System.arraycopy(bArrM22730d, 0, bArr3, i13, bArrM22730d.length);
            System.arraycopy(bArrDigest, 0, bArr3, i13 + bArrM22730d.length, bArrDigest.length);
            return bArr3;
        }

        /* JADX INFO: renamed from: d */
        public final byte[] m22730d(EnumC4593o enumC4593o) throws GeneralSecurityException {
            int i10 = a.f18843a[enumC4593o.ordinal()];
            if (i10 == 1) {
                return C4594p.m22709a("3031300d060960864801650304020105000420");
            }
            if (i10 == 2) {
                return C4594p.m22709a("3041300d060960864801650304020205000430");
            }
            if (i10 == 3) {
                return C4594p.m22709a("3051300d060960864801650304020305000440");
            }
            throw new GeneralSecurityException("Unsupported hash " + enumC4593o);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(RSAPublicKey rSAPublicKey, EnumC4593o enumC4593o, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (C11844b.m44242c()) {
                throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
            }
            C4578a0.m22641e(enumC4593o);
            C4578a0.m22639c(rSAPublicKey.getModulus().bitLength());
            C4578a0.m22640d(rSAPublicKey.getPublicExponent());
            this.f18844a = rSAPublicKey;
            this.f18845b = enumC4593o;
            this.f18846c = bArr;
            this.f18847d = bArr2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10212a0 m22727b(C1405l0 c1405l0) {
        try {
            return C1659x.m8323c(c1405l0);
        } catch (NoSuchProviderException unused) {
            return new b((RSAPublicKey) C4591m.f18803h.m22699a("RSA").generatePublic(new RSAPublicKeySpec(c1405l0.m7325d(), c1405l0.m7326e().m7301e())), (EnumC4593o) f18842d.m46321c(c1405l0.m7326e().m7299c()), c1405l0.mo7253b().m23850d(), c1405l0.m7326e().m7302f().equals(C1401j0.d.f5505d) ? f18841c : f18840b, null);
        }
    }
}
