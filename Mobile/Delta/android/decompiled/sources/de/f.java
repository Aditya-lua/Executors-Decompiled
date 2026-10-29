package de;

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
    public static final Map f14577o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14578a;
    public final t0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14579c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f14584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f14585i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ServiceConnection f14589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f14590n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14580d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f14581e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14582f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IBinder.DeathRecipient f14587k = new IBinder.DeathRecipient() { // from class: de.v0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            f.k(this.f14607a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f14588l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f14586j = new WeakReference(null);

    public f(Context context, t0 t0Var, String str, Intent intent, a1 a1Var, z0 z0Var) {
        this.f14578a = context;
        this.b = t0Var;
        this.f14579c = str;
        this.f14584h = intent;
        this.f14585i = a1Var;
    }

    public static /* synthetic */ void k(f fVar) {
        fVar.b.c("reportBinderDeath", new Object[0]);
        z0 z0Var = (z0) fVar.f14586j.get();
        if (z0Var != null) {
            fVar.b.c("calling onBinderDied", new Object[0]);
            z0Var.a();
        } else {
            fVar.b.c("%s : Binder has died.", fVar.f14579c);
            Iterator it = fVar.f14580d.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).a(fVar.w());
            }
            fVar.f14580d.clear();
        }
        synchronized (fVar.f14582f) {
            fVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final f fVar, final sb.k kVar) {
        fVar.f14581e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: de.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f14608a.u(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(f fVar, u0 u0Var) {
        if (fVar.f14590n != null || fVar.f14583g) {
            if (!fVar.f14583g) {
                u0Var.run();
                return;
            } else {
                fVar.b.c("Waiting to bind to the service.", new Object[0]);
                fVar.f14580d.add(u0Var);
                return;
            }
        }
        fVar.b.c("Initiate binding to the service.", new Object[0]);
        fVar.f14580d.add(u0Var);
        e eVar = new e(fVar, null);
        fVar.f14589m = eVar;
        fVar.f14583g = true;
        if (fVar.f14578a.bindService(fVar.f14584h, eVar, 1)) {
            return;
        }
        fVar.b.c("Failed to bind to the service.", new Object[0]);
        fVar.f14583g = false;
        Iterator it = fVar.f14580d.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).a(new g());
        }
        fVar.f14580d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(f fVar) {
        fVar.b.c("linkToDeath", new Object[0]);
        try {
            fVar.f14590n.asBinder().linkToDeath(fVar.f14587k, 0);
        } catch (RemoteException e10) {
            fVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(f fVar) {
        fVar.b.c("unlinkToDeath", new Object[0]);
        fVar.f14590n.asBinder().unlinkToDeath(fVar.f14587k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f14577o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f14579c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f14579c, 10);
                    handlerThread.start();
                    map.put(this.f14579c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f14579c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f14590n;
    }

    public final void t(u0 u0Var, sb.k kVar) {
        c().post(new x0(this, u0Var.c(), kVar, u0Var));
    }

    public final /* synthetic */ void u(sb.k kVar, Task task) {
        synchronized (this.f14582f) {
            this.f14581e.remove(kVar);
        }
    }

    public final void v(sb.k kVar) {
        synchronized (this.f14582f) {
            this.f14581e.remove(kVar);
        }
        c().post(new y0(this));
    }

    public final RemoteException w() {
        return new RemoteException(String.valueOf(this.f14579c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f14581e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(w());
        }
        this.f14581e.clear();
    }
}
