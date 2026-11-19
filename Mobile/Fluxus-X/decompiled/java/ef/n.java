package ef;

import cf.h0;
import cf.p0;
import java.security.GeneralSecurityException;
import ye.l0;
import ye.m0;
import ye.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f13416a;
    public static final gf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.g0<df.i, m0> f13417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.f0<m0> f13418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.n<df.o, l0> f13419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ye.m<l0> f13420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ye.n<df.j, l0> f13421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ye.m<l0> f13422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ye.h<p0, df.i.a> f13423i;

    static {
        gf.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        f13416a = aVarH;
        gf.a aVarH2 = s0.h("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        b = aVarH2;
        f13417c = ye.g0.a(new ye.g0.b() { // from class: ef.h
            @Override // ye.g0.b
            public final ye.p0 a(re.x xVar) {
                return n.m((df.i) xVar);
            }
        }, df.i.class, m0.class);
        f13418d = ye.f0.a(new ye.f0.b() { // from class: ef.i
            @Override // ye.f0.b
            public final re.x a(ye.p0 p0Var) {
                return n.h((m0) p0Var);
            }
        }, aVarH, m0.class);
        f13419e = ye.n.a(new ye.n.b() { // from class: ef.j
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return n.o((df.o) lVar, d0Var);
            }
        }, df.o.class, l0.class);
        f13420f = ye.m.a(new ye.m.b() { // from class: ef.k
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return n.j((l0) p0Var, d0Var);
            }
        }, aVarH2, l0.class);
        f13421g = ye.n.a(new ye.n.b() { // from class: ef.l
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, re.d0 d0Var) {
                return n.n((df.j) lVar, d0Var);
            }
        }, df.j.class, l0.class);
        f13422h = ye.m.a(new ye.m.b() { // from class: ef.m
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, re.d0 d0Var) {
                return n.i((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
        f13423i = ye.h.a().a(p0.RAW, df.i.a.f12290e).a(p0.TINK, df.i.a.b).a(p0.CRUNCHY, df.i.a.f12288c).a(p0.LEGACY, df.i.a.f12289d).b();
    }

    public static cf.y g(df.o oVar) {
        return cf.y.e0().D(com.google.crypto.tink.shaded.protobuf.h.e(oVar.f().d())).build();
    }

    public static df.i h(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            if (cf.w.c0(m0Var.d().g0(), com.google.crypto.tink.shaded.protobuf.p.b()).b0() == 0) {
                return df.i.b(f13423i.b(m0Var.d().e0()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
        }
    }

    public static df.j i(l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: " + l0Var.f());
        }
        try {
            cf.x xVarG0 = cf.x.g0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (xVarG0.e0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            cf.y yVarD0 = xVarG0.d0();
            if (yVarD0.d0() == 0) {
                return df.j.d(df.o.c(f13423i.b(l0Var.e()), gf.a.a(yVarD0.c0().v()), l0Var.c()), gf.c.a(xVarG0.c0().v(), re.d0.b(d0Var)));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    public static df.o j(l0 l0Var, re.d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: " + l0Var.f());
        }
        try {
            cf.y yVarF0 = cf.y.f0(l0Var.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (yVarF0.d0() == 0) {
                return df.o.c(f13423i.b(l0Var.e()), gf.a.a(yVarF0.c0().v()), l0Var.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static void k() {
        l(ye.d0.c());
    }

    public static void l(ye.d0 d0Var) {
        d0Var.m(f13417c);
        d0Var.l(f13418d);
        d0Var.k(f13419e);
        d0Var.j(f13420f);
        d0Var.k(f13421g);
        d0Var.j(f13422h);
    }

    public static m0 m(df.i iVar) {
        return m0.c(h0.h0().F("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey").G(cf.w.a0().b()).D((p0) f13423i.c(iVar.c())).build());
    }

    public static l0 n(df.j jVar, re.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", cf.x.f0().F(g(jVar.c())).D(com.google.crypto.tink.shaded.protobuf.h.e(jVar.f().d(re.d0.b(d0Var)))).build().b(), cf.f0.c.ASYMMETRIC_PRIVATE, (p0) f13423i.c(jVar.e().c()), jVar.a());
    }

    public static l0 o(df.o oVar, re.d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", g(oVar).b(), cf.f0.c.ASYMMETRIC_PUBLIC, (p0) f13423i.c(oVar.e().c()), oVar.a());
    }
}
