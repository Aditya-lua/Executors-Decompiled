package p100eb;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: eb.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5022v1 extends AbstractC4968m1 {

    /* JADX INFO: renamed from: f */
    public static final C5022v1 f19830f;

    /* JADX INFO: renamed from: e */
    public final transient AbstractC4920e1 f19831e;

    static {
        AbstractC4915d2 abstractC4915d2 = AbstractC4920e1.f19644b;
        f19830f = new C5022v1(C5010t1.f19809e, C4992q1.f19767a);
    }

    public C5022v1(AbstractC4920e1 abstractC4920e1, Comparator comparator) {
        super(comparator);
        this.f19831e = abstractC4920e1;
    }

    @Override // p100eb.AbstractC4968m1
    /* JADX INFO: renamed from: A */
    public final AbstractC4968m1 mo23665A(Object obj, boolean z10) {
        return m23712F(m23711E(obj, z10), this.f19831e.size());
    }

    /* JADX DEBUG: Method merged with bridge method: descendingIterator()Ljava/util/Iterator; */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final AbstractC4909c2 descendingIterator() {
        return this.f19831e.mo23560f().listIterator(0);
    }

    /* JADX INFO: renamed from: D */
    public final int m23710D(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f19831e, obj, this.f19696c);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: E */
    public final int m23711E(Object obj, boolean z10) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f19831e, obj, this.f19696c);
        if (iBinarySearch >= 0) {
            return z10 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: F */
    public final C5022v1 m23712F(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f19831e.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 >= i11) {
            return AbstractC4968m1.m23664B(this.f19696c);
        }
        AbstractC4920e1 abstractC4920e1 = this.f19831e;
        return new C5022v1(abstractC4920e1.subList(i10, i11), this.f19696c);
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: a */
    public final int mo23574a(Object[] objArr, int i10) {
        return this.f19831e.mo23574a(objArr, 0);
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: b */
    public final int mo23564b() {
        return this.f19831e.mo23564b();
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: c */
    public final int mo23565c() {
        return this.f19831e.mo23565c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        AbstractC4920e1 abstractC4920e1 = this.f19831e;
        int iM23711E = m23711E(obj, true);
        if (iM23711E == abstractC4920e1.size()) {
            return null;
        }
        return this.f19831e.get(iM23711E);
    }

    @Override // p100eb.AbstractC5044z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f19831e, obj, this.f19696c) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0034 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x0034 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: eb.v1 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC4986p1) {
            collection = ((InterfaceC4986p1) collection).zza();
        }
        if (!C4903b2.m23555a(this.f19696c, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC4915d2 abstractC4915d2ListIterator = this.f19831e.listIterator(0);
        Iterator it = collection.iterator();
        if (!abstractC4915d2ListIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        E next2 = abstractC4915d2ListIterator.next();
        while (true) {
            try {
                int iCompare = this.f19696c.compare(next2, next);
                if (iCompare < 0) {
                    if (!abstractC4915d2ListIterator.hasNext()) {
                        return false;
                    }
                    next2 = abstractC4915d2ListIterator.next();
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

    @Override // p100eb.AbstractC4938h1, p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: d */
    public final AbstractC4909c2 mo23575d() {
        return this.f19831e.listIterator(0);
    }

    @Override // p100eb.AbstractC5044z0
    /* JADX INFO: renamed from: e */
    public final Object[] mo23566e() {
        return this.f19831e.mo23566e();
    }

    @Override // p100eb.AbstractC4938h1, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f19831e.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C4903b2.m23555a(this.f19696c, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            AbstractC4915d2 abstractC4915d2ListIterator = this.f19831e.listIterator(0);
            while (abstractC4915d2ListIterator.hasNext()) {
                E next = abstractC4915d2ListIterator.next();
                Object next2 = it.next();
                if (next2 == null || this.f19696c.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // p100eb.AbstractC4968m1, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f19831e.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM23710D = m23710D(obj, true) - 1;
        if (iM23710D == -1) {
            return null;
        }
        return this.f19831e.get(iM23710D);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        AbstractC4920e1 abstractC4920e1 = this.f19831e;
        int iM23711E = m23711E(obj, false);
        if (iM23711E == abstractC4920e1.size()) {
            return null;
        }
        return this.f19831e.get(iM23711E);
    }

    @Override // p100eb.AbstractC4938h1
    /* JADX INFO: renamed from: i */
    public final AbstractC4920e1 mo23611i() {
        return this.f19831e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f19831e.listIterator(0);
    }

    @Override // p100eb.AbstractC4968m1, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC4920e1 abstractC4920e1 = this.f19831e;
        return abstractC4920e1.get(abstractC4920e1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM23710D = m23710D(obj, false) - 1;
        if (iM23710D == -1) {
            return null;
        }
        return this.f19831e.get(iM23710D);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19831e.size();
    }

    @Override // p100eb.AbstractC4968m1
    /* JADX INFO: renamed from: t */
    public final AbstractC4968m1 mo23666t() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f19696c);
        return isEmpty() ? AbstractC4968m1.m23664B(comparatorReverseOrder) : new C5022v1(this.f19831e.mo23560f(), comparatorReverseOrder);
    }

    @Override // p100eb.AbstractC4968m1
    /* JADX INFO: renamed from: x */
    public final AbstractC4968m1 mo23668x(Object obj, boolean z10) {
        return m23712F(0, m23710D(obj, z10));
    }

    @Override // p100eb.AbstractC4968m1
    /* JADX INFO: renamed from: z */
    public final AbstractC4968m1 mo23670z(Object obj, boolean z10, Object obj2, boolean z11) {
        return mo23665A(obj, z10).mo23668x(obj2, z11);
    }
}
