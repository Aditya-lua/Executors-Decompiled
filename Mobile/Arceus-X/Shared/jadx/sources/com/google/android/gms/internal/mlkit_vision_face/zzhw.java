package com.google.android.gms.internal.mlkit_vision_face;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzhw implements InterfaceC10869e {
    static final zzhw zza = new zzhw();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarM41320a.m41325b(zzcqVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("streamModeSmoothingRatio");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzcqVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("rawSizeMaskEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzcqVar3.zzb()).m41324a();
    }

    private zzhw() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        throw null;
    }
}
