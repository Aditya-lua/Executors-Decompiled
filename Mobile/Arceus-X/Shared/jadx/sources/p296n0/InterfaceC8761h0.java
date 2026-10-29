package p296n0;

import java.util.List;

/* JADX INFO: renamed from: n0.h0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8761h0 extends InterfaceC8787l3 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC8795n1.a<InterfaceC8777j4> f31854a = InterfaceC8795n1.a.m35291a("camerax.core.camera.useCaseConfigFactory", InterfaceC8777j4.class);

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8795n1.a<AbstractC8745e2> f31855b = InterfaceC8795n1.a.m35291a("camerax.core.camera.compatibilityId", AbstractC8745e2.class);

    /* JADX INFO: renamed from: c */
    public static final InterfaceC8795n1.a<Integer> f31856c = InterfaceC8795n1.a.m35291a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8795n1.a<InterfaceC8812q3> f31857d = InterfaceC8795n1.a.m35291a("camerax.core.camera.SessionProcessor", InterfaceC8812q3.class);

    /* JADX INFO: renamed from: e */
    public static final InterfaceC8795n1.a<Boolean> f31858e = InterfaceC8795n1.a.m35291a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: f */
    public static final InterfaceC8795n1.a<Boolean> f31859f = InterfaceC8795n1.a.m35291a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC8795n1.a<a> f31860g = InterfaceC8795n1.a.m35291a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* JADX INFO: renamed from: h */
    public static final InterfaceC8795n1.a<Boolean> f31861h = InterfaceC8795n1.a.m35291a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* JADX INFO: renamed from: i */
    public static final a f31862i = new a() { // from class: n0.g0
        @Override // p296n0.InterfaceC8761h0.a
        /* JADX INFO: renamed from: a */
        public final int mo35105a(int i10, List list) {
            return InterfaceC8761h0.m35132O(i10, list);
        }
    };

    /* JADX INFO: renamed from: n0.h0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo35105a(int i10, List<Integer> list);
    }

    /* JADX INFO: renamed from: O */
    static /* synthetic */ int m35132O(int i10, List list) {
        if (list.contains(35)) {
            return 35;
        }
        if (list.contains(256)) {
            return 256;
        }
        return list.contains(4101) ? 4101 : 0;
    }

    /* JADX INFO: renamed from: I */
    default a m35133I() {
        return (a) mo35030h(f31860g, f31862i);
    }

    /* JADX INFO: renamed from: U */
    default boolean m35134U() {
        return ((Boolean) mo35030h(f31859f, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: b0 */
    AbstractC8745e2 mo35135b0();

    /* JADX INFO: renamed from: c0 */
    default boolean m35136c0() {
        return ((Boolean) mo35030h(f31861h, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    default InterfaceC8777j4 m35137k() {
        return (InterfaceC8777j4) mo35030h(f31854a, InterfaceC8777j4.f31918a);
    }

    /* JADX INFO: renamed from: v */
    default int m35138v() {
        return ((Integer) mo35030h(f31856c, 0)).intValue();
    }

    /* JADX INFO: renamed from: w */
    default InterfaceC8812q3 m35139w(InterfaceC8812q3 interfaceC8812q3) {
        return (InterfaceC8812q3) mo35030h(f31857d, interfaceC8812q3);
    }
}
