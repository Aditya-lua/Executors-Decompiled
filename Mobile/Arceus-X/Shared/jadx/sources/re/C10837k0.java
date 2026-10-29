package re;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import p076df.C4583e;

/* JADX INFO: renamed from: re.k0 */
/* JADX INFO: loaded from: classes2.dex */
public class C10837k0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m41252a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jM41254c = m41254c(bArr, 0, 0) & 67108863;
        int i10 = 3;
        int i11 = 2;
        long jM41254c2 = m41254c(bArr, 3, 2) & 67108611;
        long jM41254c3 = m41254c(bArr, 6, 4) & 67092735;
        long jM41254c4 = m41254c(bArr, 9, 6) & 66076671;
        long jM41254c5 = m41254c(bArr, 12, 8) & 1048575;
        long j10 = jM41254c2 * 5;
        long j11 = jM41254c3 * 5;
        long j12 = jM41254c4 * 5;
        long j13 = jM41254c5 * 5;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            m41253b(bArr3, bArr2, i12);
            long jM41254c6 = j18 + m41254c(bArr3, 0, 0);
            long jM41254c7 = j14 + m41254c(bArr3, i10, i11);
            long jM41254c8 = j15 + m41254c(bArr3, 6, 4);
            long jM41254c9 = j16 + m41254c(bArr3, 9, 6);
            long j19 = jM41254c2;
            long jM41254c10 = j17 + (m41254c(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j20 = (jM41254c6 * jM41254c) + (jM41254c7 * j13) + (jM41254c8 * j12) + (jM41254c9 * j11) + (jM41254c10 * j10);
            long j21 = (jM41254c6 * j19) + (jM41254c7 * jM41254c) + (jM41254c8 * j13) + (jM41254c9 * j12) + (jM41254c10 * j11);
            long j22 = (jM41254c6 * jM41254c3) + (jM41254c7 * j19) + (jM41254c8 * jM41254c) + (jM41254c9 * j13) + (jM41254c10 * j12);
            long j23 = (jM41254c6 * jM41254c4) + (jM41254c7 * jM41254c3) + (jM41254c8 * j19) + (jM41254c9 * jM41254c) + (jM41254c10 * j13);
            long j24 = (jM41254c6 * jM41254c5) + (jM41254c7 * jM41254c4) + (jM41254c8 * jM41254c3) + (jM41254c9 * j19) + (jM41254c10 * jM41254c);
            long j25 = j21 + (j20 >> 26);
            long j26 = j22 + (j25 >> 26);
            j15 = j26 & 67108863;
            long j27 = j23 + (j26 >> 26);
            j16 = j27 & 67108863;
            long j28 = j24 + (j27 >> 26);
            j17 = j28 & 67108863;
            long j29 = (j20 & 67108863) + ((j28 >> 26) * 5);
            j18 = j29 & 67108863;
            j14 = (j25 & 67108863) + (j29 >> 26);
            i12 += 16;
            jM41254c2 = j19;
            i10 = 3;
            i11 = 2;
        }
        long j30 = j15 + (j14 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j16 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j17 + (j32 >> 26);
        long j35 = j34 & 67108863;
        long j36 = j18 + ((j34 >> 26) * 5);
        long j37 = j36 & 67108863;
        long j38 = (j14 & 67108863) + (j36 >> 26);
        long j39 = j37 + 5;
        long j40 = j39 & 67108863;
        long j41 = (j39 >> 26) + j38;
        long j42 = j31 + (j41 >> 26);
        long j43 = j33 + (j42 >> 26);
        long j44 = j43 & 67108863;
        long j45 = (j35 + (j43 >> 26)) - 67108864;
        long j46 = j45 >> 63;
        long j47 = j37 & j46;
        long j48 = j38 & j46;
        long j49 = j31 & j46;
        long j50 = j33 & j46;
        long j51 = j35 & j46;
        long j52 = ~j46;
        long j53 = (j41 & 67108863 & j52) | j48;
        long j54 = (j42 & 67108863 & j52) | j49;
        long j55 = (j44 & j52) | j50;
        long j56 = j51 | (j45 & j52);
        long j57 = (j47 | (j40 & j52) | (j53 << 26)) & 4294967295L;
        long j58 = ((j53 >> 6) | (j54 << 20)) & 4294967295L;
        long j59 = ((j54 >> 12) | (j55 << 14)) & 4294967295L;
        long j60 = ((j55 >> 18) | (j56 << 8)) & 4294967295L;
        long jM41255d = j57 + m41255d(bArr, 16);
        long j61 = jM41255d & 4294967295L;
        long jM41255d2 = j58 + m41255d(bArr, 20) + (jM41255d >> 32);
        long j62 = jM41255d2 & 4294967295L;
        long jM41255d3 = j59 + m41255d(bArr, 24) + (jM41255d2 >> 32);
        long j63 = jM41255d3 & 4294967295L;
        long jM41255d4 = (j60 + m41255d(bArr, 28) + (jM41255d3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        m41256e(bArr4, j61, 0);
        m41256e(bArr4, j62, 4);
        m41256e(bArr4, j63, 8);
        m41256e(bArr4, jM41255d4, 12);
        return bArr4;
    }

    /* JADX INFO: renamed from: b */
    public static void m41253b(byte[] bArr, byte[] bArr2, int i10) {
        int iMin = Math.min(16, bArr2.length - i10);
        System.arraycopy(bArr2, i10, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m41254c(byte[] bArr, int i10, int i11) {
        return (m41255d(bArr, i10) >> i11) & 67108863;
    }

    /* JADX INFO: renamed from: d */
    public static long m41255d(byte[] bArr, int i10) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: e */
    public static void m41256e(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m41257f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!C4583e.m22662b(m41252a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
