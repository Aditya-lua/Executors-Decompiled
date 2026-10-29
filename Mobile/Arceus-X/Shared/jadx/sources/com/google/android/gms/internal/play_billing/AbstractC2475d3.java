package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2475d3 extends AbstractList implements InterfaceC2707y4 {

    /* JADX INFO: renamed from: a */
    public boolean f8947a;

    public AbstractC2475d3(boolean z10) {
        this.f8947a = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m11358a() {
        if (this.f8947a) {
            return;
        }
        m11359b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m11358a();
        return super.addAll(i10, collection);
    }

    /* JADX INFO: renamed from: b */
    public final void m11359b() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m11358a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m11358a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m11358a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m11358a();
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    public final void zzb() {
        if (this.f8947a) {
            this.f8947a = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    public final boolean zzc() {
        return this.f8947a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m11358a();
        return super.addAll(collection);
    }
}
