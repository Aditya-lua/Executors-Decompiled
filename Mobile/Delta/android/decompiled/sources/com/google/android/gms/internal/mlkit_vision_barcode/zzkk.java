package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzkk implements e {
    static final zzkk zza = new zzkk();
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
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("errorCode");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("isColdCall");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("autoManageModelOnBackground");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarA4.b(zzfaVar4.zzb()).a();
        d.b bVarA5 = d.a("autoManageModelOnLowMemory");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarA5.b(zzfaVar5.zzb()).a();
        d.b bVarA6 = d.a("isNnApiEnabled");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarA6.b(zzfaVar6.zzb()).a();
        d.b bVarA7 = d.a("eventsCount");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = bVarA7.b(zzfaVar7.zzb()).a();
        d.b bVarA8 = d.a("otherErrors");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = bVarA8.b(zzfaVar8.zzb()).a();
        d.b bVarA9 = d.a("remoteConfigValueForAcceleration");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = bVarA9.b(zzfaVar9.zzb()).a();
        d.b bVarA10 = d.a("isAccelerated");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = bVarA10.b(zzfaVar10.zzb()).a();
    }

    private zzkk() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzqq zzqqVar = (zzqq) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzqqVar.zze());
        fVar2.add(zzc, zzqqVar.zza());
        fVar2.add(zzd, zzqqVar.zzd());
        fVar2.add(zze, zzqqVar.zzb());
        fVar2.add(zzf, zzqqVar.zzc());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, (Object) null);
        fVar2.add(zzj, (Object) null);
        fVar2.add(zzk, (Object) null);
    }
}
