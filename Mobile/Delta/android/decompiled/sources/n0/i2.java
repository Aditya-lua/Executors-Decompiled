package n0;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i2 extends l3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final n1.a<Integer> f24684m = n1.a.a("camerax.core.imageOutput.targetAspectRatio", g0.d.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n1.a<Integer> f24685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final n1.a<Integer> f24686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n1.a<Integer> f24687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final n1.a<Size> f24688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final n1.a<Size> f24689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final n1.a<Size> f24690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n1.a<List<Pair<Integer, Size[]>>> f24691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n1.a<a1.c> f24692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n1.a<List<Size>> f24693v;

    public interface a<B> {
        B b(a1.c cVar);

        B c(int i10);

        B d(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f24685n = n1.a.a("camerax.core.imageOutput.targetRotation", cls);
        f24686o = n1.a.a("camerax.core.imageOutput.appTargetRotation", cls);
        f24687p = n1.a.a("camerax.core.imageOutput.mirrorMode", cls);
        f24688q = n1.a.a("camerax.core.imageOutput.targetResolution", Size.class);
        f24689r = n1.a.a("camerax.core.imageOutput.defaultResolution", Size.class);
        f24690s = n1.a.a("camerax.core.imageOutput.maxResolution", Size.class);
        f24691t = n1.a.a("camerax.core.imageOutput.supportedResolutions", List.class);
        f24692u = n1.a.a("camerax.core.imageOutput.resolutionSelector", a1.c.class);
        f24693v = n1.a.a("camerax.core.imageOutput.customOrderedResolutions", List.class);
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
        return a(f24684m);
    }

    default int C() {
        return ((Integer) e(f24684m)).intValue();
    }

    default int J(int i10) {
        return ((Integer) h(f24685n, Integer.valueOf(i10))).intValue();
    }

    default List<Size> N(List<Size> list) {
        List list2 = (List) h(f24693v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    default Size R(Size size) {
        return (Size) h(f24689r, size);
    }

    default Size V(Size size) {
        return (Size) h(f24688q, size);
    }

    default int g0(int i10) {
        return ((Integer) h(f24687p, Integer.valueOf(i10))).intValue();
    }

    default Size i(Size size) {
        return (Size) h(f24690s, size);
    }

    default List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list) {
        return (List) h(f24691t, list);
    }

    default a1.c m() {
        return (a1.c) e(f24692u);
    }

    default a1.c q(a1.c cVar) {
        return (a1.c) h(f24692u, cVar);
    }

    default int t(int i10) {
        return ((Integer) h(f24686o, Integer.valueOf(i10))).intValue();
    }
}
