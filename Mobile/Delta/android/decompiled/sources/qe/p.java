package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29333a;
    public static final ve.g0<pe.u, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<pe.q, ve.l0> f29335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29336e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29337a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29337a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29337a[ze.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29337a[ze.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29337a[ze.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f29333a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.l
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return p.j((pe.u) xVar);
            }
        }, pe.u.class, ve.m0.class);
        f29334c = ve.f0.a(new ve.f0.b() { // from class: qe.m
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return p.f((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29335d = ve.n.a(new ve.n.b() { // from class: qe.n
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return p.i((pe.q) lVar, d0Var);
            }
        }, pe.q.class, ve.l0.class);
        f29336e = ve.m.a(new ve.m.b() { // from class: qe.o
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return p.e((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static pe.q e(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            ze.l lVarE0 = ze.l.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (lVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return pe.q.b().e(pe.u.b().c(lVarE0.b0().size()).b(12).d(16).e(l(l0Var.e())).a()).d(df.c.a(lVarE0.b0().x(), oe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static pe.u f(ve.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            ze.m mVarE0 = ze.m.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (mVarE0.c0() == 0) {
                return pe.u.b().c(mVarE0.b0()).b(12).d(16).e(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(ve.d0.c());
    }

    public static void h(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29334c);
        d0Var.k(f29335d);
        d0Var.j(f29336e);
    }

    public static ve.l0 i(pe.q qVar, oe.d0 d0Var) throws GeneralSecurityException {
        m(qVar.e());
        return ve.l0.b("type.googleapis.com/google.crypto.tink.AesGcmKey", ze.l.d0().C(com.google.crypto.tink.shaded.protobuf.h.e(qVar.c().d(oe.d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, k(qVar.e().f()), qVar.a());
    }

    public static ve.m0 j(pe.u uVar) throws GeneralSecurityException {
        m(uVar);
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.AesGcmKey").E(ze.m.d0().C(uVar.d()).build().b()).C(k(uVar.f())).build());
    }

    public static ze.p0 k(pe.u.c cVar) throws GeneralSecurityException {
        if (pe.u.c.b.equals(cVar)) {
            return ze.p0.TINK;
        }
        if (pe.u.c.f28549c.equals(cVar)) {
            return ze.p0.CRUNCHY;
        }
        if (pe.u.c.f28550d.equals(cVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static pe.u.c l(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29337a[p0Var.ordinal()];
        if (i10 == 1) {
            return pe.u.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return pe.u.c.f28549c;
        }
        if (i10 == 4) {
            return pe.u.c.f28550d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }

    public static void m(pe.u uVar) throws GeneralSecurityException {
        if (uVar.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(uVar.e())));
        }
        if (uVar.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(uVar.c())));
        }
    }
}
