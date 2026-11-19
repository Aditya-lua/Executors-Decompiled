package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ih extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b8 f6552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f6553d;

    public ih(b8 b8Var) {
        super("require");
        this.f6553d = new HashMap();
        this.f6552c = b8Var;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        q qVar;
        z5.a("require", 1, list);
        String strZzc = y4Var.a((q) list.get(0)).zzc();
        Map map = this.f6553d;
        if (map.containsKey(strZzc)) {
            return (q) map.get(strZzc);
        }
        Map map2 = this.f6552c.f6404a;
        if (map2.containsKey(strZzc)) {
            try {
                qVar = (q) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            qVar = q.Co;
        }
        if (qVar instanceof k) {
            this.f6553d.put(strZzc, (k) qVar);
        }
        return qVar;
    }
}
