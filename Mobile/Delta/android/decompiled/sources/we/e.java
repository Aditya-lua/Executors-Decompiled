package we;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ve.a0;
import ve.h0;
import ze.f0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.w.a<f> f34193a = new ve.w.a() { // from class: we.b
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return e.d((f) xVar, num);
        }
    };
    public static final h0<a, g> b = h0.b(new h0.b() { // from class: we.c
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return e.e((a) lVar);
        }
    }, a.class, g.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0<a, oe.w> f34194c = h0.b(new h0.b() { // from class: we.d
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return e.f((a) lVar);
        }
    }, a.class, oe.w.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oe.m<oe.w> f34195d = ve.o.e("type.googleapis.com/google.crypto.tink.AesCmacKey", oe.w.class, f0.c.SYMMETRIC, ze.a.h0());

    public static a d(f fVar, Integer num) throws GeneralSecurityException {
        i(fVar);
        return a.b().e(fVar).c(df.c.b(fVar.d())).d(num).a();
    }

    public static g e(a aVar) throws GeneralSecurityException {
        i(aVar.e());
        return new xe.g(aVar);
    }

    public static oe.w f(a aVar) throws GeneralSecurityException {
        i(aVar.e());
        return cf.t.c(aVar);
    }

    public static Map<String, oe.x> g() {
        HashMap map = new HashMap();
        f fVar = z.f34240e;
        map.put("AES_CMAC", fVar);
        map.put("AES256_CMAC", fVar);
        map.put("AES256_CMAC_RAW", f.b().b(32).c(16).d(f.c.f34202e).a());
        return Collections.unmodifiableMap(map);
    }

    public static void h(boolean z10) {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        xe.e.h();
        ve.w.f().b(f34193a, f.class);
        a0.c().d(b);
        a0.c().d(f34194c);
        ve.z.a().c(g());
        ve.l.d().g(f34195d, z10);
    }

    public static void i(f fVar) throws GeneralSecurityException {
        if (fVar.d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
