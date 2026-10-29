package p462u9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.SideEffectFree;
import p213j9.C7099h;

/* JADX INFO: renamed from: u9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11818i {

    /* JADX INFO: renamed from: a */
    public static Boolean f41571a;

    /* JADX INFO: renamed from: b */
    public static Boolean f41572b;

    /* JADX INFO: renamed from: c */
    public static Boolean f41573c;

    /* JADX INFO: renamed from: d */
    public static Boolean f41574d;

    @SideEffectFree
    /* JADX INFO: renamed from: a */
    public static boolean m44181a(@NonNull Context context) {
        return m44188h(context.getPackageManager());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44182b() {
        int i10 = C7099h.f27712a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    /* JADX INFO: renamed from: c */
    public static boolean m44183c(@NonNull Context context) {
        return m44185e(context.getPackageManager());
    }

    @TargetApi(26)
    /* JADX INFO: renamed from: d */
    public static boolean m44184d(@NonNull Context context) {
        if (m44183c(context) && !C11822m.m44199f()) {
            return true;
        }
        if (m44186f(context)) {
            return !C11822m.m44200g() || C11822m.m44203j();
        }
        return false;
    }

    @SideEffectFree
    /* JADX INFO: renamed from: e */
    public static boolean m44185e(@NonNull PackageManager packageManager) {
        if (f41571a == null) {
            f41571a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f41571a.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m44186f(@NonNull Context context) {
        if (f41572b == null) {
            f41572b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f41572b.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m44187g(@NonNull Context context) {
        if (f41573c == null) {
            f41573c = Boolean.valueOf(C11822m.m44200g() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f41573c.booleanValue();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: h */
    public static boolean m44188h(@NonNull PackageManager packageManager) {
        if (f41574d == null) {
            boolean z10 = false;
            if (C11822m.m44200g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f41574d = Boolean.valueOf(z10);
        }
        return f41574d.booleanValue();
    }
}
