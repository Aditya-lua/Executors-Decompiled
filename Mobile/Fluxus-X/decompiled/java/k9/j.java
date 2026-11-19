package k9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import o9.a1;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f21259a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f21260c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f21261d = false;

    @Deprecated
    public static final AtomicBoolean b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f21262e = new AtomicBoolean();

    @Deprecated
    public static void a(@NonNull Context context, int i10) throws g, h {
        int iH = f.f().h(context, i10);
        if (iH != 0) {
            Intent intentB = f.f().b(context, iH, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iH);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentB != null) {
                throw new h(iH, "Google Play Services not available", intentB);
            }
            throw new g(iH);
        }
    }

    @Deprecated
    public static int b(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @NonNull
    @Deprecated
    public static String c(int i10) {
        return b.G3(i10);
    }

    public static Resources d(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean e(@NonNull Context context) {
        try {
            if (!f21261d) {
                PackageInfo packageInfoE = x9.c.a(context).e("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                k.a(context);
                if (packageInfoE == null || k.d(packageInfoE, false) || !k.d(packageInfoE, true)) {
                    f21260c = false;
                } else {
                    f21260c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f21261d = true;
        }
        return f21260c || !v9.i.b();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Deprecated
    public static int f(@NonNull Context context, int i10) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(l.f21269a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f21262e.get()) {
            int iA = a1.a(context);
            if (iA == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iA != f21259a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iA);
            }
        }
        boolean z10 = (v9.i.d(context) || v9.i.g(context)) ? false : true;
        o9.s.a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            k.a(context);
            if (!k.d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z10) {
                    if (z10) {
                    }
                    if (v9.r.a(packageInfo2.versionCode) < v9.r.a(i10)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    int i11 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i10);
                    sb2.append(" but found ");
                    sb2.append(i11);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                }
                o9.s.l(packageInfo);
                if (!k.d(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (v9.r.a(packageInfo2.versionCode) < v9.r.a(i10)) {
                            applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e10) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                    return 1;
                                }
                            }
                            if (applicationInfo.enabled) {
                                return 3;
                            }
                            return 0;
                        }
                        int i12 = packageInfo2.versionCode;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i12).length());
                        sb3.append("Google Play services out of date for ");
                        sb3.append(packageName);
                        sb3.append(".  Requires ");
                        sb3.append(i10);
                        sb3.append(" but found ");
                        sb3.append(i12);
                        Log.w("GooglePlayServicesUtil", sb3.toString());
                        return 2;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean g(@NonNull Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return k(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean h(@NonNull Context context) {
        Object systemService = context.getSystemService("user");
        o9.s.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean i(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @Deprecated
    public static boolean j(@NonNull Context context, int i10, @NonNull String str) {
        return v9.p.b(context, i10, str);
    }

    public static boolean k(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !h(context);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
