package af;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.h0<j, oe.z> f458a = ve.h0.b(new ve.h0.b() { // from class: af.k
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.i.b((j) lVar);
        }
    }, j.class, oe.z.class);
    public static final ve.h0<o, oe.a0> b = ve.h0.b(new ve.h0.b() { // from class: af.l
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.j.b((o) lVar);
        }
    }, o.class, oe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe.y<oe.z> f459c = ve.o.f(b(), oe.z.class, ze.x.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oe.m<oe.a0> f460d = ve.o.e(p.a(), oe.a0.class, ze.f0.c.ASYMMETRIC_PUBLIC, ze.y.g0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.x.a<i> f461e = new pe.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ve.w.a<i> f462f = new ve.w.a() { // from class: af.m
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return n.a((i) xVar, num);
        }
    };

    public static j a(i iVar, Integer num) {
        cf.i.a aVarC = cf.i.a.c();
        return j.d(o.c(iVar.c(), df.a.a(aVarC.b()), num), df.c.a(aVarC.a(), oe.j.a()));
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public static Map<String, oe.x> c() {
        HashMap map = new HashMap();
        map.put("ED25519", i.b(i.a.b));
        i.a aVar = i.a.f420e;
        map.put("ED25519_RAW", i.b(aVar));
        map.put("ED25519WithRawOutput", i.b(aVar));
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        if (!te.b.EnumC0569b.f31710a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        bf.n.k();
        ve.z.a().c(c());
        ve.w.f().b(f462f, i.class);
        ve.x.b().a(f461e, i.class);
        ve.a0.c().d(f458a);
        ve.a0.c().d(b);
        ve.l.d().g(f459c, z10);
        ve.l.d().g(f460d, false);
    }
}
