package se;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<a0, re.a> f31311a = ye.h0.b(new ye.h0.b() { // from class: se.b0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return d0.b((a0) lVar);
        }
    }, a0.class, re.a.class);
    public static final ye.w.a<e0> b = new ye.w.a() { // from class: se.c0
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return d0.c((e0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.m<re.a> f31312c = ye.o.e(d(), re.a.class, cf.f0.c.SYMMETRIC, cf.p.f0());

    public static re.a b(a0 a0Var) {
        return te.v.f() ? te.v.d(a0Var) : ff.f.c(a0Var);
    }

    public static a0 c(e0 e0Var, Integer num) {
        return a0.b(e0Var.c(), gf.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static Map<String, re.x> e() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", e0.b(e0.a.b));
        map.put("CHACHA20_POLY1305_RAW", e0.b(e0.a.f31318d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        te.a0.g();
        ye.a0.c().d(f31311a);
        ye.w.f().b(b, e0.class);
        ye.z.a().c(e());
        ye.l.d().g(f31312c, z10);
    }
}
