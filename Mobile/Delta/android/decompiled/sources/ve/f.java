package ve;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f32931a;
    public static final long[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f32932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e.a[][] f32933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e.a[] f32934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f32935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f32936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f32937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BigInteger f32938i;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BigInteger f32939a;
        public BigInteger b;

        public b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f32935f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f32936g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f32937h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f32938i = bigIntegerModPow;
        b bVar = new b();
        bVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        bVar.f32939a = c(bVar.b);
        f32931a = i.c(d(bigIntegerMod));
        b = i.c(d(bigIntegerMod2));
        f32932c = i.c(d(bigIntegerModPow));
        f32933d = (e.a[][]) Array.newInstance((Class<?>) e.a.class, 32, 8);
        b bVarA = bVar;
        for (int i10 = 0; i10 < 32; i10++) {
            b bVarA2 = bVarA;
            for (int i11 = 0; i11 < 8; i11++) {
                f32933d[i10][i11] = b(bVarA2);
                bVarA2 = a(bVarA2, bVarA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                bVarA = a(bVarA, bVarA);
            }
        }
        b bVarA3 = a(bVar, bVar);
        f32934e = new e.a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f32934e[i13] = b(bVar);
            bVar = a(bVar, bVarA3);
        }
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b();
        BigInteger bigIntegerMultiply = f32936g.multiply(bVar.f32939a.multiply(bVar2.f32939a).multiply(bVar.b).multiply(bVar2.b));
        BigInteger bigInteger = f32935f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = bVar.f32939a.multiply(bVar2.b).add(bVar2.f32939a.multiply(bVar.b));
        BigInteger bigInteger2 = BigInteger.ONE;
        bVar3.f32939a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        bVar3.b = bVar.b.multiply(bVar2.b).add(bVar.f32939a.multiply(bVar2.f32939a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return bVar3;
    }

    public static e.a b(b bVar) {
        BigInteger bigIntegerAdd = bVar.b.add(bVar.f32939a);
        BigInteger bigInteger = f32935f;
        return new e.a(i.c(d(bigIntegerAdd.mod(bigInteger))), i.c(d(bVar.b.subtract(bVar.f32939a).mod(bigInteger))), i.c(d(f32937h.multiply(bVar.f32939a).multiply(bVar.b).mod(bigInteger))));
    }

    public static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f32936g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f32935f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f32938i).mod(bigInteger3);
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
