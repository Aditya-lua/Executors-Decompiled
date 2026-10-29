package ie;

import java.util.Comparator;
import java.util.Map;
import p169he.InterfaceC6376f;

/* JADX INFO: renamed from: ie.m0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6783m0<T> implements Comparator<T> {
    /* JADX INFO: renamed from: a */
    public static <T> AbstractC6783m0<T> m29016a(Comparator<T> comparator) {
        return comparator instanceof AbstractC6783m0 ? (AbstractC6783m0) comparator : new C6780l(comparator);
    }

    /* JADX INFO: renamed from: c */
    public static <C extends Comparable> AbstractC6783m0<C> m29017c() {
        return C6777j0.f26670a;
    }

    /* JADX INFO: renamed from: b */
    public <E extends T> AbstractC6796t<E> m29018b(Iterable<E> iterable) {
        return AbstractC6796t.m29088G(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t8, T t10);

    /* JADX INFO: renamed from: d */
    public <T2 extends T> AbstractC6783m0<Map.Entry<T2, ?>> m29019d() {
        return (AbstractC6783m0<Map.Entry<T2, ?>>) m29020e(C6769f0.m28900c());
    }

    /* JADX INFO: renamed from: e */
    public <F> AbstractC6783m0<F> m29020e(InterfaceC6376f<F, ? extends T> interfaceC6376f) {
        return new C6768f(interfaceC6376f, this);
    }
}
