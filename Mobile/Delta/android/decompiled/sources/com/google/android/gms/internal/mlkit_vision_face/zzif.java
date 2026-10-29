package com.google.android.gms.internal.mlkit_vision_face;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzif implements e {
    static final zzif zza = new zzif();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b bVarA = d.a("languageOption");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(3);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("isUsingLegacyApi");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(4);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
        d.b bVarA3 = d.a("sdkVersion");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(5);
        zzd = bVarA3.b(zzcqVar3.zzb()).a();
    }

    private zzif() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
