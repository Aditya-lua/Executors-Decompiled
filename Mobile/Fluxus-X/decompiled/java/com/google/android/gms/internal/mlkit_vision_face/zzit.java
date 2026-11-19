package com.google.android.gms.internal.mlkit_vision_face;

import tf.d;
import tf.e;
import tf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzit implements e {
    static final zzit zza = new zzit();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b bVarA = d.a("sourceLanguage");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("targetLanguage");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
    }

    private zzit() {
    }

    @Override // tf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
