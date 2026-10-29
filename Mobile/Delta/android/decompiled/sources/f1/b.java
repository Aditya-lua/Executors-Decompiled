package f1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Integer> f15806a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    public static b e(int i10, Throwable th2, double d10, long j10) {
        return new d(i10, d10, j10, th2);
    }

    public abstract double a();

    public abstract long b();

    public abstract int c();

    public abstract Throwable d();
}
