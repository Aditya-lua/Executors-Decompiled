package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f7356a;

    static {
        byte[] bArr = new byte[0];
        f7356a = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = w3.f7337a;
        try {
            new u3(bArr, 0, 0, false, null).c(0);
        } catch (f5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
