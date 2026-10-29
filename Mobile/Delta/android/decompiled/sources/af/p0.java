package af;

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
    public static final ve.h0<k0, oe.z> f466a = ve.h0.b(new ve.h0.b() { // from class: af.m0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.v.b((k0) lVar);
        }
    }, k0.class, oe.z.class);
    public static final ve.h0<l0, oe.a0> b = ve.h0.b(new ve.h0.b() { // from class: af.n0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.w.b((l0) lVar);
        }
    }, l0.class, oe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe.y<oe.z> f467c = ve.o.f(c(), oe.z.class, ze.t0.s0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oe.m<oe.a0> f468d = ve.o.e(q0.a(), oe.a0.class, ze.f0.c.ASYMMETRIC_PUBLIC, ze.u0.k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.w.a<j0> f469e = new ve.w.a() { // from class: af.o0
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return p0.b((j0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f470f = te.b.EnumC0569b.b;

    public static k0 b(j0 j0Var, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = cf.m.f4874g.a("RSA");
        keyPairGeneratorA.initialize(new RSAKeyGenParameterSpec(j0Var.d(), new BigInteger(1, j0Var.e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorA.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return k0.d().f(l0.c().e(j0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(df.b.a(rSAPrivateCrtKey.getPrimeP(), oe.j.a()), df.b.a(rSAPrivateCrtKey.getPrimeQ(), oe.j.a())).e(df.b.a(rSAPrivateCrtKey.getPrivateExponent(), oe.j.a())).c(df.b.a(rSAPrivateCrtKey.getPrimeExponentP(), oe.j.a()), df.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), oe.j.a())).b(df.b.a(rSAPrivateCrtKey.getCrtCoefficient(), oe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public static Map<String, oe.x> d() {
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", e0.f405j);
        j0.b bVarC = j0.b().b(j0.c.b).c(3072);
        BigInteger bigInteger = j0.f425e;
        j0.b bVarD = bVarC.d(bigInteger);
        j0.d dVar = j0.d.f439e;
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", bVarD.e(dVar).a());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", e0.f406k);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", e0.f407l);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", j0.b().b(j0.c.f435d).c(Barcode.FORMAT_AZTEC).d(bigInteger).e(dVar).a());
        return map;
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        te.b.EnumC0569b enumC0569b = f470f;
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        bf.w.p();
        ve.z.a().c(d());
        ve.a0.c().d(f466a);
        ve.a0.c().d(b);
        ve.w.f().b(f469e, j0.class);
        ve.l.d().h(f467c, enumC0569b, z10);
        ve.l.d().h(f468d, enumC0569b, false);
    }
}
