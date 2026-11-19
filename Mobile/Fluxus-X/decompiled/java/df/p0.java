package df;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<k0, re.z> f12336a = ye.h0.b(new ye.h0.b() { // from class: df.m0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.v.b((k0) lVar);
        }
    }, k0.class, re.z.class);
    public static final ye.h0<l0, re.a0> b = ye.h0.b(new ye.h0.b() { // from class: df.n0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.w.b((l0) lVar);
        }
    }, l0.class, re.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.y<re.z> f12337c = ye.o.f(c(), re.z.class, cf.t0.s0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.m<re.a0> f12338d = ye.o.e(q0.a(), re.a0.class, cf.f0.c.ASYMMETRIC_PUBLIC, cf.u0.k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.w.a<j0> f12339e = new ye.w.a() { // from class: df.o0
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return p0.b((j0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.b.EnumC0736b f12340f = we.b.EnumC0736b.b;

    public static k0 b(j0 j0Var, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = ff.m.f16049g.a("RSA");
        keyPairGeneratorA.initialize(new RSAKeyGenParameterSpec(j0Var.d(), new BigInteger(1, j0Var.e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorA.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return k0.d().f(l0.c().e(j0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(gf.b.a(rSAPrivateCrtKey.getPrimeP(), re.j.a()), gf.b.a(rSAPrivateCrtKey.getPrimeQ(), re.j.a())).e(gf.b.a(rSAPrivateCrtKey.getPrivateExponent(), re.j.a())).c(gf.b.a(rSAPrivateCrtKey.getPrimeExponentP(), re.j.a()), gf.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), re.j.a())).b(gf.b.a(rSAPrivateCrtKey.getCrtCoefficient(), re.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public static Map<String, re.x> d() {
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", e0.f12275j);
        j0.b bVarC = j0.b().b(j0.c.b).c(3072);
        BigInteger bigInteger = j0.f12295e;
        j0.b bVarD = bVarC.d(bigInteger);
        j0.d dVar = j0.d.f12309e;
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", bVarD.e(dVar).a());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", e0.f12276k);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", e0.f12277l);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", j0.b().b(j0.c.f12305d).c(Barcode.FORMAT_AZTEC).d(bigInteger).e(dVar).a());
        return map;
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        we.b.EnumC0736b enumC0736b = f12340f;
        if (!enumC0736b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        ef.w.p();
        ye.z.a().c(d());
        ye.a0.c().d(f12336a);
        ye.a0.c().d(b);
        ye.w.f().b(f12339e, j0.class);
        ye.l.d().h(f12337c, enumC0736b, z10);
        ye.l.d().h(f12338d, enumC0736b, false);
    }
}
