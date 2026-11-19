package com.lazyexec.exe;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class PermSender {
    private static String getDir() {
        return MainActivity.getExec();
    }

    public static void SendStorage(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            if (!Environment.isExternalStorageManager()) {
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                intent.setData(Uri.parse(new StringBuffer().append("package:").append(activity.getPackageName()).toString()));
                intent.setFlags(268435456);
                activity.startActivity(intent);
                return;
            }
            CreateDir();
            return;
        }
        int iCheckSelfPermission = activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
        int iCheckSelfPermission2 = activity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
        if (iCheckSelfPermission != 0 || iCheckSelfPermission2 != 0) {
            activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1001);
        } else {
            CreateDir();
        }
    }

    public static void CreateDir() {
        File file = new File(Environment.getExternalStorageDirectory(), getDir());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "Workspace");
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }
}
