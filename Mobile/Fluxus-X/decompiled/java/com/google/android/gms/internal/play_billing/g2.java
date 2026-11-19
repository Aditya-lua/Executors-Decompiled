package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class g2 implements i2 {
    public static final h2 b = new h2(g2.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7050a;

    public g2(Object obj) {
        this.f7050a = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.i2
    public final void b(Runnable runnable, Executor executor) {
        x.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f7050a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.f7050a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f7050a;
    }
}
