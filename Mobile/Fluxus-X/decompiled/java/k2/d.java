package k2;

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

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f20991a;
    public static final Field b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f20992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f20993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f20994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f20995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f20996g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0394d f20997a;
        public final /* synthetic */ Object b;

        public a(C0394d c0394d, Object obj) {
            this.f20997a = c0394d;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20997a.f21000a = this.b;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f20998a;
        public final /* synthetic */ C0394d b;

        public b(Application application, C0394d c0394d) {
            this.f20998a = application;
            this.b = c0394d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20998a.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f20999a;
        public final /* synthetic */ Object b;

        public c(Object obj, Object obj2) {
            this.f20999a = obj;
            this.b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f20993d;
                if (method != null) {
                    method.invoke(this.f20999a, this.b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f20994e.invoke(this.f20999a, this.b, Boolean.FALSE);
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

    /* JADX INFO: renamed from: k2.d$d, reason: collision with other inner class name */
    public static final class C0394d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21000a;
        public Activity b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21002d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f21003e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21004f = false;

        public C0394d(Activity activity) {
            this.b = activity;
            this.f21001c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.f21003e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f21003e || this.f21004f || this.f21002d || !d.h(this.f21000a, this.f21001c, activity)) {
                return;
            }
            this.f21004f = true;
            this.f21000a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.f21002d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f20991a = clsA;
        b = b();
        f20992c = f();
        f20993d = d(clsA);
        f20994e = c(clsA);
        f20995f = e(clsA);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
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

    public static Method d(Class<?> cls) {
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

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
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

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f20992c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f20996g.postAtFrontOfQueue(new c(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f20995f == null) {
            return false;
        }
        if (f20994e == null && f20993d == null) {
            return false;
        }
        try {
            Object obj2 = f20992c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0394d c0394d = new C0394d(activity);
            application.registerActivityLifecycleCallbacks(c0394d);
            f20996g.post(new a(c0394d, obj2));
            try {
                if (g()) {
                    Method method = f20995f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f20996g.post(new b(application, c0394d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
