package re;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30284a;
    public static final we.g0<qe.u, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<qe.q, we.l0> f30286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30287e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30288a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30288a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30288a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30288a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30288a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f30284a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.l
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return p.j((qe.u) xVar);
            }
        }, qe.u.class, we.m0.class);
        f30285c = we.f0.a(new we.f0.b() { // from class: re.m
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return p.f((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30286d = we.n.a(new we.n.b() { // from class: re.n
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return p.i((qe.q) lVar, d0Var);
            }
        }, qe.q.class, we.l0.class);
        f30287e = we.m.a(new we.m.b() { // from class: re.o
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return p.e((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static qe.q e(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            af.l lVarE0 = af.l.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (lVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return qe.q.b().e(qe.u.b().c(lVarE0.b0().size()).b(12).d(16).e(l(l0Var.e())).a()).d(ef.c.a(lVarE0.b0().x(), pe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static qe.u f(we.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.m mVarE0 = af.m.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (mVarE0.c0() == 0) {
                return qe.u.b().c(mVarE0.b0()).b(12).d(16).e(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(we.d0.c());
    }

    public static void h(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30285c);
        d0Var.k(f30286d);
        d0Var.j(f30287e);
    }

    public static we.l0 i(qe.q qVar, pe.d0 d0Var) throws GeneralSecurityException {
        m(qVar.e());
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesGcmKey", af.l.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(qVar.c().d(pe.d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, k(qVar.e().f()), qVar.a());
    }

    public static we.m0 j(qe.u uVar) throws GeneralSecurityException {
        m(uVar);
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesGcmKey").E(af.m.d0().C(uVar.d()).build().b()).C(k(uVar.f())).build());
    }

    public static af.p0 k(qe.u.c cVar) throws GeneralSecurityException {
        if (qe.u.c.b.equals(cVar)) {
            return af.p0.TINK;
        }
        if (qe.u.c.f29797c.equals(cVar)) {
            return af.p0.CRUNCHY;
        }
        if (qe.u.c.f29798d.equals(cVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static qe.u.c l(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30288a[p0Var.ordinal()];
        if (i10 == 1) {
            return qe.u.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return qe.u.c.f29797c;
        }
        if (i10 == 4) {
            return qe.u.c.f29798d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }

    public static void m(qe.u uVar) throws GeneralSecurityException {
        if (uVar.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(uVar.e())));
        }
        if (uVar.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(uVar.c())));
        }
    }
}
