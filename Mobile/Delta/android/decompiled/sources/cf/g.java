package cf;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements oe.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final te.b.EnumC0569b f4830g = te.b.EnumC0569b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4831h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f4832i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f4833j = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f4834a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f4835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f4836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f4837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f4838f;

    public g(ECPrivateKey eCPrivateKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f4830g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f4834a = eCPrivateKey;
        this.b = z.f(oVar);
        this.f4835c = cVar;
        this.f4836d = bArr;
        this.f4837e = bArr2;
        this.f4838f = ve.c.a();
    }

    public static oe.z b(af.b bVar) throws GeneralSecurityException {
        g gVar = new g(k.h((k.b) h.f4844l.c(bVar.e().c()), bVar.f().b(oe.j.a()).toByteArray()), (o) h.f4842j.c(bVar.e().d()), (k.c) h.f4843k.c(bVar.e().e()), bVar.b().d(), bVar.e().f().equals(af.a.f.f387d) ? f4832i : f4831h);
        oe.a0 a0VarB = h.b(bVar.c());
        try {
            byte[] bArr = f4833j;
            a0VarB.a(gVar.a(bArr), bArr);
            return gVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    @Override // oe.z
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        Signature signatureC = c(this.b);
        signatureC.initSign(this.f4834a);
        signatureC.update(bArr);
        byte[] bArr2 = this.f4837e;
        if (bArr2.length > 0) {
            signatureC.update(bArr2);
        }
        byte[] bArrSign = signatureC.sign();
        if (this.f4835c == k.c.IEEE_P1363) {
            bArrSign = k.b(bArrSign, k.e(this.f4834a.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.f4836d;
        return bArr3.length == 0 ? bArrSign : e.a(bArr3, bArrSign);
    }

    public final Signature c(String str) {
        Provider provider = this.f4838f;
        return provider != null ? Signature.getInstance(str, provider) : m.f4871d.a(str);
    }
}
