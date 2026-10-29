package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n2 extends z1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i2 f7186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f7187i;

    public n2(i2 i2Var) {
        this.f7186h = i2Var;
    }

    public static i2 z(i2 i2Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        n2 n2Var = new n2(i2Var);
        k2 k2Var = new k2(n2Var);
        n2Var.f7187i = scheduledExecutorService.schedule(k2Var, 28500L, timeUnit);
        i2Var.b(k2Var, y1.INSTANCE);
        return n2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final String n() {
        i2 i2Var = this.f7186h;
        ScheduledFuture scheduledFuture = this.f7187i;
        if (i2Var == null) {
            return null;
        }
        String str = "inputFuture=[" + i2Var.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.m1
    public final void p() {
        i2 i2Var = this.f7186h;
        if ((this.f7231a instanceof h1) & (i2Var != null)) {
            Object obj = this.f7231a;
            i2Var.cancel((obj instanceof h1) && ((h1) obj).f7090a);
        }
        ScheduledFuture scheduledFuture = this.f7187i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f7186h = null;
        this.f7187i = null;
    }
}
