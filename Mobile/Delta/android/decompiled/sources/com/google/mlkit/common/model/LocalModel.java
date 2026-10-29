package com.google.mlkit.common.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import n9.k;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public class LocalModel {
    private final String zza;
    private final String zzb;
    private final Uri zzc;
    private final boolean zzd;

    public static class Builder {
        private String zza = null;
        private String zzb = null;
        private Uri zzc = null;
        private boolean zzd = false;

        @NonNull
        public LocalModel build() {
            String str = this.zza;
            boolean z10 = true;
            if ((str == null || this.zzb != null || this.zzc != null) && ((str != null || this.zzb == null || this.zzc != null) && (str != null || this.zzb != null || this.zzc == null))) {
                z10 = false;
            }
            m.b(z10, "Set one of filePath, assetFilePath and URI.");
            return new LocalModel(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        @NonNull
        public Builder setAbsoluteFilePath(@NonNull String str) {
            m.g(str, "Model Source file path can not be empty");
            boolean z10 = false;
            if (this.zzb == null && this.zzc == null && !this.zzd) {
                z10 = true;
            }
            m.b(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setAbsoluteManifestFilePath(@NonNull String str) {
            m.g(str, "Manifest file path can not be empty");
            boolean z10 = false;
            if (this.zzb == null && this.zzc == null && (this.zza == null || this.zzd)) {
                z10 = true;
            }
            m.b(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zza = str;
            this.zzd = true;
            return this;
        }

        @NonNull
        public Builder setAssetFilePath(@NonNull String str) {
            m.g(str, "Model Source file path can not be empty");
            boolean z10 = false;
            if (this.zza == null && this.zzc == null && !this.zzd) {
                z10 = true;
            }
            m.b(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setAssetManifestFilePath(@NonNull String str) {
            m.g(str, "Manifest file path can not be empty");
            boolean z10 = false;
            if (this.zza == null && this.zzc == null && (this.zzb == null || this.zzd)) {
                z10 = true;
            }
            m.b(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzb = str;
            this.zzd = true;
            return this;
        }

        @NonNull
        public Builder setUri(@NonNull Uri uri) {
            boolean z10 = false;
            if (this.zza == null && this.zzb == null) {
                z10 = true;
            }
            m.b(z10, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzc = uri;
            return this;
        }
    }

    public /* synthetic */ LocalModel(String str, String str2, Uri uri, boolean z10, zzc zzcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = z10;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        LocalModel localModel = (LocalModel) obj;
        return k.b(this.zza, localModel.zza) && k.b(this.zzb, localModel.zzb) && k.b(this.zzc, localModel.zzc) && this.zzd == localModel.zzd;
    }

    public String getAbsoluteFilePath() {
        return this.zza;
    }

    public String getAssetFilePath() {
        return this.zzb;
    }

    public Uri getUri() {
        return this.zzc;
    }

    public int hashCode() {
        return k.c(this.zza, this.zzb, this.zzc, Boolean.valueOf(this.zzd));
    }

    public boolean isManifestFile() {
        return this.zzd;
    }

    @NonNull
    public String toString() {
        zzq zzqVarZza = zzr.zza(this);
        zzqVarZza.zza("absoluteFilePath", this.zza);
        zzqVarZza.zza("assetFilePath", this.zzb);
        zzqVarZza.zza("uri", this.zzc);
        zzqVarZza.zzb("isManifestFile", this.zzd);
        return zzqVarZza.toString();
    }
}
