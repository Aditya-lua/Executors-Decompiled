package p296n0;

import p140g0.C5902k0;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.h2 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8763h2 extends InterfaceC8787l3 {

    /* JADX INFO: renamed from: j */
    public static final InterfaceC8795n1.a<Integer> f31863j;

    /* JADX INFO: renamed from: k */
    public static final InterfaceC8795n1.a<Integer> f31864k;

    /* JADX INFO: renamed from: l */
    public static final InterfaceC8795n1.a<C5902k0> f31865l;

    static {
        Class cls = Integer.TYPE;
        f31863j = InterfaceC8795n1.a.m35291a("camerax.core.imageInput.inputFormat", cls);
        f31864k = InterfaceC8795n1.a.m35291a("camerax.core.imageInput.secondaryInputFormat", cls);
        f31865l = InterfaceC8795n1.a.m35291a("camerax.core.imageInput.inputDynamicRange", C5902k0.class);
    }

    /* JADX INFO: renamed from: M */
    default C5902k0 m35143M() {
        return (C5902k0) C12637g.m47075g((C5902k0) mo35030h(f31865l, C5902k0.f22549c));
    }

    /* JADX INFO: renamed from: Q */
    default boolean m35144Q() {
        return mo35023a(f31865l);
    }

    /* JADX INFO: renamed from: Z */
    default int m35145Z() {
        return ((Integer) mo35030h(f31864k, 0)).intValue();
    }

    /* JADX INFO: renamed from: p */
    default int mo26767p() {
        return ((Integer) mo35027e(f31863j)).intValue();
    }
}
