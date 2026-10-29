package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzkp implements e {
    static final zzkp zza = new zzkp();

    static {
        d.b bVarA = d.a("identifyLanguageConfidenceThreshold");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("identifyAllLanguagesConfidenceThreshold");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("confidenceThreshold");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        bVarA3.b(zzfaVar3.zzb()).a();
    }

    private zzkp() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
