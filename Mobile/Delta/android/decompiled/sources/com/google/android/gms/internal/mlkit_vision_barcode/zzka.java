package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzka implements e {
    static final zzka zza = new zzka();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;

    static {
        d.b bVarA = d.a("maxMs");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("minMs");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("avgMs");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("firstQuartileMs");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarA4.b(zzfaVar4.zzb()).a();
        d.b bVarA5 = d.a("medianMs");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarA5.b(zzfaVar5.zzb()).a();
        d.b bVarA6 = d.a("thirdQuartileMs");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarA6.b(zzfaVar6.zzb()).a();
    }

    private zzka() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzqd zzqdVar = (zzqd) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzqdVar.zzc());
        fVar2.add(zzc, zzqdVar.zze());
        fVar2.add(zzd, zzqdVar.zza());
        fVar2.add(zze, zzqdVar.zzb());
        fVar2.add(zzf, zzqdVar.zzd());
        fVar2.add(zzg, zzqdVar.zzf());
    }
}
