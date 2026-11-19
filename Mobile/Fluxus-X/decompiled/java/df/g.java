package df;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<b, re.z> f12280a = ye.h0.b(new ye.h0.b() { // from class: df.d
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.g.b((b) lVar);
        }
    }, b.class, re.z.class);
    public static final ye.h0<c, re.a0> b = ye.h0.b(new ye.h0.b() { // from class: df.e
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.h.b((c) lVar);
        }
    }, c.class, re.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.y<re.z> f12281c = ye.o.f(c(), re.z.class, cf.t.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.m<re.a0> f12282d = ye.o.e(h.a(), re.a0.class, cf.f0.c.ASYMMETRIC_PUBLIC, cf.u.k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.w.a<a> f12283e = new ye.w.a() { // from class: df.f
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return g.b((a) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.b.EnumC0736b f12284f = we.b.EnumC0736b.b;

    public static b b(a aVar, Integer num) throws GeneralSecurityException {
        KeyPair keyPairF = ff.k.f(aVar.c().a());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairF.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairF.getPrivate();
        return b.d().c(c.c().d(aVar).c(num).e(eCPublicKey.getW()).a()).b(gf.b.a(eCPrivateKey.getS(), re.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public static Map<String, re.x> d() {
        HashMap map = new HashMap();
        map.put("ECDSA_P256", e0.f12267a);
        map.put("ECDSA_P256_IEEE_P1363", e0.f12269d);
        map.put("ECDSA_P256_RAW", a.b().c(a.d.b).b(a.c.f12247c).d(a.e.b).e(a.f.f12258e).a());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", e0.f12271f);
        map.put("ECDSA_P384", e0.b);
        map.put("ECDSA_P384_IEEE_P1363", e0.f12270e);
        a.b bVarC = a.b().c(a.d.f12252d);
        a.c cVar = a.c.f12248d;
        a.b bVarB = bVarC.b(cVar);
        a.e eVar = a.e.f12254c;
        a.b bVarD = bVarB.d(eVar);
        a.f fVar = a.f.b;
        map.put("ECDSA_P384_SHA512", bVarD.e(fVar).a());
        map.put("ECDSA_P384_SHA384", a.b().c(a.d.f12251c).b(cVar).d(eVar).e(fVar).a());
        map.put("ECDSA_P521", e0.f12268c);
        map.put("ECDSA_P521_IEEE_P1363", e0.f12272g);
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        we.b.EnumC0736b enumC0736b = f12284f;
        if (!enumC0736b.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        ef.g.m();
        ye.z.a().c(d());
        ye.a0.c().d(f12280a);
        ye.a0.c().d(b);
        ye.w.f().b(f12283e, a.class);
        ye.l.d().h(f12281c, enumC0736b, z10);
        ye.l.d().h(f12282d, enumC0736b, false);
    }
}
