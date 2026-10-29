package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6450a;

    public g(Boolean bool) {
        this.f6450a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new g(Boolean.valueOf(this.f6450a));
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        if ("toString".equals(str)) {
            return new u(Boolean.toString(this.f6450a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f6450a), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f6450a == ((g) obj).f6450a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6450a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f6450a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return Boolean.toString(this.f6450a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        return Double.valueOf(true != this.f6450a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.valueOf(this.f6450a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return null;
    }
}
