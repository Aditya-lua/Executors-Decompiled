package p296n0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p140g0.InterfaceC5937t;

/* JADX INFO: renamed from: n0.q3 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8812q3 {

    /* JADX INFO: renamed from: n0.q3$a */
    public interface a {
    }

    /* JADX INFO: renamed from: a */
    void m35375a();

    /* JADX INFO: renamed from: b */
    int m35376b(boolean z10, C8857z3 c8857z3, a aVar);

    /* JADX INFO: renamed from: c */
    void m35377c();

    /* JADX INFO: renamed from: d */
    void m35378d();

    /* JADX INFO: renamed from: e */
    default Set<Integer> m35379e() {
        return Collections.EMPTY_SET;
    }

    /* JADX INFO: renamed from: f */
    default Map<Integer, List<Size>> m35380f(Size size) {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: g */
    void m35381g(InterfaceC8795n1 interfaceC8795n1);

    /* JADX INFO: renamed from: h */
    default List<Pair<CameraCharacteristics.Key, Object>> m35382h() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: i */
    C8802o3 m35383i(InterfaceC5937t interfaceC5937t, AbstractC8746e3 abstractC8746e3);

    /* JADX INFO: renamed from: j */
    default Range<Float> m35384j() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (Pair<CameraCharacteristics.Key, Object> pair : m35382h()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                return (Range) pair.second;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    void m35385k(InterfaceC8792m3 interfaceC8792m3);

    /* JADX INFO: renamed from: l */
    int m35386l(C8857z3 c8857z3, a aVar);

    /* JADX INFO: renamed from: m */
    default int[] m35387m() {
        for (Pair<CameraCharacteristics.Key, Object> pair : m35382h()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                return (int[]) pair.second;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    default int m35388n(InterfaceC8795n1 interfaceC8795n1, C8857z3 c8857z3, a aVar) {
        return -1;
    }
}
