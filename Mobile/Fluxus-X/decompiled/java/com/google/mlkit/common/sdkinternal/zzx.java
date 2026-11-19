package com.google.mlkit.common.sdkinternal;

import java.io.Closeable;
import o9.s;

/* JADX INFO: loaded from: classes2.dex */
final class zzx implements Closeable {
    final /* synthetic */ TaskQueue zza;

    public /* synthetic */ zzx(TaskQueue taskQueue, zzw zzwVar) {
        this.zza = taskQueue;
        s.p(((Thread) taskQueue.zzd.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.zzd.set(null);
        this.zza.zzc();
    }
}
