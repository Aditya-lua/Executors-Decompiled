package fb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f16547c = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16548a;
    public boolean b;

    public final boolean a(Activity activity) {
        Bundle bundle;
        Bundle bundle2;
        if (this.b) {
            return this.f16548a;
        }
        ActivityInfo activityInfo = null;
        try {
            ApplicationInfo applicationInfoC = w9.c.a(activity).c(activity.getPackageName(), 128);
            bundle = applicationInfoC == null ? null : applicationInfoC.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean zEquals = false;
        if (bundle != null && bundle.getString("com.epicgames.unreal.GameActivity.EngineVersion", "").startsWith("5.")) {
            try {
                activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), 128);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                zEquals = Objects.equals(bundle2.getString("android.app.lib_name", ""), "Unreal");
            }
        }
        this.f16548a = zEquals;
        this.b = true;
        return zEquals;
    }
}
