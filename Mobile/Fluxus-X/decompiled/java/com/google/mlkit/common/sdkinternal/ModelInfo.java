package com.google.mlkit.common.sdkinternal;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class ModelInfo {
    private final String zza;
    private final Uri zzb;
    private final String zzc;
    private final ModelType zzd;

    public ModelInfo(@NonNull String str, @NonNull Uri uri, @NonNull String str2, @NonNull ModelType modelType) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = modelType;
    }

    @NonNull
    public String getModelHash() {
        return this.zzc;
    }

    @NonNull
    public String getModelNameForPersist() {
        return this.zza;
    }

    @NonNull
    public ModelType getModelType() {
        return this.zzd;
    }

    @NonNull
    public Uri getModelUri() {
        return this.zzb;
    }
}
