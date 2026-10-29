package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29315a;
    public static final ve.g0<pe.k, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<pe.f, ve.l0> f29317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29318e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29319a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ze.b0.values().length];
            b = iArr;
            try {
                iArr[ze.b0.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ze.b0.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ze.b0.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ze.b0.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ze.b0.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[ze.p0.values().length];
            f29319a = iArr2;
            try {
                iArr2[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29319a[ze.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29319a[ze.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29319a[ze.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f29315a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.a
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return e.k((pe.k) xVar);
            }
        }, pe.k.class, ve.m0.class);
        f29316c = ve.f0.a(new ve.f0.b() { // from class: qe.b
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return e.g((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29317d = ve.n.a(new ve.n.b() { // from class: qe.c
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return e.j((pe.f) lVar, d0Var);
            }
        }, pe.f.class, ve.l0.class);
        f29318e = ve.m.a(new ve.m.b() { // from class: qe.d
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return e.f((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static ze.e0 e(pe.k kVar) {
        return ze.e0.f0().D(kVar.g()).C(m(kVar.d())).build();
    }

    public static pe.f f(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            ze.d dVarG0 = ze.d.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (dVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (dVarG0.c0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (dVarG0.d0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return pe.f.b().f(pe.k.b().b(dVarG0.c0().d0().size()).d(dVarG0.d0().d0().size()).e(dVarG0.c0().e0().c0()).f(dVarG0.d0().e0().e0()).c(l(dVarG0.d0().e0().d0())).g(o(l0Var.e())).a()).c(df.c.a(dVarG0.c0().d0().x(), oe.d0.b(d0Var))).d(df.c.a(dVarG0.d0().d0().x(), oe.d0.b(d0Var))).e(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static pe.k g(ve.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            ze.e eVarF0 = ze.e.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (eVarF0.d0().f0() == 0) {
                return pe.k.b().b(eVarF0.c0().d0()).d(eVarF0.d0().d0()).e(eVarF0.c0().e0().c0()).f(eVarF0.d0().e0().e0()).c(l(eVarF0.d0().e0().d0())).g(o(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static void h() {
        i(ve.d0.c());
    }

    public static void i(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29316c);
        d0Var.k(f29317d);
        d0Var.j(f29318e);
    }

    public static ve.l0 j(pe.f fVar, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ze.d.f0().C(ze.f.g0().D(ze.h.d0().C(fVar.f().f()).build()).C(com.google.crypto.tink.shaded.protobuf.h.e(fVar.c().d(oe.d0.b(d0Var)))).build()).D(ze.c0.g0().D(e(fVar.f())).C(com.google.crypto.tink.shaded.protobuf.h.e(fVar.d().d(oe.d0.b(d0Var)))).build()).build().b(), ze.f0.c.SYMMETRIC, n(fVar.f().h()), fVar.a());
    }

    public static ve.m0 k(pe.k kVar) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").E(ze.e.e0().C(ze.g.f0().D(ze.h.d0().C(kVar.f()).build()).C(kVar.c()).build()).D(ze.d0.g0().D(e(kVar)).C(kVar.e()).build()).build().b()).C(n(kVar.h())).build());
    }

    public static pe.k.c l(ze.b0 b0Var) throws GeneralSecurityException {
        int i10 = a.b[b0Var.ordinal()];
        if (i10 == 1) {
            return pe.k.c.b;
        }
        if (i10 == 2) {
            return pe.k.c.f28479c;
        }
        if (i10 == 3) {
            return pe.k.c.f28480d;
        }
        if (i10 == 4) {
            return pe.k.c.f28481e;
        }
        if (i10 == 5) {
            return pe.k.c.f28482f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static ze.b0 m(pe.k.c cVar) throws GeneralSecurityException {
        if (pe.k.c.b.equals(cVar)) {
            return ze.b0.SHA1;
        }
        if (pe.k.c.f28479c.equals(cVar)) {
            return ze.b0.SHA224;
        }
        if (pe.k.c.f28480d.equals(cVar)) {
            return ze.b0.SHA256;
        }
        if (pe.k.c.f28481e.equals(cVar)) {
            return ze.b0.SHA384;
        }
        if (pe.k.c.f28482f.equals(cVar)) {
            return ze.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    public static ze.p0 n(pe.k.d dVar) throws GeneralSecurityException {
        if (pe.k.d.b.equals(dVar)) {
            return ze.p0.TINK;
        }
        if (pe.k.d.f28484c.equals(dVar)) {
            return ze.p0.CRUNCHY;
        }
        if (pe.k.d.f28485d.equals(dVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static pe.k.d o(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29319a[p0Var.ordinal()];
        if (i10 == 1) {
            return pe.k.d.b;
        }
        if (i10 == 2 || i10 == 3) {
            return pe.k.d.f28484c;
        }
        if (i10 == 4) {
            return pe.k.d.f28485d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
