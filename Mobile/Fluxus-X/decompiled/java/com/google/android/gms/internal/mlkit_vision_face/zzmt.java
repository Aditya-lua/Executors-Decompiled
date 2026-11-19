package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzmt {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private zzbn zze;
    private String zzf;
    private Boolean zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Integer zzj;
    private Integer zzk;

    public final zzmt zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzmt zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzmt zzd(Integer num) {
        this.zzj = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzmt zze(Boolean bool) {
        this.zzg = bool;
        return this;
    }

    public final zzmt zzf(Boolean bool) {
        this.zzi = bool;
        return this;
    }

    public final zzmt zzg(Boolean bool) {
        this.zzh = bool;
        return this;
    }

    public final zzmt zzh(zzbn zzbnVar) {
        this.zze = zzbnVar;
        return this;
    }

    public final zzmt zzi(String str) {
        this.zzf = str;
        return this;
    }

    public final zzmt zzj(String str) {
        this.zzc = str;
        return this;
    }

    public final zzmt zzk(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzmt zzl(String str) {
        this.zzd = str;
        return this;
    }

    public final zzmv zzm() {
        return new zzmv(this, null);
    }
}
