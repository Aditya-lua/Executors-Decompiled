package te;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32370a;
    public static final ye.g0<se.z, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<se.v, ye.l0> f32372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32373e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32374a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32374a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32374a[cf.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32374a[cf.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32374a[cf.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f32370a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.q
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return u.j((se.z) xVar);
            }
        }, se.z.class, ye.m0.class);
        f32371c = ye.f0.a(new ye.f0.b() { // from class: te.r
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return u.f((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32372d = ye.n.a(new ye.n.b() { // from class: te.s
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return u.i((se.v) lVar, d0Var);
            }
        }, se.v.class, ye.l0.class);
        f32373e = ye.m.a(new ye.m.b() { // from class: te.t
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return u.e((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static se.v e(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            cf.n nVarE0 = cf.n.e0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (nVarE0.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return se.v.b().e(se.z.b().b(nVarE0.b0().size()).c(l(l0Var.e())).a()).d(gf.c.a(nVarE0.b0().v(), re.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static se.z f(ye.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            cf.o oVarE0 = cf.o.e0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (oVarE0.c0() == 0) {
                return se.z.b().b(oVarE0.b0()).c(l(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
        }
    }

    public static void g() {
        h(ye.d0.c());
    }

    public static void h(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32371c);
        d0Var.k(f32372d);
        d0Var.j(f32373e);
    }

    public static ye.l0 i(se.v vVar, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", cf.n.d0().D(com.google.crypto.tink.shaded.protobuf.h.e(vVar.c().d(re.d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, k(vVar.e().d()), vVar.a());
    }

    public static ye.m0 j(se.z zVar) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.AesGcmSivKey").G(cf.o.d0().D(zVar.c()).build().b()).D(k(zVar.d())).build());
    }

    public static cf.p0 k(se.z.c cVar) throws GeneralSecurityException {
        if (se.z.c.b.equals(cVar)) {
            return cf.p0.TINK;
        }
        if (se.z.c.f31455c.equals(cVar)) {
            return cf.p0.CRUNCHY;
        }
        if (se.z.c.f31456d.equals(cVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static se.z.c l(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32374a[p0Var.ordinal()];
        if (i10 == 1) {
            return se.z.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return se.z.c.f31455c;
        }
        if (i10 == 4) {
            return se.z.c.f31456d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
