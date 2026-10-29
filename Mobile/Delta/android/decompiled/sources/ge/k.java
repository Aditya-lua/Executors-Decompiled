package ge;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k<T> implements Serializable {
    public static <T> k<T> a() {
        return a.e();
    }

    public static <T> k<T> d(T t8) {
        return new o(n.l(t8));
    }

    public abstract T b();

    public abstract boolean c();
}
