package ae;

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
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f323o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f324a;
    public final q1 b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f330h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zd.r f336n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f326d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f327e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f328f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f332j = new IBinder.DeathRecipient() { // from class: ae.t1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            g.j(this.f364a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f333k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325c = "SplitInstallService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f331i = new WeakReference(null);

    public g(Context context, q1 q1Var, String str, Intent intent, zd.r rVar, b bVar) {
        this.f324a = context;
        this.b = q1Var;
        this.f330h = intent;
        this.f336n = rVar;
    }

    public static /* synthetic */ void j(g gVar) {
        gVar.b.d("reportBinderDeath", new Object[0]);
        b bVar = (b) gVar.f331i.get();
        if (bVar != null) {
            gVar.b.d("calling onBinderDied", new Object[0]);
            bVar.zza();
        } else {
            gVar.b.d("%s : Binder has died.", gVar.f325c);
            Iterator it = gVar.f326d.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).b(gVar.v());
            }
            gVar.f326d.clear();
        }
        synchronized (gVar.f328f) {
            gVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final g gVar, final sb.k kVar) {
        gVar.f327e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ae.s1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f363a.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(g gVar, r1 r1Var) {
        if (gVar.f335m != null || gVar.f329g) {
            if (!gVar.f329g) {
                r1Var.run();
                return;
            } else {
                gVar.b.d("Waiting to bind to the service.", new Object[0]);
                gVar.f326d.add(r1Var);
                return;
            }
        }
        gVar.b.d("Initiate binding to the service.", new Object[0]);
        gVar.f326d.add(r1Var);
        f fVar = new f(gVar, null);
        gVar.f334l = fVar;
        gVar.f329g = true;
        if (gVar.f324a.bindService(gVar.f330h, fVar, 1)) {
            return;
        }
        gVar.b.d("Failed to bind to the service.", new Object[0]);
        gVar.f329g = false;
        Iterator it = gVar.f326d.iterator();
        while (it.hasNext()) {
            ((r1) it.next()).b(new h());
        }
        gVar.f326d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(g gVar) {
        gVar.b.d("linkToDeath", new Object[0]);
        try {
            gVar.f335m.asBinder().linkToDeath(gVar.f332j, 0);
        } catch (RemoteException e10) {
            gVar.b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(g gVar) {
        gVar.b.d("unlinkToDeath", new Object[0]);
        gVar.f335m.asBinder().unlinkToDeath(gVar.f332j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f323o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f325c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f325c, 10);
                    handlerThread.start();
                    map.put(this.f325c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f325c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f335m;
    }

    public final void s(r1 r1Var, sb.k kVar) {
        c().post(new u1(this, r1Var.a(), kVar, r1Var));
    }

    public final /* synthetic */ void t(sb.k kVar, Task task) {
        synchronized (this.f328f) {
            this.f327e.remove(kVar);
        }
    }

    public final void u(sb.k kVar) {
        synchronized (this.f328f) {
            this.f327e.remove(kVar);
        }
        c().post(new v1(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f325c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f327e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        this.f327e.clear();
    }
}
