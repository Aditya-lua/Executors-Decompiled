package com.google.mlkit.common.internal.model;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ModelUtils_ModelLoggingInfo extends ModelUtils.ModelLoggingInfo {
    private final long zza;
    private final String zzb;
    private final boolean zzc;

    public AutoValue_ModelUtils_ModelLoggingInfo(long j10, String str, boolean z10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.ModelLoggingInfo) {
            ModelUtils.ModelLoggingInfo modelLoggingInfo = (ModelUtils.ModelLoggingInfo) obj;
            if (this.zza == modelLoggingInfo.getSize() && this.zzb.equals(modelLoggingInfo.getHash()) && this.zzc == modelLoggingInfo.isManifestModel()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public String getHash() {
        return this.zzb;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public long getSize() {
        return this.zza;
    }

    public final int hashCode() {
        long j10 = this.zza;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ (true != this.zzc ? 1237 : 1231);
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public boolean isManifestModel() {
        return this.zzc;
    }

    public final String toString() {
        return "ModelLoggingInfo{size=" + this.zza + ", hash=" + this.zzb + ", manifestModel=" + this.zzc + "}";
    }
}
