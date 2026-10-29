package p515we;

import java.util.Arrays;

/* JADX INFO: renamed from: we.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C12373i {

    /* JADX INFO: renamed from: a */
    public static final int[] f44271a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b */
    public static final int[] f44272b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c */
    public static final int[] f44273c = {67108863, 33554431};

    /* JADX INFO: renamed from: d */
    public static final int[] f44274d = {26, 25};

    /* JADX INFO: renamed from: a */
    public static byte[] m46328a(long[] jArr) {
        int i10;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= 2) {
                break;
            }
            int i13 = 0;
            while (i13 < 9) {
                long j10 = jArrCopyOf[i13];
                int i14 = f44274d[i13 & 1];
                int i15 = -((int) (((j10 >> 31) & j10) >> i14));
                jArrCopyOf[i13] = j10 + ((long) (i15 << i14));
                i13++;
                jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) i15);
            }
            long j11 = jArrCopyOf[9];
            int i16 = -((int) (((j11 >> 31) & j11) >> 25));
            jArrCopyOf[9] = j11 + ((long) (i16 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i16) * 19);
            i12++;
        }
        long j12 = jArrCopyOf[0];
        int i17 = -((int) (((j12 >> 31) & j12) >> 26));
        jArrCopyOf[0] = j12 + ((long) (i17 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i17);
        int i18 = 0;
        while (i18 < 2) {
            int i19 = i11;
            while (i19 < 9) {
                long j13 = jArrCopyOf[i19];
                int i20 = i19 & 1;
                int i21 = i11;
                int i22 = (int) (j13 >> f44274d[i20]);
                jArrCopyOf[i19] = j13 & ((long) f44273c[i20]);
                i19++;
                jArrCopyOf[i19] = jArrCopyOf[i19] + ((long) i22);
                i11 = i21;
                i18 = i18;
            }
            i18++;
        }
        int i23 = i11;
        long j14 = jArrCopyOf[9];
        jArrCopyOf[9] = j14 & 33554431;
        long j15 = jArrCopyOf[i23] + (((long) ((int) (j14 >> 25))) * 19);
        jArrCopyOf[i23] = j15;
        int iM46331d = m46331d((int) j15, 67108845);
        for (int i24 = 1; i24 < 10; i24++) {
            iM46331d &= m46329b((int) jArrCopyOf[i24], f44273c[i24 & 1]);
        }
        jArrCopyOf[i23] = jArrCopyOf[i23] - ((long) (67108845 & iM46331d));
        long j16 = 33554431 & iM46331d;
        jArrCopyOf[1] = jArrCopyOf[1] - j16;
        for (i10 = 2; i10 < 10; i10 += 2) {
            jArrCopyOf[i10] = jArrCopyOf[i10] - ((long) (67108863 & iM46331d));
            int i25 = i10 + 1;
            jArrCopyOf[i25] = jArrCopyOf[i25] - j16;
        }
        for (int i26 = i23; i26 < 10; i26++) {
            jArrCopyOf[i26] = jArrCopyOf[i26] << f44272b[i26];
        }
        byte[] bArr = new byte[32];
        for (int i27 = i23; i27 < 10; i27++) {
            int i28 = f44271a[i27];
            long j17 = bArr[i28];
            long j18 = jArrCopyOf[i27];
            bArr[i28] = (byte) (j17 | (j18 & 255));
            int i29 = i28 + 1;
            bArr[i29] = (byte) (((long) bArr[i29]) | ((j18 >> 8) & 255));
            int i30 = i28 + 2;
            bArr[i30] = (byte) (((long) bArr[i30]) | ((j18 >> 16) & 255));
            int i31 = i28 + 3;
            bArr[i31] = (byte) (((long) bArr[i31]) | ((j18 >> 24) & 255));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static int m46329b(int i10, int i11) {
        int i12 = ~(i10 ^ i11);
        int i13 = i12 & (i12 << 16);
        int i14 = i13 & (i13 << 8);
        int i15 = i14 & (i14 << 4);
        int i16 = i15 & (i15 << 2);
        return (i16 & (i16 << 1)) >> 31;
    }

    /* JADX INFO: renamed from: c */
    public static long[] m46330c(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f44271a[i10];
            jArr[i10] = ((((((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8)) | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> f44272b[i10]) & ((long) f44273c[i10 & 1]);
        }
        return jArr;
    }

    /* JADX INFO: renamed from: d */
    public static int m46331d(int i10, int i11) {
        return ~((i10 - i11) >> 31);
    }

    /* JADX INFO: renamed from: e */
    public static void m46332e(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        m46338k(jArr3, jArr2);
        m46338k(jArr12, jArr3);
        m46338k(jArr11, jArr12);
        m46333f(jArr4, jArr11, jArr2);
        m46333f(jArr5, jArr4, jArr3);
        m46338k(jArr11, jArr5);
        m46333f(jArr6, jArr11, jArr4);
        m46338k(jArr11, jArr6);
        m46338k(jArr12, jArr11);
        m46338k(jArr11, jArr12);
        m46338k(jArr12, jArr11);
        m46338k(jArr11, jArr12);
        m46333f(jArr7, jArr11, jArr6);
        m46338k(jArr11, jArr7);
        m46338k(jArr12, jArr11);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            m46338k(jArr11, jArr12);
            m46338k(jArr12, jArr11);
        }
        m46333f(jArr8, jArr12, jArr7);
        m46338k(jArr11, jArr8);
        m46338k(jArr12, jArr11);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            m46338k(jArr11, jArr12);
            m46338k(jArr12, jArr11);
        }
        m46333f(jArr11, jArr12, jArr8);
        m46338k(jArr12, jArr11);
        m46338k(jArr11, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            m46338k(jArr12, jArr11);
            m46338k(jArr11, jArr12);
        }
        m46333f(jArr9, jArr11, jArr7);
        m46338k(jArr11, jArr9);
        m46338k(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            m46338k(jArr11, jArr12);
            m46338k(jArr12, jArr11);
        }
        m46333f(jArr10, jArr12, jArr9);
        m46338k(jArr12, jArr10);
        m46338k(jArr11, jArr12);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            m46338k(jArr12, jArr11);
            m46338k(jArr11, jArr12);
        }
        m46333f(jArr12, jArr11, jArr10);
        m46338k(jArr11, jArr12);
        m46338k(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            m46338k(jArr11, jArr12);
            m46338k(jArr12, jArr11);
        }
        m46333f(jArr11, jArr12, jArr9);
        m46338k(jArr12, jArr11);
        m46338k(jArr11, jArr12);
        m46338k(jArr12, jArr11);
        m46338k(jArr11, jArr12);
        m46338k(jArr12, jArr11);
        m46333f(jArr, jArr12, jArr5);
    }

    /* JADX INFO: renamed from: f */
    public static void m46333f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        m46334g(jArr4, jArr2, jArr3);
        m46335h(jArr4, jArr);
    }

    /* JADX INFO: renamed from: g */
    public static void m46334g(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j10 = jArr2[0];
        long j11 = jArr3[1] * j10;
        long j12 = jArr2[1];
        long j13 = jArr3[0];
        jArr[1] = j11 + (j12 * j13);
        long j14 = jArr2[1];
        long j15 = jArr3[1];
        jArr[2] = (j14 * 2 * j15) + (jArr3[2] * j10) + (jArr2[2] * j13);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        jArr[3] = (j14 * j16) + (j17 * j15) + (jArr3[3] * j10) + (jArr2[3] * j13);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        jArr[4] = (j17 * j16) + (((j14 * j18) + (j19 * j15)) * 2) + (jArr3[4] * j10) + (jArr2[4] * j13);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        jArr[5] = (j17 * j18) + (j19 * j16) + (j14 * j20) + (j21 * j15) + (jArr3[5] * j10) + (jArr2[5] * j13);
        long j22 = jArr3[5];
        long j23 = jArr2[5];
        jArr[6] = (((j19 * j18) + (j14 * j22) + (j23 * j15)) * 2) + (j17 * j20) + (j21 * j16) + (jArr3[6] * j10) + (jArr2[6] * j13);
        long j24 = jArr3[6];
        long j25 = jArr2[6];
        jArr[7] = (j19 * j20) + (j21 * j18) + (j17 * j22) + (j23 * j16) + (j14 * j24) + (j25 * j15) + (jArr3[7] * j10) + (jArr2[7] * j13);
        long j26 = jArr3[7];
        long j27 = jArr2[7];
        jArr[8] = (j21 * j20) + (((j19 * j22) + (j23 * j18) + (j14 * j26) + (j27 * j15)) * 2) + (j17 * j24) + (j25 * j16) + (jArr3[8] * j10) + (jArr2[8] * j13);
        long j28 = jArr3[8];
        long j29 = jArr2[8];
        jArr[9] = (j21 * j22) + (j23 * j20) + (j19 * j24) + (j25 * j18) + (j17 * j26) + (j27 * j16) + (j14 * j28) + (j29 * j15) + (j10 * jArr3[9]) + (jArr2[9] * j13);
        long j30 = jArr3[9];
        long j31 = jArr2[9];
        jArr[10] = (((j23 * j22) + (j19 * j26) + (j27 * j18) + (j14 * j30) + (j15 * j31)) * 2) + (j21 * j24) + (j25 * j20) + (j17 * j28) + (j29 * j16);
        jArr[11] = (j23 * j24) + (j25 * j22) + (j21 * j26) + (j27 * j20) + (j19 * j28) + (j29 * j18) + (j17 * j30) + (j16 * j31);
        jArr[12] = (j25 * j24) + (((j23 * j26) + (j27 * j22) + (j19 * j30) + (j18 * j31)) * 2) + (j21 * j28) + (j29 * j20);
        jArr[13] = (j25 * j26) + (j27 * j24) + (j23 * j28) + (j29 * j22) + (j21 * j30) + (j20 * j31);
        jArr[14] = (((j27 * j26) + (j23 * j30) + (j22 * j31)) * 2) + (j25 * j28) + (j29 * j24);
        jArr[15] = (j27 * j28) + (j29 * j26) + (j25 * j30) + (j24 * j31);
        jArr[16] = (j29 * j28) + (((j27 * j30) + (j26 * j31)) * 2);
        jArr[17] = (j29 * j30) + (j28 * j31);
        jArr[18] = j31 * 2 * j30;
    }

    /* JADX INFO: renamed from: h */
    public static void m46335h(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        m46337j(jArr);
        m46336i(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: renamed from: i */
    public static void m46336i(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / 67108864;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    /* JADX INFO: renamed from: j */
    public static void m46337j(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + (j39 << 1);
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    /* JADX INFO: renamed from: k */
    public static void m46338k(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        m46339l(jArr3, jArr2);
        m46335h(jArr3, jArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m46339l(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        jArr[0] = j10 * j10;
        long j11 = jArr2[0];
        jArr[1] = j11 * 2 * jArr2[1];
        long j12 = jArr2[1];
        jArr[2] = ((j12 * j12) + (jArr2[2] * j11)) * 2;
        long j13 = jArr2[2];
        jArr[3] = ((j12 * j13) + (jArr2[3] * j11)) * 2;
        long j14 = jArr2[3];
        jArr[4] = (j13 * j13) + (j12 * 4 * j14) + (j11 * 2 * jArr2[4]);
        long j15 = jArr2[4];
        jArr[5] = ((j13 * j14) + (j12 * j15) + (jArr2[5] * j11)) * 2;
        long j16 = (j14 * j14) + (j13 * j15) + (jArr2[6] * j11);
        long j17 = jArr2[5];
        jArr[6] = (j16 + (j12 * 2 * j17)) * 2;
        long j18 = jArr2[6];
        jArr[7] = ((j14 * j15) + (j13 * j17) + (j12 * j18) + (jArr2[7] * j11)) * 2;
        long j19 = (j13 * j18) + (jArr2[8] * j11);
        long j20 = jArr2[7];
        jArr[8] = (j15 * j15) + ((j19 + (((j12 * j20) + (j14 * j17)) * 2)) * 2);
        long j21 = jArr2[8];
        jArr[9] = ((j15 * j17) + (j14 * j18) + (j13 * j20) + (j12 * j21) + (j11 * jArr2[9])) * 2;
        long j22 = jArr2[9];
        jArr[10] = ((j17 * j17) + (j15 * j18) + (j13 * j21) + (((j14 * j20) + (j12 * j22)) * 2)) * 2;
        jArr[11] = ((j17 * j18) + (j15 * j20) + (j14 * j21) + (j13 * j22)) * 2;
        jArr[12] = (j18 * j18) + (((j15 * j21) + (((j17 * j20) + (j14 * j22)) * 2)) * 2);
        jArr[13] = ((j18 * j20) + (j17 * j21) + (j15 * j22)) * 2;
        jArr[14] = ((j20 * j20) + (j18 * j21) + (j17 * 2 * j22)) * 2;
        jArr[15] = ((j20 * j21) + (j18 * j22)) * 2;
        jArr[16] = (j21 * j21) + (j20 * 4 * j22);
        jArr[17] = j21 * 2 * j22;
        jArr[18] = 2 * j22 * j22;
    }

    /* JADX INFO: renamed from: m */
    public static void m46340m(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m46341n(long[] jArr, long[] jArr2) {
        m46342o(jArr, jArr, jArr2);
    }

    /* JADX INFO: renamed from: o */
    public static void m46342o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }
}
