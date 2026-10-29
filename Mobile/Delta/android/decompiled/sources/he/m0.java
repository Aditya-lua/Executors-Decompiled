package he;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m0<T> implements Comparator<T> {
    public static <T> m0<T> a(Comparator<T> comparator) {
        return comparator instanceof m0 ? (m0) comparator : new l(comparator);
    }

    public static <C extends Comparable> m0<C> c() {
        return j0.f19240a;
    }

    public <E extends T> t<E> b(Iterable<E> iterable) {
        return t.G(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t8, T t10);

    public <T2 extends T> m0<Map.Entry<T2, ?>> d() {
        return (m0<Map.Entry<T2, ?>>) e(f0.c());
    }

    public <F> m0<F> e(ge.f<F, ? extends T> fVar) {
        return new f(fVar, this);
    }
}
