package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2670v0 {
    /* JADX INFO: renamed from: a */
    public static Object m11801a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m11802b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m11801a(objArr[i11], i11);
        }
        return objArr;
    }
}
