package bf;

import af.r0;
import af.t0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import ve.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements oe.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final te.b.EnumC0569b f4134g = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4135h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4136i = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f4137a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f4138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f4141f;

    public g0(RSAPublicKey rSAPublicKey, r0.c cVar, r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f4134g.a()) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!cVar.equals(cVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        cf.a0.c(rSAPublicKey.getModulus().bitLength());
        cf.a0.d(rSAPublicKey.getPublicExponent());
        this.f4137a = rSAPublicKey;
        this.b = d(cVar);
        this.f4138c = g(cVar, cVar2, i10);
        this.f4139d = bArr;
        this.f4140e = bArr2;
        this.f4141f = provider;
    }

    public static Provider b() {
        if (!s0.d() || s0.c().intValue() > 23) {
            return ve.c.a();
        }
        return null;
    }

    public static oe.a0 c(t0 t0Var) throws NoSuchProviderException {
        Provider providerB = b();
        if (providerB == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerB).generatePublic(new RSAPublicKeySpec(t0Var.d(), t0Var.e().e()));
        r0 r0VarE = t0Var.e();
        return new g0(rSAPublicKey, r0VarE.g(), r0VarE.c(), r0VarE.f(), t0Var.b().d(), t0Var.e().h().equals(r0.d.f488d) ? f4136i : f4135h, providerB);
    }

    public static String d(r0.c cVar) {
        if (cVar == r0.c.b) {
            return "SHA256withRSA/PSS";
        }
        if (cVar == r0.c.f484c) {
            return "SHA384withRSA/PSS";
        }
        if (cVar == r0.c.f485d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: " + cVar);
    }

    public static String e(r0.c cVar) {
        if (cVar == r0.c.b) {
            return "SHA-256";
        }
        if (cVar == r0.c.f484c) {
            return "SHA-384";
        }
        if (cVar == r0.c.f485d) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unsupported MD hash: " + cVar);
    }

    public static MGF1ParameterSpec f(r0.c cVar) {
        if (cVar == r0.c.b) {
            return MGF1ParameterSpec.SHA256;
        }
        if (cVar == r0.c.f484c) {
            return MGF1ParameterSpec.SHA384;
        }
        if (cVar == r0.c.f485d) {
            return MGF1ParameterSpec.SHA512;
        }
        throw new IllegalArgumentException("Unsupported MGF1 hash: " + cVar);
    }

    public static PSSParameterSpec g(r0.c cVar, r0.c cVar2, int i10) {
        return new PSSParameterSpec(e(cVar), "MGF1", f(cVar2), i10, 1);
    }

    @Override // oe.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!s0.e(this.f4139d, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f4141f);
        signature.initVerify(this.f4137a);
        signature.setParameter(this.f4138c);
        signature.update(bArr2);
        byte[] bArr3 = this.f4140e;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.f4139d;
        if (!signature.verify(bArr, bArr4.length, bArr.length - bArr4.length)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
