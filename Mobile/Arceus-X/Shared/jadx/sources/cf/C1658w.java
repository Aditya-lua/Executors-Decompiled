package cf;

import af.C0218f0;
import af.C0222h0;
import af.C0242r0;
import af.C0244s0;
import af.C0246t0;
import af.C0248u0;
import af.EnumC0207b0;
import af.EnumC0238p0;
import bf.C1401j0;
import bf.C1403k0;
import bf.C1405l0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5110b;
import p515we.AbstractC12368f0;
import p515we.AbstractC12370g0;
import p515we.AbstractC12381m;
import p515we.AbstractC12383n;
import p515we.C12357a;
import p515we.C12364d0;
import p515we.C12371h;
import p515we.C12380l0;
import p515we.C12382m0;
import p515we.C12394s0;
import p515we.InterfaceC12388p0;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: cf.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C1658w {

    /* JADX INFO: renamed from: a */
    public static final C5109a f6385a;

    /* JADX INFO: renamed from: b */
    public static final C5109a f6386b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12370g0<C1401j0, C12382m0> f6387c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12368f0<C12382m0> f6388d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12383n<C1405l0, C12380l0> f6389e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC12381m<C12380l0> f6390f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC12383n<C1403k0, C12380l0> f6391g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC12381m<C12380l0> f6392h;

    /* JADX INFO: renamed from: i */
    public static final C12371h<EnumC0238p0, C1401j0.d> f6393i;

    /* JADX INFO: renamed from: j */
    public static final C12371h<EnumC0207b0, C1401j0.c> f6394j;

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f6385a = c5109aM46455h;
        C5109a c5109aM46455h2 = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f6386b = c5109aM46455h2;
        f6387c = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: cf.q
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C1658w.m8319r((C1401j0) abstractC10243x);
            }
        }, C1401j0.class, C12382m0.class);
        f6388d = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: cf.r
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C1658w.m8314m((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f6389e = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.s
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1658w.m8321t((C1405l0) abstractC10231l, c10218d0);
            }
        }, C1405l0.class, C12380l0.class);
        f6390f = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.t
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1658w.m8316o((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h2, C12380l0.class);
        f6391g = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.u
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1658w.m8320s((C1403k0) abstractC10231l, c10218d0);
            }
        }, C1403k0.class, C12380l0.class);
        f6392h = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.v
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1658w.m8315n((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
        f6393i = C12371h.m46319a().m46322a(EnumC0238p0.RAW, C1401j0.d.f5506e).m46322a(EnumC0238p0.TINK, C1401j0.d.f5503b).m46322a(EnumC0238p0.CRUNCHY, C1401j0.d.f5504c).m46322a(EnumC0238p0.LEGACY, C1401j0.d.f5505d).m46323b();
        f6394j = C12371h.m46319a().m46322a(EnumC0207b0.SHA256, C1401j0.c.f5499b).m46322a(EnumC0207b0.SHA384, C1401j0.c.f5500c).m46322a(EnumC0207b0.SHA512, C1401j0.c.f5501d).m46323b();
    }

    /* JADX INFO: renamed from: g */
    public static BigInteger m8308g(AbstractC2920h abstractC2920h) {
        return C12357a.m46223a(abstractC2920h.m13569x());
    }

    /* JADX INFO: renamed from: h */
    public static C5110b m8309h(AbstractC2920h abstractC2920h, C10218d0 c10218d0) {
        return C5110b.m23851a(C12357a.m46223a(abstractC2920h.m13569x()), c10218d0);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2920h m8310i(BigInteger bigInteger) {
        return AbstractC2920h.m13555e(C12357a.m46224b(bigInteger));
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2920h m8311j(C5110b c5110b, C10218d0 c10218d0) {
        return m8310i(c5110b.m23852b(c10218d0));
    }

    /* JADX INFO: renamed from: k */
    public static C0244s0 m8312k(C1401j0 c1401j0) {
        return C0244s0.m987d0().m990C((EnumC0207b0) f6394j.m46321c(c1401j0.m7299c())).build();
    }

    /* JADX INFO: renamed from: l */
    public static C0248u0 m8313l(C1405l0 c1405l0) {
        return C0248u0.m1063i0().m1075E(m8312k(c1405l0.m7326e())).m1074D(m8310i(c1405l0.m7325d())).m1073C(m8310i(c1405l0.m7326e().m7301e())).build();
    }

    /* JADX INFO: renamed from: m */
    public static C1401j0 m8314m(C12382m0 c12382m0) throws GeneralSecurityException {
        if (c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                C0242r0 c0242r0M959h0 = C0242r0.m959h0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
                return C1401j0.m7298b().m7304b(f6394j.m46320b(c0242r0M959h0.m961e0().m989c0())).m7306d(m8308g(c0242r0M959h0.m962f0())).m7305c(c0242r0M959h0.m960d0()).m7307e(f6393i.m46320b(c12382m0.m46404d().m762e0())).m7303a();
            } catch (C2903b0 e10) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
    }

    /* JADX INFO: renamed from: n */
    public static C1403k0 m8315n(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + c12380l0.m46396f());
        }
        try {
            C0246t0 c0246t0M1014r0 = C0246t0.m1014r0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0246t0M1014r0.m1024p0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C0248u0 c0248u0M1022n0 = c0246t0M1014r0.m1022n0();
            if (c0248u0M1022n0.m1070h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerM8308g = m8308g(c0248u0M1022n0.m1068f0());
            C1405l0 c1405l0M7327a = C1405l0.m7324c().m7331e(C1401j0.m7298b().m7304b(f6394j.m46320b(c0248u0M1022n0.m1069g0().m989c0())).m7306d(m8308g(c0248u0M1022n0.m1067e0())).m7305c(bigIntegerM8308g.bitLength()).m7307e(f6393i.m46320b(c12380l0.m46395e())).m7303a()).m7330d(bigIntegerM8308g).m7329c(c12380l0.m46393c()).m7327a();
            C10218d0 c10218d0M39310b = C10218d0.m39310b(c10218d0);
            return C1403k0.m7309d().m7323f(c1405l0M7327a).m7321d(m8309h(c0246t0M1014r0.m1021m0(), c10218d0M39310b), m8309h(c0246t0M1014r0.m1023o0(), c10218d0M39310b)).m7322e(m8309h(c0246t0M1014r0.m1018j0(), c10218d0M39310b)).m7320c(m8309h(c0246t0M1014r0.m1019k0(), c10218d0M39310b), m8309h(c0246t0M1014r0.m1020l0(), c10218d0M39310b)).m7319b(m8309h(c0246t0M1014r0.m1017i0(), c10218d0M39310b)).m7318a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    /* JADX INFO: renamed from: o */
    public static C1405l0 m8316o(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + c12380l0.m46396f());
        }
        try {
            C0248u0 c0248u0M1064j0 = C0248u0.m1064j0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0248u0M1064j0.m1070h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerM8308g = m8308g(c0248u0M1064j0.m1068f0());
            return C1405l0.m7324c().m7331e(C1401j0.m7298b().m7304b(f6394j.m46320b(c0248u0M1064j0.m1069g0().m989c0())).m7306d(m8308g(c0248u0M1064j0.m1067e0())).m7305c(bigIntegerM8308g.bitLength()).m7307e(f6393i.m46320b(c12380l0.m46395e())).m7303a()).m7330d(bigIntegerM8308g).m7329c(c12380l0.m46393c()).m7327a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8317p() {
        m8318q(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: q */
    public static void m8318q(C12364d0 c12364d0) {
        c12364d0.m46248m(f6387c);
        c12364d0.m46247l(f6388d);
        c12364d0.m46246k(f6389e);
        c12364d0.m46245j(f6390f);
        c12364d0.m46246k(f6391g);
        c12364d0.m46245j(f6392h);
    }

    /* JADX INFO: renamed from: r */
    public static C12382m0 m8319r(C1401j0 c1401j0) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").m768E(C0242r0.m958g0().m967D(m8312k(c1401j0)).m966C(c1401j0.m7300d()).m968E(m8310i(c1401j0.m7301e())).build().mo13369b()).m766C((EnumC0238p0) f6393i.m46321c(c1401j0.m7302f())).build());
    }

    /* JADX INFO: renamed from: s */
    public static C12380l0 m8320s(C1403k0 c1403k0, C10218d0 c10218d0) throws GeneralSecurityException {
        C10218d0 c10218d0M39310b = C10218d0.m39310b(c10218d0);
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", C0246t0.m1013q0().m1039O(0).m1037K(m8313l(c1403k0.mo7242c())).m1033D(m8311j(c1403k0.m7316k(), c10218d0M39310b)).m1036J(m8311j(c1403k0.m7314i(), c10218d0M39310b)).m1038N(m8311j(c1403k0.m7315j(), c10218d0M39310b)).m1034E(m8311j(c1403k0.m7312g(), c10218d0M39310b)).m1035G(m8311j(c1403k0.m7313h(), c10218d0M39310b)).m1032C(m8311j(c1403k0.m7310e(), c10218d0M39310b)).build().mo13369b(), C0218f0.c.ASYMMETRIC_PRIVATE, (EnumC0238p0) f6393i.m46321c(c1403k0.m7311f().m7302f()), c1403k0.mo7250a());
    }

    /* JADX INFO: renamed from: t */
    public static C12380l0 m8321t(C1405l0 c1405l0, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", m8313l(c1405l0).mo13369b(), C0218f0.c.ASYMMETRIC_PUBLIC, (EnumC0238p0) f6393i.m46321c(c1405l0.m7326e().m7302f()), c1405l0.mo7250a());
    }
}
