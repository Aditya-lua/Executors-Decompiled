package xe;

import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import oe.d0;
import oe.x;
import ve.f0;
import ve.g0;
import ve.l0;
import ve.m0;
import ve.s0;
import we.o;
import ze.b0;
import ze.c0;
import ze.e0;
import ze.h0;
import ze.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final df.a f35170a;
    public static final ve.h<p0, o.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.h<b0, o.c> f35171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0<o, m0> f35172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0<m0> f35173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ve.n<we.i, l0> f35174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ve.m<l0> f35175g;

    static {
        df.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f35170a = aVarH;
        b = ve.h.a().a(p0.RAW, o.d.f34229e).a(p0.TINK, o.d.b).a(p0.LEGACY, o.d.f34228d).a(p0.CRUNCHY, o.d.f34227c).b();
        f35171c = ve.h.a().a(b0.SHA1, o.c.b).a(b0.SHA224, o.c.f34222c).a(b0.SHA256, o.c.f34223d).a(b0.SHA384, o.c.f34224e).a(b0.SHA512, o.c.f34225f).b();
        f35172d = g0.a(new g0.b() { // from class: xe.i
            @Override // ve.g0.b
            public final ve.p0 a(x xVar) {
                return m.k((o) xVar);
            }
        }, o.class, m0.class);
        f35173e = f0.a(new f0.b() { // from class: xe.j
            @Override // ve.f0.b
            public final x a(ve.p0 p0Var) {
                return m.g((m0) p0Var);
            }
        }, aVarH, m0.class);
        f35174f = ve.n.a(new ve.n.b() { // from class: xe.k
            @Override // ve.n.b
            public final ve.p0 a(oe.l lVar, d0 d0Var) {
                return m.j((we.i) lVar, d0Var);
            }
        }, we.i.class, l0.class);
        f35175g = ve.m.a(new ve.m.b() { // from class: xe.l
            @Override // ve.m.b
            public final oe.l a(ve.p0 p0Var, d0 d0Var) {
                return m.f((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static e0 e(o oVar) {
        return e0.f0().D(oVar.c()).C((b0) f35171c.c(oVar.d())).build();
    }

    public static we.i f(l0 l0Var, d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            c0 c0VarH0 = c0.h0(l0Var.g(), p.b());
            if (c0VarH0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return we.i.b().e(o.b().c(c0VarH0.d0().size()).d(c0VarH0.e0().e0()).b(f35171c.b(c0VarH0.e0().d0())).e(b.b(l0Var.e())).a()).d(df.c.a(c0VarH0.d0().x(), d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static o g(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            ze.d0 d0VarH0 = ze.d0.h0(m0Var.d().g0(), p.b());
            if (d0VarH0.f0() == 0) {
                return o.b().c(d0VarH0.d0()).d(d0VarH0.e0().e0()).b(f35171c.b(d0VarH0.e0().d0())).e(b.b(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + d0VarH0.f0());
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static void h() {
        i(ve.d0.c());
    }

    public static void i(ve.d0 d0Var) {
        d0Var.m(f35172d);
        d0Var.l(f35173e);
        d0Var.k(f35174f);
        d0Var.j(f35175g);
    }

    public static l0 j(we.i iVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.HmacKey", c0.g0().D(e(iVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(iVar.c().d(d0.b(d0Var)))).build().b(), ze.f0.c.SYMMETRIC, (p0) b.c(iVar.e().g()), iVar.a());
    }

    public static m0 k(o oVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.HmacKey").E(ze.d0.g0().D(e(oVar)).C(oVar.e()).build().b()).C((p0) b.c(oVar.g())).build());
    }
}
