package com.google.android.gms.internal.mlkit_vision_face;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgj implements e {
    static final zzgj zza = new zzgj();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;
    private static final d zzk;

    static {
        d.b bVarA = d.a("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
        d.b bVarA3 = d.a("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarA3.b(zzcqVar3.zzb()).a();
        d.b bVarA4 = d.a("autoManageModelOnBackground");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarA4.b(zzcqVar4.zzb()).a();
        d.b bVarA5 = d.a("autoManageModelOnLowMemory");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarA5.b(zzcqVar5.zzb()).a();
        d.b bVarA6 = d.a("isNnApiEnabled");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarA6.b(zzcqVar6.zzb()).a();
        d.b bVarA7 = d.a("eventsCount");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = bVarA7.b(zzcqVar7.zzb()).a();
        d.b bVarA8 = d.a("otherErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = bVarA8.b(zzcqVar8.zzb()).a();
        d.b bVarA9 = d.a("remoteConfigValueForAcceleration");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = bVarA9.b(zzcqVar9.zzb()).a();
        d.b bVarA10 = d.a("isAccelerated");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = bVarA10.b(zzcqVar10.zzb()).a();
    }

    private zzgj() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzkl zzklVar = (zzkl) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzklVar.zze());
        fVar2.add(zzc, zzklVar.zza());
        fVar2.add(zzd, zzklVar.zzd());
        fVar2.add(zze, zzklVar.zzb());
        fVar2.add(zzf, zzklVar.zzc());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, (Object) null);
        fVar2.add(zzj, (Object) null);
        fVar2.add(zzk, (Object) null);
    }
}
