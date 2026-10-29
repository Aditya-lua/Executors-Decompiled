package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzon implements e {
    static final zzon zza = new zzon();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;
    private static final d zzk;
    private static final d zzl;
    private static final d zzm;
    private static final d zzn;
    private static final d zzo;

    static {
        d.b bVarA = d.a("appId");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
        d.b bVarA2 = d.a("appVersion");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarA2.b(zzfaVar2.zzb()).a();
        d.b bVarA3 = d.a("firebaseProjectId");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarA3.b(zzfaVar3.zzb()).a();
        d.b bVarA4 = d.a("mlSdkVersion");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarA4.b(zzfaVar4.zzb()).a();
        d.b bVarA5 = d.a("tfliteSchemaVersion");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarA5.b(zzfaVar5.zzb()).a();
        d.b bVarA6 = d.a("gcmSenderId");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarA6.b(zzfaVar6.zzb()).a();
        d.b bVarA7 = d.a("apiKey");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = bVarA7.b(zzfaVar7.zzb()).a();
        d.b bVarA8 = d.a("languages");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = bVarA8.b(zzfaVar8.zzb()).a();
        d.b bVarA9 = d.a("mlSdkInstanceId");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = bVarA9.b(zzfaVar9.zzb()).a();
        d.b bVarA10 = d.a("isClearcutClient");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = bVarA10.b(zzfaVar10.zzb()).a();
        d.b bVarA11 = d.a("isStandaloneMlkit");
        zzfa zzfaVar11 = new zzfa();
        zzfaVar11.zza(11);
        zzl = bVarA11.b(zzfaVar11.zzb()).a();
        d.b bVarA12 = d.a("isJsonLogging");
        zzfa zzfaVar12 = new zzfa();
        zzfaVar12.zza(12);
        zzm = bVarA12.b(zzfaVar12.zzb()).a();
        d.b bVarA13 = d.a("buildLevel");
        zzfa zzfaVar13 = new zzfa();
        zzfaVar13.zza(13);
        zzn = bVarA13.b(zzfaVar13.zzb()).a();
        d.b bVarA14 = d.a("optionalModuleVersion");
        zzfa zzfaVar14 = new zzfa();
        zzfaVar14.zza(14);
        zzo = bVarA14.b(zzfaVar14.zzb()).a();
    }

    private zzon() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzvd zzvdVar = (zzvd) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzvdVar.zzg());
        fVar2.add(zzc, zzvdVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzvdVar.zzj());
        fVar2.add(zzf, zzvdVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzvdVar.zza());
        fVar2.add(zzj, zzvdVar.zzi());
        fVar2.add(zzk, zzvdVar.zzb());
        fVar2.add(zzl, zzvdVar.zzd());
        fVar2.add(zzm, zzvdVar.zzc());
        fVar2.add(zzn, zzvdVar.zze());
        fVar2.add(zzo, zzvdVar.zzf());
    }
}
