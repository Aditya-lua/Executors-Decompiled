package af;

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
    public static final ve.h0<b, oe.z> f410a = ve.h0.b(new ve.h0.b() { // from class: af.d
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.g.b((b) lVar);
        }
    }, b.class, oe.z.class);
    public static final ve.h0<c, oe.a0> b = ve.h0.b(new ve.h0.b() { // from class: af.e
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.h.b((c) lVar);
        }
    }, c.class, oe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe.y<oe.z> f411c = ve.o.f(c(), oe.z.class, ze.t.h0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oe.m<oe.a0> f412d = ve.o.e(h.a(), oe.a0.class, ze.f0.c.ASYMMETRIC_PUBLIC, ze.u.k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.w.a<a> f413e = new ve.w.a() { // from class: af.f
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return g.b((a) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f414f = te.b.EnumC0569b.b;

    public static b b(a aVar, Integer num) throws GeneralSecurityException {
        KeyPair keyPairF = cf.k.f(aVar.c().a());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairF.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairF.getPrivate();
        return b.d().c(c.c().d(aVar).c(num).e(eCPublicKey.getW()).a()).b(df.b.a(eCPrivateKey.getS(), oe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
    }

    public static Map<String, oe.x> d() {
        HashMap map = new HashMap();
        map.put("ECDSA_P256", e0.f397a);
        map.put("ECDSA_P256_IEEE_P1363", e0.f399d);
        map.put("ECDSA_P256_RAW", a.b().c(a.d.b).b(a.c.f377c).d(a.e.b).e(a.f.f388e).a());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", e0.f401f);
        map.put("ECDSA_P384", e0.b);
        map.put("ECDSA_P384_IEEE_P1363", e0.f400e);
        a.b bVarC = a.b().c(a.d.f382d);
        a.c cVar = a.c.f378d;
        a.b bVarB = bVarC.b(cVar);
        a.e eVar = a.e.f384c;
        a.b bVarD = bVarB.d(eVar);
        a.f fVar = a.f.b;
        map.put("ECDSA_P384_SHA512", bVarD.e(fVar).a());
        map.put("ECDSA_P384_SHA384", a.b().c(a.d.f381c).b(cVar).d(eVar).e(fVar).a());
        map.put("ECDSA_P521", e0.f398c);
        map.put("ECDSA_P521_IEEE_P1363", e0.f402g);
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        te.b.EnumC0569b enumC0569b = f414f;
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        bf.g.m();
        ve.z.a().c(d());
        ve.a0.c().d(f410a);
        ve.a0.c().d(b);
        ve.w.f().b(f413e, a.class);
        ve.l.d().h(f411c, enumC0569b, z10);
        ve.l.d().h(f412d, enumC0569b, false);
    }
}
