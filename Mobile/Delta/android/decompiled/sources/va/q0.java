package va;

import android.annotation.SuppressLint;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    @SuppressLint({"LogTagMismatch"})
    public static int a(String str) {
        if (b(3)) {
            return Log.d("AppIndex", str);
        }
        return 0;
    }

    public static boolean b(int i10) {
        if (Log.isLoggable("AppIndex", i10)) {
            return true;
        }
        return Log.isLoggable("AppIndex", i10);
    }
}
