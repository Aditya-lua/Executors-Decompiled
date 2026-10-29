package p100eb;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: eb.m1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4968m1 extends AbstractC4938h1 implements NavigableSet, InterfaceC4897a2 {

    /* JADX INFO: renamed from: c */
    public final transient Comparator f19696c;

    /* JADX INFO: renamed from: d */
    public transient AbstractC4968m1 f19697d;

    public AbstractC4968m1(Comparator comparator) {
        this.f19696c = comparator;
    }

    /* JADX INFO: renamed from: B */
    public static C5022v1 m23664B(Comparator comparator) {
        if (C4992q1.f19767a.equals(comparator)) {
            return C5022v1.f19830f;
        }
        AbstractC4915d2 abstractC4915d2 = AbstractC4920e1.f19644b;
        return new C5022v1(C5010t1.f19809e, comparator);
    }

    /* JADX INFO: renamed from: A */
    public abstract AbstractC4968m1 mo23665A(Object obj, boolean z10);

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet, p100eb.InterfaceC4897a2
    public final Comparator comparator() {
        return this.f19696c;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return mo23668x(obj, false);
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* JADX INFO: renamed from: t */
    public abstract AbstractC4968m1 mo23666t();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return mo23665A(obj, true);
    }

    /* JADX DEBUG: Method merged with bridge method: descendingSet()Ljava/util/NavigableSet; */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final AbstractC4968m1 descendingSet() {
        AbstractC4968m1 abstractC4968m1 = this.f19697d;
        if (abstractC4968m1 != null) {
            return abstractC4968m1;
        }
        AbstractC4968m1 abstractC4968m1Mo23666t = mo23666t();
        this.f19697d = abstractC4968m1Mo23666t;
        abstractC4968m1Mo23666t.f19697d = this;
        return abstractC4968m1Mo23666t;
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC4968m1 mo23668x(Object obj, boolean z10);

    /* JADX DEBUG: Method merged with bridge method: subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet; */
    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final AbstractC4968m1 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        C4973n0.m23679c(this.f19696c.compare(obj, obj2) <= 0);
        return mo23670z(obj, z10, obj2, z11);
    }

    /* JADX INFO: renamed from: z */
    public abstract AbstractC4968m1 mo23670z(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return mo23668x(obj, z10);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return mo23665A(obj, z10);
    }
}
