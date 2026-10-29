package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class nd extends ld {
    @Override // com.google.android.gms.internal.measurement.ld
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        gb gbVar = (gb) obj;
        md mdVar = gbVar.zzc;
        if (mdVar != md.a()) {
            return mdVar;
        }
        md mdVarB = md.b();
        gbVar.zzc = mdVarB;
        return mdVarB;
    }

    @Override // com.google.android.gms.internal.measurement.ld
    public final void b(Object obj) {
        ((gb) obj).zzc.d();
    }
}
