package androidx.camera.camera2.internal.compat.quirk;

import a0.c0;
import a0.u0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import g0.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f1322a;
    public List<Size> b = null;

    public CamcorderProfileResolutionQuirk(c0 c0Var) {
        this.f1322a = c0Var.e();
    }

    public static boolean h(c0 c0Var) {
        Integer num = (Integer) c0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> g() {
        if (this.b == null) {
            Size[] sizeArrG = this.f1322a.g(34);
            this.b = sizeArrG != null ? Arrays.asList((Size[]) sizeArrG.clone()) : Collections.EMPTY_LIST;
            r1.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.b);
        }
        return new ArrayList(this.b);
    }
}
