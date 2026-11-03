package df;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements pe.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ue.b.EnumC0590b f14668g = ue.b.EnumC0590b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f14669h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f14670i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f14671j = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f14672a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f14673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f14674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f14675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f14676f;

    public g(ECPrivateKey eCPrivateKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f14668g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f14672a = eCPrivateKey;
        this.b = z.f(oVar);
        this.f14673c = cVar;
        this.f14674d = bArr;
        this.f14675e = bArr2;
        this.f14676f = we.c.a();
    }

    public static pe.z b(bf.b bVar) throws GeneralSecurityException {
        g gVar = new g(k.h((k.b) h.f14682l.c(bVar.e().c()), bVar.f().b(pe.j.a()).toByteArray()), (o) h.f14680j.c(bVar.e().d()), (k.c) h.f14681k.c(bVar.e().e()), bVar.b().d(), bVar.e().f().equals(bf.a.f.f4059d) ? f14670i : f14669h);
        pe.a0 a0VarB = h.b(bVar.c());
        try {
            byte[] bArr = f14671j;
            a0VarB.a(gVar.a(bArr), bArr);
            return gVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    @Override // pe.z
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        Signature signatureC = c(this.b);
        signatureC.initSign(this.f14672a);
        signatureC.update(bArr);
        byte[] bArr2 = this.f14675e;
        if (bArr2.length > 0) {
            signatureC.update(bArr2);
        }
        byte[] bArrSign = signatureC.sign();
        if (this.f14673c == k.c.IEEE_P1363) {
            bArrSign = k.b(bArrSign, k.e(this.f14672a.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.f14674d;
        return bArr3.length == 0 ? bArrSign : e.a(bArr3, bArrSign);
    }

    public final Signature c(String str) {
        Provider provider = this.f14676f;
        return provider != null ? Signature.getInstance(str, provider) : m.f14709d.a(str);
    }
}
