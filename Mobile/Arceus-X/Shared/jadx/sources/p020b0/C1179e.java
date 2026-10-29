package p020b0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import java.util.Set;
import p001a0.C0008c0;
import p140g0.C5902k0;
import p533x2.C12637g;
import p561y.C12969f;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1179e {

    /* JADX INFO: renamed from: a */
    public final a f4922a;

    /* JADX INFO: renamed from: b0.e$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        DynamicRangeProfiles mo6547a();

        /* JADX INFO: renamed from: c */
        Set<C5902k0> mo6548c();

        /* JADX INFO: renamed from: d */
        Set<C5902k0> mo6549d(C5902k0 c5902k0);
    }

    public C1179e(a aVar) {
        this.f4922a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static C1179e m6542a(C0008c0 c0008c0) {
        C1179e c1179eM6543e = Build.VERSION.SDK_INT >= 33 ? m6543e(C12969f.m48227a(c0008c0.m9a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return c1179eM6543e == null ? C1181g.f4924a : c1179eM6543e;
    }

    /* JADX INFO: renamed from: e */
    public static C1179e m6543e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        C12637g.m47078j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new C1179e(new C1180f(dynamicRangeProfiles));
    }

    /* JADX INFO: renamed from: b */
    public Set<C5902k0> m6544b(C5902k0 c5902k0) {
        return this.f4922a.mo6549d(c5902k0);
    }

    /* JADX INFO: renamed from: c */
    public Set<C5902k0> m6545c() {
        return this.f4922a.mo6548c();
    }

    /* JADX INFO: renamed from: d */
    public DynamicRangeProfiles m6546d() {
        C12637g.m47078j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f4922a.mo6547a();
    }
}
