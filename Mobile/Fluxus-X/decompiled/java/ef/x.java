package ef;

import df.j0;
import df.l0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements re.a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.b.EnumC0736b f13438f = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f13439g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f13440h = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f13441a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f13442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f13444e;

    public x(RSAPublicKey rSAPublicKey, j0.c cVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f13438f.a()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        ff.a0.c(rSAPublicKey.getModulus().bitLength());
        ff.a0.d(rSAPublicKey.getPublicExponent());
        this.f13441a = rSAPublicKey;
        this.b = d(cVar);
        this.f13442c = bArr;
        this.f13443d = bArr2;
        this.f13444e = provider;
    }

    private static Provider b() {
        if (!s0.d() || s0.c().intValue() > 21) {
            return ye.c.a();
        }
        return null;
    }

    public static re.a0 c(l0 l0Var) throws NoSuchProviderException {
        Provider providerB = b();
        if (providerB != null) {
            return new x((RSAPublicKey) KeyFactory.getInstance("RSA", providerB).generatePublic(new RSAPublicKeySpec(l0Var.d(), l0Var.e().e())), l0Var.e().c(), l0Var.b().d(), l0Var.e().f().equals(j0.d.f12308d) ? f13440h : f13439g, providerB);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static String d(j0.c cVar) throws GeneralSecurityException {
        if (cVar == j0.c.b) {
            return "SHA256withRSA";
        }
        if (cVar == j0.c.f12304c) {
            return "SHA384withRSA";
        }
        if (cVar == j0.c.f12305d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    @Override // re.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (!s0.e(this.f13442c, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f13444e);
        signature.initVerify(this.f13441a);
        signature.update(bArr2);
        byte[] bArr3 = this.f13443d;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            zVerify = signature.verify(Arrays.copyOfRange(bArr, this.f13442c.length, bArr.length));
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
