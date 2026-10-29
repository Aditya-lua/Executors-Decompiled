package va;

import android.annotation.SuppressLint;
import android.util.Log;

/* JADX INFO: renamed from: va.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12144q0 {
    @SuppressLint({"LogTagMismatch"})
    /* JADX INFO: renamed from: a */
    public static int m44975a(String str) {
        if (m44976b(3)) {
            return Log.d("AppIndex", str);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44976b(int i10) {
        if (Log.isLoggable("AppIndex", i10)) {
            return true;
        }
        return Log.isLoggable("AppIndex", i10);
    }
}
