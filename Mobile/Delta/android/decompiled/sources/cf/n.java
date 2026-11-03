package cf;

import af.h0;
import af.p0;
import java.security.GeneralSecurityException;
import we.l0;
import we.m0;
import we.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f4913a;
    public static final ef.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.g0<bf.i, m0> f4914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.f0<m0> f4915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.n<bf.o, l0> f4916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.m<l0> f4917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.n<bf.j, l0> f4918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final we.m<l0> f4919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final we.h<p0, bf.i.a> f4920i;

    static {
        ef.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f4913a = aVarH;
        ef.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        b = aVarH2;
        f4914c = we.g0.a(new we.g0.b() { // from class: cf.h
            @Override // we.g0.b
            public final we.p0 a(pe.x xVar) {
                return n.m((bf.i) xVar);
            }
        }, bf.i.class, m0.class);
        f4915d = we.f0.a(new we.f0.b() { // from class: cf.i
            @Override // we.f0.b
            public final pe.x a(we.p0 p0Var) {
                return n.h((m0) p0Var);
            }
        }, aVarH, m0.class);
        f4916e = we.n.a(new we.n.b() { // from class: cf.j
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return n.o((bf.o) lVar, d0Var);
            }
        }, bf.o.class, l0.class);
        f4917f = we.m.a(new we.m.b() { // from class: cf.k
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return n.j((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f4918g = we.n.a(new we.n.b() { // from class: cf.l
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, pe.d0 d0Var) {
                return n.n((bf.j) lVar, d0Var);
            }
        }, bf.j.class, l0.class);
        f4919h = we.m.a(new we.m.b() { // from class: cf.m
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, pe.d0 d0Var) {
                return n.i((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
        f4920i = we.h.a().a(p0.RAW, bf.i.a.f4092e).a(p0.TINK, bf.i.a.b).a(p0.CRUNCHY, bf.i.a.f4090c).a(p0.LEGACY, bf.i.a.f4091d).b();
    }

    public static af.y g(bf.o oVar) {
        return af.y.e0().C(com.google.crypto.tink.shaded.protobuf.h.e(oVar.f().d())).build();
    }

    public static bf.i h(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            if (af.w.c0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).b0() == 0) {
                return bf.i.b(f4920i.b(m0Var.d().e0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    public static bf.j i(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            af.x xVarG0 = af.x.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (xVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            af.y yVarD0 = xVarG0.d0();
            if (yVarD0.d0() == 0) {
                return bf.j.d(bf.o.c(f4920i.b(l0Var.e()), ef.a.a(yVarD0.c0().x()), l0Var.c()), ef.c.a(xVarG0.c0().x(), pe.d0.b(d0Var)));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    public static bf.o j(l0 l0Var, pe.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            af.y yVarF0 = af.y.f0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (yVarF0.d0() == 0) {
                return bf.o.c(f4920i.b(l0Var.e()), ef.a.a(yVarF0.c0().x()), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static void k() {
        l(we.d0.c());
    }

    public static void l(we.d0 d0Var) {
        d0Var.m(f4914c);
        d0Var.l(f4915d);
        d0Var.k(f4916e);
        d0Var.j(f4917f);
        d0Var.k(f4918g);
        d0Var.j(f4919h);
    }

    public static m0 m(bf.i iVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").E(af.w.a0().b()).C((p0) f4920i.c(iVar.c())).build());
    }

    public static l0 n(bf.j jVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", af.x.f0().D(g(jVar.c())).C(com.google.crypto.tink.shaded.protobuf.h.e(jVar.f().d(pe.d0.b(d0Var)))).build().b(), af.f0.c.ASYMMETRIC_PRIVATE, (p0) f4920i.c(jVar.e().c()), jVar.a());
    }

    public static l0 o(bf.o oVar, pe.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", g(oVar).b(), af.f0.c.ASYMMETRIC_PUBLIC, (p0) f4920i.c(oVar.e().c()), oVar.a());
    }
}
