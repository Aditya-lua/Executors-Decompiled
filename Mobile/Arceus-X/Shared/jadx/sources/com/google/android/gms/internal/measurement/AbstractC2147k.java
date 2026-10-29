package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2147k implements InterfaceC2255q, InterfaceC2183m {

    /* JADX INFO: renamed from: a */
    public final String f8356a;

    /* JADX INFO: renamed from: b */
    public final Map f8357b = new HashMap();

    public AbstractC2147k(String str) {
        this.f8356a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public InterfaceC2255q mo9950a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2255q mo9951c(String str) {
        Map map = this.f8357b;
        return map.containsKey(str) ? (InterfaceC2255q) map.get(str) : InterfaceC2255q.f8587zo;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: d */
    public final void mo9952d(String str, InterfaceC2255q interfaceC2255q) {
        if (interfaceC2255q == null) {
            this.f8357b.remove(str);
        } else {
            this.f8357b.put(str, interfaceC2255q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        return "toString".equals(str) ? new C2327u(this.f8356a) : InterfaceC2183m.m10368b(this, new C2327u(str), c2332u4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2147k)) {
            return false;
        }
        AbstractC2147k abstractC2147k = (AbstractC2147k) obj;
        String str = this.f8356a;
        if (str != null) {
            return str.equals(abstractC2147k.f8356a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: g */
    public final boolean mo9954g(String str) {
        return this.f8357b.containsKey(str);
    }

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC2255q mo9763h(C2332u4 c2332u4, List list);

    public final int hashCode() {
        String str = this.f8356a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public final String m10309i() {
        return this.f8356a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        return this.f8356a;
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
        return InterfaceC2183m.m10369f(this.f8357b);
    }
}
