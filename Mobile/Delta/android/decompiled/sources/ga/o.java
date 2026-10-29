package ga;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReference f17966g = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f17967a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f17970e;
    public final Application.ActivityLifecycleCallbacks b = new n(this, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17968c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f17969d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17971f = false;

    public o(Application application) {
        this.f17967a = application;
    }

    public static o a(Application application) {
        n9.m.l(application);
        AtomicReference atomicReference = f17966g;
        o oVar = (o) atomicReference.get();
        if (oVar != null) {
            return oVar;
        }
        p1.t.a(atomicReference, null, new o(application));
        return (o) atomicReference.get();
    }

    public final void b() {
        synchronized (this.f17968c) {
            try {
                if (!this.f17971f) {
                    this.f17967a.registerActivityLifecycleCallbacks(this.b);
                    this.f17971f = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(final l lVar) {
        n9.m.l(lVar);
        synchronized (this.f17968c) {
            this.f17969d.add(lVar);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e(lVar);
        } else {
            sb.l.f30589a.execute(new Runnable() { // from class: ga.m
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f17964a.e(lVar);
                }
            });
        }
    }

    public final Activity d() {
        Activity activity;
        synchronized (this.f17968c) {
            WeakReference weakReference = this.f17970e;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    public final /* synthetic */ void f(Activity activity) {
        n9.m.l(activity);
        synchronized (this.f17968c) {
            try {
                if (d() == activity) {
                    return;
                }
                this.f17970e = new WeakReference(activity);
                Iterator it = this.f17969d.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a(activity);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void g(Activity activity) {
        synchronized (this.f17968c) {
            try {
                WeakReference weakReference = this.f17970e;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() == activity) {
                    this.f17970e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(l lVar) {
        Activity activityD = d();
        if (activityD == null) {
            return;
        }
        lVar.a(activityD);
    }
}
