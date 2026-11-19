package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
public final class zzlj {
    private zzkl zza;
    private zzkh zzb;
    private zzkd zzc;
    private Integer zzd;
    private Integer zze;

    public final zzlj zzd(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzlj zze(zzkd zzkdVar) {
        this.zzc = zzkdVar;
        return this;
    }

    public final zzlj zzf(zzkh zzkhVar) {
        this.zzb = zzkhVar;
        return this;
    }

    public final zzlj zzg(zzkl zzklVar) {
        this.zza = zzklVar;
        return this;
    }

    public final zzlj zzh(Integer num) {
        this.zze = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzll zzi() {
        return new zzll(this, null);
    }
}
