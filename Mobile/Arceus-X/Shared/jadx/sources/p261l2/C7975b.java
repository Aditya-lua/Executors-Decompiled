package p261l2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;
import p235k2.C7422n;
import p298n2.C8870h;
import p456u2.C11779h;
import p533x2.C12632b;

/* JADX INFO: renamed from: l2.b */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C7975b {

    /* JADX INFO: renamed from: a */
    public static final Object f29885a = new Object();

    /* JADX INFO: renamed from: l2.b$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Drawable m33020a(Context context, int i10) {
            return context.getDrawable(i10);
        }

        /* JADX INFO: renamed from: b */
        public static File m33021b(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: l2.b$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static int m33022a(Context context, int i10) {
            return context.getColor(i10);
        }

        /* JADX INFO: renamed from: b */
        public static <T> T m33023b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }

    /* JADX INFO: renamed from: l2.b$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static Context m33024a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* JADX INFO: renamed from: b */
        public static File m33025b(Context context) {
            return context.getDataDir();
        }
    }

    /* JADX INFO: renamed from: l2.b$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static Intent m33026a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return ((i10 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, C7975b.m33014l(context), handler);
        }

        /* JADX INFO: renamed from: b */
        public static ComponentName m33027b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: l2.b$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Executor m33028a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: l2.b$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static Intent m33029a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m33003a(Context context, String str) {
        C12632b.m47063d(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C7422n.m30883e(context).m30886a() ? 0 : -1;
    }

    /* JADX INFO: renamed from: b */
    public static Context m33004b(Context context) {
        return c.m33024a(context);
    }

    /* JADX INFO: renamed from: c */
    public static int m33005c(Context context, int i10) {
        return b.m33022a(context, i10);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m33006d(Context context, int i10) {
        return C8870h.m35661d(context.getResources(), i10, context.getTheme());
    }

    /* JADX INFO: renamed from: e */
    public static File m33007e(Context context) {
        return c.m33025b(context);
    }

    /* JADX INFO: renamed from: f */
    public static Drawable m33008f(Context context, int i10) {
        return a.m33020a(context, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static File[] m33009g(Context context) {
        return context.getExternalCacheDirs();
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static File[] m33010h(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* JADX INFO: renamed from: i */
    public static Executor m33011i(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.m33028a(context) : C11779h.m44063a(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: j */
    public static File m33012j(Context context) {
        return a.m33021b(context);
    }

    /* JADX INFO: renamed from: k */
    public static <T> T m33013k(Context context, Class<T> cls) {
        return (T) b.m33023b(context, cls);
    }

    /* JADX INFO: renamed from: l */
    public static String m33014l(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C7980g.m33039b(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (C7980g.m33039b(context, str) == 0) {
                return str;
            }
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* JADX INFO: renamed from: m */
    public static Intent m33015m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return m33016n(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    /* JADX INFO: renamed from: n */
    public static Intent m33016n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 == 0 || (i12 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? f.m33029a(context, broadcastReceiver, intentFilter, str, handler, i12) : d.m33026a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m33017o(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static void m33018p(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* JADX INFO: renamed from: q */
    public static void m33019q(Context context, Intent intent) {
        d.m33027b(context, intent);
    }
}
