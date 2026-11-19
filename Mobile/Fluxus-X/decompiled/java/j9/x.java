package j9;

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

/* JADX INFO: loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f20247c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f20250f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20246a = 0;
    public final Messenger b = new Messenger(new db.f(Looper.getMainLooper(), new Handler.Callback() { // from class: j9.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            x xVar = this.f20244a;
            synchronized (xVar) {
                try {
                    a0 a0Var = (a0) xVar.f20249e.get(i10);
                    if (a0Var == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    xVar.f20249e.remove(i10);
                    xVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        a0Var.c(new b0(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    a0Var.a(data);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue f20248d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f20249e = new SparseArray();

    public /* synthetic */ x(d0 d0Var, w wVar) {
        this.f20250f = d0Var;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f20246a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f20246a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f20246a = 4;
            u9.a.b().c(this.f20250f.f20218a, this);
            b0 b0Var = new b0(i10, str, th2);
            Iterator it = this.f20248d.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).c(b0Var);
            }
            this.f20248d.clear();
            for (int i12 = 0; i12 < this.f20249e.size(); i12++) {
                ((a0) this.f20249e.valueAt(i12)).c(b0Var);
            }
            this.f20249e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void c() {
        this.f20250f.b.execute(new Runnable() { // from class: j9.r
            @Override // java.lang.Runnable
            public final void run() {
                final a0 a0Var;
                while (true) {
                    final x xVar = this.f20241a;
                    synchronized (xVar) {
                        try {
                            if (xVar.f20246a != 2) {
                                return;
                            }
                            if (xVar.f20248d.isEmpty()) {
                                xVar.f();
                                return;
                            } else {
                                a0Var = (a0) xVar.f20248d.poll();
                                xVar.f20249e.put(a0Var.f20203a, a0Var);
                                xVar.f20250f.b.schedule(new Runnable() { // from class: j9.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        xVar.e(a0Var.f20203a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a0Var)));
                    }
                    d0 d0Var = xVar.f20250f;
                    Messenger messenger = xVar.b;
                    int i10 = a0Var.f20204c;
                    Context context = d0Var.f20218a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = a0Var.f20203a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", a0Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", a0Var.f20205d);
                    messageObtain.setData(bundle);
                    try {
                        xVar.f20247c.a(messageObtain);
                    } catch (RemoteException e10) {
                        xVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f20246a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i10) {
        a0 a0Var = (a0) this.f20249e.get(i10);
        if (a0Var != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f20249e.remove(i10);
            a0Var.c(new b0(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        try {
            if (this.f20246a == 2 && this.f20248d.isEmpty() && this.f20249e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f20246a = 3;
                u9.a.b().c(this.f20250f.f20218a, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean g(a0 a0Var) {
        int i10 = this.f20246a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f20248d.add(a0Var);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f20248d.add(a0Var);
            c();
            return true;
        }
        this.f20248d.add(a0Var);
        o9.s.p(this.f20246a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f20246a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (u9.a.b().a(this.f20250f.f20218a, intent, this, 1)) {
                this.f20250f.b.schedule(new Runnable() { // from class: j9.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20242a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f20250f.b.execute(new Runnable() { // from class: j9.q
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = this.f20240a;
                IBinder iBinder2 = iBinder;
                synchronized (xVar) {
                    if (iBinder2 == null) {
                        xVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        xVar.f20247c = new y(iBinder2);
                        xVar.f20246a = 2;
                        xVar.c();
                    } catch (RemoteException e10) {
                        xVar.a(0, e10.getMessage());
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
        this.f20250f.b.execute(new Runnable() { // from class: j9.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f20243a.a(2, "Service disconnected");
            }
        });
    }
}
