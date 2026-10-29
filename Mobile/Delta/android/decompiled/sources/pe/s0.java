package pe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f28525a;
    public static final ve.g0<n0, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f28526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<m0, ve.l0> f28527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f28528e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28529a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f28529a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28529a[ze.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f28525a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: pe.o0
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return s0.j((n0) xVar);
            }
        }, n0.class, ve.m0.class);
        f28526c = ve.f0.a(new ve.f0.b() { // from class: pe.p0
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return s0.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f28527d = ve.n.a(new ve.n.b() { // from class: pe.q0
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return s0.i((m0) lVar, d0Var);
            }
        }, m0.class, ve.l0.class);
        f28528e = ve.m.a(new ve.m.b() { // from class: pe.r0
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return s0.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static m0 e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            ze.l0 l0VarE0 = ze.l0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (l0VarE0.c0() == 0) {
                return m0.b(n0.b(l0VarE0.b0().c0(), l(l0Var.e())), l0Var.c());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + l0VarE0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    public static n0 f(ve.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return n0.b(ze.m0.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).c0(), l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(ve.d0.c());
    }

    public static void h(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f28526c);
        d0Var.k(f28527d);
        d0Var.j(f28528e);
    }

    public static ve.l0 i(m0 m0Var, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", ze.l0.d0().C(ze.m0.d0().C(m0Var.d().c()).build()).build().b(), ze.f0.c.REMOTE, k(m0Var.d().d()), m0Var.a());
    }

    public static ve.m0 j(n0 n0Var) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.KmsAeadKey").E(ze.m0.d0().C(n0Var.c()).build().b()).C(k(n0Var.d())).build());
    }

    public static ze.p0 k(n0.a aVar) throws GeneralSecurityException {
        if (n0.a.b.equals(aVar)) {
            return ze.p0.TINK;
        }
        if (n0.a.f28500c.equals(aVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static n0.a l(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f28529a[p0Var.ordinal()];
        if (i10 == 1) {
            return n0.a.b;
        }
        if (i10 == 2) {
            return n0.a.f28500c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
