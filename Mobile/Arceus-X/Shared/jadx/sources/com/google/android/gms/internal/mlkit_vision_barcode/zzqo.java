package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public final class zzqo {
    private Long zza;
    private zzrb zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;

    public final zzqo zza(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zzqo zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzqo zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzqo zzd(zzrb zzrbVar) {
        this.zzb = zzrbVar;
        return this;
    }

    public final zzqo zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzqq zzf() {
        return new zzqq(this, null);
    }
}
