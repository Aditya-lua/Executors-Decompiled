package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzaw;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import sb.c;
import sb.k;

/* JADX INFO: loaded from: classes2.dex */
public class MLTaskExecutor {
    private static final Object zza = new Object();
    private static MLTaskExecutor zzb;
    private final Handler zzc;

    private MLTaskExecutor(Looper looper) {
        this.zzc = new com.google.android.gms.internal.mlkit_common.zza(looper);
    }

    @NonNull
    public static MLTaskExecutor getInstance() {
        MLTaskExecutor mLTaskExecutor;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    zzb = new MLTaskExecutor(handlerThread.getLooper());
                }
                mLTaskExecutor = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mLTaskExecutor;
    }

    @NonNull
    public static Executor workerThreadExecutor() {
        return zzh.zza;
    }

    @NonNull
    public Handler getHandler() {
        return this.zzc;
    }

    @NonNull
    public <ResultT> Task<ResultT> scheduleCallable(@NonNull final Callable<ResultT> callable) {
        final k kVar = new k();
        scheduleRunnable(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzf
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                k kVar2 = kVar;
                try {
                    kVar2.c(callable2.call());
                } catch (MlKitException e10) {
                    kVar2.b(e10);
                } catch (Exception e11) {
                    kVar2.b(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e11));
                }
            }
        });
        return kVar.a();
    }

    public void scheduleRunnable(@NonNull Runnable runnable) {
        workerThreadExecutor().execute(runnable);
    }

    public void scheduleRunnableDelayed(@NonNull Runnable runnable, long j10) {
        this.zzc.postDelayed(runnable, j10);
    }

    @NonNull
    public <ResultT> Task<ResultT> scheduleTaskCallable(@NonNull Callable<Task<ResultT>> callable) {
        return (Task<ResultT>) scheduleCallable(callable).i(zzaw.zza(), new c() { // from class: com.google.mlkit.common.sdkinternal.zzg
            @Override // sb.c
            public final Object then(Task task) {
                return (Task) task.getResult();
            }
        });
    }
}
