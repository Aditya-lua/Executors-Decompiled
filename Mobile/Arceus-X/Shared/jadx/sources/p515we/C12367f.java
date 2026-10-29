package p515we;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: renamed from: we.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C12367f {

    /* JADX INFO: renamed from: a */
    public static final long[] f44236a;

    /* JADX INFO: renamed from: b */
    public static final long[] f44237b;

    /* JADX INFO: renamed from: c */
    public static final long[] f44238c;

    /* JADX INFO: renamed from: d */
    public static final C12365e.a[][] f44239d;

    /* JADX INFO: renamed from: e */
    public static final C12365e.a[] f44240e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f44241f;

    /* JADX INFO: renamed from: g */
    public static final BigInteger f44242g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f44243h;

    /* JADX INFO: renamed from: i */
    public static final BigInteger f44244i;

    /* JADX INFO: renamed from: we.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public BigInteger f44245a;

        /* JADX INFO: renamed from: b */
        public BigInteger f44246b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f44241f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f44242g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f44243h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f44244i = bigIntegerModPow;
        b bVar = new b();
        bVar.f44246b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        bVar.f44245a = m46291c(bVar.f44246b);
        f44236a = C12373i.m46330c(m46292d(bigIntegerMod));
        f44237b = C12373i.m46330c(m46292d(bigIntegerMod2));
        f44238c = C12373i.m46330c(m46292d(bigIntegerModPow));
        f44239d = (C12365e.a[][]) Array.newInstance((Class<?>) C12365e.a.class, 32, 8);
        b bVarM46289a = bVar;
        for (int i10 = 0; i10 < 32; i10++) {
            b bVarM46289a2 = bVarM46289a;
            for (int i11 = 0; i11 < 8; i11++) {
                f44239d[i10][i11] = m46290b(bVarM46289a2);
                bVarM46289a2 = m46289a(bVarM46289a2, bVarM46289a);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                bVarM46289a = m46289a(bVarM46289a, bVarM46289a);
            }
        }
        b bVarM46289a3 = m46289a(bVar, bVar);
        f44240e = new C12365e.a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f44240e[i13] = m46290b(bVar);
            bVar = m46289a(bVar, bVarM46289a3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m46289a(b bVar, b bVar2) {
        b bVar3 = new b();
        BigInteger bigIntegerMultiply = f44242g.multiply(bVar.f44245a.multiply(bVar2.f44245a).multiply(bVar.f44246b).multiply(bVar2.f44246b));
        BigInteger bigInteger = f44241f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = bVar.f44245a.multiply(bVar2.f44246b).add(bVar2.f44245a.multiply(bVar.f44246b));
        BigInteger bigInteger2 = BigInteger.ONE;
        bVar3.f44245a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        bVar3.f44246b = bVar.f44246b.multiply(bVar2.f44246b).add(bVar.f44245a.multiply(bVar2.f44245a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return bVar3;
    }

    /* JADX INFO: renamed from: b */
    public static C12365e.a m46290b(b bVar) {
        BigInteger bigIntegerAdd = bVar.f44246b.add(bVar.f44245a);
        BigInteger bigInteger = f44241f;
        return new C12365e.a(C12373i.m46330c(m46292d(bigIntegerAdd.mod(bigInteger))), C12373i.m46330c(m46292d(bVar.f44246b.subtract(bVar.f44245a).mod(bigInteger))), C12373i.m46330c(m46292d(f44243h.multiply(bVar.f44245a).multiply(bVar.f44246b).mod(bigInteger))));
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m46291c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f44242g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f44241f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f44244i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m46292d(BigInteger bigInteger) {
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
