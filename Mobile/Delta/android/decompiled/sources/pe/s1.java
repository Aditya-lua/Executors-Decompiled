package pe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<p1, oe.a> f28530a = ve.h0.b(new ve.h0.b() { // from class: pe.q1
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return s1.b((p1) lVar);
        }
    }, p1.class, oe.a.class);
    public static final oe.m<oe.a> b = ve.o.e(d(), oe.a.class, ze.f0.c.SYMMETRIC, ze.c1.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.x.a<t1> f28531c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.w.a<t1> f28532d = new ve.w.a() { // from class: pe.r1
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return s1.c((t1) xVar, num);
        }
    };

    public static oe.a b(p1 p1Var) {
        return qe.r0.e() ? qe.r0.c(p1Var) : cf.b0.c(p1Var);
    }

    public static p1 c(t1 t1Var, Integer num) {
        return p1.b(t1Var.c(), df.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static Map<String, oe.x> e() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", t1.b(t1.a.b));
        map.put("XCHACHA20_POLY1305_RAW", t1.b(t1.a.f28541d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        qe.w0.g();
        ve.a0.c().d(f28530a);
        ve.z.a().c(e());
        ve.w.f().b(f28532d, t1.class);
        ve.x.b().a(f28531c, t1.class);
        ve.l.d().g(b, z10);
    }
}
