package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzxm {
    public static final zzxm zza;

    static {
        zzm().zzm();
        zzxl zzxlVarZzm = zzm();
        zzxlVarZzm.zzi(false);
        zza = zzxlVarZzm.zzm();
    }

    public static zzxl zzm() {
        zzxd zzxdVar = new zzxd();
        zzxdVar.zzg(10);
        zzxdVar.zze(5);
        zzxdVar.zzf(0.25f);
        zzxdVar.zzd(0.8f);
        zzxdVar.zzi(true);
        zzxdVar.zzc(0.5f);
        zzxdVar.zzb(0.8f);
        zzxdVar.zzk(1500L);
        zzxdVar.zzh(3000L);
        zzxdVar.zza(true);
        zzxdVar.zzj(0.1f);
        zzxdVar.zzl(0.05f);
        return zzxdVar;
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public abstract float zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract long zzj();

    public abstract boolean zzk();

    public abstract boolean zzl();
}
