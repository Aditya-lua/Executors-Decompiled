package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zzwd extends zzwh {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    public /* synthetic */ zzwd(String str, boolean z10, int i10, zzwc zzwcVar) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzwh) {
            zzwh zzwhVar = (zzwh) obj;
            if (this.zza.equals(zzwhVar.zzb()) && this.zzb == zzwhVar.zzc() && this.zzc == zzwhVar.zza()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.zza + ", enableFirelog=" + this.zzb + ", firelogEventType=" + this.zzc + "}";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwh
    public final boolean zzc() {
        return this.zzb;
    }
}
