package com.google.mlkit.common.sdkinternal;

import java.io.Closeable;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
final class zzx implements Closeable {
    final /* synthetic */ TaskQueue zza;

    public /* synthetic */ zzx(TaskQueue taskQueue, zzw zzwVar) {
        this.zza = taskQueue;
        C8953m.m36051p(((Thread) taskQueue.zzd.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.zzd.set(null);
        this.zza.zzc();
    }
}
