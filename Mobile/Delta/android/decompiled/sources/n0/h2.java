package n0;

/* JADX INFO: loaded from: classes.dex */
public interface h2 extends l3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n1.a<Integer> f25491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n1.a<Integer> f25492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n1.a<g0.k0> f25493l;

    static {
        Class cls = Integer.TYPE;
        f25491j = n1.a.a("camerax.core.imageInput.inputFormat", cls);
        f25492k = n1.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f25493l = n1.a.a("camerax.core.imageInput.inputDynamicRange", g0.k0.class);
    }

    default g0.k0 M() {
        return (g0.k0) x2.g.g((g0.k0) h(f25493l, g0.k0.f18008c));
    }

    default boolean Q() {
        return a(f25493l);
    }

    default int Z() {
        return ((Integer) h(f25492k, 0)).intValue();
    }

    default int p() {
        return ((Integer) e(f25491j)).intValue();
    }
}
