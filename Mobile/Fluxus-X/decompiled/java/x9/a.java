package x9;

import android.content.Context;
import androidx.annotation.NonNull;
import v9.m;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f36629a;
    public static Boolean b;

    public static synchronized boolean a(@NonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f36629a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (m.g()) {
            b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        f36629a = applicationContext;
        return b.booleanValue();
    }
}
