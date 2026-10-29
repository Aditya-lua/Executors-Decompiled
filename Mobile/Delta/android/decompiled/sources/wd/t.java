package wd;

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
public final class t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map f34174n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34175a;
    public final i b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f34181h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f34185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f34186m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f34177d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f34178e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34179f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f34183j = new IBinder.DeathRecipient() { // from class: wd.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f34168a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f34184k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34176c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f34182i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, vd.d dVar, o oVar) {
        this.f34175a = context;
        this.b = iVar;
        this.f34181h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f34182i.get();
        if (oVar != null) {
            tVar.b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.b.c("%s : Binder has died.", tVar.f34176c);
            Iterator it = tVar.f34177d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f34177d.clear();
        }
        synchronized (tVar.f34179f) {
            tVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final t tVar, final sb.k kVar) {
        tVar.f34178e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: wd.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f34169a.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f34186m != null || tVar.f34180g) {
            if (!tVar.f34180g) {
                jVar.run();
                return;
            } else {
                tVar.b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f34177d.add(jVar);
                return;
            }
        }
        tVar.b.c("Initiate binding to the service.", new Object[0]);
        tVar.f34177d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f34185l = rVar;
        tVar.f34180g = true;
        if (tVar.f34175a.bindService(tVar.f34181h, rVar, 1)) {
            return;
        }
        tVar.b.c("Failed to bind to the service.", new Object[0]);
        tVar.f34180g = false;
        Iterator it = tVar.f34177d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f34177d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.b.c("linkToDeath", new Object[0]);
        try {
            tVar.f34186m.asBinder().linkToDeath(tVar.f34183j, 0);
        } catch (RemoteException e10) {
            tVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.b.c("unlinkToDeath", new Object[0]);
        tVar.f34186m.asBinder().unlinkToDeath(tVar.f34183j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f34174n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f34176c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f34176c, 10);
                    handlerThread.start();
                    map.put(this.f34176c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f34176c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f34186m;
    }

    public final void s(j jVar, sb.k kVar) {
        c().post(new m(this, jVar.b(), kVar, jVar));
    }

    public final /* synthetic */ void t(sb.k kVar, Task task) {
        synchronized (this.f34179f) {
            this.f34178e.remove(kVar);
        }
    }

    public final void u(sb.k kVar) {
        synchronized (this.f34179f) {
            this.f34178e.remove(kVar);
        }
        c().post(new n(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f34176c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f34178e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        this.f34178e.clear();
    }
}
