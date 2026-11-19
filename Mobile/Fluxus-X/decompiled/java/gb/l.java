package gb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f17642c = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17643a;
    public boolean b;

    public final boolean a(Activity activity) {
        Bundle bundle;
        Bundle bundle2;
        if (this.b) {
            return this.f17643a;
        }
        ActivityInfo activityInfo = null;
        try {
            ApplicationInfo applicationInfoC = x9.c.a(activity).c(activity.getPackageName(), Barcode.FORMAT_ITF);
            bundle = applicationInfoC == null ? null : applicationInfoC.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean zEquals = false;
        if (bundle != null && bundle.getString("com.epicgames.unreal.GameActivity.EngineVersion", BuildConfig.FLAVOR).startsWith("5.")) {
            try {
                activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), Barcode.FORMAT_ITF);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                zEquals = Objects.equals(bundle2.getString("android.app.lib_name", BuildConfig.FLAVOR), "Unreal");
            }
        }
        this.f17643a = zEquals;
        this.b = true;
        return zEquals;
    }
}
