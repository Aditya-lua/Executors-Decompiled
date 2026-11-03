package mf;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public interface d {
    default <T> T a(Class<T> cls) {
        return (T) f(e0.b(cls));
    }

    default <T> Set<T> b(e0<T> e0Var) {
        return e(e0Var).get();
    }

    <T> yf.b<T> c(e0<T> e0Var);

    default <T> Set<T> d(Class<T> cls) {
        return b(e0.b(cls));
    }

    <T> yf.b<Set<T>> e(e0<T> e0Var);

    default <T> T f(e0<T> e0Var) {
        yf.b<T> bVarC = c(e0Var);
        if (bVarC == null) {
            return null;
        }
        return bVarC.get();
    }

    default <T> yf.b<T> g(Class<T> cls) {
        return c(e0.b(cls));
    }
}
