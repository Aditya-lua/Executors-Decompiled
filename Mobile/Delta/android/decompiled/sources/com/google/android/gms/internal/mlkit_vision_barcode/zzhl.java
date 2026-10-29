package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzhl implements e {
    static final zzhl zza = new zzhl();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;

    static {
        d.b bVarA = d.a("errorCode");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("hasResult");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("isColdCall");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("imageInfo");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarA4.b(zzfaVar4.zzb()).a();
        d.b bVarA5 = d.a("options");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarA5.b(zzfaVar5.zzb()).a();
        d.b bVarA6 = d.a("detectedBarcodeFormats");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarA6.b(zzfaVar6.zzb()).a();
        d.b bVarA7 = d.a("detectedBarcodeValueTypes");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = bVarA7.b(zzfaVar7.zzb()).a();
    }

    private zzhl() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzft zzftVar = (zzft) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzftVar.zzc());
        fVar2.add(zzc, (Object) null);
        fVar2.add(zzd, zzftVar.zze());
        fVar2.add(zze, (Object) null);
        fVar2.add(zzf, zzftVar.zzd());
        fVar2.add(zzg, zzftVar.zza());
        fVar2.add(zzh, zzftVar.zzb());
    }
}
