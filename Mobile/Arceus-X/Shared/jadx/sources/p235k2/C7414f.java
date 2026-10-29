package p235k2;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* JADX INFO: renamed from: k2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7414f {

    /* JADX INFO: renamed from: k2.f$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static <T> T m30722a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* JADX INFO: renamed from: b */
        public static int m30723b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* JADX INFO: renamed from: c */
        public static String m30724c(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* JADX INFO: renamed from: k2.f$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m30725a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        /* JADX INFO: renamed from: b */
        public static String m30726b(Context context) {
            return context.getOpPackageName();
        }

        /* JADX INFO: renamed from: c */
        public static AppOpsManager m30727c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m30719a(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m30720b(context, str, str2);
        }
        AppOpsManager appOpsManagerM30727c = b.m30727c(context);
        int iM30725a = b.m30725a(appOpsManagerM30727c, str, Binder.getCallingUid(), str2);
        return iM30725a != 0 ? iM30725a : b.m30725a(appOpsManagerM30727c, str, i10, b.m30726b(context));
    }

    /* JADX INFO: renamed from: b */
    public static int m30720b(Context context, String str, String str2) {
        return a.m30723b((AppOpsManager) a.m30722a(context, AppOpsManager.class), str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static String m30721c(String str) {
        return a.m30724c(str);
    }
}
