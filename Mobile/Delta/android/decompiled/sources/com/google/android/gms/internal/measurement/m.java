package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface m {
    static q b(m mVar, q qVar, u4 u4Var, List list) {
        if (mVar.g(qVar.zzc())) {
            q qVarC = mVar.c(qVar.zzc());
            if (qVarC instanceof k) {
                return ((k) qVarC).h(u4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", qVar.zzc()));
        }
        if (!"hasOwnProperty".equals(qVar.zzc())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", qVar.zzc()));
        }
        v5.a("hasOwnProperty", 1, list);
        return mVar.g(u4Var.a((q) list.get(0)).zzc()) ? q.Eo : q.Fo;
    }

    static Iterator f(Map map) {
        return new l(map.keySet().iterator());
    }

    q c(String str);

    void d(String str, q qVar);

    boolean g(String str);
}
