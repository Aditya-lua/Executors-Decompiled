package com.google.android.gms.internal.mlkit_vision_face;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzip implements e {
    static final zzip zza = new zzip();
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
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("appVersion");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
        d.b bVarA3 = d.a("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarA3.b(zzcqVar3.zzb()).a();
        d.b bVarA4 = d.a("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarA4.b(zzcqVar4.zzb()).a();
        d.b bVarA5 = d.a("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarA5.b(zzcqVar5.zzb()).a();
        d.b bVarA6 = d.a("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarA6.b(zzcqVar6.zzb()).a();
        d.b bVarA7 = d.a("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = bVarA7.b(zzcqVar7.zzb()).a();
        d.b bVarA8 = d.a("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = bVarA8.b(zzcqVar8.zzb()).a();
        d.b bVarA9 = d.a("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = bVarA9.b(zzcqVar9.zzb()).a();
        d.b bVarA10 = d.a("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = bVarA10.b(zzcqVar10.zzb()).a();
        d.b bVarA11 = d.a("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = bVarA11.b(zzcqVar11.zzb()).a();
        d.b bVarA12 = d.a("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = bVarA12.b(zzcqVar12.zzb()).a();
        d.b bVarA13 = d.a("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        zzn = bVarA13.b(zzcqVar13.zzb()).a();
        d.b bVarA14 = d.a("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        zzo = bVarA14.b(zzcqVar14.zzb()).a();
    }

    private zzip() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzmv zzmvVar = (zzmv) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzmvVar.zzg());
        fVar2.add(zzc, zzmvVar.zzh());
        fVar2.add(zzd, (Object) null);
        fVar2.add(zze, zzmvVar.zzj());
        fVar2.add(zzf, zzmvVar.zzk());
        fVar2.add(zzg, (Object) null);
        fVar2.add(zzh, (Object) null);
        fVar2.add(zzi, zzmvVar.zza());
        fVar2.add(zzj, zzmvVar.zzi());
        fVar2.add(zzk, zzmvVar.zzb());
        fVar2.add(zzl, zzmvVar.zzd());
        fVar2.add(zzm, zzmvVar.zzc());
        fVar2.add(zzn, zzmvVar.zze());
        fVar2.add(zzo, zzmvVar.zzf());
    }
}
