package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f6604a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int c(y4 y4Var, p pVar, q qVar) {
        q qVarH = pVar.h(y4Var, Collections.singletonList(qVar));
        if (qVarH instanceof j) {
            return z5.g(qVarH.zzd().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f6604a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), pVar);
    }

    public final void b(y4 y4Var, c cVar) {
        da daVar = new da(cVar);
        TreeMap treeMap = this.f6604a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = cVar.c().clone();
            int iC = c(y4Var, (p) treeMap.get(num), daVar);
            if (iC == 2 || iC == -1) {
                cVar.d(bVarClone);
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(y4Var, (p) treeMap2.get((Integer) it.next()), daVar);
        }
    }
}
