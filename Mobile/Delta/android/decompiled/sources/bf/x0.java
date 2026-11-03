package bf;

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
    public static final we.h0<s0, pe.z> f4180a = we.h0.b(new we.h0.b() { // from class: bf.u0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.x.b((s0) lVar);
        }
    }, s0.class, pe.z.class);
    public static final we.h0<t0, pe.a0> b = we.h0.b(new we.h0.b() { // from class: bf.v0
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.y.b((t0) lVar);
        }
    }, t0.class, pe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pe.y<pe.z> f4181c = we.o.f(c(), pe.z.class, af.x0.s0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final pe.m<pe.a0> f4182d = we.o.e(y0.a(), pe.a0.class, af.f0.c.ASYMMETRIC_PUBLIC, af.y0.l0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final we.w.a<r0> f4183e = new we.w.a() { // from class: bf.w0
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return x0.b((r0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ue.b.EnumC0590b f4184f = ue.b.EnumC0590b.b;

    public static s0 b(r0 r0Var, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = df.m.f14712g.a("RSA");
        keyPairGeneratorA.initialize(new RSAKeyGenParameterSpec(r0Var.d(), new BigInteger(1, r0Var.e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorA.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return s0.d().f(t0.c().e(r0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(ef.b.a(rSAPrivateCrtKey.getPrimeP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeQ(), pe.j.a())).e(ef.b.a(rSAPrivateCrtKey.getPrivateExponent(), pe.j.a())).c(ef.b.a(rSAPrivateCrtKey.getPrimeExponentP(), pe.j.a()), ef.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), pe.j.a())).b(ef.b.a(rSAPrivateCrtKey.getCrtCoefficient(), pe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public static Map<String, pe.x> d() {
        HashMap map = new HashMap();
        r0.b bVarB = r0.b();
        r0.c cVar = r0.c.b;
        r0.b bVarC = bVarB.f(cVar).b(cVar).e(32).c(3072);
        BigInteger bigInteger = r0.f4143g;
        r0.b bVarD = bVarC.d(bigInteger);
        r0.d dVar = r0.d.b;
        map.put("RSA_SSA_PSS_3072_SHA256_F4", bVarD.g(dVar).a());
        r0.b bVarD2 = r0.b().f(cVar).b(cVar).e(32).c(3072).d(bigInteger);
        r0.d dVar2 = r0.d.f4161e;
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", bVarD2.g(dVar2).a());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", e0.f4080m);
        r0.b bVarB2 = r0.b();
        r0.c cVar2 = r0.c.f4157d;
        map.put("RSA_SSA_PSS_4096_SHA512_F4", bVarB2.f(cVar2).b(cVar2).e(64).c(Barcode.FORMAT_AZTEC).d(bigInteger).g(dVar).a());
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", r0.b().f(cVar2).b(cVar2).e(64).c(Barcode.FORMAT_AZTEC).d(bigInteger).g(dVar2).a());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", e0.f4081n);
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        ue.b.EnumC0590b enumC0590b = f4184f;
        if (!enumC0590b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        cf.e0.p();
        we.z.a().c(d());
        we.a0.c().d(f4180a);
        we.a0.c().d(b);
        we.w.f().b(f4183e, r0.class);
        we.l.d().h(f4181c, enumC0590b, z10);
        we.l.d().h(f4182d, enumC0590b, false);
    }
}
