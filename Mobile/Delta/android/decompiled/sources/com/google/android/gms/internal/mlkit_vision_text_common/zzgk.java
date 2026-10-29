package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgk implements e {
    static final zzgk zza = new zzgk();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;

    static {
        d.b bVarA = d.a("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarA.b(zzctVar.zzb()).a();
        d.b bVarA2 = d.a("hasResult");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarA2.b(zzctVar2.zzb()).a();
        d.b bVarA3 = d.a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarA3.b(zzctVar3.zzb()).a();
        d.b bVarA4 = d.a("imageInfo");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarA4.b(zzctVar4.zzb()).a();
        d.b bVarA5 = d.a("recognizerOptions");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarA5.b(zzctVar5.zzb()).a();
    }

    private zzgk() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzes zzesVar = (zzes) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzesVar.zza());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, zzesVar.zzc());
        fVar2.add(zze, (Object) null);
        fVar2.add(zzf, zzesVar.zzb());
    }
}
