package com.google.android.gms.internal.mlkit_vision_text_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzgk implements InterfaceC10869e {
    static final zzgk zza = new zzgk();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarM41320a.m41325b(zzctVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("hasResult");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzctVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("isColdCall");
        zzct zzctVar3 = new zzct();
        zzctVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzctVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("imageInfo");
        zzct zzctVar4 = new zzct();
        zzctVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzctVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("recognizerOptions");
        zzct zzctVar5 = new zzct();
        zzctVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzctVar5.zzb()).m41324a();
    }

    private zzgk() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzes zzesVar = (zzes) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzesVar.zza());
        interfaceC10870f2.add(zzc, (Object) null);
        interfaceC10870f2.add(zzd, zzesVar.zzc());
        interfaceC10870f2.add(zze, (Object) null);
        interfaceC10870f2.add(zzf, zzesVar.zzb());
    }
}
