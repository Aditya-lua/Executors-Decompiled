package com.google.android.gms.internal.mlkit_vision_text_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzmg implements InterfaceC10869e {
    static final zzmg zza = new zzmg();
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
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarM41320a.m41325b(zzctVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("appVersion");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzctVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("firebaseProjectId");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzctVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("mlSdkVersion");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzctVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("tfliteSchemaVersion");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzctVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("gcmSenderId");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzctVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("apiKey");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzctVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("languages");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzctVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("mlSdkInstanceId");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzctVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isClearcutClient");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzctVar10.zzb()).m41324a();
        C10868d.b bVarM41320a11 = C10868d.m41320a("isStandaloneMlkit");
        zzct zzctVar11 = new zzct();
        zzctVar11.zza(11);
        zzl = bVarM41320a11.m41325b(zzctVar11.zzb()).m41324a();
        C10868d.b bVarM41320a12 = C10868d.m41320a("isJsonLogging");
        zzct zzctVar12 = new zzct();
        zzctVar12.zza(12);
        zzm = bVarM41320a12.m41325b(zzctVar12.zzb()).m41324a();
        C10868d.b bVarM41320a13 = C10868d.m41320a("buildLevel");
        zzct zzctVar13 = new zzct();
        zzctVar13.zza(13);
        zzn = bVarM41320a13.m41325b(zzctVar13.zzb()).m41324a();
        C10868d.b bVarM41320a14 = C10868d.m41320a("optionalModuleVersion");
        zzct zzctVar14 = new zzct();
        zzctVar14.zza(14);
        zzo = bVarM41320a14.m41325b(zzctVar14.zzb()).m41324a();
    }

    private zzmg() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzst zzstVar = (zzst) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzstVar.zzg());
        interfaceC10870f2.add(zzc, zzstVar.zzh());
        interfaceC10870f2.add(zzd, (Object) null);
        interfaceC10870f2.add(zze, zzstVar.zzj());
        interfaceC10870f2.add(zzf, zzstVar.zzk());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, zzstVar.zza());
        interfaceC10870f2.add(zzj, zzstVar.zzi());
        interfaceC10870f2.add(zzk, zzstVar.zzb());
        interfaceC10870f2.add(zzl, zzstVar.zzd());
        interfaceC10870f2.add(zzm, zzstVar.zzc());
        interfaceC10870f2.add(zzn, zzstVar.zze());
        interfaceC10870f2.add(zzo, zzstVar.zzf());
    }
}
