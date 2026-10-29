package p379qe;

import af.C0211c1;
import af.C0218f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4580b0;
import p102ef.C5111c;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12398w;
import p515we.C12399x;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.InterfaceC10211a;
import pe.InterfaceC10232m;
import re.C10851r0;
import re.C10861w0;

/* JADX INFO: renamed from: qe.s1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10561s1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10552p1, InterfaceC10211a> f37869a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.q1
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C10561s1.m40479b((C10552p1) abstractC10231l);
        }
    }, C10552p1.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10232m<InterfaceC10211a> f37870b = C12385o.m46414e(m40481d(), InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0211c1.m646f0());

    /* JADX INFO: renamed from: c */
    public static final C12399x.a<C10564t1> f37871c = new C10526h();

    /* JADX INFO: renamed from: d */
    public static final C12398w.a<C10564t1> f37872d = new C12398w.a() { // from class: qe.r1
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10561s1.m40480c((C10564t1) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: b */
    public static InterfaceC10211a m40479b(C10552p1 c10552p1) {
        return C10851r0.m41287e() ? C10851r0.m41285c(c10552p1) : C4580b0.m22651c(c10552p1);
    }

    /* JADX INFO: renamed from: c */
    public static C10552p1 m40480c(C10564t1 c10564t1, Integer num) {
        return C10552p1.m40452b(c10564t1.m40494c(), C5111c.m23854b(32), num);
    }

    /* JADX INFO: renamed from: d */
    public static String m40481d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* JADX INFO: renamed from: e */
    public static Map<String, AbstractC10243x> m40482e() {
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", C10564t1.m40493b(C10564t1.a.f37882b));
        map.put("XCHACHA20_POLY1305_RAW", C10564t1.m40493b(C10564t1.a.f37884d));
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: f */
    public static void m40483f(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        C10861w0.m41312g();
        C12358a0.m46226c().m46229d(f37869a);
        C12401z.m46477a().m46479c(m40482e());
        C12398w.m46468f().m46470b(f37872d, C10564t1.class);
        C12399x.m46473b().m46474a(f37871c, C10564t1.class);
        C12379l.m46383d().m46389g(f37870b, z10);
    }
}
