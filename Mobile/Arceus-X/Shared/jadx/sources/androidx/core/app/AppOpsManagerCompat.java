package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    private AppOpsManagerCompat() {
    }

    @Nullable
    public static String permissionToOp(@NonNull String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(permission);
        }
        return null;
    }

    public static int noteOp(@NonNull Context context, @NonNull String op2, int uid, @NonNull String packageName) {
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            return appOpsManager.noteOp(op2, uid, packageName);
        }
        return 1;
    }

    public static int noteOpNoThrow(@NonNull Context context, @NonNull String op2, int uid, @NonNull String packageName) {
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            return appOpsManager.noteOpNoThrow(op2, uid, packageName);
        }
        return 1;
    }

    public static int noteProxyOp(@NonNull Context context, @NonNull String op2, @NonNull String proxiedPackageName) {
        if (Build.VERSION.SDK_INT >= 23) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            return appOpsManager.noteProxyOp(op2, proxiedPackageName);
        }
        return 1;
    }

    public static int noteProxyOpNoThrow(@NonNull Context context, @NonNull String op2, @NonNull String proxiedPackageName) {
        if (Build.VERSION.SDK_INT >= 23) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            return appOpsManager.noteProxyOpNoThrow(op2, proxiedPackageName);
        }
        return 1;
    }
}
