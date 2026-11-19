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
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Map f12193o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12194a;
    public final q1 b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f12200h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f12204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f12205m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ce.r f12206n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12196d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f12197e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12198f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f12202j = new IBinder.DeathRecipient() { // from class: de.t1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            g.j(this.f12234a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f12203k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12195c = "SplitInstallService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f12201i = new WeakReference(null);

    public g(Context context, q1 q1Var, String str, Intent intent, ce.r rVar, b bVar) {
        this.f12194a = context;
        this.b = q1Var;
        this.f12200h = intent;
        this.f12206n = rVar;
    }

    public static /* synthetic */ void j(g gVar) {
        gVar.b.d("reportBinderDeath", new Object[0]);
        b bVar = (b) gVar.f12201i.get();
        if (bVar != null) {
            gVar.b.d("calling onBinderDied", new Object[0]);
            bVar.zza();
        } else {
            gVar.b.d("%s : Binder has died.", gVar.f12195c);
            Iterator it = gVar.f12196d.iterator();
            while (it.hasNext()) {
                ((r1) it.next()).b(gVar.v());
            }
            gVar.f12196d.clear();
        }
        synchronized (gVar.f12198f) {
            gVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final g gVar, final tb.k kVar) {
        gVar.f12197e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: de.s1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f12233a.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(g gVar, r1 r1Var) {
        if (gVar.f12205m != null || gVar.f12199g) {
            if (!gVar.f12199g) {
                r1Var.run();
                return;
            } else {
                gVar.b.d("Waiting to bind to the service.", new Object[0]);
                gVar.f12196d.add(r1Var);
                return;
            }
        }
        gVar.b.d("Initiate binding to the service.", new Object[0]);
        gVar.f12196d.add(r1Var);
        f fVar = new f(gVar, null);
        gVar.f12204l = fVar;
        gVar.f12199g = true;
        if (gVar.f12194a.bindService(gVar.f12200h, fVar, 1)) {
            return;
        }
        gVar.b.d("Failed to bind to the service.", new Object[0]);
        gVar.f12199g = false;
        Iterator it = gVar.f12196d.iterator();
        while (it.hasNext()) {
            ((r1) it.next()).b(new h());
        }
        gVar.f12196d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(g gVar) {
        gVar.b.d("linkToDeath", new Object[0]);
        try {
            gVar.f12205m.asBinder().linkToDeath(gVar.f12202j, 0);
        } catch (RemoteException e10) {
            gVar.b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(g gVar) {
        gVar.b.d("unlinkToDeath", new Object[0]);
        gVar.f12205m.asBinder().unlinkToDeath(gVar.f12202j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f12193o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f12195c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f12195c, 10);
                    handlerThread.start();
                    map.put(this.f12195c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f12195c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f12205m;
    }

    public final void s(r1 r1Var, tb.k kVar) {
        c().post(new u1(this, r1Var.a(), kVar, r1Var));
    }

    public final /* synthetic */ void t(tb.k kVar, Task task) {
        synchronized (this.f12198f) {
            this.f12197e.remove(kVar);
        }
    }

    public final void u(tb.k kVar) {
        synchronized (this.f12198f) {
            this.f12197e.remove(kVar);
        }
        c().post(new v1(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f12195c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f12197e.iterator();
        while (it.hasNext()) {
            ((tb.k) it.next()).d(v());
        }
        this.f12197e.clear();
    }
}
