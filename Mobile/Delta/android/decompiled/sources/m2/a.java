package m2;

import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    public static class C0420a {
        public static long a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C0420a.a(packageInfo) : packageInfo.versionCode;
    }
}
