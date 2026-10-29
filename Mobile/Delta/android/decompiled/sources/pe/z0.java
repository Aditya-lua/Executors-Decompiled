package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f28579a;
    public static final ve.g0<u0, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f28580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<t0, ve.l0> f28581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f28582e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28583a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f28583a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28583a[ze.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f28579a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: pe.v0
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return z0.k((u0) xVar);
            }
        }, u0.class, ve.m0.class);
        f28580c = ve.f0.a(new ve.f0.b() { // from class: pe.w0
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return z0.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f28581d = ve.n.a(new ve.n.b() { // from class: pe.x0
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return z0.j((t0) lVar, d0Var);
            }
        }, t0.class, ve.l0.class);
        f28582e = ve.m.a(new ve.m.b() { // from class: pe.y0
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return z0.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static t0 e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            ze.n0 n0VarE0 = ze.n0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (n0VarE0.c0() == 0) {
                return t0.b(g(n0VarE0.b0(), l0Var.e()), l0Var.c());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + n0VarE0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    public static u0 f(ve.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return g(ze.o0.g0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()), m0Var.d().e0());
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static u0 g(ze.o0 o0Var, ze.p0 p0Var) throws GeneralSecurityException {
        u0.c cVar;
        oe.x xVarA = oe.h0.a(ze.h0.h0().D(o0Var.d0().f0()).E(o0Var.d0().g0()).C(ze.p0.RAW).build().n());
        if (xVarA instanceof u) {
            cVar = u0.c.b;
        } else if (xVarA instanceof e0) {
            cVar = u0.c.f28559d;
        } else if (xVarA instanceof t1) {
            cVar = u0.c.f28558c;
        } else if (xVarA instanceof k) {
            cVar = u0.c.f28560e;
        } else if (xVarA instanceof p) {
            cVar = u0.c.f28561f;
        } else {
            if (!(xVarA instanceof z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + xVarA);
            }
            cVar = u0.c.f28562g;
        }
        return u0.b().f(n(p0Var)).e(o0Var.e0()).c((c) xVarA).d(cVar).a();
    }

    public static void h() {
        i(ve.d0.c());
    }

    public static void i(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f28580c);
        d0Var.k(f28581d);
        d0Var.j(f28582e);
    }

    public static ve.l0 j(t0 t0Var, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ze.n0.d0().C(l(t0Var.d())).build().b(), ze.f0.c.REMOTE, m(t0Var.d().e()), t0Var.a());
    }

    public static ve.m0 k(u0 u0Var) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").E(l(u0Var).b()).C(m(u0Var.e())).build());
    }

    public static ze.o0 l(u0 u0Var) throws GeneralSecurityException {
        try {
            return ze.o0.f0().D(u0Var.d()).C(ze.h0.j0(oe.h0.b(u0Var.c()), com.google.crypto.tink.shaded.protobuf.p.b())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static ze.p0 m(u0.d dVar) throws GeneralSecurityException {
        if (u0.d.b.equals(dVar)) {
            return ze.p0.TINK;
        }
        if (u0.d.f28564c.equals(dVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static u0.d n(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f28583a[p0Var.ordinal()];
        if (i10 == 1) {
            return u0.d.b;
        }
        if (i10 == 2) {
            return u0.d.f28564c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
