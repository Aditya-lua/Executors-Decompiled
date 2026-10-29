package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2551k2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public C2584n2 f9061a;

    public RunnableC2551k2(C2584n2 c2584n2) {
        this.f9061a = c2584n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC2529i2 interfaceFutureC2529i2;
        C2584n2 c2584n2 = this.f9061a;
        if (c2584n2 == null || (interfaceFutureC2529i2 = c2584n2.f9164h) == null) {
            return;
        }
        this.f9061a = null;
        if (interfaceFutureC2529i2.isDone()) {
            c2584n2.m11581s(interfaceFutureC2529i2);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = c2584n2.f9165i;
            c2584n2.f9165i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    c2584n2.m11580r(new C2562l2(str, null));
                    throw th2;
                }
            }
            c2584n2.m11580r(new C2562l2(str + ": " + interfaceFutureC2529i2.toString(), null));
            interfaceFutureC2529i2.cancel(true);
        } catch (Throwable th3) {
            interfaceFutureC2529i2.cancel(true);
            throw th3;
        }
    }
}
