package re;

import af.a1;
import af.b1;
import af.z0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import qe.k1;
import qe.o1;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30289a;
    public static final we.g0<o1, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<k1, we.l0> f30291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30292e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30293a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30293a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30293a[af.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f30289a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.m0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return q0.j((o1) xVar);
            }
        }, o1.class, we.m0.class);
        f30290c = we.f0.a(new we.f0.b() { // from class: re.n0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return q0.f((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30291d = we.n.a(new we.n.b() { // from class: re.o0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return q0.i((k1) lVar, d0Var);
            }
        }, k1.class, we.l0.class);
        f30292e = we.m.a(new we.m.b() { // from class: re.p0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return q0.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static k1 e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            z0 z0VarG0 = z0.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (z0VarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (z0VarG0.c0().size() == 32) {
                return k1.b(o1.b(l(l0Var.e()), z0VarG0.d0().c0()), ef.c.a(z0VarG0.c0().x(), pe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static o1 f(we.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            a1 a1VarE0 = a1.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (a1VarE0.c0() == 0) {
                return o1.b(l(m0Var.d().e0()), a1VarE0.b0().c0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30290c);
        d0Var.k(f30291d);
        d0Var.j(f30292e);
    }

    public static we.l0 i(k1 k1Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", z0.f0().C(com.google.crypto.tink.shaded.protobuf.h.e(k1Var.c().d(pe.d0.b(d0Var)))).D(b1.d0().C(k1Var.f().c()).build()).build().b(), af.f0.c.SYMMETRIC, k(k1Var.f().d()), k1Var.a());
    }

    public static we.m0 j(o1 o1Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.XAesGcmKey").E(a1.d0().C(b1.d0().C(o1Var.c()).build()).build().b()).C(k(o1Var.d())).build());
    }

    public static af.p0 k(o1.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, o1.a.b)) {
            return af.p0.TINK;
        }
        if (Objects.equals(aVar, o1.a.f29754c)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static o1.a l(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30293a[p0Var.ordinal()];
        if (i10 == 1) {
            return o1.a.b;
        }
        if (i10 == 2) {
            return o1.a.f29754c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
