package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzht implements e {
    static final zzht zza = new zzht();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b bVarA = d.a("maxMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarA.b(zzctVar.zzb()).a();
        d.b bVarA2 = d.a("minMs");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarA2.b(zzctVar2.zzb()).a();
        d.b bVarA3 = d.a("avgMs");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarA3.b(zzctVar3.zzb()).a();
        d.b bVarA4 = d.a("firstQuartileMs");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarA4.b(zzctVar4.zzb()).a();
        d.b bVarA5 = d.a("medianMs");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarA5.b(zzctVar5.zzb()).a();
        d.b bVarA6 = d.a("thirdQuartileMs");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = bVarA6.b(zzctVar6.zzb()).a();
    }

    private zzht() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zznw zznwVar = (zznw) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zznwVar.zzc());
        fVar2.add(zzc, zznwVar.zze());
        fVar2.add(zzd, zznwVar.zza());
        fVar2.add(zze, zznwVar.zzb());
        fVar2.add(zzf, zznwVar.zzd());
        fVar2.add(zzg, zznwVar.zzf());
    }
}
