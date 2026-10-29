package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1xSDK {
    private static byte[] force = new byte[256];
    static final byte[] registerClient = new byte[256];

    /* JADX INFO: renamed from: d */
    static final int[] f7093d = new int[256];
    static final int[] unregisterClient = new int[256];
    static final int[] AFKeystoreWrapper = new int[256];
    static final int[] AFLogger = new int[256];

    /* JADX INFO: renamed from: v */
    private static int[] f7094v = new int[10];

    static {
        byte[] bArr;
        int i10;
        byte b = 1;
        byte b10 = 1;
        do {
            b = (byte) (((b & 128) != 0 ? 27 : 0) ^ ((b << 1) ^ b));
            byte b11 = (byte) (b10 ^ (b10 << 1));
            byte b12 = (byte) (b11 ^ (b11 << 2));
            byte b13 = (byte) (b12 ^ (b12 << 4));
            b10 = (byte) (b13 ^ ((b13 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = force;
            i10 = b & 255;
            int i11 = b10 & 255;
            bArr[i10] = (byte) (((((b10 ^ 99) ^ ((i11 << 1) | (i11 >> 7))) ^ ((i11 << 2) | (i11 >> 6))) ^ ((i11 << 3) | (i11 >> 5))) ^ ((i11 >> 4) | (i11 << 4)));
        } while (i10 != 1);
        bArr[0] = 99;
        for (int i12 = 0; i12 < 256; i12++) {
            int i13 = force[i12] & 255;
            registerClient[i13] = (byte) i12;
            int i14 = i12 << 1;
            if (i14 >= 256) {
                i14 ^= 283;
            }
            int i15 = i14 << 1;
            if (i15 >= 256) {
                i15 ^= 283;
            }
            int i16 = i15 << 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            int i17 = i16 ^ i12;
            int i18 = ((i14 ^ (i15 ^ i16)) << 24) | (i17 << 16) | ((i17 ^ i15) << 8) | (i17 ^ i14);
            f7093d[i13] = i18;
            unregisterClient[i13] = (i18 >>> 8) | (i18 << 24);
            AFKeystoreWrapper[i13] = (i18 >>> 16) | (i18 << 16);
            AFLogger[i13] = (i18 << 8) | (i18 >>> 24);
        }
        f7094v[0] = 16777216;
        int i19 = 1;
        for (int i20 = 1; i20 < 10; i20++) {
            i19 <<= 1;
            if (i19 >= 256) {
                i19 ^= 283;
            }
            f7094v[i20] = i19 << 24;
        }
    }

    public static byte[][] AFKeystoreWrapper(int i10) {
        byte[][] bArr = new byte[4][];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 >>> (i11 << 3);
            bArr[i11] = new byte[]{(byte) (i12 & 3), (byte) ((i12 >> 2) & 3), (byte) ((i12 >> 4) & 3), (byte) ((i12 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] AFLogger(byte[] bArr, int i10) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i11 = 4;
        int i12 = (i10 + 1) * 4;
        int[] iArr = new int[i12];
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            int i15 = i13 + 3;
            int i16 = ((bArr[i13 + 1] & 255) << 16) | (bArr[i13] << 24) | ((bArr[i13 + 2] & 255) << 8);
            i13 += 4;
            iArr[i14] = i16 | (bArr[i15] & 255);
        }
        int i17 = 4;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i12) {
            int i20 = iArr[i17 - 1];
            if (i18 == 0) {
                byte[] bArr2 = force;
                i20 = ((bArr2[i20 >>> 24] & 255) | (((bArr2[(i20 >>> 16) & 255] << 24) | ((bArr2[(i20 >>> 8) & 255] & 255) << 16)) | ((bArr2[i20 & 255] & 255) << 8))) ^ f7094v[i19];
                i18 = 4;
                i19++;
            }
            iArr[i17] = i20 ^ iArr[i17 - 4];
            i17++;
            i18--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i12];
        int i21 = i10 * 4;
        iArr2[0] = iArr[i21];
        int i22 = 1;
        iArr2[1] = iArr[i21 + 1];
        iArr2[2] = iArr[i21 + 2];
        char c10 = 3;
        iArr2[3] = iArr[i21 + 3];
        int i23 = i21 - 4;
        while (i22 < i10) {
            int i24 = iArr[i23];
            int[] iArr3 = f7093d;
            byte[] bArr3 = force;
            int i25 = iArr3[bArr3[i24 >>> 24] & 255];
            int[] iArr4 = unregisterClient;
            int i26 = i25 ^ iArr4[bArr3[(i24 >>> 16) & 255] & 255];
            int[] iArr5 = AFKeystoreWrapper;
            int i27 = i26 ^ iArr5[bArr3[(i24 >>> 8) & 255] & 255];
            int[] iArr6 = AFLogger;
            iArr2[i11] = iArr6[bArr3[i24 & 255] & 255] ^ i27;
            int i28 = iArr[i23 + 1];
            char c11 = c10;
            int[] iArr7 = iArr2;
            iArr7[i11 + 1] = ((iArr4[bArr3[(i28 >>> 16) & 255] & 255] ^ iArr3[bArr3[i28 >>> 24] & 255]) ^ iArr5[bArr3[(i28 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i28 & 255] & 255];
            int i29 = iArr[i23 + 2];
            int i30 = i11 + 3;
            iArr7[i11 + 2] = iArr6[bArr3[i29 & 255] & 255] ^ ((iArr3[bArr3[i29 >>> 24] & 255] ^ iArr4[bArr3[(i29 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i29 >>> 8) & 255] & 255]);
            int i31 = iArr[i23 + 3];
            i11 += 4;
            iArr7[i30] = iArr6[bArr3[i31 & 255] & 255] ^ ((iArr3[bArr3[i31 >>> 24] & 255] ^ iArr4[bArr3[(i31 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i31 >>> 8) & 255] & 255]);
            i23 -= 4;
            i22++;
            c10 = c11;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i11] = iArr[i23];
        iArr8[i11 + 1] = iArr[i23 + 1];
        iArr8[i11 + 2] = iArr[i23 + 2];
        iArr8[i11 + 3] = iArr[i23 + 3];
        return iArr8;
    }
}
