package pe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ve.w.a<o1> f28502a = new ve.w.a() { // from class: pe.l1
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return n1.b((o1) xVar, num);
        }
    };
    public static final ve.h0<k1, oe.a> b = ve.h0.b(new ve.h0.b() { // from class: pe.m1
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return qe.l0.c((k1) lVar);
        }
    }, k1.class, oe.a.class);

    public static k1 b(o1 o1Var, Integer num) {
        return k1.b(o1Var, df.c.b(32), num);
    }

    public static Map<String, oe.x> c() {
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", j1.f28465i);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", j1.f28466j);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", j1.f28467k);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", j1.f28468l);
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) {
        qe.q0.g();
        ve.z.a().c(c());
        ve.a0.c().d(b);
        ve.w.f().b(f28502a, o1.class);
    }
}
