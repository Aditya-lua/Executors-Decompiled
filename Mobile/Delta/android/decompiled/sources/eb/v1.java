package eb;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends m1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v1 f16030f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient e1 f16031e;

    static {
        d2 d2Var = e1.b;
        f16030f = new v1(t1.f16011e, q1.f15973a);
    }

    public v1(e1 e1Var, Comparator comparator) {
        super(comparator);
        this.f16031e = e1Var;
    }

    @Override // eb.m1
    public final m1 A(Object obj, boolean z10) {
        return F(E(obj, z10), this.f16031e.size());
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final c2 descendingIterator() {
        return this.f16031e.f().listIterator(0);
    }

    public final int D(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f16031e, obj, this.f15917c);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    public final int E(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f16031e, obj, this.f15917c);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final v1 F(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f16031e.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 >= i11) {
            return m1.B(this.f15917c);
        }
        e1 e1Var = this.f16031e;
        return new v1(e1Var.subList(i10, i11), this.f15917c);
    }

    @Override // eb.z0
    public final int a(Object[] objArr, int i10) {
        return this.f16031e.a(objArr, 0);
    }

    @Override // eb.z0
    public final int b() {
        return this.f16031e.b();
    }

    @Override // eb.z0
    public final int c() {
        return this.f16031e.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        e1 e1Var = this.f16031e;
        int iE = E(obj, true);
        if (iE == e1Var.size()) {
            return null;
        }
        return this.f16031e.get(iE);
    }

    @Override // eb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f16031e, obj, this.f15917c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof p1) {
            collection = ((p1) collection).zza();
        }
        if (!b2.a(this.f15917c, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        d2 d2VarListIterator = this.f16031e.listIterator(0);
        Iterator it = collection.iterator();
        if (!d2VarListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = d2VarListIterator.next();
        while (true) {
            try {
                int iCompare = this.f15917c.compare(next2, next);
                if (iCompare < 0) {
                    if (!d2VarListIterator.hasNext()) {
                        return false;
                    }
                    next2 = d2VarListIterator.next();
                } else {
                    if (iCompare != 0) {
                        return false;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    @Override // eb.h1, eb.z0
    public final c2 d() {
        return this.f16031e.listIterator(0);
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f16031e.e();
    }

    @Override // eb.h1, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f16031e.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!b2.a(this.f15917c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            d2 d2VarListIterator = this.f16031e.listIterator(0);
            while (d2VarListIterator.hasNext()) {
                E next = d2VarListIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f15917c.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // eb.m1, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f16031e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iD = D(obj, true) - 1;
        if (iD == -1) {
            return null;
        }
        return this.f16031e.get(iD);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        e1 e1Var = this.f16031e;
        int iE = E(obj, false);
        if (iE == e1Var.size()) {
            return null;
        }
        return this.f16031e.get(iE);
    }

    @Override // eb.h1
    public final e1 i() {
        return this.f16031e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f16031e.listIterator(0);
    }

    @Override // eb.m1, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        e1 e1Var = this.f16031e;
        return e1Var.get(e1Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iD = D(obj, false) - 1;
        if (iD == -1) {
            return null;
        }
        return this.f16031e.get(iD);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16031e.size();
    }

    @Override // eb.m1
    public final m1 t() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f15917c);
        return isEmpty() ? m1.B(comparatorReverseOrder) : new v1(this.f16031e.f(), comparatorReverseOrder);
    }

    @Override // eb.m1
    public final m1 x(Object obj, boolean z10) {
        return F(0, D(obj, z10));
    }

    @Override // eb.m1
    public final m1 z(Object obj, boolean z10, Object obj2, boolean z11) {
        return A(obj, z10).x(obj2, z11);
    }
}
