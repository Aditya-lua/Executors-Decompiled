package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a5 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f6984a;

    public final d5 a() {
        return (d5) this.f6984a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6984a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        d5 d5Var = (d5) this.f6984a.getValue();
        if (d5Var == null) {
            return null;
        }
        return d5Var.f();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof x5)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.f6984a;
        x5 x5Var = ((d5) entry.getValue()).f7027c;
        entry.setValue(new d5((x5) obj));
        return x5Var;
    }
}
