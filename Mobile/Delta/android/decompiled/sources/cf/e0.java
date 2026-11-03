package cf;

import af.h0;
import af.p0;
import af.v0;
import af.w0;
import af.x0;
import af.y0;
import bf.r0;
import bf.s0;
import bf.t0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import we.l0;
import we.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f4878a;
    public static final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.g0<r0, m0> f4879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.n<t0, l0> f4881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.m<l0> f4882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.n<s0, l0> f4883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final we.m<l0> f4884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final we.h<p0, r0.d> f4885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final we.h<af.b0, r0.c> f4886j;

    static {
        ef.a aVarH = we.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f4878a = aVarH;
        ef.a aVarH2 = we.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        b = aVarH2;
        f4879c = we.g0.a(new we.g0.b() { // from class: cf.y
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return e0.r((r0) xVar);
            }
        }, r0.class, m0.class);
        f4880d = we.f0.a(new we.f0.b() { // from class: cf.z
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return e0.m((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4881e = we.n.a(new we.n.b() { // from class: cf.a0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return e0.t((t0) lVar, d0Var);
            }
        }, t0.class, l0.class);
        f4882f = we.m.a(new we.m.b() { // from class: cf.b0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return e0.o((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f4883g = we.n.a(new we.n.b() { // from class: cf.c0
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return e0.s((s0) lVar, d0Var);
            }
        }, s0.class, l0.class);
        f4884h = we.m.a(new we.m.b() { // from class: cf.d0
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return e0.n((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
        f4885i = we.h.a().a(p0.RAW, r0.d.f4161e).a(p0.TINK, r0.d.b).a(p0.CRUNCHY, r0.d.f4159c).a(p0.LEGACY, r0.d.f4160d).b();
        f4886j = we.h.a().a(af.b0.SHA256, r0.c.b).a(af.b0.SHA384, r0.c.f4156c).a(af.b0.SHA512, r0.c.f4157d).b();
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

    public static w0 k(r0 r0Var) {
        w0.b bVarH0 = w0.h0();
        we.h<af.b0, r0.c> hVar = f4886j;
        return bVarH0.E((af.b0) hVar.c(r0Var.g())).C((af.b0) hVar.c(r0Var.c())).D(r0Var.f()).build();
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
            we.h<af.b0, r0.c> hVar = f4886j;
            return bVarB.f(hVar.b(v0VarH0.e0().g0())).b(hVar.b(v0VarH0.e0().e0())).d(g(v0VarH0.f0())).c(v0VarH0.d0()).e(v0VarH0.e0().f0()).g(f4885i.b(m0Var.d().e0())).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    public static s0 n(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
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
            we.h<af.b0, r0.c> hVar = f4886j;
            t0 t0VarA = t0.c().e(bVarB.f(hVar.b(y0VarN0.h0().g0())).b(hVar.b(y0VarN0.h0().e0())).d(bigIntegerG2).c(iBitLength).e(y0VarN0.h0().f0()).g(f4885i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
            pe.d0 d0VarB = pe.d0.b(d0Var);
            return s0.d().f(t0VarA).d(h(x0VarR0.m0(), d0VarB), h(x0VarR0.o0(), d0VarB)).e(h(x0VarR0.j0(), d0VarB)).c(h(x0VarR0.k0(), d0VarB), h(x0VarR0.l0(), d0VarB)).b(h(x0VarR0.i0(), d0VarB)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    public static t0 o(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
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
            we.h<af.b0, r0.c> hVar = f4886j;
            return t0.c().e(bVarB.f(hVar.b(y0VarK0.h0().g0())).b(hVar.b(y0VarK0.h0().e0())).d(g(y0VarK0.f0())).c(iBitLength).e(y0VarK0.h0().f0()).g(f4885i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static void p() {
        q(we.d0.c());
    }

    public static void q(we.d0 d0Var) {
        d0Var.m(f4879c);
        d0Var.l(f4880d);
        d0Var.k(f4881e);
        d0Var.j(f4882f);
        d0Var.k(f4883g);
        d0Var.j(f4884h);
    }

    public static m0 r(r0 r0Var) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey").E(v0.g0().D(k(r0Var)).C(r0Var.d()).E(i(r0Var.e())).build().b()).C((p0) f4885i.c(r0Var.h())).build());
    }

    public static l0 s(s0 s0Var, pe.d0 d0Var) throws GeneralSecurityException {
        pe.d0 d0VarB = pe.d0.b(d0Var);
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", x0.q0().O(0).K(l(s0Var.c())).D(j(s0Var.k(), d0VarB)).J(j(s0Var.i(), d0VarB)).N(j(s0Var.j(), d0VarB)).E(j(s0Var.g(), d0VarB)).G(j(s0Var.h(), d0VarB)).C(j(s0Var.e(), d0VarB)).build().b(), af.f0.c.ASYMMETRIC_PRIVATE, (p0) f4885i.c(s0Var.f().h()), s0Var.a());
    }

    public static l0 t(t0 t0Var, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", l(t0Var).b(), af.f0.c.ASYMMETRIC_PUBLIC, (p0) f4885i.c(t0Var.e().h()), t0Var.a());
    }
}
