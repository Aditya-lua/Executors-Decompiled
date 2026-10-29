package he;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y<E> extends z<E> implements NavigableSet<E>, v0<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Comparator<? super E> f19307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient y<E> f19308d;

    public y(Comparator<? super E> comparator) {
        this.f19307c = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> y<E> A(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return F(comparator);
        }
        l0.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            a0.c0.a aVar = (Object) eArr[i12];
            if (comparator.compare(aVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = aVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new s0(t.i(eArr, i11), comparator);
    }

    public static <E> y<E> B(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        ge.n.l(comparator);
        if (w0.b(comparator, iterable) && (iterable instanceof y)) {
            y<E> yVar = (y) iterable;
            if (!yVar.f()) {
                return yVar;
            }
        }
        Object[] objArrB = a0.b(iterable);
        return A(comparator, objArrB.length, objArrB);
    }

    public static <E> y<E> C(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return B(comparator, collection);
    }

    public static <E> s0<E> F(Comparator<? super E> comparator) {
        return m0.c().equals(comparator) ? (s0<E>) s0.f19277f : new s0<>(t.z(), comparator);
    }

    public static int Q(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    public abstract y<E> D();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public y<E> descendingSet() {
        y<E> yVar = this.f19308d;
        if (yVar != null) {
            return yVar;
        }
        y<E> yVarD = D();
        this.f19308d = yVarD;
        yVarD.f19308d = this;
        return yVarD;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public y<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public y<E> headSet(E e10, boolean z10) {
        return I(ge.n.l(e10), z10);
    }

    public abstract y<E> I(E e10, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public y<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public y<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        ge.n.l(e10);
        ge.n.l(e11);
        ge.n.d(this.f19307c.compare(e10, e11) <= 0);
        return L(e10, z10, e11, z11);
    }

    public abstract y<E> L(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public y<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public y<E> tailSet(E e10, boolean z10) {
        return O(ge.n.l(e10), z10);
    }

    public abstract y<E> O(E e10, boolean z10);

    public int P(Object obj, Object obj2) {
        return Q(this.f19307c, obj, obj2);
    }

    @Override // java.util.SortedSet, he.v0
    public Comparator<? super E> comparator() {
        return this.f19307c;
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
