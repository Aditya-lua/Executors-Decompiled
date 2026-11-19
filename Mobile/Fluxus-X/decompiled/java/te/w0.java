package te;

import cf.c1;
import cf.d1;
import java.security.GeneralSecurityException;
import se.p1;
import se.t1;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32381a;
    public static final ye.g0<t1, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<p1, ye.l0> f32383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32384e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32385a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32385a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32385a[cf.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32385a[cf.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32385a[cf.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f32381a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.s0
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return w0.j((t1) xVar);
            }
        }, t1.class, ye.m0.class);
        f32382c = ye.f0.a(new ye.f0.b() { // from class: te.t0
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return w0.f((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32383d = ye.n.a(new ye.n.b() { // from class: te.u0
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return w0.i((p1) lVar, d0Var);
            }
        }, p1.class, ye.l0.class);
        f32384e = ye.m.a(new ye.m.b() { // from class: te.v0
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return w0.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static p1 e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            c1 c1VarE0 = c1.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (c1VarE0.c0() == 0) {
                return p1.b(l(l0Var.e()), gf.c.a(c1VarE0.b0().v(), re.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static t1 f(ye.m0 m0Var) throws GeneralSecurityException {
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
        h(ye.d0.c());
    }

    public static void h(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32382c);
        d0Var.k(f32383d);
        d0Var.j(f32384e);
    }

    public static ye.l0 i(p1 p1Var, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", c1.d0().D(com.google.crypto.tink.shaded.protobuf.h.e(p1Var.c().d(re.d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, k(p1Var.f().c()), p1Var.a());
    }

    public static ye.m0 j(t1 t1Var) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").G(d1.a0().b()).D(k(t1Var.c())).build());
    }

    public static cf.p0 k(t1.a aVar) throws GeneralSecurityException {
        if (t1.a.b.equals(aVar)) {
            return cf.p0.TINK;
        }
        if (t1.a.f31419c.equals(aVar)) {
            return cf.p0.CRUNCHY;
        }
        if (t1.a.f31420d.equals(aVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static t1.a l(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32385a[p0Var.ordinal()];
        if (i10 == 1) {
            return t1.a.b;
        }
        if (i10 == 2 || i10 == 3) {
            return t1.a.f31419c;
        }
        if (i10 == 4) {
            return t1.a.f31420d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
