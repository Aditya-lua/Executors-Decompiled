package p305n9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p511w9.C12327c;

/* JADX INFO: renamed from: n9.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8964q0 {

    /* JADX INFO: renamed from: a */
    public static final Object f32629a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f32630b;

    /* JADX INFO: renamed from: c */
    public static String f32631c;

    /* JADX INFO: renamed from: d */
    public static int f32632d;

    /* JADX INFO: renamed from: a */
    public static int m36066a(Context context) {
        m36067b(context);
        return f32632d;
    }

    /* JADX INFO: renamed from: b */
    public static void m36067b(Context context) {
        synchronized (f32629a) {
            try {
                if (f32630b) {
                    return;
                }
                f32630b = true;
                try {
                    Bundle bundle = C12327c.m46181a(context).m46176c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f32631c = bundle.getString("com.google.app.id");
                    f32632d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
