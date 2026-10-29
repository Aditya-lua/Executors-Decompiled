package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y8 extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6955c;

    public y8(c cVar) {
        super("internal.eventLogger");
        this.f6955c = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        v5.a(this.f6569a, 3, list);
        String strZzc = u4Var.a((q) list.get(0)).zzc();
        long jI = (long) v5.i(u4Var.a((q) list.get(1)).zzd().doubleValue());
        q qVarA = u4Var.a((q) list.get(2));
        this.f6955c.e(strZzc, jI, qVarA instanceof n ? v5.k((n) qVarA) : new HashMap());
        return q.f6743zo;
    }
}
