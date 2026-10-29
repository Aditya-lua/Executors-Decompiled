package com.google.android.gms.internal.mlkit_common;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzfk implements InterfaceC10869e {
    static final zzfk zza = new zzfk();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarM41320a.m41325b(zzayVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("isSuccessful");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzayVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzayVar3.zzb()).m41324a();
    }

    private zzfk() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzlo zzloVar = (zzlo) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzloVar.zza());
        interfaceC10870f2.add(zzc, zzloVar.zzb());
        interfaceC10870f2.add(zzd, (Object) null);
    }
}
