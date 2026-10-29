package w9;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import u9.m;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f34140a;

    public b(@NonNull Context context) {
        this.f34140a = context;
    }

    public int a(@NonNull String str) {
        return this.f34140a.checkCallingOrSelfPermission(str);
    }

    public int b(@NonNull String str, @NonNull String str2) {
        return this.f34140a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    public ApplicationInfo c(@NonNull String str, int i10) {
        return this.f34140a.getPackageManager().getApplicationInfo(str, i10);
    }

    @NonNull
    public CharSequence d(@NonNull String str) {
        Context context = this.f34140a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    public PackageInfo e(@NonNull String str, int i10) {
        return this.f34140a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean f() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.a(this.f34140a);
        }
        if (!m.g()) {
            return false;
        }
        Context context = this.f34140a;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final boolean g(int i10, @NonNull String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f34140a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
