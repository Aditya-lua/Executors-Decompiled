package p543xd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: xd.r */
/* JADX INFO: loaded from: classes2.dex */
public final class ServiceConnectionC12797r implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12799t f45531a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [xd.t.p(xd.t, xd.j):void] */
    public /* synthetic */ ServiceConnectionC12797r(C12799t c12799t, C12798s c12798s) {
        this.f45531a = c12799t;
    }

    /* JADX DEBUG: Class process forced to load method for inline: xd.t.f(xd.t):xd.i */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f45531a.f45534b.m47652c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f45531a.m47672c().post(new C12795p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f45531a.f45534b.m47652c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f45531a.m47672c().post(new C12796q(this));
    }
}
