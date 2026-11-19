package te;

import cf.a1;
import cf.b1;
import cf.z0;
import java.security.GeneralSecurityException;
import java.util.Objects;
import se.k1;
import se.o1;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32363a;
    public static final ye.g0<o1, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<k1, ye.l0> f32365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32366e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32367a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32367a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32367a[cf.p0.RAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f32363a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.m0
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return q0.j((o1) xVar);
            }
        }, o1.class, ye.m0.class);
        f32364c = ye.f0.a(new ye.f0.b() { // from class: te.n0
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return q0.f((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32365d = ye.n.a(new ye.n.b() { // from class: te.o0
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return q0.i((k1) lVar, d0Var);
            }
        }, k1.class, ye.l0.class);
        f32366e = ye.m.a(new ye.m.b() { // from class: te.p0
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return q0.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static k1 e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            z0 z0VarG0 = z0.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (z0VarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (z0VarG0.c0().size() == 32) {
                return k1.b(o1.b(l(l0Var.e()), z0VarG0.d0().c0()), gf.c.a(z0VarG0.c0().v(), re.d0.b(d0Var)), l0Var.c());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static o1 f(ye.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            a1 a1VarE0 = a1.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (a1VarE0.c0() == 0) {
                return o1.b(l(m0Var.d().e0()), a1VarE0.b0().c0());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(ye.d0.c());
    }

    public static void h(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32364c);
        d0Var.k(f32365d);
        d0Var.j(f32366e);
    }

    public static ye.l0 i(k1 k1Var, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.XAesGcmKey", z0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(k1Var.c().d(re.d0.b(d0Var)))).F(b1.d0().D(k1Var.f().c()).build()).build().b(), cf.f0.c.SYMMETRIC, k(k1Var.f().d()), k1Var.a());
    }

    public static ye.m0 j(o1 o1Var) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.XAesGcmKey").G(a1.d0().D(b1.d0().D(o1Var.c()).build()).build().b()).D(k(o1Var.d())).build());
    }

    public static cf.p0 k(o1.a aVar) throws GeneralSecurityException {
        if (Objects.equals(aVar, o1.a.b)) {
            return cf.p0.TINK;
        }
        if (Objects.equals(aVar, o1.a.f31385c)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + aVar);
    }

    public static o1.a l(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32367a[p0Var.ordinal()];
        if (i10 == 1) {
            return o1.a.b;
        }
        if (i10 == 2) {
            return o1.a.f31385c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
