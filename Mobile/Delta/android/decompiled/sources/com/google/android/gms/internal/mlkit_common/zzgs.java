package com.google.android.gms.internal.mlkit_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgs implements e {
    static final zzgs zza = new zzgs();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        d.b bVarA = d.a("modelInfo");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("initialDownloadConditions");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("updateDownloadConditions");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarA3.b(zzayVar3.zzb()).a();
        d.b bVarA4 = d.a("isModelUpdateEnabled");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarA4.b(zzayVar4.zzb()).a();
    }

    private zzgs() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        f fVar2 = fVar;
        fVar2.add(zzb, ((zznl) obj).zza());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, (Object) null);
    }
}
