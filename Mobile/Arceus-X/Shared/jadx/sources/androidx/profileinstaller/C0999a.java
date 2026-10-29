package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
public class C0999a {

    /* JADX INFO: renamed from: androidx.profileinstaller.a$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static File m5035a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Context m5036a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m5033a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : fileArrListFiles) {
            z10 = m5033a(file2) && z10;
        }
        return z10;
    }

    /* JADX INFO: renamed from: b */
    public static void m5034b(@NonNull Context context, @NonNull ProfileInstallReceiver.C0996a c0996a) {
        if (m5033a(Build.VERSION.SDK_INT >= 34 ? b.m5036a(context).getCacheDir() : a.m5035a(b.m5036a(context)))) {
            c0996a.mo5024a(14, null);
        } else {
            c0996a.mo5024a(15, null);
        }
    }
}
