package el;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static float a(Display display) {
        return display.getRefreshRate();
    }

    public static String b(boolean z10) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (z10) {
            str2 = str + " " + str2 + Build.DEVICE;
        } else if (!str2.startsWith(str)) {
            str2 = str + " " + str2;
        }
        return Character.toUpperCase(str2.charAt(0)) + str2.substring(1, str2.length());
    }

    public static int c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1048576);
    }

    public static DisplayMetrics d(Context context) {
        return b.b.a(context);
    }

    public static float e(Context context) {
        return d(context).density;
    }

    public static Point f(Context context) {
        DisplayMetrics displayMetricsD = d(context);
        Point point = new Point();
        float f10 = displayMetricsD.widthPixels;
        float f11 = displayMetricsD.density;
        point.x = (int) (f10 / f11);
        point.y = (int) (displayMetricsD.heightPixels / f11);
        return point;
    }

    public static Point g(Context context) {
        DisplayMetrics displayMetricsD = d(context);
        Point point = new Point();
        point.x = (int) displayMetricsD.xdpi;
        point.y = (int) displayMetricsD.ydpi;
        return point;
    }

    public static Point h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        point.x = defaultDisplay.getMode().getPhysicalWidth();
        point.y = defaultDisplay.getMode().getPhysicalHeight();
        return point;
    }

    public static Point i(Context context) {
        DisplayMetrics displayMetricsD = d(context);
        float f10 = displayMetricsD.widthPixels / displayMetricsD.xdpi;
        float f11 = displayMetricsD.heightPixels / displayMetricsD.ydpi;
        Point point = new Point();
        point.x = Math.round(f10 * 25.4f);
        point.y = Math.round(f11 * 25.4f);
        return point;
    }

    public static Point j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static float[] k(Display display) {
        return display.getSupportedRefreshRates();
    }
}
