package com.google.android.gms.internal.mlkit_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzkh implements e {
    static final zzkh zza = new zzkh();
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
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("appVersion");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("firebaseProjectId");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarA3.b(zzayVar3.zzb()).a();
        d.b bVarA4 = d.a("mlSdkVersion");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarA4.b(zzayVar4.zzb()).a();
        d.b bVarA5 = d.a("tfliteSchemaVersion");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = bVarA5.b(zzayVar5.zzb()).a();
        d.b bVarA6 = d.a("gcmSenderId");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = bVarA6.b(zzayVar6.zzb()).a();
        d.b bVarA7 = d.a("apiKey");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = bVarA7.b(zzayVar7.zzb()).a();
        d.b bVarA8 = d.a("languages");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = bVarA8.b(zzayVar8.zzb()).a();
        d.b bVarA9 = d.a("mlSdkInstanceId");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = bVarA9.b(zzayVar9.zzb()).a();
        d.b bVarA10 = d.a("isClearcutClient");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        zzk = bVarA10.b(zzayVar10.zzb()).a();
        d.b bVarA11 = d.a("isStandaloneMlkit");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        zzl = bVarA11.b(zzayVar11.zzb()).a();
        d.b bVarA12 = d.a("isJsonLogging");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        zzm = bVarA12.b(zzayVar12.zzb()).a();
        d.b bVarA13 = d.a("buildLevel");
        zzay zzayVar13 = new zzay();
        zzayVar13.zza(13);
        zzn = bVarA13.b(zzayVar13.zzb()).a();
        d.b bVarA14 = d.a("optionalModuleVersion");
        zzay zzayVar14 = new zzay();
        zzayVar14.zza(14);
        zzo = bVarA14.b(zzayVar14.zzb()).a();
    }

    private zzkh() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzqv zzqvVar = (zzqv) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzqvVar.zzg());
        fVar2.add(zzc, zzqvVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzqvVar.zzj());
        fVar2.add(zzf, zzqvVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzqvVar.zza());
        fVar2.add(zzj, zzqvVar.zzi());
        fVar2.add(zzk, zzqvVar.zzb());
        fVar2.add(zzl, zzqvVar.zzd());
        fVar2.add(zzm, zzqvVar.zzc());
        fVar2.add(zzn, zzqvVar.zze());
        fVar2.add(zzo, zzqvVar.zzf());
    }
}
