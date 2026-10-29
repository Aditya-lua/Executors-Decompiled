package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzoh {
    private Long zza;
    private zzou zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;

    public final zzoh zza(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zzoh zzb(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzoh zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzoh zzd(zzou zzouVar) {
        this.zzb = zzouVar;
        return this;
    }

    public final zzoh zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzoj zzf() {
        return new zzoj(this, null);
    }
}
