package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2345v implements InterfaceC2255q {
    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return InterfaceC2255q.f8587zo;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C2345v;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return null;
    }
}
