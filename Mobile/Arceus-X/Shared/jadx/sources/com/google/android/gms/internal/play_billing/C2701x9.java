package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2701x9 implements InterfaceFutureC2529i2 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f9416a;

    /* JADX INFO: renamed from: b */
    public final C2646s9 f9417b = new C2690w9(this);

    public C2701x9(C2657t9 c2657t9) {
        this.f9416a = new WeakReference(c2657t9);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC2529i2
    /* JADX INFO: renamed from: b */
    public final void mo11419b(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f9417b.mo11419b(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11844c(Object obj) {
        return this.f9417b.mo11730e(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        C2657t9 c2657t9 = (C2657t9) this.f9416a.get();
        boolean zCancel = this.f9417b.cancel(z10);
        if (!zCancel || c2657t9 == null) {
            return zCancel;
        }
        c2657t9.m11762a();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11845d(Throwable th2) {
        C2575m4 c2575m4 = new C2575m4(th2);
        AbstractC2693x1 abstractC2693x1 = C2646s9.f9379f;
        C2646s9 c2646s9 = this.f9417b;
        if (!abstractC2693x1.mo11411d(c2646s9, null, c2575m4)) {
            return false;
        }
        C2646s9.m11726d(c2646s9);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9417b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9417b.f9381a instanceof C2617q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9417b.isDone();
    }

    public final String toString() {
        return this.f9417b.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.concurrent.Future
    public final Object get(long j10, @NonNull TimeUnit timeUnit) {
        return this.f9417b.get(j10, timeUnit);
    }
}
