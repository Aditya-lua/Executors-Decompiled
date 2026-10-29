package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1zSDK {
    private static void AFKeystoreWrapper(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    private static int AFLogger(int i10, int[][] iArr) {
        return ((iArr[0][i10 >>> 24] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }

    public static void unregisterClient(int i10, int i11, boolean z10, int i12, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z10) {
            AFKeystoreWrapper(iArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10 ^ iArr[i13];
            int iAFLogger = i11 ^ AFLogger(i14, iArr2);
            i13++;
            i11 = i14;
            i10 = iAFLogger;
        }
        int i15 = i10 ^ iArr[iArr.length - 2];
        int i16 = i11 ^ iArr[iArr.length - 1];
        if (!z10) {
            AFKeystoreWrapper(iArr);
        }
        iArr3[0] = i16;
        iArr3[1] = i15;
    }
}
