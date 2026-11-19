package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.mlkit.common.model.RemoteModel;
import com.google.mlkit.common.sdkinternal.ModelInfo;

/* JADX INFO: loaded from: classes2.dex */
public interface ModelInfoRetrieverInterop {
    ModelInfo retrieveRemoteModelInfo(@NonNull RemoteModel remoteModel);
}
