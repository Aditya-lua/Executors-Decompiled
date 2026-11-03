package qe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.h0<q, pe.a> f29781a = we.h0.b(new we.h0.b() { // from class: qe.r
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.c.c((q) lVar);
        }
    }, q.class, pe.a.class);
    public static final pe.m<pe.a> b = we.o.e(c(), pe.a.class, af.f0.c.SYMMETRIC, af.l.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final we.x.a<u> f29782c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final we.w.a<u> f29783d = new we.w.a() { // from class: qe.s
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return t.b((u) xVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ue.b.EnumC0590b f29784e = ue.b.EnumC0590b.b;

    public static q b(u uVar, Integer num) throws GeneralSecurityException {
        f(uVar);
        return q.b().e(uVar).c(num).d(ef.c.b(uVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static Map<String, pe.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", j1.f29706a);
        u.b bVarD = u.b().b(12).c(16).d(16);
        u.c cVar = u.c.f29798d;
        map.put("AES128_GCM_RAW", bVarD.e(cVar).a());
        map.put("AES256_GCM", j1.b);
        map.put("AES256_GCM_RAW", u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        ue.b.EnumC0590b enumC0590b = f29784e;
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        re.p.g();
        we.a0.c().d(f29781a);
        we.z.a().c(d());
        we.x.b().a(f29782c, u.class);
        we.w.f().b(f29783d, u.class);
        we.l.d().h(b, enumC0590b, z10);
    }

    public static final void f(u uVar) throws GeneralSecurityException {
        if (uVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
