package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2507g2 implements InterfaceFutureC2529i2 {

    /* JADX INFO: renamed from: b */
    public static final C2518h2 f8981b = new C2518h2(C2507g2.class);

    /* JADX INFO: renamed from: a */
    public final Object f8982a;

    public C2507g2(Object obj) {
        this.f8982a = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC2529i2
    /* JADX INFO: renamed from: b */
    public final void mo11419b(Runnable runnable, Executor executor) {
        C2691x.m11817c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f8981b.m11443a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8982a;
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
        Object obj = this.f8982a;
        return super.toString() + "[status=SUCCESS, result=[" + obj.toString() + "]]";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f8982a;
    }
}
