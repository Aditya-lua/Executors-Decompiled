package ee;

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

/* JADX INFO: renamed from: ee.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5067f {

    /* JADX INFO: renamed from: o */
    public static final Map f19883o = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f19884a;

    /* JADX INFO: renamed from: b */
    public final C5096t0 f19885b;

    /* JADX INFO: renamed from: c */
    public final String f19886c;

    /* JADX INFO: renamed from: g */
    public boolean f19890g;

    /* JADX INFO: renamed from: h */
    public final Intent f19891h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5058a1 f19892i;

    /* JADX INFO: renamed from: m */
    public ServiceConnection f19896m;

    /* JADX INFO: renamed from: n */
    public IInterface f19897n;

    /* JADX INFO: renamed from: d */
    public final List f19887d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Set f19888e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f19889f = new Object();

    /* JADX INFO: renamed from: k */
    public final IBinder.DeathRecipient f19894k = new IBinder.DeathRecipient() { // from class: ee.v0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C5067f.m23782k(this.f19918a);
        }
    };

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f19895l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    public final WeakReference f19893j = new WeakReference(null);

    public C5067f(Context context, C5096t0 c5096t0, String str, Intent intent, InterfaceC5058a1 interfaceC5058a1, InterfaceC5108z0 interfaceC5108z0) {
        this.f19884a = context;
        this.f19885b = c5096t0;
        this.f19886c = str;
        this.f19891h = intent;
        this.f19892i = interfaceC5058a1;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m23782k(C5067f c5067f) {
        c5067f.f19885b.m23841c("reportBinderDeath", new Object[0]);
        InterfaceC5108z0 interfaceC5108z0 = (InterfaceC5108z0) c5067f.f19893j.get();
        if (interfaceC5108z0 != null) {
            c5067f.f19885b.m23841c("calling onBinderDied", new Object[0]);
            interfaceC5108z0.m23846a();
        } else {
            c5067f.f19885b.m23841c("%s : Binder has died.", c5067f.f19886c);
            Iterator it = c5067f.f19887d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC5098u0) it.next()).mo23843a(c5067f.m23796w());
            }
            c5067f.f19887d.clear();
        }
        synchronized (c5067f.f19889f) {
            c5067f.m23797x();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m23786o(final C5067f c5067f, final C11264k c11264k) {
        c5067f.f19888e.add(c11264k);
        c11264k.m42326a().addOnCompleteListener(new OnCompleteListener() { // from class: ee.w0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f19919a.m23794u(c11264k, task);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m23788q(C5067f c5067f, AbstractRunnableC5098u0 abstractRunnableC5098u0) {
        if (c5067f.f19897n != null || c5067f.f19890g) {
            if (!c5067f.f19890g) {
                abstractRunnableC5098u0.run();
                return;
            } else {
                c5067f.f19885b.m23841c("Waiting to bind to the service.", new Object[0]);
                c5067f.f19887d.add(abstractRunnableC5098u0);
                return;
            }
        }
        c5067f.f19885b.m23841c("Initiate binding to the service.", new Object[0]);
        c5067f.f19887d.add(abstractRunnableC5098u0);
        ServiceConnectionC5065e serviceConnectionC5065e = new ServiceConnectionC5065e(c5067f, null);
        c5067f.f19896m = serviceConnectionC5065e;
        c5067f.f19890g = true;
        if (c5067f.f19884a.bindService(c5067f.f19891h, serviceConnectionC5065e, 1)) {
            return;
        }
        c5067f.f19885b.m23841c("Failed to bind to the service.", new Object[0]);
        c5067f.f19890g = false;
        Iterator it = c5067f.f19887d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC5098u0) it.next()).mo23843a(new C5069g());
        }
        c5067f.f19887d.clear();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m23789r(C5067f c5067f) {
        c5067f.f19885b.m23841c("linkToDeath", new Object[0]);
        try {
            c5067f.f19897n.asBinder().linkToDeath(c5067f.f19894k, 0);
        } catch (RemoteException e10) {
            c5067f.f19885b.m23840b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m23790s(C5067f c5067f) {
        c5067f.f19885b.m23841c("unlinkToDeath", new Object[0]);
        c5067f.f19897n.asBinder().unlinkToDeath(c5067f.f19894k, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Handler m23791c() {
        Handler handler;
        Map map = f19883o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f19886c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f19886c, 10);
                    handlerThread.start();
                    map.put(this.f19886c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f19886c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: e */
    public final IInterface m23792e() {
        return this.f19897n;
    }

    /* JADX INFO: renamed from: t */
    public final void m23793t(AbstractRunnableC5098u0 abstractRunnableC5098u0, C11264k c11264k) {
        m23791c().post(new C5104x0(this, abstractRunnableC5098u0.m23844c(), c11264k, abstractRunnableC5098u0));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m23794u(C11264k c11264k, Task task) {
        synchronized (this.f19889f) {
            this.f19888e.remove(c11264k);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m23795v(C11264k c11264k) {
        synchronized (this.f19889f) {
            this.f19888e.remove(c11264k);
        }
        m23791c().post(new C5106y0(this));
    }

    /* JADX INFO: renamed from: w */
    public final RemoteException m23796w() {
        return new RemoteException(String.valueOf(this.f19886c).concat(" : Binder has died."));
    }

    /* JADX INFO: renamed from: x */
    public final void m23797x() {
        Iterator it = this.f19888e.iterator();
        while (it.hasNext()) {
            ((C11264k) it.next()).m42329d(m23796w());
        }
        this.f19888e.clear();
    }
}
