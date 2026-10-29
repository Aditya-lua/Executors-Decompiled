package com.google.android.gms.internal.mlkit_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzgq implements InterfaceC10869e {
    static final zzgq zza = new zzgq();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;
    private static final C10868d zzh;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("options");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarM41320a.m41325b(zzayVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("roughDownloadDurationMs");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzayVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("errorCode");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzayVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("exactDownloadDurationMs");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzayVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("downloadStatus");
        zzay zzayVar5 = new zzay();
        zzayVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzayVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("downloadFailureStatus");
        zzay zzayVar6 = new zzay();
        zzayVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzayVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("mddDownloadErrorCodes");
        zzay zzayVar7 = new zzay();
        zzayVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzayVar7.zzb()).m41324a();
    }

    private zzgq() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zznc zzncVar = (zznc) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzncVar.zzc());
        interfaceC10870f2.add(zzc, zzncVar.zzf());
        interfaceC10870f2.add(zzd, zzncVar.zza());
        interfaceC10870f2.add(zze, zzncVar.zze());
        interfaceC10870f2.add(zzf, zzncVar.zzb());
        interfaceC10870f2.add(zzg, zzncVar.zzd());
        interfaceC10870f2.add(zzh, (Object) null);
    }
}
