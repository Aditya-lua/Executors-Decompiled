package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements q {
    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return q.f6743zo;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof v;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return null;
    }
}
