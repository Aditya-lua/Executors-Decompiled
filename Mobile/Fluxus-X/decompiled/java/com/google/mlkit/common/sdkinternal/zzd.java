package com.google.mlkit.common.sdkinternal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzd extends PhantomReference implements Cleaner.Cleanable {
    private final Set zza;
    private final Runnable zzb;

    public /* synthetic */ zzd(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, zzc zzcVar) {
        super(obj, referenceQueue);
        this.zza = set;
        this.zzb = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.Cleaner.Cleanable
    public final void clean() {
        if (this.zza.remove(this)) {
            clear();
            this.zzb.run();
        }
    }
}
