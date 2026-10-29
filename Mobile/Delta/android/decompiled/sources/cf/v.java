package cf;

import af.j0;
import af.k0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements oe.z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f4898f = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f4899g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4900h = {0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4901i = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f4902a;
    public final RSAPublicKey b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4905e;

    public v(RSAPrivateCrtKey rSAPrivateCrtKey, o oVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f4898f.a()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        a0.e(oVar);
        a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f4902a = rSAPrivateCrtKey;
        this.f4903c = z.g(oVar);
        this.b = (RSAPublicKey) m.f4875h.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f4904d = bArr;
        this.f4905e = bArr2;
    }

    public static oe.z b(k0 k0Var) throws GeneralSecurityException {
        v vVar = new v((RSAPrivateCrtKey) m.f4875h.a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(k0Var.c().d(), k0Var.f().e(), k0Var.k().b(oe.j.a()), k0Var.i().b(oe.j.a()), k0Var.j().b(oe.j.a()), k0Var.g().b(oe.j.a()), k0Var.h().b(oe.j.a()), k0Var.e().b(oe.j.a()))), (o) w.f4908d.c(k0Var.f().c()), k0Var.b().d(), k0Var.f().f().equals(j0.d.f438d) ? f4900h : f4899g);
        oe.a0 a0VarB = w.b(k0Var.c());
        try {
            byte[] bArr = f4901i;
            a0VarB.a(vVar.a(bArr), bArr);
            return vVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    private byte[] c(byte[] bArr) throws SignatureException, InvalidKeyException {
        m<n.g, Signature> mVar = m.f4871d;
        Signature signatureA = mVar.a(this.f4903c);
        signatureA.initSign(this.f4902a);
        signatureA.update(bArr);
        byte[] bArr2 = this.f4905e;
        if (bArr2.length > 0) {
            signatureA.update(bArr2);
        }
        byte[] bArrSign = signatureA.sign();
        Signature signatureA2 = mVar.a(this.f4903c);
        signatureA2.initVerify(this.b);
        signatureA2.update(bArr);
        byte[] bArr3 = this.f4905e;
        if (bArr3.length > 0) {
            signatureA2.update(bArr3);
        }
        if (signatureA2.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    @Override // oe.z
    public byte[] a(byte[] bArr) throws SignatureException, InvalidKeyException {
        byte[] bArrC = c(bArr);
        byte[] bArr2 = this.f4904d;
        return bArr2.length == 0 ? bArrC : e.a(bArr2, bArrC);
    }
}
