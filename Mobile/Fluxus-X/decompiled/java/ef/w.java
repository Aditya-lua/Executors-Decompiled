package ef;

import cf.h0;
import cf.p0;
import cf.r0;
import cf.t0;
import cf.u0;
import df.j0;
import df.k0;
import df.l0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import ye.m0;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f13429a;
    public static final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.g0<j0, m0> f13430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.f0<m0> f13431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.n<l0, ye.l0> f13432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ye.m<ye.l0> f13433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ye.n<k0, ye.l0> f13434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ye.m<ye.l0> f13435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ye.h<p0, j0.d> f13436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ye.h<cf.b0, j0.c> f13437j;

    static {
        gf.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        f13429a = aVarH;
        gf.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        b = aVarH2;
        f13430c = ye.g0.a(new ye.g0.b() { // from class: ef.q
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return w.r((j0) xVar);
            }
        }, j0.class, m0.class);
        f13431d = ye.f0.a(new ye.f0.b() { // from class: ef.r
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return w.m((m0) p0Var);
            }
        }, aVarH, m0.class);
        f13432e = ye.n.a(new ye.n.b() { // from class: ef.s
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return w.t((l0) lVar, d0Var);
            }
        }, l0.class, ye.l0.class);
        f13433f = ye.m.a(new ye.m.b() { // from class: ef.t
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return w.o((ye.l0) p0Var, d0Var);
            }
        }, aVarH2, ye.l0.class);
        f13434g = ye.n.a(new ye.n.b() { // from class: ef.u
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return w.s((k0) lVar, d0Var);
            }
        }, k0.class, ye.l0.class);
        f13435h = ye.m.a(new ye.m.b() { // from class: ef.v
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return w.n((ye.l0) p0Var, d0Var);
            }
        }, aVarH, ye.l0.class);
        f13436i = ye.h.a().a(p0.RAW, j0.d.f12309e).a(p0.TINK, j0.d.b).a(p0.CRUNCHY, j0.d.f12307c).a(p0.LEGACY, j0.d.f12308d).b();
        f13437j = ye.h.a().a(cf.b0.SHA256, j0.c.b).a(cf.b0.SHA384, j0.c.f12304c).a(cf.b0.SHA512, j0.c.f12305d).b();
    }

    public static BigInteger g(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return ye.a.a(hVar.v());
    }

    public static gf.b h(com.google.crypto.tink.shaded.protobuf.h hVar, re.d0 d0Var) {
        return gf.b.a(ye.a.a(hVar.v()), d0Var);
    }

    public static com.google.crypto.tink.shaded.protobuf.h i(BigInteger bigInteger) {
        return com.google.crypto.tink.shaded.protobuf.h.e(ye.a.b(bigInteger));
    }

    public static com.google.crypto.tink.shaded.protobuf.h j(gf.b bVar, re.d0 d0Var) {
        return i(bVar.b(d0Var));
    }

    public static cf.s0 k(j0 j0Var) {
        return cf.s0.d0().D((cf.b0) f13437j.c(j0Var.c())).build();
    }

    public static u0 l(l0 l0Var) {
        return u0.i0().G(k(l0Var.e())).F(i(l0Var.d())).D(i(l0Var.e().e())).build();
    }

    public static j0 m(m0 m0Var) throws GeneralSecurityException {
        if (m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
            try {
                r0 r0VarH0 = r0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
                return j0.b().b(f13437j.b(r0VarH0.e0().c0())).d(g(r0VarH0.f0())).c(r0VarH0.d0()).e(f13436i.b(m0Var.d().e0())).a();
            } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
                throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: " + m0Var.d().f0());
    }

    public static k0 n(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
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
            l0 l0VarA = l0.c().e(j0.b().b(f13437j.b(u0VarN0.g0().c0())).d(g(u0VarN0.e0())).c(bigIntegerG.bitLength()).e(f13436i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
            re.d0 d0VarB = re.d0.b(d0Var);
            return k0.d().f(l0VarA).d(h(t0VarR0.m0(), d0VarB), h(t0VarR0.o0(), d0VarB)).e(h(t0VarR0.j0(), d0VarB)).c(h(t0VarR0.k0(), d0VarB), h(t0VarR0.l0(), d0VarB)).b(h(t0VarR0.i0(), d0VarB)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
        }
    }

    public static l0 o(ye.l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            u0 u0VarJ0 = u0.j0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (u0VarJ0.h0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerG = g(u0VarJ0.f0());
            return l0.c().e(j0.b().b(f13437j.b(u0VarJ0.g0().c0())).d(g(u0VarJ0.e0())).c(bigIntegerG.bitLength()).e(f13436i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
        }
    }

    public static void p() {
        q(ye.d0.c());
    }

    public static void q(ye.d0 d0Var) {
        d0Var.m(f13430c);
        d0Var.l(f13431d);
        d0Var.k(f13432e);
        d0Var.j(f13433f);
        d0Var.k(f13434g);
        d0Var.j(f13435h);
    }

    public static m0 r(j0 j0Var) {
        return m0.c(h0.h0().F("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey").G(r0.g0().F(k(j0Var)).D(j0Var.d()).G(i(j0Var.e())).build().b()).D((p0) f13436i.c(j0Var.f())).build());
    }

    public static ye.l0 s(k0 k0Var, re.d0 d0Var) throws GeneralSecurityException {
        re.d0 d0VarB = re.d0.b(d0Var);
        return ye.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", t0.q0().P(0).M(l(k0Var.c())).F(j(k0Var.k(), d0VarB)).J(j(k0Var.i(), d0VarB)).O(j(k0Var.j(), d0VarB)).G(j(k0Var.g(), d0VarB)).H(j(k0Var.h(), d0VarB)).D(j(k0Var.e(), d0VarB)).build().b(), cf.f0.c.ASYMMETRIC_PRIVATE, (p0) f13436i.c(k0Var.f().f()), k0Var.a());
    }

    public static ye.l0 t(l0 l0Var, re.d0 d0Var) {
        return ye.l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", l(l0Var).b(), cf.f0.c.ASYMMETRIC_PUBLIC, (p0) f13436i.c(l0Var.e().f()), l0Var.a());
    }
}
