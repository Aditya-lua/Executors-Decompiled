package xd;

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
    public static final Map f35673n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f35674a;
    public final i b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f35680h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f35684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f35685m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f35676d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f35677e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f35678f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f35682j = new IBinder.DeathRecipient() { // from class: xd.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.j(this.f35667a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f35683k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35675c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f35681i = new WeakReference(null);

    public t(Context context, i iVar, String str, Intent intent, wd.d dVar, o oVar) {
        this.f35674a = context;
        this.b = iVar;
        this.f35680h = intent;
    }

    public static /* synthetic */ void j(t tVar) {
        tVar.b.c("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f35681i.get();
        if (oVar != null) {
            tVar.b.c("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.b.c("%s : Binder has died.", tVar.f35675c);
            Iterator it = tVar.f35676d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.v());
            }
            tVar.f35676d.clear();
        }
        synchronized (tVar.f35678f) {
            tVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final t tVar, final sb.k kVar) {
        tVar.f35677e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: xd.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f35668a.t(kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(t tVar, j jVar) {
        if (tVar.f35685m != null || tVar.f35679g) {
            if (!tVar.f35679g) {
                jVar.run();
                return;
            } else {
                tVar.b.c("Waiting to bind to the service.", new Object[0]);
                tVar.f35676d.add(jVar);
                return;
            }
        }
        tVar.b.c("Initiate binding to the service.", new Object[0]);
        tVar.f35676d.add(jVar);
        r rVar = new r(tVar, null);
        tVar.f35684l = rVar;
        tVar.f35679g = true;
        if (tVar.f35674a.bindService(tVar.f35680h, rVar, 1)) {
            return;
        }
        tVar.b.c("Failed to bind to the service.", new Object[0]);
        tVar.f35679g = false;
        Iterator it = tVar.f35676d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new u());
        }
        tVar.f35676d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(t tVar) {
        tVar.b.c("linkToDeath", new Object[0]);
        try {
            tVar.f35685m.asBinder().linkToDeath(tVar.f35682j, 0);
        } catch (RemoteException e10) {
            tVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(t tVar) {
        tVar.b.c("unlinkToDeath", new Object[0]);
        tVar.f35685m.asBinder().unlinkToDeath(tVar.f35682j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f35673n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f35675c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f35675c, 10);
                    handlerThread.start();
                    map.put(this.f35675c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f35675c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f35685m;
    }

    public final void s(j jVar, sb.k kVar) {
        c().post(new m(this, jVar.b(), kVar, jVar));
    }

    public final /* synthetic */ void t(sb.k kVar, Task task) {
        synchronized (this.f35678f) {
            this.f35677e.remove(kVar);
        }
    }

    public final void u(sb.k kVar) {
        synchronized (this.f35678f) {
            this.f35677e.remove(kVar);
        }
        c().post(new n(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f35675c).concat(" : Binder has died."));
    }

    public final void w() {
        Iterator it = this.f35677e.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        this.f35677e.clear();
    }
}
