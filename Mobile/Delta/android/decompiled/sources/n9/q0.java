package n9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26114a = new Object();
    public static boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f26115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26116d;

    public static int a(Context context) {
        b(context);
        return f26116d;
    }

    public static void b(Context context) {
        synchronized (f26114a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    Bundle bundle = w9.c.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f26115c = bundle.getString("com.google.app.id");
                    f26116d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
