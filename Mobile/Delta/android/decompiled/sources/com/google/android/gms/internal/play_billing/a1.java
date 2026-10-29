package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f6980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f6981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f6982e;

    public a1(Object[] objArr, int i10, int i11) {
        this.f6980c = objArr;
        this.f6981d = i10;
        this.f6982e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        x.a(i10, this.f6982e, "index");
        Object obj = this.f6980c[i10 + i10 + this.f6981d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6982e;
    }
}
