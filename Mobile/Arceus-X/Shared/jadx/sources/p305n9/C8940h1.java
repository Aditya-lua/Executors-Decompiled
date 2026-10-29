package p305n9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p074db.HandlerC4534p;
import p445t9.C11555a;

/* JADX INFO: renamed from: n9.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8940h1 extends AbstractC8932f {

    /* JADX INFO: renamed from: g */
    public final HashMap f32603g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final Context f32604h;

    /* JADX INFO: renamed from: i */
    public volatile Handler f32605i;

    /* JADX INFO: renamed from: j */
    public final C8937g1 f32606j;

    /* JADX INFO: renamed from: k */
    public final C11555a f32607k;

    /* JADX INFO: renamed from: l */
    public final long f32608l;

    /* JADX INFO: renamed from: m */
    public final long f32609m;

    /* JADX INFO: renamed from: n */
    public volatile Executor f32610n;

    public C8940h1(Context context, Looper looper, Executor executor) {
        C8937g1 c8937g1 = new C8937g1(this, null);
        this.f32606j = c8937g1;
        this.f32604h = context.getApplicationContext();
        this.f32605i = new HandlerC4534p(looper, c8937g1);
        this.f32607k = C11555a.m43201b();
        this.f32608l = 5000L;
        this.f32609m = 300000L;
        this.f32610n = executor;
    }

    @Override // p305n9.AbstractC8932f
    /* JADX INFO: renamed from: c */
    public final ConnectionResult mo35988c(C8931e1 c8931e1, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultM36000j;
        C8953m.m36048m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f32603g;
        synchronized (map) {
            try {
                ServiceConnectionC8934f1 serviceConnectionC8934f1 = (ServiceConnectionC8934f1) map.get(c8931e1);
                if (executor == null) {
                    executor = this.f32610n;
                }
                if (serviceConnectionC8934f1 == null) {
                    serviceConnectionC8934f1 = new ServiceConnectionC8934f1(this, c8931e1);
                    serviceConnectionC8934f1.m35992b(serviceConnection, serviceConnection, str);
                    connectionResultM36000j = serviceConnectionC8934f1.m36000j(str, executor);
                    map.put(c8931e1, serviceConnectionC8934f1);
                } else {
                    this.f32605i.removeMessages(0, c8931e1);
                    if (serviceConnectionC8934f1.m35996f(serviceConnection)) {
                        String string = c8931e1.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    serviceConnectionC8934f1.m35992b(serviceConnection, serviceConnection, str);
                    int iM35995e = serviceConnectionC8934f1.m35995e();
                    if (iM35995e == 1) {
                        serviceConnection.onServiceConnected(serviceConnectionC8934f1.m35999i(), serviceConnectionC8934f1.m35998h());
                    } else if (iM35995e == 2) {
                        connectionResultM36000j = serviceConnectionC8934f1.m36000j(str, executor);
                    }
                    connectionResultM36000j = null;
                }
                if (serviceConnectionC8934f1.m35994d()) {
                    return ConnectionResult.f7373k;
                }
                if (connectionResultM36000j == null) {
                    connectionResultM36000j = new ConnectionResult(-1);
                }
                return connectionResultM36000j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p305n9.AbstractC8932f
    /* JADX INFO: renamed from: e */
    public final void mo35990e(C8931e1 c8931e1, ServiceConnection serviceConnection, String str) {
        C8953m.m36048m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f32603g;
        synchronized (map) {
            try {
                ServiceConnectionC8934f1 serviceConnectionC8934f1 = (ServiceConnectionC8934f1) map.get(c8931e1);
                if (serviceConnectionC8934f1 == null) {
                    String string = c8931e1.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!serviceConnectionC8934f1.m35996f(serviceConnection)) {
                    String string2 = c8931e1.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                serviceConnectionC8934f1.m35993c(serviceConnection, str);
                if (serviceConnectionC8934f1.m35997g()) {
                    this.f32605i.sendMessageDelayed(this.f32605i.obtainMessage(0, c8931e1), this.f32608l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HashMap m36014f() {
        return this.f32603g;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context m36015g() {
        return this.f32604h;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Handler m36016h() {
        return this.f32605i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C11555a m36017i() {
        return this.f32607k;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long m36018j() {
        return this.f32609m;
    }
}
