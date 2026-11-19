package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient q0 f7345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f7346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f7347e;

    public y0(q0 q0Var, Object[] objArr, int i10, int i11) {
        this.f7345c = q0Var;
        this.f7346d = objArr;
        this.f7347e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        return d().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7345c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final n0 h() {
        return new x0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7347e;
    }
}
