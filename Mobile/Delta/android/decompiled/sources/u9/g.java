package u9;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f32093a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(@NonNull Context context, @NonNull Throwable th2) {
        try {
            n9.m.l(context);
            n9.m.l(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
