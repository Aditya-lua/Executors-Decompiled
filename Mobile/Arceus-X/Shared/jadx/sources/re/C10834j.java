package re;

import af.C0218f0;
import af.C0222h0;
import af.C0223i;
import af.C0225j;
import af.C0227k;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.security.GeneralSecurityException;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10538l;
import p379qe.C10550p;
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

/* JADX INFO: renamed from: re.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10834j {

    /* JADX INFO: renamed from: a */
    public static final C5109a f38548a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC12370g0<C10550p, C12382m0> f38549b;

    /* JADX INFO: renamed from: c */
    public static final AbstractC12368f0<C12382m0> f38550c;

    /* JADX INFO: renamed from: d */
    public static final AbstractC12383n<C10538l, C12380l0> f38551d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC12381m<C12380l0> f38552e;

    /* JADX INFO: renamed from: re.j$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38553a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f38553a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38553a[EnumC0238p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38553a[EnumC0238p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38553a[EnumC0238p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C5109a c5109aM46455h = C12394s0.m46455h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f38548a = c5109aM46455h;
        f38549b = AbstractC12370g0.m46315a(new AbstractC12370g0.b() { // from class: re.f
            @Override // p515we.AbstractC12370g0.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8227a(AbstractC10243x abstractC10243x) {
                return C10834j.m41242k((C10550p) abstractC10243x);
            }
        }, C10550p.class, C12382m0.class);
        f38550c = AbstractC12368f0.m46297a(new AbstractC12368f0.b() { // from class: re.g
            @Override // p515we.AbstractC12368f0.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10243x mo8229a(InterfaceC12388p0 interfaceC12388p0) {
                return C10834j.m41238g((C12382m0) interfaceC12388p0);
            }
        }, c5109aM46455h, C12382m0.class);
        f38551d = AbstractC12383n.m46405a(new AbstractC12383n.b() { // from class: re.h
            @Override // p515we.AbstractC12383n.b
            /* JADX INFO: renamed from: a */
            public final InterfaceC12388p0 mo8228a(AbstractC10231l abstractC10231l, C10218d0 c10218d0) {
                return C10834j.m41241j((C10538l) abstractC10231l, c10218d0);
            }
        }, C10538l.class, C12380l0.class);
        f38552e = AbstractC12381m.m46398a(new AbstractC12381m.b() { // from class: re.i
            @Override // p515we.AbstractC12381m.b
            /* JADX INFO: renamed from: a */
            public final AbstractC10231l mo8230a(InterfaceC12388p0 interfaceC12388p0, C10218d0 c10218d0) {
                return C10834j.m41237f((C12380l0) interfaceC12388p0, c10218d0);
            }
        }, c5109aM46455h, C12380l0.class);
    }

    /* JADX INFO: renamed from: e */
    public static C0227k m41236e(C10550p c10550p) throws GeneralSecurityException {
        if (c10550p.m40445e() == 16) {
            return C0227k.m832d0().m835C(c10550p.m40443c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c10550p.m40445e())));
    }

    /* JADX INFO: renamed from: f */
    public static C10538l m41237f(C12380l0 c12380l0, C10218d0 c10218d0) throws GeneralSecurityException {
        if (!c12380l0.m46396f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            C0223i c0223iM773g0 = C0223i.m773g0(c12380l0.m46397g(), C2944p.m14035b());
            if (c0223iM773g0.m778e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C10538l.m40408b().m40416e(C10550p.m40442b().m40449c(c0223iM773g0.m776c0().size()).m40448b(c0223iM773g0.m777d0().m834c0()).m40450d(16).m40451e(m41244m(c12380l0.m46395e())).m40447a()).m40415d(C5111c.m23853a(c0223iM773g0.m776c0().m13569x(), C10218d0.m39310b(c10218d0))).m40414c(c12380l0.m46393c()).m40412a();
        } catch (C2903b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    /* JADX INFO: renamed from: g */
    public static C10550p m41238g(C12382m0 c12382m0) throws GeneralSecurityException {
        if (c12382m0.m46404d().m763f0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                C0225j c0225jM787f0 = C0225j.m787f0(c12382m0.m46404d().m764g0(), C2944p.m14035b());
                return C10550p.m40442b().m40449c(c0225jM787f0.m790c0()).m40448b(c0225jM787f0.m791d0().m834c0()).m40450d(16).m40451e(m41244m(c12382m0.m46404d().m762e0())).m40447a();
            } catch (C2903b0 e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + c12382m0.m46404d().m763f0());
    }

    /* JADX INFO: renamed from: h */
    public static void m41239h() {
        m41240i(C12364d0.m46238c());
    }

    /* JADX INFO: renamed from: i */
    public static void m41240i(C12364d0 c12364d0) {
        c12364d0.m46248m(f38549b);
        c12364d0.m46247l(f38550c);
        c12364d0.m46246k(f38551d);
        c12364d0.m46245j(f38552e);
    }

    /* JADX INFO: renamed from: j */
    public static C12380l0 m41241j(C10538l c10538l, C10218d0 c10218d0) {
        return C12380l0.m46391b("type.googleapis.com/google.crypto.tink.AesEaxKey", C0223i.m772f0().m781D(m41236e(c10538l.m40411e())).m780C(AbstractC2920h.m13555e(c10538l.m40409c().m23856d(C10218d0.m39310b(c10218d0)))).build().mo13369b(), C0218f0.c.SYMMETRIC, m41243l(c10538l.m40411e().m40446f()), c10538l.mo7250a());
    }

    /* JADX INFO: renamed from: k */
    public static C12382m0 m41242k(C10550p c10550p) {
        return C12382m0.m46403c(C0222h0.m757h0().m767D("type.googleapis.com/google.crypto.tink.AesEaxKey").m768E(C0225j.m786e0().m793D(m41236e(c10550p)).m792C(c10550p.m40444d()).build().mo13369b()).m766C(m41243l(c10550p.m40446f())).build());
    }

    /* JADX INFO: renamed from: l */
    public static EnumC0238p0 m41243l(C10550p.c cVar) throws GeneralSecurityException {
        if (C10550p.c.f37848b.equals(cVar)) {
            return EnumC0238p0.TINK;
        }
        if (C10550p.c.f37849c.equals(cVar)) {
            return EnumC0238p0.CRUNCHY;
        }
        if (C10550p.c.f37850d.equals(cVar)) {
            return EnumC0238p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    /* JADX INFO: renamed from: m */
    public static C10550p.c m41244m(EnumC0238p0 enumC0238p0) throws GeneralSecurityException {
        int i10 = a.f38553a[enumC0238p0.ordinal()];
        if (i10 == 1) {
            return C10550p.c.f37848b;
        }
        if (i10 == 2 || i10 == 3) {
            return C10550p.c.f37849c;
        }
        if (i10 == 4) {
            return C10550p.c.f37850d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC0238p0.getNumber());
    }
}
