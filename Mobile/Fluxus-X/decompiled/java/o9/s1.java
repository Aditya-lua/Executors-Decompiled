package o9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f27030g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f27031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Handler f27032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r1 f27033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u9.a f27034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f27035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f27036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Executor f27037n;

    public s1(Context context, Looper looper, Executor executor) {
        r1 r1Var = new r1(this, null);
        this.f27033j = r1Var;
        this.f27031h = context.getApplicationContext();
        this.f27032i = new eb.p(looper, r1Var);
        this.f27034k = u9.a.b();
        this.f27035l = 5000L;
        this.f27036m = 300000L;
        this.f27037n = executor;
    }

    @Override // o9.j
    public final k9.b c(p1 p1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        k9.b bVarJ;
        s.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f27030g;
        synchronized (map) {
            try {
                q1 q1Var = (q1) map.get(p1Var);
                if (executor == null) {
                    executor = this.f27037n;
                }
                if (q1Var == null) {
                    q1Var = new q1(this, p1Var);
                    q1Var.b(serviceConnection, serviceConnection, str);
                    bVarJ = q1Var.j(str, executor);
                    map.put(p1Var, q1Var);
                } else {
                    this.f27032i.removeMessages(0, p1Var);
                    if (q1Var.f(serviceConnection)) {
                        String string = p1Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    q1Var.b(serviceConnection, serviceConnection, str);
                    int iE = q1Var.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(q1Var.i(), q1Var.h());
                    } else if (iE == 2) {
                        bVarJ = q1Var.j(str, executor);
                    }
                    bVarJ = null;
                }
                if (q1Var.d()) {
                    return k9.b.f21215k;
                }
                if (bVarJ == null) {
                    bVarJ = new k9.b(-1);
                }
                return bVarJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o9.j
    public final void e(p1 p1Var, ServiceConnection serviceConnection, String str) {
        s.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f27030g;
        synchronized (map) {
            try {
                q1 q1Var = (q1) map.get(p1Var);
                if (q1Var == null) {
                    String string = p1Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!q1Var.f(serviceConnection)) {
                    String string2 = p1Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                q1Var.c(serviceConnection, str);
                if (q1Var.g()) {
                    this.f27032i.sendMessageDelayed(this.f27032i.obtainMessage(0, p1Var), this.f27035l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ HashMap f() {
        return this.f27030g;
    }

    public final /* synthetic */ Context g() {
        return this.f27031h;
    }

    public final /* synthetic */ Handler h() {
        return this.f27032i;
    }

    public final /* synthetic */ u9.a i() {
        return this.f27034k;
    }

    public final /* synthetic */ long j() {
        return this.f27036m;
    }
}
