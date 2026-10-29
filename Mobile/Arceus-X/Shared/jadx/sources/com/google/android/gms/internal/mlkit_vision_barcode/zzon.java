package com.google.android.gms.internal.mlkit_vision_barcode;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzon implements InterfaceC10869e {
    static final zzon zza = new zzon();
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
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarM41320a.m41325b(zzfaVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("appVersion");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzfaVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("firebaseProjectId");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzfaVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("mlSdkVersion");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzfaVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("tfliteSchemaVersion");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzfaVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("gcmSenderId");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzfaVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("apiKey");
        zzfa zzfaVar7 = new zzfa();
        zzfaVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzfaVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("languages");
        zzfa zzfaVar8 = new zzfa();
        zzfaVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzfaVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("mlSdkInstanceId");
        zzfa zzfaVar9 = new zzfa();
        zzfaVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzfaVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isClearcutClient");
        zzfa zzfaVar10 = new zzfa();
        zzfaVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzfaVar10.zzb()).m41324a();
        C10868d.b bVarM41320a11 = C10868d.m41320a("isStandaloneMlkit");
        zzfa zzfaVar11 = new zzfa();
        zzfaVar11.zza(11);
        zzl = bVarM41320a11.m41325b(zzfaVar11.zzb()).m41324a();
        C10868d.b bVarM41320a12 = C10868d.m41320a("isJsonLogging");
        zzfa zzfaVar12 = new zzfa();
        zzfaVar12.zza(12);
        zzm = bVarM41320a12.m41325b(zzfaVar12.zzb()).m41324a();
        C10868d.b bVarM41320a13 = C10868d.m41320a("buildLevel");
        zzfa zzfaVar13 = new zzfa();
        zzfaVar13.zza(13);
        zzn = bVarM41320a13.m41325b(zzfaVar13.zzb()).m41324a();
        C10868d.b bVarM41320a14 = C10868d.m41320a("optionalModuleVersion");
        zzfa zzfaVar14 = new zzfa();
        zzfaVar14.zza(14);
        zzo = bVarM41320a14.m41325b(zzfaVar14.zzb()).m41324a();
    }

    private zzon() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzvd zzvdVar = (zzvd) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzvdVar.zzg());
        interfaceC10870f2.add(zzc, zzvdVar.zzh());
        interfaceC10870f2.add(zzd, (Object) null);
        interfaceC10870f2.add(zze, zzvdVar.zzj());
        interfaceC10870f2.add(zzf, zzvdVar.zzk());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, zzvdVar.zza());
        interfaceC10870f2.add(zzj, zzvdVar.zzi());
        interfaceC10870f2.add(zzk, zzvdVar.zzb());
        interfaceC10870f2.add(zzl, zzvdVar.zzd());
        interfaceC10870f2.add(zzm, zzvdVar.zzc());
        interfaceC10870f2.add(zzn, zzvdVar.zze());
        interfaceC10870f2.add(zzo, zzvdVar.zzf());
    }
}
