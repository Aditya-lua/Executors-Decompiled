package n0;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i2 extends l3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n1.a<Integer> f24982m = n1.a.a("camerax.core.imageOutput.targetAspectRatio", g0.d.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n1.a<Integer> f24983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n1.a<Integer> f24984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n1.a<Integer> f24985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n1.a<Size> f24986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n1.a<Size> f24987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n1.a<Size> f24988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n1.a<List<Pair<Integer, Size[]>>> f24989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n1.a<a1.c> f24990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n1.a<List<Size>> f24991v;

    public interface a<B> {
        B b(a1.c cVar);

        B c(int i10);

        B d(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f24983n = n1.a.a("camerax.core.imageOutput.targetRotation", cls);
        f24984o = n1.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f24985p = n1.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f24986q = n1.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f24987r = n1.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f24988s = n1.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f24989t = n1.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f24990u = n1.a.a("camerax.core.imageOutput.resolutionSelector", a1.c.class);
        f24991v = n1.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    static void Y(i2 i2Var) {
        boolean zA = i2Var.A();
        boolean z10 = i2Var.V(null) != null;
        if (zA && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (i2Var.q(null) != null) {
            if (zA || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default boolean A() {
        return a(f24982m);
    }

    default int C() {
        return ((Integer) e(f24982m)).intValue();
    }

    default int J(int i10) {
        return ((Integer) h(f24983n, Integer.valueOf(i10))).intValue();
    }

    default List<Size> N(List<Size> list) {
        List list2 = (List) h(f24991v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size R(Size size) {
        return (Size) h(f24987r, size);
    }

    default Size V(Size size) {
        return (Size) h(f24986q, size);
    }

    default int g0(int i10) {
        return ((Integer) h(f24985p, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) h(f24988s, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) h(f24989t, list);
    }

    default a1.c m() {
        return (a1.c) e(f24990u);
    }

    default a1.c q(a1.c cVar) {
        return (a1.c) h(f24990u, cVar);
    }

    default int t(int i10) {
        return ((Integer) h(f24984o, Integer.valueOf(i10))).intValue();
    }
}
