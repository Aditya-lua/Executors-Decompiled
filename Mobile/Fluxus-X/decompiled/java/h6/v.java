package h6;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18108a = y5.w.i("PackageManagerHelper");

    public static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    public static boolean b(int i10, boolean z10) {
        if (i10 == 0) {
            return z10;
        }
        return i10 == 1;
    }

    public static void c(Context context, Class<?> cls, boolean z10) {
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                y5.w.e().a(f18108a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            y5.w wVarE = y5.w.e();
            String str = f18108a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            wVarE.a(str, sb2.toString());
        } catch (Exception e10) {
            y5.w wVarE2 = y5.w.e();
            String str2 = f18108a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            wVarE2.b(str2, sb3.toString(), e10);
        }
    }
}
