package se;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<q, re.a> f31412a = ye.h0.b(new ye.h0.b() { // from class: se.r
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.c.c((q) lVar);
        }
    }, q.class, re.a.class);
    public static final re.m<re.a> b = ye.o.e(c(), re.a.class, cf.f0.c.SYMMETRIC, cf.l.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ye.x.a<u> f31413c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ye.w.a<u> f31414d = new ye.w.a() { // from class: se.s
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return t.b((u) xVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.b.EnumC0736b f31415e = we.b.EnumC0736b.b;

    public static q b(u uVar, Integer num) throws GeneralSecurityException {
        f(uVar);
        return q.b().e(uVar).c(num).d(gf.c.b(uVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static Map<String, re.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", j1.f31337a);
        u.b bVarD = u.b().b(12).c(16).d(16);
        u.c cVar = u.c.f31429d;
        map.put("AES128_GCM_RAW", bVarD.e(cVar).a());
        map.put("AES256_GCM", j1.b);
        map.put("AES256_GCM_RAW", u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        we.b.EnumC0736b enumC0736b = f31415e;
        if (!enumC0736b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        te.p.g();
        ye.a0.c().d(f31412a);
        ye.z.a().c(d());
        ye.x.b().a(f31413c, u.class);
        ye.w.f().b(f31414d, u.class);
        ye.l.d().h(b, enumC0736b, z10);
    }

    public static final void f(u uVar) throws GeneralSecurityException {
        if (uVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
