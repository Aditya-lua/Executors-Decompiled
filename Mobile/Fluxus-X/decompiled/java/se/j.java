package se;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<f, re.a> f31333a = ye.h0.b(new ye.h0.b() { // from class: se.g
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.l.c((f) lVar);
        }
    }, f.class, re.a.class);
    public static final re.m<re.a> b = ye.o.e(b(), re.a.class, cf.f0.c.SYMMETRIC, cf.d.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.x.a<k> f31334c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.w.a<k> f31335d = new ye.w.a() { // from class: se.i
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return j.a((k) xVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.b.EnumC0736b f31336e = we.b.EnumC0736b.b;

    public static f a(k kVar, Integer num) throws GeneralSecurityException {
        e(kVar);
        return f.b().f(kVar).e(num).c(gf.c.b(kVar.c())).d(gf.c.b(kVar.e())).a();
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static Map<String, re.x> c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", j1.f31340e);
        k.b bVarE = k.b().b(16).d(32).f(16).e(16);
        k.c cVar = k.c.f31359d;
        k.b bVarC = bVarE.c(cVar);
        k.d dVar = k.d.f31364d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarC.g(dVar).a());
        map.put("AES256_CTR_HMAC_SHA256", j1.f31341f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        we.b.EnumC0736b enumC0736b = f31336e;
        if (!enumC0736b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        te.e.h();
        ye.a0.c().d(f31333a);
        ye.z.a().c(c());
        ye.x.b().a(f31334c, k.class);
        ye.w.f().b(f31335d, k.class);
        ye.l.d().h(b, enumC0736b, z10);
    }

    public static void e(k kVar) throws GeneralSecurityException {
        if (kVar.c() != 16 && kVar.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
