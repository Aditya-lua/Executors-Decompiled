package cf;

import af.C0218f0;
import af.C0222h0;
import af.C0251w;
import af.C0253x;
import af.C0255y;
import af.EnumC0238p0;
import bf.C1398i;
import bf.C1400j;
import bf.C1410o;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p515we.AbstractC12368f0;
import p515we.AbstractC12370g0;
import p515we.AbstractC12381m;
import p515we.AbstractC12383n;
import p515we.C12364d0;
import p515we.C12371h;
import p515we.C12380l0;
import p515we.C12382m0;
import p515we.C12394s0;
import p515we.InterfaceC12388p0;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: cf.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C1649n {

    /* JADX INFO: renamed from: a */
    public static final C5109a f6369a;

    /* JADX INFO: renamed from: b */
    public static final C5109a f6370b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12370g0<C1398i, C12382m0> f6371c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12368f0<C12382m0> f6372d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12383n<C1410o, C12380l0> f6373e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC12381m<C12380l0> f6374f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC12383n<C1400j, C12380l0> f6375g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC12381m<C12380l0> f6376h;

    /* JADX INFO: renamed from: i */
    public static final C12371h<EnumC0238p0, C1398i.a> f6377i;

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f6369a = c5109aM46455h;
        C5109a c5109aM46455h2 = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f6370b = c5109aM46455h2;
        f6371c = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: cf.h
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C1649n.m8295m((C1398i) abstractC10243x);
            }
        }, C1398i.class, C12382m0.class);
        f6372d = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: cf.i
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C1649n.m8290h((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f6373e = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.j
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1649n.m8297o((C1410o) abstractC10231l, c10218d0);
            }
        }, C1410o.class, C12380l0.class);
        f6374f = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.k
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1649n.m8292j((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h2, C12380l0.class);
        f6375g = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: cf.l
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C1649n.m8296n((C1400j) abstractC10231l, c10218d0);
            }
        }, C1400j.class, C12380l0.class);
        f6376h = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: cf.m
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C1649n.m8291i((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
        f6377i = C12371h.m46319a().m46322a(EnumC0238p0.RAW, C1398i.a.f5480e).m46322a(EnumC0238p0.TINK, C1398i.a.f5477b).m46322a(EnumC0238p0.CRUNCHY, C1398i.a.f5478c).m46322a(EnumC0238p0.LEGACY, C1398i.a.f5479d).m46323b();
    }

    /* JADX INFO: renamed from: g */
    public static C0255y m8289g(C1410o c1410o) {
        return C0255y.m1164e0().m1170C(AbstractC2920h.m13555e(c1410o.m7339f().m23850d())).build();
    }

    /* JADX INFO: renamed from: h */
    public static C1398i m8290h(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            if (C0251w.m1095c0(c12382m0.m46404d().m764g0(), C2944p.m14035b()).m1096b0() == 0) {
                return C1398i.m7289b(f6377i.m46320b(c12382m0.m46404d().m762e0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C1400j m8291i(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + c12380l0.m46396f());
        }
        try {
            C0253x c0253xM1116g0 = C0253x.m1116g0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0253xM1116g0.m1121e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C0255y c0255yM1120d0 = c0253xM1116g0.m1120d0();
            if (c0255yM1120d0.m1169d0() == 0) {
                return C1400j.m7294d(C1410o.m7336c(f6377i.m46320b(c12380l0.m46395e()), C5109a.m23847a(c0255yM1120d0.m1168c0().m13569x()), c12380l0.m46393c()), C5111c.m23853a(c0253xM1116g0.m1119c0().m13569x(), C10218d0.m39310b(c10218d0)));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    /* JADX INFO: renamed from: j */
    public static C1410o m8292j(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + c12380l0.m46396f());
        }
        try {
            C0255y c0255yM1165f0 = C0255y.m1165f0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0255yM1165f0.m1169d0() == 0) {
                return C1410o.m7336c(f6377i.m46320b(c12380l0.m46395e()), C5109a.m23847a(c0255yM1165f0.m1168c0().m13569x()), c12380l0.m46393c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m8293k() {
        m8294l(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: l */
    public static void m8294l(C12364d0 c12364d0) {
        c12364d0.m46248m(f6371c);
        c12364d0.m46247l(f6372d);
        c12364d0.m46246k(f6373e);
        c12364d0.m46245j(f6374f);
        c12364d0.m46246k(f6375g);
        c12364d0.m46245j(f6376h);
    }

    /* JADX INFO: renamed from: m */
    public static C12382m0 m8295m(C1398i c1398i) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").m768E(C0251w.m1094a0().mo13369b()).m766C((EnumC0238p0) f6377i.m46321c(c1398i.m7290c())).build());
    }

    /* JADX INFO: renamed from: n */
    public static C12380l0 m8296n(C1400j c1400j, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", C0253x.m1115f0().m1124D(m8289g(c1400j.mo7242c())).m1123C(AbstractC2920h.m13555e(c1400j.m7296f().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.ASYMMETRIC_PRIVATE, (EnumC0238p0) f6377i.m46321c(c1400j.m7295e().m7290c()), c1400j.mo7250a());
    }

    /* JADX INFO: renamed from: o */
    public static C12380l0 m8297o(C1410o c1410o, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", m8289g(c1410o).mo13369b(), C0218f0.c.ASYMMETRIC_PUBLIC, (EnumC0238p0) f6377i.m46321c(c1410o.m7338e().m7290c()), c1410o.mo7250a());
    }
}
