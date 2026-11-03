package v0;

import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureFailedRetryQuirk f33246a = (CaptureFailedRetryQuirk) u0.b.b(CaptureFailedRetryQuirk.class);

    public int a() {
        CaptureFailedRetryQuirk captureFailedRetryQuirk = this.f33246a;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.g();
    }
}
