package f1;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f14873a = new Range<>(0, Integer.MAX_VALUE);
    public static final Range<Integer> b = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14874c = a().c(0).a();

    /* JADX INFO: renamed from: f1.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0287a {
        public abstract a a();

        public abstract AbstractC0287a b(Range<Integer> range);

        public abstract AbstractC0287a c(int i10);

        public abstract AbstractC0287a d(Range<Integer> range);

        public abstract AbstractC0287a e(int i10);
    }

    public static AbstractC0287a a() {
        return new c.b().f(-1).e(-1).c(-1).b(f14873a).d(b);
    }

    public abstract Range<Integer> b();

    public abstract int c();

    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
