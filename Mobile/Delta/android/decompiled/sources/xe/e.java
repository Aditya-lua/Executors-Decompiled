package xe;

import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import we.a0;
import we.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.w.a<f> f35692a = new we.w.a() { // from class: xe.b
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return e.d((f) xVar, num);
        }
    };
    public static final h0<a, g> b = h0.b(new h0.b() { // from class: xe.c
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return e.e((a) lVar);
        }
    }, a.class, g.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0<a, pe.w> f35693c = h0.b(new h0.b() { // from class: xe.d
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return e.f((a) lVar);
        }
    }, a.class, pe.w.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.w> f35694d = we.o.e("type.googleapis.com/google.crypto.tink.AesCmacKey", pe.w.class, f0.c.SYMMETRIC, af.a.h0());

    public static a d(f fVar, Integer num) throws GeneralSecurityException {
        i(fVar);
        return a.b().e(fVar).c(ef.c.b(fVar.d())).d(num).a();
    }

    public static g e(a aVar) throws GeneralSecurityException {
        i(aVar.e());
        return new ye.g(aVar);
    }

    public static pe.w f(a aVar) throws GeneralSecurityException {
        i(aVar.e());
        return df.t.c(aVar);
    }

    public static Map<String, pe.x> g() {
        HashMap map = new HashMap();
        f fVar = z.f35739e;
        map.put("AES_CMAC", fVar);
        map.put("AES256_CMAC", fVar);
        map.put("AES256_CMAC_RAW", f.b().b(32).c(16).d(f.c.f35701e).a());
        return Collections.unmodifiableMap(map);
    }

    public static void h(boolean z10) {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        ye.e.h();
        we.w.f().b(f35692a, f.class);
        a0.c().d(b);
        a0.c().d(f35693c);
        we.z.a().c(g());
        we.l.d().g(f35694d, z10);
    }

    public static void i(f fVar) throws GeneralSecurityException {
        if (fVar.d() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
