package com.google.android.gms.internal.mlkit_vision_common;

import tf.d;
import tf.e;
import tf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzff implements e {
    static final zzff zza = new zzff();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b bVarA = d.a("detectorOptions");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
    }

    private zzff() {
    }

    @Override // tf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
