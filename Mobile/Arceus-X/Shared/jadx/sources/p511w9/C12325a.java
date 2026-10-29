package p511w9;

import android.content.Context;
import androidx.annotation.NonNull;
import p462u9.C11822m;

/* JADX INFO: renamed from: w9.a */
/* JADX INFO: loaded from: classes.dex */
public class C12325a {

    /* JADX INFO: renamed from: a */
    public static Context f44180a;

    /* JADX INFO: renamed from: b */
    public static Boolean f44181b;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m46173a(@NonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f44180a;
        if (context2 != null && (bool = f44181b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f44181b = null;
        if (C11822m.m44200g()) {
            f44181b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f44181b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f44181b = Boolean.FALSE;
            }
        }
        f44180a = applicationContext;
        return f44181b.booleanValue();
    }
}
