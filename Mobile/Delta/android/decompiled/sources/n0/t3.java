package n0;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f24861a = new Range<>(0, 0);

    public static abstract class a {
        public abstract t3 a();

        public abstract a b(g0.k0 k0Var);

        public abstract a c(Range<Integer> range);

        public abstract a d(n1 n1Var);

        public abstract a e(Size size);

        public abstract a f(Size size);

        public abstract a g(int i10);

        public abstract a h(boolean z10);
    }

    public static a a(Size size) {
        return new s.b().f(size).e(size).g(0).c(f24861a).b(g0.k0.f17470d).h(false);
    }

    public abstract g0.k0 b();

    public abstract Range<Integer> c();

    public abstract n1 d();

    public abstract Size e();

    public abstract Size f();

    public abstract int g();

    public abstract boolean h();

    public abstract a i();
}
