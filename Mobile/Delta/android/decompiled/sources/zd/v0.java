package zd;

import ae.q1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f37511c = new q1("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37512a;
    public final String b;

    public v0(Context context, String str) {
        this.f37512a = context;
        this.b = str;
    }

    public static String b(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean e(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set f(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : h(packageInfo)) {
            if (!e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final Set h(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f37511c.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f37511c.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f37511c.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        t0 t0VarA = u0.a();
        if (t0VarA != null) {
            hashSet.addAll(t0VarA.zza());
        }
        return hashSet;
    }

    public final n0 a(Bundle bundle) {
        if (bundle == null) {
            f37511c.e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i10 = bundle.getInt("com.android.vending.splits");
        if (i10 == 0) {
            f37511c.e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            n0 n0VarA = e0.a(this.f37512a.getResources().getXml(i10), new l0());
            if (n0VarA == null) {
                f37511c.e("Can't parse languages metadata.", new Object[0]);
            }
            return n0VarA;
        } catch (Resources.NotFoundException unused) {
            f37511c.e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set c() {
        PackageInfo packageInfoG = g();
        return (packageInfoG == null || packageInfoG.applicationInfo == null) ? new HashSet() : f(packageInfoG);
    }

    public final Set d() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoG = g();
        HashSet hashSet = null;
        if (packageInfoG != null && (applicationInfo = packageInfoG.applicationInfo) != null) {
            n0 n0VarA = a(applicationInfo.metaData);
            if (n0VarA == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setH = h(packageInfoG);
            setH.add("");
            Set setF = f(packageInfoG);
            setF.add("");
            for (Map.Entry entry : n0VarA.a(setF).entrySet()) {
                if (setH.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    public final PackageInfo g() {
        try {
            return this.f37512a.getPackageManager().getPackageInfo(this.b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f37511c.b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public v0(Context context) {
        this.f37512a = context;
        this.b = context.getPackageName();
    }
}
