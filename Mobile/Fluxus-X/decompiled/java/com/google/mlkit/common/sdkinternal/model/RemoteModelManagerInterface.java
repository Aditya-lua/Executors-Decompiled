package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface RemoteModelManagerInterface<RemoteT extends RemoteModel> {
    @NonNull
    Task<Void> deleteDownloadedModel(@NonNull RemoteT remotet);

    @NonNull
    Task<Void> download(@NonNull RemoteT remotet, @NonNull DownloadConditions downloadConditions);

    @NonNull
    Task<Set<RemoteT>> getDownloadedModels();

    @NonNull
    Task<Boolean> isModelDownloaded(@NonNull RemoteT remotet);
}
