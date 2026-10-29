package n9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f1 implements ServiceConnection, i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25261a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f25263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f25264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f25265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h1 f25266g;

    public f1(h1 h1Var, e1 e1Var) {
        Objects.requireNonNull(h1Var);
        this.f25266g = h1Var;
        this.f25264e = e1Var;
        this.f25261a = new HashMap();
        this.b = 2;
    }

    public final void a(String str) {
        e1 e1Var = this.f25264e;
        h1 h1Var = this.f25266g;
        h1Var.h().removeMessages(1, e1Var);
        h1Var.i().c(h1Var.g(), this);
        this.f25262c = false;
        this.b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f25261a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f25261a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f25262c;
    }

    public final int e() {
        return this.b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f25261a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f25261a.isEmpty();
    }

    public final IBinder h() {
        return this.f25263d;
    }

    public final ComponentName i() {
        return this.f25265f;
    }

    public final /* synthetic */ ConnectionResult j(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = t0.a(this.f25266g.g(), this.f25264e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicyA = u9.t.a();
            try {
                h1 h1Var = this.f25266g;
                t9.a aVarI = h1Var.i();
                Context contextG = h1Var.g();
                e1 e1Var = this.f25264e;
                try {
                    boolean zD = aVarI.d(contextG, str, intentA, this, 4225, executor);
                    this.f25262c = zD;
                    if (zD) {
                        h1Var.h().sendMessageDelayed(h1Var.h().obtainMessage(1, e1Var), h1Var.j());
                        ConnectionResult connectionResult = ConnectionResult.f5688k;
                        StrictMode.setVmPolicy(vmPolicyA);
                        return connectionResult;
                    }
                    this.b = 2;
                    try {
                        h1Var.i().c(h1Var.g(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16);
                    StrictMode.setVmPolicy(vmPolicyA);
                    return connectionResult2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (r0 e10) {
            return e10.f25298a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h1 h1Var = this.f25266g;
        synchronized (h1Var.f()) {
            try {
                h1Var.h().removeMessages(1, this.f25264e);
                this.f25263d = iBinder;
                this.f25265f = componentName;
                Iterator it = this.f25261a.values().iterator();
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
        h1 h1Var = this.f25266g;
        synchronized (h1Var.f()) {
            try {
                h1Var.h().removeMessages(1, this.f25264e);
                this.f25263d = null;
                this.f25265f = componentName;
                Iterator it = this.f25261a.values().iterator();
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
