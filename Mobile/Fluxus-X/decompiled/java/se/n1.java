package se;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.w.a<o1> f31381a = new ye.w.a() { // from class: se.l1
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return n1.b((o1) xVar, num);
        }
    };
    public static final ye.h0<k1, re.a> b = ye.h0.b(new ye.h0.b() { // from class: se.m1
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return te.l0.c((k1) lVar);
        }
    }, k1.class, re.a.class);

    public static k1 b(o1 o1Var, Integer num) {
        return k1.b(o1Var, gf.c.b(32), num);
    }

    public static Map<String, re.x> c() {
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", j1.f31344i);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", j1.f31345j);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", j1.f31346k);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", j1.f31347l);
        return Collections.unmodifiableMap(map);
    }

    public static void d(boolean z10) {
        te.q0.g();
        ye.z.a().c(c());
        ye.a0.c().d(b);
        ye.w.f().b(f31381a, o1.class);
    }
}
