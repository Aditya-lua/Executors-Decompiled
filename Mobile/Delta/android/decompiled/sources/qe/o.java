package qe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.h0<l, pe.a> f29751a = we.h0.b(new we.h0.b() { // from class: qe.m
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.b.c((l) lVar);
        }
    }, l.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(c(), pe.a.class, af.f0.c.SYMMETRIC, af.i.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.w.a<p> f29752c = new we.w.a() { // from class: qe.n
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return o.b((p) xVar, num);
        }
    };

    public static l b(p pVar, Integer num) throws GeneralSecurityException {
        f(pVar);
        return l.b().e(pVar).c(num).d(ef.c.b(pVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static Map<String, pe.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", j1.f29707c);
        p.b bVarD = p.b().b(16).c(16).d(16);
        p.c cVar = p.c.f29763d;
        map.put("AES128_EAX_RAW", bVarD.e(cVar).a());
        map.put("AES256_EAX", j1.f29708d);
        map.put("AES256_EAX_RAW", p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        re.j.h();
        we.a0.c().d(f29751a);
        we.z.a().c(d());
        we.w.f().b(f29752c, p.class);
        we.l.d().g(b, z10);
    }

    public static final void f(p pVar) throws GeneralSecurityException {
        if (pVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
