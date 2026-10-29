package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface RemoteModelFileMover {
    @NonNull
    File getModelFileDestination();

    File moveAllFilesFromPrivateTempToPrivateDestination(@NonNull File file);
}
