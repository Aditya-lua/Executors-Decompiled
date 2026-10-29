package ie;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.s0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6795s0<E> extends AbstractC6806y<E> {

    /* JADX INFO: renamed from: f */
    public static final C6795s0<Comparable> f26709f = new C6795s0<>(AbstractC6796t.m29097z(), AbstractC6783m0.m29017c());

    /* JADX INFO: renamed from: e */
    public final transient AbstractC6796t<E> f26710e;

    public C6795s0(AbstractC6796t<E> abstractC6796t, Comparator<? super E> comparator) {
        super(comparator);
        this.f26710e = abstractC6796t;
    }

    @Override // ie.AbstractC6806y
    /* JADX INFO: renamed from: D */
    public AbstractC6806y<E> mo29073D() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f26748c);
        return isEmpty() ? AbstractC6806y.m29159F(comparatorReverseOrder) : new C6795s0(this.f26710e.mo29098F(), comparatorReverseOrder);
    }

    @Override // ie.AbstractC6806y
    /* JADX INFO: renamed from: I */
    public AbstractC6806y<E> mo29074I(E e10, boolean z10) {
        return m29078S(0, m29079T(e10, z10));
    }

    @Override // ie.AbstractC6806y
    /* JADX INFO: renamed from: L */
    public AbstractC6806y<E> mo29075L(E e10, boolean z10, E e11, boolean z11) {
        return mo29076O(e10, z10).mo29074I(e11, z11);
    }

    @Override // ie.AbstractC6806y
    /* JADX INFO: renamed from: O */
    public AbstractC6806y<E> mo29076O(E e10, boolean z10) {
        return m29078S(m29080V(e10, z10), size());
    }

    /* JADX DEBUG: Method merged with bridge method: descendingIterator()Ljava/util/Iterator; */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public AbstractC6807y0<E> descendingIterator() {
        return this.f26710e.mo29098F().iterator();
    }

    /* JADX INFO: renamed from: S */
    public C6795s0<E> m29078S(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        return i10 < i11 ? new C6795s0<>(this.f26710e.subList(i10, i11), this.f26748c) : AbstractC6806y.m29159F(this.f26748c);
    }

    /* JADX INFO: renamed from: T */
    public int m29079T(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f26710e, C6384n.m27928l(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: V */
    public int m29080V(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f26710e, C6384n.m27928l(e10), comparator());
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: W */
    public final int m29081W(Object obj) {
        return Collections.binarySearch(this.f26710e, obj, m29082X());
    }

    /* JADX INFO: renamed from: X */
    public Comparator<Object> m29082X() {
        return this.f26748c;
    }

    @Override // ie.AbstractC6802w, ie.AbstractC6792r
    /* JADX INFO: renamed from: a */
    public AbstractC6796t<E> mo29064a() {
        return this.f26710e;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: b */
    public int mo29031b(Object[] objArr, int i10) {
        return this.f26710e.mo29031b(objArr, i10);
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: c */
    public Object[] mo29032c() {
        return this.f26710e.mo29032c();
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        int iM29080V = m29080V(e10, true);
        if (iM29080V == size()) {
            return null;
        }
        return this.f26710e.get(iM29080V);
    }

    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (m29081W(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC6775i0) {
            collection = ((InterfaceC6775i0) collection).m28966P1();
        }
        if (!C6803w0.m29146b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC6807y0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iM29168P = m29168P(next2, next);
                if (iM29168P < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iM29168P == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iM29168P > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: d */
    public int mo29033d() {
        return this.f26710e.mo29033d();
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: e */
    public int mo29034e() {
        return this.f26710e.mo29034e();
    }

    @Override // ie.AbstractC6802w, java.util.Collection, java.util.Set
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
        if (!C6803w0.m29146b(this.f26748c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            AbstractC6807y0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || m29168P(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: f */
    public boolean mo29035f() {
        return this.f26710e.mo29035f();
    }

    @Override // java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f26710e.get(0);
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        int iM29079T = m29079T(e10, true) - 1;
        if (iM29079T == -1) {
            return null;
        }
        return this.f26710e.get(iM29079T);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public AbstractC6807y0<E> iterator() {
        return this.f26710e.iterator();
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        int iM29080V = m29080V(e10, false);
        if (iM29080V == size()) {
            return null;
        }
        return this.f26710e.get(iM29080V);
    }

    @Override // java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f26710e.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        int iM29079T = m29079T(e10, false) - 1;
        if (iM29079T == -1) {
            return null;
        }
        return this.f26710e.get(iM29079T);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26710e.size();
    }
}
