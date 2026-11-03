package n0;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i2 extends l3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n1.a<Integer> f25505m = n1.a.a("camerax.core.imageOutput.targetAspectRatio", g0.d.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n1.a<Integer> f25506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n1.a<Integer> f25507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n1.a<Integer> f25508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n1.a<Size> f25509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n1.a<Size> f25510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n1.a<Size> f25511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n1.a<List<Pair<Integer, Size[]>>> f25512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n1.a<a1.c> f25513u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n1.a<List<Size>> f25514v;

    public interface a<B> {
        B b(a1.c cVar);

        B c(int i10);

        B d(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f25506n = n1.a.a("camerax.core.imageOutput.targetRotation", cls);
        f25507o = n1.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f25508p = n1.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f25509q = n1.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f25510r = n1.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f25511s = n1.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f25512t = n1.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f25513u = n1.a.a("camerax.core.imageOutput.resolutionSelector", a1.c.class);
        f25514v = n1.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
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
        return a(f25505m);
    }

    default int C() {
        return ((Integer) e(f25505m)).intValue();
    }

    default int J(int i10) {
        return ((Integer) h(f25506n, Integer.valueOf(i10))).intValue();
    }

    default List<Size> N(List<Size> list) {
        List list2 = (List) h(f25514v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size R(Size size) {
        return (Size) h(f25510r, size);
    }

    default Size V(Size size) {
        return (Size) h(f25509q, size);
    }

    default int g0(int i10) {
        return ((Integer) h(f25508p, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) h(f25511s, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) h(f25512t, list);
    }

    default a1.c m() {
        return (a1.c) e(f25513u);
    }

    default a1.c q(a1.c cVar) {
        return (a1.c) h(f25513u, cVar);
    }

    default int t(int i10) {
        return ((Integer) h(f25507o, Integer.valueOf(i10))).intValue();
    }
}
