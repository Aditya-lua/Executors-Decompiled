package p379qe;

import af.C0218f0;
import af.C0222h0;
import af.C0234n0;
import af.C0236o0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
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
import pe.C10226h0;

/* JADX INFO: renamed from: qe.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10576z0 {

    /* JADX INFO: renamed from: a */
    public static final C5109a f37935a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10566u0, C12382m0> f37936b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f37937c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10563t0, C12380l0> f37938d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f37939e;

    /* JADX INFO: renamed from: qe.z0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37940a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f37940a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37940a[EnumC0238p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f37935a = c5109aM46455h;
        f37936b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: qe.v0
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10576z0.m40545k((C10566u0) abstractC10243x);
            }
        }, C10566u0.class, C12382m0.class);
        f37937c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: qe.w0
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10576z0.m40541g((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f37938d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: qe.x0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10576z0.m40544j((C10563t0) abstractC10231l, c10218d0);
            }
        }, C10563t0.class, C12380l0.class);
        f37939e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: qe.y0
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10576z0.m40539e((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C10563t0 m40539e(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            C0234n0 c0234n0M905e0 = C0234n0.m905e0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0234n0M905e0.m908c0() == 0) {
                return C10563t0.m40490b(m40540f(c0234n0M905e0.m907b0(), c12380l0.m46395e()), c12380l0.m46393c());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + c0234n0M905e0);
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C10566u0 m40540f(C0236o0 c0236o0, EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        C10566u0.c cVar;
        AbstractC10243x abstractC10243xM39315a = C10226h0.m39315a(C0222h0.m757h0().m767D(c0236o0.m925d0().m763f0()).m768E(c0236o0.m925d0().m764g0()).m766C(EnumC0238p0.RAW).build().m13375n());
        if (abstractC10243xM39315a instanceof C10565u) {
            cVar = C10566u0.c.f37906b;
        } else if (abstractC10243xM39315a instanceof C10518e0) {
            cVar = C10566u0.c.f37908d;
        } else if (abstractC10243xM39315a instanceof C10564t1) {
            cVar = C10566u0.c.f37907c;
        } else if (abstractC10243xM39315a instanceof C10535k) {
            cVar = C10566u0.c.f37909e;
        } else if (abstractC10243xM39315a instanceof C10550p) {
            cVar = C10566u0.c.f37910f;
        } else {
            if (!(abstractC10243xM39315a instanceof C10575z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + abstractC10243xM39315a);
            }
            cVar = C10566u0.c.f37911g;
        }
        return C10566u0.m40505b().m40514f(m40548n(enumC0238p0)).m40513e(c0236o0.m926e0()).m40511c((AbstractC10511c) abstractC10243xM39315a).m40512d(cVar).m40510a();
    }

    /* JADX INFO: renamed from: g */
    public static C10566u0 m40541g(C12382m0 c12382m0) throws GeneralSecurityException {
        if (c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return m40540f(C0236o0.m924g0(c12382m0.m46404d().m764g0(), C2944p.m14035b()), c12382m0.m46404d().m762e0());
            } catch (C2903b0 e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
    }

    /* JADX INFO: renamed from: h */
    public static void m40542h() {
        m40543i(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: i */
    public static void m40543i(C12364d0 c12364d0) {
        c12364d0.m46248m(f37936b);
        c12364d0.m46247l(f37937c);
        c12364d0.m46246k(f37938d);
        c12364d0.m46245j(f37939e);
    }

    /* JADX INFO: renamed from: j */
    public static C12380l0 m40544j(C10563t0 c10563t0, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", C0234n0.m904d0().m910C(m40546l(c10563t0.m40492d())).build().mo13369b(), C0218f0.c.REMOTE, m40547m(c10563t0.m40492d().m40508e()), c10563t0.mo7250a());
    }

    /* JADX INFO: renamed from: k */
    public static C12382m0 m40545k(C10566u0 c10566u0) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").m768E(m40546l(c10566u0).mo13369b()).m766C(m40547m(c10566u0.m40508e())).build());
    }

    /* JADX INFO: renamed from: l */
    public static C0236o0 m40546l(C10566u0 c10566u0) throws GeneralSecurityException {
        try {
            return C0236o0.m923f0().m930D(c10566u0.m40507d()).m929C(C0222h0.m759j0(C10226h0.m39316b(c10566u0.m40506c()), C2944p.m14035b())).build();
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public static EnumC0238p0 m40547m(C10566u0.d dVar) throws GeneralSecurityException {
        if (C10566u0.d.f37913b.equals(dVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10566u0.d.f37914c.equals(dVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    /* JADX INFO: renamed from: n */
    public static C10566u0.d m40548n(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f37940a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10566u0.d.f37913b;
        }
        if (i10 == 2) {
            return C10566u0.d.f37914c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
