package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29345a;
    public static final ve.g0<pe.z, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<pe.v, ve.l0> f29347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29348e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29349a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29349a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29349a[ze.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29349a[ze.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29349a[ze.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f29345a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.q
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return u.j((pe.z) xVar);
            }
        }, pe.z.class, ve.m0.class);
        f29346c = ve.f0.a(new ve.f0.b() { // from class: qe.r
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return u.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29347d = ve.n.a(new ve.n.b() { // from class: qe.s
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return u.i((pe.v) lVar, d0Var);
            }
        }, pe.v.class, ve.l0.class);
        f29348e = ve.m.a(new ve.m.b() { // from class: qe.t
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return u.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static pe.v e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            ze.n nVarE0 = ze.n.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (nVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return pe.v.b().e(pe.z.b().b(nVarE0.b0().size()).c(l(l0Var.e())).a()).d(df.c.a(nVarE0.b0().x(), oe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static pe.z f(ve.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            ze.o oVarE0 = ze.o.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (oVarE0.c0() == 0) {
                return pe.z.b().b(oVarE0.b0()).c(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static void g() {
        h(ve.d0.c());
    }

    public static void h(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29346c);
        d0Var.k(f29347d);
        d0Var.j(f29348e);
    }

    public static ve.l0 i(pe.v vVar, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ze.n.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(vVar.c().d(oe.d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, k(vVar.e().d()), vVar.a());
    }

    public static ve.m0 j(pe.z zVar) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.AesGcmSivKey").E(ze.o.d0().C(zVar.c()).build().b()).C(k(zVar.d())).build());
    }

    public static ze.p0 k(pe.z.c cVar) throws GeneralSecurityException {
        if (pe.z.c.b.equals(cVar)) {
            return ze.p0.TINK;
        }
        if (pe.z.c.f28576c.equals(cVar)) {
            return ze.p0.CRUNCHY;
        }
        if (pe.z.c.f28577d.equals(cVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static pe.z.c l(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29349a[p0Var.ordinal()];
        if (i10 == 1) {
            return pe.z.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return pe.z.c.f28576c;
        }
        if (i10 == 4) {
            return pe.z.c.f28577d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
