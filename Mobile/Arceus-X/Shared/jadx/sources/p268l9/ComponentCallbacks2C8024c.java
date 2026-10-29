package p268l9;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p462u9.C11823n;

/* JADX INFO: renamed from: l9.c */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C8024c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    public static final ComponentCallbacks2C8024c f29979e = new ComponentCallbacks2C8024c();

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f29980a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f29981b = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    public final ArrayList f29982c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f29983d = false;

    /* JADX INFO: renamed from: l9.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo25278a(boolean z10);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static ComponentCallbacks2C8024c m33119b() {
        return f29979e;
    }

    /* JADX INFO: renamed from: c */
    public static void m33120c(@NonNull Application application) {
        ComponentCallbacks2C8024c componentCallbacks2C8024c = f29979e;
        synchronized (componentCallbacks2C8024c) {
            try {
                if (!componentCallbacks2C8024c.f29983d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C8024c);
                    application.registerComponentCallbacks(componentCallbacks2C8024c);
                    componentCallbacks2C8024c.f29983d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m33121a(@NonNull a aVar) {
        synchronized (f29979e) {
            this.f29982c.add(aVar);
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m33122d() {
        return this.f29980a.get();
    }

    /* JADX INFO: renamed from: e */
    public boolean m33123e(boolean z10) {
        AtomicBoolean atomicBoolean = this.f29981b;
        if (!atomicBoolean.get()) {
            if (C11823n.m44206b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f29980a.set(true);
            }
        }
        return m33122d();
    }

    /* JADX INFO: renamed from: f */
    public final void m33124f(boolean z10) {
        synchronized (f29979e) {
            try {
                ArrayList arrayList = this.f29982c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((a) obj).mo25278a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f29981b;
        boolean zCompareAndSet = this.f29980a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m33124f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        AtomicBoolean atomicBoolean = this.f29981b;
        boolean zCompareAndSet = this.f29980a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m33124f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f29980a.compareAndSet(false, true)) {
            this.f29981b.set(true);
            m33124f(true);
        }
    }
}
