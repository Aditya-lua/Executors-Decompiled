package zd;

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
    public static final Map f39224n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39225a;
    public final i b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f39230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f39231h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f39235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f39236m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39227d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f39228e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f39229f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f39233j = new IBinder.DeathRecipient() { // from class: zd.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f39218a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f39234k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39226c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f39232i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, yd.i iVar2, o oVar) {
        this.f39225a = context;
        this.b = iVar;
        this.f39231h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f39232i.get();
        if (oVar != null) {
            tVar.b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.b.c("%s : Binder has died.", tVar.f39226c);
            Iterator it = tVar.f39227d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f39227d.clear();
        }
        synchronized (tVar.f39229f) {
            tVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final t tVar, final tb.k kVar) {
        tVar.f39228e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: zd.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f39219a.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f39236m != null || tVar.f39230g) {
            if (!tVar.f39230g) {
                jVar.run();
                return;
            } else {
                tVar.b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f39227d.add(jVar);
                return;
            }
        }
        tVar.b.c("Initiate binding to the service.", new Object[0]);
        tVar.f39227d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f39235l = rVar;
        tVar.f39230g = true;
        if (tVar.f39225a.bindService(tVar.f39231h, rVar, 1)) {
            return;
        }
        tVar.b.c("Failed to bind to the service.", new Object[0]);
        tVar.f39230g = false;
        Iterator it = tVar.f39227d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f39227d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.b.c("linkToDeath", new Object[0]);
        try {
            tVar.f39236m.asBinder().linkToDeath(tVar.f39233j, 0);
        } catch (RemoteException e10) {
            tVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.b.c("unlinkToDeath", new Object[0]);
        tVar.f39236m.asBinder().unlinkToDeath(tVar.f39233j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f39224n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f39226c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f39226c, 10);
                    handlerThread.start();
                    map.put(this.f39226c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f39226c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f39236m;
    }

    public final void s(j jVar, tb.k kVar) {
        c().post(new m(this, jVar.b(), kVar, jVar));
    }

    public final /* synthetic */ void t(tb.k kVar, Task task) {
        synchronized (this.f39229f) {
            this.f39228e.remove(kVar);
        }
    }

    public final void u(tb.k kVar) {
        synchronized (this.f39229f) {
            this.f39228e.remove(kVar);
        }
        c().post(new n(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f39226c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f39228e.iterator();
        while (it.hasNext()) {
            ((tb.k) it.next()).d(v());
        }
        this.f39228e.clear();
    }
}
