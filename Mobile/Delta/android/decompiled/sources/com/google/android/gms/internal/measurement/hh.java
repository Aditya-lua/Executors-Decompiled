package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class hh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeMap f6482a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static final int c(u4 u4Var, p pVar, q qVar) {
        q qVarH = pVar.h(u4Var, Collections.singletonList(qVar));
        if (qVarH instanceof j) {
            return v5.g(qVarH.zzd().doubleValue());
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
            treeMap = this.f6482a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), pVar);
    }

    public final void b(u4 u4Var, c cVar) {
        z9 z9Var = new z9(cVar);
        TreeMap treeMap = this.f6482a;
        for (Integer num : treeMap.keySet()) {
            b bVarClone = cVar.c().clone();
            int iC = c(u4Var, (p) treeMap.get(num), z9Var);
            if (iC == 2 || iC == -1) {
                cVar.d(bVarClone);
            }
        }
        TreeMap treeMap2 = this.b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(u4Var, (p) treeMap2.get((Integer) it.next()), z9Var);
        }
    }
}
