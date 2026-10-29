package pe;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<q, oe.a> f28533a = ve.h0.b(new ve.h0.b() { // from class: pe.r
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.c.c((q) lVar);
        }
    }, q.class, oe.a.class);
    public static final oe.m<oe.a> b = ve.o.e(c(), oe.a.class, ze.f0.c.SYMMETRIC, ze.l.f0());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ve.x.a<u> f28534c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ve.w.a<u> f28535d = new ve.w.a() { // from class: pe.s
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return t.b((u) xVar, num);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final te.b.EnumC0569b f28536e = te.b.EnumC0569b.b;

    public static q b(u uVar, Integer num) throws GeneralSecurityException {
        f(uVar);
        return q.b().e(uVar).c(num).d(df.c.b(uVar.d())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static Map<String, oe.x> d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", j1.f28458a);
        u.b bVarD = u.b().b(12).c(16).d(16);
        u.c cVar = u.c.f28550d;
        map.put("AES128_GCM_RAW", bVarD.e(cVar).a());
        map.put("AES256_GCM", j1.b);
        map.put("AES256_GCM_RAW", u.b().b(12).c(32).d(16).e(cVar).a());
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        te.b.EnumC0569b enumC0569b = f28536e;
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        qe.p.g();
        ve.a0.c().d(f28533a);
        ve.z.a().c(d());
        ve.x.b().a(f28534c, u.class);
        ve.w.f().b(f28535d, u.class);
        ve.l.d().h(b, enumC0569b, z10);
    }

    public static final void f(u uVar) throws GeneralSecurityException {
        if (uVar.d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
