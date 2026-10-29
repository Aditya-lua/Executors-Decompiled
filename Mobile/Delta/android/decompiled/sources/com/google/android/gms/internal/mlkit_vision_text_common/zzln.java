package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzln implements e {
    static final zzln zza = new zzln();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b bVarA = d.a("inferenceCommonLogEvent");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarA.b(zzctVar.zzb()).a();
        d.b bVarA2 = d.a("imageInfo");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarA2.b(zzctVar2.zzb()).a();
        d.b bVarA3 = d.a("recognizerOptions");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarA3.b(zzctVar3.zzb()).a();
    }

    private zzln() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzrz zzrzVar = (zzrz) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzrzVar.zzb());
        fVar2.add(zzc, zzrzVar.zza());
        fVar2.add(zzd, zzrzVar.zzc());
    }
}
