package com.google.android.gms.internal.mlkit_vision_common;

import com.appsflyer.sdk_base.referrer.Payload;
import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzei implements e {
    static final zzei zza = new zzei();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b bVarA = d.a(Payload.SOURCE);
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a("errorCode");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
    }

    private zzei() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
