package cf;

import af.C0218f0;
import af.C0222h0;
import af.C0241r;
import af.C0243s;
import af.C0245t;
import af.C0247u;
import af.EnumC0207b0;
import af.EnumC0238p0;
import af.EnumC0249v;
import af.EnumC0257z;
import bf.C1379a;
import bf.C1382b;
import bf.C1385c;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import p102ef.C5109a;
import p102ef.C5110b;
import p515we.AbstractC12368f0;
import p515we.AbstractC12370g0;
import p515we.AbstractC12381m;
import p515we.AbstractC12383n;
import p515we.C12357a;
import p515we.C12364d0;
import p515we.C12380l0;
import p515we.C12382m0;
import p515we.C12394s0;
import p515we.InterfaceC12388p0;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: cf.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1641g {

    /* JADX INFO: renamed from: a */
    public static final C5109a f6348a;

    /* JADX INFO: renamed from: b */
    public static final C5109a f6349b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12370g0<C1379a, C12382m0> f6350c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12368f0<C12382m0> f6351d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12383n<C1385c, C12380l0> f6352e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC12381m<C12380l0> f6353f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC12383n<C1382b, C12380l0> f6354g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC12381m<C12380l0> f6355h;

    /* JADX INFO: renamed from: cf.g$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6356a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f6357b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f6358c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f6359d;

        static {
            int[] iArr = new int[EnumC0249v.values().length];
            f6359d = iArr;
            try {
                iArr[EnumC0249v.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6359d[EnumC0249v.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0257z.values().length];
            f6358c = iArr2;
            try {
                iArr2[EnumC0257z.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6358c[EnumC0257z.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6358c[EnumC0257z.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[EnumC0238p0.values().length];
            f6357b = iArr3;
            try {
                iArr3[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6357b[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6357b[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6357b[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[EnumC0207b0.values().length];
            f6356a = iArr4;
            try {
                iArr4[EnumC0207b0.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6356a[EnumC0207b0.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6356a[EnumC0207b0.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f6348a = c5109aM46455h;
        C5109a c5109aM46455h2 = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f6349b = c5109aM46455h2;
        f6350c = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: cf.a
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C1641g.m8266o((C1379a) abstractC10243x);
            }
        }, C1379a.class, C12382m0.class);
        f6351d = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: cf.b
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C1641g.m8261j((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f6352e = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.c
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1641g.m8268q((C1385c) abstractC10231l, c10218d0);
            }
        }, C1385c.class, C12380l0.class);
        f6353f = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.d
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1641g.m8263l((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h2, C12380l0.class);
        f6354g = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.e
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1641g.m8267p((C1382b) abstractC10231l, c10218d0);
            }
        }, C1382b.class, C12380l0.class);
        f6355h = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.f
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1641g.m8262k((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: g */
    public static int m8258g(C1379a.c cVar) throws GeneralSecurityException {
        if (C1379a.c.f5424c.equals(cVar)) {
            return 33;
        }
        if (C1379a.c.f5425d.equals(cVar)) {
            return 49;
        }
        if (C1379a.c.f5426e.equals(cVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    /* JADX INFO: renamed from: h */
    public static C0243s m8259h(C1379a c1379a) {
        return C0243s.m974h0().m983E(m8272u(c1379a.m7232d())).m981C(m8271t(c1379a.m7231c())).m982D(m8274w(c1379a.m7233e())).build();
    }

    /* JADX INFO: renamed from: i */
    public static C0247u m8260i(C1385c c1385c) throws GeneralSecurityException {
        int iM8258g = m8258g(c1385c.m7254d().m7231c());
        ECPoint eCPointM7255e = c1385c.m7255e();
        return C0247u.m1045i0().m1055C(m8259h(c1385c.m7254d())).m1056D(AbstractC2920h.m13555e(C12357a.m46225c(eCPointM7255e.getAffineX(), iM8258g))).m1057E(AbstractC2920h.m13555e(C12357a.m46225c(eCPointM7255e.getAffineY(), iM8258g))).build();
    }

    /* JADX INFO: renamed from: j */
    public static C1379a m8261j(C12382m0 c12382m0) throws GeneralSecurityException {
        if (c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            try {
                C0241r c0241rM950d0 = C0241r.m950d0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
                return C1379a.m7229b().m7237c(m8270s(c0241rM950d0.m951b0().m977g0())).m7238d(m8275x(c0241rM950d0.m951b0().m976f0())).m7236b(m8269r(c0241rM950d0.m951b0().m975d0())).m7239e(m8276y(c12382m0.m46404d().m762e0())).m7235a();
            } catch (C2903b0 e10) {
                throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
    }

    /* JADX INFO: renamed from: k */
    public static C1382b m8262k(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + c12380l0.m46396f());
        }
        try {
            C0245t c0245tM995g0 = C0245t.m995g0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0245tM995g0.m1000e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C0247u c0247uM999d0 = c0245tM995g0.m999d0();
            if (c0247uM999d0.m1050f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C1382b.m7241d().m7249c(C1385c.m7252c().m7259d(C1379a.m7229b().m7237c(m8270s(c0247uM999d0.m1049e0().m977g0())).m7238d(m8275x(c0247uM999d0.m1049e0().m976f0())).m7236b(m8269r(c0247uM999d0.m1049e0().m975d0())).m7239e(m8276y(c12380l0.m46395e())).m7235a()).m7260e(new ECPoint(C12357a.m46223a(c0247uM999d0.m1051g0().m13569x()), C12357a.m46223a(c0247uM999d0.m1052h0().m13569x()))).m7258c(c12380l0.m46393c()).m7256a()).m7248b(C5110b.m23851a(C12357a.m46223a(c0245tM995g0.m998c0().m13569x()), C10218d0.m39310b(c10218d0))).m7247a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: renamed from: l */
    public static C1385c m8263l(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + c12380l0.m46396f());
        }
        try {
            C0247u c0247uM1046j0 = C0247u.m1046j0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0247uM1046j0.m1050f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C1385c.m7252c().m7259d(C1379a.m7229b().m7237c(m8270s(c0247uM1046j0.m1049e0().m977g0())).m7238d(m8275x(c0247uM1046j0.m1049e0().m976f0())).m7236b(m8269r(c0247uM1046j0.m1049e0().m975d0())).m7239e(m8276y(c12380l0.m46395e())).m7235a()).m7260e(new ECPoint(C12357a.m46223a(c0247uM1046j0.m1051g0().m13569x()), C12357a.m46223a(c0247uM1046j0.m1052h0().m13569x()))).m7258c(c12380l0.m46393c()).m7256a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m8264m() {
        m8265n(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: n */
    public static void m8265n(C12364d0 c12364d0) {
        c12364d0.m46248m(f6350c);
        c12364d0.m46247l(f6351d);
        c12364d0.m46246k(f6352e);
        c12364d0.m46245j(f6353f);
        c12364d0.m46246k(f6354g);
        c12364d0.m46245j(f6355h);
    }

    /* JADX INFO: renamed from: o */
    public static C12382m0 m8266o(C1379a c1379a) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").m768E(C0241r.m949c0().m953C(m8259h(c1379a)).build().mo13369b()).m766C(m8273v(c1379a.m7234f())).build());
    }

    /* JADX INFO: renamed from: p */
    public static C12380l0 m8267p(C1382b c1382b, C10218d0 c10218d0) throws GeneralSecurityException {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", C0245t.m994f0().m1003D(m8260i(c1382b.mo7242c())).m1002C(AbstractC2920h.m13555e(C12357a.m46225c(c1382b.m7244f().m23852b(C10218d0.m39310b(c10218d0)), m8258g(c1382b.m7243e().m7231c())))).build().mo13369b(), C0218f0.c.ASYMMETRIC_PRIVATE, m8273v(c1382b.m7243e().m7234f()), c1382b.mo7250a());
    }

    /* JADX INFO: renamed from: q */
    public static C12380l0 m8268q(C1385c c1385c, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", m8260i(c1385c).mo13369b(), C0218f0.c.ASYMMETRIC_PUBLIC, m8273v(c1385c.m7254d().m7234f()), c1385c.mo7250a());
    }

    /* JADX INFO: renamed from: r */
    public static C1379a.c m8269r(EnumC0257z enumC0257z) throws GeneralSecurityException {
        int i10 = a.f6358c[enumC0257z.ordinal()];
        if (i10 == 1) {
            return C1379a.c.f5424c;
        }
        if (i10 == 2) {
            return C1379a.c.f5425d;
        }
        if (i10 == 3) {
            return C1379a.c.f5426e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + enumC0257z.getNumber());
    }

    /* JADX INFO: renamed from: s */
    public static C1379a.d m8270s(EnumC0207b0 enumC0207b0) throws GeneralSecurityException {
        int i10 = a.f6356a[enumC0207b0.ordinal()];
        if (i10 == 1) {
            return C1379a.d.f5429b;
        }
        if (i10 == 2) {
            return C1379a.d.f5430c;
        }
        if (i10 == 3) {
            return C1379a.d.f5431d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC0207b0.getNumber());
    }

    /* JADX INFO: renamed from: t */
    public static EnumC0257z m8271t(C1379a.c cVar) throws GeneralSecurityException {
        if (C1379a.c.f5424c.equals(cVar)) {
            return EnumC0257z.NIST_P256;
        }
        if (C1379a.c.f5425d.equals(cVar)) {
            return EnumC0257z.NIST_P384;
        }
        if (C1379a.c.f5426e.equals(cVar)) {
            return EnumC0257z.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    /* JADX INFO: renamed from: u */
    public static EnumC0207b0 m8272u(C1379a.d dVar) throws GeneralSecurityException {
        if (C1379a.d.f5429b.equals(dVar)) {
            return EnumC0207b0.SHA256;
        }
        if (C1379a.d.f5430c.equals(dVar)) {
            return EnumC0207b0.SHA384;
        }
        if (C1379a.d.f5431d.equals(dVar)) {
            return EnumC0207b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + dVar);
    }

    /* JADX INFO: renamed from: v */
    public static EnumC0238p0 m8273v(C1379a.f fVar) throws GeneralSecurityException {
        if (C1379a.f.f5436b.equals(fVar)) {
            return EnumC0238p0.TINK;
        }
        if (C1379a.f.f5437c.equals(fVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C1379a.f.f5439e.equals(fVar)) {
            return EnumC0238p0.RAW;
        }
        if (C1379a.f.f5438d.equals(fVar)) {
            return EnumC0238p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + fVar);
    }

    /* JADX INFO: renamed from: w */
    public static EnumC0249v m8274w(C1379a.e eVar) throws GeneralSecurityException {
        if (C1379a.e.f5433b.equals(eVar)) {
            return EnumC0249v.IEEE_P1363;
        }
        if (C1379a.e.f5434c.equals(eVar)) {
            return EnumC0249v.DER;
        }
        throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + eVar);
    }

    /* JADX INFO: renamed from: x */
    public static C1379a.e m8275x(EnumC0249v enumC0249v) throws GeneralSecurityException {
        int i10 = a.f6359d[enumC0249v.ordinal()];
        if (i10 == 1) {
            return C1379a.e.f5433b;
        }
        if (i10 == 2) {
            return C1379a.e.f5434c;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + enumC0249v.getNumber());
    }

    /* JADX INFO: renamed from: y */
    public static C1379a.f m8276y(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f6357b[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C1379a.f.f5436b;
        }
        if (i10 == 2) {
            return C1379a.f.f5437c;
        }
        if (i10 == 3) {
            return C1379a.f.f5438d;
        }
        if (i10 == 4) {
            return C1379a.f.f5439e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
