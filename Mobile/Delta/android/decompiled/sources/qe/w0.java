package qe;

import java.security.GeneralSecurityException;
import pe.p1;
import pe.t1;
import ze.c1;
import ze.d1;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29356a;
    public static final ve.g0<t1, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<p1, ve.l0> f29358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29359e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29360a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29360a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29360a[ze.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29360a[ze.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29360a[ze.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f29356a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.s0
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return w0.j((t1) xVar);
            }
        }, t1.class, ve.m0.class);
        f29357c = ve.f0.a(new ve.f0.b() { // from class: qe.t0
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return w0.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29358d = ve.n.a(new ve.n.b() { // from class: qe.u0
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return w0.i((p1) lVar, d0Var);
            }
        }, p1.class, ve.l0.class);
        f29359e = ve.m.a(new ve.m.b() { // from class: qe.v0
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return w0.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static p1 e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            c1 c1VarE0 = c1.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (c1VarE0.c0() == 0) {
                return p1.b(l(l0Var.e()), df.c.a(c1VarE0.b0().x(), oe.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static t1 f(ve.m0 m0Var) throws GeneralSecurityException {
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
        h(ve.d0.c());
    }

    public static void h(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29357c);
        d0Var.k(f29358d);
        d0Var.j(f29359e);
    }

    public static ve.l0 i(p1 p1Var, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", c1.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(p1Var.c().d(oe.d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, k(p1Var.f().c()), p1Var.a());
    }

    public static ve.m0 j(t1 t1Var) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").E(d1.a0().b()).C(k(t1Var.c())).build());
    }

    public static ze.p0 k(t1.a aVar) throws GeneralSecurityException {
        if (t1.a.b.equals(aVar)) {
            return ze.p0.TINK;
        }
        if (t1.a.f28540c.equals(aVar)) {
            return ze.p0.CRUNCHY;
        }
        if (t1.a.f28541d.equals(aVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static t1.a l(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29360a[p0Var.ordinal()];
        if (i10 == 1) {
            return t1.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return t1.a.f28540c;
        }
        if (i10 == 4) {
            return t1.a.f28541d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
