package com.google.android.gms.internal.play_billing;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7033a;
    public final int b;

    public e4(Object obj, int i10) {
        this.f7033a = obj;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj;
        return this.f7033a == e4Var.f7033a && this.b == e4Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7033a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}
