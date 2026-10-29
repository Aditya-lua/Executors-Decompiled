package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2074g implements InterfaceC2255q {

    /* JADX INFO: renamed from: a */
    public final boolean f8192a;

    public C2074g(Boolean bool) {
        this.f8192a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return new C2074g(Boolean.valueOf(this.f8192a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        if ("toString".equals(str)) {
            return new C2327u(Boolean.toString(this.f8192a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f8192a), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2074g) && this.f8192a == ((C2074g) obj).f8192a;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f8192a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f8192a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        return Boolean.toString(this.f8192a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        return Double.valueOf(true != this.f8192a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        return Boolean.valueOf(this.f8192a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return null;
    }
}
