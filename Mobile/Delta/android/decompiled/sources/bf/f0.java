package bf;

import af.r0;
import af.s0;
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
public final class f0 implements oe.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final te.b.EnumC0569b f4116g = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4117h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4118i = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f4119a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f4120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f4123f;

    public f0(RSAPrivateCrtKey rSAPrivateCrtKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f4116g.a()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        cf.a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f4119a = rSAPrivateCrtKey;
        this.b = g0.d(cVar);
        this.f4120c = g0.g(cVar, cVar2, i10);
        this.f4121d = bArr;
        this.f4122e = bArr2;
        this.f4123f = provider;
    }

    public static oe.z b(s0 s0Var) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerB = g0.b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerB);
        r0 r0VarF = s0Var.f();
        return new f0((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(s0Var.c().d(), r0VarF.e(), s0Var.k().b(oe.j.a()), s0Var.i().b(oe.j.a()), s0Var.j().b(oe.j.a()), s0Var.g().b(oe.j.a()), s0Var.h().b(oe.j.a()), s0Var.e().b(oe.j.a()))), r0VarF.g(), r0VarF.c(), r0VarF.f(), s0Var.b().d(), r0VarF.h().equals(r0.d.f488d) ? f4118i : f4117h, providerB);
    }

    @Override // oe.z
    public byte[] a(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        Signature signature = Signature.getInstance(this.b, this.f4123f);
        signature.initSign(this.f4119a);
        signature.setParameter(this.f4120c);
        signature.update(bArr);
        byte[] bArr2 = this.f4122e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.f4121d;
        return bArr3.length == 0 ? bArrSign : cf.e.a(bArr3, bArrSign);
    }
}
