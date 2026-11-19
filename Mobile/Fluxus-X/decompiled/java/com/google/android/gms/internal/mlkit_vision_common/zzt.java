package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    public static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException("at index " + i11);
            }
        }
        return objArr;
    }
}
