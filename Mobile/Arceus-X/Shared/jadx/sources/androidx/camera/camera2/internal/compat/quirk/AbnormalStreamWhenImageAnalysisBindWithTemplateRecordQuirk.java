package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    /* JADX INFO: renamed from: g */
    public static boolean m2033g() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && Build.DEVICE.equalsIgnoreCase("m55xq");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2034h() {
        return m2033g();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    /* JADX INFO: renamed from: b */
    public boolean mo2035b() {
        return m2033g();
    }
}
