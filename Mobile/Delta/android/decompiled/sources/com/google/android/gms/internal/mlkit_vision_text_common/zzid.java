package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzid implements e {
    static final zzid zza = new zzid();
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
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarA.b(zzctVar.zzb()).a();
        d.b bVarA2 = d.a("errorCode");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarA2.b(zzctVar2.zzb()).a();
        d.b bVarA3 = d.a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarA3.b(zzctVar3.zzb()).a();
        d.b bVarA4 = d.a("autoManageModelOnBackground");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarA4.b(zzctVar4.zzb()).a();
        d.b bVarA5 = d.a("autoManageModelOnLowMemory");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarA5.b(zzctVar5.zzb()).a();
        d.b bVarA6 = d.a("isNnApiEnabled");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = bVarA6.b(zzctVar6.zzb()).a();
        d.b bVarA7 = d.a("eventsCount");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = bVarA7.b(zzctVar7.zzb()).a();
        d.b bVarA8 = d.a("otherErrors");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = bVarA8.b(zzctVar8.zzb()).a();
        d.b bVarA9 = d.a("remoteConfigValueForAcceleration");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = bVarA9.b(zzctVar9.zzb()).a();
        d.b bVarA10 = d.a("isAccelerated");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = bVarA10.b(zzctVar10.zzb()).a();
    }

    private zzid() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzoj zzojVar = (zzoj) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzojVar.zze());
        fVar2.add(zzc, zzojVar.zza());
        fVar2.add(zzd, zzojVar.zzd());
        fVar2.add(zze, zzojVar.zzb());
        fVar2.add(zzf, zzojVar.zzc());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, (Object) null);
        fVar2.add(zzj, (Object) null);
        fVar2.add(zzk, (Object) null);
    }
}
