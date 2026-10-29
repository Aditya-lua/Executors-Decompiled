package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzlf implements e {
    static final zzlf zza = new zzlf();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;

    static {
        d.b bVarA = d.a("inferenceCommonLogEvent");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("options");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("detectedBarcodeFormats");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("detectedBarcodeValueTypes");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarA4.b(zzfaVar4.zzb()).a();
        d.b bVarA5 = d.a("imageInfo");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarA5.b(zzfaVar5.zzb()).a();
    }

    private zzlf() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzrr zzrrVar = (zzrr) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzrrVar.zzd());
        fVar2.add(zzc, zzrrVar.zze());
        fVar2.add(zzd, zzrrVar.zza());
        fVar2.add(zze, zzrrVar.zzb());
        fVar2.add(zzf, zzrrVar.zzc());
    }
}
