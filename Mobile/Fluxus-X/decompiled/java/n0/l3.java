package n0;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface l3 extends n1 {
    @Override // n0.n1
    default boolean a(n1.a<?> aVar) {
        return n().a(aVar);
    }

    @Override // n0.n1
    default Set<n1.a<?>> b() {
        return n().b();
    }

    @Override // n0.n1
    default <ValueT> ValueT c(n1.a<ValueT> aVar, n1.c cVar) {
        return (ValueT) n().c(aVar, cVar);
    }

    @Override // n0.n1
    default void d(String str, n1.b bVar) {
        n().d(str, bVar);
    }

    @Override // n0.n1
    default <ValueT> ValueT e(n1.a<ValueT> aVar) {
        return (ValueT) n().e(aVar);
    }

    @Override // n0.n1
    default Set<n1.c> f(n1.a<?> aVar) {
        return n().f(aVar);
    }

    @Override // n0.n1
    default n1.c g(n1.a<?> aVar) {
        return n().g(aVar);
    }

    @Override // n0.n1
    default <ValueT> ValueT h(n1.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) n().h(aVar, valuet);
    }

    n1 n();
}
