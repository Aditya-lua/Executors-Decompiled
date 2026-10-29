package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2718z4 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f9432a;

    static {
        byte[] bArr = new byte[0];
        f9432a = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = C2684w3.f9410a;
        try {
            new C2662u3(bArr, 0, 0, false, null).m11737c(0);
        } catch (C2499f5 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m11857a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: b */
    public static int m11858b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }
}
