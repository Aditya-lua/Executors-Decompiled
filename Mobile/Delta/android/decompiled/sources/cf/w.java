package cf;

import af.h0;
import af.p0;
import af.r0;
import af.t0;
import af.u0;
import bf.j0;
import bf.k0;
import bf.l0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import we.m0;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f4926a;
    public static final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.g0<j0, m0> f4927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.n<l0, we.l0> f4929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.m<we.l0> f4930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.n<k0, we.l0> f4931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final we.m<we.l0> f4932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final we.h<p0, j0.d> f4933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final we.h<af.b0, j0.c> f4934j;

    static {
        ef.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f4926a = aVarH;
        ef.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        b = aVarH2;
        f4927c = we.g0.a(new we.g0.b() { // from class: cf.q
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return w.r((j0) xVar);
            }
        }, j0.class, m0.class);
        f4928d = we.f0.a(new we.f0.b() { // from class: cf.r
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return w.m((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4929e = we.n.a(new we.n.b() { // from class: cf.s
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return w.t((l0) lVar, d0Var);
            }
        }, l0.class, we.l0.class);
        f4930f = we.m.a(new we.m.b() { // from class: cf.t
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return w.o((we.l0) p0Var, d0Var);
            }
        }, aVarH2, we.l0.class);
        f4931g = we.n.a(new we.n.b() { // from class: cf.u
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return w.s((k0) lVar, d0Var);
            }
        }, k0.class, we.l0.class);
        f4932h = we.m.a(new we.m.b() { // from class: cf.v
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return w.n((we.l0) p0Var, d0Var);
            }
        }, aVarH, we.l0.class);
        f4933i = we.h.a().a(p0.RAW, j0.d.f4111e).a(p0.TINK, j0.d.b).a(p0.CRUNCHY, j0.d.f4109c).a(p0.LEGACY, j0.d.f4110d).b();
        f4934j = we.h.a().a(af.b0.SHA256, j0.c.b).a(af.b0.SHA384, j0.c.f4106c).a(af.b0.SHA512, j0.c.f4107d).b();
    }

    public static BigInteger g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return we.a.a(hVar.x());
    }

    public static ef.b h(com.google.crypto.tink.shaded.protobuf.h hVar, pe.d0 d0Var) {
        return ef.b.a(we.a.a(hVar.x()), d0Var);
    }

    public static com.google.crypto.tink.shaded.protobuf.h i(BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.h.e(we.a.b(bigInteger));
    }

    public static com.google.crypto.tink.shaded.protobuf.h j(ef.b bVar, pe.d0 d0Var) {
        return i(bVar.b(d0Var));
    }

    public static af.s0 k(j0 j0Var) {
        return af.s0.d0().C((af.b0) f4934j.c(j0Var.c())).build();
    }

    public static u0 l(l0 l0Var) {
        return u0.i0().E(k(l0Var.e())).D(i(l0Var.d())).C(i(l0Var.e().e())).build();
    }

    public static j0 m(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                r0 r0VarH0 = r0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return j0.b().b(f4934j.b(r0VarH0.e0().c0())).d(g(r0VarH0.f0())).c(r0VarH0.d0()).e(f4933i.b(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static k0 n(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            t0 t0VarR0 = t0.r0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (t0VarR0.p0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            u0 u0VarN0 = t0VarR0.n0();
            if (u0VarN0.h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerG = g(u0VarN0.f0());
            l0 l0VarA = l0.c().e(j0.b().b(f4934j.b(u0VarN0.g0().c0())).d(g(u0VarN0.e0())).c(bigIntegerG.bitLength()).e(f4933i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
            pe.d0 d0VarB = pe.d0.b(d0Var);
            return k0.d().f(l0VarA).d(h(t0VarR0.m0(), d0VarB), h(t0VarR0.o0(), d0VarB)).e(h(t0VarR0.j0(), d0VarB)).c(h(t0VarR0.k0(), d0VarB), h(t0VarR0.l0(), d0VarB)).b(h(t0VarR0.i0(), d0VarB)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    public static l0 o(we.l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            u0 u0VarJ0 = u0.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (u0VarJ0.h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerG = g(u0VarJ0.f0());
            return l0.c().e(j0.b().b(f4934j.b(u0VarJ0.g0().c0())).d(g(u0VarJ0.e0())).c(bigIntegerG.bitLength()).e(f4933i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static void p() {
        q(we.d0.c());
    }

    public static void q(we.d0 d0Var) {
        d0Var.m(f4927c);
        d0Var.l(f4928d);
        d0Var.k(f4929e);
        d0Var.j(f4930f);
        d0Var.k(f4931g);
        d0Var.j(f4932h);
    }

    public static m0 r(j0 j0Var) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").E(r0.g0().D(k(j0Var)).C(j0Var.d()).E(i(j0Var.e())).build().b()).C((p0) f4933i.c(j0Var.f())).build());
    }

    public static we.l0 s(k0 k0Var, pe.d0 d0Var) throws GeneralSecurityException {
        pe.d0 d0VarB = pe.d0.b(d0Var);
        return we.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", t0.q0().O(0).K(l(k0Var.c())).D(j(k0Var.k(), d0VarB)).J(j(k0Var.i(), d0VarB)).N(j(k0Var.j(), d0VarB)).E(j(k0Var.g(), d0VarB)).G(j(k0Var.h(), d0VarB)).C(j(k0Var.e(), d0VarB)).build().b(), af.f0.c.ASYMMETRIC_PRIVATE, (p0) f4933i.c(k0Var.f().f()), k0Var.a());
    }

    public static we.l0 t(l0 l0Var, pe.d0 d0Var) {
        return we.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", l(l0Var).b(), af.f0.c.ASYMMETRIC_PUBLIC, (p0) f4933i.c(l0Var.e().f()), l0Var.a());
    }
}
