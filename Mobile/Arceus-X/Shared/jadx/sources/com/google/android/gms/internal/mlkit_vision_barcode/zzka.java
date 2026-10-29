package com.google.android.gms.internal.mlkit_vision_barcode;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzka implements InterfaceC10869e {
    static final zzka zza = new zzka();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("maxMs");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarM41320a.m41325b(zzfaVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("minMs");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzfaVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("avgMs");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzfaVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("firstQuartileMs");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzfaVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("medianMs");
        zzfa zzfaVar5 = new zzfa();
        zzfaVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzfaVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("thirdQuartileMs");
        zzfa zzfaVar6 = new zzfa();
        zzfaVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzfaVar6.zzb()).m41324a();
    }

    private zzka() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzqd zzqdVar = (zzqd) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzqdVar.zzc());
        interfaceC10870f2.add(zzc, zzqdVar.zze());
        interfaceC10870f2.add(zzd, zzqdVar.zza());
        interfaceC10870f2.add(zze, zzqdVar.zzb());
        interfaceC10870f2.add(zzf, zzqdVar.zzd());
        interfaceC10870f2.add(zzg, zzqdVar.zzf());
    }
}
