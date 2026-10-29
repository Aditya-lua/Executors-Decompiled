package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2474d2 extends C2496f2 {
    /* JADX INFO: renamed from: a */
    public static InterfaceFutureC2529i2 m11355a(Object obj) {
        return new C2507g2(obj);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceFutureC2529i2 m11356b(InterfaceFutureC2529i2 interfaceFutureC2529i2, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC2529i2.isDone() ? interfaceFutureC2529i2 : C2584n2.m11613z(interfaceFutureC2529i2, 28500L, timeUnit, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: c */
    public static void m11357c(InterfaceFutureC2529i2 interfaceFutureC2529i2, InterfaceC2452b2 interfaceC2452b2, Executor executor) {
        interfaceFutureC2529i2.mo11419b(new RunnableC2463c2(interfaceFutureC2529i2, interfaceC2452b2), executor);
    }
}
