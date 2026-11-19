package ef;

import cf.h0;
import cf.p0;
import cf.v0;
import cf.w0;
import cf.x0;
import cf.y0;
import df.r0;
import df.s0;
import df.t0;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import ye.l0;
import ye.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f13381a;
    public static final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.g0<r0, m0> f13382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.f0<m0> f13383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.n<t0, l0> f13384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ye.m<l0> f13385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ye.n<s0, l0> f13386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ye.m<l0> f13387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ye.h<p0, r0.d> f13388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ye.h<cf.b0, r0.c> f13389j;

    static {
        gf.a aVarH = ye.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        f13381a = aVarH;
        gf.a aVarH2 = ye.s0.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        b = aVarH2;
        f13382c = ye.g0.a(new ye.g0.b() { // from class: ef.y
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return e0.r((r0) xVar);
            }
        }, r0.class, m0.class);
        f13383d = ye.f0.a(new ye.f0.b() { // from class: ef.z
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return e0.m((m0) p0Var);
            }
        }, aVarH, m0.class);
        f13384e = ye.n.a(new ye.n.b() { // from class: ef.a0
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return e0.t((t0) lVar, d0Var);
            }
        }, t0.class, l0.class);
        f13385f = ye.m.a(new ye.m.b() { // from class: ef.b0
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return e0.o((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f13386g = ye.n.a(new ye.n.b() { // from class: ef.c0
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return e0.s((s0) lVar, d0Var);
            }
        }, s0.class, l0.class);
        f13387h = ye.m.a(new ye.m.b() { // from class: ef.d0
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return e0.n((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
        f13388i = ye.h.a().a(p0.RAW, r0.d.f12359e).a(p0.TINK, r0.d.b).a(p0.CRUNCHY, r0.d.f12357c).a(p0.LEGACY, r0.d.f12358d).b();
        f13389j = ye.h.a().a(cf.b0.SHA256, r0.c.b).a(cf.b0.SHA384, r0.c.f12354c).a(cf.b0.SHA512, r0.c.f12355d).b();
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

    public static w0 k(r0 r0Var) {
        w0.b bVarH0 = w0.h0();
        ye.h<cf.b0, r0.c> hVar = f13389j;
        return bVarH0.G((cf.b0) hVar.c(r0Var.g())).D((cf.b0) hVar.c(r0Var.c())).F(r0Var.f()).build();
    }

    public static y0 l(t0 t0Var) {
        return y0.j0().G(k(t0Var.e())).F(i(t0Var.d())).D(i(t0Var.e().e())).H(0).build();
    }

    public static r0 m(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            v0 v0VarH0 = v0.h0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b());
            r0.b bVarB = r0.b();
            ye.h<cf.b0, r0.c> hVar = f13389j;
            return bVarB.f(hVar.b(v0VarH0.e0().g0())).b(hVar.b(v0VarH0.e0().e0())).d(g(v0VarH0.f0())).c(v0VarH0.d0()).e(v0VarH0.e0().f0()).g(f13388i.b(m0Var.d().e0())).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e10);
        }
    }

    public static s0 n(l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
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
            ye.h<cf.b0, r0.c> hVar = f13389j;
            t0 t0VarA = t0.c().e(bVarB.f(hVar.b(y0VarN0.h0().g0())).b(hVar.b(y0VarN0.h0().e0())).d(bigIntegerG2).c(iBitLength).e(y0VarN0.h0().f0()).g(f13388i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
            re.d0 d0VarB = re.d0.b(d0Var);
            return s0.d().f(t0VarA).d(h(x0VarR0.m0(), d0VarB), h(x0VarR0.o0(), d0VarB)).e(h(x0VarR0.j0(), d0VarB)).c(h(x0VarR0.k0(), d0VarB), h(x0VarR0.l0(), d0VarB)).b(h(x0VarR0.i0(), d0VarB)).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
        }
    }

    public static t0 o(l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
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
            ye.h<cf.b0, r0.c> hVar = f13389j;
            return t0.c().e(bVarB.f(hVar.b(y0VarK0.h0().g0())).b(hVar.b(y0VarK0.h0().e0())).d(g(y0VarK0.f0())).c(iBitLength).e(y0VarK0.h0().f0()).g(f13388i.b(l0Var.e())).a()).d(bigIntegerG).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
        }
    }

    public static void p() {
        q(ye.d0.c());
    }

    public static void q(ye.d0 d0Var) {
        d0Var.m(f13382c);
        d0Var.l(f13383d);
        d0Var.k(f13384e);
        d0Var.j(f13385f);
        d0Var.k(f13386g);
        d0Var.j(f13387h);
    }

    public static m0 r(r0 r0Var) {
        return m0.c(h0.h0().F("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey").G(v0.g0().F(k(r0Var)).D(r0Var.d()).G(i(r0Var.e())).build().b()).D((p0) f13388i.c(r0Var.h())).build());
    }

    public static l0 s(s0 s0Var, re.d0 d0Var) throws GeneralSecurityException {
        re.d0 d0VarB = re.d0.b(d0Var);
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", x0.q0().P(0).M(l(s0Var.c())).F(j(s0Var.k(), d0VarB)).J(j(s0Var.i(), d0VarB)).O(j(s0Var.j(), d0VarB)).G(j(s0Var.g(), d0VarB)).H(j(s0Var.h(), d0VarB)).D(j(s0Var.e(), d0VarB)).build().b(), cf.f0.c.ASYMMETRIC_PRIVATE, (p0) f13388i.c(s0Var.f().h()), s0Var.a());
    }

    public static l0 t(t0 t0Var, re.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", l(t0Var).b(), cf.f0.c.ASYMMETRIC_PUBLIC, (p0) f13388i.c(t0Var.e().h()), t0Var.a());
    }
}
