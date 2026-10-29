package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p563y1.C12996b;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2649t1 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m11735a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!C12996b.m48310a(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
