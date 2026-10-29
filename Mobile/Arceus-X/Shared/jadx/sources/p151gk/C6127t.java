package p151gk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p249kk.C7623a;

/* JADX INFO: renamed from: gk.t */
/* JADX INFO: loaded from: classes2.dex */
public class C6127t {
    /* JADX INFO: renamed from: a */
    public static boolean m27085a(Context context, Intent intent) {
        List<ResolveInfo> listM27088d = m27088d(context, intent);
        return listM27088d != null && listM27088d.size() > 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27086b(Context context) {
        return C7623a.m31503a(context);
    }

    /* JADX INFO: renamed from: c */
    public static long m27087c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<ResolveInfo> m27088d(Context context, Intent intent) {
        return context.getPackageManager().queryIntentActivities(intent, 65536);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27089e() {
        return m27091g() || m27093i();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m27090f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m27091g() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m27092h() {
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m27093i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m27094j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m27095k() {
        return false;
    }
}
