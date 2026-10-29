package com.google.android.gms.internal.mlkit_vision_barcode;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zzkg implements InterfaceC10869e {
    static final zzkg zza = new zzkg();
    private static final C10868d zzb;
    private static final C10868d zzc;
    private static final C10868d zzd;
    private static final C10868d zze;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("imageFormat");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarM41320a.m41325b(zzfaVar.zzb()).m41324a();
        C10868d.b bVarM41320a2 = C10868d.m41320a("originalImageSize");
        zzfa zzfaVar2 = new zzfa();
        zzfaVar2.zza(2);
        zzc = bVarM41320a2.m41325b(zzfaVar2.zzb()).m41324a();
        C10868d.b bVarM41320a3 = C10868d.m41320a("compressedImageSize");
        zzfa zzfaVar3 = new zzfa();
        zzfaVar3.zza(3);
        zzd = bVarM41320a3.m41325b(zzfaVar3.zzb()).m41324a();
        C10868d.b bVarM41320a4 = C10868d.m41320a("isOdmlImage");
        zzfa zzfaVar4 = new zzfa();
        zzfaVar4.zza(4);
        zze = bVarM41320a4.m41325b(zzfaVar4.zzb()).m41324a();
    }

    private zzkg() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        zzqk zzqkVar = (zzqk) obj;
        InterfaceC10870f interfaceC10870f2 = interfaceC10870f;
        interfaceC10870f2.add(zzb, zzqkVar.zza());
        interfaceC10870f2.add(zzc, zzqkVar.zzb());
        interfaceC10870f2.add(zzd, (Object) null);
        interfaceC10870f2.add(zze, (Object) null);
    }
}
