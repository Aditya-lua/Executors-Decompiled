package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import n9.k;

/* JADX INFO: loaded from: classes2.dex */
public class ZoomSuggestionOptions {
    private final ZoomCallback zza;
    private final float zzb;

    public static class Builder {
        private final ZoomCallback zza;
        private float zzb;

        public Builder(@NonNull ZoomCallback zoomCallback) {
            this.zza = zoomCallback;
        }

        @NonNull
        public ZoomSuggestionOptions build() {
            return new ZoomSuggestionOptions(this.zza, this.zzb, null);
        }

        @NonNull
        public Builder setMaxSupportedZoomRatio(float f10) {
            this.zzb = f10;
            return this;
        }
    }

    public interface ZoomCallback {
        boolean setZoom(float f10);
    }

    public /* synthetic */ ZoomSuggestionOptions(ZoomCallback zoomCallback, float f10, zzb zzbVar) {
        this.zza = zoomCallback;
        this.zzb = f10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ZoomSuggestionOptions)) {
            return false;
        }
        ZoomSuggestionOptions zoomSuggestionOptions = (ZoomSuggestionOptions) obj;
        return k.b(this.zza, zoomSuggestionOptions.zza) && this.zzb == zoomSuggestionOptions.zzb;
    }

    public int hashCode() {
        return k.c(this.zza, Float.valueOf(this.zzb));
    }

    public final float zza() {
        return this.zzb;
    }

    @NonNull
    public final ZoomCallback zzb() {
        return this.zza;
    }
}
