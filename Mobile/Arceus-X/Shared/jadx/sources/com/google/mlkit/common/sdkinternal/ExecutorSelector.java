package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import p575yf.InterfaceC13188b;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorSelector {
    private final InterfaceC13188b zza;

    public ExecutorSelector(@NonNull InterfaceC13188b interfaceC13188b) {
        this.zza = interfaceC13188b;
    }

    @NonNull
    public Executor getExecutorToUse(Executor executor) {
        return executor != null ? executor : (Executor) this.zza.get();
    }
}
