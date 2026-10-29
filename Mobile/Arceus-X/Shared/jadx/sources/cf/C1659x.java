package cf;

import bf.C1401j0;
import bf.C1405l0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import p076df.C4578a0;
import p465ue.C11844b;
import p515we.C12361c;
import p515we.C12394s0;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: cf.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C1659x implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f6395f = C11844b.b.f41602b;

    /* JADX INFO: renamed from: g */
    public static final byte[] f6396g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f6397h = {0};

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f6398a;

    /* JADX INFO: renamed from: b */
    public final String f6399b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6400c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6401d;

    /* JADX INFO: renamed from: e */
    public final Provider f6402e;

    public C1659x(RSAPublicKey rSAPublicKey, C1401j0.c cVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f6395f.mo44243a()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4578a0.m22639c(rSAPublicKey.getModulus().bitLength());
        C4578a0.m22640d(rSAPublicKey.getPublicExponent());
        this.f6398a = rSAPublicKey;
        this.f6399b = m8324d(cVar);
        this.f6400c = bArr;
        this.f6401d = bArr2;
        this.f6402e = provider;
    }

    /* JADX INFO: renamed from: b */
    private static Provider m8322b() {
        if (!C12394s0.m46451d() || C12394s0.m46450c().intValue() > 21) {
            return C12361c.m46233a();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10212a0 m8323c(C1405l0 c1405l0) throws NoSuchProviderException {
        Provider providerM8322b = m8322b();
        if (providerM8322b != null) {
            return new C1659x((RSAPublicKey) KeyFactory.getInstance("RSA", providerM8322b).generatePublic(new RSAPublicKeySpec(c1405l0.m7325d(), c1405l0.m7326e().m7301e())), c1405l0.m7326e().m7299c(), c1405l0.mo7253b().m23850d(), c1405l0.m7326e().m7302f().equals(C1401j0.d.f5505d) ? f6397h : f6396g, providerM8322b);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    /* JADX INFO: renamed from: d */
    public static String m8324d(C1401j0.c cVar) throws GeneralSecurityException {
        if (cVar == C1401j0.c.f5499b) {
            return "SHA256withRSA";
        }
        if (cVar == C1401j0.c.f5500c) {
            return "SHA384withRSA";
        }
        if (cVar == C1401j0.c.f5501d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    @Override // pe.InterfaceC10212a0
    /* JADX INFO: renamed from: a */
    public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (!C12394s0.m46452e(this.f6400c, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f6399b, this.f6402e);
        signature.initVerify(this.f6398a);
        signature.update(bArr2);
        byte[] bArr3 = this.f6401d;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            zVerify = signature.verify(Arrays.copyOfRange(bArr, this.f6400c.length, bArr.length));
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
