package eb;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = q1.f15359a;
            }
        } else {
            if (!(iterable instanceof a2)) {
                return false;
            }
            comparator2 = ((a2) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
