package lf;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) f(e0.b(cls));
    }

    default <T> Set<T> b(Class<T> cls) {
        return e(e0.b(cls));
    }

    <T> xf.b<T> c(e0<T> e0Var);

    default <T> xf.b<T> d(Class<T> cls) {
        return c(e0.b(cls));
    }

    default <T> Set<T> e(e0<T> e0Var) {
        return g(e0Var).get();
    }

    default <T> T f(e0<T> e0Var) {
        xf.b<T> bVarC = c(e0Var);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    <T> xf.b<Set<T>> g(e0<T> e0Var);
}
