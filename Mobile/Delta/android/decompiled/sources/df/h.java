package df;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements pe.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14677g = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f14678h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f14679i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final we.h<o, bf.a.d> f14680j = we.h.a().a(o.SHA256, bf.a.d.b).a(o.SHA384, bf.a.d.f4053c).a(o.SHA512, bf.a.d.f4054d).b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final we.h<k.c, bf.a.e> f14681k = we.h.a().a(k.c.IEEE_P1363, bf.a.e.b).a(k.c.DER, bf.a.e.f4056c).b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final we.h<k.b, bf.a.c> f14682l = we.h.a().a(k.b.NIST_P256, bf.a.c.f4049c).a(k.b.NIST_P384, bf.a.c.f4050d).a(k.b.NIST_P521, bf.a.c.f4051e).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPublicKey f14683a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f14684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f14687f;

    public h(ECPublicKey eCPublicKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f14677g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        k.a(eCPublicKey);
        this.b = z.f(oVar);
        this.f14683a = eCPublicKey;
        this.f14684c = cVar;
        this.f14685d = bArr;
        this.f14686e = bArr2;
        this.f14687f = we.c.a();
    }

    public static pe.a0 b(bf.c cVar) {
        return new h(k.i((k.b) f14682l.c(cVar.d().c()), cVar.e().getAffineX().toByteArray(), cVar.e().getAffineY().toByteArray()), (o) f14680j.c(cVar.d().d()), (k.c) f14681k.c(cVar.d().e()), cVar.b().d(), cVar.d().f().equals(bf.a.f.f4059d) ? f14679i : f14678h);
    }

    @Override // pe.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f14685d;
        if (bArr3.length == 0) {
            d(bArr, bArr2);
        } else {
            if (!s0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            d(Arrays.copyOfRange(bArr, this.f14685d.length, bArr.length), bArr2);
        }
    }

    public final Signature c(String str) {
        Provider provider = this.f14687f;
        return provider != null ? Signature.getInstance(str, provider) : m.f14709d.a(str);
    }

    public final void d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.f14684c == k.c.IEEE_P1363) {
            if (bArr.length != k.e(this.f14683a.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = k.c(bArr);
        }
        if (!k.n(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signatureC = c(this.b);
        signatureC.initVerify(this.f14683a);
        signatureC.update(bArr2);
        byte[] bArr3 = this.f14686e;
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
