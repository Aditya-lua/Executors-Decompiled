package p151gk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.List;

/* JADX INFO: renamed from: gk.w */
/* JADX INFO: loaded from: classes2.dex */
public class C6130w {
    /* JADX INFO: renamed from: a */
    public static String m27099a(Context context) {
        return m27100b(context) ? "foreground" : "background";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27100b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        boolean z10 = false;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                for (String str : runningAppProcessInfo.pkgList) {
                    if (str.equals(context.getPackageName())) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: c */
    public static void m27101c(Context context) {
        C6124q.m27063h("ProcessUtils", "restartSelf, context = " + context);
        Intent intentM15531o2 = ActivitySplash.m15531o2(context, StartedForEnum.APP_RESTART);
        intentM15531o2.setFlags(268468224);
        context.startActivity(intentM15531o2);
        Runtime.getRuntime().exit(0);
    }
}
