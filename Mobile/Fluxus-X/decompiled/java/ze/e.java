package ze;

import cf.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ye.a0;
import ye.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.w.a<f> f39243a = new ye.w.a() { // from class: ze.b
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return e.d((f) xVar, num);
        }
    };
    public static final h0<a, g> b = h0.b(new h0.b() { // from class: ze.c
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return e.e((a) lVar);
        }
    }, a.class, g.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0<a, re.w> f39244c = h0.b(new h0.b() { // from class: ze.d
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return e.f((a) lVar);
        }
    }, a.class, re.w.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.m<re.w> f39245d = ye.o.e("type.googleapis.com/google.crypto.tink.AesCmacKey", re.w.class, f0.c.SYMMETRIC, cf.a.h0());

    public static a d(f fVar, Integer num) throws GeneralSecurityException {
        i(fVar);
        return a.b().e(fVar).c(gf.c.b(fVar.d())).d(num).a();
    }

    public static g e(a aVar) throws GeneralSecurityException {
        i(aVar.e());
        return new af.g(aVar);
    }

    public static re.w f(a aVar) throws GeneralSecurityException {
        i(aVar.e());
        return ff.t.c(aVar);
    }

    public static Map<String, re.x> g() {
        HashMap map = new HashMap();
        f fVar = z.f39290e;
        map.put("AES_CMAC", fVar);
        map.put("AES256_CMAC", fVar);
        map.put("AES256_CMAC_RAW", f.b().b(32).c(16).d(f.c.f39252e).a());
        return Collections.unmodifiableMap(map);
    }

    public static void h(boolean z10) {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        af.e.h();
        ye.w.f().b(f39243a, f.class);
        a0.c().d(b);
        a0.c().d(f39244c);
        ye.z.a().c(g());
        ye.l.d().g(f39245d, z10);
    }

    public static void i(f fVar) throws GeneralSecurityException {
        if (fVar.d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
