package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import p140g0.C5902k0;
import p296n0.InterfaceC8758g3;

/* JADX INFO: loaded from: classes.dex */
public class HdrRepeatingRequestFailureQuirk implements InterfaceC8758g3 {
    /* JADX INFO: renamed from: g */
    public static boolean m2296g() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "pa3q".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2297h() {
        return m2296g();
    }

    /* JADX INFO: renamed from: i */
    public boolean m2298i(C5902k0 c5902k0) {
        return m2296g() && (c5902k0 != C5902k0.f22550d);
    }
}
