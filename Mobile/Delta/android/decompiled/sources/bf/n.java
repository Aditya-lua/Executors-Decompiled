package bf;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we.h0<j, pe.z> f4130a = we.h0.b(new we.h0.b() { // from class: bf.k
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.i.b((j) lVar);
        }
    }, j.class, pe.z.class);
    public static final we.h0<o, pe.a0> b = we.h0.b(new we.h0.b() { // from class: bf.l
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.j.b((o) lVar);
        }
    }, o.class, pe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4131c = we.o.f(b(), pe.z.class, af.x.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4132d = we.o.e(p.a(), pe.a0.class, af.f0.c.ASYMMETRIC_PUBLIC, af.y.g0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.x.a<i> f4133e = new qe.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.w.a<i> f4134f = new we.w.a() { // from class: bf.m
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return n.a((i) xVar, num);
        }
    };

    public static j a(i iVar, Integer num) {
        df.i.a aVarC = df.i.a.c();
        return j.d(o.c(iVar.c(), ef.a.a(aVarC.b()), num), ef.c.a(aVarC.a(), pe.j.a()));
    }

    public static String b() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    public static Map<String, pe.x> c() {
        HashMap map = new HashMap();
        map.put("ED25519", i.b(i.a.b));
        i.a aVar = i.a.f4092e;
        map.put("ED25519_RAW", i.b(aVar));
        map.put("ED25519WithRawOutput", i.b(aVar));
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) throws GeneralSecurityException {
        if (!ue.b.EnumC0590b.f32770a.a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        cf.n.k();
        we.z.a().c(c());
        we.w.f().b(f4134f, i.class);
        we.x.b().a(f4133e, i.class);
        we.a0.c().d(f4130a);
        we.a0.c().d(b);
        we.l.d().g(f4131c, z10);
        we.l.d().g(f4132d, false);
    }
}
