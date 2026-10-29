package p076df;

import bf.C1401j0;
import bf.C1403k0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import p465ue.C11844b;
import pe.C10229j;
import pe.InterfaceC10212a0;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: df.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C4600v implements InterfaceC10245z {

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f18830f = C11844b.b.f41602b;

    /* JADX INFO: renamed from: g */
    public static final byte[] f18831g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f18832h = {0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f18833i = {1, 2, 3};

    /* JADX INFO: renamed from: a */
    public final RSAPrivateCrtKey f18834a;

    /* JADX INFO: renamed from: b */
    public final RSAPublicKey f18835b;

    /* JADX INFO: renamed from: c */
    public final String f18836c;

    /* JADX INFO: renamed from: d */
    public final byte[] f18837d;

    /* JADX INFO: renamed from: e */
    public final byte[] f18838e;

    public C4600v(RSAPrivateCrtKey rSAPrivateCrtKey, EnumC4593o enumC4593o, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f18830f.mo44243a()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4578a0.m22641e(enumC4593o);
        C4578a0.m22639c(rSAPrivateCrtKey.getModulus().bitLength());
        C4578a0.m22640d(rSAPrivateCrtKey.getPublicExponent());
        this.f18834a = rSAPrivateCrtKey;
        this.f18836c = C4604z.m22744g(enumC4593o);
        this.f18835b = (RSAPublicKey) C4591m.f18803h.m22699a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f18837d = bArr;
        this.f18838e = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10245z m22725b(C1403k0 c1403k0) throws GeneralSecurityException {
        C4600v c4600v = new C4600v((RSAPrivateCrtKey) C4591m.f18803h.m22699a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(c1403k0.mo7242c().m7325d(), c1403k0.m7311f().m7301e(), c1403k0.m7316k().m23852b(C10229j.m39322a()), c1403k0.m7314i().m23852b(C10229j.m39322a()), c1403k0.m7315j().m23852b(C10229j.m39322a()), c1403k0.m7312g().m23852b(C10229j.m39322a()), c1403k0.m7313h().m23852b(C10229j.m39322a()), c1403k0.m7310e().m23852b(C10229j.m39322a()))), (EnumC4593o) C4601w.f18842d.m46321c(c1403k0.m7311f().m7299c()), c1403k0.m7251b().m23850d(), c1403k0.m7311f().m7302f().equals(C1401j0.d.f5505d) ? f18832h : f18831g);
        InterfaceC10212a0 interfaceC10212a0M22727b = C4601w.m22727b(c1403k0.mo7242c());
        try {
            byte[] bArr = f18833i;
            interfaceC10212a0M22727b.mo7293a(c4600v.mo7287a(bArr), bArr);
            return c4600v;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    private byte[] m22726c(byte[] bArr) throws SignatureException, InvalidKeyException {
        C4591m<InterfaceC4592n.g, Signature> c4591m = C4591m.f18799d;
        Signature signatureM22699a = c4591m.m22699a(this.f18836c);
        signatureM22699a.initSign(this.f18834a);
        signatureM22699a.update(bArr);
        byte[] bArr2 = this.f18838e;
        if (bArr2.length > 0) {
            signatureM22699a.update(bArr2);
        }
        byte[] bArrSign = signatureM22699a.sign();
        Signature signatureM22699a2 = c4591m.m22699a(this.f18836c);
        signatureM22699a2.initVerify(this.f18835b);
        signatureM22699a2.update(bArr);
        byte[] bArr3 = this.f18838e;
        if (bArr3.length > 0) {
            signatureM22699a2.update(bArr3);
        }
        if (signatureM22699a2.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    @Override // pe.InterfaceC10245z
    /* JADX INFO: renamed from: a */
    public byte[] mo7287a(byte[] bArr) throws SignatureException, InvalidKeyException {
        byte[] bArrM22726c = m22726c(bArr);
        byte[] bArr2 = this.f18837d;
        return bArr2.length == 0 ? bArrM22726c : C4583e.m22661a(bArr2, bArrM22726c);
    }
}
