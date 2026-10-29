package b0;

import a0.c0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import g0.k0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f3761a;

    public interface a {
        DynamicRangeProfiles a();

        Set<k0> c();

        Set<k0> d(k0 k0Var);
    }

    public e(a aVar) {
        this.f3761a = aVar;
    }

    public static e a(c0 c0Var) {
        e eVarE = Build.VERSION.SDK_INT >= 33 ? e(y.f.a(c0Var.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return eVarE == null ? g.f3763a : eVarE;
    }

    public static e e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        x2.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new e(new f(dynamicRangeProfiles));
    }

    public Set<k0> b(k0 k0Var) {
        return this.f3761a.d(k0Var);
    }

    public Set<k0> c() {
        return this.f3761a.c();
    }

    public DynamicRangeProfiles d() {
        x2.g.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f3761a.a();
    }
}
