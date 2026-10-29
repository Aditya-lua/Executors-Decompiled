package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1oSDK {
    public int AFKeystoreWrapper;
    public int AFLogger;

    /* JADX INFO: renamed from: d */
    public int f7083d;

    /* JADX INFO: renamed from: d */
    public static int m8959d(int i10) {
        int[][] iArr = AFj1dSDK.f7065d.registerClient;
        return ((iArr[0][(i10 >>> 24) & 255] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }

    public static void unregisterClient(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }
}
