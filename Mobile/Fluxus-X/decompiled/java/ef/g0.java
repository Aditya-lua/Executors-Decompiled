package ef;

import df.r0;
import df.t0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements re.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.b.EnumC0736b f13408g = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13409h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f13410i = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f13411a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f13412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f13414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f13415f;

    public g0(RSAPublicKey rSAPublicKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f13408g.a()) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!cVar.equals(cVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        ff.a0.c(rSAPublicKey.getModulus().bitLength());
        ff.a0.d(rSAPublicKey.getPublicExponent());
        this.f13411a = rSAPublicKey;
        this.b = d(cVar);
        this.f13412c = g(cVar, cVar2, i10);
        this.f13413d = bArr;
        this.f13414e = bArr2;
        this.f13415f = provider;
    }

    public static Provider b() {
        if (!s0.d() || s0.c().intValue() > 23) {
            return ye.c.a();
        }
        return null;
    }

    public static re.a0 c(t0 t0Var) throws NoSuchProviderException {
        Provider providerB = b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerB).generatePublic(new RSAPublicKeySpec(t0Var.d(), t0Var.e().e()));
        r0 r0VarE = t0Var.e();
        return new g0(rSAPublicKey, r0VarE.g(), r0VarE.c(), r0VarE.f(), t0Var.b().d(), t0Var.e().h().equals(r0.d.f12358d) ? f13410i : f13409h, providerB);
    }

    public static String d(r0.c cVar) {
        if (cVar == r0.c.b) {
            return "SHA256withRSA/PSS";
        }
        if (cVar == r0.c.f12354c) {
            return "SHA384withRSA/PSS";
        }
        if (cVar == r0.c.f12355d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: " + cVar);
    }

    public static String e(r0.c cVar) {
        if (cVar == r0.c.b) {
            return "SHA-256";
        }
        if (cVar == r0.c.f12354c) {
            return "SHA-384";
        }
        if (cVar == r0.c.f12355d) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unsupported MD hash: " + cVar);
    }

    public static MGF1ParameterSpec f(r0.c cVar) {
        if (cVar == r0.c.b) {
            return MGF1ParameterSpec.SHA256;
        }
        if (cVar == r0.c.f12354c) {
            return MGF1ParameterSpec.SHA384;
        }
        if (cVar == r0.c.f12355d) {
            return MGF1ParameterSpec.SHA512;
        }
        throw new IllegalArgumentException("Unsupported MGF1 hash: " + cVar);
    }

    public static PSSParameterSpec g(r0.c cVar, r0.c cVar2, int i10) {
        return new PSSParameterSpec(e(cVar), "MGF1", f(cVar2), i10, 1);
    }

    @Override // re.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!s0.e(this.f13413d, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f13415f);
        signature.initVerify(this.f13411a);
        signature.setParameter(this.f13412c);
        signature.update(bArr2);
        byte[] bArr3 = this.f13414e;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.f13413d;
        if (!signature.verify(bArr, bArr4.length, bArr.length - bArr4.length)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
