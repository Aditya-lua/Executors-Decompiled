package bf;

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
    public static final we.h0<k0, pe.z> f4138a = we.h0.b(new we.h0.b() { // from class: bf.m0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.v.b((k0) lVar);
        }
    }, k0.class, pe.z.class);
    public static final we.h0<l0, pe.a0> b = we.h0.b(new we.h0.b() { // from class: bf.n0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.w.b((l0) lVar);
        }
    }, l0.class, pe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4139c = we.o.f(c(), pe.z.class, af.t0.s0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4140d = we.o.e(q0.a(), pe.a0.class, af.f0.c.ASYMMETRIC_PUBLIC, af.u0.k0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.w.a<j0> f4141e = new we.w.a() { // from class: bf.o0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return p0.b((j0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue.b.EnumC0590b f4142f = ue.b.EnumC0590b.b;

    public static k0 b(j0 j0Var, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = df.m.f14712g.a("RSA");
        keyPairGeneratorA.initialize(new RSAKeyGenParameterSpec(j0Var.d(), new BigInteger(1, j0Var.e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorA.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return k0.d().f(l0.c().e(j0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(ef.b.a(rSAPrivateCrtKey.getPrimeP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeQ(), pe.j.a())).e(ef.b.a(rSAPrivateCrtKey.getPrivateExponent(), pe.j.a())).c(ef.b.a(rSAPrivateCrtKey.getPrimeExponentP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), pe.j.a())).b(ef.b.a(rSAPrivateCrtKey.getCrtCoefficient(), pe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    public static Map<String, pe.x> d() {
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", e0.f4077j);
        j0.b bVarC = j0.b().b(j0.c.b).c(3072);
        BigInteger bigInteger = j0.f4097e;
        j0.b bVarD = bVarC.d(bigInteger);
        j0.d dVar = j0.d.f4111e;
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", bVarD.e(dVar).a());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", e0.f4078k);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", e0.f4079l);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", j0.b().b(j0.c.f4107d).c(Barcode.FORMAT_AZTEC).d(bigInteger).e(dVar).a());
        return map;
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        ue.b.EnumC0590b enumC0590b = f4142f;
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.w.p();
        we.z.a().c(d());
        we.a0.c().d(f4138a);
        we.a0.c().d(b);
        we.w.f().b(f4141e, j0.class);
        we.l.d().h(f4139c, enumC0590b, z10);
        we.l.d().h(f4140d, enumC0590b, false);
    }
}
