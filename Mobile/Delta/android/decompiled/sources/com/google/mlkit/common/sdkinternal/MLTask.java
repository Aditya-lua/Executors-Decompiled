package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    public MLTask() {
    }

    @NonNull
    public abstract T run(@NonNull S s8);

    public MLTask(@NonNull TaskQueue taskQueue) {
        super(taskQueue);
    }
}
