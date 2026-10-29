package com.google.android.gms.internal.mlkit_vision_text_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzid implements InterfaceC10869e {
    static final zzid zza = new zzid();
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

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("durationMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarM41320a.m41325b(zzctVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("errorCode");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzctVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzctVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("autoManageModelOnBackground");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzctVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("autoManageModelOnLowMemory");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzctVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("isNnApiEnabled");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzctVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("eventsCount");
        zzct zzctVar7 = new zzct();
        zzctVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzctVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("otherErrors");
        zzct zzctVar8 = new zzct();
        zzctVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzctVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("remoteConfigValueForAcceleration");
        zzct zzctVar9 = new zzct();
        zzctVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzctVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isAccelerated");
        zzct zzctVar10 = new zzct();
        zzctVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzctVar10.zzb()).m41324a();
    }

    private zzid() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzoj zzojVar = (zzoj) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzojVar.zze());
        interfaceC10870f2.add(zzc, zzojVar.zza());
        interfaceC10870f2.add(zzd, zzojVar.zzd());
        interfaceC10870f2.add(zze, zzojVar.zzb());
        interfaceC10870f2.add(zzf, zzojVar.zzc());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, (Object) null);
        interfaceC10870f2.add(zzj, (Object) null);
        interfaceC10870f2.add(zzk, (Object) null);
    }
}
