package com.google.android.gms.internal.mlkit_vision_face;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzgj implements InterfaceC10869e {
    static final zzgj zza = new zzgj();
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
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarM41320a.m41325b(zzcqVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzcqVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzcqVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("autoManageModelOnBackground");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzcqVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("autoManageModelOnLowMemory");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzcqVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("isNnApiEnabled");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzcqVar6.zzb()).m41324a();
        C10868d.b bVarM41320a7 = C10868d.m41320a("eventsCount");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = bVarM41320a7.m41325b(zzcqVar7.zzb()).m41324a();
        C10868d.b bVarM41320a8 = C10868d.m41320a("otherErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = bVarM41320a8.m41325b(zzcqVar8.zzb()).m41324a();
        C10868d.b bVarM41320a9 = C10868d.m41320a("remoteConfigValueForAcceleration");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = bVarM41320a9.m41325b(zzcqVar9.zzb()).m41324a();
        C10868d.b bVarM41320a10 = C10868d.m41320a("isAccelerated");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = bVarM41320a10.m41325b(zzcqVar10.zzb()).m41324a();
    }

    private zzgj() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzkl zzklVar = (zzkl) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzklVar.zze());
        interfaceC10870f2.add(zzc, zzklVar.zza());
        interfaceC10870f2.add(zzd, zzklVar.zzd());
        interfaceC10870f2.add(zze, zzklVar.zzb());
        interfaceC10870f2.add(zzf, zzklVar.zzc());
        interfaceC10870f2.add(zzg, (Object) null);
        interfaceC10870f2.add(zzh, (Object) null);
        interfaceC10870f2.add(zzi, (Object) null);
        interfaceC10870f2.add(zzj, (Object) null);
        interfaceC10870f2.add(zzk, (Object) null);
    }
}
