package re;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: re.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10819b0 {

    /* JADX INFO: renamed from: a */
    public static final int[] f38533a = m41203h(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a */
    public static byte[] m41196a(byte[] bArr, byte[] bArr2) {
        return m41202g(m41197b(m41203h(bArr), m41203h(bArr2)));
    }

    /* JADX INFO: renamed from: b */
    public static int[] m41197b(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        m41200e(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        m41201f(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    /* JADX INFO: renamed from: c */
    public static void m41198c(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int iM41199d = m41199d(i14 ^ iArr[i13], 16);
        iArr[i13] = iM41199d;
        int i15 = iArr[i12] + iM41199d;
        iArr[i12] = i15;
        int iM41199d2 = m41199d(iArr[i11] ^ i15, 12);
        iArr[i11] = iM41199d2;
        int i16 = iArr[i10] + iM41199d2;
        iArr[i10] = i16;
        int iM41199d3 = m41199d(iArr[i13] ^ i16, 8);
        iArr[i13] = iM41199d3;
        int i17 = iArr[i12] + iM41199d3;
        iArr[i12] = i17;
        iArr[i11] = m41199d(iArr[i11] ^ i17, 7);
    }

    /* JADX INFO: renamed from: d */
    public static int m41199d(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    /* JADX INFO: renamed from: e */
    public static void m41200e(int[] iArr, int[] iArr2) {
        int[] iArr3 = f38533a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: renamed from: f */
    public static void m41201f(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            m41198c(iArr, 0, 4, 8, 12);
            m41198c(iArr, 1, 5, 9, 13);
            m41198c(iArr, 2, 6, 10, 14);
            m41198c(iArr, 3, 7, 11, 15);
            m41198c(iArr, 0, 5, 10, 15);
            m41198c(iArr, 1, 6, 11, 12);
            m41198c(iArr, 2, 7, 8, 13);
            m41198c(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m41202g(int[] iArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArr.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: h */
    public static int[] m41203h(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
