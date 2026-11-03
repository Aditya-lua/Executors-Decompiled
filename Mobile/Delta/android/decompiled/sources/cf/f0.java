package cf;

import bf.r0;
import bf.s0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements pe.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ue.b.EnumC0590b f4887g = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4888h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4889i = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f4890a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f4891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f4894f;

    public f0(RSAPrivateCrtKey rSAPrivateCrtKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f4887g.a()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        df.a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        df.a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f4890a = rSAPrivateCrtKey;
        this.b = g0.d(cVar);
        this.f4891c = g0.g(cVar, cVar2, i10);
        this.f4892d = bArr;
        this.f4893e = bArr2;
        this.f4894f = provider;
    }

    public static pe.z b(s0 s0Var) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerB = g0.b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerB);
        r0 r0VarF = s0Var.f();
        return new f0((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(s0Var.c().d(), r0VarF.e(), s0Var.k().b(pe.j.a()), s0Var.i().b(pe.j.a()), s0Var.j().b(pe.j.a()), s0Var.g().b(pe.j.a()), s0Var.h().b(pe.j.a()), s0Var.e().b(pe.j.a()))), r0VarF.g(), r0VarF.c(), r0VarF.f(), s0Var.b().d(), r0VarF.h().equals(r0.d.f4160d) ? f4889i : f4888h, providerB);
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        Signature signature = Signature.getInstance(this.b, this.f4894f);
        signature.initSign(this.f4890a);
        signature.setParameter(this.f4891c);
        signature.update(bArr);
        byte[] bArr2 = this.f4893e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.f4892d;
        return bArr3.length == 0 ? bArrSign : df.e.a(bArr3, bArrSign);
    }
}
