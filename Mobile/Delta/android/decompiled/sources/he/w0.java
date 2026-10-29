package he;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? m0.c() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        ge.n.l(comparator);
        ge.n.l(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof v0)) {
                return false;
            }
            comparator2 = ((v0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
