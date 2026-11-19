package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yb implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f6950a;

    public final ac a() {
        return (ac) this.f6950a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6950a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((ac) this.f6950a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof sc) {
            return ((ac) this.f6950a.getValue()).a((sc) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
