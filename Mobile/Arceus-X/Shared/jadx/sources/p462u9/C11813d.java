package p462u9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import p511w9.C12327c;

/* JADX INFO: renamed from: u9.d */
/* JADX INFO: loaded from: classes.dex */
public class C11813d {
    /* JADX INFO: renamed from: a */
    public static int m44173a(@NonNull Context context, @NonNull String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo packageInfoM44174b = m44174b(context, str);
        if (packageInfoM44174b == null || (applicationInfo = packageInfoM44174b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    /* JADX INFO: renamed from: b */
    public static PackageInfo m44174b(@NonNull Context context, @NonNull String str) {
        try {
            return C12327c.m46181a(context).m46178e(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
