package p193ib;

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
import p358pd.C10204i;
import sb.C11264k;

/* JADX INFO: renamed from: ib.o */
/* JADX INFO: loaded from: classes.dex */
public final class C6733o {

    /* JADX INFO: renamed from: n */
    public static final Map f25840n = new HashMap();

    /* JADX INFO: renamed from: a */
    public final Context f25841a;

    /* JADX INFO: renamed from: b */
    public final C6722d f25842b;

    /* JADX INFO: renamed from: g */
    public boolean f25847g;

    /* JADX INFO: renamed from: h */
    public final Intent f25848h;

    /* JADX INFO: renamed from: l */
    public ServiceConnection f25852l;

    /* JADX INFO: renamed from: m */
    public IInterface f25853m;

    /* JADX INFO: renamed from: d */
    public final List f25844d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Set f25845e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final Object f25846f = new Object();

    /* JADX INFO: renamed from: j */
    public final IBinder.DeathRecipient f25850j = new IBinder.DeathRecipient() { // from class: ib.f
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C6733o.m28833j(this.f25829a);
        }
    };

    /* JADX INFO: renamed from: k */
    public final AtomicInteger f25851k = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public final String f25843c = "AgeSignalsService";

    /* JADX INFO: renamed from: i */
    public final WeakReference f25849i = new WeakReference(null);

    public C6733o(Context context, C6722d c6722d, String str, Intent intent, C10204i c10204i, InterfaceC6728j interfaceC6728j) {
        this.f25841a = context;
        this.f25842b = c6722d;
        this.f25848h = intent;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m28833j(C6733o c6733o) {
        C6722d c6722d = c6733o.f25842b;
        c6722d.m28821c("reportBinderDeath", new Object[0]);
        InterfaceC6728j interfaceC6728j = (InterfaceC6728j) c6733o.f25849i.get();
        if (interfaceC6728j != null) {
            c6722d.m28821c("calling onBinderDied", new Object[0]);
            interfaceC6728j.zza();
        } else {
            c6722d.m28821c("%s : Binder has died.", c6733o.f25843c);
            List list = c6733o.f25844d;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC6723e) it.next()).mo28823a(c6733o.m28847v());
            }
            list.clear();
        }
        synchronized (c6733o.f25846f) {
            c6733o.m28848w();
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m28834k(C6733o c6733o, C11264k c11264k, Task task) {
        synchronized (c6733o.f25846f) {
            c6733o.f25845e.remove(c11264k);
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m28838o(final C6733o c6733o, final C11264k c11264k) {
        c6733o.f25845e.add(c11264k);
        c11264k.m42326a().addOnCompleteListener(new OnCompleteListener() { // from class: ib.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C6733o.m28834k(this.f25830a, c11264k, task);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m28840q(C6733o c6733o, AbstractRunnableC6723e abstractRunnableC6723e) {
        if (c6733o.f25853m != null || c6733o.f25847g) {
            if (!c6733o.f25847g) {
                abstractRunnableC6723e.run();
                return;
            } else {
                c6733o.f25842b.m28821c("Waiting to bind to the service.", new Object[0]);
                c6733o.f25844d.add(abstractRunnableC6723e);
                return;
            }
        }
        C6722d c6722d = c6733o.f25842b;
        c6722d.m28821c("Initiate binding to the service.", new Object[0]);
        List list = c6733o.f25844d;
        list.add(abstractRunnableC6723e);
        ServiceConnectionC6731m serviceConnectionC6731m = new ServiceConnectionC6731m(c6733o, null);
        c6733o.f25852l = serviceConnectionC6731m;
        c6733o.f25847g = true;
        if (c6733o.f25841a.bindService(c6733o.f25848h, serviceConnectionC6731m, 1)) {
            return;
        }
        c6722d.m28821c("Failed to bind to the service.", new Object[0]);
        c6733o.f25847g = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC6723e) it.next()).mo28823a(new C6734p());
        }
        list.clear();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m28841r(C6733o c6733o) {
        c6733o.f25842b.m28821c("linkToDeath", new Object[0]);
        try {
            c6733o.f25853m.asBinder().linkToDeath(c6733o.f25850j, 0);
        } catch (RemoteException e10) {
            c6733o.f25842b.m28820b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m28842s(C6733o c6733o) {
        c6733o.f25842b.m28821c("unlinkToDeath", new Object[0]);
        c6733o.f25853m.asBinder().unlinkToDeath(c6733o.f25850j, 0);
    }

    /* JADX INFO: renamed from: c */
    public final Handler m28843c() {
        Handler handler;
        Map map = f25840n;
        synchronized (map) {
            try {
                String str = this.f25843c;
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

    /* JADX INFO: renamed from: e */
    public final IInterface m28844e() {
        return this.f25853m;
    }

    /* JADX INFO: renamed from: t */
    public final void m28845t(AbstractRunnableC6723e abstractRunnableC6723e, C11264k c11264k) {
        m28843c().post(new C6726h(this, abstractRunnableC6723e.m28825c(), c11264k, abstractRunnableC6723e));
    }

    /* JADX INFO: renamed from: u */
    public final void m28846u(C11264k c11264k) {
        synchronized (this.f25846f) {
            this.f25845e.remove(c11264k);
        }
        m28843c().post(new C6727i(this));
    }

    /* JADX INFO: renamed from: v */
    public final RemoteException m28847v() {
        return new RemoteException(String.valueOf(this.f25843c).concat(" : Binder has died."));
    }

    /* JADX INFO: renamed from: w */
    public final void m28848w() {
        Set set = this.f25845e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C11264k) it.next()).m42329d(m28847v());
        }
        set.clear();
    }
}
