package cf;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import ve.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements oe.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final te.b.EnumC0569b f4839g = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4840h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4841i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.h<o, af.a.d> f4842j = ve.h.a().a(o.SHA256, af.a.d.b).a(o.SHA384, af.a.d.f381c).a(o.SHA512, af.a.d.f382d).b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ve.h<k.c, af.a.e> f4843k = ve.h.a().a(k.c.IEEE_P1363, af.a.e.b).a(k.c.DER, af.a.e.f384c).b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ve.h<k.b, af.a.c> f4844l = ve.h.a().a(k.b.NIST_P256, af.a.c.f377c).a(k.b.NIST_P384, af.a.c.f378d).a(k.b.NIST_P521, af.a.c.f379e).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPublicKey f4845a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f4846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f4849f;

    public h(ECPublicKey eCPublicKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f4839g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        k.a(eCPublicKey);
        this.b = z.f(oVar);
        this.f4845a = eCPublicKey;
        this.f4846c = cVar;
        this.f4847d = bArr;
        this.f4848e = bArr2;
        this.f4849f = ve.c.a();
    }

    public static oe.a0 b(af.c cVar) {
        return new h(k.i((k.b) f4844l.c(cVar.d().c()), cVar.e().getAffineX().toByteArray(), cVar.e().getAffineY().toByteArray()), (o) f4842j.c(cVar.d().d()), (k.c) f4843k.c(cVar.d().e()), cVar.b().d(), cVar.d().f().equals(af.a.f.f387d) ? f4841i : f4840h);
    }

    @Override // oe.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f4847d;
        if (bArr3.length == 0) {
            d(bArr, bArr2);
        } else {
            if (!s0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            d(Arrays.copyOfRange(bArr, this.f4847d.length, bArr.length), bArr2);
        }
    }

    public final Signature c(String str) {
        Provider provider = this.f4849f;
        return provider != null ? Signature.getInstance(str, provider) : m.f4871d.a(str);
    }

    public final void d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.f4846c == k.c.IEEE_P1363) {
            if (bArr.length != k.e(this.f4845a.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = k.c(bArr);
        }
        if (!k.n(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signatureC = c(this.b);
        signatureC.initVerify(this.f4845a);
        signatureC.update(bArr2);
        byte[] bArr3 = this.f4848e;
        if (bArr3.length > 0) {
            signatureC.update(bArr3);
        }
        try {
            zVerify = signatureC.verify(bArr);
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
