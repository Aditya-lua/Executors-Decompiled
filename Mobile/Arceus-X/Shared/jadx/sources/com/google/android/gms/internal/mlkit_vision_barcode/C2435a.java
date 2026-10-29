package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2435a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11162a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
