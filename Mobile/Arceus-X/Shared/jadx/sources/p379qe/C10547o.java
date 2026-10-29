package p379qe;

import af.C0218f0;
import af.C0223i;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4579b;
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
import re.C10834j;

/* JADX INFO: renamed from: qe.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C10547o {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10538l, InterfaceC10211a> f37832a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.m
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4579b.m22642c((C10538l) abstractC10231l);
        }
    }, C10538l.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10232m<InterfaceC10211a> f37833b = C12385o.m46414e(m40435c(), InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0223i.m774h0());

    /* JADX INFO: renamed from: c */
    public static final C12398w.a<C10550p> f37834c = new C12398w.a() { // from class: qe.n
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10547o.m40434b((C10550p) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: b */
    public static C10538l m40434b(C10550p c10550p, Integer num) throws GeneralSecurityException {
        m40438f(c10550p);
        return C10538l.m40408b().m40416e(c10550p).m40414c(num).m40415d(C5111c.m23854b(c10550p.m40444d())).m40412a();
    }

    /* JADX INFO: renamed from: c */
    public static String m40435c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m40436d() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", C10534j1.f37776c);
        C10550p.b bVarM40450d = C10550p.m40442b().m40448b(16).m40449c(16).m40450d(16);
        C10550p.c cVar = C10550p.c.f37850d;
        map.put("AES128_EAX_RAW", bVarM40450d.m40451e(cVar).m40447a());
        map.put("AES256_EAX", C10534j1.f37777d);
        map.put("AES256_EAX_RAW", C10550p.m40442b().m40448b(16).m40449c(32).m40450d(16).m40451e(cVar).m40447a());
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: e */
    public static void m40437e(boolean z10) throws GeneralSecurityException {
        if (!C11844b.b.f41601a.mo44243a()) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        C10834j.m41239h();
        C12358a0.m46226c().m46229d(f37832a);
        C12401z.m46477a().m46479c(m40436d());
        C12398w.m46468f().m46470b(f37834c, C10550p.class);
        C12379l.m46383d().m46389g(f37833b, z10);
    }

    /* JADX INFO: renamed from: f */
    public static final void m40438f(C10550p c10550p) throws GeneralSecurityException {
        if (c10550p.m40444d() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    }
}
