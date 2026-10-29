package p379qe;

import af.C0218f0;
import af.C0229l;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4581c;
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
import re.C10846p;

/* JADX INFO: renamed from: qe.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C10562t {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10553q, InterfaceC10211a> f37873a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.r
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4581c.m22654c((C10553q) abstractC10231l);
        }
    }, C10553q.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10232m<InterfaceC10211a> f37874b = C12385o.m46414e(m40486c(), InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0229l.m863f0());

    /* JADX INFO: renamed from: c */
    public static final C12399x.a<C10565u> f37875c = new C10526h();

    /* JADX INFO: renamed from: d */
    public static final C12398w.a<C10565u> f37876d = new C12398w.a() { // from class: qe.s
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10562t.m40485b((C10565u) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final C11844b.b f37877e = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static C10553q m40485b(C10565u c10565u, Integer num) throws GeneralSecurityException {
        m40489f(c10565u);
        return C10553q.m40457b().m40465e(c10565u).m40463c(num).m40464d(C5111c.m23854b(c10565u.m40497d())).m40461a();
    }

    /* JADX INFO: renamed from: c */
    public static String m40486c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m40487d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", C10534j1.f37774a);
        C10565u.b bVarM40503d = C10565u.m40495b().m40501b(12).m40502c(16).m40503d(16);
        C10565u.c cVar = C10565u.c.f37896d;
        map.put("AES128_GCM_RAW", bVarM40503d.m40504e(cVar).m40500a());
        map.put("AES256_GCM", C10534j1.f37775b);
        map.put("AES256_GCM_RAW", C10565u.m40495b().m40501b(12).m40502c(32).m40503d(16).m40504e(cVar).m40500a());
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: e */
    public static void m40488e(boolean z10) throws GeneralSecurityException {
        C11844b.b bVar = f37877e;
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        C10846p.m41266g();
        C12358a0.m46226c().m46229d(f37873a);
        C12401z.m46477a().m46479c(m40487d());
        C12399x.m46473b().m46474a(f37875c, C10565u.class);
        C12398w.m46468f().m46470b(f37876d, C10565u.class);
        C12379l.m46383d().m46390h(f37874b, bVar, z10);
    }

    /* JADX INFO: renamed from: f */
    public static final void m40489f(C10565u c10565u) throws GeneralSecurityException {
        if (c10565u.m40497d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
