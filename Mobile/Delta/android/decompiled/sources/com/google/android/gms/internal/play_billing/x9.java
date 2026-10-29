package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class x9 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f7343a;
    public final s9 b = new w9(this);

    public x9(t9 t9Var) {
        this.f7343a = new WeakReference(t9Var);
    }

    @Override // com.google.android.gms.internal.play_billing.i2
    public final void b(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.b.b(runnable, executor);
    }

    public final boolean c(Object obj) {
        return this.b.e(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        t9 t9Var = (t9) this.f7343a.get();
        boolean zCancel = this.b.cancel(z10);
        if (!zCancel || t9Var == null) {
            return zCancel;
        }
        t9Var.a();
        return true;
    }

    public final boolean d(Throwable th2) {
        m4 m4Var = new m4(th2);
        x1 x1Var = s9.f7313f;
        s9 s9Var = this.b;
        if (!x1Var.d(s9Var, null, m4Var)) {
            return false;
        }
        s9.d(s9Var);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.f7315a instanceof q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, @NonNull TimeUnit timeUnit) {
        return this.b.get(j10, timeUnit);
    }
}
