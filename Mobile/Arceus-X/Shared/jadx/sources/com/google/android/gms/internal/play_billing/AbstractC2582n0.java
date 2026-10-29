package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2582n0 extends AbstractC2538j0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final AbstractC2506g1 f9163b = new C2549k0(C2681w0.f9407e, 0);

    /* JADX INFO: renamed from: h */
    public static AbstractC2582n0 m11597h(Object[] objArr, int i10) {
        return i10 == 0 ? C2681w0.f9407e : new C2681w0(objArr, i10);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC2582n0 m11598i(Collection collection) {
        if (!(collection instanceof AbstractC2538j0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            C2670v0.m11802b(array, length);
            return m11597h(array, length);
        }
        AbstractC2582n0 abstractC2582n0Mo11376d = ((AbstractC2538j0) collection).mo11376d();
        if (!abstractC2582n0Mo11376d.mo11169e()) {
            return abstractC2582n0Mo11376d;
        }
        Object[] array2 = abstractC2582n0Mo11376d.toArray();
        return m11597h(array2, array2.length);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC2582n0 m11599k() {
        return C2681w0.f9407e;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC2582n0 m11600l(Object obj) {
        Object[] objArr = {obj};
        C2670v0.m11802b(objArr, 1);
        return m11597h(objArr, 1);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC2582n0 m11601m(Object obj, Object obj2) {
        Object[] objArr = {"subs", "inapp"};
        C2670v0.m11802b(objArr, 2);
        return m11597h(objArr, 2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: a */
    public int mo11324a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    @Deprecated
    /* JADX INFO: renamed from: d */
    public final AbstractC2582n0 mo11376d() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i10 = 0; i10 < size; i10++) {
                if (!Objects.equals(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2582n0 subList(int i10, int i11) {
        C2691x.m11818d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C2681w0.f9407e : new C2560l0(this, i10, i12);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Method merged with bridge method: listIterator(I)Ljava/util/ListIterator; */
    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC2506g1 listIterator(int i10) {
        C2691x.m11816b(i10, size(), "index");
        return isEmpty() ? f9163b : new C2549k0(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
