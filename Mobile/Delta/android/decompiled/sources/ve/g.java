package ve;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ECParameterSpec f32942a = f();
    public static final ECParameterSpec b = g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ECParameterSpec f32943c = h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BigInteger f32944d = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f32945e = BigInteger.valueOf(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f32946f = BigInteger.valueOf(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f32947g = BigInteger.valueOf(8);

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f32948d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigInteger f32949a;
        public BigInteger b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BigInteger f32950c;

        static {
            BigInteger bigInteger = BigInteger.ONE;
            f32948d = new a(bigInteger, bigInteger, BigInteger.ZERO);
        }

        public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this.f32949a = bigInteger;
            this.b = bigInteger2;
            this.f32950c = bigInteger3;
        }

        public boolean a() {
            return this.f32950c.equals(BigInteger.ZERO);
        }

        public ECPoint b(BigInteger bigInteger) {
            if (a()) {
                return ECPoint.POINT_INFINITY;
            }
            BigInteger bigIntegerModInverse = this.f32950c.modInverse(bigInteger);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigInteger);
            return new ECPoint(this.f32949a.multiply(bigIntegerMod).mod(bigInteger), this.b.multiply(bigIntegerMod).mod(bigInteger).multiply(bigIntegerModInverse).mod(bigInteger));
        }
    }

    public static a a(a aVar, a aVar2, BigInteger bigInteger, BigInteger bigInteger2) {
        if (aVar.a()) {
            return aVar2;
        }
        if (aVar2.a()) {
            return aVar;
        }
        BigInteger bigInteger3 = aVar.f32950c;
        BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = aVar2.f32950c;
        BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerMod3 = aVar.f32949a.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod4 = aVar2.f32949a.multiply(bigIntegerMod).mod(bigInteger2);
        BigInteger bigIntegerMod5 = aVar.b.multiply(aVar2.f32950c).mod(bigInteger2).multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigIntegerMod6 = aVar2.b.multiply(aVar.f32950c).mod(bigInteger2).multiply(bigIntegerMod).mod(bigInteger2);
        if (bigIntegerMod3.equals(bigIntegerMod4)) {
            return !bigIntegerMod5.equals(bigIntegerMod6) ? a.f32948d : c(aVar, bigInteger, bigInteger2);
        }
        BigInteger bigIntegerMod7 = bigIntegerMod4.subtract(bigIntegerMod3).mod(bigInteger2);
        BigInteger bigIntegerMod8 = bigIntegerMod7.multiply(f32946f).multiply(bigIntegerMod7).mod(bigInteger2);
        BigInteger bigIntegerMod9 = bigIntegerMod7.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerSubtract = bigIntegerMod6.subtract(bigIntegerMod5);
        BigInteger bigInteger5 = f32944d;
        BigInteger bigIntegerMod10 = bigIntegerSubtract.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerMod11 = bigIntegerMod3.multiply(bigIntegerMod8).mod(bigInteger2);
        BigInteger bigIntegerMod12 = bigIntegerMod10.multiply(bigIntegerMod10).mod(bigInteger2).subtract(bigIntegerMod9).subtract(bigIntegerMod11.multiply(bigInteger5)).mod(bigInteger2);
        BigInteger bigIntegerMod13 = bigIntegerMod10.multiply(bigIntegerMod11.subtract(bigIntegerMod12)).subtract(bigIntegerMod5.multiply(bigInteger5).multiply(bigIntegerMod9)).mod(bigInteger2);
        BigInteger bigIntegerAdd = aVar.f32950c.add(aVar2.f32950c);
        return new a(bigIntegerMod12, bigIntegerMod13, bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod2).multiply(bigIntegerMod7).mod(bigInteger2));
    }

    public static void b(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerD = d(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerD) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerD).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerD))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static a c(a aVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (aVar.b.equals(BigInteger.ZERO)) {
            return a.f32948d;
        }
        BigInteger bigInteger3 = aVar.f32949a;
        BigInteger bigIntegerMod = bigInteger3.multiply(bigInteger3).mod(bigInteger2);
        BigInteger bigInteger4 = aVar.b;
        BigInteger bigIntegerMod2 = bigInteger4.multiply(bigInteger4).mod(bigInteger2);
        BigInteger bigIntegerMod3 = bigIntegerMod2.multiply(bigIntegerMod2).mod(bigInteger2);
        BigInteger bigInteger5 = aVar.f32950c;
        BigInteger bigIntegerMod4 = bigInteger5.multiply(bigInteger5).mod(bigInteger2);
        BigInteger bigIntegerAdd = aVar.f32949a.add(bigIntegerMod2);
        BigInteger bigIntegerSubtract = bigIntegerAdd.multiply(bigIntegerAdd).mod(bigInteger2).subtract(bigIntegerMod).subtract(bigIntegerMod3);
        BigInteger bigInteger6 = f32944d;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigInteger6);
        BigInteger bigIntegerAdd2 = bigIntegerMod.multiply(f32945e).add(bigInteger.multiply(bigIntegerMod4).multiply(bigIntegerMod4).mod(bigInteger2));
        BigInteger bigIntegerMod5 = bigIntegerAdd2.multiply(bigIntegerAdd2).mod(bigInteger2).subtract(bigIntegerMultiply.multiply(bigInteger6)).mod(bigInteger2);
        BigInteger bigIntegerMod6 = bigIntegerAdd2.multiply(bigIntegerMultiply.subtract(bigIntegerMod5)).mod(bigInteger2).subtract(bigIntegerMod3.multiply(f32947g)).mod(bigInteger2);
        BigInteger bigIntegerAdd3 = aVar.b.add(aVar.f32950c);
        return new a(bigIntegerMod5, bigIntegerMod6, bigIntegerAdd3.multiply(bigIntegerAdd3).mod(bigInteger2).subtract(bigIntegerMod2).subtract(bigIntegerMod4).mod(bigInteger2));
    }

    public static BigInteger d(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static ECParameterSpec e(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static ECParameterSpec f() {
        return e("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    public static ECParameterSpec g() {
        return e("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    public static ECParameterSpec h() {
        return e("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    public static boolean i(ECParameterSpec eCParameterSpec) {
        return j(eCParameterSpec, f32942a) || j(eCParameterSpec, b) || j(eCParameterSpec, f32943c);
    }

    public static boolean j(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    public static ECPoint k(BigInteger bigInteger, ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        if (!i(eCParameterSpec)) {
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
        b(generator, curve);
        BigInteger a10 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerD = d(curve);
        a aVarL = l(ECPoint.POINT_INFINITY, bigIntegerD);
        a aVarL2 = l(generator, bigIntegerD);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                aVarL = a(aVarL, aVarL2, a10, bigIntegerD);
                aVarL2 = c(aVarL2, a10, bigIntegerD);
            } else {
                aVarL2 = a(aVarL, aVarL2, a10, bigIntegerD);
                aVarL = c(aVarL, a10, bigIntegerD);
            }
        }
        ECPoint eCPointB = aVarL.b(bigIntegerD);
        b(eCPointB, curve);
        return eCPointB;
    }

    public static a l(ECPoint eCPoint, BigInteger bigInteger) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return a.f32948d;
        }
        BigInteger bigIntegerMod = new BigInteger(1, cf.u.a((bigInteger.bitLength() + 8) / 8)).mod(bigInteger);
        BigInteger bigIntegerMod2 = bigIntegerMod.multiply(bigIntegerMod).mod(bigInteger);
        return new a(eCPoint.getAffineX().multiply(bigIntegerMod2).mod(bigInteger), eCPoint.getAffineY().multiply(bigIntegerMod2.multiply(bigIntegerMod).mod(bigInteger)).mod(bigInteger), bigIntegerMod);
    }
}
