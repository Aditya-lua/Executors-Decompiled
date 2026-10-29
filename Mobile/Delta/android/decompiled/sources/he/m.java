package he;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static <T, S extends T> Comparator<Iterable<S>> a(Comparator<T> comparator) {
        return new c0((Comparator) ge.n.l(comparator));
    }

    public static <T extends Comparable<? super T>> T b(T t8, T t10) {
        return t8.compareTo(t10) >= 0 ? t8 : t10;
    }
}
