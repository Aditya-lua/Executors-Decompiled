package y7;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<T> {
    public static <T> d<T> e(T t8) {
        return new a(null, t8, e.DEFAULT, null);
    }

    public static <T> d<T> f(T t8, f fVar) {
        return new a(null, t8, e.DEFAULT, fVar);
    }

    public static <T> d<T> g(T t8) {
        return new a(null, t8, e.VERY_LOW, null);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract e c();

    public abstract f d();
}
