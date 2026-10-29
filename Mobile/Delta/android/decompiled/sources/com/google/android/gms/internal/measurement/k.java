package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class k implements q, m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6569a;
    public final Map b = new HashMap();

    public k(String str) {
        this.f6569a = str;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public q a() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final q c(String str) {
        Map map = this.b;
        return map.containsKey(str) ? (q) map.get(str) : q.f6743zo;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final void d(String str, q qVar) {
        if (qVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, qVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        return "toString".equals(str) ? new u(this.f6569a) : m.b(this, new u(str), u4Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        String str = this.f6569a;
        if (str != null) {
            return str.equals(kVar.f6569a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.m
    public final boolean g(String str) {
        return this.b.containsKey(str);
    }

    public abstract q h(u4 u4Var, List list);

    public final int hashCode() {
        String str = this.f6569a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String i() {
        return this.f6569a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return this.f6569a;
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
        return m.f(this.b);
    }
}
