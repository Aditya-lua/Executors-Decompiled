package ye;

import af.b0;
import af.c0;
import af.e0;
import af.h0;
import af.p0;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import pe.d0;
import pe.x;
import we.f0;
import we.g0;
import we.l0;
import we.m0;
import we.s0;
import xe.o;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ef.a f36680a;
    public static final we.h<p0, o.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.h<b0, o.c> f36681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0<o, m0> f36682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0<m0> f36683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.n<xe.i, l0> f36684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final we.m<l0> f36685g;

    static {
        ef.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f36680a = aVarH;
        b = we.h.a().a(p0.RAW, o.d.f35728e).a(p0.TINK, o.d.b).a(p0.LEGACY, o.d.f35727d).a(p0.CRUNCHY, o.d.f35726c).b();
        f36681c = we.h.a().a(b0.SHA1, o.c.b).a(b0.SHA224, o.c.f35721c).a(b0.SHA256, o.c.f35722d).a(b0.SHA384, o.c.f35723e).a(b0.SHA512, o.c.f35724f).b();
        f36682d = g0.a(new g0.b() { // from class: ye.i
            @Override // we.g0.b
            public final we.p0 a(x xVar) {
                return m.k((o) xVar);
            }
        }, o.class, m0.class);
        f36683e = f0.a(new f0.b() { // from class: ye.j
            @Override // we.f0.b
            public final x a(we.p0 p0Var) {
                return m.g((m0) p0Var);
            }
        }, aVarH, m0.class);
        f36684f = we.n.a(new we.n.b() { // from class: ye.k
            @Override // we.n.b
            public final we.p0 a(pe.l lVar, d0 d0Var) {
                return m.j((xe.i) lVar, d0Var);
            }
        }, xe.i.class, l0.class);
        f36685g = we.m.a(new we.m.b() { // from class: ye.l
            @Override // we.m.b
            public final pe.l a(we.p0 p0Var, d0 d0Var) {
                return m.f((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static e0 e(o oVar) {
        return e0.f0().D(oVar.c()).C((b0) f36681c.c(oVar.d())).build();
    }

    public static xe.i f(l0 l0Var, d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            c0 c0VarH0 = c0.h0(l0Var.g(), p.b());
            if (c0VarH0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return xe.i.b().e(o.b().c(c0VarH0.d0().size()).d(c0VarH0.e0().e0()).b(f36681c.b(c0VarH0.e0().d0())).e(b.b(l0Var.e())).a()).d(ef.c.a(c0VarH0.d0().x(), d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static o g(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            af.d0 d0VarH0 = af.d0.h0(m0Var.d().g0(), p.b());
            if (d0VarH0.f0() == 0) {
                return o.b().c(d0VarH0.d0()).d(d0VarH0.e0().e0()).b(f36681c.b(d0VarH0.e0().d0())).e(b.b(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + d0VarH0.f0());
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static void h() {
        i(we.d0.c());
    }

    public static void i(we.d0 d0Var) {
        d0Var.m(f36682d);
        d0Var.l(f36683e);
        d0Var.k(f36684f);
        d0Var.j(f36685g);
    }

    public static l0 j(xe.i iVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.HmacKey", c0.g0().D(e(iVar.e())).C(com.google.crypto.tink.shaded.protobuf.h.e(iVar.c().d(d0.b(d0Var)))).build().b(), af.f0.c.SYMMETRIC, (p0) b.c(iVar.e().g()), iVar.a());
    }

    public static m0 k(o oVar) {
        return m0.c(h0.h0().D("type.googleapis.com/google.crypto.tink.HmacKey").E(af.d0.g0().D(e(oVar)).C(oVar.e()).build().b()).C((p0) b.c(oVar.g())).build());
    }
}
