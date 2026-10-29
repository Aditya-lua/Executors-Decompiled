package be;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.roblox.client.personasdk.BuildConfig;

/* JADX INFO: renamed from: be.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1354q0 {

    /* JADX INFO: renamed from: a */
    public static final C1355q1 f5400a = new C1355q1("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m7205a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo(BuildConfig.STORE_PACKAGE, 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    f5400a.m7211e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature signature : signatureArr) {
                        String strM7201a = C1351p0.m7201a(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM7201a)) {
                            return true;
                        }
                        String str = Build.TAGS;
                        if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM7201a)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
