package com.google.android.gms.internal.mlkit_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgq implements e {
    static final zzgq zza = new zzgq();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        d.b bVarA = d.a("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarA3.b(zzayVar3.zzb()).a();
        d.b bVarA4 = d.a("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarA4.b(zzayVar4.zzb()).a();
        d.b bVarA5 = d.a("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = bVarA5.b(zzayVar5.zzb()).a();
        d.b bVarA6 = d.a("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = bVarA6.b(zzayVar6.zzb()).a();
        d.b bVarA7 = d.a("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = bVarA7.b(zzayVar7.zzb()).a();
    }

    private zzgq() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zznc zzncVar = (zznc) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzncVar.zzc());
        fVar2.add(zzc, zzncVar.zzf());
        fVar2.add(zzd, zzncVar.zza());
        fVar2.add(zze, zzncVar.zze());
        fVar2.add(zzf, zzncVar.zzb());
        fVar2.add(zzg, zzncVar.zzd());
        fVar2.add(zzh, (Object) null);
    }
}
