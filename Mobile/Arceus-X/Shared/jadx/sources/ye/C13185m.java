package ye;

import af.C0210c0;
import af.C0213d0;
import af.C0216e0;
import af.C0218f0;
import af.C0222h0;
import af.EnumC0207b0;
import af.EnumC0238p0;
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
import p544xe.C12811i;
import p544xe.C12817o;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: ye.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C13185m {

    /* JADX INFO: renamed from: a */
    public static final C5109a f46444a;

    /* JADX INFO: renamed from: b */
    public static final C12371h<EnumC0238p0, C12817o.d> f46445b;

    /* JADX INFO: renamed from: c */
    public static final C12371h<EnumC0207b0, C12817o.c> f46446c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12370g0<C12817o, C12382m0> f46447d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12368f0<C12382m0> f46448e;

    /* JADX INFO: renamed from: f */
    public static final AbstractC12383n<C12811i, C12380l0> f46449f;

    /* JADX INFO: renamed from: g */
    public static final AbstractC12381m<C12380l0> f46450g;

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.HmacKey");
        f46444a = c5109aM46455h;
        f46445b = C12371h.m46319a().m46322a(EnumC0238p0.RAW, C12817o.d.f45601e).m46322a(EnumC0238p0.TINK, C12817o.d.f45598b).m46322a(EnumC0238p0.LEGACY, C12817o.d.f45600d).m46322a(EnumC0238p0.CRUNCHY, C12817o.d.f45599c).m46323b();
        f46446c = C12371h.m46319a().m46322a(EnumC0207b0.SHA1, C12817o.c.f45592b).m46322a(EnumC0207b0.SHA224, C12817o.c.f45593c).m46322a(EnumC0207b0.SHA256, C12817o.c.f45594d).m46322a(EnumC0207b0.SHA384, C12817o.c.f45595e).m46322a(EnumC0207b0.SHA512, C12817o.c.f45596f).m46323b();
        f46447d = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: ye.i
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C13185m.m48801k((C12817o) abstractC10243x);
            }
        }, C12817o.class, C12382m0.class);
        f46448e = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: ye.j
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C13185m.m48797g((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f46449f = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: ye.k
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C13185m.m48800j((C12811i) abstractC10231l, c10218d0);
            }
        }, C12811i.class, C12380l0.class);
        f46450g = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: ye.l
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C13185m.m48796f((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C0216e0 m48795e(C12817o c12817o) {
        return C0216e0.m696f0().m702D(c12817o.m47725c()).m701C((EnumC0207b0) f46446c.m46321c(c12817o.m47726d())).build();
    }

    /* JADX INFO: renamed from: f */
    public static C12811i m48796f(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            C0210c0 c0210c0M633h0 = C0210c0.m633h0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0210c0M633h0.m638f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C12811i.m47710b().m47718e(C12817o.m47724b().m47733c(c0210c0M633h0.m636d0().size()).m47734d(c0210c0M633h0.m637e0().m699e0()).m47732b(f46446c.m46320b(c0210c0M633h0.m637e0().m698d0())).m47735e(f46445b.m46320b(c12380l0.m46395e())).m47731a()).m47717d(C5111c.m23853a(c0210c0M633h0.m636d0().m13569x(), C10218d0.m39310b(c10218d0))).m47716c(c12380l0.m46393c()).m47714a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: renamed from: g */
    public static C12817o m48797g(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            C0213d0 c0213d0M669h0 = C0213d0.m669h0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
            if (c0213d0M669h0.m674f0() == 0) {
                return C12817o.m47724b().m47733c(c0213d0M669h0.m672d0()).m47734d(c0213d0M669h0.m673e0().m699e0()).m47732b(f46446c.m46320b(c0213d0M669h0.m673e0().m698d0())).m47735e(f46445b.m46320b(c12382m0.m46404d().m762e0())).m47731a();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + c0213d0M669h0.m674f0());
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m48798h() {
        m48799i(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: i */
    public static void m48799i(C12364d0 c12364d0) {
        c12364d0.m46248m(f46447d);
        c12364d0.m46247l(f46448e);
        c12364d0.m46246k(f46449f);
        c12364d0.m46245j(f46450g);
    }

    /* JADX INFO: renamed from: j */
    public static C12380l0 m48800j(C12811i c12811i, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.HmacKey", C0210c0.m632g0().m641D(m48795e(c12811i.m47713e())).m640C(AbstractC2920h.m13555e(c12811i.m47711c().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.SYMMETRIC, (EnumC0238p0) f46445b.m46321c(c12811i.m47713e().m47729g()), c12811i.mo7250a());
    }

    /* JADX INFO: renamed from: k */
    public static C12382m0 m48801k(C12817o c12817o) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.HmacKey").m768E(C0213d0.m668g0().m676D(m48795e(c12817o)).m675C(c12817o.m47727e()).build().mo13369b()).m766C((EnumC0238p0) f46445b.m46321c(c12817o.m47729g())).build());
    }
}
