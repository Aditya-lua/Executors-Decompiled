package f1;

import android.util.Range;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f15828a = new Range<>(0, Integer.MAX_VALUE);
    public static final a0 b;

    public static abstract class a {
        public abstract c2 a();

        public abstract a b(int i10);

        public abstract a c(Range<Integer> range);

        public abstract a d(int i10);

        public abstract a e(a0 a0Var);
    }

    static {
        x xVar = x.f16051c;
        b = a0.e(Arrays.asList(xVar, x.b, x.f16050a), p.a(xVar));
    }

    public static a a() {
        return new n.b().e(b).d(0).c(f15828a).b(-1);
    }

    public abstract int b();

    public abstract Range<Integer> c();

    public abstract int d();

    public abstract a0 e();

    public abstract a f();
}
