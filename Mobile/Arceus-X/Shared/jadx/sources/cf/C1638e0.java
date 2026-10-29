package cf;

import af.C0218f0;
import af.C0222h0;
import af.C0250v0;
import af.C0252w0;
import af.C0254x0;
import af.C0256y0;
import af.EnumC0207b0;
import af.EnumC0238p0;
import bf.C1417r0;
import bf.C1419s0;
import bf.C1421t0;
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

/* JADX INFO: renamed from: cf.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1638e0 {

    /* JADX INFO: renamed from: a */
    public static final C5109a f6329a;

    /* JADX INFO: renamed from: b */
    public static final C5109a f6330b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12370g0<C1417r0, C12382m0> f6331c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12368f0<C12382m0> f6332d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12383n<C1421t0, C12380l0> f6333e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC12381m<C12380l0> f6334f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC12383n<C1419s0, C12380l0> f6335g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC12381m<C12380l0> f6336h;

    /* JADX INFO: renamed from: i */
    public static final C12371h<EnumC0238p0, C1417r0.d> f6337i;

    /* JADX INFO: renamed from: j */
    public static final C12371h<EnumC0207b0, C1417r0.c> f6338j;

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f6329a = c5109aM46455h;
        C5109a c5109aM46455h2 = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f6330b = c5109aM46455h2;
        f6331c = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: cf.y
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C1638e0.m8248r((C1417r0) abstractC10243x);
            }
        }, C1417r0.class, C12382m0.class);
        f6332d = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: cf.z
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C1638e0.m8243m((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f6333e = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.a0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1638e0.m8250t((C1421t0) abstractC10231l, c10218d0);
            }
        }, C1421t0.class, C12380l0.class);
        f6334f = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.b0
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1638e0.m8245o((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h2, C12380l0.class);
        f6335g = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.c0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1638e0.m8249s((C1419s0) abstractC10231l, c10218d0);
            }
        }, C1419s0.class, C12380l0.class);
        f6336h = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.d0
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1638e0.m8244n((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
        f6337i = C12371h.m46319a().m46322a(EnumC0238p0.RAW, C1417r0.d.f5567e).m46322a(EnumC0238p0.TINK, C1417r0.d.f5564b).m46322a(EnumC0238p0.CRUNCHY, C1417r0.d.f5565c).m46322a(EnumC0238p0.LEGACY, C1417r0.d.f5566d).m46323b();
        f6338j = C12371h.m46319a().m46322a(EnumC0207b0.SHA256, C1417r0.c.f5560b).m46322a(EnumC0207b0.SHA384, C1417r0.c.f5561c).m46322a(EnumC0207b0.SHA512, C1417r0.c.f5562d).m46323b();
    }

    /* JADX INFO: renamed from: g */
    public static BigInteger m8237g(AbstractC2920h abstractC2920h) {
        return C12357a.m46223a(abstractC2920h.m13569x());
    }

    /* JADX INFO: renamed from: h */
    public static C5110b m8238h(AbstractC2920h abstractC2920h, C10218d0 c10218d0) {
        return C5110b.m23851a(C12357a.m46223a(abstractC2920h.m13569x()), c10218d0);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2920h m8239i(BigInteger bigInteger) {
        return AbstractC2920h.m13555e(C12357a.m46224b(bigInteger));
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2920h m8240j(C5110b c5110b, C10218d0 c10218d0) {
        return m8239i(c5110b.m23852b(c10218d0));
    }

    /* JADX INFO: renamed from: k */
    public static C0252w0 m8241k(C1417r0 c1417r0) {
        C0252w0.b bVarM1102h0 = C0252w0.m1102h0();
        C12371h<EnumC0207b0, C1417r0.c> c12371h = f6338j;
        return bVarM1102h0.m1111E((EnumC0207b0) c12371h.m46321c(c1417r0.m7352g())).m1109C((EnumC0207b0) c12371h.m46321c(c1417r0.m7348c())).m1110D(c1417r0.m7351f()).build();
    }

    /* JADX INFO: renamed from: l */
    public static C0256y0 m8242l(C1421t0 c1421t0) {
        return C0256y0.m1177j0().m1190E(m8241k(c1421t0.m7379e())).m1189D(m8239i(c1421t0.m7378d())).m1188C(m8239i(c1421t0.m7379e().m7350e())).m1191G(0).build();
    }

    /* JADX INFO: renamed from: m */
    public static C1417r0 m8243m(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            C0250v0 c0250v0M1083h0 = C0250v0.m1083h0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
            C1417r0.b bVarM7347b = C1417r0.m7347b();
            C12371h<EnumC0207b0, C1417r0.c> c12371h = f6338j;
            return bVarM7347b.m7359f(c12371h.m46320b(c0250v0M1083h0.m1087e0().m1105g0())).m7355b(c12371h.m46320b(c0250v0M1083h0.m1087e0().m1103e0())).m7357d(m8237g(c0250v0M1083h0.m1088f0())).m7356c(c0250v0M1083h0.m1086d0()).m7358e(c0250v0M1083h0.m1087e0().m1104f0()).m7360g(f6337i.m46320b(c12382m0.m46404d().m762e0())).m7354a();
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static C1419s0 m8244n(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: " + c12380l0.m46396f());
        }
        try {
            C0254x0 c0254x0M1136r0 = C0254x0.m1136r0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0254x0M1136r0.m1151p0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C0256y0 c0256y0M1149n0 = c0254x0M1136r0.m1149n0();
            if (c0256y0M1149n0.m1187i0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerM8237g = m8237g(c0256y0M1149n0.m1185g0());
            int iBitLength = bigIntegerM8237g.bitLength();
            BigInteger bigIntegerM8237g2 = m8237g(c0256y0M1149n0.m1184f0());
            C1417r0.b bVarM7347b = C1417r0.m7347b();
            C12371h<EnumC0207b0, C1417r0.c> c12371h = f6338j;
            C1421t0 c1421t0M7380a = C1421t0.m7377c().m7384e(bVarM7347b.m7359f(c12371h.m46320b(c0256y0M1149n0.m1186h0().m1105g0())).m7355b(c12371h.m46320b(c0256y0M1149n0.m1186h0().m1103e0())).m7357d(bigIntegerM8237g2).m7356c(iBitLength).m7358e(c0256y0M1149n0.m1186h0().m1104f0()).m7360g(f6337i.m46320b(c12380l0.m46395e())).m7354a()).m7383d(bigIntegerM8237g).m7382c(c12380l0.m46393c()).m7380a();
            C10218d0 c10218d0M39310b = C10218d0.m39310b(c10218d0);
            return C1419s0.m7362d().m7376f(c1421t0M7380a).m7374d(m8238h(c0254x0M1136r0.m1148m0(), c10218d0M39310b), m8238h(c0254x0M1136r0.m1150o0(), c10218d0M39310b)).m7375e(m8238h(c0254x0M1136r0.m1145j0(), c10218d0M39310b)).m7373c(m8238h(c0254x0M1136r0.m1146k0(), c10218d0M39310b), m8238h(c0254x0M1136r0.m1147l0(), c10218d0M39310b)).m7372b(m8238h(c0254x0M1136r0.m1144i0(), c10218d0M39310b)).m7371a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    /* JADX INFO: renamed from: o */
    public static C1421t0 m8245o(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: " + c12380l0.m46396f());
        }
        try {
            C0256y0 c0256y0M1178k0 = C0256y0.m1178k0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0256y0M1178k0.m1187i0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerM8237g = m8237g(c0256y0M1178k0.m1185g0());
            int iBitLength = bigIntegerM8237g.bitLength();
            C1417r0.b bVarM7347b = C1417r0.m7347b();
            C12371h<EnumC0207b0, C1417r0.c> c12371h = f6338j;
            return C1421t0.m7377c().m7384e(bVarM7347b.m7359f(c12371h.m46320b(c0256y0M1178k0.m1186h0().m1105g0())).m7355b(c12371h.m46320b(c0256y0M1178k0.m1186h0().m1103e0())).m7357d(m8237g(c0256y0M1178k0.m1184f0())).m7356c(iBitLength).m7358e(c0256y0M1178k0.m1186h0().m1104f0()).m7360g(f6337i.m46320b(c12380l0.m46395e())).m7354a()).m7383d(bigIntegerM8237g).m7382c(c12380l0.m46393c()).m7380a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8246p() {
        m8247q(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: q */
    public static void m8247q(C12364d0 c12364d0) {
        c12364d0.m46248m(f6331c);
        c12364d0.m46247l(f6332d);
        c12364d0.m46246k(f6333e);
        c12364d0.m46245j(f6334f);
        c12364d0.m46246k(f6335g);
        c12364d0.m46245j(f6336h);
    }

    /* JADX INFO: renamed from: r */
    public static C12382m0 m8248r(C1417r0 c1417r0) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey").m768E(C0250v0.m1082g0().m1091D(m8241k(c1417r0)).m1090C(c1417r0.m7349d()).m1092E(m8239i(c1417r0.m7350e())).build().mo13369b()).m766C((EnumC0238p0) f6337i.m46321c(c1417r0.m7353h())).build());
    }

    /* JADX INFO: renamed from: s */
    public static C12380l0 m8249s(C1419s0 c1419s0, C10218d0 c10218d0) throws GeneralSecurityException {
        C10218d0 c10218d0M39310b = C10218d0.m39310b(c10218d0);
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", C0254x0.m1135q0().m1160O(0).m1158K(m8242l(c1419s0.mo7242c())).m1154D(m8240j(c1419s0.m7369k(), c10218d0M39310b)).m1157J(m8240j(c1419s0.m7367i(), c10218d0M39310b)).m1159N(m8240j(c1419s0.m7368j(), c10218d0M39310b)).m1155E(m8240j(c1419s0.m7365g(), c10218d0M39310b)).m1156G(m8240j(c1419s0.m7366h(), c10218d0M39310b)).m1153C(m8240j(c1419s0.m7363e(), c10218d0M39310b)).build().mo13369b(), C0218f0.c.ASYMMETRIC_PRIVATE, (EnumC0238p0) f6337i.m46321c(c1419s0.m7364f().m7353h()), c1419s0.mo7250a());
    }

    /* JADX INFO: renamed from: t */
    public static C12380l0 m8250t(C1421t0 c1421t0, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", m8242l(c1421t0).mo13369b(), C0218f0.c.ASYMMETRIC_PUBLIC, (EnumC0238p0) f6337i.m46321c(c1421t0.m7379e().m7353h()), c1421t0.mo7250a());
    }
}
