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
import p305n9.C8953m;
import p348p1.C10146t;
import sb.C11266l;

/* JADX INFO: renamed from: ga.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6072o {

    /* JADX INFO: renamed from: g */
    public static final AtomicReference f23362g = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final Application f23363a;

    /* JADX INFO: renamed from: e */
    public WeakReference f23367e;

    /* JADX INFO: renamed from: b */
    public final Application.ActivityLifecycleCallbacks f23364b = new C6071n(this, null);

    /* JADX INFO: renamed from: c */
    public final Object f23365c = new Object();

    /* JADX INFO: renamed from: d */
    public final Set f23366d = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: f */
    public boolean f23368f = false;

    public C6072o(Application application) {
        this.f23363a = application;
    }

    /* JADX INFO: renamed from: a */
    public static C6072o m26925a(Application application) {
        C8953m.m36047l(application);
        AtomicReference atomicReference = f23362g;
        C6072o c6072o = (C6072o) atomicReference.get();
        if (c6072o != null) {
            return c6072o;
        }
        C10146t.m39085a(atomicReference, null, new C6072o(application));
        return (C6072o) atomicReference.get();
    }

    /* JADX INFO: renamed from: b */
    public final void m26926b() {
        synchronized (this.f23365c) {
            try {
                if (!this.f23368f) {
                    this.f23363a.registerActivityLifecycleCallbacks(this.f23364b);
                    this.f23368f = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m26927c(final InterfaceC6069l interfaceC6069l) {
        C8953m.m36047l(interfaceC6069l);
        synchronized (this.f23365c) {
            this.f23366d.add(interfaceC6069l);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m26929e(interfaceC6069l);
        } else {
            C11266l.f39580a.execute(new Runnable() { // from class: ga.m
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f23359a.m26929e(interfaceC6069l);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final Activity m26928d() {
        Activity activity;
        synchronized (this.f23365c) {
            WeakReference weakReference = this.f23367e;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m26930f(Activity activity) {
        C8953m.m36047l(activity);
        synchronized (this.f23365c) {
            try {
                if (m26928d() == activity) {
                    return;
                }
                this.f23367e = new WeakReference(activity);
                Iterator it = this.f23366d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6069l) it.next()).mo26915a(activity);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m26931g(Activity activity) {
        synchronized (this.f23365c) {
            try {
                WeakReference weakReference = this.f23367e;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() == activity) {
                    this.f23367e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: e(Lga/l;)V */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m26929e(InterfaceC6069l interfaceC6069l) {
        Activity activityM26928d = m26928d();
        if (activityM26928d == null) {
            return;
        }
        interfaceC6069l.mo26915a(activityM26928d);
    }
}
