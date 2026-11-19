package ef;

import cf.h0;
import cf.p0;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import ye.l0;
import ye.m0;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f13398a;
    public static final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.g0<df.a, m0> f13399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.f0<m0> f13400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.n<df.c, l0> f13401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ye.m<l0> f13402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ye.n<df.b, l0> f13403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ye.m<l0> f13404h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13405a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f13406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f13407d;

        static {
            int[] iArr = new int[cf.v.values().length];
            f13407d = iArr;
            try {
                iArr[cf.v.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13407d[cf.v.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[cf.z.values().length];
            f13406c = iArr2;
            try {
                iArr2[cf.z.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13406c[cf.z.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13406c[cf.z.NIST_P521.ordinal()] = 3;
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
            int[] iArr4 = new int[cf.b0.values().length];
            f13405a = iArr4;
            try {
                iArr4[cf.b0.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13405a[cf.b0.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13405a[cf.b0.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        gf.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f13398a = aVarH;
        gf.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        b = aVarH2;
        f13399c = ye.g0.a(new ye.g0.b() { // from class: ef.a
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return g.o((df.a) xVar);
            }
        }, df.a.class, m0.class);
        f13400d = ye.f0.a(new ye.f0.b() { // from class: ef.b
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return g.j((m0) p0Var);
            }
        }, aVarH, m0.class);
        f13401e = ye.n.a(new ye.n.b() { // from class: ef.c
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return g.q((df.c) lVar, d0Var);
            }
        }, df.c.class, l0.class);
        f13402f = ye.m.a(new ye.m.b() { // from class: ef.d
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return g.l((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f13403g = ye.n.a(new ye.n.b() { // from class: ef.e
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return g.p((df.b) lVar, d0Var);
            }
        }, df.b.class, l0.class);
        f13404h = ye.m.a(new ye.m.b() { // from class: ef.f
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return g.k((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static int g(df.a.c cVar) throws GeneralSecurityException {
        if (df.a.c.f12247c.equals(cVar)) {
            return 33;
        }
        if (df.a.c.f12248d.equals(cVar)) {
            return 49;
        }
        if (df.a.c.f12249e.equals(cVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static cf.s h(df.a aVar) {
        return cf.s.h0().G(u(aVar.d())).D(t(aVar.c())).F(w(aVar.e())).build();
    }

    public static cf.u i(df.c cVar) throws GeneralSecurityException {
        int iG = g(cVar.d().c());
        ECPoint eCPointE = cVar.e();
        return cf.u.i0().D(h(cVar.d())).F(com.google.crypto.tink.shaded.protobuf.h.e(ye.a.c(eCPointE.getAffineX(), iG))).G(com.google.crypto.tink.shaded.protobuf.h.e(ye.a.c(eCPointE.getAffineY(), iG))).build();
    }

    public static df.a j(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            try {
                cf.r rVarD0 = cf.r.d0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return df.a.b().c(s(rVarD0.b0().g0())).d(x(rVarD0.b0().f0())).b(r(rVarD0.b0().d0())).e(y(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static df.b k(l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            cf.t tVarG0 = cf.t.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (tVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            cf.u uVarD0 = tVarG0.d0();
            if (uVarD0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return df.b.d().c(df.c.c().d(df.a.b().c(s(uVarD0.e0().g0())).d(x(uVarD0.e0().f0())).b(r(uVarD0.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(ye.a.a(uVarD0.g0().v()), ye.a.a(uVarD0.h0().v()))).c(l0Var.c()).a()).b(gf.b.a(ye.a.a(tVarG0.c0().v()), re.d0.b(d0Var))).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static df.c l(l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            cf.u uVarJ0 = cf.u.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (uVarJ0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return df.c.c().d(df.a.b().c(s(uVarJ0.e0().g0())).d(x(uVarJ0.e0().f0())).b(r(uVarJ0.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(ye.a.a(uVarJ0.g0().v()), ye.a.a(uVarJ0.h0().v()))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static void m() {
        n(ye.d0.c());
    }

    public static void n(ye.d0 d0Var) {
        d0Var.m(f13399c);
        d0Var.l(f13400d);
        d0Var.k(f13401e);
        d0Var.j(f13402f);
        d0Var.k(f13403g);
        d0Var.j(f13404h);
    }

    public static m0 o(df.a aVar) {
        return m0.c(h0.h0().F("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").G(cf.r.c0().D(h(aVar)).build().b()).D(v(aVar.f())).build());
    }

    public static l0 p(df.b bVar, re.d0 d0Var) throws GeneralSecurityException {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", cf.t.f0().F(i(bVar.c())).D(com.google.crypto.tink.shaded.protobuf.h.e(ye.a.c(bVar.f().b(re.d0.b(d0Var)), g(bVar.e().c())))).build().b(), cf.f0.c.ASYMMETRIC_PRIVATE, v(bVar.e().f()), bVar.a());
    }

    public static l0 q(df.c cVar, re.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", i(cVar).b(), cf.f0.c.ASYMMETRIC_PUBLIC, v(cVar.d().f()), cVar.a());
    }

    public static df.a.c r(cf.z zVar) throws GeneralSecurityException {
        int i10 = a.f13406c[zVar.ordinal()];
        if (i10 == 1) {
            return df.a.c.f12247c;
        }
        if (i10 == 2) {
            return df.a.c.f12248d;
        }
        if (i10 == 3) {
            return df.a.c.f12249e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + zVar.getNumber());
    }

    public static df.a.d s(cf.b0 b0Var) throws GeneralSecurityException {
        int i10 = a.f13405a[b0Var.ordinal()];
        if (i10 == 1) {
            return df.a.d.b;
        }
        if (i10 == 2) {
            return df.a.d.f12251c;
        }
        if (i10 == 3) {
            return df.a.d.f12252d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static cf.z t(df.a.c cVar) throws GeneralSecurityException {
        if (df.a.c.f12247c.equals(cVar)) {
            return cf.z.NIST_P256;
        }
        if (df.a.c.f12248d.equals(cVar)) {
            return cf.z.NIST_P384;
        }
        if (df.a.c.f12249e.equals(cVar)) {
            return cf.z.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static cf.b0 u(df.a.d dVar) throws GeneralSecurityException {
        if (df.a.d.b.equals(dVar)) {
            return cf.b0.SHA256;
        }
        if (df.a.d.f12251c.equals(dVar)) {
            return cf.b0.SHA384;
        }
        if (df.a.d.f12252d.equals(dVar)) {
            return cf.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + dVar);
    }

    public static p0 v(df.a.f fVar) throws GeneralSecurityException {
        if (df.a.f.b.equals(fVar)) {
            return p0.TINK;
        }
        if (df.a.f.f12256c.equals(fVar)) {
            return p0.CRUNCHY;
        }
        if (df.a.f.f12258e.equals(fVar)) {
            return p0.RAW;
        }
        if (df.a.f.f12257d.equals(fVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + fVar);
    }

    public static cf.v w(df.a.e eVar) throws GeneralSecurityException {
        if (df.a.e.b.equals(eVar)) {
            return cf.v.IEEE_P1363;
        }
        if (df.a.e.f12254c.equals(eVar)) {
            return cf.v.DER;
        }
        throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + eVar);
    }

    public static df.a.e x(cf.v vVar) throws GeneralSecurityException {
        int i10 = a.f13407d[vVar.ordinal()];
        if (i10 == 1) {
            return df.a.e.b;
        }
        if (i10 == 2) {
            return df.a.e.f12254c;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + vVar.getNumber());
    }

    public static df.a.f y(p0 p0Var) throws GeneralSecurityException {
        int i10 = a.b[p0Var.ordinal()];
        if (i10 == 1) {
            return df.a.f.b;
        }
        if (i10 == 2) {
            return df.a.f.f12256c;
        }
        if (i10 == 3) {
            return df.a.f.f12257d;
        }
        if (i10 == 4) {
            return df.a.f.f12258e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
