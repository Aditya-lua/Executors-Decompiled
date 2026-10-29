package bf;

import af.C0218f0;
import af.C0254x0;
import af.C0256y0;
import cf.C1638e0;
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
import p076df.C4591m;
import p076df.C4602x;
import p076df.C4603y;
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

/* JADX INFO: renamed from: bf.x0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1429x0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C1419s0, InterfaceC10245z> f5590a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.u0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4602x.m22731b((C1419s0) abstractC10231l);
        }
    }, C1419s0.class, InterfaceC10245z.class);

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C1421t0, InterfaceC10212a0> f5591b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.v0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4603y.m22735b((C1421t0) abstractC10231l);
        }
    }, C1421t0.class, InterfaceC10212a0.class);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10244y<InterfaceC10245z> f5592c = C12385o.m46415f(m7387c(), InterfaceC10245z.class, C0254x0.m1137s0());

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10232m<InterfaceC10212a0> f5593d = C12385o.m46414e(C1431y0.m7390a(), InterfaceC10212a0.class, C0218f0.c.ASYMMETRIC_PUBLIC, C0256y0.m1179l0());

    /* JADX INFO: renamed from: e */
    public static final C12398w.a<C1417r0> f5594e = new C12398w.a() { // from class: bf.w0
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C1429x0.m7386b((C1417r0) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f5595f = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static C1419s0 m7386b(C1417r0 c1417r0, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorM22699a = C4591m.f18802g.m22699a("RSA");
        keyPairGeneratorM22699a.initialize(new RSAKeyGenParameterSpec(c1417r0.m7349d(), new BigInteger(1, c1417r0.m7350e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorM22699a.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return C1419s0.m7362d().m7376f(C1421t0.m7377c().m7384e(c1417r0).m7383d(rSAPublicKey.getModulus()).m7382c(num).m7380a()).m7374d(C5110b.m23851a(rSAPrivateCrtKey.getPrimeP(), C10229j.m39322a()), C5110b.m23851a(rSAPrivateCrtKey.getPrimeQ(), C10229j.m39322a())).m7375e(C5110b.m23851a(rSAPrivateCrtKey.getPrivateExponent(), C10229j.m39322a())).m7373c(C5110b.m23851a(rSAPrivateCrtKey.getPrimeExponentP(), C10229j.m39322a()), C5110b.m23851a(rSAPrivateCrtKey.getPrimeExponentQ(), C10229j.m39322a())).m7372b(C5110b.m23851a(rSAPrivateCrtKey.getCrtCoefficient(), C10229j.m39322a())).m7371a();
    }

    /* JADX INFO: renamed from: c */
    public static String m7387c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m7388d() {
        HashMap map = new HashMap();
        C1417r0.b bVarM7347b = C1417r0.m7347b();
        C1417r0.c cVar = C1417r0.c.f5560b;
        C1417r0.b bVarM7356c = bVarM7347b.m7359f(cVar).m7355b(cVar).m7358e(32).m7356c(3072);
        BigInteger bigInteger = C1417r0.f5545g;
        C1417r0.b bVarM7357d = bVarM7356c.m7357d(bigInteger);
        C1417r0.d dVar = C1417r0.d.f5564b;
        map.put("RSA_SSA_PSS_3072_SHA256_F4", bVarM7357d.m7360g(dVar).m7354a());
        C1417r0.b bVarM7357d2 = C1417r0.m7347b().m7359f(cVar).m7355b(cVar).m7358e(32).m7356c(3072).m7357d(bigInteger);
        C1417r0.d dVar2 = C1417r0.d.f5567e;
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", bVarM7357d2.m7360g(dVar2).m7354a());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", C1391e0.f5464m);
        C1417r0.b bVarM7347b2 = C1417r0.m7347b();
        C1417r0.c cVar2 = C1417r0.c.f5562d;
        map.put("RSA_SSA_PSS_4096_SHA512_F4", bVarM7347b2.m7359f(cVar2).m7355b(cVar2).m7358e(64).m7356c(4096).m7357d(bigInteger).m7360g(dVar).m7354a());
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", C1417r0.m7347b().m7359f(cVar2).m7355b(cVar2).m7358e(64).m7356c(4096).m7357d(bigInteger).m7360g(dVar2).m7354a());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", C1391e0.f5465n);
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: e */
    public static void m7389e(boolean z10) throws GeneralSecurityException {
        C11844b.b bVar = f5595f;
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        C1638e0.m8246p();
        C12401z.m46477a().m46479c(m7388d());
        C12358a0.m46226c().m46229d(f5590a);
        C12358a0.m46226c().m46229d(f5591b);
        C12398w.m46468f().m46470b(f5594e, C1417r0.class);
        C12379l.m46383d().m46390h(f5592c, bVar, z10);
        C12379l.m46383d().m46390h(f5593d, bVar, false);
    }
}
