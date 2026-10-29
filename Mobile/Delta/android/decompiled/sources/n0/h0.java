package n0;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface h0 extends l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1.a<j4> f24662a = n1.a.a("camerax.core.camera.useCaseConfigFactory", j4.class);
    public static final n1.a<e2> b = n1.a.a("camerax.core.camera.compatibilityId", e2.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1.a<Integer> f24663c = n1.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n1.a<q3> f24664d = n1.a.a("camerax.core.camera.SessionProcessor", q3.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n1.a<Boolean> f24665e = n1.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n1.a<Boolean> f24666f = n1.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n1.a<a> f24667g = n1.a.a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n1.a<Boolean> f24668h = n1.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f24669i = new a() { // from class: n0.g0
        @Override // n0.h0.a
        public final int a(int i10, List list) {
            return h0.O(i10, list);
        }
    };

    public interface a {
        int a(int i10, List<Integer> list);
    }

    static /* synthetic */ int O(int i10, List list) {
        if (list.contains(35)) {
            return 35;
        }
        if (list.contains(Integer.valueOf(Barcode.FORMAT_QR_CODE))) {
            return Barcode.FORMAT_QR_CODE;
        }
        return list.contains(4101) ? 4101 : 0;
    }

    default a I() {
        return (a) h(f24667g, f24669i);
    }

    default boolean U() {
        return ((Boolean) h(f24666f, Boolean.FALSE)).booleanValue();
    }

    e2 b0();

    default boolean c0() {
        return ((Boolean) h(f24668h, Boolean.FALSE)).booleanValue();
    }

    default j4 k() {
        return (j4) h(f24662a, j4.f24707a);
    }

    default int v() {
        return ((Integer) h(f24663c, 0)).intValue();
    }

    default q3 w(q3 q3Var) {
        return (q3) h(f24664d, q3Var);
    }
}
