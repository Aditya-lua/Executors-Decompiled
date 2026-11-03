package ee;

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
    public static final Map f16073o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16074a;
    public final t0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16075c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f16080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a1 f16081i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ServiceConnection f16085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IInterface f16086n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16076d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f16077e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16078f = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IBinder.DeathRecipient f16083k = new IBinder.DeathRecipient() { // from class: ee.v0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            f.k(this.f16103a);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicInteger f16084l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f16082j = new WeakReference(null);

    public f(Context context, t0 t0Var, String str, Intent intent, a1 a1Var, z0 z0Var) {
        this.f16074a = context;
        this.b = t0Var;
        this.f16075c = str;
        this.f16080h = intent;
        this.f16081i = a1Var;
    }

    public static /* synthetic */ void k(f fVar) {
        fVar.b.c("reportBinderDeath", new Object[0]);
        z0 z0Var = (z0) fVar.f16082j.get();
        if (z0Var != null) {
            fVar.b.c("calling onBinderDied", new Object[0]);
            z0Var.a();
        } else {
            fVar.b.c("%s : Binder has died.", fVar.f16075c);
            Iterator it = fVar.f16076d.iterator();
            while (it.hasNext()) {
                ((u0) it.next()).a(fVar.w());
            }
            fVar.f16076d.clear();
        }
        synchronized (fVar.f16078f) {
            fVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final f fVar, final sb.k kVar) {
        fVar.f16077e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ee.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f16104a.u(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(f fVar, u0 u0Var) {
        if (fVar.f16086n != null || fVar.f16079g) {
            if (!fVar.f16079g) {
                u0Var.run();
                return;
            } else {
                fVar.b.c("Waiting to bind to the service.", new Object[0]);
                fVar.f16076d.add(u0Var);
                return;
            }
        }
        fVar.b.c("Initiate binding to the service.", new Object[0]);
        fVar.f16076d.add(u0Var);
        e eVar = new e(fVar, null);
        fVar.f16085m = eVar;
        fVar.f16079g = true;
        if (fVar.f16074a.bindService(fVar.f16080h, eVar, 1)) {
            return;
        }
        fVar.b.c("Failed to bind to the service.", new Object[0]);
        fVar.f16079g = false;
        Iterator it = fVar.f16076d.iterator();
        while (it.hasNext()) {
            ((u0) it.next()).a(new g());
        }
        fVar.f16076d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(f fVar) {
        fVar.b.c("linkToDeath", new Object[0]);
        try {
            fVar.f16086n.asBinder().linkToDeath(fVar.f16083k, 0);
        } catch (RemoteException e10) {
            fVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(f fVar) {
        fVar.b.c("unlinkToDeath", new Object[0]);
        fVar.f16086n.asBinder().unlinkToDeath(fVar.f16083k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f16073o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f16075c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f16075c, 10);
                    handlerThread.start();
                    map.put(this.f16075c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f16075c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f16086n;
    }

    public final void t(u0 u0Var, sb.k kVar) {
        c().post(new x0(this, u0Var.c(), kVar, u0Var));
    }

    public final /* synthetic */ void u(sb.k kVar, Task task) {
        synchronized (this.f16078f) {
            this.f16077e.remove(kVar);
        }
    }

    public final void v(sb.k kVar) {
        synchronized (this.f16078f) {
            this.f16077e.remove(kVar);
        }
        c().post(new y0(this));
    }

    public final RemoteException w() {
        return new RemoteException(String.valueOf(this.f16075c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.f16077e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(w());
        }
        this.f16077e.clear();
    }
}
