package p063d0;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p296n0.C8782k3;

/* JADX INFO: renamed from: d0.y */
/* JADX INFO: loaded from: classes.dex */
public class C4394y {

    /* JADX INFO: renamed from: a */
    public final boolean f18255a;

    /* JADX INFO: renamed from: b */
    public final boolean f18256b;

    public C4394y(C8782k3 c8782k3) {
        this.f18255a = CaptureIntentPreviewQuirk.m2046d(c8782k3);
        this.f18256b = c8782k3.m35233a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    /* JADX INFO: renamed from: a */
    public Map<CaptureRequest.Key<?>, Object> m22066a(int i10) {
        if (i10 == 3 && this.f18255a) {
            HashMap map = new HashMap();
            map.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(map);
        }
        if (i10 != 4 || !this.f18256b) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        map2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(map2);
    }
}
