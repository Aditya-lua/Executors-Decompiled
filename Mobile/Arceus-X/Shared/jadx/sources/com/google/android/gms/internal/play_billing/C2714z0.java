package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2714z0 extends AbstractC2637s0 {

    /* JADX INFO: renamed from: c */
    public final transient AbstractC2615q0 f9429c;

    /* JADX INFO: renamed from: d */
    public final transient AbstractC2582n0 f9430d;

    public C2714z0(AbstractC2615q0 abstractC2615q0, AbstractC2582n0 abstractC2582n0) {
        this.f9429c = abstractC2615q0;
        this.f9430d = abstractC2582n0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: a */
    public final int mo11324a(Object[] objArr, int i10) {
        return this.f9430d.mo11324a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9429c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0, com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: d */
    public final AbstractC2582n0 mo11376d() {
        return this.f9430d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f9430d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9429c.size();
    }
}
