package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f7339c;

    public x0(y0 y0Var) {
        Objects.requireNonNull(y0Var);
        this.f7339c = y0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        y0 y0Var = this.f7339c;
        x.a(i10, y0Var.f7347e, "index");
        int i11 = i10 + i10;
        Object obj = y0Var.f7346d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = y0Var.f7346d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7339c.f7347e;
    }
}
