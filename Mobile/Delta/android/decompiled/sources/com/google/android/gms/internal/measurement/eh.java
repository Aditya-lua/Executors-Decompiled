package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class eh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x7 f6433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6434d;

    public eh(x7 x7Var) {
        super("require");
        this.f6434d = new HashMap();
        this.f6433c = x7Var;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        q qVar;
        v5.a("require", 1, list);
        String strZzc = u4Var.a((q) list.get(0)).zzc();
        Map map = this.f6434d;
        if (map.containsKey(strZzc)) {
            return (q) map.get(strZzc);
        }
        Map map2 = this.f6433c.f6897a;
        if (map2.containsKey(strZzc)) {
            try {
                qVar = (q) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            qVar = q.f6743zo;
        }
        if (qVar instanceof k) {
            this.f6434d.put(strZzc, (k) qVar);
        }
        return qVar;
    }
}
