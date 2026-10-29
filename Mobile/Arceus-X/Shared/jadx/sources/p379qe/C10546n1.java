package p379qe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p102ef.C5111c;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12398w;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.InterfaceC10211a;
import re.C10839l0;
import re.C10849q0;

/* JADX INFO: renamed from: qe.n1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10546n1 {

    /* JADX INFO: renamed from: a */
    public static final C12398w.a<C10549o1> f37830a = new C12398w.a() { // from class: qe.l1
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10546n1.m40430b((C10549o1) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C10537k1, InterfaceC10211a> f37831b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.m1
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C10839l0.m41258c((C10537k1) abstractC10231l);
        }
    }, C10537k1.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static C10537k1 m40430b(C10549o1 c10549o1, Integer num) {
        return C10537k1.m40403b(c10549o1, C5111c.m23854b(32), num);
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, AbstractC10243x> m40431c() {
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", C10534j1.f37782i);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", C10534j1.f37783j);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", C10534j1.f37784k);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", C10534j1.f37785l);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: d */
    public static void m40432d(boolean z10) {
        C10849q0.m41279g();
        C12401z.m46477a().m46479c(m40431c());
        C12358a0.m46226c().m46229d(f37831b);
        C12398w.m46468f().m46470b(f37830a, C10549o1.class);
    }
}
