package re;

import af.C0205a1;
import af.C0208b1;
import af.C0218f0;
import af.C0222h0;
import af.C0258z0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import java.util.Objects;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10537k1;
import p379qe.C10549o1;
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

/* JADX INFO: renamed from: re.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10849q0 {

    /* JADX INFO: renamed from: a */
    public static final C5109a f38567a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10549o1, C12382m0> f38568b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f38569c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10537k1, C12380l0> f38570d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f38571e;

    /* JADX INFO: renamed from: re.q0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38572a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f38572a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38572a[EnumC0238p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f38567a = c5109aM46455h;
        f38568b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: re.m0
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10849q0.m41282j((C10549o1) abstractC10243x);
            }
        }, C10549o1.class, C12382m0.class);
        f38569c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: re.n0
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10849q0.m41278f((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f38570d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: re.o0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10849q0.m41281i((C10537k1) abstractC10231l, c10218d0);
            }
        }, C10537k1.class, C12380l0.class);
        f38571e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: re.p0
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10849q0.m41277e((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C10537k1 m41277e(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            C0258z0 c0258z0M1198g0 = C0258z0.m1198g0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0258z0M1198g0.m1202e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c0258z0M1198g0.m1200c0().size() == 32) {
                return C10537k1.m40403b(C10549o1.m40439b(m41284l(c12380l0.m46395e()), c0258z0M1198g0.m1201d0().m618c0()), C5111c.m23853a(c0258z0M1198g0.m1200c0().m13569x(), C10218d0.m39310b(c10218d0)), c12380l0.m46393c());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    /* JADX INFO: renamed from: f */
    public static C10549o1 m41278f(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            C0205a1 c0205a1M595e0 = C0205a1.m595e0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
            if (c0205a1M595e0.m598c0() == 0) {
                return C10549o1.m40439b(m41284l(c12382m0.m46404d().m762e0()), c0205a1M595e0.m597b0().m618c0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m41279g() {
        m41280h(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: h */
    public static void m41280h(C12364d0 c12364d0) {
        c12364d0.m46248m(f38568b);
        c12364d0.m46247l(f38569c);
        c12364d0.m46246k(f38570d);
        c12364d0.m46245j(f38571e);
    }

    /* JADX INFO: renamed from: i */
    public static C12380l0 m41281i(C10537k1 c10537k1, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.XAesGcmKey", C0258z0.m1197f0().m1204C(AbstractC2920h.m13555e(c10537k1.m40405c().m23856d(C10218d0.m39310b(c10218d0)))).m1205D(C0208b1.m617d0().m620C(c10537k1.m40407f().m40440c()).build()).build().mo13369b(), C0218f0.c.SYMMETRIC, m41283k(c10537k1.m40407f().m40441d()), c10537k1.mo7250a());
    }

    /* JADX INFO: renamed from: j */
    public static C12382m0 m41282j(C10549o1 c10549o1) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.XAesGcmKey").m768E(C0205a1.m594d0().m599C(C0208b1.m617d0().m620C(c10549o1.m40440c()).build()).build().mo13369b()).m766C(m41283k(c10549o1.m40441d())).build());
    }

    /* JADX INFO: renamed from: k */
    public static EnumC0238p0 m41283k(C10549o1.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, C10549o1.a.f37837b)) {
            return EnumC0238p0.TINK;
        }
        if (Objects.equals(aVar, C10549o1.a.f37838c)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    /* JADX INFO: renamed from: l */
    public static C10549o1.a m41284l(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f38572a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10549o1.a.f37837b;
        }
        if (i10 == 2) {
            return C10549o1.a.f37838c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
