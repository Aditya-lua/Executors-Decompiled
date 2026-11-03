package df;

import bf.j0;
import bf.k0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements pe.z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14736f = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f14737g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f14738h = {0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f14739i = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f14740a;
    public final RSAPublicKey b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14743e;

    public v(RSAPrivateCrtKey rSAPrivateCrtKey, o oVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f14736f.a()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        a0.e(oVar);
        a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f14740a = rSAPrivateCrtKey;
        this.f14741c = z.g(oVar);
        this.b = (RSAPublicKey) m.f14713h.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f14742d = bArr;
        this.f14743e = bArr2;
    }

    public static pe.z b(k0 k0Var) throws GeneralSecurityException {
        v vVar = new v((RSAPrivateCrtKey) m.f14713h.a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(k0Var.c().d(), k0Var.f().e(), k0Var.k().b(pe.j.a()), k0Var.i().b(pe.j.a()), k0Var.j().b(pe.j.a()), k0Var.g().b(pe.j.a()), k0Var.h().b(pe.j.a()), k0Var.e().b(pe.j.a()))), (o) w.f14746d.c(k0Var.f().c()), k0Var.b().d(), k0Var.f().f().equals(j0.d.f4110d) ? f14738h : f14737g);
        pe.a0 a0VarB = w.b(k0Var.c());
        try {
            byte[] bArr = f14739i;
            a0VarB.a(vVar.a(bArr), bArr);
            return vVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    private byte[] c(byte[] bArr) throws SignatureException, InvalidKeyException {
        m<n.g, Signature> mVar = m.f14709d;
        Signature signatureA = mVar.a(this.f14741c);
        signatureA.initSign(this.f14740a);
        signatureA.update(bArr);
        byte[] bArr2 = this.f14743e;
        if (bArr2.length > 0) {
            signatureA.update(bArr2);
        }
        byte[] bArrSign = signatureA.sign();
        Signature signatureA2 = mVar.a(this.f14741c);
        signatureA2.initVerify(this.b);
        signatureA2.update(bArr);
        byte[] bArr3 = this.f14743e;
        if (bArr3.length > 0) {
            signatureA2.update(bArr3);
        }
        if (signatureA2.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) throws SignatureException, InvalidKeyException {
        byte[] bArrC = c(bArr);
        byte[] bArr2 = this.f14742d;
        return bArr2.length == 0 ? bArrC : e.a(bArr2, bArrC);
    }
}
