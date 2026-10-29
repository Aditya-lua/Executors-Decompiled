package ye;

import af.C0203a;
import af.C0206b;
import af.C0209c;
import af.C0218f0;
import af.C0222h0;
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
import p515we.C12380l0;
import p515we.C12382m0;
import p515we.C12394s0;
import p515we.InterfaceC12388p0;
import p544xe.C12803a;
import p544xe.C12808f;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10218d0;

/* JADX INFO: renamed from: ye.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C13177e {

    /* JADX INFO: renamed from: a */
    public static final C5109a f46434a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C12808f, C12382m0> f46435b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f46436c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C12803a, C12380l0> f46437d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f46438e;

    /* JADX INFO: renamed from: ye.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46439a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f46439a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46439a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46439a[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46439a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f46434a = c5109aM46455h;
        f46435b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: ye.a
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C13177e.m48786k((C12808f) abstractC10243x);
            }
        }, C12808f.class, C12382m0.class);
        f46436c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: ye.b
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C13177e.m48782g((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f46437d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: ye.c
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C13177e.m48785j((C12803a) abstractC10231l, c10218d0);
            }
        }, C12803a.class, C12380l0.class);
        f46438e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: ye.d
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C13177e.m48781f((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C0209c m48780e(C12808f c12808f) {
        return C0209c.m624d0().m627C(c12808f.m47700c()).build();
    }

    /* JADX INFO: renamed from: f */
    public static C12803a m48781f(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            C0203a c0203aM562g0 = C0203a.m562g0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0203aM562g0.m568e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C12803a.m47681b().m47689e(C12808f.m47699b().m47705b(c0203aM562g0.m565c0().size()).m47706c(c0203aM562g0.m566d0().m625c0()).m47707d(m48788m(c12380l0.m46395e())).m47704a()).m47687c(C5111c.m23853a(c0203aM562g0.m565c0().m13569x(), C10218d0.m39310b(c10218d0))).m47688d(c12380l0.m46393c()).m47685a();
        } catch (C2903b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* JADX INFO: renamed from: g */
    public static C12808f m48782g(C12382m0 c12382m0) throws GeneralSecurityException {
        if (c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                C0206b c0206bM604f0 = C0206b.m604f0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
                return C12808f.m47699b().m47705b(c0206bM604f0.m606c0()).m47706c(c0206bM604f0.m607d0().m625c0()).m47707d(m48788m(c12382m0.m46404d().m762e0())).m47704a();
            } catch (C2903b0 e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
    }

    /* JADX INFO: renamed from: h */
    public static void m48783h() {
        m48784i(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: i */
    public static void m48784i(C12364d0 c12364d0) {
        c12364d0.m46248m(f46435b);
        c12364d0.m46247l(f46436c);
        c12364d0.m46246k(f46437d);
        c12364d0.m46245j(f46438e);
    }

    /* JADX INFO: renamed from: j */
    public static C12380l0 m48785j(C12803a c12803a, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.AesCmacKey", C0203a.m561f0().m574D(m48780e(c12803a.m47684e())).m573C(AbstractC2920h.m13555e(c12803a.m47682c().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.SYMMETRIC, m48787l(c12803a.m47684e().m47703f()), c12803a.mo7250a());
    }

    /* JADX INFO: renamed from: k */
    public static C12382m0 m48786k(C12808f c12808f) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.AesCmacKey").m768E(C0206b.m603e0().m610D(m48780e(c12808f)).m609C(c12808f.m47701d()).build().mo13369b()).m766C(m48787l(c12808f.m47703f())).build());
    }

    /* JADX INFO: renamed from: l */
    public static EnumC0238p0 m48787l(C12808f.c cVar) throws GeneralSecurityException {
        if (C12808f.c.f45564b.equals(cVar)) {
            return EnumC0238p0.TINK;
        }
        if (C12808f.c.f45565c.equals(cVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C12808f.c.f45567e.equals(cVar)) {
            return EnumC0238p0.RAW;
        }
        if (C12808f.c.f45566d.equals(cVar)) {
            return EnumC0238p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    /* JADX INFO: renamed from: m */
    public static C12808f.c m48788m(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f46439a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C12808f.c.f45564b;
        }
        if (i10 == 2) {
            return C12808f.c.f45565c;
        }
        if (i10 == 3) {
            return C12808f.c.f45566d;
        }
        if (i10 == 4) {
            return C12808f.c.f45567e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
