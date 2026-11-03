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
    public static final Map f20573n = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20574a;
    public final d b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Intent f20580h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ServiceConnection f20584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IInterface f20585m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f20576d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f20577e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f20578f = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f20582j = new IBinder.DeathRecipient() { // from class: ib.f
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            o.j(this.f20567a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f20583k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20575c = "AgeSignalsService";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f20581i = new WeakReference(null);

    public o(Context context, d dVar, String str, Intent intent, pd.i iVar, j jVar) {
        this.f20574a = context;
        this.b = dVar;
        this.f20580h = intent;
    }

    public static /* synthetic */ void j(o oVar) {
        d dVar = oVar.b;
        dVar.c("reportBinderDeath", new Object[0]);
        j jVar = (j) oVar.f20581i.get();
        if (jVar != null) {
            dVar.c("calling onBinderDied", new Object[0]);
            jVar.zza();
        } else {
            dVar.c("%s : Binder has died.", oVar.f20575c);
            List list = oVar.f20576d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(oVar.v());
            }
            list.clear();
        }
        synchronized (oVar.f20578f) {
            oVar.w();
        }
    }

    public static /* synthetic */ void k(o oVar, sb.k kVar, Task task) {
        synchronized (oVar.f20578f) {
            oVar.f20577e.remove(kVar);
        }
    }

    public static /* bridge */ /* synthetic */ void o(final o oVar, final sb.k kVar) {
        oVar.f20577e.add(kVar);
        kVar.a().addOnCompleteListener(new OnCompleteListener() { // from class: ib.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                o.k(this.f20568a, kVar, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(o oVar, e eVar) {
        if (oVar.f20585m != null || oVar.f20579g) {
            if (!oVar.f20579g) {
                eVar.run();
                return;
            } else {
                oVar.b.c("Waiting to bind to the service.", new Object[0]);
                oVar.f20576d.add(eVar);
                return;
            }
        }
        d dVar = oVar.b;
        dVar.c("Initiate binding to the service.", new Object[0]);
        List list = oVar.f20576d;
        list.add(eVar);
        m mVar = new m(oVar, null);
        oVar.f20584l = mVar;
        oVar.f20579g = true;
        if (oVar.f20574a.bindService(oVar.f20580h, mVar, 1)) {
            return;
        }
        dVar.c("Failed to bind to the service.", new Object[0]);
        oVar.f20579g = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(new p());
        }
        list.clear();
    }

    public static /* bridge */ /* synthetic */ void r(o oVar) {
        oVar.b.c("linkToDeath", new Object[0]);
        try {
            oVar.f20585m.asBinder().linkToDeath(oVar.f20582j, 0);
        } catch (RemoteException e10) {
            oVar.b.b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(o oVar) {
        oVar.b.c("unlinkToDeath", new Object[0]);
        oVar.f20585m.asBinder().unlinkToDeath(oVar.f20582j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = f20573n;
        synchronized (map) {
            try {
                String str = this.f20575c;
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
        return this.f20585m;
    }

    public final void t(e eVar, sb.k kVar) {
        c().post(new h(this, eVar.c(), kVar, eVar));
    }

    public final void u(sb.k kVar) {
        synchronized (this.f20578f) {
            this.f20577e.remove(kVar);
        }
        c().post(new i(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.f20575c).concat(" : Binder has died."));
    }

    public final void w() {
        Set set = this.f20577e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((sb.k) it.next()).d(v());
        }
        set.clear();
    }
}
