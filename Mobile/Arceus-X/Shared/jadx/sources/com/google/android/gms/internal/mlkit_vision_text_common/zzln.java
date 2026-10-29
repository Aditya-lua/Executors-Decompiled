package com.google.android.gms.internal.mlkit_vision_text_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzln implements InterfaceC10869e {
    static final zzln zza = new zzln();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("inferenceCommonLogEvent");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarM41320a.m41325b(zzctVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("imageInfo");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzctVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("recognizerOptions");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzctVar3.zzb()).m41324a();
    }

    private zzln() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzrz zzrzVar = (zzrz) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzrzVar.zzb());
        interfaceC10870f2.add(zzc, zzrzVar.zza());
        interfaceC10870f2.add(zzd, zzrzVar.zzc());
    }
}
