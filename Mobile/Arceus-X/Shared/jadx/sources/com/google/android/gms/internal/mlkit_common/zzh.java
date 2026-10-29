package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzh {
    public static final zzh zza;
    private final boolean zzb;
    private final boolean zzc = false;
    private final zzaf zzd;

    static {
        zze zzeVar = null;
        zzf zzfVar = new zzf(zzeVar);
        zzfVar.zzb();
        zza = zzfVar.zzd();
        zzf zzfVar2 = new zzf(zzeVar);
        zzfVar2.zzb();
        zzfVar2.zza(new zzd());
        zzfVar2.zzd();
        zzf zzfVar3 = new zzf(zzeVar);
        zzfVar3.zzc();
        zzfVar3.zzd();
    }

    public /* synthetic */ zzh(boolean z10, boolean z11, zzaf zzafVar, zzg zzgVar) {
        this.zzb = z10;
        this.zzd = zzafVar;
    }

    public static /* bridge */ /* synthetic */ boolean zza(zzh zzhVar) {
        boolean z10 = zzhVar.zzc;
        return false;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzh zzhVar, Context context, zzj zzjVar) {
        zzaf zzafVar = zzhVar.zzd;
        int size = zzafVar.size();
        int i10 = 0;
        while (i10 < size) {
            int iZza = ((zzk) zzafVar.get(i10)).zza(context, zzjVar, zzhVar.zzb) - 1;
            i10++;
            if (iZza == 1) {
                return 2;
            }
        }
        return 3;
    }
}
