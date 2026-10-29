package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ub */
/* JADX INFO: loaded from: classes.dex */
public final class C2339ub implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Map.Entry f8689a;

    /* JADX INFO: renamed from: a */
    public final C2375wb m10786a() {
        return (C2375wb) this.f8689a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8689a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((C2375wb) this.f8689a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC2232oc) {
            return ((C2375wb) this.f8689a.getValue()).m10979a((InterfaceC2232oc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
