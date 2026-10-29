package p283m2;

import android.content.pm.PackageInfo;
import android.os.Build;

/* JADX INFO: renamed from: m2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8408a {

    /* JADX INFO: renamed from: m2.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static long m34068a(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m34067a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.m34068a(packageInfo) : packageInfo.versionCode;
    }
}
