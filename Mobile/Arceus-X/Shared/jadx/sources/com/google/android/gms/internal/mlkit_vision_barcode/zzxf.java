package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zzxf extends zzxm {
    private final int zzb;
    private final int zzc;
    private final float zzd;
    private final float zze;
    private final boolean zzf;
    private final float zzg;
    private final float zzh;
    private final long zzi;
    private final long zzj;
    private final boolean zzk;
    private final float zzl;
    private final float zzm;

    public /* synthetic */ zzxf(int i10, int i11, float f10, float f11, boolean z10, float f12, float f13, long j10, long j11, boolean z11, float f14, float f15, zzxe zzxeVar) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = f10;
        this.zze = f11;
        this.zzf = z10;
        this.zzg = f12;
        this.zzh = f13;
        this.zzi = j10;
        this.zzj = j11;
        this.zzk = z11;
        this.zzl = f14;
        this.zzm = f15;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzxm) {
            zzxm zzxmVar = (zzxm) obj;
            if (this.zzb == zzxmVar.zzh() && this.zzc == zzxmVar.zzg() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzxmVar.zzd()) && Float.floatToIntBits(this.zze) == Float.floatToIntBits(zzxmVar.zzc()) && this.zzf == zzxmVar.zzl() && Float.floatToIntBits(this.zzg) == Float.floatToIntBits(zzxmVar.zzb()) && Float.floatToIntBits(this.zzh) == Float.floatToIntBits(zzxmVar.zza()) && this.zzi == zzxmVar.zzj() && this.zzj == zzxmVar.zzi() && this.zzk == zzxmVar.zzk() && Float.floatToIntBits(this.zzl) == Float.floatToIntBits(zzxmVar.zze()) && Float.floatToIntBits(this.zzm) == Float.floatToIntBits(zzxmVar.zzf())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.zzb ^ 1000003) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 1000003) ^ Float.floatToIntBits(this.zze)) * 1000003) ^ (true != this.zzf ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzg)) * 1000003) ^ Float.floatToIntBits(this.zzh)) * 1000003) ^ ((int) this.zzi)) * 1000003) ^ ((int) this.zzj)) * 1000003) ^ (true != this.zzk ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.zzl)) * 1000003) ^ Float.floatToIntBits(this.zzm);
    }

    public final String toString() {
        return "AutoZoomOptions{recentFramesToCheck=" + this.zzb + ", recentFramesContainingPredictedArea=" + this.zzc + ", recentFramesIou=" + this.zzd + ", maxCoverage=" + this.zze + ", useConfidenceScore=" + this.zzf + ", lowerConfidenceScore=" + this.zzg + ", higherConfidenceScore=" + this.zzh + ", zoomIntervalInMillis=" + this.zzi + ", resetIntervalInMillis=" + this.zzj + ", enableZoomThreshold=" + this.zzk + ", zoomInThreshold=" + this.zzl + ", zoomOutThreshold=" + this.zzm + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zza() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zze() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final float zzf() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final long zzj() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzk() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzxm
    public final boolean zzl() {
        return this.zzf;
    }
}
