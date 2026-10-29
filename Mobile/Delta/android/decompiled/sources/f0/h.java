package f0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import g0.t;
import java.util.List;
import n0.o0;
import n0.q3;
import z.n2;
import z.z0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f15795a;
    public n2 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Pair<CameraCharacteristics.Key, Object>> f15796c;

    public h(z0 z0Var) {
        this.f15795a = z0Var;
    }

    public static h a(t tVar) {
        q3 q3VarE;
        if (tVar instanceof n2) {
            return ((n2) tVar).B();
        }
        o0 o0VarQ = ((o0) tVar).q();
        x2.g.b(o0VarQ instanceof z0, "CameraInfo doesn't contain Camera2 implementation.");
        h hVarB = ((z0) o0VarQ).B();
        return (!(tVar instanceof n0.e) || (q3VarE = ((n0.e) tVar).E()) == null) ? hVarB : new h(hVarB.f15795a, q3VarE.h());
    }

    public <T> T b(CameraCharacteristics.Key<T> key) {
        List<Pair<CameraCharacteristics.Key, Object>> list = this.f15796c;
        if (list != null) {
            for (Pair<CameraCharacteristics.Key, Object> pair : list) {
                if (((CameraCharacteristics.Key) pair.first).equals(key)) {
                    return (T) pair.second;
                }
            }
        }
        return (T) this.f15795a.C().a(key);
    }

    public String c() {
        return this.f15795a.e();
    }

    public h(z0 z0Var, List<Pair<CameraCharacteristics.Key, Object>> list) {
        this.f15795a = z0Var;
        this.f15796c = list;
    }
}
