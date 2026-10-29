package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f5772g = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5773f = false;

    public static boolean a(@NonNull String str) {
        synchronized (f5772g) {
        }
        return true;
    }

    public static Integer v3() {
        synchronized (f5772g) {
        }
        return null;
    }

    public boolean w3() {
        return this.f5773f;
    }
}
