package pe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<a0, oe.a> f28432a = ve.h0.b(new ve.h0.b() { // from class: pe.b0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return d0.b((a0) lVar);
        }
    }, a0.class, oe.a.class);
    public static final ve.w.a<e0> b = new ve.w.a() { // from class: pe.c0
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return d0.c((e0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe.m<oe.a> f28433c = ve.o.e(d(), oe.a.class, ze.f0.c.SYMMETRIC, ze.p.f0());

    public static oe.a b(a0 a0Var) {
        return qe.v.f() ? qe.v.d(a0Var) : cf.f.c(a0Var);
    }

    public static a0 c(e0 e0Var, Integer num) {
        return a0.b(e0Var.c(), df.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static Map<String, oe.x> e() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", e0.b(e0.a.b));
        map.put("CHACHA20_POLY1305_RAW", e0.b(e0.a.f28439d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        qe.a0.g();
        ve.a0.c().d(f28432a);
        ve.w.f().b(b, e0.class);
        ve.z.a().c(e());
        ve.l.d().g(f28433c, z10);
    }
}
