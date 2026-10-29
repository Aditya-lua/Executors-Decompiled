package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.concurrent.Executor;
import p305n9.C8947k;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeScannerOptions {
    private final int zza;
    private final boolean zzb;
    private final Executor zzc;
    private final ZoomSuggestionOptions zzd;

    public static class Builder {
        private int zza = 0;
        private boolean zzb;
        private Executor zzc;
        private ZoomSuggestionOptions zzd;

        @NonNull
        public BarcodeScannerOptions build() {
            return new BarcodeScannerOptions(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        @NonNull
        public Builder enableAllPotentialBarcodes() {
            this.zzb = true;
            return this;
        }

        @NonNull
        public Builder setBarcodeFormats(@Barcode.BarcodeFormat int i10, @NonNull @Barcode.BarcodeFormat int... iArr) {
            this.zza = i10;
            if (iArr != null) {
                for (int i11 : iArr) {
                    this.zza = i11 | this.zza;
                }
            }
            return this;
        }

        @NonNull
        public Builder setExecutor(@NonNull Executor executor) {
            this.zzc = executor;
            return this;
        }

        @NonNull
        public Builder setZoomSuggestionOptions(@NonNull ZoomSuggestionOptions zoomSuggestionOptions) {
            this.zzd = zoomSuggestionOptions;
            return this;
        }
    }

    public /* synthetic */ BarcodeScannerOptions(int i10, boolean z10, Executor executor, ZoomSuggestionOptions zoomSuggestionOptions, zza zzaVar) {
        this.zza = i10;
        this.zzb = z10;
        this.zzc = executor;
        this.zzd = zoomSuggestionOptions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerOptions)) {
            return false;
        }
        BarcodeScannerOptions barcodeScannerOptions = (BarcodeScannerOptions) obj;
        return this.zza == barcodeScannerOptions.zza && this.zzb == barcodeScannerOptions.zzb && C8947k.m36026b(this.zzc, barcodeScannerOptions.zzc) && C8947k.m36026b(this.zzd, barcodeScannerOptions.zzd);
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.zza), Boolean.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zza;
    }

    public final ZoomSuggestionOptions zzb() {
        return this.zzd;
    }

    public final Executor zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
