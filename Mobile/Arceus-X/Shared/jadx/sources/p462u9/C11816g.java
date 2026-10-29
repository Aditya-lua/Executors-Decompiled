package p462u9;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import p305n9.C8953m;

/* JADX INFO: renamed from: u9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C11816g {

    /* JADX INFO: renamed from: a */
    public static final String[] f41569a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* JADX INFO: renamed from: a */
    public static boolean m44179a(@NonNull Context context, @NonNull Throwable th2) {
        try {
            C8953m.m36047l(context);
            C8953m.m36047l(th2);
            return false;
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
