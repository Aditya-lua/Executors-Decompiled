package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.hh */
/* JADX INFO: loaded from: classes.dex */
public final class C2111hh {

    /* JADX INFO: renamed from: a */
    public final TreeMap f8233a = new TreeMap();

    /* JADX INFO: renamed from: b */
    public final TreeMap f8234b = new TreeMap();

    /* JADX INFO: renamed from: c */
    public static final int m10276c(C2332u4 c2332u4, C2237p c2237p, InterfaceC2255q interfaceC2255q) {
        InterfaceC2255q interfaceC2255qMo9763h = c2237p.mo9763h(c2332u4, Collections.singletonList(interfaceC2255q));
        if (interfaceC2255qMo9763h instanceof C2129j) {
            return C2351v5.m10834g(interfaceC2255qMo9763h.zzd().doubleValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m10277a(String str, int i10, C2237p c2237p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f8234b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f8233a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c2237p);
    }

    /* JADX INFO: renamed from: b */
    public final void m10278b(C2332u4 c2332u4, C1998c c1998c) {
        C2427z9 c2427z9 = new C2427z9(c1998c);
        TreeMap treeMap = this.f8233a;
        for (Integer num : treeMap.keySet()) {
            C1979b c1979bClone = c1998c.m9834c().clone();
            int iM10276c = m10276c(c2332u4, (C2237p) treeMap.get(num), c2427z9);
            if (iM10276c == 2 || iM10276c == -1) {
                c1998c.m9835d(c1979bClone);
            }
        }
        TreeMap treeMap2 = this.f8234b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            m10276c(c2332u4, (C2237p) treeMap2.get((Integer) it.next()), c2427z9);
        }
    }
}
