package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2484e1 extends AbstractC2637s0 {

    /* JADX INFO: renamed from: c */
    public final transient Object f8955c;

    public C2484e1(Object obj) {
        obj.getClass();
        this.f8955c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: a */
    public final int mo11324a(Object[] objArr, int i10) {
        objArr[0] = this.f8955c;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8955c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0, com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: d */
    public final AbstractC2582n0 mo11376d() {
        return AbstractC2582n0.m11600l(this.f8955c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8955c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C2659u0(this.f8955c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f8955c.toString() + "]";
    }
}
