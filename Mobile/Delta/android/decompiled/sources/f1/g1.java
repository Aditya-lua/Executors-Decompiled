package f1;

import g0.v2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n0.a3;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f15856a = d(0, a.INACTIVE);
    public static final Set<Integer> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a3<g1> f15857c = n0.p1.f(d(0, a.ACTIVE));

    public enum a {
        ACTIVE,
        INACTIVE
    }

    public static g1 d(int i10, a aVar) {
        return new m(i10, aVar, null);
    }

    public static g1 e(int i10, a aVar, v2.h hVar) {
        return new m(i10, aVar, hVar);
    }

    public abstract int a();

    public abstract v2.h b();

    public abstract a c();
}
