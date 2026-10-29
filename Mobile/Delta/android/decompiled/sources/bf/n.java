package bf;

import java.security.GeneralSecurityException;
import ve.l0;
import ve.m0;
import ve.s0;
import ze.h0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f4142a;
    public static final df.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.g0<af.i, m0> f4143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.f0<m0> f4144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.n<af.o, l0> f4145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ve.m<l0> f4146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.n<af.j, l0> f4147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ve.m<l0> f4148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ve.h<p0, af.i.a> f4149i;

    static {
        df.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f4142a = aVarH;
        df.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        b = aVarH2;
        f4143c = ve.g0.a(new ve.g0.b() { // from class: bf.h
            @Override // ve.g0.b
            public final ve.p0 a(oe.x xVar) {
                return n.m((af.i) xVar);
            }
        }, af.i.class, m0.class);
        f4144d = ve.f0.a(new ve.f0.b() { // from class: bf.i
            @Override // ve.f0.b
            public final oe.x a(ve.p0 p0Var) {
                return n.h((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4145e = ve.n.a(new ve.n.b() { // from class: bf.j
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return n.o((af.o) lVar, d0Var);
            }
        }, af.o.class, l0.class);
        f4146f = ve.m.a(new ve.m.b() { // from class: bf.k
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return n.j((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f4147g = ve.n.a(new ve.n.b() { // from class: bf.l
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, oe.d0 d0Var) {
                return n.n((af.j) lVar, d0Var);
            }
        }, af.j.class, l0.class);
        f4148h = ve.m.a(new ve.m.b() { // from class: bf.m
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, oe.d0 d0Var) {
                return n.i((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
        f4149i = ve.h.a().a(p0.RAW, af.i.a.f420e).a(p0.TINK, af.i.a.b).a(p0.CRUNCHY, af.i.a.f418c).a(p0.LEGACY, af.i.a.f419d).b();
    }

    public static ze.y g(af.o oVar) {
        return ze.y.e0().C(com.google.crypto.tink.shaded.protobuf.h.e(oVar.f().d())).build();
    }

    public static af.i h(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            if (ze.w.c0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).b0() == 0) {
                return af.i.b(f4149i.b(m0Var.d().e0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    public static af.j i(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            ze.x xVarG0 = ze.x.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (xVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ze.y yVarD0 = xVarG0.d0();
            if (yVarD0.d0() == 0) {
                return af.j.d(af.o.c(f4149i.b(l0Var.e()), df.a.a(yVarD0.c0().x()), l0Var.c()), df.c.a(xVarG0.c0().x(), oe.d0.b(d0Var)));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    public static af.o j(l0 l0Var, oe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            ze.y yVarF0 = ze.y.f0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (yVarF0.d0() == 0) {
                return af.o.c(f4149i.b(l0Var.e()), df.a.a(yVarF0.c0().x()), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static void k() {
        l(ve.d0.c());
    }

    public static void l(ve.d0 d0Var) {
        d0Var.m(f4143c);
        d0Var.l(f4144d);
        d0Var.k(f4145e);
        d0Var.j(f4146f);
        d0Var.k(f4147g);
        d0Var.j(f4148h);
    }

    public static m0 m(af.i iVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").E(ze.w.a0().b()).C((p0) f4149i.c(iVar.c())).build());
    }

    public static l0 n(af.j jVar, oe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ze.x.f0().D(g(jVar.c())).C(com.google.crypto.tink.shaded.protobuf.h.e(jVar.f().d(oe.d0.b(d0Var)))).build().b(), ze.f0.c.ASYMMETRIC_PRIVATE, (p0) f4149i.c(jVar.e().c()), jVar.a());
    }

    public static l0 o(af.o oVar, oe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", g(oVar).b(), ze.f0.c.ASYMMETRIC_PUBLIC, (p0) f4149i.c(oVar.e().c()), oVar.a());
    }
}
