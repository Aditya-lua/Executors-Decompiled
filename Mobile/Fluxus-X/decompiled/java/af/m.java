package af;

import cf.b0;
import cf.c0;
import cf.e0;
import cf.h0;
import cf.p0;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import re.d0;
import re.x;
import ye.f0;
import ye.g0;
import ye.l0;
import ye.m0;
import ye.s0;
import ze.o;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gf.a f420a;
    public static final ye.h<p0, o.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.h<b0, o.c> f421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0<o, m0> f422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0<m0> f423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ye.n<ze.i, l0> f424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ye.m<l0> f425g;

    static {
        gf.a aVarH = s0.h("type.googleapis.com/google.crypto.tink.HmacKey");
        f420a = aVarH;
        b = ye.h.a().a(p0.RAW, o.d.f39279e).a(p0.TINK, o.d.b).a(p0.LEGACY, o.d.f39278d).a(p0.CRUNCHY, o.d.f39277c).b();
        f421c = ye.h.a().a(b0.SHA1, o.c.b).a(b0.SHA224, o.c.f39272c).a(b0.SHA256, o.c.f39273d).a(b0.SHA384, o.c.f39274e).a(b0.SHA512, o.c.f39275f).b();
        f422d = g0.a(new g0.b() { // from class: af.i
            @Override // ye.g0.b
            public final ye.p0 a(x xVar) {
                return m.k((o) xVar);
            }
        }, o.class, m0.class);
        f423e = f0.a(new f0.b() { // from class: af.j
            @Override // ye.f0.b
            public final x a(ye.p0 p0Var) {
                return m.g((m0) p0Var);
            }
        }, aVarH, m0.class);
        f424f = ye.n.a(new ye.n.b() { // from class: af.k
            @Override // ye.n.b
            public final ye.p0 a(re.l lVar, d0 d0Var) {
                return m.j((ze.i) lVar, d0Var);
            }
        }, ze.i.class, l0.class);
        f425g = ye.m.a(new ye.m.b() { // from class: af.l
            @Override // ye.m.b
            public final re.l a(ye.p0 p0Var, d0 d0Var) {
                return m.f((l0) p0Var, d0Var);
            }
        }, aVarH, l0.class);
    }

    public static e0 e(o oVar) {
        return e0.f0().F(oVar.c()).D((b0) f421c.c(oVar.d())).build();
    }

    public static ze.i f(l0 l0Var, d0 d0Var) throws GeneralSecurityException {
        if (!l0Var.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            c0 c0VarH0 = c0.h0(l0Var.g(), p.b());
            if (c0VarH0.f0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return ze.i.b().e(o.b().c(c0VarH0.d0().size()).d(c0VarH0.e0().e0()).b(f421c.b(c0VarH0.e0().d0())).e(b.b(l0Var.e())).a()).d(gf.c.a(c0VarH0.d0().v(), d0.b(d0Var))).c(l0Var.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static o g(m0 m0Var) throws GeneralSecurityException {
        if (!m0Var.d().f0().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + m0Var.d().f0());
        }
        try {
            cf.d0 d0VarH0 = cf.d0.h0(m0Var.d().g0(), p.b());
            if (d0VarH0.f0() == 0) {
                return o.b().c(d0VarH0.d0()).d(d0VarH0.e0().e0()).b(f421c.b(d0VarH0.e0().d0())).e(b.b(m0Var.d().e0())).a();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + d0VarH0.f0());
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    public static void h() {
        i(ye.d0.c());
    }

    public static void i(ye.d0 d0Var) {
        d0Var.m(f422d);
        d0Var.l(f423e);
        d0Var.k(f424f);
        d0Var.j(f425g);
    }

    public static l0 j(ze.i iVar, d0 d0Var) {
        return l0.b("type.googleapis.com/google.crypto.tink.HmacKey", c0.g0().F(e(iVar.e())).D(com.google.crypto.tink.shaded.protobuf.h.e(iVar.c().d(d0.b(d0Var)))).build().b(), cf.f0.c.SYMMETRIC, (p0) b.c(iVar.e().g()), iVar.a());
    }

    public static m0 k(o oVar) {
        return m0.c(h0.h0().F("type.googleapis.com/google.crypto.tink.HmacKey").G(cf.d0.g0().F(e(oVar)).D(oVar.e()).build().b()).D((p0) b.c(oVar.g())).build());
    }
}
