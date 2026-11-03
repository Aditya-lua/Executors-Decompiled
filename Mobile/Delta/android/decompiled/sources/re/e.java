package re;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30266a;
    public static final we.g0<qe.k, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<qe.f, we.l0> f30268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30269e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30270a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[af.b0.values().length];
            b = iArr;
            try {
                iArr[af.b0.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[af.b0.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[af.b0.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[af.b0.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[af.b0.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[af.p0.values().length];
            f30270a = iArr2;
            try {
                iArr2[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30270a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30270a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30270a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f30266a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.a
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return e.k((qe.k) xVar);
            }
        }, qe.k.class, we.m0.class);
        f30267c = we.f0.a(new we.f0.b() { // from class: re.b
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return e.g((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30268d = we.n.a(new we.n.b() { // from class: re.c
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return e.j((qe.f) lVar, d0Var);
            }
        }, qe.f.class, we.l0.class);
        f30269e = we.m.a(new we.m.b() { // from class: re.d
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return e.f((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static af.e0 e(qe.k kVar) {
        return af.e0.f0().D(kVar.g()).C(m(kVar.d())).build();
    }

    public static qe.f f(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            af.d dVarG0 = af.d.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (dVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (dVarG0.c0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (dVarG0.d0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return qe.f.b().f(qe.k.b().b(dVarG0.c0().d0().size()).d(dVarG0.d0().d0().size()).e(dVarG0.c0().e0().c0()).f(dVarG0.d0().e0().e0()).c(l(dVarG0.d0().e0().d0())).g(o(l0Var.e())).a()).c(ef.c.a(dVarG0.c0().d0().x(), pe.d0.b(d0Var))).d(ef.c.a(dVarG0.d0().d0().x(), pe.d0.b(d0Var))).e(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static qe.k g(we.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.e eVarF0 = af.e.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (eVarF0.d0().f0() == 0) {
                return qe.k.b().b(eVarF0.c0().d0()).d(eVarF0.d0().d0()).e(eVarF0.c0().e0().c0()).f(eVarF0.d0().e0().e0()).c(l(eVarF0.d0().e0().d0())).g(o(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30267c);
        d0Var.k(f30268d);
        d0Var.j(f30269e);
    }

    public static we.l0 j(qe.f fVar, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", af.d.f0().C(af.f.g0().D(af.h.d0().C(fVar.f().f()).build()).C(com.google.crypto.tink.shaded.protobuf.h.e(fVar.c().d(pe.d0.b(d0Var)))).build()).D(af.c0.g0().D(e(fVar.f())).C(com.google.crypto.tink.shaded.protobuf.h.e(fVar.d().d(pe.d0.b(d0Var)))).build()).build().b(), af.f0.c.SYMMETRIC, n(fVar.f().h()), fVar.a());
    }

    public static we.m0 k(qe.k kVar) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").E(af.e.e0().C(af.g.f0().D(af.h.d0().C(kVar.f()).build()).C(kVar.c()).build()).D(af.d0.g0().D(e(kVar)).C(kVar.e()).build()).build().b()).C(n(kVar.h())).build());
    }

    public static qe.k.c l(af.b0 b0Var) throws GeneralSecurityException {
        int i10 = a.b[b0Var.ordinal()];
        if (i10 == 1) {
            return qe.k.c.b;
        }
        if (i10 == 2) {
            return qe.k.c.f29727c;
        }
        if (i10 == 3) {
            return qe.k.c.f29728d;
        }
        if (i10 == 4) {
            return qe.k.c.f29729e;
        }
        if (i10 == 5) {
            return qe.k.c.f29730f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static af.b0 m(qe.k.c cVar) throws GeneralSecurityException {
        if (qe.k.c.b.equals(cVar)) {
            return af.b0.SHA1;
        }
        if (qe.k.c.f29727c.equals(cVar)) {
            return af.b0.SHA224;
        }
        if (qe.k.c.f29728d.equals(cVar)) {
            return af.b0.SHA256;
        }
        if (qe.k.c.f29729e.equals(cVar)) {
            return af.b0.SHA384;
        }
        if (qe.k.c.f29730f.equals(cVar)) {
            return af.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    public static af.p0 n(qe.k.d dVar) throws GeneralSecurityException {
        if (qe.k.d.b.equals(dVar)) {
            return af.p0.TINK;
        }
        if (qe.k.d.f29732c.equals(dVar)) {
            return af.p0.CRUNCHY;
        }
        if (qe.k.d.f29733d.equals(dVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static qe.k.d o(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30270a[p0Var.ordinal()];
        if (i10 == 1) {
            return qe.k.d.b;
        }
        if (i10 == 2 || i10 == 3) {
            return qe.k.d.f29732c;
        }
        if (i10 == 4) {
            return qe.k.d.f29733d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
