package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyInstanceMap<K, V> {
    private final Map zza = new HashMap();

    @NonNull
    public abstract V create(@NonNull K k10);

    @NonNull
    public V get(@NonNull K k10) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k10)) {
                    return (V) this.zza.get(k10);
                }
                V vCreate = create(k10);
                this.zza.put(k10, vCreate);
                return vCreate;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
