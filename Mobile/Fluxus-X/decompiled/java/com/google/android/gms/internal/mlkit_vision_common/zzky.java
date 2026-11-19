package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes.dex */
public final class zzky {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private zzp zze;
    private String zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Integer zzj;
    private Integer zzk;

    public final zzky zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzky zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzky zzd(Integer num) {
        this.zzj = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzky zze(Boolean bool) {
        this.zzg = bool;
        return this;
    }

    public final zzky zzf(Boolean bool) {
        this.zzi = bool;
        return this;
    }

    public final zzky zzg(Boolean bool) {
        this.zzh = bool;
        return this;
    }

    public final zzky zzh(zzp zzpVar) {
        this.zze = zzpVar;
        return this;
    }

    public final zzky zzi(String str) {
        this.zzf = str;
        return this;
    }

    public final zzky zzj(String str) {
        this.zzc = str;
        return this;
    }

    public final zzky zzk(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzky zzl(String str) {
        this.zzd = str;
        return this;
    }

    public final zzla zzm() {
        return new zzla(this, null);
    }
}
