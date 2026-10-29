package p243ka;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzr;
import java.util.List;
import p125fb.AbstractC5546n1;
import p125fb.AbstractC5558r1;
import p125fb.C5534j1;
import p511w9.C12327c;

/* JADX INFO: renamed from: ka.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7530p {
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0057 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static zzr m31177a(Context context, Class cls) {
        Bundle bundle;
        Long lValueOf;
        ActivityInfo activityInfo;
        Bundle bundle2;
        try {
            ApplicationInfo applicationInfoM46176c = C12327c.m46181a(context).m46176c(context.getPackageName(), 128);
            bundle = applicationInfoM46176c == null ? null : applicationInfoM46176c.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = "";
        if (bundle == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(bundle.getString("com.google.android.gms.games.APP_ID", "")));
            } catch (NumberFormatException unused2) {
                lValueOf = null;
            }
        }
        if (lValueOf == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(context.getPackageName()), 795136);
        AbstractC5558r1 abstractC5558r1 = AbstractC5546n1.f21331b;
        C5534j1 c5534j1 = new C5534j1();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 != null) {
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                if (componentEnabledSetting == 0) {
                    if (activityInfo2.enabled) {
                        if (resolveInfo.activityInfo.exported) {
                            c5534j1.m25202d(resolveInfo);
                        }
                    }
                } else if (componentEnabledSetting == 1) {
                    if (resolveInfo.activityInfo.exported) {
                        c5534j1.m25202d(resolveInfo);
                    }
                }
            }
        }
        AbstractC5546n1 abstractC5546n1M25203e = c5534j1.m25203e();
        int size = abstractC5546n1M25203e.size();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            ActivityInfo activityInfo3 = ((ResolveInfo) abstractC5546n1M25203e.get(i10)).activityInfo;
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
        return new zzr(lValueOf.longValue(), context.getPackageName(), ((Integer) pair.first).intValue(), new ComponentName(context, (Class<?>) cls), ((String) pair.second).trim());
    }
}
