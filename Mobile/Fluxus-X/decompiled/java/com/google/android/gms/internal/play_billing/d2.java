package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends f2 {
    public static i2 a(Object obj) {
        return new g2(obj);
    }

    public static i2 b(i2 i2Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return i2Var.isDone() ? i2Var : n2.z(i2Var, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(i2 i2Var, b2 b2Var, Executor executor) {
        i2Var.b(new c2(i2Var, b2Var), executor);
    }
}
