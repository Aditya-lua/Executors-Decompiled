package com.roblox.platform.util;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Keep;
import rl.a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class DeviceUtils {
    private static final float MM_PER_INCH = 25.4f;
    public static final String TAG = "rbx.platform.utils";

    public static float getCurrentRefreshRate(Display display) {
        return display.getRefreshRate();
    }

    public static String getDeviceName(boolean z10) {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (z10) {
            str2 = str + " " + str2 + Build.DEVICE;
        } else if (!str2.startsWith(str)) {
            str2 = str + " " + str2;
        }
        return Character.toUpperCase(str2.charAt(0)) + str2.substring(1, str2.length());
    }

    public static int getDeviceTotalMegabytes(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1048576);
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        return a.b.a(context);
    }

    public static float getScreenDensity(Context context) {
        return getDisplayMetrics(context).density;
    }

    public static Point getScreenDpSize(Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        Point point = new Point();
        float f10 = displayMetrics.widthPixels;
        float f11 = displayMetrics.density;
        point.x = (int) (f10 / f11);
        point.y = (int) (displayMetrics.heightPixels / f11);
        return point;
    }

    public static Point getScreenDpi(Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        Point point = new Point();
        point.x = (int) displayMetrics.xdpi;
        point.y = (int) displayMetrics.ydpi;
        return point;
    }

    public static Point getScreenPhysicalSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        point.x = defaultDisplay.getMode().getPhysicalWidth();
        point.y = defaultDisplay.getMode().getPhysicalHeight();
        return point;
    }

    public static Point getScreenPhysicalSizeInMillimeters(Context context) {
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        float f10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        float f11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        Point point = new Point();
        point.x = Math.round(f10 * MM_PER_INCH);
        point.y = Math.round(f11 * MM_PER_INCH);
        return point;
    }

    public static Point getScreenSize(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static float[] getSupportedRefreshRates(Display display) {
        return display.getSupportedRefreshRates();
    }
}
