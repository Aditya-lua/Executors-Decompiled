package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzrr;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n9.m;
import sb.a;
import sb.b;
import sb.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ModelResource {

    @NonNull
    protected final TaskQueue taskQueue;
    private final AtomicInteger zza;
    private final AtomicBoolean zzb;

    public ModelResource() {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = new TaskQueue();
    }

    @NonNull
    public <T> Task<T> callAfterLoad(@NonNull final Executor executor, @NonNull final Callable<T> callable, @NonNull final a aVar) {
        m.p(this.zza.get() > 0);
        if (aVar.a()) {
            return sb.m.d();
        }
        final b bVar = new b();
        final k kVar = new k(bVar.b());
        this.taskQueue.submit(new Executor() { // from class: com.google.mlkit.common.sdkinternal.zzm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e10) {
                    if (aVar.a()) {
                        bVar.a();
                    } else {
                        kVar.b(e10);
                    }
                    throw e10;
                }
            }
        }, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(aVar, bVar, callable, kVar);
            }
        });
        return kVar.a();
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
        m.p(this.zza.get() > 0);
        final k kVar = new k();
        this.taskQueue.submit(executor, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(kVar);
            }
        });
        return kVar.a();
    }

    public final /* synthetic */ void zza(a aVar, b bVar, Callable callable, k kVar) {
        try {
            if (aVar.a()) {
                bVar.a();
                return;
            }
            try {
                if (!this.zzb.get()) {
                    load();
                    this.zzb.set(true);
                }
                if (aVar.a()) {
                    bVar.a();
                    return;
                }
                Object objCall = callable.call();
                if (aVar.a()) {
                    bVar.a();
                } else {
                    kVar.c(objCall);
                }
            } catch (RuntimeException e10) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e10);
            }
        } catch (Exception e11) {
            if (aVar.a()) {
                bVar.a();
            } else {
                kVar.b(e11);
            }
        }
    }

    public final /* synthetic */ void zzb(k kVar) {
        int iDecrementAndGet = this.zza.decrementAndGet();
        m.p(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            release();
            this.zzb.set(false);
        }
        zzrr.zza();
        kVar.c(null);
    }

    public ModelResource(@NonNull TaskQueue taskQueue) {
        this.zza = new AtomicInteger(0);
        this.zzb = new AtomicBoolean(false);
        this.taskQueue = taskQueue;
    }
}
