package n0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface q3 {

    public interface a {
    }

    void a();

    int b(boolean z10, z3 z3Var, a aVar);

    void c();

    void d();

    default Set<Integer> e() {
        return Collections.EMPTY_SET;
    }

    default Map<Integer, List<Size>> f(Size size) {
        return Collections.EMPTY_MAP;
    }

    void g(n1 n1Var);

    default List<Pair<CameraCharacteristics.Key, Object>> h() {
        return Collections.EMPTY_LIST;
    }

    o3 i(g0.t tVar, e3 e3Var);

    default Range<Float> j() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (Pair<CameraCharacteristics.Key, Object> pair : h()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                return (Range) pair.second;
            }
        }
        return null;
    }

    void k(m3 m3Var);

    int l(z3 z3Var, a aVar);

    default int[] m() {
        for (Pair<CameraCharacteristics.Key, Object> pair : h()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                return (int[]) pair.second;
            }
        }
        return null;
    }

    default int n(n1 n1Var, z3 z3Var, a aVar) {
        return -1;
    }
}
