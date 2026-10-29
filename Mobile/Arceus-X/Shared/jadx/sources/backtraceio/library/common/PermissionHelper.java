package backtraceio.library.common;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class PermissionHelper {
    public static boolean isPermissionForAccessWifiStateGranted(Context context) {
        return context.checkSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0;
    }

    public static boolean isPermissionForBluetoothGranted(Context context) {
        return context.checkSelfPermission("android.permission.BLUETOOTH") == 0;
    }

    public static boolean isPermissionForInternetGranted(Context context) {
        return context.checkSelfPermission("android.permission.INTERNET") == 0;
    }

    public static boolean isPermissionForReadExternalStorageGranted(Context context) {
        return context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
