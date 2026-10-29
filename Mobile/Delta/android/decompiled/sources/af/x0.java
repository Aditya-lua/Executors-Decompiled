package af;

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
    public static final ve.h0<s0, oe.z> f508a = ve.h0.b(new ve.h0.b() { // from class: af.u0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.x.b((s0) lVar);
        }
    }, s0.class, oe.z.class);
    public static final ve.h0<t0, oe.a0> b = ve.h0.b(new ve.h0.b() { // from class: af.v0
        @Override // ve.h0.b
        public final Object a(oe.l lVar) {
            return cf.y.b((t0) lVar);
        }
    }, t0.class, oe.a0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oe.y<oe.z> f509c = ve.o.f(c(), oe.z.class, ze.x0.s0());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oe.m<oe.a0> f510d = ve.o.e(y0.a(), oe.a0.class, ze.f0.c.ASYMMETRIC_PUBLIC, ze.y0.l0());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ve.w.a<r0> f511e = new ve.w.a() { // from class: af.w0
        @Override // ve.w.a
        public final oe.l a(oe.x xVar, Integer num) {
            return x0.b((r0) xVar, num);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f512f = te.b.EnumC0569b.b;

    public static s0 b(r0 r0Var, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorA = cf.m.f4874g.a("RSA");
        keyPairGeneratorA.initialize(new RSAKeyGenParameterSpec(r0Var.d(), new BigInteger(1, r0Var.e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorA.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return s0.d().f(t0.c().e(r0Var).d(rSAPublicKey.getModulus()).c(num).a()).d(df.b.a(rSAPrivateCrtKey.getPrimeP(), oe.j.a()), df.b.a(rSAPrivateCrtKey.getPrimeQ(), oe.j.a())).e(df.b.a(rSAPrivateCrtKey.getPrivateExponent(), oe.j.a())).c(df.b.a(rSAPrivateCrtKey.getPrimeExponentP(), oe.j.a()), df.b.a(rSAPrivateCrtKey.getPrimeExponentQ(), oe.j.a())).b(df.b.a(rSAPrivateCrtKey.getCrtCoefficient(), oe.j.a())).a();
    }

    public static String c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    public static Map<String, oe.x> d() {
        HashMap map = new HashMap();
        r0.b bVarB = r0.b();
        r0.c cVar = r0.c.b;
        r0.b bVarC = bVarB.f(cVar).b(cVar).e(32).c(3072);
        BigInteger bigInteger = r0.f471g;
        r0.b bVarD = bVarC.d(bigInteger);
        r0.d dVar = r0.d.b;
        map.put("RSA_SSA_PSS_3072_SHA256_F4", bVarD.g(dVar).a());
        r0.b bVarD2 = r0.b().f(cVar).b(cVar).e(32).c(3072).d(bigInteger);
        r0.d dVar2 = r0.d.f489e;
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", bVarD2.g(dVar2).a());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", e0.f408m);
        r0.b bVarB2 = r0.b();
        r0.c cVar2 = r0.c.f485d;
        map.put("RSA_SSA_PSS_4096_SHA512_F4", bVarB2.f(cVar2).b(cVar2).e(64).c(Barcode.FORMAT_AZTEC).d(bigInteger).g(dVar).a());
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", r0.b().f(cVar2).b(cVar2).e(64).c(Barcode.FORMAT_AZTEC).d(bigInteger).g(dVar2).a());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", e0.f409n);
        return Collections.unmodifiableMap(map);
    }

    public static void e(boolean z10) throws GeneralSecurityException {
        te.b.EnumC0569b enumC0569b = f512f;
        if (!enumC0569b.a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        bf.e0.p();
        ve.z.a().c(d());
        ve.a0.c().d(f508a);
        ve.a0.c().d(b);
        ve.w.f().b(f511e, r0.class);
        ve.l.d().h(f509c, enumC0569b, z10);
        ve.l.d().h(f510d, enumC0569b, false);
    }
}
