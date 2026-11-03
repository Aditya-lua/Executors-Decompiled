package cf;

import af.h0;
import af.p0;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import we.l0;
import we.m0;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f4895a;
    public static final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.g0<bf.a, m0> f4896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.n<bf.c, l0> f4898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.m<l0> f4899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.n<bf.b, l0> f4900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final we.m<l0> f4901h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4902a;
        public static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f4903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f4904d;

        static {
            int[] iArr = new int[af.v.values().length];
            f4904d = iArr;
            try {
                iArr[af.v.IEEE_P1363.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4904d[af.v.DER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[af.z.values().length];
            f4903c = iArr2;
            try {
                iArr2[af.z.NIST_P256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4903c[af.z.NIST_P384.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4903c[af.z.NIST_P521.ordinal()] = 3;
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
            int[] iArr4 = new int[af.b0.values().length];
            f4902a = iArr4;
            try {
                iArr4[af.b0.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4902a[af.b0.SHA384.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4902a[af.b0.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ef.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        f4895a = aVarH;
        ef.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        b = aVarH2;
        f4896c = we.g0.a(new we.g0.b() { // from class: cf.a
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return g.o((bf.a) xVar);
            }
        }, bf.a.class, m0.class);
        f4897d = we.f0.a(new we.f0.b() { // from class: cf.b
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return g.j((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4898e = we.n.a(new we.n.b() { // from class: cf.c
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return g.q((bf.c) lVar, d0Var);
            }
        }, bf.c.class, l0.class);
        f4899f = we.m.a(new we.m.b() { // from class: cf.d
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return g.l((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f4900g = we.n.a(new we.n.b() { // from class: cf.e
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return g.p((bf.b) lVar, d0Var);
            }
        }, bf.b.class, l0.class);
        f4901h = we.m.a(new we.m.b() { // from class: cf.f
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return g.k((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static int g(bf.a.c cVar) throws GeneralSecurityException {
        if (bf.a.c.f4049c.equals(cVar)) {
            return 33;
        }
        if (bf.a.c.f4050d.equals(cVar)) {
            return 49;
        }
        if (bf.a.c.f4051e.equals(cVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static af.s h(bf.a aVar) {
        return af.s.h0().E(u(aVar.d())).C(t(aVar.c())).D(w(aVar.e())).build();
    }

    public static af.u i(bf.c cVar) throws GeneralSecurityException {
        int iG = g(cVar.d().c());
        ECPoint eCPointE = cVar.e();
        return af.u.i0().C(h(cVar.d())).D(com.google.crypto.tink.shaded.protobuf.h.e(we.a.c(eCPointE.getAffineX(), iG))).E(com.google.crypto.tink.shaded.protobuf.h.e(we.a.c(eCPointE.getAffineY(), iG))).build();
    }

    public static bf.a j(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            try {
                af.r rVarD0 = af.r.d0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return bf.a.b().c(s(rVarD0.b0().g0())).d(x(rVarD0.b0().f0())).b(r(rVarD0.b0().d0())).e(y(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static bf.b k(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            af.t tVarG0 = af.t.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (tVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            af.u uVarD0 = tVarG0.d0();
            if (uVarD0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return bf.b.d().c(bf.c.c().d(bf.a.b().c(s(uVarD0.e0().g0())).d(x(uVarD0.e0().f0())).b(r(uVarD0.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(we.a.a(uVarD0.g0().x()), we.a.a(uVarD0.h0().x()))).c(l0Var.c()).a()).b(ef.b.a(we.a.a(tVarG0.c0().x()), pe.d0.b(d0Var))).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static bf.c l(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            af.u uVarJ0 = af.u.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (uVarJ0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return bf.c.c().d(bf.a.b().c(s(uVarJ0.e0().g0())).d(x(uVarJ0.e0().f0())).b(r(uVarJ0.e0().d0())).e(y(l0Var.e())).a()).e(new ECPoint(we.a.a(uVarJ0.g0().x()), we.a.a(uVarJ0.h0().x()))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    public static void m() {
        n(we.d0.c());
    }

    public static void n(we.d0 d0Var) {
        d0Var.m(f4896c);
        d0Var.l(f4897d);
        d0Var.k(f4898e);
        d0Var.j(f4899f);
        d0Var.k(f4900g);
        d0Var.j(f4901h);
    }

    public static m0 o(bf.a aVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey").E(af.r.c0().C(h(aVar)).build().b()).C(v(aVar.f())).build());
    }

    public static l0 p(bf.b bVar, pe.d0 d0Var) throws GeneralSecurityException {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", af.t.f0().D(i(bVar.c())).C(com.google.crypto.tink.shaded.protobuf.h.e(we.a.c(bVar.f().b(pe.d0.b(d0Var)), g(bVar.e().c())))).build().b(), af.f0.c.ASYMMETRIC_PRIVATE, v(bVar.e().f()), bVar.a());
    }

    public static l0 q(bf.c cVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", i(cVar).b(), af.f0.c.ASYMMETRIC_PUBLIC, v(cVar.d().f()), cVar.a());
    }

    public static bf.a.c r(af.z zVar) throws GeneralSecurityException {
        int i10 = a.f4903c[zVar.ordinal()];
        if (i10 == 1) {
            return bf.a.c.f4049c;
        }
        if (i10 == 2) {
            return bf.a.c.f4050d;
        }
        if (i10 == 3) {
            return bf.a.c.f4051e;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + zVar.getNumber());
    }

    public static bf.a.d s(af.b0 b0Var) throws GeneralSecurityException {
        int i10 = a.f4902a[b0Var.ordinal()];
        if (i10 == 1) {
            return bf.a.d.b;
        }
        if (i10 == 2) {
            return bf.a.d.f4053c;
        }
        if (i10 == 3) {
            return bf.a.d.f4054d;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static af.z t(bf.a.c cVar) throws GeneralSecurityException {
        if (bf.a.c.f4049c.equals(cVar)) {
            return af.z.NIST_P256;
        }
        if (bf.a.c.f4050d.equals(cVar)) {
            return af.z.NIST_P384;
        }
        if (bf.a.c.f4051e.equals(cVar)) {
            return af.z.NIST_P521;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + cVar);
    }

    public static af.b0 u(bf.a.d dVar) throws GeneralSecurityException {
        if (bf.a.d.b.equals(dVar)) {
            return af.b0.SHA256;
        }
        if (bf.a.d.f4053c.equals(dVar)) {
            return af.b0.SHA384;
        }
        if (bf.a.d.f4054d.equals(dVar)) {
            return af.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + dVar);
    }

    public static p0 v(bf.a.f fVar) throws GeneralSecurityException {
        if (bf.a.f.b.equals(fVar)) {
            return p0.TINK;
        }
        if (bf.a.f.f4058c.equals(fVar)) {
            return p0.CRUNCHY;
        }
        if (bf.a.f.f4060e.equals(fVar)) {
            return p0.RAW;
        }
        if (bf.a.f.f4059d.equals(fVar)) {
            return p0.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + fVar);
    }

    public static af.v w(bf.a.e eVar) throws GeneralSecurityException {
        if (bf.a.e.b.equals(eVar)) {
            return af.v.IEEE_P1363;
        }
        if (bf.a.e.f4056c.equals(eVar)) {
            return af.v.DER;
        }
        throw new GeneralSecurityException("Unable to serialize SignatureEncoding " + eVar);
    }

    public static bf.a.e x(af.v vVar) throws GeneralSecurityException {
        int i10 = a.f4904d[vVar.ordinal()];
        if (i10 == 1) {
            return bf.a.e.b;
        }
        if (i10 == 2) {
            return bf.a.e.f4056c;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + vVar.getNumber());
    }

    public static bf.a.f y(p0 p0Var) throws GeneralSecurityException {
        int i10 = a.b[p0Var.ordinal()];
        if (i10 == 1) {
            return bf.a.f.b;
        }
        if (i10 == 2) {
            return bf.a.f.f4058c;
        }
        if (i10 == 3) {
            return bf.a.f.f4059d;
        }
        if (i10 == 4) {
            return bf.a.f.f4060e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
