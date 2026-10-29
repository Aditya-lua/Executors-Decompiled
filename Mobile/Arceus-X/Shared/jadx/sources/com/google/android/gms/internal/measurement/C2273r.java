package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2273r implements InterfaceC2255q {

    /* JADX INFO: renamed from: a */
    public final String f8599a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8600b;

    public C2273r(String str, List list) {
        this.f8599a = str;
        ArrayList arrayList = new ArrayList();
        this.f8600b = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final String m10584b() {
        return this.f8599a;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m10585c() {
        return this.f8600b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273r)) {
            return false;
        }
        C2273r c2273r = (C2273r) obj;
        String str = this.f8599a;
        if (str == null ? c2273r.f8599a == null : str.equals(c2273r.f8599a)) {
            return this.f8600b.equals(c2273r.f8600b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8599a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f8600b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return null;
    }
}
