package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f7220a;

    static {
        c0 qVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            qVar = new p();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            qVar = new q();
        }
        f7220a = qVar;
    }

    public static c0 a() {
        return f7220a;
    }
}
