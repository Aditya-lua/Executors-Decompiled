package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.mlkit.common.sdkinternal.ModelType;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomRemoteModel extends RemoteModel {
    private final RemoteModelSource zzb;

    public static class Builder {

        @NonNull
        private final RemoteModelSource zza;

        public Builder(@NonNull RemoteModelSource remoteModelSource) {
            C8953m.m36047l(remoteModelSource);
            this.zza = remoteModelSource;
        }

        @NonNull
        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.zza, null);
        }
    }

    public /* synthetic */ CustomRemoteModel(RemoteModelSource remoteModelSource, zza zzaVar) {
        super(TextUtils.isEmpty(remoteModelSource.zza()) ? "no_model_name" : remoteModelSource.zza(), null, ModelType.CUSTOM);
        this.zzb = remoteModelSource;
    }

    @NonNull
    public RemoteModelSource getRemoteModelSource() {
        return this.zzb;
    }
}
