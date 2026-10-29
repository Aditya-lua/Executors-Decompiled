package qe;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f29323a;
    public static final ve.g0<pe.p, ve.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.f0<ve.m0> f29324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.n<pe.l, ve.l0> f29325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.m<ve.l0> f29326e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29327a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f29327a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29327a[ze.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29327a[ze.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29327a[ze.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f29323a = aVarH;
        b = ve.g0.a(new ve.g0.b() { // from class: qe.f
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return j.k((pe.p) xVar);
            }
        }, pe.p.class, ve.m0.class);
        f29324c = ve.f0.a(new ve.f0.b() { // from class: qe.g
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return j.g((ve.m0) p0Var);
            }
        }, aVarH, ve.m0.class);
        f29325d = ve.n.a(new ve.n.b() { // from class: qe.h
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return j.j((pe.l) lVar, d0Var);
            }
        }, pe.l.class, ve.l0.class);
        f29326e = ve.m.a(new ve.m.b() { // from class: qe.i
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return j.f((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
    }

    public static ze.k e(pe.p pVar) throws GeneralSecurityException {
        if (pVar.e() == 16) {
            return ze.k.d0().C(pVar.c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(pVar.e())));
    }

    public static pe.l f(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            ze.i iVarG0 = ze.i.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (iVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return pe.l.b().e(pe.p.b().c(iVarG0.c0().size()).b(iVarG0.d0().c0()).d(16).e(m(l0Var.e())).a()).d(df.c.a(iVarG0.c0().x(), oe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static pe.p g(ve.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                ze.j jVarF0 = ze.j.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return pe.p.b().c(jVarF0.c0()).b(jVarF0.d0().c0()).d(16).e(m(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(ve.d0.c());
    }

    public static void i(ve.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f29324c);
        d0Var.k(f29325d);
        d0Var.j(f29326e);
    }

    public static ve.l0 j(pe.l lVar, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.AesEaxKey", ze.i.f0().D(e(lVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(lVar.c().d(oe.d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, l(lVar.e().f()), lVar.a());
    }

    public static ve.m0 k(pe.p pVar) {
        return ve.m0.c(ze.h0.h0().D("type.googleapis.com/google.crypto.tink.AesEaxKey").E(ze.j.e0().D(e(pVar)).C(pVar.d()).build().b()).C(l(pVar.f())).build());
    }

    public static ze.p0 l(pe.p.c cVar) throws GeneralSecurityException {
        if (pe.p.c.b.equals(cVar)) {
            return ze.p0.TINK;
        }
        if (pe.p.c.f28514c.equals(cVar)) {
            return ze.p0.CRUNCHY;
        }
        if (pe.p.c.f28515d.equals(cVar)) {
            return ze.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static pe.p.c m(ze.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f29327a[p0Var.ordinal()];
        if (i10 == 1) {
            return pe.p.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return pe.p.c.f28514c;
        }
        if (i10 == 4) {
            return pe.p.c.f28515d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
