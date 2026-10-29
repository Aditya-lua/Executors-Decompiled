package p076df;

import bf.C1379a;
import bf.C1385c;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import p465ue.C11844b;
import p515we.C12361c;
import p515we.C12371h;
import p515we.C12394s0;
import pe.InterfaceC10212a0;

/* JADX INFO: renamed from: df.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C4586h implements InterfaceC10212a0 {

    /* JADX INFO: renamed from: g */
    public static final C11844b.b f18757g = C11844b.b.f41602b;

    /* JADX INFO: renamed from: h */
    public static final byte[] f18758h = new byte[0];

    /* JADX INFO: renamed from: i */
    public static final byte[] f18759i = {0};

    /* JADX INFO: renamed from: j */
    public static final C12371h<EnumC4593o, C1379a.d> f18760j = C12371h.m46319a().m46322a(EnumC4593o.SHA256, C1379a.d.f5429b).m46322a(EnumC4593o.SHA384, C1379a.d.f5430c).m46322a(EnumC4593o.SHA512, C1379a.d.f5431d).m46323b();

    /* JADX INFO: renamed from: k */
    public static final C12371h<C4589k.c, C1379a.e> f18761k = C12371h.m46319a().m46322a(C4589k.c.IEEE_P1363, C1379a.e.f5433b).m46322a(C4589k.c.DER, C1379a.e.f5434c).m46323b();

    /* JADX INFO: renamed from: l */
    public static final C12371h<C4589k.b, C1379a.c> f18762l = C12371h.m46319a().m46322a(C4589k.b.NIST_P256, C1379a.c.f5424c).m46322a(C4589k.b.NIST_P384, C1379a.c.f5425d).m46322a(C4589k.b.NIST_P521, C1379a.c.f5426e).m46323b();

    /* JADX INFO: renamed from: a */
    public final ECPublicKey f18763a;

    /* JADX INFO: renamed from: b */
    public final String f18764b;

    /* JADX INFO: renamed from: c */
    public final C4589k.c f18765c;

    /* JADX INFO: renamed from: d */
    public final byte[] f18766d;

    /* JADX INFO: renamed from: e */
    public final byte[] f18767e;

    /* JADX INFO: renamed from: f */
    public final Provider f18768f;

    public C4586h(ECPublicKey eCPublicKey, EnumC4593o enumC4593o, C4589k.c cVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f18757g.mo44243a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        C4589k.m22682a(eCPublicKey);
        this.f18764b = C4604z.m22743f(enumC4593o);
        this.f18763a = eCPublicKey;
        this.f18765c = cVar;
        this.f18766d = bArr;
        this.f18767e = bArr2;
        this.f18768f = C12361c.m46233a();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10212a0 m22671b(C1385c c1385c) {
        return new C4586h(C4589k.m22690i((C4589k.b) f18762l.m46321c(c1385c.m7254d().m7231c()), c1385c.m7255e().getAffineX().toByteArray(), c1385c.m7255e().getAffineY().toByteArray()), (EnumC4593o) f18760j.m46321c(c1385c.m7254d().m7232d()), (C4589k.c) f18761k.m46321c(c1385c.m7254d().m7233e()), c1385c.mo7253b().m23850d(), c1385c.m7254d().m7234f().equals(C1379a.f.f5438d) ? f18759i : f18758h);
    }

    @Override // pe.InterfaceC10212a0
    /* JADX INFO: renamed from: a */
    public void mo7293a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f18766d;
        if (bArr3.length == 0) {
            m22673d(bArr, bArr2);
        } else {
            if (!C12394s0.m46452e(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            m22673d(Arrays.copyOfRange(bArr, this.f18766d.length, bArr.length), bArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Signature m22672c(String str) {
        Provider provider = this.f18768f;
        return provider != null ? Signature.getInstance(str, provider) : C4591m.f18799d.m22699a(str);
    }

    /* JADX INFO: renamed from: d */
    public final void m22673d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        boolean zVerify;
        if (this.f18765c == C4589k.c.IEEE_P1363) {
            if (bArr.length != C4589k.m22686e(this.f18763a.getParams().getCurve()) * 2) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = C4589k.m22684c(bArr);
        }
        if (!C4589k.m22695n(bArr)) {
            throw new GeneralSecurityException("Invalid signature");
        }
        Signature signatureM22672c = m22672c(this.f18764b);
        signatureM22672c.initVerify(this.f18763a);
        signatureM22672c.update(bArr2);
        byte[] bArr3 = this.f18767e;
        if (bArr3.length > 0) {
            signatureM22672c.update(bArr3);
        }
        try {
            zVerify = signatureM22672c.verify(bArr);
        } catch (RuntimeException unused) {
            zVerify = false;
        }
        if (!zVerify) {
            throw new GeneralSecurityException("Invalid signature");
        }
    }
}
