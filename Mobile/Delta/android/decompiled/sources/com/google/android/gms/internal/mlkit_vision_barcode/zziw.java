package com.google.android.gms.internal.mlkit_vision_barcode;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zziw implements e {
    static final zziw zza = new zziw();
    private static final d zzb;

    static {
        d.b bVarA = d.a("format");
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(1);
        zzb = bVarA.b(zzfaVar.zzb()).a();
    }

    private zziw() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        fVar.add(zzb, ((zzvz) obj).zza());
    }
}
