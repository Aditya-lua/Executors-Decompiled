package gk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class s {
    public static boolean a(Context context, Intent intent) {
        List<ResolveInfo> listD = d(context, intent);
        return listD != null && listD.size() > 0;
    }

    public static boolean b(Context context) {
        return kk.a.a(context);
    }

    public static long c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static List<ResolveInfo> d(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536);
    }

    public static boolean e() {
        return g() || i();
    }

    public static boolean f() {
        return false;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h() {
        return false;
    }

    public static boolean i() {
        return false;
    }

    public static boolean j() {
        return false;
    }

    public static boolean k() {
        return false;
    }
}
