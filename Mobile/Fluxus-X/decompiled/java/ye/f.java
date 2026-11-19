package ye;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f37742a;
    public static final long[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f37743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e.a[][] f37744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e.a[] f37745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f37746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f37747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f37748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f37749i;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigInteger f37750a;
        public BigInteger b;

        public b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f37746f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f37747g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f37748h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f37749i = bigIntegerModPow;
        b bVar = new b();
        bVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        bVar.f37750a = c(bVar.b);
        f37742a = i.c(d(bigIntegerMod));
        b = i.c(d(bigIntegerMod2));
        f37743c = i.c(d(bigIntegerModPow));
        f37744d = (e.a[][]) Array.newInstance((Class<?>) e.a.class, 32, 8);
        b bVarA = bVar;
        for (int i10 = 0; i10 < 32; i10++) {
            b bVarA2 = bVarA;
            for (int i11 = 0; i11 < 8; i11++) {
                f37744d[i10][i11] = b(bVarA2);
                bVarA2 = a(bVarA2, bVarA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                bVarA = a(bVarA, bVarA);
            }
        }
        b bVarA3 = a(bVar, bVar);
        f37745e = new e.a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f37745e[i13] = b(bVar);
            bVar = a(bVar, bVarA3);
        }
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b();
        BigInteger bigIntegerMultiply = f37747g.multiply(bVar.f37750a.multiply(bVar2.f37750a).multiply(bVar.b).multiply(bVar2.b));
        BigInteger bigInteger = f37746f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = bVar.f37750a.multiply(bVar2.b).add(bVar2.f37750a.multiply(bVar.b));
        BigInteger bigInteger2 = BigInteger.ONE;
        bVar3.f37750a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        bVar3.b = bVar.b.multiply(bVar2.b).add(bVar.f37750a.multiply(bVar2.f37750a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return bVar3;
    }

    public static e.a b(b bVar) {
        BigInteger bigIntegerAdd = bVar.b.add(bVar.f37750a);
        BigInteger bigInteger = f37746f;
        return new e.a(i.c(d(bigIntegerAdd.mod(bigInteger))), i.c(d(bVar.b.subtract(bVar.f37750a).mod(bigInteger))), i.c(d(f37748h.multiply(bVar.f37750a).multiply(bVar.b).mod(bigInteger))));
    }

    public static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f37747g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f37746f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f37749i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    public static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
