package n9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f26093g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f26094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Handler f26095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g1 f26096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t9.a f26097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f26098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f26099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Executor f26100n;

    public h1(Context context, Looper looper, Executor executor) {
        g1 g1Var = new g1(this, null);
        this.f26096j = g1Var;
        this.f26094h = context.getApplicationContext();
        this.f26095i = new db.p(looper, g1Var);
        this.f26097k = t9.a.b();
        this.f26098l = 5000L;
        this.f26099m = 300000L;
        this.f26100n = executor;
    }

    @Override // n9.f
    public final ConnectionResult c(e1 e1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultJ;
        m.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f26093g;
        synchronized (map) {
            try {
                f1 f1Var = (f1) map.get(e1Var);
                if (executor == null) {
                    executor = this.f26100n;
                }
                if (f1Var == null) {
                    f1Var = new f1(this, e1Var);
                    f1Var.b(serviceConnection, serviceConnection, str);
                    connectionResultJ = f1Var.j(str, executor);
                    map.put(e1Var, f1Var);
                } else {
                    this.f26095i.removeMessages(0, e1Var);
                    if (f1Var.f(serviceConnection)) {
                        String string = e1Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    f1Var.b(serviceConnection, serviceConnection, str);
                    int iE = f1Var.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(f1Var.i(), f1Var.h());
                    } else if (iE == 2) {
                        connectionResultJ = f1Var.j(str, executor);
                    }
                    connectionResultJ = null;
                }
                if (f1Var.d()) {
                    return ConnectionResult.f5761k;
                }
                if (connectionResultJ == null) {
                    connectionResultJ = new ConnectionResult(-1);
                }
                return connectionResultJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n9.f
    public final void e(e1 e1Var, ServiceConnection serviceConnection, String str) {
        m.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f26093g;
        synchronized (map) {
            try {
                f1 f1Var = (f1) map.get(e1Var);
                if (f1Var == null) {
                    String string = e1Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!f1Var.f(serviceConnection)) {
                    String string2 = e1Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                f1Var.c(serviceConnection, str);
                if (f1Var.g()) {
                    this.f26095i.sendMessageDelayed(this.f26095i.obtainMessage(0, e1Var), this.f26098l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ HashMap f() {
        return this.f26093g;
    }

    public final /* synthetic */ Context g() {
        return this.f26094h;
    }

    public final /* synthetic */ Handler h() {
        return this.f26095i;
    }

    public final /* synthetic */ t9.a i() {
        return this.f26097k;
    }

    public final /* synthetic */ long j() {
        return this.f26099m;
    }
}
