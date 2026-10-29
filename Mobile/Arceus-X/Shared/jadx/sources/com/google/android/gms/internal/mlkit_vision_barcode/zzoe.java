package com.google.android.gms.internal.mlkit_vision_barcode;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzoe implements InterfaceC10869e {
    static final zzoe zza = new zzoe();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("appName");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarM41320a.m41325b(zzfaVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("sessionId");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzfaVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("startZoomLevel");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzfaVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("endZoomLevel");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzfaVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("durationMs");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzfaVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("predictedArea");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzfaVar6.zzb()).m41324a();
    }

    private zzoe() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzut zzutVar = (zzut) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzutVar.zze());
        interfaceC10870f2.add(zzc, zzutVar.zzf());
        interfaceC10870f2.add(zzd, zzutVar.zzc());
        interfaceC10870f2.add(zze, zzutVar.zzb());
        interfaceC10870f2.add(zzf, zzutVar.zzd());
        interfaceC10870f2.add(zzg, zzutVar.zza());
    }
}
