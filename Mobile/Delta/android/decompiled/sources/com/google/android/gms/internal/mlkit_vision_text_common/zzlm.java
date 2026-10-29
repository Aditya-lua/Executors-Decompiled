package com.google.android.gms.internal.mlkit_vision_text_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzlm implements e {
    static final zzlm zza = new zzlm();
    private static final d zzb;

    static {
        d.b bVarA = d.a("errorCode");
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        zzb = bVarA.b(zzctVar.zzb()).a();
    }

    private zzlm() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        fVar.add(zzb, ((zzrw) obj).zza());
    }
}
