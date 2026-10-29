package eb;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends h1 implements NavigableSet, a2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Comparator f15303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient m1 f15304d;

    public m1(Comparator comparator) {
        this.f15303c = comparator;
    }

    public static v1 B(Comparator comparator) {
        if (q1.f15359a.equals(comparator)) {
            return v1.f15416f;
        }
        d2 d2Var = e1.b;
        return new v1(t1.f15397e, comparator);
    }

    public abstract m1 A(Object obj, boolean z10);

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet, eb.a2
    public final Comparator comparator() {
        return this.f15303c;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return x(obj, false);
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

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract m1 t();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return A(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final m1 descendingSet() {
        m1 m1Var = this.f15304d;
        if (m1Var != null) {
            return m1Var;
        }
        m1 m1VarT = t();
        this.f15304d = m1VarT;
        m1VarT.f15304d = this;
        return m1VarT;
    }

    public abstract m1 x(Object obj, boolean z10);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final m1 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        n0.c(this.f15303c.compare(obj, obj2) <= 0);
        return z(obj, z10, obj2, z11);
    }

    public abstract m1 z(Object obj, boolean z10, Object obj2, boolean z11);

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return x(obj, z10);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return A(obj, z10);
    }
}
