package com.google.android.gms.internal.mlkit_vision_face;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgf implements e {
    static final zzgf zza = new zzgf();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b bVarA = d.a("mode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("landmark");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
        d.b bVarA3 = d.a("classification");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarA3.b(zzcqVar3.zzb()).a();
        d.b bVarA4 = d.a("prominentFaceOnly");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarA4.b(zzcqVar4.zzb()).a();
        d.b bVarA5 = d.a("tracking");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarA5.b(zzcqVar5.zzb()).a();
        d.b bVarA6 = d.a("minFaceSize");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarA6.b(zzcqVar6.zzb()).a();
    }

    private zzgf() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
