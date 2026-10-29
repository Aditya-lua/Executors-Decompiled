package ib;

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

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Map f20457n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20458a;
    public final d b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f20464h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f20468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f20469m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20460d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f20461e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f20462f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f20466j = new IBinder.DeathRecipient() { // from class: ib.f
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            o.j(this.f20451a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f20467k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20459c = "AgeSignalsService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f20465i = new WeakReference(null);

    public o(Context context, d dVar, String str, Intent intent, od.i iVar, j jVar) {
        this.f20458a = context;
        this.b = dVar;
        this.f20464h = intent;
    }

    public static /* synthetic */ void j(o oVar) {
        d dVar = oVar.b;
        dVar.c("reportBinderDeath", new Object[0]);
        j jVar = (j) oVar.f20465i.get();
        if (jVar != null) {
            dVar.c("calling onBinderDied", new Object[0]);
            jVar.zza();
        } else {
            dVar.c("%s : Binder has died.", oVar.f20459c);
            List list = oVar.f20460d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(oVar.v());
            }
            list.clear();
        }
        synchronized (oVar.f20462f) {
            oVar.w();
        }
    }

    public static /* synthetic */ void k(o oVar, sb.k kVar, Task task) {
        synchronized (oVar.f20462f) {
            oVar.f20461e.remove(kVar);
        }
    }

    public static /* bridge */ /* synthetic */ void o(final o oVar, final sb.k kVar) {
        oVar.f20461e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ib.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                o.k(this.f20452a, kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(o oVar, e eVar) {
        if (oVar.f20469m != null || oVar.f20463g) {
            if (!oVar.f20463g) {
                eVar.run();
                return;
            } else {
                oVar.b.c("Waiting to bind to the service.", new Object[0]);
                oVar.f20460d.add(eVar);
                return;
            }
        }
        d dVar = oVar.b;
        dVar.c("Initiate binding to the service.", new Object[0]);
        List list = oVar.f20460d;
        list.add(eVar);
        m mVar = new m(oVar, null);
        oVar.f20468l = mVar;
        oVar.f20463g = true;
        if (oVar.f20458a.bindService(oVar.f20464h, mVar, 1)) {
            return;
        }
        dVar.c("Failed to bind to the service.", new Object[0]);
        oVar.f20463g = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(new p());
        }
        list.clear();
    }

    public static /* bridge */ /* synthetic */ void r(o oVar) {
        oVar.b.c("linkToDeath", new Object[0]);
        try {
            oVar.f20469m.asBinder().linkToDeath(oVar.f20466j, 0);
        } catch (RemoteException e10) {
            oVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(o oVar) {
        oVar.b.c("unlinkToDeath", new Object[0]);
        oVar.f20469m.asBinder().unlinkToDeath(oVar.f20466j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f20457n;
        synchronized (map) {
            try {
                String str = this.f20459c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f20469m;
    }

    public final void t(e eVar, sb.k kVar) {
        c().post(new h(this, eVar.c(), kVar, eVar));
    }

    public final void u(sb.k kVar) {
        synchronized (this.f20462f) {
            this.f20461e.remove(kVar);
        }
        c().post(new i(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f20459c).concat(" : Binder has died."));
    }

    public final void w() {
        Set set = this.f20461e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        set.clear();
    }
}
