package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f7117a;

    public k2(n2 n2Var) {
        this.f7117a = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i2 i2Var;
        n2 n2Var = this.f7117a;
        if (n2Var == null || (i2Var = n2Var.f7186h) == null) {
            return;
        }
        this.f7117a = null;
        if (i2Var.isDone()) {
            n2Var.s(i2Var);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = n2Var.f7187i;
            n2Var.f7187i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    n2Var.r(new l2(str, null));
                    throw th2;
                }
            }
            n2Var.r(new l2(str + ": " + i2Var.toString(), null));
            i2Var.cancel(true);
        } catch (Throwable th3) {
            i2Var.cancel(true);
            throw th3;
        }
    }
}
