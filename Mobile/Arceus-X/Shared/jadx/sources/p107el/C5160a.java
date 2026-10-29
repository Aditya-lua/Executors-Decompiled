package p107el;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: renamed from: el.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5160a {
    /* JADX INFO: renamed from: a */
    public static float m23997a(Display display) {
        return display.getRefreshRate();
    }

    /* JADX INFO: renamed from: b */
    public static String m23998b(boolean z10) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (z10) {
            str2 = str + " " + str2 + Build.DEVICE;
        } else if (!str2.startsWith(str)) {
            str2 = str + " " + str2;
        }
        return Character.toUpperCase(str2.charAt(0)) + str2.substring(1, str2.length());
    }

    /* JADX INFO: renamed from: c */
    public static int m23999c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1048576);
    }

    /* JADX INFO: renamed from: d */
    public static DisplayMetrics m24000d(Context context) {
        return C5161b.f20069b.mo24008a(context);
    }

    /* JADX INFO: renamed from: e */
    public static float m24001e(Context context) {
        return m24000d(context).density;
    }

    /* JADX INFO: renamed from: f */
    public static Point m24002f(Context context) {
        DisplayMetrics displayMetricsM24000d = m24000d(context);
        Point point = new Point();
        float f10 = displayMetricsM24000d.widthPixels;
        float f11 = displayMetricsM24000d.density;
        point.x = (int) (f10 / f11);
        point.y = (int) (displayMetricsM24000d.heightPixels / f11);
        return point;
    }

    /* JADX INFO: renamed from: g */
    public static Point m24003g(Context context) {
        DisplayMetrics displayMetricsM24000d = m24000d(context);
        Point point = new Point();
        point.x = (int) displayMetricsM24000d.xdpi;
        point.y = (int) displayMetricsM24000d.ydpi;
        return point;
    }

    /* JADX INFO: renamed from: h */
    public static Point m24004h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        point.x = defaultDisplay.getMode().getPhysicalWidth();
        point.y = defaultDisplay.getMode().getPhysicalHeight();
        return point;
    }

    /* JADX INFO: renamed from: i */
    public static Point m24005i(Context context) {
        DisplayMetrics displayMetricsM24000d = m24000d(context);
        float f10 = displayMetricsM24000d.widthPixels / displayMetricsM24000d.xdpi;
        float f11 = displayMetricsM24000d.heightPixels / displayMetricsM24000d.ydpi;
        Point point = new Point();
        point.x = Math.round(f10 * 25.4f);
        point.y = Math.round(f11 * 25.4f);
        return point;
    }

    /* JADX INFO: renamed from: j */
    public static Point m24006j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    /* JADX INFO: renamed from: k */
    public static float[] m24007k(Display display) {
        return display.getSupportedRefreshRates();
    }
}
