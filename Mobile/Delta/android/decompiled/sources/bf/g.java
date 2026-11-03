package bf;

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
    public static final we.h0<b, pe.z> f4082a = we.h0.b(new we.h0.b() { // from class: bf.d
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.g.b((b) lVar);
        }
    }, b.class, pe.z.class);
    public static final we.h0<c, pe.a0> b = we.h0.b(new we.h0.b() { // from class: bf.e
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.h.b((c) lVar);
        }
    }, c.class, pe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4083c = we.o.f(c(), pe.z.class, af.t.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4084d = we.o.e(h.a(), pe.a0.class, af.f0.c.ASYMMETRIC_PUBLIC, af.u.k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.w.a<a> f4085e = new we.w.a() { // from class: bf.f
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return g.b((a) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue.b.EnumC0590b f4086f = ue.b.EnumC0590b.b;

    public static b b(a aVar, Integer num) throws GeneralSecurityException {
        KeyPair keyPairF = df.k.f(aVar.c().a());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairF.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairF.getPrivate();
        return b.d().c(c.c().d(aVar).c(num).e(eCPublicKey.getW()).a()).b(ef.b.a(eCPrivateKey.getS(), pe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public static Map<String, pe.x> d() {
        HashMap map = new HashMap();
        map.put("ECDSA_P256", e0.f4069a);
        map.put("ECDSA_P256_IEEE_P1363", e0.f4071d);
        map.put("ECDSA_P256_RAW", a.b().c(a.d.b).b(a.c.f4049c).d(a.e.b).e(a.f.f4060e).a());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", e0.f4073f);
        map.put("ECDSA_P384", e0.b);
        map.put("ECDSA_P384_IEEE_P1363", e0.f4072e);
        a.b bVarC = a.b().c(a.d.f4054d);
        a.c cVar = a.c.f4050d;
        a.b bVarB = bVarC.b(cVar);
        a.e eVar = a.e.f4056c;
        a.b bVarD = bVarB.d(eVar);
        a.f fVar = a.f.b;
        map.put("ECDSA_P384_SHA512", bVarD.e(fVar).a());
        map.put("ECDSA_P384_SHA384", a.b().c(a.d.f4053c).b(cVar).d(eVar).e(fVar).a());
        map.put("ECDSA_P521", e0.f4070c);
        map.put("ECDSA_P521_IEEE_P1363", e0.f4074g);
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        ue.b.EnumC0590b enumC0590b = f4086f;
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.g.m();
        we.z.a().c(d());
        we.a0.c().d(f4082a);
        we.a0.c().d(b);
        we.w.f().b(f4085e, a.class);
        we.l.d().h(f4083c, enumC0590b, z10);
        we.l.d().h(f4084d, enumC0590b, false);
    }
}
