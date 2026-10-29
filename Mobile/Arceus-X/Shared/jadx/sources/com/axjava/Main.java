package com.axjava;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes4.dex */
public class Main {
    public static void Start(Context context) {
        try {
            System.loadLibrary("zstd-jni-1.5.7-6");
            lIIlIIlIIlII((Activity) context);
        } catch (Throwable th2) {
        }
        CrashHandler.init(context, false);
        m8975b(context);
    }

    public static native void lIIlIIlIIlII(Activity activity);

    /* JADX INFO: renamed from: b */
    public static void m8975b(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 112);
        }
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            try {
                Uri uri = Uri.parse("package:" + context.getPackageName());
                context.startActivity(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", uri));
            } catch (Exception e10) {
                Intent intent = new Intent();
                intent.setAction("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                context.startActivity(intent);
            }
        }
    }
}
