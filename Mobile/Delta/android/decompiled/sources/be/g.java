package be;

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
    public static final Map f3995o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3996a;
    public final q1 b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f4002h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f4006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f4007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ae.r f4008n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3998d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f3999e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4000f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f4004j = new IBinder.DeathRecipient() { // from class: be.t1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            g.j(this.f4036a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f4005k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3997c = "SplitInstallService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f4003i = new WeakReference(null);

    public g(Context context, q1 q1Var, String str, Intent intent, ae.r rVar, b bVar) {
        this.f3996a = context;
        this.b = q1Var;
        this.f4002h = intent;
        this.f4008n = rVar;
    }

    public static /* synthetic */ void j(g gVar) {
        gVar.b.d("reportBinderDeath", new Object[0]);
        b bVar = (b) gVar.f4003i.get();
        if (bVar != null) {
            gVar.b.d("calling onBinderDied", new Object[0]);
            bVar.zza();
        } else {
            gVar.b.d("%s : Binder has died.", gVar.f3997c);
            Iterator it = gVar.f3998d.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).b(gVar.v());
            }
            gVar.f3998d.clear();
        }
        synchronized (gVar.f4000f) {
            gVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final g gVar, final sb.k kVar) {
        gVar.f3999e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: be.s1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f4035a.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(g gVar, r1 r1Var) {
        if (gVar.f4007m != null || gVar.f4001g) {
            if (!gVar.f4001g) {
                r1Var.run();
                return;
            } else {
                gVar.b.d("Waiting to bind to the service.", new Object[0]);
                gVar.f3998d.add(r1Var);
                return;
            }
        }
        gVar.b.d("Initiate binding to the service.", new Object[0]);
        gVar.f3998d.add(r1Var);
        f fVar = new f(gVar, null);
        gVar.f4006l = fVar;
        gVar.f4001g = true;
        if (gVar.f3996a.bindService(gVar.f4002h, fVar, 1)) {
            return;
        }
        gVar.b.d("Failed to bind to the service.", new Object[0]);
        gVar.f4001g = false;
        Iterator it = gVar.f3998d.iterator();
        while (it.hasNext()) {
            ((r1) it.next()).b(new h());
        }
        gVar.f3998d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(g gVar) {
        gVar.b.d("linkToDeath", new Object[0]);
        try {
            gVar.f4007m.asBinder().linkToDeath(gVar.f4004j, 0);
        } catch (RemoteException e10) {
            gVar.b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(g gVar) {
        gVar.b.d("unlinkToDeath", new Object[0]);
        gVar.f4007m.asBinder().unlinkToDeath(gVar.f4004j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f3995o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f3997c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f3997c, 10);
                    handlerThread.start();
                    map.put(this.f3997c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f3997c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f4007m;
    }

    public final void s(r1 r1Var, sb.k kVar) {
        c().post(new u1(this, r1Var.a(), kVar, r1Var));
    }

    public final /* synthetic */ void t(sb.k kVar, Task task) {
        synchronized (this.f4000f) {
            this.f3999e.remove(kVar);
        }
    }

    public final void u(sb.k kVar) {
        synchronized (this.f4000f) {
            this.f3999e.remove(kVar);
        }
        c().post(new v1(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f3997c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f3999e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        this.f3999e.clear();
    }
}
