package bf;

import af.C0218f0;
import af.C0246t0;
import af.C0248u0;
import cf.C1658w;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import p076df.C4591m;
import p076df.C4600v;
import p076df.C4601w;
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

/* JADX INFO: renamed from: bf.p0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1413p0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC12372h0<C1403k0, InterfaceC10245z> f5539a = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.m0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4600v.m22725b((C1403k0) abstractC10231l);
        }
    }, C1403k0.class, InterfaceC10245z.class);

    /* JADX INFO: renamed from: b */
    public static final AbstractC12372h0<C1405l0, InterfaceC10212a0> f5540b = AbstractC12372h0.m46324b(new AbstractC12372h0.b() { // from class: bf.n0
        @Override // p515we.AbstractC12372h0.b
        /* JADX INFO: renamed from: a */
        public final Object mo7261a(AbstractC10231l abstractC10231l) {
            return C4601w.m22727b((C1405l0) abstractC10231l);
        }
    }, C1405l0.class, InterfaceC10212a0.class);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10244y<InterfaceC10245z> f5541c = C12385o.m46415f(m7343c(), InterfaceC10245z.class, C0246t0.m1015s0());

    /* JADX INFO: renamed from: d */
    public static final InterfaceC10232m<InterfaceC10212a0> f5542d = C12385o.m46414e(C1415q0.m7346a(), InterfaceC10212a0.class, C0218f0.c.ASYMMETRIC_PUBLIC, C0248u0.m1065k0());

    /* JADX INFO: renamed from: e */
    public static final C12398w.a<C1401j0> f5543e = new C12398w.a() { // from class: bf.o0
        @Override // p515we.C12398w.a
        /* JADX INFO: renamed from: a */
        public final AbstractC10231l mo7276a(AbstractC10243x abstractC10243x, Integer num) {
            return C1413p0.m7342b((C1401j0) abstractC10243x, num);
        }
    };

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f5544f = C11844b.b.f41602b;

    /* JADX INFO: renamed from: b */
    public static C1403k0 m7342b(C1401j0 c1401j0, Integer num) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorM22699a = C4591m.f18802g.m22699a("RSA");
        keyPairGeneratorM22699a.initialize(new RSAKeyGenParameterSpec(c1401j0.m7300d(), new BigInteger(1, c1401j0.m7301e().toByteArray())));
        KeyPair keyPairGenerateKeyPair = keyPairGeneratorM22699a.generateKeyPair();
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair.getPrivate();
        return C1403k0.m7309d().m7323f(C1405l0.m7324c().m7331e(c1401j0).m7330d(rSAPublicKey.getModulus()).m7329c(num).m7327a()).m7321d(C5110b.m23851a(rSAPrivateCrtKey.getPrimeP(), C10229j.m39322a()), C5110b.m23851a(rSAPrivateCrtKey.getPrimeQ(), C10229j.m39322a())).m7322e(C5110b.m23851a(rSAPrivateCrtKey.getPrivateExponent(), C10229j.m39322a())).m7320c(C5110b.m23851a(rSAPrivateCrtKey.getPrimeExponentP(), C10229j.m39322a()), C5110b.m23851a(rSAPrivateCrtKey.getPrimeExponentQ(), C10229j.m39322a())).m7319b(C5110b.m23851a(rSAPrivateCrtKey.getCrtCoefficient(), C10229j.m39322a())).m7318a();
    }

    /* JADX INFO: renamed from: c */
    public static String m7343c() {
        return "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, AbstractC10243x> m7344d() {
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", C1391e0.f5461j);
        C1401j0.b bVarM7305c = C1401j0.m7298b().m7304b(C1401j0.c.f5499b).m7305c(3072);
        BigInteger bigInteger = C1401j0.f5488e;
        C1401j0.b bVarM7306d = bVarM7305c.m7306d(bigInteger);
        C1401j0.d dVar = C1401j0.d.f5506e;
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", bVarM7306d.m7307e(dVar).m7303a());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", C1391e0.f5462k);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", C1391e0.f5463l);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", C1401j0.m7298b().m7304b(C1401j0.c.f5501d).m7305c(4096).m7306d(bigInteger).m7307e(dVar).m7303a());
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static void m7345e(boolean z10) throws GeneralSecurityException {
        C11844b.b bVar = f5544f;
        if (!bVar.mo44243a()) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        C1658w.m8317p();
        C12401z.m46477a().m46479c(m7344d());
        C12358a0.m46226c().m46229d(f5539a);
        C12358a0.m46226c().m46229d(f5540b);
        C12398w.m46468f().m46470b(f5543e, C1401j0.class);
        C12379l.m46383d().m46390h(f5541c, bVar, z10);
        C12379l.m46383d().m46390h(f5542d, bVar, false);
    }
}
