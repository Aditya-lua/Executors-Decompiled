package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zziu implements e {
    static final zziu zza = new zziu();

    static {
        d.b bVarA = d.a("remoteModelOptions");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("localModelOptions");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("errorCodes");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("modelInitializationMs");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        bVarA4.b(zzfaVar4.zzb()).a();
    }

    private zziu() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
