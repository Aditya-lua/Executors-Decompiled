package re;

import af.C0218f0;
import af.C0222h0;
import af.C0233n;
import af.C0235o;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10567v;
import p379qe.C10575z;
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

/* JADX INFO: renamed from: re.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C10856u {

    /* JADX INFO: renamed from: a */
    public static final C5109a f38576a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10575z, C12382m0> f38577b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f38578c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10567v, C12380l0> f38579d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f38580e;

    /* JADX INFO: renamed from: re.u$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38581a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f38581a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38581a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38581a[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38581a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f38576a = c5109aM46455h;
        f38577b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: re.q
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10856u.m41297j((C10575z) abstractC10243x);
            }
        }, C10575z.class, C12382m0.class);
        f38578c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: re.r
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10856u.m41293f((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f38579d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: re.s
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10856u.m41296i((C10567v) abstractC10231l, c10218d0);
            }
        }, C10567v.class, C12380l0.class);
        f38580e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: re.t
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10856u.m41292e((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C10567v m41292e(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            C0233n c0233nM896e0 = C0233n.m896e0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0233nM896e0.m900c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C10567v.m40515b().m40523e(C10575z.m40529b().m40533b(c0233nM896e0.m899b0().size()).m40534c(m41299l(c12380l0.m46395e())).m40532a()).m40522d(C5111c.m23853a(c0233nM896e0.m899b0().m13569x(), C10218d0.m39310b(c10218d0))).m40521c(c12380l0.m46393c()).m40519a();
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    /* JADX INFO: renamed from: f */
    public static C10575z m41293f(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            C0235o c0235oM914e0 = C0235o.m914e0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
            if (c0235oM914e0.m917c0() == 0) {
                return C10575z.m40529b().m40533b(c0235oM914e0.m916b0()).m40534c(m41299l(c12382m0.m46404d().m762e0())).m40532a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m41294g() {
        m41295h(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: h */
    public static void m41295h(C12364d0 c12364d0) {
        c12364d0.m46248m(f38577b);
        c12364d0.m46247l(f38578c);
        c12364d0.m46246k(f38579d);
        c12364d0.m46245j(f38580e);
    }

    /* JADX INFO: renamed from: i */
    public static C12380l0 m41296i(C10567v c10567v, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", C0233n.m895d0().m901C(AbstractC2920h.m13555e(c10567v.m40516c().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.SYMMETRIC, m41298k(c10567v.m40518e().m40531d()), c10567v.mo7250a());
    }

    /* JADX INFO: renamed from: j */
    public static C12382m0 m41297j(C10575z c10575z) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.AesGcmSivKey").m768E(C0235o.m913d0().m918C(c10575z.m40530c()).build().mo13369b()).m766C(m41298k(c10575z.m40531d())).build());
    }

    /* JADX INFO: renamed from: k */
    public static EnumC0238p0 m41298k(C10575z.c cVar) throws GeneralSecurityException {
        if (C10575z.c.f37931b.equals(cVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10575z.c.f37932c.equals(cVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C10575z.c.f37933d.equals(cVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    /* JADX INFO: renamed from: l */
    public static C10575z.c m41299l(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f38581a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10575z.c.f37931b;
        }
        if (i10 == 2 || i10 == 3) {
            return C10575z.c.f37932c;
        }
        if (i10 == 4) {
            return C10575z.c.f37933d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
