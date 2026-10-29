package n0;

/* JADX INFO: loaded from: classes.dex */
public interface h2 extends l3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n1.a<Integer> f24670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n1.a<Integer> f24671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n1.a<g0.k0> f24672l;

    static {
        Class cls = Integer.TYPE;
        f24670j = n1.a.a("camerax.core.imageInput.inputFormat", cls);
        f24671k = n1.a.a("camerax.core.imageInput.secondaryInputFormat", cls);
        f24672l = n1.a.a("camerax.core.imageInput.inputDynamicRange", g0.k0.class);
    }

    default g0.k0 M() {
        return (g0.k0) x2.g.g((g0.k0) h(f24672l, g0.k0.f17469c));
    }

    default boolean Q() {
        return a(f24672l);
    }

    default int Z() {
        return ((Integer) h(f24671k, 0)).intValue();
    }

    default int p() {
        return ((Integer) e(f24670j)).intValue();
    }
}
