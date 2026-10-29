package com.google.mlkit.common.model;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import n9.k;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadConditions {
    private final boolean zza;
    private final boolean zzb;

    public static class Builder {
        private boolean zza = false;
        private boolean zzb = false;

        @NonNull
        public DownloadConditions build() {
            return new DownloadConditions(this.zza, this.zzb, null);
        }

        @NonNull
        @TargetApi(24)
        public Builder requireCharging() {
            this.zza = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.zzb = true;
            return this;
        }
    }

    public /* synthetic */ DownloadConditions(boolean z10, boolean z11, zzb zzbVar) {
        this.zza = z10;
        this.zzb = z11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadConditions)) {
            return false;
        }
        DownloadConditions downloadConditions = (DownloadConditions) obj;
        return this.zza == downloadConditions.zza && this.zzb == downloadConditions.zzb;
    }

    public int hashCode() {
        return k.c(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb));
    }

    public boolean isChargingRequired() {
        return this.zza;
    }

    public boolean isWifiRequired() {
        return this.zzb;
    }
}
