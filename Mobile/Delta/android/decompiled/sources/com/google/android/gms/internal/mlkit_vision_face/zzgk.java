package com.google.android.gms.internal.mlkit_vision_face;

import com.appsflyer.sdk_base.referrer.Payload;
import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgk implements e {
    static final zzgk zza = new zzgk();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b bVarA = d.a(Payload.SOURCE);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
    }

    private zzgk() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
