package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f29827a;
    public static final we.g0<u0, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f29828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<t0, we.l0> f29829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f29830e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29831a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f29831a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29831a[af.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f29827a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: qe.v0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return z0.k((u0) xVar);
            }
        }, u0.class, we.m0.class);
        f29828c = we.f0.a(new we.f0.b() { // from class: qe.w0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return z0.g((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f29829d = we.n.a(new we.n.b() { // from class: qe.x0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return z0.j((t0) lVar, d0Var);
            }
        }, t0.class, we.l0.class);
        f29830e = we.m.a(new we.m.b() { // from class: qe.y0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return z0.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static t0 e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            af.n0 n0VarE0 = af.n0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (n0VarE0.c0() == 0) {
                return t0.b(f(n0VarE0.b0(), l0Var.e()), l0Var.c());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + n0VarE0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    public static u0 f(af.o0 o0Var, af.p0 p0Var) throws GeneralSecurityException {
        u0.c cVar;
        pe.x xVarA = pe.h0.a(af.h0.h0().D(o0Var.d0().f0()).E(o0Var.d0().g0()).C(af.p0.RAW).build().n());
        if (xVarA instanceof u) {
            cVar = u0.c.b;
        } else if (xVarA instanceof e0) {
            cVar = u0.c.f29807d;
        } else if (xVarA instanceof t1) {
            cVar = u0.c.f29806c;
        } else if (xVarA instanceof k) {
            cVar = u0.c.f29808e;
        } else if (xVarA instanceof p) {
            cVar = u0.c.f29809f;
        } else {
            if (!(xVarA instanceof z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + xVarA);
            }
            cVar = u0.c.f29810g;
        }
        return u0.b().f(n(p0Var)).e(o0Var.e0()).c((c) xVarA).d(cVar).a();
    }

    public static u0 g(we.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(af.o0.g0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()), m0Var.d().e0());
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29828c);
        d0Var.k(f29829d);
        d0Var.j(f29830e);
    }

    public static we.l0 j(t0 t0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", af.n0.d0().C(l(t0Var.d())).build().b(), af.f0.c.REMOTE, m(t0Var.d().e()), t0Var.a());
    }

    public static we.m0 k(u0 u0Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").E(l(u0Var).b()).C(m(u0Var.e())).build());
    }

    public static af.o0 l(u0 u0Var) throws GeneralSecurityException {
        try {
            return af.o0.f0().D(u0Var.d()).C(af.h0.j0(pe.h0.b(u0Var.c()), com.google.crypto.tink.shaded.protobuf.p.b())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static af.p0 m(u0.d dVar) throws GeneralSecurityException {
        if (u0.d.b.equals(dVar)) {
            return af.p0.TINK;
        }
        if (u0.d.f29812c.equals(dVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static u0.d n(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29831a[p0Var.ordinal()];
        if (i10 == 1) {
            return u0.d.b;
        }
        if (i10 == 2) {
            return u0.d.f29812c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
