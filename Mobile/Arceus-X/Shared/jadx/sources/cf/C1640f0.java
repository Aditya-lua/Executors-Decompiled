package cf;

import bf.C1417r0;
import bf.C1419s0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import p076df.C4578a0;
import p076df.C4583e;
import p465ue.C11844b;
import pe.C10229j;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: cf.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1640f0 implements InterfaceC10245z {

    /* JADX INFO: renamed from: g */
    public static final C11844b.b f6339g = C11844b.b.f41602b;

    /* JADX INFO: renamed from: h */
    public static final byte[] f6340h = new byte[0];

    /* JADX INFO: renamed from: i */
    public static final byte[] f6341i = {0};

    /* JADX INFO: renamed from: a */
    public final RSAPrivateCrtKey f6342a;

    /* JADX INFO: renamed from: b */
    public final String f6343b;

    /* JADX INFO: renamed from: c */
    public final PSSParameterSpec f6344c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6345d;

    /* JADX INFO: renamed from: e */
    public final byte[] f6346e;

    /* JADX INFO: renamed from: f */
    public final Provider f6347f;

    public C1640f0(RSAPrivateCrtKey rSAPrivateCrtKey, C1417r0.c cVar, C1417r0.c cVar2, int i10, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!f6339g.mo44243a()) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        C4578a0.m22639c(rSAPrivateCrtKey.getModulus().bitLength());
        C4578a0.m22640d(rSAPrivateCrtKey.getPublicExponent());
        this.f6342a = rSAPrivateCrtKey;
        this.f6343b = C1642g0.m8279d(cVar);
        this.f6344c = C1642g0.m8282g(cVar, cVar2, i10);
        this.f6345d = bArr;
        this.f6346e = bArr2;
        this.f6347f = provider;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10245z m8251b(C1419s0 c1419s0) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerM8277b = C1642g0.m8277b();
        if (providerM8277b == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerM8277b);
        C1417r0 c1417r0M7364f = c1419s0.m7364f();
        return new C1640f0((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(c1419s0.mo7242c().m7378d(), c1417r0M7364f.m7350e(), c1419s0.m7369k().m23852b(C10229j.m39322a()), c1419s0.m7367i().m23852b(C10229j.m39322a()), c1419s0.m7368j().m23852b(C10229j.m39322a()), c1419s0.m7365g().m23852b(C10229j.m39322a()), c1419s0.m7366h().m23852b(C10229j.m39322a()), c1419s0.m7363e().m23852b(C10229j.m39322a()))), c1417r0M7364f.m7352g(), c1417r0M7364f.m7348c(), c1417r0M7364f.m7351f(), c1419s0.m7251b().m23850d(), c1417r0M7364f.m7353h().equals(C1417r0.d.f5566d) ? f6341i : f6340h, providerM8277b);
    }

    @Override // pe.InterfaceC10245z
    /* JADX INFO: renamed from: a */
    public byte[] mo7287a(byte[] bArr) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        Signature signature = Signature.getInstance(this.f6343b, this.f6347f);
        signature.initSign(this.f6342a);
        signature.setParameter(this.f6344c);
        signature.update(bArr);
        byte[] bArr2 = this.f6346e;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.f6345d;
        return bArr3.length == 0 ? bArrSign : C4583e.m22661a(bArr3, bArrSign);
    }
}
