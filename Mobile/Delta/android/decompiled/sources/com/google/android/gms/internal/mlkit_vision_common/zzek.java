package com.google.android.gms.internal.mlkit_vision_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzek implements e {
    static final zzek zza = new zzek();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b bVarA = d.a("modelType");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("isDownloaded");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
        d.b bVarA3 = d.a("modelName");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = bVarA3.b(zzaeVar3.zzb()).a();
    }

    private zzek() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
