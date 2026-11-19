package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFk1tSDK {
    public static void AFKeystoreWrapper(byte[] bArr, byte b, long j10) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (((1 << i10) & j10) != 0) {
                bArr[i10] = (byte) (bArr[i10] ^ b);
            }
        }
    }
}
