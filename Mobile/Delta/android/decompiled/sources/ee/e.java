package ee;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f16072a;

    public /* synthetic */ e(f fVar, d dVar) {
        this.f16072a = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16072a.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f16072a.c().post(new b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16072a.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f16072a.c().post(new c(this));
    }
}
