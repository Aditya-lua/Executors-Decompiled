package re;

import af.C0218f0;
import af.C0222h0;
import af.C0229l;
import af.C0231m;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10553q;
import p379qe.C10565u;
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

/* JADX INFO: renamed from: re.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C10846p {

    /* JADX INFO: renamed from: a */
    public static final C5109a f38561a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10565u, C12382m0> f38562b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f38563c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10553q, C12380l0> f38564d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f38565e;

    /* JADX INFO: renamed from: re.p$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38566a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f38566a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38566a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38566a[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38566a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f38561a = c5109aM46455h;
        f38562b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: re.l
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10846p.m41269j((C10565u) abstractC10243x);
            }
        }, C10565u.class, C12382m0.class);
        f38563c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: re.m
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10846p.m41265f((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f38564d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: re.n
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10846p.m41268i((C10553q) abstractC10231l, c10218d0);
            }
        }, C10553q.class, C12380l0.class);
        f38565e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: re.o
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10846p.m41264e((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C10553q m41264e(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            C0229l c0229lM862e0 = C0229l.m862e0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0229lM862e0.m866c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C10553q.m40457b().m40465e(C10565u.m40495b().m40502c(c0229lM862e0.m865b0().size()).m40501b(12).m40503d(16).m40504e(m41271l(c12380l0.m46395e())).m40500a()).m40464d(C5111c.m23853a(c0229lM862e0.m865b0().m13569x(), C10218d0.m39310b(c10218d0))).m40463c(c12380l0.m46393c()).m40461a();
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    /* JADX INFO: renamed from: f */
    public static C10565u m41265f(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            C0231m c0231mM880e0 = C0231m.m880e0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
            if (c0231mM880e0.m883c0() == 0) {
                return C10565u.m40495b().m40502c(c0231mM880e0.m882b0()).m40501b(12).m40503d(16).m40504e(m41271l(c12382m0.m46404d().m762e0())).m40500a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m41266g() {
        m41267h(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: h */
    public static void m41267h(C12364d0 c12364d0) {
        c12364d0.m46248m(f38562b);
        c12364d0.m46247l(f38563c);
        c12364d0.m46246k(f38564d);
        c12364d0.m46245j(f38565e);
    }

    /* JADX INFO: renamed from: i */
    public static C12380l0 m41268i(C10553q c10553q, C10218d0 c10218d0) throws GeneralSecurityException {
        m41272m(c10553q.m40460e());
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.AesGcmKey", C0229l.m861d0().m867C(AbstractC2920h.m13555e(c10553q.m40458c().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.SYMMETRIC, m41270k(c10553q.m40460e().m40499f()), c10553q.mo7250a());
    }

    /* JADX INFO: renamed from: j */
    public static C12382m0 m41269j(C10565u c10565u) throws GeneralSecurityException {
        m41272m(c10565u);
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.AesGcmKey").m768E(C0231m.m879d0().m884C(c10565u.m40497d()).build().mo13369b()).m766C(m41270k(c10565u.m40499f())).build());
    }

    /* JADX INFO: renamed from: k */
    public static EnumC0238p0 m41270k(C10565u.c cVar) throws GeneralSecurityException {
        if (C10565u.c.f37894b.equals(cVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10565u.c.f37895c.equals(cVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C10565u.c.f37896d.equals(cVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    /* JADX INFO: renamed from: l */
    public static C10565u.c m41271l(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f38566a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10565u.c.f37894b;
        }
        if (i10 == 2 || i10 == 3) {
            return C10565u.c.f37895c;
        }
        if (i10 == 4) {
            return C10565u.c.f37896d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }

    /* JADX INFO: renamed from: m */
    public static void m41272m(C10565u c10565u) throws GeneralSecurityException {
        if (c10565u.m40498e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c10565u.m40498e())));
        }
        if (c10565u.m40496c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(c10565u.m40496c())));
        }
    }
}
