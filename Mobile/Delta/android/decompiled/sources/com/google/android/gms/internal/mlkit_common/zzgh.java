package com.google.android.gms.internal.mlkit_common;

import qf.d;
import qf.e;
import qf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgh implements e {
    static final zzgh zza = new zzgh();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;

    static {
        d.b bVarA = d.a("modelType");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarA.b(zzayVar.zzb()).a();
        d.b bVarA2 = d.a("isDownloaded");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        zzc = bVarA2.b(zzayVar2.zzb()).a();
        d.b bVarA3 = d.a("modelName");
        zzay zzayVar3 = new zzay();
        zzayVar3.zza(3);
        zzd = bVarA3.b(zzayVar3.zzb()).a();
    }

    private zzgh() {
    }

    @Override // qf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        zzmj zzmjVar = (zzmj) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, zzmjVar.zza());
        fVar2.add(zzc, zzmjVar.zzb());
        fVar2.add(zzd, (Object) null);
    }
}
