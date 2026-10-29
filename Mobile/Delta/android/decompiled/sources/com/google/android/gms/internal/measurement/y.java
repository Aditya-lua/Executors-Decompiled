package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6950a = new HashMap();
    public final l0 b = new l0();

    public y() {
        a(new w());
        a(new z());
        a(new a0());
        a(new e0());
        a(new j0());
        a(new k0());
        a(new m0());
    }

    public final void a(x xVar) {
        Iterator it = xVar.f6892a.iterator();
        while (it.hasNext()) {
            this.f6950a.put(((n0) it.next()).b().toString(), xVar);
        }
    }

    public final q b(u4 u4Var, q qVar) {
        v5.l(u4Var);
        if (!(qVar instanceof r)) {
            return qVar;
        }
        r rVar = (r) qVar;
        ArrayList arrayListC = rVar.c();
        String strB = rVar.b();
        Map map = this.f6950a;
        return (map.containsKey(strB) ? (x) map.get(strB) : this.b).a(strB, u4Var, arrayListC);
    }
}
