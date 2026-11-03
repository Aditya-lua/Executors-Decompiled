package qe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.h0<f, pe.a> f29702a = we.h0.b(new we.h0.b() { // from class: qe.g
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.l.c((f) lVar);
        }
    }, f.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(b(), pe.a.class, af.f0.c.SYMMETRIC, af.d.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.x.a<k> f29703c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.w.a<k> f29704d = new we.w.a() { // from class: qe.i
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return j.a((k) xVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ue.b.EnumC0590b f29705e = ue.b.EnumC0590b.b;

    public static f a(k kVar, Integer num) throws GeneralSecurityException {
        e(kVar);
        return f.b().f(kVar).e(num).c(ef.c.b(kVar.c())).d(ef.c.b(kVar.e())).a();
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static Map<String, pe.x> c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", j1.f29709e);
        k.b bVarE = k.b().b(16).d(32).f(16).e(16);
        k.c cVar = k.c.f29728d;
        k.b bVarC = bVarE.c(cVar);
        k.d dVar = k.d.f29733d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarC.g(dVar).a());
        map.put("AES256_CTR_HMAC_SHA256", j1.f29710f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        ue.b.EnumC0590b enumC0590b = f29705e;
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        re.e.h();
        we.a0.c().d(f29702a);
        we.z.a().c(c());
        we.x.b().a(f29703c, k.class);
        we.w.f().b(f29704d, k.class);
        we.l.d().h(b, enumC0590b, z10);
    }

    public static void e(k kVar) throws GeneralSecurityException {
        if (kVar.c() != 16 && kVar.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
