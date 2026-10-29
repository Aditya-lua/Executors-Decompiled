package ie;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import p001a0.C0008c0;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6806y<E> extends AbstractC6808z<E> implements NavigableSet<E>, InterfaceC6801v0<E> {

    /* JADX INFO: renamed from: c */
    public final transient Comparator<? super E> f26748c;

    /* JADX INFO: renamed from: d */
    public transient AbstractC6806y<E> f26749d;

    public AbstractC6806y(Comparator<? super E> comparator) {
        this.f26748c = comparator;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static <E> AbstractC6806y<E> m29156A(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return m29159F(comparator);
        }
        C6781l0.m29011c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            C0008c0.a aVar = (Object) eArr[i12];
            if (comparator.compare(aVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = aVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new C6795s0(AbstractC6796t.m29090i(eArr, i11), comparator);
    }

    /* JADX INFO: renamed from: B */
    public static <E> AbstractC6806y<E> m29157B(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C6384n.m27928l(comparator);
        if (C6803w0.m29146b(comparator, iterable) && (iterable instanceof AbstractC6806y)) {
            AbstractC6806y<E> abstractC6806y = (AbstractC6806y) iterable;
            if (!abstractC6806y.mo29035f()) {
                return abstractC6806y;
            }
        }
        Object[] objArrM28875b = C6759a0.m28875b(iterable);
        return m29156A(comparator, objArrM28875b.length, objArrM28875b);
    }

    /* JADX INFO: renamed from: C */
    public static <E> AbstractC6806y<E> m29158C(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return m29157B(comparator, collection);
    }

    /* JADX INFO: renamed from: F */
    public static <E> C6795s0<E> m29159F(Comparator<? super E> comparator) {
        return AbstractC6783m0.m29017c().equals(comparator) ? (C6795s0<E>) C6795s0.f26709f : new C6795s0<>(AbstractC6796t.m29097z(), comparator);
    }

    /* JADX INFO: renamed from: Q */
    public static int m29160Q(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX INFO: renamed from: D */
    public abstract AbstractC6806y<E> mo29073D();

    /* JADX DEBUG: Method merged with bridge method: descendingSet()Ljava/util/NavigableSet; */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> descendingSet() {
        AbstractC6806y<E> abstractC6806y = this.f26749d;
        if (abstractC6806y != null) {
            return abstractC6806y;
        }
        AbstractC6806y<E> abstractC6806yMo29073D = mo29073D();
        this.f26749d = abstractC6806yMo29073D;
        abstractC6806yMo29073D.f26749d = this;
        return abstractC6806yMo29073D;
    }

    /* JADX DEBUG: Method merged with bridge method: headSet(Ljava/lang/Object;)Ljava/util/SortedSet; */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX DEBUG: Method merged with bridge method: headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ie.y<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> headSet(E e10, boolean z10) {
        return mo29074I(C6384n.m27928l(e10), z10);
    }

    /* JADX INFO: renamed from: I */
    public abstract AbstractC6806y<E> mo29074I(E e10, boolean z10);

    /* JADX DEBUG: Method merged with bridge method: subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet; */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    /* JADX DEBUG: Method merged with bridge method: subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet; */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        C6384n.m27928l(e10);
        C6384n.m27928l(e11);
        C6384n.m27920d(this.f26748c.compare(e10, e11) <= 0);
        return mo29075L(e10, z10, e11, z11);
    }

    /* JADX INFO: renamed from: L */
    public abstract AbstractC6806y<E> mo29075L(E e10, boolean z10, E e11, boolean z11);

    /* JADX DEBUG: Method merged with bridge method: tailSet(Ljava/lang/Object;)Ljava/util/SortedSet; */
    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX DEBUG: Method merged with bridge method: tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ie.y<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC6806y<E> tailSet(E e10, boolean z10) {
        return mo29076O(C6384n.m27928l(e10), z10);
    }

    /* JADX INFO: renamed from: O */
    public abstract AbstractC6806y<E> mo29076O(E e10, boolean z10);

    /* JADX INFO: renamed from: P */
    public int m29168P(Object obj, Object obj2) {
        return m29160Q(this.f26748c, obj, obj2);
    }

    @Override // java.util.SortedSet, ie.InterfaceC6801v0
    public Comparator<? super E> comparator() {
        return this.f26748c;
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
