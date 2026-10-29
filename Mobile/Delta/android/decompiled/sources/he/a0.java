package he;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    public static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : d0.g(iterable.iterator());
    }

    public static Object[] b(Iterable<?> iterable) {
        return a(iterable).toArray();
    }

    public static String c(Iterable<?> iterable) {
        return b0.f(iterable.iterator());
    }
}
