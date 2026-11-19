package ff;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements re.a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.b.EnumC0736b f16014g = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f16015h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f16016i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ye.h<o, df.a.d> f16017j = ye.h.a().a(o.SHA256, df.a.d.b).a(o.SHA384, df.a.d.f12251c).a(o.SHA512, df.a.d.f12252d).b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ye.h<k.c, df.a.e> f16018k = ye.h.a().a(k.c.IEEE_P1363, df.a.e.b).a(k.c.DER, df.a.e.f12254c).b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ye.h<k.b, df.a.c> f16019l = ye.h.a().a(k.b.NIST_P256, df.a.c.f12247c).a(k.b.NIST_P384, df.a.c.f12248d).a(k.b.NIST_P521, df.a.c.f12249e).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPublicKey f16020a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f16021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f16024f;

    public h(ECPublicKey eCPublicKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f16014g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        k.a(eCPublicKey);
        this.b = z.f(oVar);
        this.f16020a = eCPublicKey;
        this.f16021c = cVar;
        this.f16022d = bArr;
        this.f16023e = bArr2;
        this.f16024f = ye.c.a();
    }

    public static re.a0 b(df.c cVar) {
        return new h(k.i((k.b) f16019l.c(cVar.d().c()), cVar.e().getAffineX().toByteArray(), cVar.e().getAffineY().toByteArray()), (o) f16017j.c(cVar.d().d()), (k.c) f16018k.c(cVar.d().e()), cVar.b().d(), cVar.d().f().equals(df.a.f.f12257d) ? f16016i : f16015h);
    }

    @Override // re.a0
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f16022d;
        if (bArr3.length == 0) {
            d(bArr, bArr2);
        } else {
            if (!s0.e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            d(Arrays.copyOfRange(bArr, this.f16022d.length, bArr.length), bArr2);
        }
    }

    public final Signature c(String str) {
        Provider provider = this.f16024f;
        return provider != null ? Signature.getInstance(str, provider) : m.f16046d.a(str);
    }

    public final void d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.f16021c == k.c.IEEE_P1363) {
            if (bArr.length != k.e(this.f16020a.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = k.c(bArr);
        }
        if (!k.n(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signatureC = c(this.b);
        signatureC.initVerify(this.f16020a);
        signatureC.update(bArr2);
        byte[] bArr3 = this.f16023e;
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
