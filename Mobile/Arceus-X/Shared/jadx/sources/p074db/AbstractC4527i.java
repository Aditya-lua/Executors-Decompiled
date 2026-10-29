package p074db;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: renamed from: db.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4527i extends AbstractC4522d implements List, RandomAccess {

    /* JADX INFO: renamed from: b */
    public static final AbstractC4531m f18577b = new C4524f(C4529k.f18578e, 0);

    /* JADX INFO: renamed from: g */
    public static AbstractC4527i m22494g() {
        return C4529k.f18578e;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC4527i m22495h(Object obj) {
        Object[] objArr = {obj};
        C4528j.m22500a(objArr, 1);
        return m22498l(objArr, 1);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC4527i m22496i(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        C4528j.m22500a(objArr, 3);
        return m22498l(objArr, 3);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC4527i m22497k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        C4528j.m22500a(objArr, 6);
        return m22498l(objArr, 6);
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC4527i m22498l(Object[] objArr, int i10) {
        return i10 == 0 ? C4529k.f18578e : new C4529k(objArr, i10);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p074db.AbstractC4522d
    /* JADX INFO: renamed from: d */
    public int mo22487d(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    /* JADX INFO: renamed from: e */
    public AbstractC4527i mo22491e() {
        return size() <= 1 ? this : new C4525g(this);
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
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC4527i subList(int i10, int i11) {
        C4537s.m22512d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? C4529k.f18578e : new C4526h(this, i10, i12);
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

    /* JADX DEBUG: Method merged with bridge method: listIterator(I)Ljava/util/ListIterator; */
    @Override // java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final AbstractC4531m listIterator(int i10) {
        C4537s.m22511c(i10, size(), "index");
        return isEmpty() ? f18577b : new C4524f(this, i10);
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
