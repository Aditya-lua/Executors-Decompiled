package ge;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f17700o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17701a;
    public final t0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17702c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f17707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f17708i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ServiceConnection f17712m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f17713n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f17703d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f17704e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17705f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IBinder.DeathRecipient f17710k = new IBinder.DeathRecipient() { // from class: ge.v0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            f.k(this.f17730a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f17711l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f17709j = new WeakReference(null);

    public f(Context context, t0 t0Var, String str, Intent intent, a1 a1Var, z0 z0Var) {
        this.f17701a = context;
        this.b = t0Var;
        this.f17702c = str;
        this.f17707h = intent;
        this.f17708i = a1Var;
    }

    public static /* synthetic */ void k(f fVar) {
        fVar.b.c("reportBinderDeath", new Object[0]);
        z0 z0Var = (z0) fVar.f17709j.get();
        if (z0Var != null) {
            fVar.b.c("calling onBinderDied", new Object[0]);
            z0Var.a();
        } else {
            fVar.b.c("%s : Binder has died.", fVar.f17702c);
            Iterator it = fVar.f17703d.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).a(fVar.w());
            }
            fVar.f17703d.clear();
        }
        synchronized (fVar.f17705f) {
            fVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final f fVar, final tb.k kVar) {
        fVar.f17704e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ge.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f17731a.u(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(f fVar, u0 u0Var) {
        if (fVar.f17713n != null || fVar.f17706g) {
            if (!fVar.f17706g) {
                u0Var.run();
                return;
            } else {
                fVar.b.c("Waiting to bind to the service.", new Object[0]);
                fVar.f17703d.add(u0Var);
                return;
            }
        }
        fVar.b.c("Initiate binding to the service.", new Object[0]);
        fVar.f17703d.add(u0Var);
        e eVar = new e(fVar, null);
        fVar.f17712m = eVar;
        fVar.f17706g = true;
        if (fVar.f17701a.bindService(fVar.f17707h, eVar, 1)) {
            return;
        }
        fVar.b.c("Failed to bind to the service.", new Object[0]);
        fVar.f17706g = false;
        Iterator it = fVar.f17703d.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).a(new g());
        }
        fVar.f17703d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(f fVar) {
        fVar.b.c("linkToDeath", new Object[0]);
        try {
            fVar.f17713n.asBinder().linkToDeath(fVar.f17710k, 0);
        } catch (RemoteException e10) {
            fVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(f fVar) {
        fVar.b.c("unlinkToDeath", new Object[0]);
        fVar.f17713n.asBinder().unlinkToDeath(fVar.f17710k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f17700o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f17702c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f17702c, 10);
                    handlerThread.start();
                    map.put(this.f17702c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f17702c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f17713n;
    }

    public final void t(u0 u0Var, tb.k kVar) {
        c().post(new x0(this, u0Var.c(), kVar, u0Var));
    }

    public final /* synthetic */ void u(tb.k kVar, Task task) {
        synchronized (this.f17705f) {
            this.f17704e.remove(kVar);
        }
    }

    public final void v(tb.k kVar) {
        synchronized (this.f17705f) {
            this.f17704e.remove(kVar);
        }
        c().post(new y0(this));
    }

    public final RemoteException w() {
        return new RemoteException(String.valueOf(this.f17702c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f17704e.iterator();
        while (it.hasNext()) {
            ((tb.k) it.next()).d(w());
        }
        this.f17704e.clear();
    }
}
