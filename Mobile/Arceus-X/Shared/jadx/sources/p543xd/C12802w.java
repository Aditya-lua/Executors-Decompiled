package p543xd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.roblox.client.personasdk.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: xd.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C12802w {

    /* JADX INFO: renamed from: a */
    public static final C12788i f45546a = new C12788i("PhoneskyVerificationUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m47680a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo(BuildConfig.STORE_PACKAGE, 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f45546a.m47653d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strM47679a = C12801v.m47679a(signature.toByteArray());
                            arrayList.add(strM47679a);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM47679a)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM47679a)) {
                                return true;
                            }
                        }
                        C12788i c12788i = f45546a;
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
                        c12788i.m47653d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb2.toString()), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f45546a.m47653d("Play Store package is not found.", new Object[0]);
                }
            } else {
                f45546a.m47653d("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f45546a.m47653d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
