package p213j9;

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
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.roblox.client.personasdk.BuildConfig;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p305n9.C8953m;
import p305n9.C8964q0;
import p462u9.C11818i;
import p462u9.C11825p;
import p462u9.C11827r;
import p511w9.C12327c;

/* JADX INFO: renamed from: j9.h */
/* JADX INFO: loaded from: classes.dex */
public class C7099h {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public static final int f27712a = 12451000;

    /* JADX INFO: renamed from: c */
    public static boolean f27714c;

    /* JADX INFO: renamed from: d */
    public static boolean f27715d;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final AtomicBoolean f27713b = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f27716e = new AtomicBoolean();

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static void m29886a(@NonNull Context context, int i10) throws C7095f, C7093e {
        int iMo29855h = C7091d.m29876f().mo29855h(context, i10);
        if (iMo29855h != 0) {
            Intent intentMo29851b = C7091d.m29876f().mo29851b(context, iMo29855h, "e");
            StringBuilder sb2 = new StringBuilder(String.valueOf(iMo29855h).length() + 46);
            sb2.append("GooglePlayServices not available due to error ");
            sb2.append(iMo29855h);
            Log.e("GooglePlayServicesUtil", sb2.toString());
            if (intentMo29851b != null) {
                throw new C7095f(iMo29855h, "Google Play Services not available", intentMo29851b);
            }
            throw new C7093e(iMo29855h);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m29887b(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static String m29888c(int i10) {
        return ConnectionResult.m9137B3(i10);
    }

    /* JADX INFO: renamed from: d */
    public static Resources m29889d(@NonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m29890e(@NonNull Context context) {
        try {
            if (!f27715d) {
                PackageInfo packageInfoM46178e = C12327c.m46181a(context).m46178e("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                C7101i.m29899a(context);
                if (packageInfoM46178e == null || C7101i.m29900d(packageInfoM46178e, false) || !C7101i.m29900d(packageInfoM46178e, true)) {
                    f27714c = false;
                } else {
                    f27714c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f27715d = true;
        }
        return f27714c || !C11818i.m44182b();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Deprecated
    /* JADX INFO: renamed from: f */
    public static int m29891f(@NonNull Context context, int i10) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(C7103j.f27724a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f27716e.get()) {
            int iM36066a = C8964q0.m36066a(context);
            if (iM36066a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (iM36066a != f27712a) {
                throw new GooglePlayServicesIncorrectManifestValueException(iM36066a);
            }
        }
        boolean z10 = (C11818i.m44184d(context) || C11818i.m44187g(context)) ? false : true;
        C8953m.m36036a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo(BuildConfig.STORE_PACKAGE, Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
            C7101i.m29899a(context);
            if (!C7101i.m29900d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z10) {
                    if (z10) {
                    }
                    if (C11827r.m44213a(packageInfo2.versionCode) < C11827r.m44213a(i10)) {
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
                C8953m.m36047l(packageInfo);
                if (!C7101i.m29900d(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        if (C11827r.m44213a(packageInfo2.versionCode) < C11827r.m44213a(i10)) {
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
    /* JADX INFO: renamed from: g */
    public static boolean m29892g(@NonNull Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m29896k(context, "com.google.android.gms");
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m29893h(@NonNull Context context) {
        Object systemService = context.getSystemService("user");
        C8953m.m36047l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static boolean m29894i(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static boolean m29895j(@NonNull Context context, int i10, @NonNull String str) {
        return C11825p.m44209b(context, i10, str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m29896k(Context context, String str) throws PackageManager.NameNotFoundException {
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
            return applicationInfo.enabled && !m29893h(context);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
