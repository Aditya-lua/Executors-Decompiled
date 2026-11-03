package re;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30296a;
    public static final we.g0<qe.z, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<qe.v, we.l0> f30298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30299e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30300a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30300a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30300a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30300a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30300a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f30296a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.q
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return u.j((qe.z) xVar);
            }
        }, qe.z.class, we.m0.class);
        f30297c = we.f0.a(new we.f0.b() { // from class: re.r
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return u.f((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30298d = we.n.a(new we.n.b() { // from class: re.s
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return u.i((qe.v) lVar, d0Var);
            }
        }, qe.v.class, we.l0.class);
        f30299e = we.m.a(new we.m.b() { // from class: re.t
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return u.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static qe.v e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            af.n nVarE0 = af.n.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (nVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return qe.v.b().e(qe.z.b().b(nVarE0.b0().size()).c(l(l0Var.e())).a()).d(ef.c.a(nVarE0.b0().x(), pe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static qe.z f(we.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.o oVarE0 = af.o.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (oVarE0.c0() == 0) {
                return qe.z.b().b(oVarE0.b0()).c(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30297c);
        d0Var.k(f30298d);
        d0Var.j(f30299e);
    }

    public static we.l0 i(qe.v vVar, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", af.n.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(vVar.c().d(pe.d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, k(vVar.e().d()), vVar.a());
    }

    public static we.m0 j(qe.z zVar) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesGcmSivKey").E(af.o.d0().C(zVar.c()).build().b()).C(k(zVar.d())).build());
    }

    public static af.p0 k(qe.z.c cVar) throws GeneralSecurityException {
        if (qe.z.c.b.equals(cVar)) {
            return af.p0.TINK;
        }
        if (qe.z.c.f29824c.equals(cVar)) {
            return af.p0.CRUNCHY;
        }
        if (qe.z.c.f29825d.equals(cVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static qe.z.c l(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30300a[p0Var.ordinal()];
        if (i10 == 1) {
            return qe.z.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return qe.z.c.f29824c;
        }
        if (i10 == 4) {
            return qe.z.c.f29825d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
