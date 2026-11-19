package o9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q1 implements ServiceConnection, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f27018a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f27020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1 f27021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f27022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1 f27023g;

    public q1(s1 s1Var, p1 p1Var) {
        Objects.requireNonNull(s1Var);
        this.f27023g = s1Var;
        this.f27021e = p1Var;
        this.f27018a = new HashMap();
        this.b = 2;
    }

    public final void a(String str) {
        p1 p1Var = this.f27021e;
        s1 s1Var = this.f27023g;
        s1Var.h().removeMessages(1, p1Var);
        s1Var.i().c(s1Var.g(), this);
        this.f27019c = false;
        this.b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f27018a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f27018a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f27019c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f27018a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f27018a.isEmpty();
    }

    public final IBinder h() {
        return this.f27020d;
    }

    public final ComponentName i() {
        return this.f27022f;
    }

    public final /* synthetic */ k9.b j(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = d1.a(this.f27023g.g(), this.f27021e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicyA = v9.t.a();
            try {
                s1 s1Var = this.f27023g;
                u9.a aVarI = s1Var.i();
                Context contextG = s1Var.g();
                p1 p1Var = this.f27021e;
                try {
                    boolean zD = aVarI.d(contextG, str, intentA, this, 4225, executor);
                    this.f27019c = zD;
                    if (zD) {
                        s1Var.h().sendMessageDelayed(s1Var.h().obtainMessage(1, p1Var), s1Var.j());
                        k9.b bVar = k9.b.f21215k;
                        StrictMode.setVmPolicy(vmPolicyA);
                        return bVar;
                    }
                    this.b = 2;
                    try {
                        s1Var.i().c(s1Var.g(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    k9.b bVar2 = new k9.b(16);
                    StrictMode.setVmPolicy(vmPolicyA);
                    return bVar2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (b1 e10) {
            return e10.f26932a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s1 s1Var = this.f27023g;
        synchronized (s1Var.f()) {
            try {
                s1Var.h().removeMessages(1, this.f27021e);
                this.f27020d = iBinder;
                this.f27022f = componentName;
                Iterator it = this.f27018a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s1 s1Var = this.f27023g;
        synchronized (s1Var.f()) {
            try {
                s1Var.h().removeMessages(1, this.f27021e);
                this.f27020d = null;
                this.f27022f = componentName;
                Iterator it = this.f27018a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
