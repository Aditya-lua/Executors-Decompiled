package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class rd extends pd {
    @Override // com.google.android.gms.internal.measurement.pd
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        kb kbVar = (kb) obj;
        qd qdVar = kbVar.zzc;
        if (qdVar != qd.a()) {
            return qdVar;
        }
        qd qdVarB = qd.b();
        kbVar.zzc = qdVarB;
        return qdVarB;
    }

    @Override // com.google.android.gms.internal.measurement.pd
    public final void b(Object obj) {
        ((kb) obj).zzc.d();
    }
}
