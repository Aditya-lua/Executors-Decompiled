package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ub implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f6828a;

    public final wb a() {
        return (wb) this.f6828a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6828a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((wb) this.f6828a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof oc) {
            return ((wb) this.f6828a.getValue()).a((oc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
