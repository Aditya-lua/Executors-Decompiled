package p305n9;

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
import p445t9.C11555a;
import p462u9.C11829t;

/* JADX INFO: renamed from: n9.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC8934f1 implements ServiceConnection, InterfaceC8943i1 {

    /* JADX INFO: renamed from: a */
    public final Map f32589a;

    /* JADX INFO: renamed from: b */
    public int f32590b;

    /* JADX INFO: renamed from: c */
    public boolean f32591c;

    /* JADX INFO: renamed from: d */
    public IBinder f32592d;

    /* JADX INFO: renamed from: e */
    public final C8931e1 f32593e;

    /* JADX INFO: renamed from: f */
    public ComponentName f32594f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C8940h1 f32595g;

    public ServiceConnectionC8934f1(C8940h1 c8940h1, C8931e1 c8931e1) {
        Objects.requireNonNull(c8940h1);
        this.f32595g = c8940h1;
        this.f32593e = c8931e1;
        this.f32589a = new HashMap();
        this.f32590b = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m35991a(String str) {
        C8931e1 c8931e1 = this.f32593e;
        C8940h1 c8940h1 = this.f32595g;
        c8940h1.m36016h().removeMessages(1, c8931e1);
        c8940h1.m36017i().m43206c(c8940h1.m36015g(), this);
        this.f32591c = false;
        this.f32590b = 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m35992b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f32589a.put(serviceConnection, serviceConnection2);
    }

    /* JADX INFO: renamed from: c */
    public final void m35993c(ServiceConnection serviceConnection, String str) {
        this.f32589a.remove(serviceConnection);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m35994d() {
        return this.f32591c;
    }

    /* JADX INFO: renamed from: e */
    public final int m35995e() {
        return this.f32590b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m35996f(ServiceConnection serviceConnection) {
        return this.f32589a.containsKey(serviceConnection);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m35997g() {
        return this.f32589a.isEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final IBinder m35998h() {
        return this.f32592d;
    }

    /* JADX INFO: renamed from: i */
    public final ComponentName m35999i() {
        return this.f32594f;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ConnectionResult m36000j(String str, Executor executor) throws Throwable {
        try {
            Intent intentM36072a = C8970t0.m36072a(this.f32595g.m36015g(), this.f32593e);
            this.f32590b = 3;
            StrictMode.VmPolicy vmPolicyM44215a = C11829t.m44215a();
            try {
                C8940h1 c8940h1 = this.f32595g;
                C11555a c11555aM36017i = c8940h1.m36017i();
                Context contextM36015g = c8940h1.m36015g();
                C8931e1 c8931e1 = this.f32593e;
                try {
                    boolean zM43207d = c11555aM36017i.m43207d(contextM36015g, str, intentM36072a, this, 4225, executor);
                    this.f32591c = zM43207d;
                    if (zM43207d) {
                        c8940h1.m36016h().sendMessageDelayed(c8940h1.m36016h().obtainMessage(1, c8931e1), c8940h1.m36018j());
                        ConnectionResult connectionResult = ConnectionResult.f7373k;
                        StrictMode.setVmPolicy(vmPolicyM44215a);
                        return connectionResult;
                    }
                    this.f32590b = 2;
                    try {
                        c8940h1.m36017i().m43206c(c8940h1.m36015g(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16);
                    StrictMode.setVmPolicy(vmPolicyM44215a);
                    return connectionResult2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicyM44215a);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (C8966r0 e10) {
            return e10.f32636a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C8940h1 c8940h1 = this.f32595g;
        synchronized (c8940h1.m36014f()) {
            try {
                c8940h1.m36016h().removeMessages(1, this.f32593e);
                this.f32592d = iBinder;
                this.f32594f = componentName;
                Iterator it = this.f32589a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f32590b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C8940h1 c8940h1 = this.f32595g;
        synchronized (c8940h1.m36014f()) {
            try {
                c8940h1.m36016h().removeMessages(1, this.f32593e);
                this.f32592d = null;
                this.f32594f = componentName;
                Iterator it = this.f32589a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f32590b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
