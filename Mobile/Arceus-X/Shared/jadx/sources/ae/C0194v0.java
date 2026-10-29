package ae;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import be.C1355q1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ae.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0194v0 {

    /* JADX INFO: renamed from: c */
    public static final C1355q1 f594c = new C1355q1("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: a */
    public final Context f595a;

    /* JADX INFO: renamed from: b */
    public final String f596b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0194v0(Context context, String str) {
        this.f595a = context;
        this.f596b = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m538b(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    /* JADX INFO: renamed from: e */
    public static boolean m539e(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    /* JADX INFO: renamed from: f */
    public static final Set m540f(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : m541h(packageInfo)) {
            if (!m539e(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: h */
    public static final Set m541h(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f594c.m7207a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            f594c.m7207a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f594c.m7207a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        InterfaceC0190t0 interfaceC0190t0M535a = C0192u0.m535a();
        if (interfaceC0190t0M535a != null) {
            hashSet.addAll(interfaceC0190t0M535a.zza());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final C0178n0 m542a(Bundle bundle) {
        if (bundle == null) {
            f594c.m7211e("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i10 = bundle.getInt("com.android.vending.splits");
        if (i10 == 0) {
            f594c.m7211e("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            C0178n0 c0178n0M516a = C0160e0.m516a(this.f595a.getResources().getXml(i10), new C0174l0());
            if (c0178n0M516a == null) {
                f594c.m7211e("Can't parse languages metadata.", new Object[0]);
            }
            return c0178n0M516a;
        } catch (Resources.NotFoundException unused) {
            f594c.m7211e("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Set m543c() {
        PackageInfo packageInfoM545g = m545g();
        return (packageInfoM545g == null || packageInfoM545g.applicationInfo == null) ? new HashSet() : m540f(packageInfoM545g);
    }

    /* JADX INFO: renamed from: d */
    public final Set m544d() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoM545g = m545g();
        HashSet hashSet = null;
        if (packageInfoM545g != null && (applicationInfo = packageInfoM545g.applicationInfo) != null) {
            C0178n0 c0178n0M542a = m542a(applicationInfo.metaData);
            if (c0178n0M542a == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setM541h = m541h(packageInfoM545g);
            setM541h.add("");
            Set setM540f = m540f(packageInfoM545g);
            setM540f.add("");
            for (Map.Entry entry : c0178n0M542a.m531a(setM540f).entrySet()) {
                if (setM541h.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: g */
    public final PackageInfo m545g() {
        try {
            return this.f595a.getPackageManager().getPackageInfo(this.f596b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f594c.m7208b("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0194v0(Context context) {
        this.f595a = context;
        this.f596b = context.getPackageName();
    }
}
