package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: g */
    public static final Object f7461g = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f7462f = false;

    /* JADX INFO: renamed from: a */
    public static boolean m9206a(@NonNull String str) {
        synchronized (f7461g) {
        }
        return true;
    }

    /* JADX INFO: renamed from: v3 */
    public static Integer m9207v3() {
        synchronized (f7461g) {
        }
        return null;
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m9208w3() {
        return this.f7462f;
    }
}
