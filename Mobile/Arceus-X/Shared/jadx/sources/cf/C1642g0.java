package cf;

import bf.C1417r0;
import bf.C1421t0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import p076df.C4578a0;
import p465ue.C11844b;
import p515we.C12361c;
import p515we.C12394s0;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: cf.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1642g0 implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: g */
    public static final C11844b.b f6360g = C11844b.b.f41602b;

    /* JADX INFO: renamed from: h */
    public static final byte[] f6361h = new byte[0];

    /* JADX INFO: renamed from: i */
    public static final byte[] f6362i = {0};

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f6363a;

    /* JADX INFO: renamed from: b */
    public final String f6364b;

    /* JADX INFO: renamed from: c */
    public final PSSParameterSpec f6365c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6366d;

    /* JADX INFO: renamed from: e */
    public final byte[] f6367e;

    /* JADX INFO: renamed from: f */
    public final Provider f6368f;

    public C1642g0(RSAPublicKey rSAPublicKey, C1417r0.c cVar, C1417r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f6360g.mo44243a()) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!cVar.equals(cVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        C4578a0.m22639c(rSAPublicKey.getModulus().bitLength());
        C4578a0.m22640d(rSAPublicKey.getPublicExponent());
        this.f6363a = rSAPublicKey;
        this.f6364b = m8279d(cVar);
        this.f6365c = m8282g(cVar, cVar2, i10);
        this.f6366d = bArr;
        this.f6367e = bArr2;
        this.f6368f = provider;
    }

    /* JADX INFO: renamed from: b */
    public static Provider m8277b() {
        if (!C12394s0.m46451d() || C12394s0.m46450c().intValue() > 23) {
            return C12361c.m46233a();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10212a0 m8278c(C1421t0 c1421t0) throws NoSuchProviderException {
        Provider providerM8277b = m8277b();
        if (providerM8277b == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerM8277b).generatePublic(new RSAPublicKeySpec(c1421t0.m7378d(), c1421t0.m7379e().m7350e()));
        C1417r0 c1417r0M7379e = c1421t0.m7379e();
        return new C1642g0(rSAPublicKey, c1417r0M7379e.m7352g(), c1417r0M7379e.m7348c(), c1417r0M7379e.m7351f(), c1421t0.mo7253b().m23850d(), c1421t0.m7379e().m7353h().equals(C1417r0.d.f5566d) ? f6362i : f6361h, providerM8277b);
    }

    /* JADX INFO: renamed from: d */
    public static String m8279d(C1417r0.c cVar) {
        if (cVar == C1417r0.c.f5560b) {
            return "SHA256withRSA/PSS";
        }
        if (cVar == C1417r0.c.f5561c) {
            return "SHA384withRSA/PSS";
        }
        if (cVar == C1417r0.c.f5562d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: " + cVar);
    }

    /* JADX INFO: renamed from: e */
    public static String m8280e(C1417r0.c cVar) {
        if (cVar == C1417r0.c.f5560b) {
            return "SHA-256";
        }
        if (cVar == C1417r0.c.f5561c) {
            return "SHA-384";
        }
        if (cVar == C1417r0.c.f5562d) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unsupported MD hash: " + cVar);
    }

    /* JADX INFO: renamed from: f */
    public static MGF1ParameterSpec m8281f(C1417r0.c cVar) {
        if (cVar == C1417r0.c.f5560b) {
            return MGF1ParameterSpec.SHA256;
        }
        if (cVar == C1417r0.c.f5561c) {
            return MGF1ParameterSpec.SHA384;
        }
        if (cVar == C1417r0.c.f5562d) {
            return MGF1ParameterSpec.SHA512;
        }
        throw new IllegalArgumentException("Unsupported MGF1 hash: " + cVar);
    }

    /* JADX INFO: renamed from: g */
    public static PSSParameterSpec m8282g(C1417r0.c cVar, C1417r0.c cVar2, int i10) {
        return new PSSParameterSpec(m8280e(cVar), "MGF1", m8281f(cVar2), i10, 1);
    }

    @Override // pe.InterfaceC10212a0
    /* JADX INFO: renamed from: a */
    public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!C12394s0.m46452e(this.f6366d, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f6364b, this.f6368f);
        signature.initVerify(this.f6363a);
        signature.setParameter(this.f6365c);
        signature.update(bArr2);
        byte[] bArr3 = this.f6367e;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.f6366d;
        if (!signature.verify(bArr, bArr4.length, bArr.length - bArr4.length)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
