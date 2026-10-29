package p462u9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import p213j9.C7101i;
import p511w9.C12327c;

/* JADX INFO: renamed from: u9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C11825p {
    /* JADX INFO: renamed from: a */
    public static boolean m44208a(@NonNull Context context, int i10) {
        if (!m44209b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C7101i.m29899a(context).m29902b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44209b(@NonNull Context context, int i10, @NonNull String str) {
        return C12327c.m46181a(context).m46180g(i10, str);
    }
}
