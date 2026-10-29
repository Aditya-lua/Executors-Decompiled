package bf;

import af.C0218f0;
import af.C0245t;
import af.C0247u;
import cf.C1641g;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p076df.C4585g;
import p076df.C4586h;
import p076df.C4589k;
import p102ef.C5110b;
import p465ue.C11844b;
import p515we.AbstractC12372h0;
import p515we.C12358a0;
import p515we.C12379l;
import p515we.C12385o;
import p515we.C12398w;
import p515we.C12401z;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10229j;
import pe.InterfaceC10212a0;
import pe.InterfaceC10232m;
import pe.InterfaceC10244y;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: bf.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1394g {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C1382b, InterfaceC10245z> f5466a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.d
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4585g.m22669b((C1382b) abstractC10231l);
        }
    }, C1382b.class, InterfaceC10245z.class);

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C1385c, InterfaceC10212a0> f5467b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.e
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4586h.m22671b((C1385c) abstractC10231l);
        }
    }, C1385c.class, InterfaceC10212a0.class);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10244y<InterfaceC10245z> f5468c = C12385o.m46415f(m7279c(), InterfaceC10245z.class, C0245t.m996h0());

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10232m<InterfaceC10212a0> f5469d = C12385o.m46414e(C1396h.m7288a(), InterfaceC10212a0.class, C0218f0.c.ASYMMETRIC_PUBLIC, C0247u.m1047k0());

    /* JADX INFO: renamed from: e */
    public static final C12398w.a<C1379a> f5470e = new C12398w.a() { // from class: bf.f
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C1394g.m7278b((C1379a) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f5471f = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static C1382b m7278b(C1379a c1379a, Integer num) throws GeneralSecurityException {
        KeyPair keyPairM22687f = C4589k.m22687f(c1379a.m7231c().m7240a());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairM22687f.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairM22687f.getPrivate();
        return C1382b.m7241d().m7249c(C1385c.m7252c().m7259d(c1379a).m7258c(num).m7260e(eCPublicKey.getW()).m7256a()).m7248b(C5110b.m23851a(eCPrivateKey.getS(), C10229j.m39322a())).m7247a();
    }

    /* JADX INFO: renamed from: c */
    public static String m7279c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m7280d() {
        HashMap map = new HashMap();
        map.put("ECDSA_P256", C1391e0.f5452a);
        map.put("ECDSA_P256_IEEE_P1363", C1391e0.f5455d);
        map.put("ECDSA_P256_RAW", C1379a.m7229b().m7237c(C1379a.d.f5429b).m7236b(C1379a.c.f5424c).m7238d(C1379a.e.f5433b).m7239e(C1379a.f.f5439e).m7235a());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", C1391e0.f5457f);
        map.put("ECDSA_P384", C1391e0.f5453b);
        map.put("ECDSA_P384_IEEE_P1363", C1391e0.f5456e);
        C1379a.b bVarM7237c = C1379a.m7229b().m7237c(C1379a.d.f5431d);
        C1379a.c cVar = C1379a.c.f5425d;
        C1379a.b bVarM7236b = bVarM7237c.m7236b(cVar);
        C1379a.e eVar = C1379a.e.f5434c;
        C1379a.b bVarM7238d = bVarM7236b.m7238d(eVar);
        C1379a.f fVar = C1379a.f.f5436b;
        map.put("ECDSA_P384_SHA512", bVarM7238d.m7239e(fVar).m7235a());
        map.put("ECDSA_P384_SHA384", C1379a.m7229b().m7237c(C1379a.d.f5430c).m7236b(cVar).m7238d(eVar).m7239e(fVar).m7235a());
        map.put("ECDSA_P521", C1391e0.f5454c);
        map.put("ECDSA_P521_IEEE_P1363", C1391e0.f5458g);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: e */
    public static void m7281e(boolean z10) throws GeneralSecurityException {
        C11844b.b bVar = f5471f;
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        C1641g.m8264m();
        C12401z.m46477a().m46479c(m7280d());
        C12358a0.m46226c().m46229d(f5466a);
        C12358a0.m46226c().m46229d(f5467b);
        C12398w.m46468f().m46470b(f5470e, C1379a.class);
        C12379l.m46383d().m46390h(f5468c, bVar, z10);
        C12379l.m46383d().m46390h(f5469d, bVar, false);
    }
}
