package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p305n9.C8953m;
import sb.AbstractC11244a;
import sb.C11246b;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ModelResource {

    @NonNull
    protected final TaskQueue taskQueue;
    private final AtomicInteger zza;
    private final AtomicBoolean zzb;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ModelResource() {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = new TaskQueue();
    }

    @NonNull
    public <T> Task<T> callAfterLoad(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final AbstractC11244a abstractC11244a) {
        C8953m.m36051p(this.zza.get() > 0);
        if (abstractC11244a.mo42308a()) {
            return C11268m.m42334d();
        }
        final C11246b c11246b = new C11246b();
        final C11264k c11264k = new C11264k(c11246b.m42314b());
        this.taskQueue.submit(new Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (abstractC11244a.mo42308a()) {
                        c11246b.m42313a();
                    } else {
                        c11264k.m42327b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(abstractC11244a, c11246b, callable, c11264k);
            }
        });
        return c11264k.m42326a();
    }

    public boolean isLoaded() {
        return this.zzb.get();
    }

    public abstract void load();

    public void pin() {
        this.zza.incrementAndGet();
    }

    public abstract void release();

    public void unpin(@NonNull Executor executor) {
        unpinWithTask(executor);
    }

    @NonNull
    public Task<Void> unpinWithTask(@NonNull Executor executor) {
        C8953m.m36051p(this.zza.get() > 0);
        final C11264k c11264k = new C11264k();
        this.taskQueue.submit(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(c11264k);
            }
        });
        return c11264k.m42326a();
    }

    public final /* synthetic */ void zza(AbstractC11244a abstractC11244a, C11246b c11246b, Callable callable, C11264k c11264k) {
        try {
            if (abstractC11244a.mo42308a()) {
                c11246b.m42313a();
                return;
            }
            try {
                if (!this.zzb.get()) {
                    load();
                    this.zzb.set(true);
                }
                if (abstractC11244a.mo42308a()) {
                    c11246b.m42313a();
                    return;
                }
                Object objCall = callable.call();
                if (abstractC11244a.mo42308a()) {
                    c11246b.m42313a();
                } else {
                    c11264k.m42328c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (abstractC11244a.mo42308a()) {
                c11246b.m42313a();
            } else {
                c11264k.m42327b(e11);
            }
        }
    }

    public final /* synthetic */ void zzb(C11264k c11264k) {
        int iDecrementAndGet = this.zza.decrementAndGet();
        C8953m.m36051p(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            release();
            this.zzb.set(false);
        }
        zzrr.zza();
        c11264k.m42328c(null);
    }

    public ModelResource(@NonNull TaskQueue taskQueue) {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = taskQueue;
    }
}
