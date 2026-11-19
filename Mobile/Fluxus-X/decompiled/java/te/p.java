package te;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32358a;
    public static final ye.g0<se.u, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<se.q, ye.l0> f32360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32361e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32362a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32362a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32362a[cf.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32362a[cf.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32362a[cf.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f32358a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.l
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return p.j((se.u) xVar);
            }
        }, se.u.class, ye.m0.class);
        f32359c = ye.f0.a(new ye.f0.b() { // from class: te.m
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return p.f((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32360d = ye.n.a(new ye.n.b() { // from class: te.n
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return p.i((se.q) lVar, d0Var);
            }
        }, se.q.class, ye.l0.class);
        f32361e = ye.m.a(new ye.m.b() { // from class: te.o
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return p.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static se.q e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            cf.l lVarE0 = cf.l.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (lVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return se.q.b().e(se.u.b().c(lVarE0.b0().size()).b(12).d(16).e(l(l0Var.e())).a()).d(gf.c.a(lVarE0.b0().v(), re.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static se.u f(ye.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            cf.m mVarE0 = cf.m.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (mVarE0.c0() == 0) {
                return se.u.b().c(mVarE0.b0()).b(12).d(16).e(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
        }
    }

    public static void g() {
        h(ye.d0.c());
    }

    public static void h(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32359c);
        d0Var.k(f32360d);
        d0Var.j(f32361e);
    }

    public static ye.l0 i(se.q qVar, re.d0 d0Var) throws GeneralSecurityException {
        m(qVar.e());
        return ye.l0.b("type.googleapis.com/google.crypto.tink.AesGcmKey", cf.l.d0().D(com.google.crypto.tink.shaded.protobuf.h.e(qVar.c().d(re.d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, k(qVar.e().f()), qVar.a());
    }

    public static ye.m0 j(se.u uVar) throws GeneralSecurityException {
        m(uVar);
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.AesGcmKey").G(cf.m.d0().D(uVar.d()).build().b()).D(k(uVar.f())).build());
    }

    public static cf.p0 k(se.u.c cVar) throws GeneralSecurityException {
        if (se.u.c.b.equals(cVar)) {
            return cf.p0.TINK;
        }
        if (se.u.c.f31428c.equals(cVar)) {
            return cf.p0.CRUNCHY;
        }
        if (se.u.c.f31429d.equals(cVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static se.u.c l(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32362a[p0Var.ordinal()];
        if (i10 == 1) {
            return se.u.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return se.u.c.f31428c;
        }
        if (i10 == 4) {
            return se.u.c.f31429d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }

    public static void m(se.u uVar) throws GeneralSecurityException {
        if (uVar.e() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(uVar.e())));
        }
        if (uVar.c() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(uVar.c())));
        }
    }
}
