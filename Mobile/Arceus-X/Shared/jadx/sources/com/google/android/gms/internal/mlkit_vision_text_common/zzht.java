package com.google.android.gms.internal.mlkit_vision_text_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzht implements InterfaceC10869e {
    static final zzht zza = new zzht();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("maxMs");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarM41320a.m41325b(zzctVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("minMs");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzctVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("avgMs");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzctVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("firstQuartileMs");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzctVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("medianMs");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzctVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("thirdQuartileMs");
        zzct zzctVar6 = new zzct();
        zzctVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzctVar6.zzb()).m41324a();
    }

    private zzht() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zznw zznwVar = (zznw) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zznwVar.zzc());
        interfaceC10870f2.add(zzc, zznwVar.zze());
        interfaceC10870f2.add(zzd, zznwVar.zza());
        interfaceC10870f2.add(zze, zznwVar.zzb());
        interfaceC10870f2.add(zzf, zznwVar.zzd());
        interfaceC10870f2.add(zzg, zznwVar.zzf());
    }
}
