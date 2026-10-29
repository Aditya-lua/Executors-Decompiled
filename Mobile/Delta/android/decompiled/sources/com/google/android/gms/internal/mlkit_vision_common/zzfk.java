package com.google.android.gms.internal.mlkit_vision_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzfk implements e {
    static final zzfk zza = new zzfk();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;

    static {
        d.b bVarA = d.a("inferenceCommonLogEvent");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("imageInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
        d.b bVarA3 = d.a("captionCount");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(4);
        zzd = bVarA3.b(zzaeVar3.zzb()).a();
        d.b bVarA4 = d.a("highestScore");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(5);
        zze = bVarA4.b(zzaeVar4.zzb()).a();
        d.b bVarA5 = d.a("imageType");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(6);
        zzf = bVarA5.b(zzaeVar5.zzb()).a();
    }

    private zzfk() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
