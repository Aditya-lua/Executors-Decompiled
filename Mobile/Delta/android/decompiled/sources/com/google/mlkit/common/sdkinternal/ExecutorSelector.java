package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import xf.b;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorSelector {
    private final b zza;

    public ExecutorSelector(@NonNull b bVar) {
        this.zza = bVar;
    }

    @NonNull
    public Executor getExecutorToUse(Executor executor) {
        return executor != null ? executor : (Executor) this.zza.get();
    }
}
