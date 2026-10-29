package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient q0 f7353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient n0 f7354d;

    public z0(q0 q0Var, n0 n0Var) {
        this.f7353c = q0Var;
        this.f7354d = n0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        return this.f7354d.a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7353c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.s0, com.google.android.gms.internal.play_billing.j0
    public final n0 d() {
        return this.f7354d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f7354d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7353c.size();
    }
}
