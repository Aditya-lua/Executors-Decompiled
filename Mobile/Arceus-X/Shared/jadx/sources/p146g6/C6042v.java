package p146g6;

import android.content.ComponentName;
import android.content.Context;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: g6.v */
/* JADX INFO: loaded from: classes.dex */
public class C6042v {

    /* JADX INFO: renamed from: a */
    public static final String f23322a = AbstractC12732w.m47443i("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static int m26857a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m26858b(int i10, boolean z10) {
        if (i10 == 0) {
            return z10;
        }
        return i10 == 1;
    }

    /* JADX INFO: renamed from: c */
    public static void m26859c(Context context, Class<?> cls, boolean z10) {
        try {
            if (z10 == m26858b(m26857a(context, cls.getName()), false)) {
                AbstractC12732w.m47441e().mo47444a(f23322a, "Skipping component enablement for " + cls.getName());
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            AbstractC12732w abstractC12732wM47441e = AbstractC12732w.m47441e();
            String str = f23322a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z10 ? "enabled" : "disabled");
            abstractC12732wM47441e.mo47444a(str, sb2.toString());
        } catch (Exception e10) {
            AbstractC12732w abstractC12732wM47441e2 = AbstractC12732w.m47441e();
            String str2 = f23322a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z10 ? "enabled" : "disabled");
            abstractC12732wM47441e2.mo47445b(str2, sb3.toString(), e10);
        }
    }
}
