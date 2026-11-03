package qe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.h0<p1, pe.a> f29778a = we.h0.b(new we.h0.b() { // from class: qe.q1
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return s1.b((p1) lVar);
        }
    }, p1.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(d(), pe.a.class, af.f0.c.SYMMETRIC, af.c1.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.x.a<t1> f29779c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.w.a<t1> f29780d = new we.w.a() { // from class: qe.r1
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return s1.c((t1) xVar, num);
        }
    };

    public static pe.a b(p1 p1Var) {
        return re.r0.e() ? re.r0.c(p1Var) : df.b0.c(p1Var);
    }

    public static p1 c(t1 t1Var, Integer num) {
        return p1.b(t1Var.c(), ef.c.b(32), num);
    }

    public static String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static Map<String, pe.x> e() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", t1.b(t1.a.b));
        map.put("XCHACHA20_POLY1305_RAW", t1.b(t1.a.f29789d));
        return Collections.unmodifiableMap(map);
    }

    public static void f(boolean z10) throws GeneralSecurityException {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        re.w0.g();
        we.a0.c().d(f29778a);
        we.z.a().c(e());
        we.w.f().b(f29780d, t1.class);
        we.x.b().a(f29779c, t1.class);
        we.l.d().g(b, z10);
    }
}
