package com.google.android.gms.internal.mlkit_vision_common;

import com.appsflyer.sdk_base.referrer.Payload;
import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzev implements e {
    static final zzev zza = new zzev();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;

    static {
        d.b bVarA = d.a("name");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = bVarA.b(zzaeVar.zzb()).a();
        d.b bVarA2 = d.a(Payload.TYPE);
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = bVarA2.b(zzaeVar2.zzb()).a();
        d.b bVarA3 = d.a("version");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = bVarA3.b(zzaeVar3.zzb()).a();
        d.b bVarA4 = d.a("featureLevel");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = bVarA4.b(zzaeVar4.zzb()).a();
    }

    private zzev() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
