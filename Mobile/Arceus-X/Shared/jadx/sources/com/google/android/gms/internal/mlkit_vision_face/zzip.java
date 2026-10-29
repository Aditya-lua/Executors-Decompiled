package com.google.android.gms.internal.mlkit_vision_face;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzip implements InterfaceC10869e {
    static final zzip zza = new zzip();
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
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarM41320a.m41325b(zzcqVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("appVersion");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzcqVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzcqVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzcqVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzcqVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzcqVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzcqVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzcqVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzcqVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzcqVar10.zzb()).m41324a();
        C10868d.b bVarM41320a11 = C10868d.m41320a("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = bVarM41320a11.m41325b(zzcqVar11.zzb()).m41324a();
        C10868d.b bVarM41320a12 = C10868d.m41320a("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = bVarM41320a12.m41325b(zzcqVar12.zzb()).m41324a();
        C10868d.b bVarM41320a13 = C10868d.m41320a("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        zzn = bVarM41320a13.m41325b(zzcqVar13.zzb()).m41324a();
        C10868d.b bVarM41320a14 = C10868d.m41320a("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        zzo = bVarM41320a14.m41325b(zzcqVar14.zzb()).m41324a();
    }

    private zzip() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzmv zzmvVar = (zzmv) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzmvVar.zzg());
        interfaceC10870f2.add(zzc, zzmvVar.zzh());
        interfaceC10870f2.add(zzd, (Object) null);
        interfaceC10870f2.add(zze, zzmvVar.zzj());
        interfaceC10870f2.add(zzf, zzmvVar.zzk());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, zzmvVar.zza());
        interfaceC10870f2.add(zzj, zzmvVar.zzi());
        interfaceC10870f2.add(zzk, zzmvVar.zzb());
        interfaceC10870f2.add(zzl, zzmvVar.zzd());
        interfaceC10870f2.add(zzm, zzmvVar.zzc());
        interfaceC10870f2.add(zzn, zzmvVar.zze());
        interfaceC10870f2.add(zzo, zzmvVar.zzf());
    }
}
