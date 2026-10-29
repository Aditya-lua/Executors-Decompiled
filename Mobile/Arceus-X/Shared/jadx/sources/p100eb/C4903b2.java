package p100eb;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: renamed from: eb.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4903b2 {
    /* JADX INFO: renamed from: a */
    public static boolean m23555a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C4992q1.f19767a;
            }
        } else {
            if (!(iterable instanceof InterfaceC4897a2)) {
                return false;
            }
            comparator2 = ((InterfaceC4897a2) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
