package ff;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements re.z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.b.EnumC0736b f16005g = we.b.EnumC0736b.b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f16006h = new byte[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f16007i = {0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f16008j = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPrivateKey f16009a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.c f16010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f16011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f16013f;

    public g(ECPrivateKey eCPrivateKey, o oVar, k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f16005g.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f16009a = eCPrivateKey;
        this.b = z.f(oVar);
        this.f16010c = cVar;
        this.f16011d = bArr;
        this.f16012e = bArr2;
        this.f16013f = ye.c.a();
    }

    public static re.z b(df.b bVar) throws GeneralSecurityException {
        g gVar = new g(k.h((k.b) h.f16019l.c(bVar.e().c()), bVar.f().b(re.j.a()).toByteArray()), (o) h.f16017j.c(bVar.e().d()), (k.c) h.f16018k.c(bVar.e().e()), bVar.b().d(), bVar.e().f().equals(df.a.f.f12257d) ? f16007i : f16006h);
        re.a0 a0VarB = h.b(bVar.c());
        try {
            byte[] bArr = f16008j;
            a0VarB.a(gVar.a(bArr), bArr);
            return gVar;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    @Override // re.z
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        Signature signatureC = c(this.b);
        signatureC.initSign(this.f16009a);
        signatureC.update(bArr);
        byte[] bArr2 = this.f16012e;
        if (bArr2.length > 0) {
            signatureC.update(bArr2);
        }
        byte[] bArrSign = signatureC.sign();
        if (this.f16010c == k.c.IEEE_P1363) {
            bArrSign = k.b(bArrSign, k.e(this.f16009a.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.f16011d;
        return bArr3.length == 0 ? bArrSign : e.a(bArr3, bArrSign);
    }

    public final Signature c(String str) {
        Provider provider = this.f16013f;
        return provider != null ? Signature.getInstance(str, provider) : m.f16046d.a(str);
    }
}
