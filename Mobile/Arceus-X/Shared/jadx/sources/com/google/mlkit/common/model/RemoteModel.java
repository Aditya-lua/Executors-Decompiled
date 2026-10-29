package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;
import p305n9.C8947k;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RemoteModel {
    private final String zzc;
    private final BaseModel zzd;
    private final ModelType zze;
    private String zzf;
    private static final Map zzb = new EnumMap(BaseModel.class);

    @NonNull
    public static final Map zza = new EnumMap(BaseModel.class);

    public RemoteModel(String str, BaseModel baseModel, @NonNull ModelType modelType) {
        C8953m.m36037b(TextUtils.isEmpty(str) == (baseModel != null), "One of cloud model name and base model cannot be empty");
        this.zzc = str;
        this.zzd = baseModel;
        this.zze = modelType;
    }

    public boolean baseModelHashMatches(@NonNull String str) {
        BaseModel baseModel = this.zzd;
        if (baseModel == null) {
            return false;
        }
        return str.equals(zzb.get(baseModel));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteModel)) {
            return false;
        }
        RemoteModel remoteModel = (RemoteModel) obj;
        return C8947k.m36026b(this.zzc, remoteModel.zzc) && C8947k.m36026b(this.zzd, remoteModel.zzd) && C8947k.m36026b(this.zze, remoteModel.zze);
    }

    @NonNull
    public String getModelHash() {
        return this.zzf;
    }

    public String getModelName() {
        return this.zzc;
    }

    @NonNull
    public String getModelNameForBackend() {
        String str = this.zzc;
        if (str != null) {
            return str;
        }
        return (String) zza.get(this.zzd);
    }

    @NonNull
    public ModelType getModelType() {
        return this.zze;
    }

    @NonNull
    public String getUniqueModelNameForPersist() {
        String str = this.zzc;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) zza.get(this.zzd)));
    }

    public int hashCode() {
        return C8947k.m36027c(this.zzc, this.zzd, this.zze);
    }

    public boolean isBaseModel() {
        return this.zzd != null;
    }

    public void setModelHash(@NonNull String str) {
        this.zzf = str;
    }

    @NonNull
    public String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModel");
        zzqVarZzb.zza("modelName", this.zzc);
        zzqVarZzb.zza("baseModel", this.zzd);
        zzqVarZzb.zza("modelType", this.zze);
        return zzqVarZzb.toString();
    }
}
