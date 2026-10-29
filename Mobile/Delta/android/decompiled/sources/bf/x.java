package bf;

import af.j0;
import af.l0;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import ve.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements oe.a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f4164f = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f4165g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4166h = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f4167a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f4170e;

    public x(RSAPublicKey rSAPublicKey, j0.c cVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f4164f.a()) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.a0.c(rSAPublicKey.getModulus().bitLength());
        cf.a0.d(rSAPublicKey.getPublicExponent());
        this.f4167a = rSAPublicKey;
        this.b = d(cVar);
        this.f4168c = bArr;
        this.f4169d = bArr2;
        this.f4170e = provider;
    }

    private static Provider b() {
        if (!s0.d() || s0.c().intValue() > 21) {
            return ve.c.a();
        }
        return null;
    }

    public static oe.a0 c(l0 l0Var) throws NoSuchProviderException {
        Provider providerB = b();
        if (providerB != null) {
            return new x((RSAPublicKey) KeyFactory.getInstance("RSA", providerB).generatePublic(new RSAPublicKeySpec(l0Var.d(), l0Var.e().e())), l0Var.e().c(), l0Var.b().d(), l0Var.e().f().equals(j0.d.f438d) ? f4166h : f4165g, providerB);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }

    public static String d(j0.c cVar) throws GeneralSecurityException {
        if (cVar == j0.c.b) {
            return "SHA256withRSA";
        }
        if (cVar == j0.c.f434c) {
            return "SHA384withRSA";
        }
        if (cVar == j0.c.f435d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    @Override // oe.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (!s0.e(this.f4168c, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.b, this.f4170e);
        signature.initVerify(this.f4167a);
        signature.update(bArr2);
        byte[] bArr3 = this.f4169d;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            zVerify = signature.verify(Arrays.copyOfRange(bArr, this.f4168c.length, bArr.length));
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
