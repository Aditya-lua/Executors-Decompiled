package p191i9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p046cb.HandlerC1619f;
import p305n9.C8953m;
import p445t9.C11555a;

/* JADX INFO: renamed from: i9.v */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC6711v implements ServiceConnection {

    /* JADX INFO: renamed from: c */
    public C6712w f25815c;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C6687b0 f25818f;

    /* JADX INFO: renamed from: a */
    public int f25813a = 0;

    /* JADX INFO: renamed from: b */
    public final Messenger f25814b = new Messenger(new HandlerC1619f(Looper.getMainLooper(), new Handler.Callback() { // from class: i9.s
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            ServiceConnectionC6711v serviceConnectionC6711v = this.f25810a;
            synchronized (serviceConnectionC6711v) {
                try {
                    AbstractC6714y abstractC6714y = (AbstractC6714y) serviceConnectionC6711v.f25817e.get(i10);
                    if (abstractC6714y == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    serviceConnectionC6711v.f25817e.remove(i10);
                    serviceConnectionC6711v.m28806f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC6714y.m28809c(new C6715z(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC6714y.mo28777a(data);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d */
    public final Queue f25816d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final SparseArray f25817e = new SparseArray();

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [i9.b0.<init>(android.content.Context, java.util.concurrent.ScheduledExecutorService):void, i9.b0.g(i9.y):com.google.android.gms.tasks.Task] */
    public /* synthetic */ ServiceConnectionC6711v(C6687b0 c6687b0, C6710u c6710u) {
        this.f25818f = c6687b0;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m28801a(int i10, String str) {
        m28802b(i10, str, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: i9.b0.a(i9.b0):android.content.Context */
    /* JADX INFO: renamed from: b */
    public final synchronized void m28802b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f25813a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f25813a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f25813a = 4;
            C11555a.m43201b().m43206c(this.f25818f.f25777a, this);
            C6715z c6715z = new C6715z(i10, str, th2);
            Iterator it = this.f25816d.iterator();
            while (it.hasNext()) {
                ((AbstractC6714y) it.next()).m28809c(c6715z);
            }
            this.f25816d.clear();
            for (int i12 = 0; i12 < this.f25817e.size(); i12++) {
                ((AbstractC6714y) this.f25817e.valueAt(i12)).m28809c(c6715z);
            }
            this.f25817e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m28803c() {
        this.f25818f.f25778b.execute(new Runnable() { // from class: i9.p
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC6714y abstractC6714y;
                while (true) {
                    final ServiceConnectionC6711v serviceConnectionC6711v = this.f25807a;
                    synchronized (serviceConnectionC6711v) {
                        try {
                            if (serviceConnectionC6711v.f25813a != 2) {
                                return;
                            }
                            if (serviceConnectionC6711v.f25816d.isEmpty()) {
                                serviceConnectionC6711v.m28806f();
                                return;
                            } else {
                                abstractC6714y = (AbstractC6714y) serviceConnectionC6711v.f25816d.poll();
                                serviceConnectionC6711v.f25817e.put(abstractC6714y.f25821a, abstractC6714y);
                                serviceConnectionC6711v.f25818f.f25778b.schedule(new Runnable() { // from class: i9.t
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        serviceConnectionC6711v.m28805e(abstractC6714y.f25821a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(abstractC6714y)));
                    }
                    C6687b0 c6687b0 = serviceConnectionC6711v.f25818f;
                    Messenger messenger = serviceConnectionC6711v.f25814b;
                    int i10 = abstractC6714y.f25823c;
                    Context context = c6687b0.f25777a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = abstractC6714y.f25821a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC6714y.mo28778b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC6714y.f25824d);
                    messageObtain.setData(bundle);
                    try {
                        serviceConnectionC6711v.f25815c.m28808a(messageObtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC6711v.m28801a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m28804d() {
        if (this.f25813a == 1) {
            m28801a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m28805e(int i10) {
        AbstractC6714y abstractC6714y = (AbstractC6714y) this.f25817e.get(i10);
        if (abstractC6714y != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f25817e.remove(i10);
            abstractC6714y.m28809c(new C6715z(3, "Timed out waiting for response", null));
            m28806f();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m28806f() {
        try {
            if (this.f25813a == 2 && this.f25816d.isEmpty() && this.f25817e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f25813a = 3;
                C11555a.m43201b().m43206c(this.f25818f.f25777a, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m28807g(AbstractC6714y abstractC6714y) {
        try {
            int i10 = this.f25813a;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f25816d.add(abstractC6714y);
                    return true;
                }
                if (i10 != 2) {
                    return false;
                }
                this.f25816d.add(abstractC6714y);
                m28803c();
                return true;
            }
            this.f25816d.add(abstractC6714y);
            C8953m.m36051p(this.f25813a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f25813a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (C11555a.m43201b().m43205a(this.f25818f.f25777a, intent, this, 1)) {
                    this.f25818f.f25778b.schedule(new Runnable() { // from class: i9.q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f25808a.m28804d();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    m28801a(0, "Unable to bind to service");
                }
            } catch (SecurityException e10) {
                m28802b(0, "Unable to bind to service", e10);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f25818f.f25778b.execute(new Runnable() { // from class: i9.o
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC6711v serviceConnectionC6711v = this.f25805a;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC6711v) {
                    if (iBinder2 == null) {
                        serviceConnectionC6711v.m28801a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC6711v.f25815c = new C6712w(iBinder2);
                        serviceConnectionC6711v.f25813a = 2;
                        serviceConnectionC6711v.m28803c();
                    } catch (RemoteException e10) {
                        serviceConnectionC6711v.m28801a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f25818f.f25778b.execute(new Runnable() { // from class: i9.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f25809a.m28801a(2, "Service disconnected");
            }
        });
    }
}
