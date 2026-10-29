package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import g0.k0;
import n0.g3;

/* JADX INFO: loaded from: classes.dex */
public class HdrRepeatingRequestFailureQuirk implements g3 {
    public static boolean g() {
        return Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.BRAND) && "pa3q".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean h() {
        return g();
    }

    public boolean i(k0 k0Var) {
        return g() && (k0Var != k0.f17470d);
    }
}
