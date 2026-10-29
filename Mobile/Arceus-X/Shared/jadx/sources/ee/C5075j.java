package ee;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ee.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C5075j {

    /* JADX INFO: renamed from: a */
    public static final C5096t0 f19900a = new C5096t0("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static int m23808a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && m23810c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23809b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo(BuildConfig.STORE_PACKAGE, 0).enabled) {
                try {
                    if (m23810c(context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 64).signatures)) {
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f19900a.m23842d("Play Store package is not found.", new Object[0]);
                }
            } else {
                f19900a.m23842d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f19900a.m23842d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m23810c(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f19900a.m23842d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            String strM23806a = C5073i.m23806a(signature.toByteArray());
            arrayList.add(strM23806a);
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM23806a)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM23806a)) {
                return true;
            }
        }
        C5096t0 c5096t0 = f19900a;
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
        c5096t0.m23842d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb2.toString()), new Object[0]);
        return false;
    }
}
