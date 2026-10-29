package p296n0;

import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0054c;
import p140g0.C5873d;

/* JADX INFO: renamed from: n0.i2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8769i2 extends InterfaceC8787l3 {

    /* JADX INFO: renamed from: m */
    public static final InterfaceC8795n1.a<Integer> f31882m = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.targetAspectRatio", C5873d.class);

    /* JADX INFO: renamed from: n */
    public static final InterfaceC8795n1.a<Integer> f31883n;

    /* JADX INFO: renamed from: o */
    public static final InterfaceC8795n1.a<Integer> f31884o;

    /* JADX INFO: renamed from: p */
    public static final InterfaceC8795n1.a<Integer> f31885p;

    /* JADX INFO: renamed from: q */
    public static final InterfaceC8795n1.a<Size> f31886q;

    /* JADX INFO: renamed from: r */
    public static final InterfaceC8795n1.a<Size> f31887r;

    /* JADX INFO: renamed from: s */
    public static final InterfaceC8795n1.a<Size> f31888s;

    /* JADX INFO: renamed from: t */
    public static final InterfaceC8795n1.a<List<Pair<Integer, Size[]>>> f31889t;

    /* JADX INFO: renamed from: u */
    public static final InterfaceC8795n1.a<C0054c> f31890u;

    /* JADX INFO: renamed from: v */
    public static final InterfaceC8795n1.a<List<Size>> f31891v;

    /* JADX INFO: renamed from: n0.i2$a */
    public interface a<B> {
        /* JADX INFO: renamed from: b */
        B mo24411b(C0054c c0054c);

        /* JADX INFO: renamed from: c */
        B mo24412c(int i10);

        /* JADX INFO: renamed from: d */
        B mo24413d(Size size);
    }

    static {
        Class cls = Integer.TYPE;
        f31883n = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.targetRotation", cls);
        f31884o = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.appTargetRotation", cls);
        f31885p = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.mirrorMode", cls);
        f31886q = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.targetResolution", Size.class);
        f31887r = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.defaultResolution", Size.class);
        f31888s = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.maxResolution", Size.class);
        f31889t = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.supportedResolutions", List.class);
        f31890u = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.resolutionSelector", C0054c.class);
        f31891v = InterfaceC8795n1.a.m35291a("camerax.core.imageOutput.customOrderedResolutions", List.class);
    }

    /* JADX INFO: renamed from: Y */
    static void m35182Y(InterfaceC8769i2 interfaceC8769i2) {
        boolean zM35183A = interfaceC8769i2.m35183A();
        boolean z10 = interfaceC8769i2.m35188V(null) != null;
        if (zM35183A && z10) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC8769i2.m35193q(null) != null) {
            if (zM35183A || z10) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* JADX INFO: renamed from: A */
    default boolean m35183A() {
        return mo35023a(f31882m);
    }

    /* JADX INFO: renamed from: C */
    default int m35184C() {
        return ((Integer) mo35027e(f31882m)).intValue();
    }

    /* JADX INFO: renamed from: J */
    default int m35185J(int i10) {
        return ((Integer) mo35030h(f31883n, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: N */
    default List<Size> m35186N(List<Size> list) {
        List list2 = (List) mo35030h(f31891v, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    default Size m35187R(Size size) {
        return (Size) mo35030h(f31887r, size);
    }

    /* JADX INFO: renamed from: V */
    default Size m35188V(Size size) {
        return (Size) mo35030h(f31886q, size);
    }

    /* JADX INFO: renamed from: g0 */
    default int m35189g0(int i10) {
        return ((Integer) mo35030h(f31885p, Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: i */
    default Size m35190i(Size size) {
        return (Size) mo35030h(f31888s, size);
    }

    /* JADX INFO: renamed from: l */
    default List<Pair<Integer, Size[]>> m35191l(List<Pair<Integer, Size[]>> list) {
        return (List) mo35030h(f31889t, list);
    }

    /* JADX INFO: renamed from: m */
    default C0054c m35192m() {
        return (C0054c) mo35027e(f31890u);
    }

    /* JADX INFO: renamed from: q */
    default C0054c m35193q(C0054c c0054c) {
        return (C0054c) mo35030h(f31890u, c0054c);
    }

    /* JADX INFO: renamed from: t */
    default int m35194t(int i10) {
        return ((Integer) mo35030h(f31884o, Integer.valueOf(i10))).intValue();
    }
}
