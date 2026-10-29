package bf;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import ve.l0;
import ve.m0;
import ve.s0;
import ze.h0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f4124a;
    public static final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.g0<af.a, m0> f4125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.f0<m0> f4126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.n<af.c, l0> f4127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ve.m<l0> f4128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.n<af.b, l0> f4129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.m<l0> f4130h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4131a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f4133d;

        static {
            int[] iArr = new int[ze.v.values().length];
            f4133d = iArr;
            try {
                iArr[ze.v.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4133d[ze.v.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ze.z.values().length];
            f4132c = iArr2;
            try {
                iArr2[ze.z.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4132c[ze.z.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4132c[ze.z.NIST_P521.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[p0.values().length];
            b = iArr3;
            try {
                iArr3[p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[ze.b0.values().length];
            f4131a = iArr4;
            try {
                iArr4[ze.b0.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4131a[ze.b0.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4131a[ze.b0.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        df.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f4124a = aVarH;
        df.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        b = aVarH2;
        f4125c = ve.g0.a(new ve.g0.b() { // from class: bf.a
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return g.o((af.a) xVar);
            }
        }, af.a.class, m0.class);
        f4126d = ve.f0.a(new ve.f0.b() { // from class: bf.b
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return g.j((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4127e = ve.n.a(new ve.n.b() { // from class: bf.c
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return g.q((af.c) lVar, d0Var);
            }
        }, af.c.class, l0.class);
        f4128f = ve.m.a(new ve.m.b() { // from class: bf.d
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return g.l((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f4129g = ve.n.a(new ve.n.b() { // from class: bf.e
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return g.p((af.b) lVar, d0Var);
            }
        }, af.b.class, l0.class);
        f4130h = ve.m.a(new ve.m.b() { // from class: bf.f
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return g.k((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static int g(af.a.c cVar) throws GeneralSecurityException {
        if (af.a.c.f377c.equals(cVar)) {
            return 33;
        }
        if (af.a.c.f378d.equals(cVar)) {
            return 49;
        }
        if (af.a.c.f379e.equals(cVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static ze.s h(af.a aVar) {
        return ze.s.h0().E(u(aVar.d())).C(t(aVar.c())).D(w(aVar.e())).build();
    }

    public static ze.u i(af.c cVar) throws GeneralSecurityException {
        int iG = g(cVar.d().c());
        ECPoint eCPointE = cVar.e();
        return ze.u.i0().C(h(cVar.d())).D(com.google.crypto.tink.shaded.protobuf.h.e(ve.a.c(eCPointE.getAffineX(), iG))).E(com.google.crypto.tink.shaded.protobuf.h.e(ve.a.c(eCPointE.getAffineY(), iG))).build();
    }

    public static af.a j(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            try {
                ze.r rVarD0 = ze.r.d0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return af.a.b().c(s(rVarD0.b0().g0())).d(x(rVarD0.b0().f0())).b(r(rVarD0.b0().d0())).e(y(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static af.b k(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            ze.t tVarG0 = ze.t.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (tVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ze.u uVarD0 = tVarG0.d0();
            if (uVarD0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return af.b.d().c(af.c.c().d(af.a.b().c(s(uVarD0.e0().g0())).d(x(uVarD0.e0().f0())).b(r(uVarD0.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(ve.a.a(uVarD0.g0().x()), ve.a.a(uVarD0.h0().x()))).c(l0Var.c()).a()).b(df.b.a(ve.a.a(tVarG0.c0().x()), oe.d0.b(d0Var))).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static af.c l(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            ze.u uVarJ0 = ze.u.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (uVarJ0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return af.c.c().d(af.a.b().c(s(uVarJ0.e0().g0())).d(x(uVarJ0.e0().f0())).b(r(uVarJ0.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(ve.a.a(uVarJ0.g0().x()), ve.a.a(uVarJ0.h0().x()))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static void m() {
        n(ve.d0.c());
    }

    public static void n(ve.d0 d0Var) {
        d0Var.m(f4125c);
        d0Var.l(f4126d);
        d0Var.k(f4127e);
        d0Var.j(f4128f);
        d0Var.k(f4129g);
        d0Var.j(f4130h);
    }

    public static m0 o(af.a aVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").E(ze.r.c0().C(h(aVar)).build().b()).C(v(aVar.f())).build());
    }

    public static l0 p(af.b bVar, oe.d0 d0Var) throws GeneralSecurityException {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ze.t.f0().D(i(bVar.c())).C(com.google.crypto.tink.shaded.protobuf.h.e(ve.a.c(bVar.f().b(oe.d0.b(d0Var)), g(bVar.e().c())))).build().b(), ze.f0.c.ASYMMETRIC_PRIVATE, v(bVar.e().f()), bVar.a());
    }

    public static l0 q(af.c cVar, oe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", i(cVar).b(), ze.f0.c.ASYMMETRIC_PUBLIC, v(cVar.d().f()), cVar.a());
    }

    public static af.a.c r(ze.z zVar) throws GeneralSecurityException {
        int i10 = a.f4132c[zVar.ordinal()];
        if (i10 == 1) {
            return af.a.c.f377c;
        }
        if (i10 == 2) {
            return af.a.c.f378d;
        }
        if (i10 == 3) {
            return af.a.c.f379e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + zVar.getNumber());
    }

    public static af.a.d s(ze.b0 b0Var) throws GeneralSecurityException {
        int i10 = a.f4131a[b0Var.ordinal()];
        if (i10 == 1) {
            return af.a.d.b;
        }
        if (i10 == 2) {
            return af.a.d.f381c;
        }
        if (i10 == 3) {
            return af.a.d.f382d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static ze.z t(af.a.c cVar) throws GeneralSecurityException {
        if (af.a.c.f377c.equals(cVar)) {
            return ze.z.NIST_P256;
        }
        if (af.a.c.f378d.equals(cVar)) {
            return ze.z.NIST_P384;
        }
        if (af.a.c.f379e.equals(cVar)) {
            return ze.z.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static ze.b0 u(af.a.d dVar) throws GeneralSecurityException {
        if (af.a.d.b.equals(dVar)) {
            return ze.b0.SHA256;
        }
        if (af.a.d.f381c.equals(dVar)) {
            return ze.b0.SHA384;
        }
        if (af.a.d.f382d.equals(dVar)) {
            return ze.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + dVar);
    }

    public static p0 v(af.a.f fVar) throws GeneralSecurityException {
        if (af.a.f.b.equals(fVar)) {
            return p0.TINK;
        }
        if (af.a.f.f386c.equals(fVar)) {
            return p0.CRUNCHY;
        }
        if (af.a.f.f388e.equals(fVar)) {
            return p0.RAW;
        }
        if (af.a.f.f387d.equals(fVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + fVar);
    }

    public static ze.v w(af.a.e eVar) throws GeneralSecurityException {
        if (af.a.e.b.equals(eVar)) {
            return ze.v.IEEE_P1363;
        }
        if (af.a.e.f384c.equals(eVar)) {
            return ze.v.DER;
        }
        throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + eVar);
    }

    public static af.a.e x(ze.v vVar) throws GeneralSecurityException {
        int i10 = a.f4133d[vVar.ordinal()];
        if (i10 == 1) {
            return af.a.e.b;
        }
        if (i10 == 2) {
            return af.a.e.f384c;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + vVar.getNumber());
    }

    public static af.a.f y(p0 p0Var) throws GeneralSecurityException {
        int i10 = a.b[p0Var.ordinal()];
        if (i10 == 1) {
            return af.a.f.b;
        }
        if (i10 == 2) {
            return af.a.f.f386c;
        }
        if (i10 == 3) {
            return af.a.f.f387d;
        }
        if (i10 == 4) {
            return af.a.f.f388e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
