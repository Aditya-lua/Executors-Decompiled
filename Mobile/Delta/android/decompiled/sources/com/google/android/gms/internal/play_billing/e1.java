package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object f7031c;

    public e1(Object obj) {
        obj.getClass();
        this.f7031c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        objArr[0] = this.f7031c;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7031c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s0, com.google.android.gms.internal.play_billing.j0
    public final n0 d() {
        return n0.l(this.f7031c);
    }

    @Override // com.google.android.gms.internal.play_billing.s0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7031c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new u0(this.f7031c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f7031c.toString() + "]";
    }
}
