package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c9 extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6463c;

    public c9(c cVar) {
        super("internal.eventLogger");
        this.f6463c = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        z5.a(this.f6570a, 3, list);
        String strZzc = y4Var.a((q) list.get(0)).zzc();
        long jI = (long) z5.i(y4Var.a((q) list.get(1)).zzd().doubleValue());
        q qVarA = y4Var.a((q) list.get(2));
        this.f6463c.e(strZzc, jI, qVarA instanceof n ? z5.k((n) qVarA) : new HashMap());
        return q.Co;
    }
}
