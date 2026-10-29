package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29308a;
    public static final ve.g0<pe.e0, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<pe.a0, ve.l0> f29310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29311e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29312a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29312a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29312a[ze.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29312a[ze.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29312a[ze.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f29308a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.w
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return a0.j((pe.e0) xVar);
            }
        }, pe.e0.class, ve.m0.class);
        f29309c = ve.f0.a(new ve.f0.b() { // from class: qe.x
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return a0.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29310d = ve.n.a(new ve.n.b() { // from class: qe.y
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return a0.i((pe.a0) lVar, d0Var);
            }
        }, pe.a0.class, ve.l0.class);
        f29311e = ve.m.a(new ve.m.b() { // from class: qe.z
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return a0.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static pe.a0 e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            ze.p pVarE0 = ze.p.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (pVarE0.c0() == 0) {
                return pe.a0.b(l(l0Var.e()), df.c.a(pVarE0.b0().x(), oe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static pe.e0 f(ve.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                ze.q.b0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return pe.e0.b(l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(ve.d0.c());
    }

    public static void h(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29309c);
        d0Var.k(f29310d);
        d0Var.j(f29311e);
    }

    public static ve.l0 i(pe.a0 a0Var, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ze.p.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(a0Var.c().d(oe.d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, k(a0Var.f().c()), a0Var.a());
    }

    public static ve.m0 j(pe.e0 e0Var) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").E(ze.q.a0().b()).C(k(e0Var.c())).build());
    }

    public static ze.p0 k(pe.e0.a aVar) throws GeneralSecurityException {
        if (pe.e0.a.b.equals(aVar)) {
            return ze.p0.TINK;
        }
        if (pe.e0.a.f28438c.equals(aVar)) {
            return ze.p0.CRUNCHY;
        }
        if (pe.e0.a.f28439d.equals(aVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static pe.e0.a l(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29312a[p0Var.ordinal()];
        if (i10 == 1) {
            return pe.e0.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return pe.e0.a.f28438c;
        }
        if (i10 == 4) {
            return pe.e0.a.f28439d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
