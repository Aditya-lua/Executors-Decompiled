package com.google.android.gms.internal.mlkit_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgj implements e {
    static final zzgj zza = new zzgj();

    static {
        d.b bVarA = d.a("identifyLanguageConfidenceThreshold");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("identifyAllLanguagesConfidenceThreshold");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("confidenceThreshold");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        bVarA3.b(zzayVar3.zzb()).a();
    }

    private zzgj() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
