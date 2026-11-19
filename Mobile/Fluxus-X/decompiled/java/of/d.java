package of;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) f(e0.b(cls));
    }

    <T> ag.b<Set<T>> b(e0<T> e0Var);

    default <T> Set<T> c(Class<T> cls) {
        return e(e0.b(cls));
    }

    default <T> ag.b<T> d(Class<T> cls) {
        return g(e0.b(cls));
    }

    default <T> Set<T> e(e0<T> e0Var) {
        return b(e0Var).get();
    }

    default <T> T f(e0<T> e0Var) {
        ag.b<T> bVarG = g(e0Var);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    <T> ag.b<T> g(e0<T> e0Var);
}
