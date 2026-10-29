package p235k2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NavUtils;

/* JADX INFO: renamed from: k2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7417i {
    /* JADX INFO: renamed from: a */
    public static Intent m30731a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String strM30733c = m30733c(activity);
        if (strM30733c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, strM30733c);
        try {
            return m30734d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM30733c + "' in manifest");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m30732b(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM30734d = m30734d(context, componentName);
        if (strM30734d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM30734d);
        return m30734d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: c */
    public static String m30733c(Activity activity) {
        try {
            return m30734d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m30734d(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(NavUtils.PARENT_ACTIVITY)) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public static void m30735e(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static boolean m30736f(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}
