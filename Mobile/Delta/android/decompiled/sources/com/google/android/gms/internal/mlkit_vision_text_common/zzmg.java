package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzmg implements e {
    static final zzmg zza = new zzmg();
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
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarA.b(zzctVar.zzb()).a();
        d.b bVarA2 = d.a("appVersion");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarA2.b(zzctVar2.zzb()).a();
        d.b bVarA3 = d.a("firebaseProjectId");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarA3.b(zzctVar3.zzb()).a();
        d.b bVarA4 = d.a("mlSdkVersion");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarA4.b(zzctVar4.zzb()).a();
        d.b bVarA5 = d.a("tfliteSchemaVersion");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarA5.b(zzctVar5.zzb()).a();
        d.b bVarA6 = d.a("gcmSenderId");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = bVarA6.b(zzctVar6.zzb()).a();
        d.b bVarA7 = d.a("apiKey");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = bVarA7.b(zzctVar7.zzb()).a();
        d.b bVarA8 = d.a("languages");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = bVarA8.b(zzctVar8.zzb()).a();
        d.b bVarA9 = d.a("mlSdkInstanceId");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = bVarA9.b(zzctVar9.zzb()).a();
        d.b bVarA10 = d.a("isClearcutClient");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = bVarA10.b(zzctVar10.zzb()).a();
        d.b bVarA11 = d.a("isStandaloneMlkit");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        zzl = bVarA11.b(zzctVar11.zzb()).a();
        d.b bVarA12 = d.a("isJsonLogging");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        zzm = bVarA12.b(zzctVar12.zzb()).a();
        d.b bVarA13 = d.a("buildLevel");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        zzn = bVarA13.b(zzctVar13.zzb()).a();
        d.b bVarA14 = d.a("optionalModuleVersion");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        zzo = bVarA14.b(zzctVar14.zzb()).a();
    }

    private zzmg() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzst zzstVar = (zzst) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzstVar.zzg());
        fVar2.add(zzc, zzstVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzstVar.zzj());
        fVar2.add(zzf, zzstVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzstVar.zza());
        fVar2.add(zzj, zzstVar.zzi());
        fVar2.add(zzk, zzstVar.zzb());
        fVar2.add(zzl, zzstVar.zzd());
        fVar2.add(zzm, zzstVar.zzc());
        fVar2.add(zzn, zzstVar.zze());
        fVar2.add(zzo, zzstVar.zzf());
    }
}
