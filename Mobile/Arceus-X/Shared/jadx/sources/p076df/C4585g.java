package p076df;

import bf.C1379a;
import bf.C1382b;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import p465ue.C11844b;
import p515we.C12361c;
import pe.C10229j;
import pe.InterfaceC10212a0;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: df.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C4585g implements InterfaceC10245z {

    /* JADX INFO: renamed from: g */
    public static final C11844b.b f18747g = C11844b.b.f41602b;

    /* JADX INFO: renamed from: h */
    public static final byte[] f18748h = new byte[0];

    /* JADX INFO: renamed from: i */
    public static final byte[] f18749i = {0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f18750j = {1, 2, 3};

    /* JADX INFO: renamed from: a */
    public final ECPrivateKey f18751a;

    /* JADX INFO: renamed from: b */
    public final String f18752b;

    /* JADX INFO: renamed from: c */
    public final C4589k.c f18753c;

    /* JADX INFO: renamed from: d */
    public final byte[] f18754d;

    /* JADX INFO: renamed from: e */
    public final byte[] f18755e;

    /* JADX INFO: renamed from: f */
    public final Provider f18756f;

    public C4585g(ECPrivateKey eCPrivateKey, EnumC4593o enumC4593o, C4589k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f18747g.mo44243a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.f18751a = eCPrivateKey;
        this.f18752b = C4604z.m22743f(enumC4593o);
        this.f18753c = cVar;
        this.f18754d = bArr;
        this.f18755e = bArr2;
        this.f18756f = C12361c.m46233a();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10245z m22669b(C1382b c1382b) throws GeneralSecurityException {
        C4585g c4585g = new C4585g(C4589k.m22689h((C4589k.b) C4586h.f18762l.m46321c(c1382b.m7243e().m7231c()), c1382b.m7244f().m23852b(C10229j.m39322a()).toByteArray()), (EnumC4593o) C4586h.f18760j.m46321c(c1382b.m7243e().m7232d()), (C4589k.c) C4586h.f18761k.m46321c(c1382b.m7243e().m7233e()), c1382b.m7251b().m23850d(), c1382b.m7243e().m7234f().equals(C1379a.f.f5438d) ? f18749i : f18748h);
        InterfaceC10212a0 interfaceC10212a0M22671b = C4586h.m22671b(c1382b.mo7242c());
        try {
            byte[] bArr = f18750j;
            interfaceC10212a0M22671b.mo7293a(c4585g.mo7287a(bArr), bArr);
            return c4585g;
        } catch (GeneralSecurityException e10) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e10);
        }
    }

    @Override // pe.InterfaceC10245z
    /* JADX INFO: renamed from: a */
    public byte[] mo7287a(byte[] bArr) throws GeneralSecurityException {
        Signature signatureM22670c = m22670c(this.f18752b);
        signatureM22670c.initSign(this.f18751a);
        signatureM22670c.update(bArr);
        byte[] bArr2 = this.f18755e;
        if (bArr2.length > 0) {
            signatureM22670c.update(bArr2);
        }
        byte[] bArrSign = signatureM22670c.sign();
        if (this.f18753c == C4589k.c.IEEE_P1363) {
            bArrSign = C4589k.m22683b(bArrSign, C4589k.m22686e(this.f18751a.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.f18754d;
        return bArr3.length == 0 ? bArrSign : C4583e.m22661a(bArr3, bArrSign);
    }

    /* JADX INFO: renamed from: c */
    public final Signature m22670c(String str) {
        Provider provider = this.f18756f;
        return provider != null ? Signature.getInstance(str, provider) : C4591m.f18799d.m22699a(str);
    }
}
