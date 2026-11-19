package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f31458a;
    public static final ye.g0<u0, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f31459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<t0, ye.l0> f31460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f31461e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31462a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f31462a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31462a[cf.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f31458a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: se.v0
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return z0.k((u0) xVar);
            }
        }, u0.class, ye.m0.class);
        f31459c = ye.f0.a(new ye.f0.b() { // from class: se.w0
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return z0.g((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f31460d = ye.n.a(new ye.n.b() { // from class: se.x0
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return z0.j((t0) lVar, d0Var);
            }
        }, t0.class, ye.l0.class);
        f31461e = ye.m.a(new ye.m.b() { // from class: se.y0
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return z0.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static t0 e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            cf.n0 n0VarE0 = cf.n0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (n0VarE0.c0() == 0) {
                return t0.b(f(n0VarE0.b0(), l0Var.e()), l0Var.c());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + n0VarE0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
        }
    }

    public static u0 f(cf.o0 o0Var, cf.p0 p0Var) throws GeneralSecurityException {
        u0.c cVar;
        re.x xVarA = re.h0.a(cf.h0.h0().F(o0Var.d0().f0()).G(o0Var.d0().g0()).D(cf.p0.RAW).build().n());
        if (xVarA instanceof u) {
            cVar = u0.c.b;
        } else if (xVarA instanceof e0) {
            cVar = u0.c.f31438d;
        } else if (xVarA instanceof t1) {
            cVar = u0.c.f31437c;
        } else if (xVarA instanceof k) {
            cVar = u0.c.f31439e;
        } else if (xVarA instanceof p) {
            cVar = u0.c.f31440f;
        } else {
            if (!(xVarA instanceof z)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + xVarA);
            }
            cVar = u0.c.f31441g;
        }
        return u0.b().f(n(p0Var)).e(o0Var.e0()).c((c) xVarA).d(cVar).a();
    }

    public static u0 g(ye.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return f(cf.o0.g0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()), m0Var.d().e0());
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(ye.d0.c());
    }

    public static void i(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f31459c);
        d0Var.k(f31460d);
        d0Var.j(f31461e);
    }

    public static ye.l0 j(t0 t0Var, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", cf.n0.d0().D(l(t0Var.d())).build().b(), cf.f0.c.REMOTE, m(t0Var.d().e()), t0Var.a());
    }

    public static ye.m0 k(u0 u0Var) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").G(l(u0Var).b()).D(m(u0Var.e())).build());
    }

    public static cf.o0 l(u0 u0Var) throws GeneralSecurityException {
        try {
            return cf.o0.f0().F(u0Var.d()).D(cf.h0.j0(re.h0.b(u0Var.c()), com.google.crypto.tink.shaded.protobuf.p.b())).build();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static cf.p0 m(u0.d dVar) throws GeneralSecurityException {
        if (u0.d.b.equals(dVar)) {
            return cf.p0.TINK;
        }
        if (u0.d.f31443c.equals(dVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static u0.d n(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f31462a[p0Var.ordinal()];
        if (i10 == 1) {
            return u0.d.b;
        }
        if (i10 == 2) {
            return u0.d.f31443c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
