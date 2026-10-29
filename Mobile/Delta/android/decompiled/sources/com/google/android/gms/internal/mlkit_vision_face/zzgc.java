package com.google.android.gms.internal.mlkit_vision_face;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgc implements e {
    static final zzgc zza = new zzgc();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b bVarA = d.a("maxMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("minMs");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
        d.b bVarA3 = d.a("avgMs");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarA3.b(zzcqVar3.zzb()).a();
        d.b bVarA4 = d.a("firstQuartileMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarA4.b(zzcqVar4.zzb()).a();
        d.b bVarA5 = d.a("medianMs");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarA5.b(zzcqVar5.zzb()).a();
        d.b bVarA6 = d.a("thirdQuartileMs");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarA6.b(zzcqVar6.zzb()).a();
    }

    private zzgc() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzjv zzjvVar = (zzjv) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzjvVar.zzc());
        fVar2.add(zzc, zzjvVar.zze());
        fVar2.add(zzd, zzjvVar.zza());
        fVar2.add(zze, zzjvVar.zzb());
        fVar2.add(zzf, zzjvVar.zzd());
        fVar2.add(zzg, zzjvVar.zzf());
    }
}
