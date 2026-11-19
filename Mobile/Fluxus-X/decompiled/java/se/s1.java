package se;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<p1, re.a> f31409a = ye.h0.b(new ye.h0.b() { // from class: se.q1
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return s1.b((p1) lVar);
        }
    }, p1.class, re.a.class);
    public static final re.m<re.a> b = ye.o.e(d(), re.a.class, cf.f0.c.SYMMETRIC, cf.c1.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.x.a<t1> f31410c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.w.a<t1> f31411d = new ye.w.a() { // from class: se.r1
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return s1.c((t1) xVar, num);
        }
    };

    public static re.a b(p1 p1Var) {
        return te.r0.e() ? te.r0.c(p1Var) : ff.b0.c(p1Var);
    }

    public static p1 c(t1 t1Var, Integer num) {
        return p1.b(t1Var.c(), gf.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static Map<String, re.x> e() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", t1.b(t1.a.b));
        map.put("XCHACHA20_POLY1305_RAW", t1.b(t1.a.f31420d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        te.w0.g();
        ye.a0.c().d(f31409a);
        ye.z.a().c(e());
        ye.w.f().b(f31411d, t1.class);
        ye.x.b().a(f31410c, t1.class);
        ye.l.d().g(b, z10);
    }
}
