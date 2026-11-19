package ff;

import df.j0;
import df.k0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements re.z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.b.EnumC0736b f16073f = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f16074g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f16075h = {0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f16076i = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f16077a;
    public final RSAPublicKey b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16080e;

    public v(RSAPrivateCrtKey rSAPrivateCrtKey, o oVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f16073f.a()) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        a0.e(oVar);
        a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f16077a = rSAPrivateCrtKey;
        this.f16078c = z.g(oVar);
        this.b = (RSAPublicKey) m.f16050h.a("RSA").generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.f16079d = bArr;
        this.f16080e = bArr2;
    }

    public static re.z b(k0 k0Var) throws GeneralSecurityException {
        v vVar = new v((RSAPrivateCrtKey) m.f16050h.a("RSA").generatePrivate(new RSAPrivateCrtKeySpec(k0Var.c().d(), k0Var.f().e(), k0Var.k().b(re.j.a()), k0Var.i().b(re.j.a()), k0Var.j().b(re.j.a()), k0Var.g().b(re.j.a()), k0Var.h().b(re.j.a()), k0Var.e().b(re.j.a()))), (o) w.f16083d.c(k0Var.f().c()), k0Var.b().d(), k0Var.f().f().equals(j0.d.f12308d) ? f16075h : f16074g);
        re.a0 a0VarB = w.b(k0Var.c());
        try {
            byte[] bArr = f16076i;
            a0VarB.a(vVar.a(bArr), bArr);
            return vVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    private byte[] c(byte[] bArr) throws SignatureException, InvalidKeyException {
        m<n.g, Signature> mVar = m.f16046d;
        Signature signatureA = mVar.a(this.f16078c);
        signatureA.initSign(this.f16077a);
        signatureA.update(bArr);
        byte[] bArr2 = this.f16080e;
        if (bArr2.length > 0) {
            signatureA.update(bArr2);
        }
        byte[] bArrSign = signatureA.sign();
        Signature signatureA2 = mVar.a(this.f16078c);
        signatureA2.initVerify(this.b);
        signatureA2.update(bArr);
        byte[] bArr3 = this.f16080e;
        if (bArr3.length > 0) {
            signatureA2.update(bArr3);
        }
        if (signatureA2.verify(bArrSign)) {
            return bArrSign;
        }
        throw new RuntimeException("Security bug: RSA signature computation error");
    }

    @Override // re.z
    public byte[] a(byte[] bArr) throws SignatureException, InvalidKeyException {
        byte[] bArrC = c(bArr);
        byte[] bArr2 = this.f16079d;
        return bArr2.length == 0 ? bArrC : e.a(bArr2, bArrC);
    }
}
