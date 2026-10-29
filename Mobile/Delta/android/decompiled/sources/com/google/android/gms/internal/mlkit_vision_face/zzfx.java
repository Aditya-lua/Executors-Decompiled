package com.google.android.gms.internal.mlkit_vision_face;

import com.appsflyer.sdk_base.referrer.Payload;
import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzfx implements e {
    static final zzfx zza = new zzfx();
    private static final d zzb;
    private static final d zzc;

    static {
        d.b bVarA = d.a(Payload.TYPE);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = bVarA.b(zzcqVar.zzb()).a();
        d.b bVarA2 = d.a("dims");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = bVarA2.b(zzcqVar2.zzb()).a();
    }

    private zzfx() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
