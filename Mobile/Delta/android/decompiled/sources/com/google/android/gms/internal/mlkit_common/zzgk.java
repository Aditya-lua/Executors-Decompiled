package com.google.android.gms.internal.mlkit_common;

import rf.d;
import rf.e;
import rf.f;

/* JADX INFO: loaded from: classes.dex */
final class zzgk implements e {
    static final zzgk zza = new zzgk();
    private static final d zzb;

    static {
        d.b bVarA = d.a("api");
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        zzb = bVarA.b(zzayVar.zzb()).a();
    }

    private zzgk() {
    }

    @Override // rf.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) {
        fVar.add(zzb, ((zzmp) obj).zza());
    }
}
