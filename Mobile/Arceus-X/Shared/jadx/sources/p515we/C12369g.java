package p515we;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import p076df.C4599u;

/* JADX INFO: renamed from: we.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C12369g {

    /* JADX INFO: renamed from: a */
    public static final ECParameterSpec f44250a = m46306f();

    /* JADX INFO: renamed from: b */
    public static final ECParameterSpec f44251b = m46307g();

    /* JADX INFO: renamed from: c */
    public static final ECParameterSpec f44252c = m46308h();

    /* JADX INFO: renamed from: d */
    public static final BigInteger f44253d = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: e */
    public static final BigInteger f44254e = BigInteger.valueOf(3);

    /* JADX INFO: renamed from: f */
    public static final BigInteger f44255f = BigInteger.valueOf(4);

    /* JADX INFO: renamed from: g */
    public static final BigInteger f44256g = BigInteger.valueOf(8);

    /* JADX INFO: renamed from: we.g$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static final a f44257d;

        /* JADX INFO: renamed from: a */
        public BigInteger f44258a;

        /* JADX INFO: renamed from: b */
        public BigInteger f44259b;

        /* JADX INFO: renamed from: c */
        public BigInteger f44260c;

        static {
            BigInteger bigInteger = BigInteger.ONE;
            f44257d = new a(bigInteger, bigInteger, BigInteger.ZERO);
        }

        public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.f44258a = bigInteger;
            this.f44259b = bigInteger2;
            this.f44260c = bigInteger3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m46313a() {
            return this.f44260c.equals(BigInteger.ZERO);
        }

        /* JADX INFO: renamed from: b */
        public ECPoint m46314b(BigInteger bigInteger) {
            if (m46313a()) {
                return ECPoint.POINT_INFINITY;
            }
            BigInteger bigIntegerModInverse = this.f44260c.modInverse(bigInteger);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigInteger);
            return new ECPoint(this.f44258a.multiply(bigIntegerMod).mod(bigInteger), this.f44259b.multiply(bigIntegerMod).mod(bigInteger).multiply(bigIntegerModInverse).mod(bigInteger));
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m46301a(a aVar, a aVar2, BigInteger bigInteger, BigInteger bigInteger2) {
        if (aVar.m46313a()) {
            return aVar2;
        }
        if (aVar2.m46313a()) {
            return aVar;
        }
        BigInteger bigInteger3 = aVar.f44260c;
        BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = aVar2.f44260c;
        BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerMod3 = aVar.f44258a.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod4 = aVar2.f44258a.multiply(bigIntegerMod).mod(bigInteger2);
        BigInteger bigIntegerMod5 = aVar.f44259b.multiply(aVar2.f44260c).mod(bigInteger2).multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod6 = aVar2.f44259b.multiply(aVar.f44260c).mod(bigInteger2).multiply(bigIntegerMod).mod(bigInteger2);
        if (bigIntegerMod3.equals(bigIntegerMod4)) {
            return !bigIntegerMod5.equals(bigIntegerMod6) ? a.f44257d : m46303c(aVar, bigInteger, bigInteger2);
        }
        BigInteger bigIntegerMod7 = bigIntegerMod4.subtract(bigIntegerMod3).mod(bigInteger2);
        BigInteger bigIntegerMod8 = bigIntegerMod7.multiply(f44255f).multiply(bigIntegerMod7).mod(bigInteger2);
        BigInteger bigIntegerMod9 = bigIntegerMod7.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerSubtract = bigIntegerMod6.subtract(bigIntegerMod5);
        BigInteger bigInteger5 = f44253d;
        BigInteger bigIntegerMod10 = bigIntegerSubtract.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerMod11 = bigIntegerMod3.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerMod12 = bigIntegerMod10.multiply(bigIntegerMod10).mod(bigInteger2).subtract(bigIntegerMod9).subtract(bigIntegerMod11.multiply(bigInteger5)).mod(bigInteger2);
        BigInteger bigIntegerMod13 = bigIntegerMod10.multiply(bigIntegerMod11.subtract(bigIntegerMod12)).subtract(bigIntegerMod5.multiply(bigInteger5).multiply(bigIntegerMod9)).mod(bigInteger2);
        BigInteger bigIntegerAdd = aVar.f44260c.add(aVar2.f44260c);
        return new a(bigIntegerMod12, bigIntegerMod13, bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod2).multiply(bigIntegerMod7).mod(bigInteger2));
    }

    /* JADX INFO: renamed from: b */
    public static void m46302b(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerM46304d = m46304d(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerM46304d) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerM46304d) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerM46304d).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerM46304d))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* JADX INFO: renamed from: c */
    public static a m46303c(a aVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (aVar.f44259b.equals(BigInteger.ZERO)) {
            return a.f44257d;
        }
        BigInteger bigInteger3 = aVar.f44258a;
        BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = aVar.f44259b;
        BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerMod3 = bigIntegerMod2.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigInteger5 = aVar.f44260c;
        BigInteger bigIntegerMod4 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerAdd = aVar.f44258a.add(bigIntegerMod2);
        BigInteger bigIntegerSubtract = bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod3);
        BigInteger bigInteger6 = f44253d;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigInteger6);
        BigInteger bigIntegerAdd2 = bigIntegerMod.multiply(f44254e).add(bigInteger.multiply(bigIntegerMod4).multiply(bigIntegerMod4).mod(bigInteger2));
        BigInteger bigIntegerMod5 = bigIntegerAdd2.multiply(bigIntegerAdd2).mod(bigInteger2).subtract(bigIntegerMultiply.multiply(bigInteger6)).mod(bigInteger2);
        BigInteger bigIntegerMod6 = bigIntegerAdd2.multiply(bigIntegerMultiply.subtract(bigIntegerMod5)).mod(bigInteger2).subtract(bigIntegerMod3.multiply(f44256g)).mod(bigInteger2);
        BigInteger bigIntegerAdd3 = aVar.f44259b.add(aVar.f44260c);
        return new a(bigIntegerMod5, bigIntegerMod6, bigIntegerAdd3.multiply(bigIntegerAdd3).mod(bigInteger2).subtract(bigIntegerMod2).subtract(bigIntegerMod4).mod(bigInteger2));
    }

    /* JADX INFO: renamed from: d */
    public static BigInteger m46304d(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* JADX INFO: renamed from: e */
    public static ECParameterSpec m46305e(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* JADX INFO: renamed from: f */
    public static ECParameterSpec m46306f() {
        return m46305e("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    /* JADX INFO: renamed from: g */
    public static ECParameterSpec m46307g() {
        return m46305e("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    /* JADX INFO: renamed from: h */
    public static ECParameterSpec m46308h() {
        return m46305e("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m46309i(ECParameterSpec eCParameterSpec) {
        return m46310j(eCParameterSpec, f44250a) || m46310j(eCParameterSpec, f44251b) || m46310j(eCParameterSpec, f44252c);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m46310j(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    /* JADX INFO: renamed from: k */
    public static ECPoint m46311k(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        if (!m46309i(eCParameterSpec)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        m46302b(generator, curve);
        BigInteger a10 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerM46304d = m46304d(curve);
        a aVarM46312l = m46312l(ECPoint.POINT_INFINITY, bigIntegerM46304d);
        a aVarM46312l2 = m46312l(generator, bigIntegerM46304d);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                aVarM46312l = m46301a(aVarM46312l, aVarM46312l2, a10, bigIntegerM46304d);
                aVarM46312l2 = m46303c(aVarM46312l2, a10, bigIntegerM46304d);
            } else {
                aVarM46312l2 = m46301a(aVarM46312l, aVarM46312l2, a10, bigIntegerM46304d);
                aVarM46312l = m46303c(aVarM46312l, a10, bigIntegerM46304d);
            }
        }
        ECPoint eCPointM46314b = aVarM46312l.m46314b(bigIntegerM46304d);
        m46302b(eCPointM46314b, curve);
        return eCPointM46314b;
    }

    /* JADX INFO: renamed from: l */
    public static a m46312l(ECPoint eCPoint, BigInteger bigInteger) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return a.f44257d;
        }
        BigInteger bigIntegerMod = new BigInteger(1, C4599u.m22724a((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        BigInteger bigIntegerMod2 = bigIntegerMod.multiply(bigIntegerMod).mod(bigInteger);
        return new a(eCPoint.getAffineX().multiply(bigIntegerMod2).mod(bigInteger), eCPoint.getAffineY().multiply(bigIntegerMod2.multiply(bigIntegerMod).mod(bigInteger)).mod(bigInteger), bigIntegerMod);
    }
}
