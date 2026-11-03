package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f29773a;
    public static final we.g0<n0, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f29774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<m0, we.l0> f29775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f29776e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29777a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f29777a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29777a[af.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f29773a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: qe.o0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return s0.j((n0) xVar);
            }
        }, n0.class, we.m0.class);
        f29774c = we.f0.a(new we.f0.b() { // from class: qe.p0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return s0.f((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f29775d = we.n.a(new we.n.b() { // from class: qe.q0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return s0.i((m0) lVar, d0Var);
            }
        }, m0.class, we.l0.class);
        f29776e = we.m.a(new we.m.b() { // from class: qe.r0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return s0.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static m0 e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            af.l0 l0VarE0 = af.l0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (l0VarE0.c0() == 0) {
                return m0.b(n0.b(l0VarE0.b0().c0(), l(l0Var.e())), l0Var.c());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + l0VarE0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    public static n0 f(we.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return n0.b(af.m0.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).c0(), l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29774c);
        d0Var.k(f29775d);
        d0Var.j(f29776e);
    }

    public static we.l0 i(m0 m0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", af.l0.d0().C(af.m0.d0().C(m0Var.d().c()).build()).build().b(), af.f0.c.REMOTE, k(m0Var.d().d()), m0Var.a());
    }

    public static we.m0 j(n0 n0Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.KmsAeadKey").E(af.m0.d0().C(n0Var.c()).build().b()).C(k(n0Var.d())).build());
    }

    public static af.p0 k(n0.a aVar) throws GeneralSecurityException {
        if (n0.a.b.equals(aVar)) {
            return af.p0.TINK;
        }
        if (n0.a.f29748c.equals(aVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static n0.a l(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29777a[p0Var.ordinal()];
        if (i10 == 1) {
            return n0.a.b;
        }
        if (i10 == 2) {
            return n0.a.f29748c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
