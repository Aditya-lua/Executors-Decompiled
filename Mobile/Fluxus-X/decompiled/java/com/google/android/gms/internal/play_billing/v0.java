package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    public static Object[] b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }
}
