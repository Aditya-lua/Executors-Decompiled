package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzdl {
    private zzks zza;
    private Boolean zzb;
    private zzkd zzc;
    private Integer zzd;
    private Integer zze;

    public final zzdl zza(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdl zzb(zzkd zzkdVar) {
        this.zzc = zzkdVar;
        return this;
    }

    public final zzdl zzc(zzks zzksVar) {
        this.zza = zzksVar;
        return this;
    }

    public final zzdl zzd(Boolean bool) {
        this.zzb = bool;
        return this;
    }

    public final zzdl zze(Integer num) {
        this.zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdn zzf() {
        return new zzdn(this, null);
    }
}
