package se;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f31404a;
    public static final ye.g0<n0, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f31405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<m0, ye.l0> f31406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f31407e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31408a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f31408a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31408a[cf.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f31404a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: se.o0
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return s0.j((n0) xVar);
            }
        }, n0.class, ye.m0.class);
        f31405c = ye.f0.a(new ye.f0.b() { // from class: se.p0
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return s0.f((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f31406d = ye.n.a(new ye.n.b() { // from class: se.q0
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return s0.i((m0) lVar, d0Var);
            }
        }, m0.class, ye.l0.class);
        f31407e = ye.m.a(new ye.m.b() { // from class: se.r0
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return s0.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static m0 e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            cf.l0 l0VarE0 = cf.l0.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (l0VarE0.c0() == 0) {
                return m0.b(n0.b(l0VarE0.b0().c0(), l(l0Var.e())), l0Var.c());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + l0VarE0);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
        }
    }

    public static n0 f(ye.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return n0.b(cf.m0.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).c0(), l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(ye.d0.c());
    }

    public static void h(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f31405c);
        d0Var.k(f31406d);
        d0Var.j(f31407e);
    }

    public static ye.l0 i(m0 m0Var, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.KmsAeadKey", cf.l0.d0().D(cf.m0.d0().D(m0Var.d().c()).build()).build().b(), cf.f0.c.REMOTE, k(m0Var.d().d()), m0Var.a());
    }

    public static ye.m0 j(n0 n0Var) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.KmsAeadKey").G(cf.m0.d0().D(n0Var.c()).build().b()).D(k(n0Var.d())).build());
    }

    public static cf.p0 k(n0.a aVar) throws GeneralSecurityException {
        if (n0.a.b.equals(aVar)) {
            return cf.p0.TINK;
        }
        if (n0.a.f31379c.equals(aVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static n0.a l(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f31408a[p0Var.ordinal()];
        if (i10 == 1) {
            return n0.a.b;
        }
        if (i10 == 2) {
            return n0.a.f31379c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
