package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import p9.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6154g = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6155f = false;

    public static Integer A3() {
        synchronized (f6154g) {
        }
        return null;
    }

    public static boolean a(@NonNull String str) {
        synchronized (f6154g) {
        }
        return true;
    }

    public boolean B3() {
        return this.f6155f;
    }
}
