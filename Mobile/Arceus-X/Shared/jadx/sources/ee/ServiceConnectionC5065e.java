package ee;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: ee.e */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC5065e implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5067f f19882a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ee.f.q(ee.f, ee.u0):void] */
    public /* synthetic */ ServiceConnectionC5065e(C5067f c5067f, C5063d c5063d) {
        this.f19882a = c5067f;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ee.f.f(ee.f):ee.t0 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f19882a.f19885b.m23841c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f19882a.m23791c().post(new C5059b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f19882a.f19885b.m23841c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f19882a.m23791c().post(new C5061c(this));
    }
}
