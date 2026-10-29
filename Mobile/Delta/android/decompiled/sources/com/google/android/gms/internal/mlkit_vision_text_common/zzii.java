package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzii implements e {
    static final zzii zza = new zzii();

    static {
        d.b bVarA = d.a("identifyLanguageConfidenceThreshold");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        bVarA.b(zzctVar.zzb()).a();
        d.b bVarA2 = d.a("identifyAllLanguagesConfidenceThreshold");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        bVarA2.b(zzctVar2.zzb()).a();
        d.b bVarA3 = d.a("confidenceThreshold");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        bVarA3.b(zzctVar3.zzb()).a();
    }

    private zzii() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
