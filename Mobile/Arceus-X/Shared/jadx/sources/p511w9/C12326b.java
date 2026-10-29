package p511w9;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import p462u9.C11822m;

/* JADX INFO: renamed from: w9.b */
/* JADX INFO: loaded from: classes.dex */
public class C12326b {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Context f44182a;

    public C12326b(@NonNull Context context) {
        this.f44182a = context;
    }

    /* JADX INFO: renamed from: a */
    public int m46174a(@NonNull String str) {
        return this.f44182a.checkCallingOrSelfPermission(str);
    }

    /* JADX INFO: renamed from: b */
    public int m46175b(@NonNull String str, @NonNull String str2) {
        return this.f44182a.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public ApplicationInfo m46176c(@NonNull String str, int i10) {
        return this.f44182a.getPackageManager().getApplicationInfo(str, i10);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public CharSequence m46177d(@NonNull String str) {
        Context context = this.f44182a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public PackageInfo m46178e(@NonNull String str, int i10) {
        return this.f44182a.getPackageManager().getPackageInfo(str, i10);
    }

    /* JADX INFO: renamed from: f */
    public boolean m46179f() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C12325a.m46173a(this.f44182a);
        }
        if (!C11822m.m44200g()) {
            return false;
        }
        Context context = this.f44182a;
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m46180g(int i10, @NonNull String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f44182a.getSystemService("appops");
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
