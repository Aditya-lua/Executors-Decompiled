package pe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<l, oe.a> f28503a = ve.h0.b(new ve.h0.b() { // from class: pe.m
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.b.c((l) lVar);
        }
    }, l.class, oe.a.class);
    public static final oe.m<oe.a> b = ve.o.e(c(), oe.a.class, ze.f0.c.SYMMETRIC, ze.i.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.w.a<p> f28504c = new ve.w.a() { // from class: pe.n
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return o.b((p) xVar, num);
        }
    };

    public static l b(p pVar, Integer num) throws GeneralSecurityException {
        f(pVar);
        return l.b().e(pVar).c(num).d(df.c.b(pVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public static Map<String, oe.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", j1.f28459c);
        p.b bVarD = p.b().b(16).c(16).d(16);
        p.c cVar = p.c.f28515d;
        map.put("AES128_EAX_RAW", bVarD.e(cVar).a());
        map.put("AES256_EAX", j1.f28460d);
        map.put("AES256_EAX_RAW", p.b().b(16).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        qe.j.h();
        ve.a0.c().d(f28503a);
        ve.z.a().c(d());
        ve.w.f().b(f28504c, p.class);
        ve.l.d().g(b, z10);
    }

    public static final void f(p pVar) throws GeneralSecurityException {
        if (pVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
