package u9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.SideEffectFree;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f32095a;
    public static Boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f32096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f32097d;

    @SideEffectFree
    public static boolean a(@NonNull Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = j9.h.f21189a;
        return "user".equals(Build.TYPE);
    }

    @SideEffectFree
    public static boolean c(@NonNull Context context) {
        return e(context.getPackageManager());
    }

    @TargetApi(26)
    public static boolean d(@NonNull Context context) {
        if (c(context) && !m.f()) {
            return true;
        }
        if (f(context)) {
            return !m.g() || m.j();
        }
        return false;
    }

    @SideEffectFree
    public static boolean e(@NonNull PackageManager packageManager) {
        if (f32095a == null) {
            f32095a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f32095a.booleanValue();
    }

    public static boolean f(@NonNull Context context) {
        if (b == null) {
            b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return b.booleanValue();
    }

    public static boolean g(@NonNull Context context) {
        if (f32096c == null) {
            f32096c = Boolean.valueOf(m.g() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f32096c.booleanValue();
    }

    @SideEffectFree
    public static boolean h(@NonNull PackageManager packageManager) {
        if (f32097d == null) {
            boolean z10 = false;
            if (m.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f32097d = Boolean.valueOf(z10);
        }
        return f32097d.booleanValue();
    }
}
