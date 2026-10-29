package p379qe;

import af.C0212d;
import af.C0218f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4590l;
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
import re.C10824e;

/* JADX INFO: renamed from: qe.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10532j {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C10520f, InterfaceC10211a> f37769a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: qe.g
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4590l.m22697c((C10520f) abstractC10231l);
        }
    }, C10520f.class, InterfaceC10211a.class);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10232m<InterfaceC10211a> f37770b = C12385o.m46414e(m40375b(), InterfaceC10211a.class, C0218f0.c.SYMMETRIC, C0212d.m656h0());

    /* JADX INFO: renamed from: c */
    public static final C12399x.a<C10535k> f37771c = new C10526h();

    /* JADX INFO: renamed from: d */
    public static final C12398w.a<C10535k> f37772d = new C12398w.a() { // from class: qe.i
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C10532j.m40374a((C10535k) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: e */
    public static final C11844b.b f37773e = C11844b.b.f41602b;

    /* JADX INFO: renamed from: a */
    public static C10520f m40374a(C10535k c10535k, Integer num) throws GeneralSecurityException {
        m40378e(c10535k);
        return C10520f.m40352b().m40362f(c10535k).m40361e(num).m40359c(C5111c.m23854b(c10535k.m40389c())).m40360d(C5111c.m23854b(c10535k.m40391e())).m40357a();
    }

    /* JADX INFO: renamed from: b */
    public static String m40375b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, AbstractC10243x> m40376c() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", C10534j1.f37778e);
        C10535k.b bVarM40400e = C10535k.m40388b().m40397b(16).m40399d(32).m40401f(16).m40400e(16);
        C10535k.c cVar = C10535k.c.f37800d;
        C10535k.b bVarM40398c = bVarM40400e.m40398c(cVar);
        C10535k.d dVar = C10535k.d.f37806d;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bVarM40398c.m40402g(dVar).m40396a());
        map.put("AES256_CTR_HMAC_SHA256", C10534j1.f37779f);
        map.put("AES256_CTR_HMAC_SHA256_RAW", C10535k.m40388b().m40397b(32).m40399d(32).m40401f(32).m40400e(16).m40398c(cVar).m40402g(dVar).m40396a());
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: d */
    public static void m40377d(boolean z10) throws GeneralSecurityException {
        C11844b.b bVar = f37773e;
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C10824e.m41217h();
        C12358a0.m46226c().m46229d(f37769a);
        C12401z.m46477a().m46479c(m40376c());
        C12399x.m46473b().m46474a(f37771c, C10535k.class);
        C12398w.m46468f().m46470b(f37772d, C10535k.class);
        C12379l.m46383d().m46390h(f37770b, bVar, z10);
    }

    /* JADX INFO: renamed from: e */
    public static void m40378e(C10535k c10535k) throws GeneralSecurityException {
        if (c10535k.m40389c() != 16 && c10535k.m40389c() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
    }
}
