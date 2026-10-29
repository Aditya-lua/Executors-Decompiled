package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2625r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2461c0 f9209a;

    static {
        AbstractC2461c0 c2614q;
        try {
            SystemClock.elapsedRealtimeNanos();
            c2614q = new C2603p();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c2614q = new C2614q();
        }
        f9209a = c2614q;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2461c0 m11694a() {
        return f9209a;
    }
}
