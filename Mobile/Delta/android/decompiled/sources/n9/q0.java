package n9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f25293a = new Object();
    public static boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f25294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25295d;

    public static int a(Context context) {
        b(context);
        return f25295d;
    }

    public static void b(Context context) {
        synchronized (f25293a) {
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
                    f25294c = bundle.getString("com.google.app.id");
                    f25295d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
