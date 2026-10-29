package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzoe implements e {
    static final zzoe zza = new zzoe();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b bVarA = d.a("appName");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("sessionId");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("startZoomLevel");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("endZoomLevel");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarA4.b(zzfaVar4.zzb()).a();
        d.b bVarA5 = d.a("durationMs");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarA5.b(zzfaVar5.zzb()).a();
        d.b bVarA6 = d.a("predictedArea");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarA6.b(zzfaVar6.zzb()).a();
    }

    private zzoe() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzut zzutVar = (zzut) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzutVar.zze());
        fVar2.add(zzc, zzutVar.zzf());
        fVar2.add(zzd, zzutVar.zzc());
        fVar2.add(zze, zzutVar.zzb());
        fVar2.add(zzf, zzutVar.zzd());
        fVar2.add(zzg, zzutVar.zza());
    }
}
