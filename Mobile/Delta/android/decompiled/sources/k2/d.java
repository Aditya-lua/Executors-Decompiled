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
    public static final Class<?> f22244a;
    public static final Field b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f22245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f22246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f22247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f22248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Handler f22249g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0388d f22250a;
        public final /* synthetic */ Object b;

        public a(C0388d c0388d, Object obj) {
            this.f22250a = c0388d;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22250a.f22253a = this.b;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f22251a;
        public final /* synthetic */ C0388d b;

        public b(Application application, C0388d c0388d) {
            this.f22251a = application;
            this.b = c0388d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22251a.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f22252a;
        public final /* synthetic */ Object b;

        public c(Object obj, Object obj2) {
            this.f22252a = obj;
            this.b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f22246d;
                if (method != null) {
                    method.invoke(this.f22252a, this.b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f22247e.invoke(this.f22252a, this.b, Boolean.FALSE);
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
    public static final class C0388d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f22253a;
        public Activity b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f22255d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f22256e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f22257f = false;

        public C0388d(Activity activity) {
            this.b = activity;
            this.f22254c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.f22256e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f22256e || this.f22257f || this.f22255d || !d.h(this.f22253a, this.f22254c, activity)) {
                return;
            }
            this.f22257f = true;
            this.f22253a = null;
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
                this.f22255d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f22244a = clsA;
        b = b();
        f22245c = f();
        f22246d = d(clsA);
        f22247e = c(clsA);
        f22248f = e(clsA);
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
            Object obj2 = f22245c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f22249g.postAtFrontOfQueue(new c(b.get(activity), obj2));
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
        if (g() && f22248f == null) {
            return false;
        }
        if (f22247e == null && f22246d == null) {
            return false;
        }
        try {
            Object obj2 = f22245c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0388d c0388d = new C0388d(activity);
            application.registerActivityLifecycleCallbacks(c0388d);
            f22249g.post(new a(c0388d, obj2));
            try {
                if (g()) {
                    Method method = f22248f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f22249g.post(new b(application, c0388d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
