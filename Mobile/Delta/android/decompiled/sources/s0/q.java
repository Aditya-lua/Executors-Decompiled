package s0;

import n0.l3;
import n0.n1;

/* JADX INFO: loaded from: classes.dex */
public interface q<T> extends l3 {
    public static final n1.a<String> M = n1.a.a("camerax.core.target.name", String.class);
    public static final n1.a<Class<?>> N = n1.a.a("camerax.core.target.class", Class.class);

    default String a0() {
        return (String) e(M);
    }

    default String u(String str) {
        return (String) h(M, str);
    }
}
