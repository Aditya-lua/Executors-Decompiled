package ie;

import java.util.Collection;

/* JADX INFO: renamed from: ie.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6759a0 {
    /* JADX INFO: renamed from: a */
    public static <E> Collection<E> m28874a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C6765d0.m28896g(iterable.iterator());
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m28875b(Iterable<?> iterable) {
        return m28874a(iterable).toArray();
    }

    /* JADX INFO: renamed from: c */
    public static String m28876c(Iterable<?> iterable) {
        return C6761b0.m28886f(iterable.iterator());
    }
}
