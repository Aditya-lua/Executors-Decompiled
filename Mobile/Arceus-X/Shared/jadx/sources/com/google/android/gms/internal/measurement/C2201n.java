package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n */
/* JADX INFO: loaded from: classes.dex */
public class C2201n implements InterfaceC2255q, InterfaceC2183m {

    /* JADX INFO: renamed from: a */
    public final Map f8431a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        C2201n c2201n = new C2201n();
        for (Map.Entry entry : this.f8431a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2183m) {
                c2201n.f8431a.put((String) entry.getKey(), (InterfaceC2255q) entry.getValue());
            } else {
                c2201n.f8431a.put((String) entry.getKey(), ((InterfaceC2255q) entry.getValue()).mo9950a());
            }
        }
        return c2201n;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2255q mo9951c(String str) {
        Map map = this.f8431a;
        return map.containsKey(str) ? (InterfaceC2255q) map.get(str) : InterfaceC2255q.f8587zo;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: d */
    public final void mo9952d(String str, InterfaceC2255q interfaceC2255q) {
        if (interfaceC2255q == null) {
            this.f8431a.remove(str);
        } else {
            this.f8431a.put(str, interfaceC2255q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        return "toString".equals(str) ? new C2327u(toString()) : InterfaceC2183m.m10368b(this, new C2327u(str), c2332u4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2201n) {
            return this.f8431a.equals(((C2201n) obj).f8431a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: g */
    public final boolean mo9954g(String str) {
        return this.f8431a.containsKey(str);
    }

    /* JADX INFO: renamed from: h */
    public final List m10407h() {
        return new ArrayList(this.f8431a.keySet());
    }

    public final int hashCode() {
        return this.f8431a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        Map map = this.f8431a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb2.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return InterfaceC2183m.m10369f(this.f8431a);
    }
}
