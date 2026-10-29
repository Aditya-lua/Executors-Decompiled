package p379qe;

import af.C0218f0;
import af.C0237p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4584f;
import p102ef.C5111c;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12398w;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.InterfaceC10211a;
import pe.InterfaceC10232m;
import re.C10817a0;
import re.C10858v;

/* JADX INFO: renamed from: qe.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10515d0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10506a0, InterfaceC10211a> f37739a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.b0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C10515d0.m40343b((C10506a0) abstractC10231l);
        }
    }, C10506a0.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final C12398w.a<C10518e0> f37740b = new C12398w.a() { // from class: qe.c0
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10515d0.m40344c((C10518e0) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10232m<InterfaceC10211a> f37741c = C12385o.m46414e(m40345d(), InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0237p.m935f0());

    /* JADX INFO: renamed from: b */
    public static InterfaceC10211a m40343b(C10506a0 c10506a0) {
        return C10858v.m41303f() ? C10858v.m41301d(c10506a0) : C4584f.m22666c(c10506a0);
    }

    /* JADX INFO: renamed from: c */
    public static C10506a0 m40344c(C10518e0 c10518e0, Integer num) {
        return C10506a0.m40337b(c10518e0.m40351c(), C5111c.m23854b(32), num);
    }

    /* JADX INFO: renamed from: d */
    public static String m40345d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, AbstractC10243x> m40346e() {
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", C10518e0.m40350b(C10518e0.a.f37748b));
        map.put("CHACHA20_POLY1305_RAW", C10518e0.m40350b(C10518e0.a.f37750d));
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: f */
    public static void m40347f(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        C10817a0.m41190g();
        C12358a0.m46226c().m46229d(f37739a);
        C12398w.m46468f().m46470b(f37740b, C10518e0.class);
        C12401z.m46477a().m46479c(m40346e());
        C12379l.m46383d().m46389g(f37741c, z10);
    }
}
