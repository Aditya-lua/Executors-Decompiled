package p235k2;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: k2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7412d {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f28514a;

    /* JADX INFO: renamed from: b */
    public static final Field f28515b;

    /* JADX INFO: renamed from: c */
    public static final Field f28516c;

    /* JADX INFO: renamed from: d */
    public static final Method f28517d;

    /* JADX INFO: renamed from: e */
    public static final Method f28518e;

    /* JADX INFO: renamed from: f */
    public static final Method f28519f;

    /* JADX INFO: renamed from: g */
    public static final Handler f28520g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k2.d$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f28521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f28522b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(d dVar, Object obj) {
            this.f28521a = dVar;
            this.f28522b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28521a.f28527a = this.f28522b;
        }
    }

    /* JADX INFO: renamed from: k2.d$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Application f28523a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d f28524b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(Application application, d dVar) {
            this.f28523a = application;
            this.f28524b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28523a.unregisterActivityLifecycleCallbacks(this.f28524b);
        }
    }

    /* JADX INFO: renamed from: k2.d$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f28525a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f28526b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(Object obj, Object obj2) {
            this.f28525a = obj;
            this.f28526b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C7412d.f28517d;
                if (method != null) {
                    method.invoke(this.f28525a, this.f28526b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C7412d.f28518e.invoke(this.f28525a, this.f28526b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX INFO: renamed from: k2.d$d */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public Object f28527a;

        /* JADX INFO: renamed from: b */
        public Activity f28528b;

        /* JADX INFO: renamed from: c */
        public final int f28529c;

        /* JADX INFO: renamed from: d */
        public boolean f28530d = false;

        /* JADX INFO: renamed from: e */
        public boolean f28531e = false;

        /* JADX INFO: renamed from: f */
        public boolean f28532f = false;

        public d(Activity activity) {
            this.f28528b = activity;
            this.f28529c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f28528b == activity) {
                this.f28528b = null;
                this.f28531e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f28531e || this.f28532f || this.f28530d || !C7412d.m30715h(this.f28527a, this.f28529c, activity)) {
                return;
            }
            this.f28532f = true;
            this.f28527a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f28528b == activity) {
                this.f28530d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsM30708a = m30708a();
        f28514a = clsM30708a;
        f28515b = m30709b();
        f28516c = m30713f();
        f28517d = m30711d(clsM30708a);
        f28518e = m30710c(clsM30708a);
        f28519f = m30712e(clsM30708a);
    }

    /* JADX INFO: renamed from: a */
    public static Class<?> m30708a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Field m30709b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Method m30710c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Method m30711d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Method m30712e(Class<?> cls) {
        if (m30714g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Field m30713f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m30714g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m30715h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f28516c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f28520g.postAtFrontOfQueue(new c(f28515b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m30716i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m30714g() && f28519f == null) {
            return false;
        }
        if (f28518e == null && f28517d == null) {
            return false;
        }
        try {
            Object obj2 = f28516c.get(activity);
            if (obj2 == null || (obj = f28515b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            f28520g.post(new a(dVar, obj2));
            try {
                if (m30714g()) {
                    Method method = f28519f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f28520g.post(new b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
