package pe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<f, oe.a> f28454a = ve.h0.b(new ve.h0.b() { // from class: pe.g
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.l.c((f) lVar);
        }
    }, f.class, oe.a.class);
    public static final oe.m<oe.a> b = ve.o.e(b(), oe.a.class, ze.f0.c.SYMMETRIC, ze.d.h0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.x.a<k> f28455c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.w.a<k> f28456d = new ve.w.a() { // from class: pe.i
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return j.a((k) xVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final te.b.EnumC0569b f28457e = te.b.EnumC0569b.b;

    public static f a(k kVar, Integer num) throws GeneralSecurityException {
        e(kVar);
        return f.b().f(kVar).e(num).c(df.c.b(kVar.c())).d(df.c.b(kVar.e())).a();
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static Map<String, oe.x> c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", j1.f28461e);
        k.b bVarE = k.b().b(16).d(32).f(16).e(16);
        k.c cVar = k.c.f28480d;
        k.b bVarC = bVarE.c(cVar);
        k.d dVar = k.d.f28485d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarC.g(dVar).a());
        map.put("AES256_CTR_HMAC_SHA256", j1.f28462f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", k.b().b(32).d(32).f(32).e(16).c(cVar).g(dVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        te.b.EnumC0569b enumC0569b = f28457e;
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        qe.e.h();
        ve.a0.c().d(f28454a);
        ve.z.a().c(c());
        ve.x.b().a(f28455c, k.class);
        ve.w.f().b(f28456d, k.class);
        ve.l.d().h(b, enumC0569b, z10);
    }

    public static void e(k kVar) throws GeneralSecurityException {
        if (kVar.c() != 16 && kVar.c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
