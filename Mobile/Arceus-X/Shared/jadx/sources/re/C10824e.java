package re;

import af.C0210c0;
import af.C0212d;
import af.C0213d0;
import af.C0215e;
import af.C0216e0;
import af.C0217f;
import af.C0218f0;
import af.C0219g;
import af.C0221h;
import af.C0222h0;
import af.EnumC0207b0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10520f;
import p379qe.C10535k;
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

/* JADX INFO: renamed from: re.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10824e {

    /* JADX INFO: renamed from: a */
    public static final C5109a f38536a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10535k, C12382m0> f38537b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f38538c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10520f, C12380l0> f38539d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f38540e;

    /* JADX INFO: renamed from: re.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38541a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f38542b;

        static {
            int[] iArr = new int[EnumC0207b0.values().length];
            f38542b = iArr;
            try {
                iArr[EnumC0207b0.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38542b[EnumC0207b0.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38542b[EnumC0207b0.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38542b[EnumC0207b0.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38542b[EnumC0207b0.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC0238p0.values().length];
            f38541a = iArr2;
            try {
                iArr2[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38541a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38541a[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38541a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f38536a = c5109aM46455h;
        f38537b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: re.a
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10824e.m41220k((C10535k) abstractC10243x);
            }
        }, C10535k.class, C12382m0.class);
        f38538c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: re.b
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10824e.m41216g((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f38539d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: re.c
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10824e.m41219j((C10520f) abstractC10231l, c10218d0);
            }
        }, C10520f.class, C12380l0.class);
        f38540e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: re.d
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10824e.m41215f((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C0216e0 m41214e(C10535k c10535k) {
        return C0216e0.m696f0().m702D(c10535k.m40393g()).m701C(m41222m(c10535k.m40390d())).build();
    }

    /* JADX INFO: renamed from: f */
    public static C10520f m41215f(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            C0212d c0212dM655g0 = C0212d.m655g0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0212dM655g0.m659e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c0212dM655g0.m657c0().m711f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (c0212dM655g0.m658d0().m638f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return C10520f.m40352b().m40362f(C10535k.m40388b().m40397b(c0212dM655g0.m657c0().m709d0().size()).m40399d(c0212dM655g0.m658d0().m636d0().size()).m40400e(c0212dM655g0.m657c0().m710e0().m749c0()).m40401f(c0212dM655g0.m658d0().m637e0().m699e0()).m40398c(m41221l(c0212dM655g0.m658d0().m637e0().m698d0())).m40402g(m41224o(c12380l0.m46395e())).m40396a()).m40359c(C5111c.m23853a(c0212dM655g0.m657c0().m709d0().m13569x(), C10218d0.m39310b(c10218d0))).m40360d(C5111c.m23853a(c0212dM655g0.m658d0().m636d0().m13569x(), C10218d0.m39310b(c10218d0))).m40361e(c12380l0.m46393c()).m40357a();
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    /* JADX INFO: renamed from: g */
    public static C10535k m41216g(C12382m0 c12382m0) throws GeneralSecurityException {
        if (!c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
        }
        try {
            C0215e c0215eM685f0 = C0215e.m685f0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
            if (c0215eM685f0.m687d0().m674f0() == 0) {
                return C10535k.m40388b().m40397b(c0215eM685f0.m686c0().m739d0()).m40399d(c0215eM685f0.m687d0().m672d0()).m40400e(c0215eM685f0.m686c0().m740e0().m749c0()).m40401f(c0215eM685f0.m687d0().m673e0().m699e0()).m40398c(m41221l(c0215eM685f0.m687d0().m673e0().m698d0())).m40402g(m41224o(c12382m0.m46404d().m762e0())).m40396a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m41217h() {
        m41218i(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: i */
    public static void m41218i(C12364d0 c12364d0) {
        c12364d0.m46248m(f38537b);
        c12364d0.m46247l(f38538c);
        c12364d0.m46246k(f38539d);
        c12364d0.m46245j(f38540e);
    }

    /* JADX INFO: renamed from: j */
    public static C12380l0 m41219j(C10520f c10520f, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", C0212d.m654f0().m662C(C0217f.m707g0().m714D(C0221h.m748d0().m751C(c10520f.m40356f().m40392f()).build()).m713C(AbstractC2920h.m13555e(c10520f.m40353c().m23856d(C10218d0.m39310b(c10218d0)))).build()).m663D(C0210c0.m632g0().m641D(m41214e(c10520f.m40356f())).m640C(AbstractC2920h.m13555e(c10520f.m40354d().m23856d(C10218d0.m39310b(c10218d0)))).build()).build().mo13369b(), C0218f0.c.SYMMETRIC, m41223n(c10520f.m40356f().m40394h()), c10520f.mo7250a());
    }

    /* JADX INFO: renamed from: k */
    public static C12382m0 m41220k(C10535k c10535k) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").m768E(C0215e.m684e0().m690C(C0219g.m736f0().m742D(C0221h.m748d0().m751C(c10535k.m40392f()).build()).m741C(c10535k.m40389c()).build()).m691D(C0213d0.m668g0().m676D(m41214e(c10535k)).m675C(c10535k.m40391e()).build()).build().mo13369b()).m766C(m41223n(c10535k.m40394h())).build());
    }

    /* JADX INFO: renamed from: l */
    public static C10535k.c m41221l(EnumC0207b0 enumC0207b0) throws GeneralSecurityException {
        int i10 = a.f38542b[enumC0207b0.ordinal()];
        if (i10 == 1) {
            return C10535k.c.f37798b;
        }
        if (i10 == 2) {
            return C10535k.c.f37799c;
        }
        if (i10 == 3) {
            return C10535k.c.f37800d;
        }
        if (i10 == 4) {
            return C10535k.c.f37801e;
        }
        if (i10 == 5) {
            return C10535k.c.f37802f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC0207b0.getNumber());
    }

    /* JADX INFO: renamed from: m */
    public static EnumC0207b0 m41222m(C10535k.c cVar) throws GeneralSecurityException {
        if (C10535k.c.f37798b.equals(cVar)) {
            return EnumC0207b0.SHA1;
        }
        if (C10535k.c.f37799c.equals(cVar)) {
            return EnumC0207b0.SHA224;
        }
        if (C10535k.c.f37800d.equals(cVar)) {
            return EnumC0207b0.SHA256;
        }
        if (C10535k.c.f37801e.equals(cVar)) {
            return EnumC0207b0.SHA384;
        }
        if (C10535k.c.f37802f.equals(cVar)) {
            return EnumC0207b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    /* JADX INFO: renamed from: n */
    public static EnumC0238p0 m41223n(C10535k.d dVar) throws GeneralSecurityException {
        if (C10535k.d.f37804b.equals(dVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10535k.d.f37805c.equals(dVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C10535k.d.f37806d.equals(dVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    /* JADX INFO: renamed from: o */
    public static C10535k.d m41224o(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f38541a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10535k.d.f37804b;
        }
        if (i10 == 2 || i10 == 3) {
            return C10535k.d.f37805c;
        }
        if (i10 == 4) {
            return C10535k.d.f37806d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
