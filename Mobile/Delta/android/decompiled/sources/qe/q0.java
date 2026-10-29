package qe;

import java.security.GeneralSecurityException;
import java.util.Objects;
import pe.k1;
import pe.o1;
import ze.a1;
import ze.b1;
import ze.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29338a;
    public static final ve.g0<o1, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<k1, ve.l0> f29340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29341e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29342a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29342a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29342a[ze.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f29338a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.m0
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return q0.j((o1) xVar);
            }
        }, o1.class, ve.m0.class);
        f29339c = ve.f0.a(new ve.f0.b() { // from class: qe.n0
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return q0.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29340d = ve.n.a(new ve.n.b() { // from class: qe.o0
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return q0.i((k1) lVar, d0Var);
            }
        }, k1.class, ve.l0.class);
        f29341e = ve.m.a(new ve.m.b() { // from class: qe.p0
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return q0.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static k1 e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            z0 z0VarG0 = z0.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (z0VarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (z0VarG0.c0().size() == 32) {
                return k1.b(o1.b(l(l0Var.e()), z0VarG0.d0().c0()), df.c.a(z0VarG0.c0().x(), oe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static o1 f(ve.m0 m0Var) throws GeneralSecurityException {
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
        h(ve.d0.c());
    }

    public static void h(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29339c);
        d0Var.k(f29340d);
        d0Var.j(f29341e);
    }

    public static ve.l0 i(k1 k1Var, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", z0.f0().C(com.google.crypto.tink.shaded.protobuf.h.e(k1Var.c().d(oe.d0.b(d0Var)))).D(b1.d0().C(k1Var.f().c()).build()).build().b(), ze.f0.c.SYMMETRIC, k(k1Var.f().d()), k1Var.a());
    }

    public static ve.m0 j(o1 o1Var) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.XAesGcmKey").E(a1.d0().C(b1.d0().C(o1Var.c()).build()).build().b()).C(k(o1Var.d())).build());
    }

    public static ze.p0 k(o1.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, o1.a.b)) {
            return ze.p0.TINK;
        }
        if (Objects.equals(aVar, o1.a.f28506c)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static o1.a l(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29342a[p0Var.ordinal()];
        if (i10 == 1) {
            return o1.a.b;
        }
        if (i10 == 2) {
            return o1.a.f28506c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
