package be;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: be.f */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC1320f implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1323g f5351a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [be.g.p(be.g, be.r1):void] */
    public /* synthetic */ ServiceConnectionC1320f(C1323g c1323g, C1317e c1317e) {
        this.f5351a = c1323g;
    }

    /* JADX DEBUG: Class process forced to load method for inline: be.g.f(be.g):be.q1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5351a.f5357b.m7210d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C1323g c1323g = this.f5351a;
        c1323g.m7150c().post(new C1311c(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f5351a.f5357b.m7210d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C1323g c1323g = this.f5351a;
        c1323g.m7150c().post(new C1314d(this));
    }
}
