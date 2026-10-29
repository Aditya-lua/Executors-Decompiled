package re;

import af.C0211c1;
import af.C0214d1;
import af.C0218f0;
import af.C0222h0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10552p1;
import p379qe.C10564t1;
import p515we.AbstractC12368f0;
import p515we.AbstractC12370g0;
import p515we.AbstractC12381m;
import p515we.AbstractC12383n;
import p515we.C12364d0;
import p515we.C12380l0;
import p515we.C12382m0;
import p515we.C12394s0;
import p515we.InterfaceC12388p0;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: re.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10861w0 {

    /* JADX INFO: renamed from: a */
    public static final C5109a f38589a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10564t1, C12382m0> f38590b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f38591c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10552p1, C12380l0> f38592d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f38593e;

    /* JADX INFO: renamed from: re.w0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38594a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f38594a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38594a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38594a[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38594a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f38589a = c5109aM46455h;
        f38590b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: re.s0
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10861w0.m41315j((C10564t1) abstractC10243x);
            }
        }, C10564t1.class, C12382m0.class);
        f38591c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: re.t0
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10861w0.m41311f((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f38592d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: re.u0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10861w0.m41314i((C10552p1) abstractC10231l, c10218d0);
            }
        }, C10552p1.class, C12380l0.class);
        f38593e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: re.v0
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10861w0.m41310e((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C10552p1 m41310e(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            C0211c1 c0211c1M645e0 = C0211c1.m645e0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0211c1M645e0.m649c0() == 0) {
                return C10552p1.m40452b(m41317l(c12380l0.m46395e()), C5111c.m23853a(c0211c1M645e0.m648b0().m13569x(), C10218d0.m39310b(c10218d0)), c12380l0.m46393c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    /* JADX INFO: renamed from: f */
    public static C10564t1 m41311f(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            if (C0214d1.m679c0(c12382m0.m46404d().m764g0(), C2944p.m14035b()).m680b0() == 0) {
                return C10564t1.m40493b(m41317l(c12382m0.m46404d().m762e0()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m41312g() {
        m41313h(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: h */
    public static void m41313h(C12364d0 c12364d0) {
        c12364d0.m46248m(f38590b);
        c12364d0.m46247l(f38591c);
        c12364d0.m46246k(f38592d);
        c12364d0.m46245j(f38593e);
    }

    /* JADX INFO: renamed from: i */
    public static C12380l0 m41314i(C10552p1 c10552p1, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", C0211c1.m644d0().m650C(AbstractC2920h.m13555e(c10552p1.m40454c().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.SYMMETRIC, m41316k(c10552p1.m40456f().m40494c()), c10552p1.mo7250a());
    }

    /* JADX INFO: renamed from: j */
    public static C12382m0 m41315j(C10564t1 c10564t1) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").m768E(C0214d1.m678a0().mo13369b()).m766C(m41316k(c10564t1.m40494c())).build());
    }

    /* JADX INFO: renamed from: k */
    public static EnumC0238p0 m41316k(C10564t1.a aVar) throws GeneralSecurityException {
        if (C10564t1.a.f37882b.equals(aVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10564t1.a.f37883c.equals(aVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C10564t1.a.f37884d.equals(aVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    /* JADX INFO: renamed from: l */
    public static C10564t1.a m41317l(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f38594a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10564t1.a.f37882b;
        }
        if (i10 == 2 || i10 == 3) {
            return C10564t1.a.f37883c;
        }
        if (i10 == 4) {
            return C10564t1.a.f37884d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
