package gk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class v {
    public static String a(Context context) {
        return b(context) ? "foreground" : "background";
    }

    public static boolean b(Context context) {
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

    public static void c(Context context) {
        p.h("ProcessUtils", "restartSelf, context = " + context);
        Intent intentO2 = ActivitySplash.o2(context, StartedForEnum.APP_RESTART);
        intentO2.setFlags(268468224);
        context.startActivity(intentO2);
        Runtime.getRuntime().exit(0);
    }
}
