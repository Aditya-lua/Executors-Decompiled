package v9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f34248a;
    public static final Method b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f34249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f34250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f34251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f34252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f34253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f34254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Method f34255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f34256j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f34248a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f34249c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f34250d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f34251e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f34252f = method5;
        if (m.h()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f34253g = method6;
        if (m.h()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f34254h = method7;
        if (m.h()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f34255i = method8;
        f34256j = null;
    }

    public static void a(@NonNull WorkSource workSource, int i10, @NonNull String str) {
        Method method = f34249c;
        if (method != null) {
            if (str == null) {
                str = BuildConfig.FLAVOR;
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    @NonNull
    public static WorkSource b(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = x9.c.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(@NonNull Context context) {
        Boolean bool = f34256j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = l2.b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f34256j = Boolean.valueOf(z10);
        return z10;
    }
}
