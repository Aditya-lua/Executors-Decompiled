package com.google.android.gms.internal.mlkit_vision_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzep implements e {
    static final zzep zza = new zzep();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        d.b bVarA = d.a("options");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("roughDownloadDurationMs");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
        d.b bVarA3 = d.a("errorCode");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = bVarA3.b(zzaeVar3.zzb()).a();
        d.b bVarA4 = d.a("exactDownloadDurationMs");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = bVarA4.b(zzaeVar4.zzb()).a();
        d.b bVarA5 = d.a("downloadStatus");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = bVarA5.b(zzaeVar5.zzb()).a();
        d.b bVarA6 = d.a("downloadFailureStatus");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = bVarA6.b(zzaeVar6.zzb()).a();
        d.b bVarA7 = d.a("mddDownloadErrorCodes");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = bVarA7.b(zzaeVar7.zzb()).a();
    }

    private zzep() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
