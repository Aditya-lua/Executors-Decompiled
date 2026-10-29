package p543xd;

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
import p514wd.C12352d;
import sb.C11264k;

/* JADX INFO: renamed from: xd.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C12799t {

    /* JADX INFO: renamed from: n */
    public static final Map f45532n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f45533a;

    /* JADX INFO: renamed from: b */
    public final C12788i f45534b;

    /* JADX INFO: renamed from: g */
    public boolean f45539g;

    /* JADX INFO: renamed from: h */
    public final Intent f45540h;

    /* JADX INFO: renamed from: l */
    public ServiceConnection f45544l;

    /* JADX INFO: renamed from: m */
    public IInterface f45545m;

    /* JADX INFO: renamed from: d */
    public final List f45536d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Set f45537e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f45538f = new Object();

    /* JADX INFO: renamed from: j */
    public final IBinder.DeathRecipient f45542j = new IBinder.DeathRecipient() { // from class: xd.k
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C12799t.m47663j(this.f45521a);
        }
    };

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f45543k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f45535c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f45541i = new WeakReference(null);

    public C12799t(Context context, C12788i c12788i, String str, Intent intent, C12352d c12352d, InterfaceC12794o interfaceC12794o) {
        this.f45533a = context;
        this.f45534b = c12788i;
        this.f45540h = intent;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m47663j(C12799t c12799t) {
        c12799t.f45534b.m47652c("reportBinderDeath", new Object[0]);
        InterfaceC12794o interfaceC12794o = (InterfaceC12794o) c12799t.f45541i.get();
        if (interfaceC12794o != null) {
            c12799t.f45534b.m47652c("calling onBinderDied", new Object[0]);
            interfaceC12794o.zza();
        } else {
            c12799t.f45534b.m47652c("%s : Binder has died.", c12799t.f45535c);
            Iterator it = c12799t.f45536d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC12789j) it.next()).m47655c(c12799t.m47677v());
            }
            c12799t.f45536d.clear();
        }
        synchronized (c12799t.f45538f) {
            c12799t.m47678w();
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m47667n(final C12799t c12799t, final C11264k c11264k) {
        c12799t.f45537e.add(c11264k);
        c11264k.m42326a().addOnCompleteListener(new OnCompleteListener() { // from class: xd.l
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f45522a.m47675t(c11264k, task);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m47669p(C12799t c12799t, AbstractRunnableC12789j abstractRunnableC12789j) {
        if (c12799t.f45545m != null || c12799t.f45539g) {
            if (!c12799t.f45539g) {
                abstractRunnableC12789j.run();
                return;
            } else {
                c12799t.f45534b.m47652c("Waiting to bind to the service.", new Object[0]);
                c12799t.f45536d.add(abstractRunnableC12789j);
                return;
            }
        }
        c12799t.f45534b.m47652c("Initiate binding to the service.", new Object[0]);
        c12799t.f45536d.add(abstractRunnableC12789j);
        ServiceConnectionC12797r serviceConnectionC12797r = new ServiceConnectionC12797r(c12799t, null);
        c12799t.f45544l = serviceConnectionC12797r;
        c12799t.f45539g = true;
        if (c12799t.f45533a.bindService(c12799t.f45540h, serviceConnectionC12797r, 1)) {
            return;
        }
        c12799t.f45534b.m47652c("Failed to bind to the service.", new Object[0]);
        c12799t.f45539g = false;
        Iterator it = c12799t.f45536d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC12789j) it.next()).m47655c(new C12800u());
        }
        c12799t.f45536d.clear();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m47670q(C12799t c12799t) {
        c12799t.f45534b.m47652c("linkToDeath", new Object[0]);
        try {
            c12799t.f45545m.asBinder().linkToDeath(c12799t.f45542j, 0);
        } catch (RemoteException e10) {
            c12799t.f45534b.m47651b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m47671r(C12799t c12799t) {
        c12799t.f45534b.m47652c("unlinkToDeath", new Object[0]);
        c12799t.f45545m.asBinder().unlinkToDeath(c12799t.f45542j, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Handler m47672c() {
        Handler handler;
        Map map = f45532n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f45535c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f45535c, 10);
                    handlerThread.start();
                    map.put(this.f45535c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f45535c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m47673e() {
        return this.f45545m;
    }

    /* JADX INFO: renamed from: s */
    public final void m47674s(AbstractRunnableC12789j abstractRunnableC12789j, C11264k c11264k) {
        m47672c().post(new C12792m(this, abstractRunnableC12789j.m47654b(), c11264k, abstractRunnableC12789j));
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m47675t(C11264k c11264k, Task task) {
        synchronized (this.f45538f) {
            this.f45537e.remove(c11264k);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m47676u(C11264k c11264k) {
        synchronized (this.f45538f) {
            this.f45537e.remove(c11264k);
        }
        m47672c().post(new C12793n(this));
    }

    /* JADX INFO: renamed from: v */
    public final RemoteException m47677v() {
        return new RemoteException(String.valueOf(this.f45535c).concat(" : Binder has died."));
    }

    /* JADX INFO: renamed from: w */
    public final void m47678w() {
        Iterator it = this.f45537e.iterator();
        while (it.hasNext()) {
            ((C11264k) it.next()).m42329d(m47677v());
        }
        this.f45537e.clear();
    }
}
