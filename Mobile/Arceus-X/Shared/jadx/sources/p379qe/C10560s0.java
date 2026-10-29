package p379qe;

import af.C0218f0;
import af.C0222h0;
import af.C0230l0;
import af.C0232m0;
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

/* JADX INFO: renamed from: qe.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10560s0 {

    /* JADX INFO: renamed from: a */
    public static final C5109a f37863a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10545n0, C12382m0> f37864b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f37865c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10542m0, C12380l0> f37866d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f37867e;

    /* JADX INFO: renamed from: qe.s0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37868a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f37868a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37868a[EnumC0238p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f37863a = c5109aM46455h;
        f37864b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: qe.o0
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10560s0.m40475j((C10545n0) abstractC10243x);
            }
        }, C10545n0.class, C12382m0.class);
        f37865c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: qe.p0
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10560s0.m40471f((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f37866d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: qe.q0
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10560s0.m40474i((C10542m0) abstractC10231l, c10218d0);
            }
        }, C10542m0.class, C12380l0.class);
        f37867e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: qe.r0
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10560s0.m40470e((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C10542m0 m40470e(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            C0230l0 c0230l0M871e0 = C0230l0.m871e0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0230l0M871e0.m874c0() == 0) {
                return C10542m0.m40423b(C10545n0.m40426b(c0230l0M871e0.m873b0().m890c0(), m40477l(c12380l0.m46395e())), c12380l0.m46393c());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + c0230l0M871e0);
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C10545n0 m40471f(C12382m0 c12382m0) throws GeneralSecurityException {
        if (c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return C10545n0.m40426b(C0232m0.m889e0(c12382m0.m46404d().m764g0(), C2944p.m14035b()).m890c0(), m40477l(c12382m0.m46404d().m762e0()));
            } catch (C2903b0 e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
    }

    /* JADX INFO: renamed from: g */
    public static void m40472g() {
        m40473h(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: h */
    public static void m40473h(C12364d0 c12364d0) {
        c12364d0.m46248m(f37864b);
        c12364d0.m46247l(f37865c);
        c12364d0.m46246k(f37866d);
        c12364d0.m46245j(f37867e);
    }

    /* JADX INFO: renamed from: i */
    public static C12380l0 m40474i(C10542m0 c10542m0, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.KmsAeadKey", C0230l0.m870d0().m876C(C0232m0.m888d0().m892C(c10542m0.m40425d().m40427c()).build()).build().mo13369b(), C0218f0.c.REMOTE, m40476k(c10542m0.m40425d().m40428d()), c10542m0.mo7250a());
    }

    /* JADX INFO: renamed from: j */
    public static C12382m0 m40475j(C10545n0 c10545n0) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.KmsAeadKey").m768E(C0232m0.m888d0().m892C(c10545n0.m40427c()).build().mo13369b()).m766C(m40476k(c10545n0.m40428d())).build());
    }

    /* JADX INFO: renamed from: k */
    public static EnumC0238p0 m40476k(C10545n0.a aVar) throws GeneralSecurityException {
        if (C10545n0.a.f37827b.equals(aVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10545n0.a.f37828c.equals(aVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    /* JADX INFO: renamed from: l */
    public static C10545n0.a m40477l(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f37868a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10545n0.a.f37827b;
        }
        if (i10 == 2) {
            return C10545n0.a.f37828c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
