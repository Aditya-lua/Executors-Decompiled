package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import p213j9.C7089c;
import p539x8.C12767a;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1qSDK {
    public static String AFKeystoreWrapper(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, e10.getMessage() != null ? e10.getMessage() : "Failed to retrieve version name", e10);
            return "";
        }
    }

    public static boolean AFLogger(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if (C7089c.m29849o().mo29854g(context) == 0) {
                return true;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "WARNING:  Google play services is unavailable. ", th2);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "WARNING:  Google Play Services is unavailable. ", e10);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX INFO: renamed from: W_ */
    public static Map<String, String> m8935W_(PackageInfo packageInfo, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            String str = "media_source";
            if (!it.hasNext()) {
                try {
                    if (!map.containsKey("install_time")) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                        long j10 = packageInfo.firstInstallTime;
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                        map.put("install_time", simpleDateFormat.format(new Date(j10)));
                    }
                } catch (Exception e10) {
                    AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Could not fetch app install time", e10);
                }
                if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
                    map.put("af_status", "Non-organic");
                }
                if (map.containsKey("agency")) {
                    map.remove("media_source");
                }
                String path = uri.getPath();
                if (path != null) {
                    map.put("path", path);
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    map.put("scheme", scheme);
                }
                String host = uri.getHost();
                if (host != null) {
                    map.put("host", host);
                }
                return map;
            }
            String next = it.next();
            String queryParameter = uri.getQueryParameter(next);
            if (!map.containsKey(next)) {
                next.getClass();
                switch (next) {
                    case "af_prt":
                        str = "agency";
                        break;
                    case "c":
                        str = "campaign";
                        break;
                    case "pid":
                        break;
                    default:
                        str = next;
                        break;
                }
            } else {
                str = next;
            }
            map.put(str, queryParameter);
        }
    }

    /* JADX INFO: renamed from: X_ */
    public static Application m8936X_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Application or Activity Context should be used", new IllegalStateException());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Pair<Long, String> m8937d(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return new Pair<>(Long.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Pair<>(0L, "");
        }
    }

    public static boolean registerClient(Context context) {
        if (context == null) {
            return false;
        }
        try {
            C12767a.m47636a(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean unregisterClient(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static long unregisterClient(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.INSTANCE.m8961e(LogTag.GENERAL, e10.getMessage() != null ? e10.getMessage() : "Failed to retrieve version code", e10);
            return 0L;
        }
    }
}
