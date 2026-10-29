package p193ib;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ib.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6736r {

    /* JADX INFO: renamed from: a */
    public static final C6722d f25854a = new C6722d("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static int m28850a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && m28852c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m28851b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo(BuildConfig.STORE_PACKAGE, 0).enabled) {
                try {
                    if (m28852c(context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 64).signatures)) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f25854a.m28822d("Play Store package is not found.", new Object[0]);
                }
            } else {
                f25854a.m28822d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f25854a.m28822d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m28852c(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f25854a.m28822d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            String strM28849a = C6735q.m28849a(signature.toByteArray());
            arrayList.add(strM28849a);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM28849a)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM28849a)) {
                return true;
            }
        }
        C6722d c6722d = f25854a;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) ", ");
            }
        }
        c6722d.m28822d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb2.toString()), new Object[0]);
        return false;
    }
}
