package be;

import ae.C0185r;
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
import sb.C11264k;

/* JADX INFO: renamed from: be.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1323g {

    /* JADX INFO: renamed from: o */
    public static final Map f5355o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f5356a;

    /* JADX INFO: renamed from: b */
    public final C1355q1 f5357b;

    /* JADX INFO: renamed from: g */
    public boolean f5362g;

    /* JADX INFO: renamed from: h */
    public final Intent f5363h;

    /* JADX INFO: renamed from: l */
    public ServiceConnection f5367l;

    /* JADX INFO: renamed from: m */
    public IInterface f5368m;

    /* JADX INFO: renamed from: n */
    public final C0185r f5369n;

    /* JADX INFO: renamed from: d */
    public final List f5359d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Set f5360e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f5361f = new Object();

    /* JADX INFO: renamed from: j */
    public final IBinder.DeathRecipient f5365j = new IBinder.DeathRecipient() { // from class: be.t1
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C1323g.m7141j(this.f5405a);
        }
    };

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f5366k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f5358c = "SplitInstallService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f5364i = new WeakReference(null);

    public C1323g(Context context, C1355q1 c1355q1, String str, Intent intent, C0185r c0185r, InterfaceC1308b interfaceC1308b) {
        this.f5356a = context;
        this.f5357b = c1355q1;
        this.f5363h = intent;
        this.f5369n = c0185r;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m7141j(C1323g c1323g) {
        c1323g.f5357b.m7210d("reportBinderDeath", new Object[0]);
        InterfaceC1308b interfaceC1308b = (InterfaceC1308b) c1323g.f5364i.get();
        if (interfaceC1308b != null) {
            c1323g.f5357b.m7210d("calling onBinderDied", new Object[0]);
            interfaceC1308b.zza();
        } else {
            c1323g.f5357b.m7210d("%s : Binder has died.", c1323g.f5358c);
            Iterator it = c1323g.f5359d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC1358r1) it.next()).m7215b(c1323g.m7155v());
            }
            c1323g.f5359d.clear();
        }
        synchronized (c1323g.f5361f) {
            c1323g.m7156w();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m7145n(final C1323g c1323g, final C11264k c11264k) {
        c1323g.f5360e.add(c11264k);
        c11264k.m42326a().addOnCompleteListener(new OnCompleteListener() { // from class: be.s1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f5403a.m7153t(c11264k, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m7147p(C1323g c1323g, AbstractRunnableC1358r1 abstractRunnableC1358r1) {
        if (c1323g.f5368m != null || c1323g.f5362g) {
            if (!c1323g.f5362g) {
                abstractRunnableC1358r1.run();
                return;
            } else {
                c1323g.f5357b.m7210d("Waiting to bind to the service.", new Object[0]);
                c1323g.f5359d.add(abstractRunnableC1358r1);
                return;
            }
        }
        c1323g.f5357b.m7210d("Initiate binding to the service.", new Object[0]);
        c1323g.f5359d.add(abstractRunnableC1358r1);
        ServiceConnectionC1320f serviceConnectionC1320f = new ServiceConnectionC1320f(c1323g, null);
        c1323g.f5367l = serviceConnectionC1320f;
        c1323g.f5362g = true;
        if (c1323g.f5356a.bindService(c1323g.f5363h, serviceConnectionC1320f, 1)) {
            return;
        }
        c1323g.f5357b.m7210d("Failed to bind to the service.", new Object[0]);
        c1323g.f5362g = false;
        Iterator it = c1323g.f5359d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC1358r1) it.next()).m7215b(new C1326h());
        }
        c1323g.f5359d.clear();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m7148q(C1323g c1323g) {
        c1323g.f5357b.m7210d("linkToDeath", new Object[0]);
        try {
            c1323g.f5368m.asBinder().linkToDeath(c1323g.f5365j, 0);
        } catch (RemoteException e10) {
            c1323g.f5357b.m7209c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m7149r(C1323g c1323g) {
        c1323g.f5357b.m7210d("unlinkToDeath", new Object[0]);
        c1323g.f5368m.asBinder().unlinkToDeath(c1323g.f5365j, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Handler m7150c() {
        Handler handler;
        Map map = f5355o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f5358c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f5358c, 10);
                    handlerThread.start();
                    map.put(this.f5358c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f5358c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m7151e() {
        return this.f5368m;
    }

    /* JADX INFO: renamed from: s */
    public final void m7152s(AbstractRunnableC1358r1 abstractRunnableC1358r1, C11264k c11264k) {
        m7150c().post(new C1367u1(this, abstractRunnableC1358r1.m7214a(), c11264k, abstractRunnableC1358r1));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m7153t(C11264k c11264k, Task task) {
        synchronized (this.f5361f) {
            this.f5360e.remove(c11264k);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7154u(C11264k c11264k) {
        synchronized (this.f5361f) {
            this.f5360e.remove(c11264k);
        }
        m7150c().post(new C1370v1(this));
    }

    /* JADX INFO: renamed from: v */
    public final RemoteException m7155v() {
        return new RemoteException(String.valueOf(this.f5358c).concat(" : Binder has died."));
    }

    /* JADX INFO: renamed from: w */
    public final void m7156w() {
        Iterator it = this.f5360e.iterator();
        while (it.hasNext()) {
            ((C11264k) it.next()).m42329d(m7155v());
        }
        this.f5360e.clear();
    }
}
