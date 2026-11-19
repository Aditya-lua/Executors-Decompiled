package la;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import gb.k1;
import gb.o1;
import gb.s1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0057 A[SYNTHETIC] */
    public static q a(Context context, Class cls) {
        Bundle bundle;
        Long lValueOf;
        ActivityInfo activityInfo;
        Bundle bundle2;
        try {
            ApplicationInfo applicationInfoC = x9.c.a(context).c(context.getPackageName(), Barcode.FORMAT_ITF);
            bundle = applicationInfoC == null ? null : applicationInfoC.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = BuildConfig.FLAVOR;
        if (bundle == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(bundle.getString("com.google.android.gms.games.APP_ID", BuildConfig.FLAVOR)));
            } catch (NumberFormatException unused2) {
                lValueOf = null;
            }
        }
        if (lValueOf == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(context.getPackageName()), 795136);
        s1 s1Var = o1.b;
        k1 k1Var = new k1();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 != null) {
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                if (componentEnabledSetting == 0) {
                    if (activityInfo2.enabled) {
                        if (resolveInfo.activityInfo.exported) {
                            k1Var.d(resolveInfo);
                        }
                    }
                } else if (componentEnabledSetting == 1) {
                    if (resolveInfo.activityInfo.exported) {
                        k1Var.d(resolveInfo);
                    }
                }
            }
        }
        o1 o1VarE = k1Var.e();
        int size = o1VarE.size();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            ActivityInfo activityInfo3 = ((ResolveInfo) o1VarE.get(i10)).activityInfo;
            if (activityInfo3 != null) {
                try {
                    activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(activityInfo3.packageName, activityInfo3.name), 795264);
                } catch (PackageManager.NameNotFoundException unused3) {
                    activityInfo = null;
                }
                if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                    iMin = Integer.min(iMin, bundle2.getInt("com.google.android.gms.games.APP_SHORTCUTS_MAX_NUMBER", Integer.MAX_VALUE));
                    string = bundle2.getString("com.google.android.gms.games.APP_SHORTCUTS_TARGET_ACTIVITY", string);
                }
            }
        }
        Pair pair = new Pair(Integer.valueOf(iMin), string);
        return new q(lValueOf.longValue(), context.getPackageName(), ((Integer) pair.first).intValue(), new ComponentName(context, (Class<?>) cls), ((String) pair.second).trim());
    }
}
