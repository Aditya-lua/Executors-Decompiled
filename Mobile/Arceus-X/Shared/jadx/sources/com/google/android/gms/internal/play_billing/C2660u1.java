package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.mlkit_vision_barcode.C2435a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2660u1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11764a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!C2435a.m11162a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
