package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001a0.C0008c0;
import p001a0.C0044u0;
import p140g0.C5931r1;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class CamcorderProfileResolutionQuirk implements InterfaceC8758g3 {

    /* JADX INFO: renamed from: a */
    public final C0044u0 f1729a;

    /* JADX INFO: renamed from: b */
    public List<Size> f1730b = null;

    public CamcorderProfileResolutionQuirk(C0008c0 c0008c0) {
        this.f1729a = c0008c0.m13e();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2043h(C0008c0 c0008c0) {
        Integer num = (Integer) c0008c0.m9a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    /* JADX INFO: renamed from: g */
    public List<Size> m2044g() {
        if (this.f1730b == null) {
            Size[] sizeArrM95g = this.f1729a.m95g(34);
            this.f1730b = sizeArrM95g != null ? Arrays.asList((Size[]) sizeArrM95g.clone()) : Collections.EMPTY_LIST;
            C5931r1.m26561a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + this.f1730b);
        }
        return new ArrayList(this.f1730b);
    }
}
