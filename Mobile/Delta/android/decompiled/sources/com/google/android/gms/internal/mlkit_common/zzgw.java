package com.google.android.gms.internal.mlkit_common;

import com.appsflyer.sdk_base.referrer.Payload;
import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgw implements e {
    static final zzgw zza = new zzgw();

    static {
        d.b bVarA = d.a("name");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a(Payload.TYPE);
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("version");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        bVarA3.b(zzayVar3.zzb()).a();
        d.b bVarA4 = d.a("featureLevel");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        bVarA4.b(zzayVar4.zzb()).a();
    }

    private zzgw() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
