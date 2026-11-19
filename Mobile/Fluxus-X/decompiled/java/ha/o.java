package ha;

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
    public static final AtomicReference f18142g = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f18143a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference f18146e;
    public final Application.ActivityLifecycleCallbacks b = new n(this, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18144c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f18145d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18147f = false;

    public o(Application application) {
        this.f18143a = application;
    }

    public static o a(Application application) {
        o9.s.l(application);
        AtomicReference atomicReference = f18142g;
        o oVar = (o) atomicReference.get();
        if (oVar != null) {
            return oVar;
        }
        p1.t.a(atomicReference, null, new o(application));
        return (o) atomicReference.get();
    }

    public final void b() {
        synchronized (this.f18144c) {
            try {
                if (!this.f18147f) {
                    this.f18143a.registerActivityLifecycleCallbacks(this.b);
                    this.f18147f = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(final l lVar) {
        o9.s.l(lVar);
        synchronized (this.f18144c) {
            this.f18145d.add(lVar);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e(lVar);
        } else {
            tb.l.f32297a.execute(new Runnable() { // from class: ha.m
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f18140a.e(lVar);
                }
            });
        }
    }

    public final Activity d() {
        Activity activity;
        synchronized (this.f18144c) {
            WeakReference weakReference = this.f18146e;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    public final /* synthetic */ void f(Activity activity) {
        o9.s.l(activity);
        synchronized (this.f18144c) {
            try {
                if (d() == activity) {
                    return;
                }
                this.f18146e = new WeakReference(activity);
                Iterator it = this.f18145d.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a(activity);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void g(Activity activity) {
        synchronized (this.f18144c) {
            try {
                WeakReference weakReference = this.f18146e;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() == activity) {
                    this.f18146e = null;
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
