package com.google.android.gms.internal.mlkit_vision_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzgu implements InterfaceC10869e {
    static final zzgu zza = new zzgu();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarM41320a.m41325b(zzaeVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("appVersion");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzaeVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzaeVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzaeVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzaeVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzaeVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzaeVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzaeVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzaeVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzaeVar10.zzb()).m41324a();
        C10868d.b bVarM41320a11 = C10868d.m41320a("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = bVarM41320a11.m41325b(zzaeVar11.zzb()).m41324a();
        C10868d.b bVarM41320a12 = C10868d.m41320a("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = bVarM41320a12.m41325b(zzaeVar12.zzb()).m41324a();
        C10868d.b bVarM41320a13 = C10868d.m41320a("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        zzn = bVarM41320a13.m41325b(zzaeVar13.zzb()).m41324a();
        C10868d.b bVarM41320a14 = C10868d.m41320a("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        zzo = bVarM41320a14.m41325b(zzaeVar14.zzb()).m41324a();
    }

    private zzgu() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzla zzlaVar = (zzla) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzlaVar.zzg());
        interfaceC10870f2.add(zzc, zzlaVar.zzh());
        interfaceC10870f2.add(zzd, (Object) null);
        interfaceC10870f2.add(zze, zzlaVar.zzj());
        interfaceC10870f2.add(zzf, zzlaVar.zzk());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, zzlaVar.zza());
        interfaceC10870f2.add(zzj, zzlaVar.zzi());
        interfaceC10870f2.add(zzk, zzlaVar.zzb());
        interfaceC10870f2.add(zzl, zzlaVar.zzd());
        interfaceC10870f2.add(zzm, zzlaVar.zzc());
        interfaceC10870f2.add(zzn, zzlaVar.zze());
        interfaceC10870f2.add(zzo, zzlaVar.zzf());
    }
}
