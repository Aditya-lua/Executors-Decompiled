package o9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f26929a = new Object();
    public static boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f26930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f26931d;

    public static int a(Context context) {
        b(context);
        return f26931d;
    }

    public static void b(Context context) {
        synchronized (f26929a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    Bundle bundle = x9.c.a(context).c(context.getPackageName(), Barcode.FORMAT_ITF).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f26930c = bundle.getString("com.google.app.id");
                    f26931d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
