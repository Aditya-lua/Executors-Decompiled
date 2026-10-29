package bf;

import af.j0;
import af.k0;
import af.l0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import ve.m0;
import ve.s0;
import ze.h0;
import ze.p0;
import ze.r0;
import ze.t0;
import ze.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f4155a;
    public static final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.g0<j0, m0> f4156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.f0<m0> f4157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.n<l0, ve.l0> f4158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ve.m<ve.l0> f4159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.n<k0, ve.l0> f4160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.m<ve.l0> f4161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ve.h<p0, j0.d> f4162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.h<ze.b0, j0.c> f4163j;

    static {
        df.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f4155a = aVarH;
        df.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        b = aVarH2;
        f4156c = ve.g0.a(new ve.g0.b() { // from class: bf.q
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return w.r((j0) xVar);
            }
        }, j0.class, m0.class);
        f4157d = ve.f0.a(new ve.f0.b() { // from class: bf.r
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return w.m((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4158e = ve.n.a(new ve.n.b() { // from class: bf.s
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return w.t((l0) lVar, d0Var);
            }
        }, l0.class, ve.l0.class);
        f4159f = ve.m.a(new ve.m.b() { // from class: bf.t
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return w.o((ve.l0) p0Var, d0Var);
            }
        }, aVarH2, ve.l0.class);
        f4160g = ve.n.a(new ve.n.b() { // from class: bf.u
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return w.s((k0) lVar, d0Var);
            }
        }, k0.class, ve.l0.class);
        f4161h = ve.m.a(new ve.m.b() { // from class: bf.v
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return w.n((ve.l0) p0Var, d0Var);
            }
        }, aVarH, ve.l0.class);
        f4162i = ve.h.a().a(p0.RAW, j0.d.f439e).a(p0.TINK, j0.d.b).a(p0.CRUNCHY, j0.d.f437c).a(p0.LEGACY, j0.d.f438d).b();
        f4163j = ve.h.a().a(ze.b0.SHA256, j0.c.b).a(ze.b0.SHA384, j0.c.f434c).a(ze.b0.SHA512, j0.c.f435d).b();
    }

    public static BigInteger g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return ve.a.a(hVar.x());
    }

    public static df.b h(com.google.crypto.tink.shaded.protobuf.h hVar, oe.d0 d0Var) {
        return df.b.a(ve.a.a(hVar.x()), d0Var);
    }

    public static com.google.crypto.tink.shaded.protobuf.h i(BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.h.e(ve.a.b(bigInteger));
    }

    public static com.google.crypto.tink.shaded.protobuf.h j(df.b bVar, oe.d0 d0Var) {
        return i(bVar.b(d0Var));
    }

    public static ze.s0 k(j0 j0Var) {
        return ze.s0.d0().C((ze.b0) f4163j.c(j0Var.c())).build();
    }

    public static u0 l(l0 l0Var) {
        return u0.i0().E(k(l0Var.e())).D(i(l0Var.d())).C(i(l0Var.e().e())).build();
    }

    public static j0 m(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                r0 r0VarH0 = r0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return j0.b().b(f4163j.b(r0VarH0.e0().c0())).d(g(r0VarH0.f0())).c(r0VarH0.d0()).e(f4162i.b(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static k0 n(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
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
            l0 l0VarA = l0.c().e(j0.b().b(f4163j.b(u0VarN0.g0().c0())).d(g(u0VarN0.e0())).c(bigIntegerG.bitLength()).e(f4162i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
            oe.d0 d0VarB = oe.d0.b(d0Var);
            return k0.d().f(l0VarA).d(h(t0VarR0.m0(), d0VarB), h(t0VarR0.o0(), d0VarB)).e(h(t0VarR0.j0(), d0VarB)).c(h(t0VarR0.k0(), d0VarB), h(t0VarR0.l0(), d0VarB)).b(h(t0VarR0.i0(), d0VarB)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    public static l0 o(ve.l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            u0 u0VarJ0 = u0.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (u0VarJ0.h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerG = g(u0VarJ0.f0());
            return l0.c().e(j0.b().b(f4163j.b(u0VarJ0.g0().c0())).d(g(u0VarJ0.e0())).c(bigIntegerG.bitLength()).e(f4162i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static void p() {
        q(ve.d0.c());
    }

    public static void q(ve.d0 d0Var) {
        d0Var.m(f4156c);
        d0Var.l(f4157d);
        d0Var.k(f4158e);
        d0Var.j(f4159f);
        d0Var.k(f4160g);
        d0Var.j(f4161h);
    }

    public static m0 r(j0 j0Var) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").E(r0.g0().D(k(j0Var)).C(j0Var.d()).E(i(j0Var.e())).build().b()).C((p0) f4162i.c(j0Var.f())).build());
    }

    public static ve.l0 s(k0 k0Var, oe.d0 d0Var) throws GeneralSecurityException {
        oe.d0 d0VarB = oe.d0.b(d0Var);
        return ve.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", t0.q0().O(0).K(l(k0Var.c())).D(j(k0Var.k(), d0VarB)).J(j(k0Var.i(), d0VarB)).N(j(k0Var.j(), d0VarB)).E(j(k0Var.g(), d0VarB)).G(j(k0Var.h(), d0VarB)).C(j(k0Var.e(), d0VarB)).build().b(), ze.f0.c.ASYMMETRIC_PRIVATE, (p0) f4162i.c(k0Var.f().f()), k0Var.a());
    }

    public static ve.l0 t(l0 l0Var, oe.d0 d0Var) {
        return ve.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", l(l0Var).b(), ze.f0.c.ASYMMETRIC_PUBLIC, (p0) f4162i.c(l0Var.e().f()), l0Var.a());
    }
}
