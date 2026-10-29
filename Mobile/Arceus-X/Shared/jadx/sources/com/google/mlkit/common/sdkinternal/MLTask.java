package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MLTask() {
    }

    @NonNull
    public abstract T run(@NonNull S s8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MLTask(@NonNull TaskQueue taskQueue) {
        super(taskQueue);
    }
}
