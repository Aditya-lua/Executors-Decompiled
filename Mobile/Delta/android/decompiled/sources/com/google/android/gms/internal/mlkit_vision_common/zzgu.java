package com.google.android.gms.internal.mlkit_vision_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgu implements e {
    static final zzgu zza = new zzgu();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("appVersion");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
        d.b bVarA3 = d.a("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = bVarA3.b(zzaeVar3.zzb()).a();
        d.b bVarA4 = d.a("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = bVarA4.b(zzaeVar4.zzb()).a();
        d.b bVarA5 = d.a("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = bVarA5.b(zzaeVar5.zzb()).a();
        d.b bVarA6 = d.a("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = bVarA6.b(zzaeVar6.zzb()).a();
        d.b bVarA7 = d.a("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = bVarA7.b(zzaeVar7.zzb()).a();
        d.b bVarA8 = d.a("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = bVarA8.b(zzaeVar8.zzb()).a();
        d.b bVarA9 = d.a("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = bVarA9.b(zzaeVar9.zzb()).a();
        d.b bVarA10 = d.a("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = bVarA10.b(zzaeVar10.zzb()).a();
        d.b bVarA11 = d.a("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = bVarA11.b(zzaeVar11.zzb()).a();
        d.b bVarA12 = d.a("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = bVarA12.b(zzaeVar12.zzb()).a();
        d.b bVarA13 = d.a("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        zzn = bVarA13.b(zzaeVar13.zzb()).a();
        d.b bVarA14 = d.a("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        zzo = bVarA14.b(zzaeVar14.zzb()).a();
    }

    private zzgu() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzla zzlaVar = (zzla) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzlaVar.zzg());
        fVar2.add(zzc, zzlaVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzlaVar.zzj());
        fVar2.add(zzf, zzlaVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzlaVar.zza());
        fVar2.add(zzj, zzlaVar.zzi());
        fVar2.add(zzk, zzlaVar.zzb());
        fVar2.add(zzl, zzlaVar.zzd());
        fVar2.add(zzm, zzlaVar.zzc());
        fVar2.add(zzn, zzlaVar.zze());
        fVar2.add(zzo, zzlaVar.zzf());
    }
}
