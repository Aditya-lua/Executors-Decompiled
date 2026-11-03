package re;

import af.c1;
import af.d1;
import java.security.GeneralSecurityException;
import qe.p1;
import qe.t1;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30307a;
    public static final we.g0<t1, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<p1, we.l0> f30309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30310e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30311a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30311a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30311a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30311a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30311a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f30307a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.s0
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return w0.j((t1) xVar);
            }
        }, t1.class, we.m0.class);
        f30308c = we.f0.a(new we.f0.b() { // from class: re.t0
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return w0.f((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30309d = we.n.a(new we.n.b() { // from class: re.u0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return w0.i((p1) lVar, d0Var);
            }
        }, p1.class, we.l0.class);
        f30310e = we.m.a(new we.m.b() { // from class: re.v0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return w0.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static p1 e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            c1 c1VarE0 = c1.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (c1VarE0.c0() == 0) {
                return p1.b(l(l0Var.e()), ef.c.a(c1VarE0.b0().x(), pe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static t1 f(we.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            if (d1.c0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).b0() == 0) {
                return t1.b(l(m0Var.d().e0()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30308c);
        d0Var.k(f30309d);
        d0Var.j(f30310e);
    }

    public static we.l0 i(p1 p1Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", c1.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(p1Var.c().d(pe.d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, k(p1Var.f().c()), p1Var.a());
    }

    public static we.m0 j(t1 t1Var) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").E(d1.a0().b()).C(k(t1Var.c())).build());
    }

    public static af.p0 k(t1.a aVar) throws GeneralSecurityException {
        if (t1.a.b.equals(aVar)) {
            return af.p0.TINK;
        }
        if (t1.a.f29788c.equals(aVar)) {
            return af.p0.CRUNCHY;
        }
        if (t1.a.f29789d.equals(aVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static t1.a l(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30311a[p0Var.ordinal()];
        if (i10 == 1) {
            return t1.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return t1.a.f29788c;
        }
        if (i10 == 4) {
            return t1.a.f29789d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
