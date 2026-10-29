package p125fb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Objects;
import p511w9.C12327c;

/* JADX INFO: renamed from: fb.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5535k {

    /* JADX INFO: renamed from: c */
    public static final C5535k f21316c = new C5535k();

    /* JADX INFO: renamed from: a */
    public boolean f21317a;

    /* JADX INFO: renamed from: b */
    public boolean f21318b;

    /* JADX INFO: renamed from: a */
    public final boolean m25204a(Activity activity) {
        Bundle bundle;
        Bundle bundle2;
        if (this.f21318b) {
            return this.f21317a;
        }
        ActivityInfo activityInfo = null;
        try {
            ApplicationInfo applicationInfoM46176c = C12327c.m46181a(activity).m46176c(activity.getPackageName(), 128);
            bundle = applicationInfoM46176c == null ? null : applicationInfoM46176c.metaData;
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
        this.f21317a = zEquals;
        this.f21318b = true;
        return zEquals;
    }
}
