package bf;

import af.r0;
import af.s0;
import af.t0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import ve.l0;
import ve.m0;
import ze.h0;
import ze.p0;
import ze.v0;
import ze.w0;
import ze.x0;
import ze.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f4107a;
    public static final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.g0<r0, m0> f4108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.f0<m0> f4109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.n<t0, l0> f4110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ve.m<l0> f4111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.n<s0, l0> f4112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.m<l0> f4113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ve.h<p0, r0.d> f4114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ve.h<ze.b0, r0.c> f4115j;

    static {
        df.a aVarH = ve.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f4107a = aVarH;
        df.a aVarH2 = ve.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        b = aVarH2;
        f4108c = ve.g0.a(new ve.g0.b() { // from class: bf.y
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return e0.r((r0) xVar);
            }
        }, r0.class, m0.class);
        f4109d = ve.f0.a(new ve.f0.b() { // from class: bf.z
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return e0.m((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4110e = ve.n.a(new ve.n.b() { // from class: bf.a0
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return e0.t((t0) lVar, d0Var);
            }
        }, t0.class, l0.class);
        f4111f = ve.m.a(new ve.m.b() { // from class: bf.b0
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return e0.o((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f4112g = ve.n.a(new ve.n.b() { // from class: bf.c0
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return e0.s((s0) lVar, d0Var);
            }
        }, s0.class, l0.class);
        f4113h = ve.m.a(new ve.m.b() { // from class: bf.d0
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return e0.n((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
        f4114i = ve.h.a().a(p0.RAW, r0.d.f489e).a(p0.TINK, r0.d.b).a(p0.CRUNCHY, r0.d.f487c).a(p0.LEGACY, r0.d.f488d).b();
        f4115j = ve.h.a().a(ze.b0.SHA256, r0.c.b).a(ze.b0.SHA384, r0.c.f484c).a(ze.b0.SHA512, r0.c.f485d).b();
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

    public static w0 k(r0 r0Var) {
        w0.b bVarH0 = w0.h0();
        ve.h<ze.b0, r0.c> hVar = f4115j;
        return bVarH0.E((ze.b0) hVar.c(r0Var.g())).C((ze.b0) hVar.c(r0Var.c())).D(r0Var.f()).build();
    }

    public static y0 l(t0 t0Var) {
        return y0.j0().E(k(t0Var.e())).D(i(t0Var.d())).C(i(t0Var.e().e())).G(0).build();
    }

    public static r0 m(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            v0 v0VarH0 = v0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            r0.b bVarB = r0.b();
            ve.h<ze.b0, r0.c> hVar = f4115j;
            return bVarB.f(hVar.b(v0VarH0.e0().g0())).b(hVar.b(v0VarH0.e0().e0())).d(g(v0VarH0.f0())).c(v0VarH0.d0()).e(v0VarH0.e0().f0()).g(f4114i.b(m0Var.d().e0())).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    public static s0 n(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            x0 x0VarR0 = x0.r0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (x0VarR0.p0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            y0 y0VarN0 = x0VarR0.n0();
            if (y0VarN0.i0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerG = g(y0VarN0.g0());
            int iBitLength = bigIntegerG.bitLength();
            BigInteger bigIntegerG2 = g(y0VarN0.f0());
            r0.b bVarB = r0.b();
            ve.h<ze.b0, r0.c> hVar = f4115j;
            t0 t0VarA = t0.c().e(bVarB.f(hVar.b(y0VarN0.h0().g0())).b(hVar.b(y0VarN0.h0().e0())).d(bigIntegerG2).c(iBitLength).e(y0VarN0.h0().f0()).g(f4114i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
            oe.d0 d0VarB = oe.d0.b(d0Var);
            return s0.d().f(t0VarA).d(h(x0VarR0.m0(), d0VarB), h(x0VarR0.o0(), d0VarB)).e(h(x0VarR0.j0(), d0VarB)).c(h(x0VarR0.k0(), d0VarB), h(x0VarR0.l0(), d0VarB)).b(h(x0VarR0.i0(), d0VarB)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    public static t0 o(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            y0 y0VarK0 = y0.k0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (y0VarK0.i0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            BigInteger bigIntegerG = g(y0VarK0.g0());
            int iBitLength = bigIntegerG.bitLength();
            r0.b bVarB = r0.b();
            ve.h<ze.b0, r0.c> hVar = f4115j;
            return t0.c().e(bVarB.f(hVar.b(y0VarK0.h0().g0())).b(hVar.b(y0VarK0.h0().e0())).d(g(y0VarK0.f0())).c(iBitLength).e(y0VarK0.h0().f0()).g(f4114i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static void p() {
        q(ve.d0.c());
    }

    public static void q(ve.d0 d0Var) {
        d0Var.m(f4108c);
        d0Var.l(f4109d);
        d0Var.k(f4110e);
        d0Var.j(f4111f);
        d0Var.k(f4112g);
        d0Var.j(f4113h);
    }

    public static m0 r(r0 r0Var) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey").E(v0.g0().D(k(r0Var)).C(r0Var.d()).E(i(r0Var.e())).build().b()).C((p0) f4114i.c(r0Var.h())).build());
    }

    public static l0 s(s0 s0Var, oe.d0 d0Var) throws GeneralSecurityException {
        oe.d0 d0VarB = oe.d0.b(d0Var);
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", x0.q0().O(0).K(l(s0Var.c())).D(j(s0Var.k(), d0VarB)).J(j(s0Var.i(), d0VarB)).N(j(s0Var.j(), d0VarB)).E(j(s0Var.g(), d0VarB)).G(j(s0Var.h(), d0VarB)).C(j(s0Var.e(), d0VarB)).build().b(), ze.f0.c.ASYMMETRIC_PRIVATE, (p0) f4114i.c(s0Var.f().h()), s0Var.a());
    }

    public static l0 t(t0 t0Var, oe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", l(t0Var).b(), ze.f0.c.ASYMMETRIC_PUBLIC, (p0) f4114i.c(t0Var.e().h()), t0Var.a());
    }
}
