package bf;

import af.C0218f0;
import af.C0253x;
import af.C0255y;
import cf.C1649n;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4587i;
import p076df.C4588j;
import p102ef.C5109a;
import p102ef.C5111c;
import p379qe.C10526h;
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
import pe.C10229j;
import pe.InterfaceC10212a0;
import pe.InterfaceC10232m;
import pe.InterfaceC10244y;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: bf.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C1408n {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C1400j, InterfaceC10245z> f5529a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.k
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4587i.m22674b((C1400j) abstractC10231l);
        }
    }, C1400j.class, InterfaceC10245z.class);

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C1410o, InterfaceC10212a0> f5530b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.l
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4588j.m22680b((C1410o) abstractC10231l);
        }
    }, C1410o.class, InterfaceC10212a0.class);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10244y<InterfaceC10245z> f5531c = C12385o.m46415f(m7333b(), InterfaceC10245z.class, C0253x.m1117h0());

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10232m<InterfaceC10212a0> f5532d = C12385o.m46414e(C1412p.m7340a(), InterfaceC10212a0.class, C0218f0.c.ASYMMETRIC_PUBLIC, C0255y.m1166g0());

    /* JADX INFO: renamed from: e */
    public static final C12399x.a<C1398i> f5533e = new C10526h();

    /* JADX INFO: renamed from: f */
    public static final C12398w.a<C1398i> f5534f = new C12398w.a() { // from class: bf.m
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C1408n.m7332a((C1398i) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: a */
    public static C1400j m7332a(C1398i c1398i, Integer num) {
        C4587i.a aVarM22676c = C4587i.a.m22676c();
        return C1400j.m7294d(C1410o.m7336c(c1398i.m7290c(), C5109a.m23847a(aVarM22676c.m22679b()), num), C5111c.m23853a(aVarM22676c.m22678a(), C10229j.m39322a()));
    }

    /* JADX INFO: renamed from: b */
    public static String m7333b() {
        return "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, AbstractC10243x> m7334c() {
        HashMap map = new HashMap();
        map.put("ED25519", C1398i.m7289b(C1398i.a.f5477b));
        C1398i.a aVar = C1398i.a.f5480e;
        map.put("ED25519_RAW", C1398i.m7289b(aVar));
        map.put("ED25519WithRawOutput", C1398i.m7289b(aVar));
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: d */
    public static void m7335d(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        C1649n.m8293k();
        C12401z.m46477a().m46479c(m7334c());
        C12398w.m46468f().m46470b(f5534f, C1398i.class);
        C12399x.m46473b().m46474a(f5533e, C1398i.class);
        C12358a0.m46226c().m46229d(f5529a);
        C12358a0.m46226c().m46229d(f5530b);
        C12379l.m46383d().m46389g(f5531c, z10);
        C12379l.m46383d().m46389g(f5532d, false);
    }
}
