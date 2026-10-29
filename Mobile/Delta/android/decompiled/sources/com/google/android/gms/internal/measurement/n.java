package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n implements q, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f6633a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        n nVar = new n();
        for (Map.Entry entry : this.f6633a.entrySet()) {
            if (entry.getValue() instanceof m) {
                nVar.f6633a.put((String) entry.getKey(), (q) entry.getValue());
            } else {
                nVar.f6633a.put((String) entry.getKey(), ((q) entry.getValue()).a());
            }
        }
        return nVar;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q c(String str) {
        Map map = this.f6633a;
        return map.containsKey(str) ? (q) map.get(str) : q.f6743zo;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void d(String str, q qVar) {
        if (qVar == null) {
            this.f6633a.remove(str);
        } else {
            this.f6633a.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q e(String str, u4 u4Var, List list) {
        return "toString".equals(str) ? new u(toString()) : m.b(this, new u(str), u4Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f6633a.equals(((n) obj).f6633a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean g(String str) {
        return this.f6633a.containsKey(str);
    }

    public final List h() {
        return new ArrayList(this.f6633a.keySet());
    }

    public final int hashCode() {
        return this.f6633a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f6633a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return m.f(this.f6633a);
    }
}
