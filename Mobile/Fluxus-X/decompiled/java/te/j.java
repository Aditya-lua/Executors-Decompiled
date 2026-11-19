package te;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f32348a;
    public static final ye.g0<se.p, ye.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.f0<ye.m0> f32349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.n<se.l, ye.l0> f32350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.m<ye.l0> f32351e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32352a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f32352a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32352a[cf.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32352a[cf.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32352a[cf.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f32348a = aVarH;
        b = ye.g0.a(new ye.g0.b() { // from class: te.f
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return j.k((se.p) xVar);
            }
        }, se.p.class, ye.m0.class);
        f32349c = ye.f0.a(new ye.f0.b() { // from class: te.g
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return j.g((ye.m0) p0Var);
            }
        }, aVarH, ye.m0.class);
        f32350d = ye.n.a(new ye.n.b() { // from class: te.h
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return j.j((se.l) lVar, d0Var);
            }
        }, se.l.class, ye.l0.class);
        f32351e = ye.m.a(new ye.m.b() { // from class: te.i
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return j.f((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
    }

    public static cf.k e(se.p pVar) throws GeneralSecurityException {
        if (pVar.e() == 16) {
            return cf.k.d0().D(pVar.c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(pVar.e())));
    }

    public static se.l f(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            cf.i iVarG0 = cf.i.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (iVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return se.l.b().e(se.p.b().c(iVarG0.c0().size()).b(iVarG0.d0().c0()).d(16).e(m(l0Var.e())).a()).d(gf.c.a(iVarG0.c0().v(), re.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static se.p g(ye.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                cf.j jVarF0 = cf.j.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return se.p.b().c(jVarF0.c0()).b(jVarF0.d0().c0()).d(16).e(m(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(ye.d0.c());
    }

    public static void i(ye.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f32349c);
        d0Var.k(f32350d);
        d0Var.j(f32351e);
    }

    public static ye.l0 j(se.l lVar, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.AesEaxKey", cf.i.f0().F(e(lVar.e())).D(com.google.crypto.tink.shaded.protobuf.h.e(lVar.c().d(re.d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, l(lVar.e().f()), lVar.a());
    }

    public static ye.m0 k(se.p pVar) {
        return ye.m0.c(cf.h0.h0().F("type.googleapis.com/google.crypto.tink.AesEaxKey").G(cf.j.e0().F(e(pVar)).D(pVar.d()).build().b()).D(l(pVar.f())).build());
    }

    public static cf.p0 l(se.p.c cVar) throws GeneralSecurityException {
        if (se.p.c.b.equals(cVar)) {
            return cf.p0.TINK;
        }
        if (se.p.c.f31393c.equals(cVar)) {
            return cf.p0.CRUNCHY;
        }
        if (se.p.c.f31394d.equals(cVar)) {
            return cf.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static se.p.c m(cf.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f32352a[p0Var.ordinal()];
        if (i10 == 1) {
            return se.p.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return se.p.c.f31393c;
        }
        if (i10 == 4) {
            return se.p.c.f31394d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
