package com.google.android.gms.internal.mlkit_vision_barcode;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;

/* JADX INFO: loaded from: classes.dex */
final class zziw implements InterfaceC10869e {
    static final zziw zza = new zziw();
    private static final C10868d zzb;

    static {
        C10868d.b bVarM41320a = C10868d.m41320a("format");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarM41320a.m41325b(zzfaVar.zzb()).m41324a();
    }

    private zziw() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // p410rf.InterfaceC10866b
    public final /* bridge */ /* synthetic */ void encode(Object obj, InterfaceC10870f interfaceC10870f) {
        interfaceC10870f.add(zzb, ((zzvz) obj).zza());
    }
}
