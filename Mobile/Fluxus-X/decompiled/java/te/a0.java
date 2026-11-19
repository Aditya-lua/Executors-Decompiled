package te;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32333a;
    public static final ye.g0<se.e0, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<se.a0, ye.l0> f32335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32336e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32337a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32337a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32337a[cf.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32337a[cf.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32337a[cf.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f32333a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.w
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return a0.j((se.e0) xVar);
            }
        }, se.e0.class, ye.m0.class);
        f32334c = ye.f0.a(new ye.f0.b() { // from class: te.x
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return a0.f((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32335d = ye.n.a(new ye.n.b() { // from class: te.y
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return a0.i((se.a0) lVar, d0Var);
            }
        }, se.a0.class, ye.l0.class);
        f32336e = ye.m.a(new ye.m.b() { // from class: te.z
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return a0.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static se.a0 e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            cf.p pVarE0 = cf.p.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (pVarE0.c0() == 0) {
                return se.a0.b(l(l0Var.e()), gf.c.a(pVarE0.b0().v(), re.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static se.e0 f(ye.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                cf.q.b0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return se.e0.b(l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(ye.d0.c());
    }

    public static void h(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32334c);
        d0Var.k(f32335d);
        d0Var.j(f32336e);
    }

    public static ye.l0 i(se.a0 a0Var, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", cf.p.d0().D(com.google.crypto.tink.shaded.protobuf.h.e(a0Var.c().d(re.d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, k(a0Var.f().c()), a0Var.a());
    }

    public static ye.m0 j(se.e0 e0Var) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").G(cf.q.a0().b()).D(k(e0Var.c())).build());
    }

    public static cf.p0 k(se.e0.a aVar) throws GeneralSecurityException {
        if (se.e0.a.b.equals(aVar)) {
            return cf.p0.TINK;
        }
        if (se.e0.a.f31317c.equals(aVar)) {
            return cf.p0.CRUNCHY;
        }
        if (se.e0.a.f31318d.equals(aVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static se.e0.a l(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32337a[p0Var.ordinal()];
        if (i10 == 1) {
            return se.e0.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return se.e0.a.f31317c;
        }
        if (i10 == 4) {
            return se.e0.a.f31318d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
