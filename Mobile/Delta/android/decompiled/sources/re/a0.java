package re;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30259a;
    public static final we.g0<qe.e0, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<qe.a0, we.l0> f30261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30262e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30263a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30263a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30263a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30263a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30263a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f30259a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.w
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return a0.j((qe.e0) xVar);
            }
        }, qe.e0.class, we.m0.class);
        f30260c = we.f0.a(new we.f0.b() { // from class: re.x
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return a0.f((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30261d = we.n.a(new we.n.b() { // from class: re.y
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return a0.i((qe.a0) lVar, d0Var);
            }
        }, qe.a0.class, we.l0.class);
        f30262e = we.m.a(new we.m.b() { // from class: re.z
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return a0.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static qe.a0 e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            af.p pVarE0 = af.p.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (pVarE0.c0() == 0) {
                return qe.a0.b(l(l0Var.e()), ef.c.a(pVarE0.b0().x(), pe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static qe.e0 f(we.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                af.q.b0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return qe.e0.b(l(m0Var.d().e0()));
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30260c);
        d0Var.k(f30261d);
        d0Var.j(f30262e);
    }

    public static we.l0 i(qe.a0 a0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", af.p.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(a0Var.c().d(pe.d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, k(a0Var.f().c()), a0Var.a());
    }

    public static we.m0 j(qe.e0 e0Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").E(af.q.a0().b()).C(k(e0Var.c())).build());
    }

    public static af.p0 k(qe.e0.a aVar) throws GeneralSecurityException {
        if (qe.e0.a.b.equals(aVar)) {
            return af.p0.TINK;
        }
        if (qe.e0.a.f29686c.equals(aVar)) {
            return af.p0.CRUNCHY;
        }
        if (qe.e0.a.f29687d.equals(aVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static qe.e0.a l(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30263a[p0Var.ordinal()];
        if (i10 == 1) {
            return qe.e0.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return qe.e0.a.f29686c;
        }
        if (i10 == 4) {
            return qe.e0.a.f29687d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
