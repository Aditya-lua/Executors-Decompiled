package l9;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f23387e = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f23388a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f23389c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23390d = false;

    public interface a {
        void a(boolean z10);
    }

    @NonNull
    public static c b() {
        return f23387e;
    }

    public static void c(@NonNull Application application) {
        c cVar = f23387e;
        synchronized (cVar) {
            try {
                if (!cVar.f23390d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f23390d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(@NonNull a aVar) {
        synchronized (f23387e) {
            this.f23389c.add(aVar);
        }
    }

    public boolean d() {
        return this.f23388a.get();
    }

    public boolean e(boolean z10) {
        AtomicBoolean atomicBoolean = this.b;
        if (!atomicBoolean.get()) {
            if (u9.n.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f23388a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z10) {
        synchronized (f23387e) {
            try {
                ArrayList arrayList = this.f23389c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((a) obj).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.b;
        boolean zCompareAndSet = this.f23388a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
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
        AtomicBoolean atomicBoolean = this.b;
        boolean zCompareAndSet = this.f23388a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
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
        if (i10 == 20 && this.f23388a.compareAndSet(false, true)) {
            this.b.set(true);
            f(true);
        }
    }
}
