package re;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f30274a;
    public static final we.g0<qe.p, we.m0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.f0<we.m0> f30275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.n<qe.l, we.l0> f30276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.m<we.l0> f30277e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30278a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f30278a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30278a[af.p0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30278a[af.p0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30278a[af.p0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f30274a = aVarH;
        b = we.g0.a(new we.g0.b() { // from class: re.f
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return j.k((qe.p) xVar);
            }
        }, qe.p.class, we.m0.class);
        f30275c = we.f0.a(new we.f0.b() { // from class: re.g
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return j.g((we.m0) p0Var);
            }
        }, aVarH, we.m0.class);
        f30276d = we.n.a(new we.n.b() { // from class: re.h
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return j.j((qe.l) lVar, d0Var);
            }
        }, qe.l.class, we.l0.class);
        f30277e = we.m.a(new we.m.b() { // from class: re.i
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return j.f((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
    }

    public static af.k e(qe.p pVar) throws GeneralSecurityException {
        if (pVar.e() == 16) {
            return af.k.d0().C(pVar.c()).build();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(pVar.e())));
    }

    public static qe.l f(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            af.i iVarG0 = af.i.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (iVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return qe.l.b().e(qe.p.b().c(iVarG0.c0().size()).b(iVarG0.d0().c0()).d(16).e(m(l0Var.e())).a()).d(ef.c.a(iVarG0.c0().x(), pe.d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static qe.p g(we.m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                af.j jVarF0 = af.j.f0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return qe.p.b().c(jVarF0.c0()).b(jVarF0.d0().c0()).d(16).e(m(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(b);
        d0Var.l(f30275c);
        d0Var.k(f30276d);
        d0Var.j(f30277e);
    }

    public static we.l0 j(qe.l lVar, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.AesEaxKey", af.i.f0().D(e(lVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(lVar.c().d(pe.d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, l(lVar.e().f()), lVar.a());
    }

    public static we.m0 k(qe.p pVar) {
        return we.m0.c(af.h0.h0().D("type.googleapis.com/google.crypto.tink.AesEaxKey").E(af.j.e0().D(e(pVar)).C(pVar.d()).build().b()).C(l(pVar.f())).build());
    }

    public static af.p0 l(qe.p.c cVar) throws GeneralSecurityException {
        if (qe.p.c.b.equals(cVar)) {
            return af.p0.TINK;
        }
        if (qe.p.c.f29762c.equals(cVar)) {
            return af.p0.CRUNCHY;
        }
        if (qe.p.c.f29763d.equals(cVar)) {
            return af.p0.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + cVar);
    }

    public static qe.p.c m(af.p0 p0Var) throws GeneralSecurityException {
        int i10 = a.f30278a[p0Var.ordinal()];
        if (i10 == 1) {
            return qe.p.c.b;
        }
        if (i10 == 2 || i10 == 3) {
            return qe.p.c.f29762c;
        }
        if (i10 == 4) {
            return qe.p.c.f29763d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + p0Var.getNumber());
    }
}
