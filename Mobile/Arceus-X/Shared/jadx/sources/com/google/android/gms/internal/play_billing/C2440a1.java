package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2440a1 extends AbstractC2582n0 {

    /* JADX INFO: renamed from: c */
    public final transient Object[] f8896c;

    /* JADX INFO: renamed from: d */
    public final transient int f8897d;

    /* JADX INFO: renamed from: e */
    public final transient int f8898e;

    public C2440a1(Object[] objArr, int i10, int i11) {
        this.f8896c = objArr;
        this.f8897d = i10;
        this.f8898e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: e */
    public final boolean mo11169e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C2691x.m11815a(i10, this.f8898e, "index");
        Object obj = this.f8896c[i10 + i10 + this.f8897d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8898e;
    }
}
