package com.google.android.gms.internal.mlkit_vision_common;

import rf.d;
import rf.e;
import rf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzfi implements e {
    static final zzfi zza = new zzfi();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b bVarA = d.a("isFaceMeshEnabled");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("useCase");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
    }

    private zzfi() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
