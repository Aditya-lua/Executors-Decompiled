package ie;

import java.util.Comparator;
import java.util.SortedSet;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6803w0 {
    /* JADX INFO: renamed from: a */
    public static <E> Comparator<? super E> m29145a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? AbstractC6783m0.m29017c() : comparator;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m29146b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C6384n.m27928l(comparator);
        C6384n.m27928l(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m29145a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof InterfaceC6801v0)) {
                return false;
            }
            comparator2 = ((InterfaceC6801v0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
