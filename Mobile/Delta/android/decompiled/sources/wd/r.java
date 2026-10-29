package wd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f34173a;

    public /* synthetic */ r(t tVar, s sVar) {
        this.f34173a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f34173a.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f34173a.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f34173a.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f34173a.c().post(new q(this));
    }
}
