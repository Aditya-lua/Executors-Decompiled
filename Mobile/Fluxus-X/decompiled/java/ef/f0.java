package ef;

import df.r0;
import df.s0;
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
public final class f0 implements re.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.b.EnumC0736b f13390g = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13391h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f13392i = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f13393a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f13394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f13396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f13397f;

    public f0(RSAPrivateCrtKey rSAPrivateCrtKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f13390g.a()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ff.a0.c(rSAPrivateCrtKey.getModulus().bitLength());
        ff.a0.d(rSAPrivateCrtKey.getPublicExponent());
        this.f13393a = rSAPrivateCrtKey;
        this.b = g0.d(cVar);
        this.f13394c = g0.g(cVar, cVar2, i10);
        this.f13395d = bArr;
        this.f13396e = bArr2;
        this.f13397f = provider;
    }

    public static re.z b(s0 s0Var) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerB = g0.b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerB);
        r0 r0VarF = s0Var.f();
        return new f0((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(s0Var.c().d(), r0VarF.e(), s0Var.k().b(re.j.a()), s0Var.i().b(re.j.a()), s0Var.j().b(re.j.a()), s0Var.g().b(re.j.a()), s0Var.h().b(re.j.a()), s0Var.e().b(re.j.a()))), r0VarF.g(), r0VarF.c(), r0VarF.f(), s0Var.b().d(), r0VarF.h().equals(r0.d.f12358d) ? f13392i : f13391h, providerB);
    }

    @Override // re.z
    public byte[] a(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        Signature signature = Signature.getInstance(this.b, this.f13397f);
        signature.initSign(this.f13393a);
        signature.setParameter(this.f13394c);
        signature.update(bArr);
        byte[] bArr2 = this.f13396e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.f13395d;
        return bArr3.length == 0 ? bArrSign : ff.e.a(bArr3, bArrSign);
    }
}
