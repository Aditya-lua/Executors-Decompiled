package df;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ye.h0<s0, re.z> f12378a = ye.h0.b(new ye.h0.b() { // from class: df.u0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.x.b((s0) lVar);
        }
    }, s0.class, re.z.class);
    public static final ye.h0<t0, re.a0> b = ye.h0.b(new ye.h0.b() { // from class: df.v0
        @Override // ye.h0.b
        public final Object a(re.l lVar) {
            return ff.y.b((t0) lVar);
        }
    }, t0.class, re.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final re.y<re.z> f12379c = ye.o.f(c(), re.z.class, cf.x0.s0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final re.m<re.a0> f12380d = ye.o.e(y0.a(), re.a0.class, cf.f0.c.ASYMMETRIC_PUBLIC, cf.y0.l0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ye.w.a<r0> f12381e = new ye.w.a() { // from class: df.w0
        @Override // ye.w.a
        public final re.l a(re.x xVar, Integer num) {
            return x0.b((r0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final we.b.EnumC0736b f12382f = we.b.EnumC0736b.b;

    public static s0 b(r0 r0Var, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = ff.m.f16049g.a("RSA");
        keyPairGeneratorA.initialize(new RSAKeyGenParameterSpec(r0Var.d(), new BigInteger(1, r0Var.e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorA.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return s0.d().f(t0.c().e(r0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(gf.b.a(rSAPrivateCrtKey.getPrimeP(), re.j.a()), gf.b.a(rSAPrivateCrtKey.getPrimeQ(), re.j.a())).e(gf.b.a(rSAPrivateCrtKey.getPrivateExponent(), re.j.a())).c(gf.b.a(rSAPrivateCrtKey.getPrimeExponentP(), re.j.a()), gf.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), re.j.a())).b(gf.b.a(rSAPrivateCrtKey.getCrtCoefficient(), re.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public static Map<String, re.x> d() {
        HashMap map = new HashMap();
        r0.b bVarB = r0.b();
        r0.c cVar = r0.c.b;
        r0.b bVarC = bVarB.f(cVar).b(cVar).e(32).c(3072);
        BigInteger bigInteger = r0.f12341g;
        r0.b bVarD = bVarC.d(bigInteger);
        r0.d dVar = r0.d.b;
        map.put("RSA_SSA_PSS_3072_SHA256_F4", bVarD.g(dVar).a());
        r0.b bVarD2 = r0.b().f(cVar).b(cVar).e(32).c(3072).d(bigInteger);
        r0.d dVar2 = r0.d.f12359e;
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", bVarD2.g(dVar2).a());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", e0.f12278m);
        r0.b bVarB2 = r0.b();
        r0.c cVar2 = r0.c.f12355d;
        map.put("RSA_SSA_PSS_4096_SHA512_F4", bVarB2.f(cVar2).b(cVar2).e(64).c(Barcode.FORMAT_AZTEC).d(bigInteger).g(dVar).a());
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", r0.b().f(cVar2).b(cVar2).e(64).c(Barcode.FORMAT_AZTEC).d(bigInteger).g(dVar2).a());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", e0.f12279n);
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        we.b.EnumC0736b enumC0736b = f12382f;
        if (!enumC0736b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        ef.e0.p();
        ye.z.a().c(d());
        ye.a0.c().d(f12378a);
        ye.a0.c().d(b);
        ye.w.f().b(f12381e, r0.class);
        ye.l.d().h(f12379c, enumC0736b, z10);
        ye.l.d().h(f12380d, enumC0736b, false);
    }
}
