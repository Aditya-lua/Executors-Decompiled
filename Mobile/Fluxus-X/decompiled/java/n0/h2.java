package n0;

/* JADX INFO: loaded from: classes.dex */
public interface h2 extends l3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n1.a<Integer> f24968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n1.a<Integer> f24969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n1.a<g0.k0> f24970l;

    static {
        Class cls = Integer.TYPE;
        f24968j = n1.a.a("camerax.core.imageInput.inputFormat", cls);
        f24969k = n1.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f24970l = n1.a.a("camerax.core.imageInput.inputDynamicRange", g0.k0.class);
    }

    default g0.k0 M() {
        return (g0.k0) x2.g.g((g0.k0) h(f24970l, g0.k0.f16866c));
    }

    default boolean Q() {
        return a(f24970l);
    }

    default int Z() {
        return ((Integer) h(f24969k, 0)).intValue();
    }

    default int p() {
        return ((Integer) e(f24968j)).intValue();
    }
}
