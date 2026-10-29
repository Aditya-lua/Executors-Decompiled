package com.google.android.gms.internal.mlkit_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzkh implements InterfaceC10869e {
    static final zzkh zza = new zzkh();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;
    private static final C10868d zzh;
    private static final C10868d zzi;
    private static final C10868d zzj;
    private static final C10868d zzk;
    private static final C10868d zzl;
    private static final C10868d zzm;
    private static final C10868d zzn;
    private static final C10868d zzo;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("appId");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarM41320a.m41325b(zzayVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("appVersion");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzayVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("firebaseProjectId");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzayVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("mlSdkVersion");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzayVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("tfliteSchemaVersion");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzayVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("gcmSenderId");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzayVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("apiKey");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzayVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("languages");
        zzay zzayVar8 = new zzay();
        zzayVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzayVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("mlSdkInstanceId");
        zzay zzayVar9 = new zzay();
        zzayVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzayVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isClearcutClient");
        zzay zzayVar10 = new zzay();
        zzayVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzayVar10.zzb()).m41324a();
        C10868d.b bVarM41320a11 = C10868d.m41320a("isStandaloneMlkit");
        zzay zzayVar11 = new zzay();
        zzayVar11.zza(11);
        zzl = bVarM41320a11.m41325b(zzayVar11.zzb()).m41324a();
        C10868d.b bVarM41320a12 = C10868d.m41320a("isJsonLogging");
        zzay zzayVar12 = new zzay();
        zzayVar12.zza(12);
        zzm = bVarM41320a12.m41325b(zzayVar12.zzb()).m41324a();
        C10868d.b bVarM41320a13 = C10868d.m41320a("buildLevel");
        zzay zzayVar13 = new zzay();
        zzayVar13.zza(13);
        zzn = bVarM41320a13.m41325b(zzayVar13.zzb()).m41324a();
        C10868d.b bVarM41320a14 = C10868d.m41320a("optionalModuleVersion");
        zzay zzayVar14 = new zzay();
        zzayVar14.zza(14);
        zzo = bVarM41320a14.m41325b(zzayVar14.zzb()).m41324a();
    }

    private zzkh() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzqv zzqvVar = (zzqv) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzqvVar.zzg());
        interfaceC10870f2.add(zzc, zzqvVar.zzh());
        interfaceC10870f2.add(zzd, (Object) null);
        interfaceC10870f2.add(zze, zzqvVar.zzj());
        interfaceC10870f2.add(zzf, zzqvVar.zzk());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, zzqvVar.zza());
        interfaceC10870f2.add(zzj, zzqvVar.zzi());
        interfaceC10870f2.add(zzk, zzqvVar.zzb());
        interfaceC10870f2.add(zzl, zzqvVar.zzd());
        interfaceC10870f2.add(zzm, zzqvVar.zzc());
        interfaceC10870f2.add(zzn, zzqvVar.zze());
        interfaceC10870f2.add(zzo, zzqvVar.zzf());
    }
}
