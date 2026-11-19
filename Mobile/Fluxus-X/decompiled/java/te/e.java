package te;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32340a;
    public static final ye.g0<se.k, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<se.f, ye.l0> f32342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32343e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32344a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[cf.b0.values().length];
            b = iArr;
            try {
                iArr[cf.b0.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[cf.b0.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[cf.b0.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[cf.b0.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[cf.b0.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[cf.p0.values().length];
            f32344a = iArr2;
            try {
                iArr2[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32344a[cf.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32344a[cf.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32344a[cf.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f32340a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.a
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return e.k((se.k) xVar);
            }
        }, se.k.class, ye.m0.class);
        f32341c = ye.f0.a(new ye.f0.b() { // from class: te.b
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return e.g((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32342d = ye.n.a(new ye.n.b() { // from class: te.c
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return e.j((se.f) lVar, d0Var);
            }
        }, se.f.class, ye.l0.class);
        f32343e = ye.m.a(new ye.m.b() { // from class: te.d
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return e.f((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static cf.e0 e(se.k kVar) {
        return cf.e0.f0().F(kVar.g()).D(m(kVar.d())).build();
    }

    public static se.f f(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            cf.d dVarG0 = cf.d.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (dVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (dVarG0.c0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (dVarG0.d0().f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return se.f.b().f(se.k.b().b(dVarG0.c0().d0().size()).d(dVarG0.d0().d0().size()).e(dVarG0.c0().e0().c0()).f(dVarG0.d0().e0().e0()).c(l(dVarG0.d0().e0().d0())).g(o(l0Var.e())).a()).c(gf.c.a(dVarG0.c0().d0().v(), re.d0.b(d0Var))).d(gf.c.a(dVarG0.d0().d0().v(), re.d0.b(d0Var))).e(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static se.k g(ye.m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            cf.e eVarF0 = cf.e.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (eVarF0.d0().f0() == 0) {
                return se.k.b().b(eVarF0.c0().d0()).d(eVarF0.d0().d0()).e(eVarF0.c0().e0().c0()).f(eVarF0.d0().e0().e0()).c(l(eVarF0.d0().e0().d0())).g(o(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    public static void h() {
        i(ye.d0.c());
    }

    public static void i(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32341c);
        d0Var.k(f32342d);
        d0Var.j(f32343e);
    }

    public static ye.l0 j(se.f fVar, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", cf.d.f0().D(cf.f.g0().F(cf.h.d0().D(fVar.f().f()).build()).D(com.google.crypto.tink.shaded.protobuf.h.e(fVar.c().d(re.d0.b(d0Var)))).build()).F(cf.c0.g0().F(e(fVar.f())).D(com.google.crypto.tink.shaded.protobuf.h.e(fVar.d().d(re.d0.b(d0Var)))).build()).build().b(), cf.f0.c.SYMMETRIC, n(fVar.f().h()), fVar.a());
    }

    public static ye.m0 k(se.k kVar) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").G(cf.e.e0().D(cf.g.f0().F(cf.h.d0().D(kVar.f()).build()).D(kVar.c()).build()).F(cf.d0.g0().F(e(kVar)).D(kVar.e()).build()).build().b()).D(n(kVar.h())).build());
    }

    public static se.k.c l(cf.b0 b0Var) throws GeneralSecurityException {
        int i10 = a.b[b0Var.ordinal()];
        if (i10 == 1) {
            return se.k.c.b;
        }
        if (i10 == 2) {
            return se.k.c.f31358c;
        }
        if (i10 == 3) {
            return se.k.c.f31359d;
        }
        if (i10 == 4) {
            return se.k.c.f31360e;
        }
        if (i10 == 5) {
            return se.k.c.f31361f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + b0Var.getNumber());
    }

    public static cf.b0 m(se.k.c cVar) throws GeneralSecurityException {
        if (se.k.c.b.equals(cVar)) {
            return cf.b0.SHA1;
        }
        if (se.k.c.f31358c.equals(cVar)) {
            return cf.b0.SHA224;
        }
        if (se.k.c.f31359d.equals(cVar)) {
            return cf.b0.SHA256;
        }
        if (se.k.c.f31360e.equals(cVar)) {
            return cf.b0.SHA384;
        }
        if (se.k.c.f31361f.equals(cVar)) {
            return cf.b0.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType " + cVar);
    }

    public static cf.p0 n(se.k.d dVar) throws GeneralSecurityException {
        if (se.k.d.b.equals(dVar)) {
            return cf.p0.TINK;
        }
        if (se.k.d.f31363c.equals(dVar)) {
            return cf.p0.CRUNCHY;
        }
        if (se.k.d.f31364d.equals(dVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + dVar);
    }

    public static se.k.d o(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32344a[p0Var.ordinal()];
        if (i10 == 1) {
            return se.k.d.b;
        }
        if (i10 == 2 || i10 == 3) {
            return se.k.d.f31363c;
        }
        if (i10 == 4) {
            return se.k.d.f31364d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
