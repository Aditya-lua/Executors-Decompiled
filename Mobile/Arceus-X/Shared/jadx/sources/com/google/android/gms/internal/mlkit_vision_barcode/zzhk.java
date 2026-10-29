package com.google.android.gms.internal.mlkit_vision_barcode;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzhk implements InterfaceC10869e {
    static final zzhk zza = new zzhk();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("logEventKey");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarM41320a.m41325b(zzfaVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("eventCount");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzfaVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("inferenceDurationStats");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzfaVar3.zzb()).m41324a();
    }

    private zzhk() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzfv zzfvVar = (zzfv) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzfvVar.zza());
        interfaceC10870f2.add(zzc, zzfvVar.zzc());
        interfaceC10870f2.add(zzd, zzfvVar.zzb());
    }
}
