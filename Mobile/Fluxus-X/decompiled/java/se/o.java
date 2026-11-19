package se;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<l, re.a> f31382a = ye.h0.b(new ye.h0.b() { // from class: se.m
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.b.c((l) lVar);
        }
    }, l.class, re.a.class);
    public static final re.m<re.a> b = ye.o.e(c(), re.a.class, cf.f0.c.SYMMETRIC, cf.i.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.w.a<p> f31383c = new ye.w.a() { // from class: se.n
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return o.b((p) xVar, num);
        }
    };

    public static l b(p pVar, Integer num) throws GeneralSecurityException {
        f(pVar);
        return l.b().e(pVar).c(num).d(gf.c.b(pVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static Map<String, re.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", j1.f31338c);
        p.b bVarD = p.b().b(16).c(16).d(16);
        p.c cVar = p.c.f31394d;
        map.put("AES128_EAX_RAW", bVarD.e(cVar).a());
        map.put("AES256_EAX", j1.f31339d);
        map.put("AES256_EAX_RAW", p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        te.j.h();
        ye.a0.c().d(f31382a);
        ye.z.a().c(d());
        ye.w.f().b(f31383c, p.class);
        ye.l.d().g(b, z10);
    }

    public static final void f(p pVar) throws GeneralSecurityException {
        if (pVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
