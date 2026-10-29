package n0;

import android.util.Size;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class x3 {
    public static x3 a(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4, Map<Integer, Size> map5, Map<Integer, Size> map6) {
        return new t(size, map, size2, map2, size3, map3, map4, map5, map6);
    }

    public abstract Size b();

    public Size c(int i10) {
        return h().get(Integer.valueOf(i10));
    }

    public abstract Map<Integer, Size> d();

    public Size e(int i10) {
        return h().get(Integer.valueOf(i10));
    }

    public abstract Map<Integer, Size> f();

    public Size g(int i10) {
        return h().get(Integer.valueOf(i10));
    }

    public abstract Map<Integer, Size> h();

    public abstract Size i();

    public abstract Size j();

    public Size k(int i10) {
        return l().get(Integer.valueOf(i10));
    }

    public abstract Map<Integer, Size> l();

    public Size m(int i10) {
        return n().get(Integer.valueOf(i10));
    }

    public abstract Map<Integer, Size> n();

    public Size o(int i10) {
        return p().get(Integer.valueOf(i10));
    }

    public abstract Map<Integer, Size> p();
}
