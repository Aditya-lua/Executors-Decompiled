package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2703y0 extends AbstractC2637s0 {

    /* JADX INFO: renamed from: c */
    public final transient AbstractC2615q0 f9419c;

    /* JADX INFO: renamed from: d */
    public final transient Object[] f9420d;

    /* JADX INFO: renamed from: e */
    public final transient int f9421e;

    public C2703y0(AbstractC2615q0 abstractC2615q0, Object[] objArr, int i10, int i11) {
        this.f9419c = abstractC2615q0;
        this.f9420d = objArr;
        this.f9421e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: a */
    public final int mo11324a(Object[] objArr, int i10) {
        return mo11376d().mo11324a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f9419c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0
    /* JADX INFO: renamed from: h */
    public final AbstractC2582n0 mo11328h() {
        return new C2692x0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo11376d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9421e;
    }
}
