package com.google.android.gms.internal.mlkit_vision_face;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzhq implements InterfaceC10869e {
    static final zzhq zza = new zzhq();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;
    private static final C10868d zzf;
    private static final C10868d zzg;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarM41320a.m41325b(zzcqVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("multipleObjectsEnabled");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzcqVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("classificationEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzcqVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("maxPerObjectLabelCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzcqVar4.zzb()).m41324a();
        C10868d.b bVarM41320a5 = C10868d.m41320a("classificationConfidenceThreshold");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = bVarM41320a5.m41325b(zzcqVar5.zzb()).m41324a();
        C10868d.b bVarM41320a6 = C10868d.m41320a("customLocalModelOptions");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = bVarM41320a6.m41325b(zzcqVar6.zzb()).m41324a();
    }

    private zzhq() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        throw null;
    }
}
