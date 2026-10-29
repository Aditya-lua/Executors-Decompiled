package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t8 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2318t8 {
    /* JADX INFO: renamed from: a */
    static Object m10767a(InterfaceC2300s8 interfaceC2300s8) {
        try {
            return interfaceC2300s8.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2300s8.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    Object mo10430b(String str);
}
