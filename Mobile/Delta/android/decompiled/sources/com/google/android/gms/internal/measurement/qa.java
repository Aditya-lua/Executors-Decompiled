package com.google.android.gms.internal.measurement;

import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class qa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6749a;
    public final int b;

    public qa(Object obj, int i10) {
        this.f6749a = obj;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qa)) {
            return false;
        }
        qa qaVar = (qa) obj;
        return this.f6749a == qaVar.f6749a && this.b == qaVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f6749a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
    }
}
