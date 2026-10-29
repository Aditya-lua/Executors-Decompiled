package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2584n2 extends C2715z1 {

    /* JADX INFO: renamed from: h */
    public InterfaceFutureC2529i2 f9164h;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture f9165i;

    public C2584n2(InterfaceFutureC2529i2 interfaceFutureC2529i2) {
        this.f9164h = interfaceFutureC2529i2;
    }

    /* JADX INFO: renamed from: z */
    public static InterfaceFutureC2529i2 m11613z(InterfaceFutureC2529i2 interfaceFutureC2529i2, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C2584n2 c2584n2 = new C2584n2(interfaceFutureC2529i2);
        RunnableC2551k2 runnableC2551k2 = new RunnableC2551k2(c2584n2);
        c2584n2.f9165i = scheduledExecutorService.schedule(runnableC2551k2, 28500L, timeUnit);
        interfaceFutureC2529i2.mo11419b(runnableC2551k2, EnumC2704y1.INSTANCE);
        return c2584n2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2572m1
    /* JADX INFO: renamed from: n */
    public final String mo11578n() {
        InterfaceFutureC2529i2 interfaceFutureC2529i2 = this.f9164h;
        ScheduledFuture scheduledFuture = this.f9165i;
        if (interfaceFutureC2529i2 == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC2529i2.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2572m1
    /* JADX INFO: renamed from: p */
    public final void mo11579p() {
        InterfaceFutureC2529i2 interfaceFutureC2529i2 = this.f9164h;
        if ((this.f9224a instanceof C2517h1) & (interfaceFutureC2529i2 != null)) {
            Object obj = this.f9224a;
            interfaceFutureC2529i2.cancel((obj instanceof C2517h1) && ((C2517h1) obj).f9026a);
        }
        ScheduledFuture scheduledFuture = this.f9165i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9164h = null;
        this.f9165i = null;
    }
}
