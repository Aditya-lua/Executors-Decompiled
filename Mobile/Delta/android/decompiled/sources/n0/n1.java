package n0;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface n1 {

    public static abstract class a<T> {
        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new j(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static n1 L(n1 n1Var, n1 n1Var2) {
        if (n1Var == null && n1Var2 == null) {
            return c3.i0();
        }
        x2 x2VarL0 = n1Var2 != null ? x2.l0(n1Var2) : x2.k0();
        if (n1Var != null) {
            Iterator<a<?>> it = n1Var.b().iterator();
            while (it.hasNext()) {
                P(x2VarL0, n1Var2, n1Var, it.next());
            }
        }
        return c3.j0(x2VarL0);
    }

    static void P(x2 x2Var, n1 n1Var, n1 n1Var2, a<?> aVar) {
        if (!Objects.equals(aVar, i2.f24692u)) {
            x2Var.D(aVar, n1Var2.g(aVar), n1Var2.e(aVar));
            return;
        }
        a1.c cVar = (a1.c) n1Var2.h(aVar, null);
        x2Var.D(aVar, n1Var2.g(aVar), p0.w.a((a1.c) n1Var.h(aVar, null), cVar));
    }

    static boolean y(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    boolean a(a<?> aVar);

    Set<a<?>> b();

    <ValueT> ValueT c(a<ValueT> aVar, c cVar);

    void d(String str, b bVar);

    <ValueT> ValueT e(a<ValueT> aVar);

    Set<c> f(a<?> aVar);

    c g(a<?> aVar);

    <ValueT> ValueT h(a<ValueT> aVar, ValueT valuet);
}
