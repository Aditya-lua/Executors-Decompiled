package p100eb;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: eb.e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4920e1 extends AbstractC5044z0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final AbstractC4915d2 f19644b = new C4896a1(C5010t1.f19809e, 0);

    /* JADX INFO: renamed from: h */
    public static AbstractC4920e1 m23571h(Object[] objArr, int i10) {
        return i10 == 0 ? C5010t1.f19809e : new C5010t1(objArr, i10);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC4920e1 m23572i(Object[] objArr) {
        if (objArr.length == 0) {
            return C5010t1.f19809e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        C4998r1.m23698b(objArr2, length);
        return m23571h(objArr2, length);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC4920e1 m23573k(Object obj) {
        Object[] objArr = {obj};
        C4998r1.m23698b(objArr, 1);
        return m23571h(objArr, 1);
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: a */
    public int mo23574a(Object[] objArr, int i10) {
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

    @Override // p100eb.AbstractC5044z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: d */
    public final AbstractC4909c2 mo23575d() {
        return listIterator(0);
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
                if (!C4961l0.m23651a(get(i10), list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !C4961l0.m23651a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: f */
    public AbstractC4920e1 mo23560f() {
        return size() <= 1 ? this : new C4908c1(this);
    }

    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC4920e1 subList(int i10, int i11) {
        C4973n0.m23681e(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C5010t1.f19809e : new C4914d1(this, i10, i12);
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

    public int indexOf(Object obj) {
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

    /* JADX DEBUG: Method merged with bridge method: listIterator(I)Ljava/util/ListIterator; */
    @Override // java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC4915d2 listIterator(int i10) {
        C4973n0.m23678b(i10, size(), "index");
        return isEmpty() ? f19644b : new C4896a1(this, i10);
    }

    public int lastIndexOf(Object obj) {
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
