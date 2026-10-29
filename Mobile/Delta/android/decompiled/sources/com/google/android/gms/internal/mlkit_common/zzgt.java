package com.google.android.gms.internal.mlkit_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgt implements e {
    static final zzgt zza = new zzgt();

    static {
        d.b bVarA = d.a("isChargingRequired");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("isWifiRequired");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("isDeviceIdleRequired");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        bVarA3.b(zzayVar3.zzb()).a();
        d.b bVarA4 = d.a("canDownloadInBackground");
        zzay zzayVar4 = new zzay();
        zzayVar4.zza(4);
        bVarA4.b(zzayVar4.zzb()).a();
    }

    private zzgt() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        throw null;
    }
}
