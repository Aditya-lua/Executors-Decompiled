package p462u9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import p261l2.C7975b;
import p511w9.C12327c;

/* JADX INFO: renamed from: u9.q */
/* JADX INFO: loaded from: classes.dex */
public class C11826q {

    /* JADX INFO: renamed from: a */
    public static final int f41581a;

    /* JADX INFO: renamed from: b */
    public static final Method f41582b;

    /* JADX INFO: renamed from: c */
    public static final Method f41583c;

    /* JADX INFO: renamed from: d */
    public static final Method f41584d;

    /* JADX INFO: renamed from: e */
    public static final Method f41585e;

    /* JADX INFO: renamed from: f */
    public static final Method f41586f;

    /* JADX INFO: renamed from: g */
    public static final Method f41587g;

    /* JADX INFO: renamed from: h */
    public static final Method f41588h;

    /* JADX INFO: renamed from: i */
    public static final Method f41589i;

    /* JADX INFO: renamed from: j */
    public static Boolean f41590j;

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
        f41581a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f41582b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f41583c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f41584d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f41585e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f41586f = method5;
        if (C11822m.m44201h()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f41587g = method6;
        if (C11822m.m44201h()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f41588h = method7;
        if (C11822m.m44201h()) {
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
        f41589i = method8;
        f41590j = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m44210a(@NonNull WorkSource workSource, int i10, @NonNull String str) {
        Method method = f41583c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f41582b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static WorkSource m44211b(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoM46176c = C12327c.m46181a(context).m46176c(str, 0);
                if (applicationInfoM46176c == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoM46176c.uid;
                WorkSource workSource = new WorkSource();
                m44210a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized boolean m44212c(@NonNull Context context) {
        Boolean bool = f41590j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = C7975b.m33003a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f41590j = Boolean.valueOf(z10);
        return z10;
    }
}
