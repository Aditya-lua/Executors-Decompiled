package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6510a;

    public g(Boolean bool) {
        this.f6510a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new g(Boolean.valueOf(this.f6510a));
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, y4 y4Var, List list) {
        if ("toString".equals(str)) {
            return new u(Boolean.toString(this.f6510a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f6510a), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f6510a == ((g) obj).f6510a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6510a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f6510a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return Boolean.toString(this.f6510a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        return Double.valueOf(true != this.f6510a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.valueOf(this.f6510a);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return null;
    }
}
