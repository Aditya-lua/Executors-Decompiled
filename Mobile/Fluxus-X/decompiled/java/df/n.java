package df;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<j, re.z> f12328a = ye.h0.b(new ye.h0.b() { // from class: df.k
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.i.b((j) lVar);
        }
    }, j.class, re.z.class);
    public static final ye.h0<o, re.a0> b = ye.h0.b(new ye.h0.b() { // from class: df.l
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.j.b((o) lVar);
        }
    }, o.class, re.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.y<re.z> f12329c = ye.o.f(b(), re.z.class, cf.x.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.m<re.a0> f12330d = ye.o.e(p.a(), re.a0.class, cf.f0.c.ASYMMETRIC_PUBLIC, cf.y.g0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.x.a<i> f12331e = new se.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ye.w.a<i> f12332f = new ye.w.a() { // from class: df.m
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return n.a((i) xVar, num);
        }
    };

    public static j a(i iVar, Integer num) {
        ff.i.a aVarC = ff.i.a.c();
        return j.d(o.c(iVar.c(), gf.a.a(aVarC.b()), num), gf.c.a(aVarC.a(), re.j.a()));
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public static Map<String, re.x> c() {
        HashMap map = new HashMap();
        map.put("ED25519", i.b(i.a.b));
        i.a aVar = i.a.f12290e;
        map.put("ED25519_RAW", i.b(aVar));
        map.put("ED25519WithRawOutput", i.b(aVar));
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        if (!we.b.EnumC0736b.f35740a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        ef.n.k();
        ye.z.a().c(c());
        ye.w.f().b(f12332f, i.class);
        ye.x.b().a(f12331e, i.class);
        ye.a0.c().d(f12328a);
        ye.a0.c().d(b);
        ye.l.d().g(f12329c, z10);
        ye.l.d().g(f12330d, false);
    }
}
