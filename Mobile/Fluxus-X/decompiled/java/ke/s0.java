package ke;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s0<E> extends y<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s0<Comparable> f21421f = new s0<>(t.x(), m0.c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient t<E> f21422e;

    public s0(t<E> tVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f21422e = tVar;
    }

    @Override // ke.y
    public y<E> D() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f21451c);
        return isEmpty() ? y.F(comparatorReverseOrder) : new s0(this.f21422e.F(), comparatorReverseOrder);
    }

    @Override // ke.y
    public y<E> I(E e10, boolean z10) {
        return T(0, U(e10, z10));
    }

    @Override // ke.y
    public y<E> L(E e10, boolean z10, E e11, boolean z11) {
        return P(e10, z10).I(e11, z11);
    }

    @Override // ke.y
    public y<E> P(E e10, boolean z10) {
        return T(V(e10, z10), size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public y0<E> descendingIterator() {
        return this.f21422e.F().iterator();
    }

    public s0<E> T(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        return i10 < i11 ? new s0<>(this.f21422e.subList(i10, i11), this.f21451c) : y.F(this.f21451c);
    }

    public int U(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f21422e, je.n.l(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public int V(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f21422e, je.n.l(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final int W(Object obj) {
        return Collections.binarySearch(this.f21422e, obj, X());
    }

    public Comparator<Object> X() {
        return this.f21451c;
    }

    @Override // ke.w, ke.r
    public t<E> a() {
        return this.f21422e;
    }

    @Override // ke.r
    public int b(Object[] objArr, int i10) {
        return this.f21422e.b(objArr, i10);
    }

    @Override // ke.r
    public Object[] c() {
        return this.f21422e.c();
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        int iV = V(e10, true);
        if (iV == size()) {
            return null;
        }
        return this.f21422e.get(iV);
    }

    @Override // ke.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (W(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof i0) {
            collection = ((i0) collection).R1();
        }
        if (!w0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        y0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iQ = Q(next2, next);
                if (iQ < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iQ == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iQ > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // ke.r
    public int d() {
        return this.f21422e.d();
    }

    @Override // ke.r
    public int e() {
        return this.f21422e.e();
    }

    @Override // ke.w, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!w0.b(this.f21451c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            y0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || Q(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // ke.r
    public boolean f() {
        return this.f21422e.f();
    }

    @Override // java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f21422e.get(0);
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        int iU = U(e10, true) - 1;
        if (iU == -1) {
            return null;
        }
        return this.f21422e.get(iU);
    }

    @Override // ke.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return this.f21422e.iterator();
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        int iV = V(e10, false);
        if (iV == size()) {
            return null;
        }
        return this.f21422e.get(iV);
    }

    @Override // java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f21422e.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        int iU = U(e10, false) - 1;
        if (iU == -1) {
            return null;
        }
        return this.f21422e.get(iU);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f21422e.size();
    }
}
